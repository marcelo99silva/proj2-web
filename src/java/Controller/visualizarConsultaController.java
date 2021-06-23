/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.Avaliacao;
import DAL.Cliente;
import DAL.ClienteAula;
import DAL.Marcacao;
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
public class visualizarConsultaController extends AbstractController {
    
    private static final String PERSISTENCE_UNIT_NAME = "Projeto2Web_FinalPU";
    private static EntityManagerFactory factory;
    
    public visualizarConsultaController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
       
        
                                    
        HttpSession httpSession = request.getSession();       
        if (httpSession.getAttribute("loggedUser") == null) {
            // Not logged in, redirect to login page.
            return new ModelAndView("redirect:index.htm");
        }
                  
        Cliente cliente = (Cliente)httpSession.getAttribute("loggedUser");
        BigDecimal idDecimal = new BigDecimal(request.getParameter("id"));
        
        factory=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em=factory.createEntityManager();
        

        
        Query q = em.createNamedQuery("Marcacao.findByIdmarcacao");  
        q.setParameter("idmarcacao", idDecimal);
        
        
        Marcacao marca = (Marcacao) q.getSingleResult();
        
        
        
        

        
        Query q2 = em.createNamedQuery("Avaliacao.findByIdmarcacao");  
        q2.setParameter("idmarcacao", marca);
        
        
        Avaliacao avalia = (Avaliacao) q2.getSingleResult();
        
        System.out.println(avalia);
        
      
        
        return new ModelAndView("visualizarConsulta", "avalia", avalia);
            
    //        String modelInstance = "Olá Mundo!!!";
     //       return new ModelAndView("visualizarConsulta", "index", modelInstance);
        
    }
    
}
