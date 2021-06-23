<%-- 
    Document   : MinhasConsultas
    Created on : 19/jun/2021, 18:56:23
    Author     : Pedro Ferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FisioGym</title>
    </head>
   <style>
        *{
            margin: 0;
            font-family: "Roboto", sans-serif;
        }
    
        .barraSuperior{
            background-color:  #264653;
            display: flex;
            border-bottom: 2px solid black;
        }
        
        .imgLogo{
            margin: auto;
            display: block;  
        }
        
        .textoLogo{
            color: #eeb623;
            margin: auto 25px;
            font-size: 45px;
        }
        
        .barraSuperiorDados{
            margin-top: auto;
            margin-left: auto;
            margin-bottom: auto;
            padding-bottom: 10px;
            padding-top: 20px;
            padding-right: 20px;
        }
        
        .butaoTerminarSessao{
            background-color: red;
            border-style: none;
            padding: 5px 10px;
            margin-top: 10px;
        }
        button:hover{
            cursor: pointer;
        }
        
        .userSessao{
            text-align: center;
        }
        
        .teste{
            background-color:  #F1E7DA;
            height: 100vh;
        }
        
        
        .item {
            width: 100%
          }

          .container {
            display: flex;
            flex-wrap: wrap;
          }

          .container > div {
            flex: 50%; /* or - flex: 0 50% - or - flex-basis: 50% - */
            /*demo*/
            box-shadow: 0 0 0 1px black;
            margin-bottom: 10px;
          }
                   
          .inlineMenuOpcoes{
              display: flex;
              background-color: #264653;
              padding: 15px 0;
          }
          
          .opcaoMenu{
              display: flex;
              flex: 25%;
              justify-content: center;
          }
          
          .opcaoBotao{
              font-size: 18px;
              padding: 3px 10px;
              background-color:  #F1E7DA;
          }
          
          .imgLogo{
              padding-top: 30px;
          }
        
    </style>  
    
    <body>
        
        <div class="teste">
        <div class="barraSuperior">
            
            <h1 class="textoLogo">FisioGym</h1>
            
            <div class="barraSuperiorDados">
                <h3 class="userSessao">${loggedUser.email}</h3>
                <button class="butaoTerminarSessao" onclick="location.href='index.htm'">Terminar Sessão</button>
            </div>         
        </div>
            
          
            <div class="inlineMenuOpcoes">
            
            <div class="opcaoMenu">
                <button class="opcaoBotao" onclick="location.href='minhaConta.htm'">Minha conta</button>
            </div>
            <div class="opcaoMenu">
                <button class="opcaoBotao" onclick="location.href='minhasAulas.htm'">Aulas de Grupo Inscrito</button>
            </div>
             <div class="opcaoMenu">
                <button class="opcaoBotao" onclick="location.href='minhasConsultas.htm'">Consultas nutrição</button>
            </div>
            <div class="opcaoMenu">
                <button class="opcaoBotao" onclick="location.href='pagamentos.htm'">Pagamentos</button>
            </div>           
            </div>
                       
                <h2 align="center" style="margin:20px 0; padding-top: 30px">Minhas consultas</h2>
    

    <br/>
   
    <table BORDER RULES=all width="51%" align="center" style="margin:auto">
        <tbody>

                <tr style="background-color:#1565c0;font-weight:bold;">
                    <td align="center" style="padding: 10px 0">Data</td>
                    <td align="center" style="padding: 10px 0">Horario</td>
                    <td align="center" style="padding: 10px 0">Funcionario</td>
                    
                    <td align="center" style="padding: 10px 0">Realizado</td>
                    <td align="center" style="padding: 10px 0">Visualizar</td>
                  
                   
                </tr>
                <c:forEach items="${marcacoes}" var="marcacao">
                    <tr style="background:#fff;">
                        <td align="center" style="font-size: 16px ; padding: 8px 0">${marcacao.data}</td>
                        <td align="center" style="font-size: 16px ; padding: 8px 0">${marcacao.horario}</td>
                        <td align="center" style="font-size: 16px ; padding: 8px 0">${marcacao.idfuncionario.nome}</td>
                        
                        <td align="center" style="font-size: 16px ; padding: 8px 0">${marcacao.realizado.nome}</td>
                       
                        <td align="center" style="font-size: 16px ; padding: 8px 0">
                        <c:if test="${marcacao.realizado.nome == 'realizada'}">
                            <button onclick="location.href='visualizarConsulta.htm?id=${marcacao.idmarcacao}'">Visualizar</button>
                        </c:if>
                        </td>
                    </tr>
                </c:forEach>
        </tbody>
        </table> 
    <div style="display: flex; justify-content: center">
        <button style="margin-top:20px" onclick="location.href='marcarConsulta.htm'">Marcar Consulta</button>
    </div>
    
            
            </div>
        
        
    </body>
</html>
