/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.Aula;
import DAL.Cliente;
import DAL.ClienteAula;
import DAL.Pagamento;
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
public class minhasAulasController extends AbstractController {
    
    private static final String PERSISTENCE_UNIT_NAME = "Projeto2Web_FinalPU";
    private static EntityManagerFactory factory;
    
    public minhasAulasController() {
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
        
        
        
        if(request.getQueryString()!=null&&request.getQueryString().toLowerCase().contains("remove")){
            
            System.out.println("entrou xd");
            
            BigDecimal idaula = new BigDecimal(request.getParameter("id"));
            ClienteAula cliaula = new ClienteAula();
            
              System.out.println("id:" +request.getParameter("id"));
              System.out.println("id decimal:" +idaula);
            
        Query q2 = em.createNamedQuery("ClienteAula.findAll");
        for (Object d2 : q2.getResultList()) {
              System.out.println("id aula:" +((ClienteAula) d2).getIdClienteaula());
            if (idaula.equals(((ClienteAula) d2).getIdClienteaula())) {
                cliaula = (ClienteAula) d2;
                
          //      System.out.println("dede");
                
        try {
            // System.out.println("deu xd");
            em.getTransaction().begin();
            em.remove(cliaula);
            em.flush();
            em.getTransaction().commit();
            
           
        } catch(Exception ex){
            em.getTransaction().rollback();
            System.out.println(ex);
        }
            }
        }

        
 
        }
        
  
        
        Query q = em.createNamedQuery("ClienteAula.findByIdCliente");  
        q.setParameter("idcliente", cliente);
        
        List<ClienteAula> aulas = new ArrayList<ClienteAula>();
        aulas = q.getResultList();
        
        System.out.println(aulas);
        
      
        
        return new ModelAndView("minhasAulas", "aulas", aulas);
    }
    
}
