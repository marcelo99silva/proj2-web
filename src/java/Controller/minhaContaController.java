/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BCrypt.BCrypt;
import DAL.Cliente;
import java.math.BigInteger;
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
public class minhaContaController extends AbstractController {
    
        private static final String PERSISTENCE_UNIT_NAME = "Projeto2Web_FinalPU";
    private static EntityManagerFactory factory;
    
    
    public minhaContaController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
            HttpSession httpSession = request.getSession();
            if (httpSession.getAttribute("loggedUser") == null) {
                return new ModelAndView("redirect:index.htm");
            }
            
           Cliente cliente = (Cliente)httpSession.getAttribute("loggedUser");
           
           
           
            if(request.getQueryString()!=null&&request.getQueryString().toLowerCase().contains("update")){
                
                
                if(request.getParameter("password").isEmpty()){
                
                cliente.setIdcliente(cliente.getIdcliente());
                cliente.setNome(request.getParameter("nome"));
                cliente.setUsername(request.getParameter("username"));
                cliente.setRua(request.getParameter("morada"));
                cliente.setEmail(request.getParameter("email"));
                cliente.setTelemovel(new BigInteger(request.getParameter("contacto")) );
                cliente.setNcc(new BigInteger(request.getParameter("ncc")) );
                cliente.setSexo(request.getParameter("sexo"));         
                cliente.setDataNascimento(request.getParameter("data"));

                
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
                EntityManager em = factory.createEntityManager();

                em.getTransaction().begin();

                try {
                    em.merge(cliente);
                    em.flush();
                    em.getTransaction().commit();
                } catch(Exception ex){
                    em.getTransaction().rollback();
                    System.out.println(ex);
                }
               
                
                
                
                httpSession.setAttribute("loggedUser", cliente);
                
                }else{
                    
                String password = BCrypt.hashpw(request.getParameter("password"), BCrypt.gensalt());
                System.out.println("vaziooooo");
                    
                cliente.setIdcliente(cliente.getIdcliente());
                cliente.setNome(request.getParameter("nome"));
                cliente.setUsername(request.getParameter("username"));
                cliente.setRua(request.getParameter("morada"));
                cliente.setEmail(request.getParameter("email"));
                cliente.setTelemovel(new BigInteger(request.getParameter("contacto")) );
                cliente.setNcc(new BigInteger(request.getParameter("ncc")) );
                cliente.setSexo(request.getParameter("sexo"));
                cliente.setPassword(password);                
                cliente.setDataNascimento(request.getParameter("data"));
                
         
                
                factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
                EntityManager em = factory.createEntityManager();

                em.getTransaction().begin();

                try {
                    em.merge(cliente);
                    em.flush();
                    em.getTransaction().commit();
                } catch(Exception ex){
                    em.getTransaction().rollback();
                    System.out.println(ex);
                }
               
                
                
                
                httpSession.setAttribute("loggedUser", cliente);
                    
                    
                }
                
            }
           

            
            System.out.println("id:" +cliente.getIdcliente());

            return new ModelAndView("minhaConta", "minhaconta", cliente);
    }
    
}
