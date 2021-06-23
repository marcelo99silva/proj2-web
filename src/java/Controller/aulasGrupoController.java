/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.Aula;
import DAL.Cliente;
import DAL.ClienteAula;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Pedro Ferreira
 */
public class aulasGrupoController extends AbstractController {
    
    private static final String PERSISTENCE_UNIT_NAME = "Projeto2Web_FinalPU";
    private static EntityManagerFactory factory;
    
    
    public aulasGrupoController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
            
                   HttpSession httpSession = request.getSession();       
        if (httpSession.getAttribute("loggedUser") == null) {
            // Not logged in, redirect to login page.
            return new ModelAndView("redirect:index.htm");
        }
        
        factory=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em=factory.createEntityManager();
                  
        Cliente cliente = (Cliente)httpSession.getAttribute("loggedUser");
        
        ClienteAula cliAula = new ClienteAula();
        if(request.getQueryString()!=null&&request.getQueryString().toLowerCase().contains("save")){
            
            BigDecimal idaula = new BigDecimal(request.getParameter("id"));
            
            Query q2 = em.createNamedQuery("Aula.findByIdaula");  
            q2.setParameter("idaula", idaula );


           Aula aula = new Aula();
            aula = (Aula) q2.getSingleResult();

            System.out.println(aula);  
            
            cliAula.setIdaula(aula);
            cliAula.setIdcliente(cliente);

        try {
            em.getTransaction().begin();
            em.persist(cliAula);
            em.getTransaction().commit();
        } catch(Exception ex){
            em.getTransaction().rollback();
            System.out.println(ex);
        }
            
        }
        

        
        Query q = em.createNamedQuery("Aula.findAll");
        List<Aula> aulas = new ArrayList<Aula>();
        aulas = q.getResultList();
        
        Query q2 = em.createNamedQuery("ClienteAula.findByIdCliente");  
        q2.setParameter("idcliente", cliente);
        List<ClienteAula> aulasCliente = new ArrayList<>();
        aulasCliente = q2.getResultList();
        
        List<Aula> aulasInscrito = new ArrayList<>();
        for(Aula a: aulas){
            boolean ins = false;
            for(ClienteAula ca: aulasCliente){
                if( a.getIdaula() == ca.getIdaula().getIdaula() ) {
                    ins = true;
                    break;
                }
            }
            if(!ins){
                aulasInscrito.add(a);
            }
        }
        
        System.out.println(aulasInscrito);
        
        ModelAndView modelAndView = new ModelAndView("aulasGrupo");
        modelAndView.addObject("aulas", aulasInscrito);
        return modelAndView;
        
        //return new ModelAndView("aulasGrupo", "aulas", aulas);
    }
    
}
