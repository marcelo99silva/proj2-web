/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BCrypt.BCrypt;
import DAL.Cliente;
import DAL.Plano;
import java.math.BigDecimal;
import java.math.BigInteger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Pedro Ferreira
 */
public class menuClienteController extends AbstractController {
    
    private static final String PERSISTENCE_UNIT_NAME = "Projeto2Web_FinalPU";
    private static EntityManagerFactory factory;
    
    
    public menuClienteController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
 
   
        
        factory=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em=factory.createEntityManager();

      
        Query q=em.createNamedQuery("Cliente.findAll");
        
        Cliente c = new Cliente();
        
        for (Object d : q.getResultList()) {
            
            String email = ((Cliente) d).getEmail();     
            String pass = ((Cliente) d).getPassword();
            
            System.out.println(((Cliente) d).getEmail());
            System.out.println(((Cliente) d).getPassword());
           // BCrypt.checkpw(request.getParameter("txPwd"), pass);
            if (email.equals(request.getParameter("txEmail")) && BCrypt.checkpw(request.getParameter("txPwd"), pass) ) {
                   System.out.println(" \n - " + ((Cliente) d).getNome() );
                   
                   
                   c =  (Cliente) d;


                
                HttpSession httpSession = request.getSession();
                httpSession.setAttribute("loggedUser", c);
                
                ModelAndView modelAndView = new ModelAndView("menuCliente");
                modelAndView.addObject("cliente", c);
                
                return modelAndView;

  

                }

                }
        

                String modelInstance = "Login errado";

        
        
        
        ModelAndView modelAndView =  new ModelAndView("index", "modelName", modelInstance);
       // modelAndView.addObject("modelAttribute" , "frr");
        return modelAndView;
    }
    

}
