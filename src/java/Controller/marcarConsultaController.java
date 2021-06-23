/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.Aula;
import DAL.ClienteAula;
import DAL.Funcionario;
import DAL.Marcacao;
import DAL.Tipofuncionario;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Pedro Ferreira
 */
public class marcarConsultaController extends AbstractController {
    
    private static final String PERSISTENCE_UNIT_NAME = "Projeto2Web_FinalPU";
    private static EntityManagerFactory factory;
    
   // private Funcionario ff;
    
     List<Funcionario> func = new ArrayList<Funcionario>();
    
    public marcarConsultaController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        
        Tipofuncionario tpFunc = new Tipofuncionario();
        tpFunc.setIdTipofuncionario(new BigDecimal(2));
        
        factory=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em=factory.createEntityManager();
        Query q = em.createNamedQuery("Funcionario.findByTipo");
        q.setParameter("tipofuncionario", tpFunc);
        
       
        for (Object d : q.getResultList()) {
                 
            func = q.getResultList();
         
        }
        
        
        
        
        
        
        if(request.getQueryString()!=null&&request.getQueryString().toLowerCase().contains("insert")){
            
           // BigDecimal idaula = new BigDecimal(request.getParameter("id"));
            
            Query q1 = em.createNamedQuery("Funcionario.findAll");
            
                    System.out.println("valor" +request.getParameter("valor1"));
           
            for (Object d : q.getResultList()) {
                
            if(request.getParameter("valor1").equals( ((Funcionario) d).getNome() )){
                
                String nome = ((Funcionario) d).getNome();
                String email = ((Funcionario) d).getEmail();

                System.out.println("deuuuuu");

            }  
            }
            

            
            Marcacao marca = new Marcacao();
            marca.setData(request.getParameter("data"));

            
        }
        
        
        
        
        
         System.out.println(func);
        
            String modelInstance = "Olá Mundo!!!";
            return new ModelAndView("marcarConsulta", "func", func);
    }
    
}
