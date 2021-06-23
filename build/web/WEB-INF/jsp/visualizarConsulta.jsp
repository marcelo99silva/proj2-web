<%-- 
    Document   : visualizarConsulta
    Created on : 19/jun/2021, 20:46:07
    Author     : Pedro Ferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
            height: 100%;
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
        
          
          .linkRedirecionar{
              margin-bottom: auto;
              margin-top: auto;
              text-decoration: none;
          }
          
          .centerDados{
              text-align: center;
          }
          
          
         /* /////////////////////////////////////////////////////////////// */
          
          
          /* ===== EFFECT FADING OUT FOR SIBLINGS MENU OPTIONS ===== */

            .menu:hover .menu__link:not(:hover){
                color: #241c69;
            }



/* ===== DEMO ===== */

            @media (min-width: 768px){

                html{
                    font-size: 62.5%;
                }
            }

            @media (max-width: 767px){

                html{
                    font-size: 50%;
                }
            }

            body{
                font-family: -apple-system, BlinkMacSystemFont, Segoe UI, Roboto, Open Sans, Ubuntu, Fira Sans, Helvetica Neue, sans-serif;
                font-size: 1.6rem;
                margin: 0;
                min-height: 15vh;
                display: flex;  
                flex-direction: column;
                background-size:cover;
            }


/*===================================================================================================*/
/* ===== FORM ===== */
            .create-page {
            width: 800px;
            padding: 2% 0 0;
            margin: auto;
            }
            .form {
                position: relative;
                z-index: 1;
                background: #FFFFFF;
                max-width: 800px;
                margin: 0 auto 100px;
                padding: 45px;
                text-align: center;
                box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
            }
            .form input {
                font-family: "Roboto", sans-serif;
                outline: 0;
                background: #f2f2f2;
                width: 100%;
                border: 0;
                
                padding: 15px;
                box-sizing: border-box;
                font-size: 14px;
            }
            .form button {
                font-family: "Roboto", sans-serif;
                text-transform: uppercase;
                outline: 0;
                background: #1565c0;
                width: 100%;
                border: 0;
                padding: 15px;
                color: #FFFFFF;
                font-size: 14px;
                -webkit-transition: all 0.3 ease;
                transition: all 0.3 ease;
                cursor: pointer;
            }
            .form button:hover,.form button:active,.form button:focus {
                background: #004ba0;
            }
            .form .message {
                margin: 15px 0 0;
                color: #b3b3b3;
                font-size: 12px;
            }
            .form .message a {
                color: #82b1ff;
                text-decoration: none;
            }
            .container {
                position: relative;
                z-index: 1;
                max-width: 90px;
                margin: 0 auto;
            }
            .container:before, .container:after {
                content: "";
                display: block;
                clear: both;
            }
            .container .info {
                margin: 25px auto;
                text-align: center;
            }
            .container .info h1 {
                margin: 0 0 5px;
                padding: 0;
                font-size: 36px;
                font-weight: 300;
                color: #1a1a1a;
            }
            .container .info span {
                color: #4d4d4d;
                font-size: 12px;
            }
            .container .info span a {
                color: #000000;
                text-decoration: none;
            }
            .container .info span .fa {
                color: #EF3B3A;
            }
/*===================================================================================================*/
            .user-email {
                font-size: small;
                font-weight: 100;
            }
            
            .linhaDados{
                margin-top: 15px;
                display: flex;
            }
            .linhaDados0{
                margin-top: 25px;
                display: flex;
            }
            
            .inputDados{
                margin: 5px 10px;
            }
            

    </style>  

        <body>
        
        <div class="teste">
        <div class="barraSuperior">
            <a class="linkRedirecionar" href="#"> 
            <h1 class="textoLogo">FisioGym</h1>
            </a>
            
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
                <button class="opcaoBotao" onclick="location.href='aulasGrupo.htm'">Aulas de grupo</button>
            </div>
            <div class="opcaoMenu">
                <button class="opcaoBotao" onclick="location.href='minhasAulas.htm'">Minhas Aulas</button>
            </div>
             <div class="opcaoMenu">
                <button class="opcaoBotao" onclick="location.href='minhasConsultas.htm'">Consultas nutrição</button>
            </div>
            <div class="opcaoMenu">
                <button class="opcaoBotao" onclick="location.href='pagamentos.htm'">Pagamentos</button>
            </div>           
            </div>
            
            
            

            
                <div class="create-page">
            <div class="form">   
                <h2>Minha avaliação</h2>
                <div>
                    <form class="create-form" method="post">
                 
                    <div class="linhaDados0">
                        
                    <p style="padding-top: 20px; margin-right: 30px">nome</p>
                    <input style="width: 500px" class="inputDados" id="nome" type="text" name="nome" placeholder="Nome"  value="${avalia.idmarcacao.idcliente.nome}" readonly>
                    <br>
                    <br>
                    <p style="padding-top: 20px; margin-left: 30px; padding-right: 20px">email</p>
                    <input style="width: 500px" class="inputDados" id="email" type="text" name="email" placeholder="Email" value="${avalia.idmarcacao.idcliente.email}" readonly>
                    <br>
                    <br>
                   
                   </div>
                    
                    <div class="linhaDados">
                        <p style="padding-top: 20px; margin-right: 35px">sexo</p>
                        <input style="width: 500px" class="inputDados" id="sexo" type="text" name="sexo" placeholder="Sexo" value="${avalia.sexo}" readonly>
                        <br>
                        <br>

                        <p style="padding-top: 20px; margin-left: 25px; padding-right: 30px">altura</p>
                        <input style="width: 500px" class="inputDados" id="altura" type="text" name="altura" placeholder="Altura" value="${avalia.altura}"  readonly>
                        <br>
                        <br>
                    </div>

                    
                    <div class="linhaDados">
                    <p style="padding-top: 20px; margin-right: 45px">peso</p>
                    <input style="width: 500px" id="peso" type="text" name="peso" placeholder="Peso" value="${avalia.peso}" readonly>
                    <br>
                    <br>
                 
                        <p style="text-align: start; margin-left: 40px">dobra cutanea biceps</p>
                    <input style="width: 500px" id="dobracutaneabiceps" type="text" name="dobracutaneabiceps" placeholder="Dobra cutanea biceps" value="${avalia.dobraCutaneaBiceps}" readonly>
                    <br>
                    <br>
                    </div>
                   
                    
                    <div class="linhaDados">
                    
                        <p style="text-align: start; margin-right: 10px">dobra cutanea triceps</p>         
                    <input style="width: 500px" id="dobracutaneatriceps" type="text" name="dobracutaneatriceps" placeholder="Dobra cutanea triceps" value="${avalia.dobraCutaneaTriceps}" readonly>
                    <br>
                    <br>
                     <p style="text-align: start; margin-left: 50px; margin-right: 10px">dobra cutanea abdomen</p>  
                    <input style="width: 500px" id="dobracutaneatriceps" type="text" name="dobracutaneatriceps" placeholder="Dobra cutanea triceps" value="${avalia.dobraCutaneaAbdomen}" readonly>
                    <br>
                    <br>
                    </div>
                   
                    <div class="linhaDados">
                    
                    <p style="text-align: start; margin-right: 15px">dobra cutanea coxa</p>  
                    <input style="width: 500px" id="dobracutaneacoxa" type="text" name="dobracutaneacoxa" placeholder="Dobra cutanea coxa" value="${avalia.dobraCutaneaCoxa}"  readonly>
                    <br>
                    <br>
                     <p style="text-align: start; margin-left: 30px; margin-right: 10px">perimetro cintura</p>  
                    <input style="width: 500px" id="perimetrocintura" type="text" name="perimetrocintura" placeholder="Perimetro cintura" value="${avalia.perimetroCintura}" readonly>
                    <br>
                    <br>
                    </div>
                    
                    
                    <div class="linhaDados">
                    
                    <p style="text-align: start ; margin-right: 15px">perimetro braço</p>  
                    <input style="width: 500px" id="perimetrobraco" type="text" name="perimetrobraco" placeholder="Perimetro braço" value="${avalia.perimetroBraco}"  readonly>
                    <br>
                    <br>
                     <p style="text-align: start; margin-left: 30px; margin-right: 10px">perimetro perna</p>  
                    <input style="width: 500px" id="perimetroperna" type="text" name="perimetroperna" placeholder="Perimetro perna" value="${avalia.perimetroPerna}" readonly>
                    <br>
                    <br>
                    </div>
                   
                
                    <button style="margin-top : 30px; width: 300px"><a style="width: 280px; display: block; text-decoration: none;color: white" href="minhasConsultas.htm"</a>   Voltar</button>
                 
                </form>
                 </div>
        </div>
                
            </div>
            
            
            
            </div>
        
        
    </body>
</html>
