/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.Cliente;
import DAL.Pagamento;
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
public class pagamentosController extends AbstractController {
    
    private static final String PERSISTENCE_UNIT_NAME = "Projeto2Web_FinalPU";
    private static EntityManagerFactory factory;
    
    public pagamentosController() {
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
        
        factory=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em=factory.createEntityManager();
        
        Query q = em.createNamedQuery("Pagamento.findByCliente");  
        q.setParameter("idcliente", cliente);
        
        List<Pagamento> pagamentos = new ArrayList<Pagamento>();
        pagamentos = q.getResultList();
        
        System.out.println(pagamentos);
        
      
        
        return new ModelAndView("pagamentos", "pagamentos", pagamentos);
    }
    
}
