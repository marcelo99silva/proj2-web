/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Pedro Ferreira
 */
public class indexController extends AbstractController {
    
    public indexController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
    //    System.out.println("dedeededed");
    
            HttpSession httpSession = request.getSession();
         /*   if (httpSession.getAttribute("loggedUser") != null) {
                 System.out.println("entrou ddeed");
                return new ModelAndView("redirect:menuCliente.htm");
               
            }*/
            
            System.out.println("nao entrou");
            
    
    
        
            String modelInstance = "Olá Mundo!!!";
            return new ModelAndView("index", "index", modelInstance);
            

    }
    
}
