<%-- 
    Document   : minhaConta
    Created on : 16/jun/2021, 16:57:50
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

/* ===== MENU STYLES ===== */

            /* core styles */

            .menu__list{
                display: flex;  
                text-align: center;
                padding-left: 0;
                margin-top: -942px;
                margin-bottom: 0;
                list-style: none;  
            }

            .menu__group{
                flex-grow: 1;
            }

            .menu__link{
                display: block;
            }

            /* skin */

            .menu{
                background-color: #1565c0;
                box-shadow: 0 1px 3px 0 rgba(0, 0, 0, .12), 0 1px 2px 0 rgba(0, 0, 0, .24);
            }

            .menu__link{
                padding: 2rem 1.5rem;

                font-weight: 700;
                color: #fff;
                text-decoration: none;
                text-transform: uppercase;
            }

            /* states */
            .menu__link:focus{
                outline: 2px solid #fff;
            }

            /* hover animation */

            .menu__link{
                position: relative;
                overflow: hidden;

                will-change: color;
                transition: color .25s ease-out;  
            }

            .menu__link::before, 
            .menu__link::after{
                content: "";
                width: 0;
                height: 3px;
                background-color: #fff;

                will-change: width;
                transition: width .1s ease-out;

                position: absolute;
                bottom: 0;
            }

            .menu__link::before{
                left: 50%;
                transform: translateX(-50%); 
            }

            .menu__link::after{
                right: 50%;
                transform: translateX(50%); 
            }

            .menu__link:hover::before, 
            .menu__link:hover::after{
                width: 100%;
                transition-duration: .2s;
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

            .page{
                box-sizing: border-box;
                /* max-width: 800px; */
                width: 100%;  
                padding-left: 1rem;
                padding-right: 1rem;
  
                order: 1;
                margin: auto;
            }
/*===================================================================================================*/
/* ===== FORM ===== */
            .create-page {
            width: 700px;
            padding: 2% 0 0;
            margin: auto;
            }
            .form {
                position: relative;
                z-index: 1;
                background: #FFFFFF;
                max-width: 700px;
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
                <button class="opcaoBotao" onclick="location.href='minhasAulas.htm'">Aulas de Grupo Inscrito</button>
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
                <h2>Minha Conta</h2>
                <div>
                    <form class="create-form" method="post" action="minhaConta.htm">
                 
                    <div class="linhaDados0">
                        
                    <p style="padding-top: 20px; padding-right: 20px">nome</p>
                    <input style="width: 700px" class="inputDados" id="nome" type="text" name="nome" placeholder="Nome"  value="${minhaconta.nome}" required>
                    <br>
                    <br>
                    <p style="padding-top: 20px; margin-left: 10px">username</p>
                    <input class="inputDados" id="username" type="text" name="username" placeholder="Username" value="${minhaconta.username}" required>
                    <br>
                    <br>
                   
                   </div>
                    
                    <div class="linhaDados">
                        <p style="padding-top: 20px; padding-right: 5px">morada</p>
                        <input style="width: 600px" class="inputDados" id="morada" type="text" name="morada" placeholder="Morada" value="${minhaconta.rua}" required>
                        <br>
                        <br>

                        <p style="padding-top: 20px; padding-left: 20px">email</p>
                        <input class="inputDados" id="email" type="text" name="email" placeholder="Email" value="${minhaconta.email}"  required>
                        <br>
                        <br>
                    </div>

                    
                    <div class="linhaDados">
                    <p style="padding-top: 20px ; padding-right: 5px">Contacto</p>
                    <input style="width: 450px" id="contacto" type="text" name="contacto" placeholder="Contacto" value="${minhaconta.telemovel}" required>
                    <br>
                    <br>
                 
                        <p style="padding-top: 20px; padding-left: 20px; padding-right: 10px">Ncc</p>
                        <input style="width:500px" id="ncc" type="text" name="ncc" placeholder="NCC" value="${minhaconta.ncc}" required>
                    <br>
                    <br>
                    </div>
                   
                    
                    <div class="linhaDados">
                    
                        <p style="padding-top: 20px ; padding-right: 30px">Sexo</p>         
                    <input style="width: 550px" id="sexo" type="text" name="sexo" placeholder="Sexo" value="${minhaconta.sexo}" required>
                    <br>
                    <br>
                     <p style="padding-top: 20px; padding-left: 20px; padding-right: 20px">Plano</p>  
                     <input id="plano" type="text" name="plano" placeholder="Plano" value="${minhaconta.idplano.nome}"  readonly>
                    <br>
                    <br>
                    </div>
                   
                    <div class="linhaDados">
                    
                    <p style="padding-top: 20px ; padding-right: 30px">Data</p>  
                    <input style="width: 600px" id="data" type="text" name="data" placeholder="Data nascimento" value="${minhaconta.dataNascimento}"  required>
                    <br>
                    <br>
                     <p style="padding-top: 20px; padding-left: 10px">Password</p>  
                    <input id="password" type="text" name="password" placeholder="Password" value="">
                    <br>
                    <br>
                    </div>
                   
                    
                    <button style="margin-top:20px" id="btn_Alterar" type="submit" name="btn_Alterar" formaction="?update">Alterar Dados</button>
                </form>
                 </div>
        </div>
                
            </div> 
            
            
            
            </div>
        
        
    </body>
    
</html>
