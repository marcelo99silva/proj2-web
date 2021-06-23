<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FisioGym Login</title>
    </head>

        <style>
        
        *{
            margin: 0;
        }
            
            
        .login-page {
            width: 800px;
            padding: 8% 0 0;
            margin: auto;
        }
        .form {
            position: relative;
            z-index: 1;
            background: #FFFFFF;
            max-width: 360px;
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
            margin: 0 0 15px;
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
        .form .register-form {
            display: none;
        }
        .container {
            position: relative;
            z-index: 1;
            max-width: 300px;
            margin: 0 auto;
        }
        .container:before, .container:after {
            content: "";
            display: block;
            clear: both;
        }
        .container .info {
            margin: 50px auto;
            text-align: center;
        }
        .container .info h1 {
            margin: 0 0 15px;
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
        body {
            padding: 0;
            background: linear-gradient(to left, #264653, #597e8d);
            font-family: "Roboto", sans-serif;
            -webkit-font-smoothing: antialiased;
            -moz-osx-font-smoothing: grayscale;      
        }
        #info{
            color: red;
            font-family: tahoma;
            font-size: 17px;
        }
        
        .barraSuperior{
            background-color:  #264653;
            display: flex;
            border-bottom: 2px solid black;
        }
        
        .imgLogo{
            margin-left:  10px;
            width: 160px;  
        }
        
        .textoLogo{
            color: #eeb623;
            margin: auto 25px;
            font-size: 45px;
        }
        .loginErrado{
            padding-top: 10px;
            color: red;
        }
    </style>  
      
    <body>
        <div class="barraSuperior">
            <img class="imgLogo" src="Media/logo.png">
            <h1 class="textoLogo">FisioGym</h1>
        </div>
        
        <div class="login-page">
            <div class="form">
               <form class="login-form" method="post" action="menuCliente.htm">
                    <h1>Login</h1>
                    <br/>
                    <div id="info"></div>
                    <br>
                    <input type="email" placeholder="Email" id="txEmail" name="txEmail"/>
                    <br>
                    <br>
                    <input type="password" placeholder="Password" id="txPwd" name="txPwd"/>
                    <br>
                    <br>  
                    <button onclick="this.submit()">Login</button>
                  <h3 class="loginErrado">${modelAttribute}</h3>
                    <h3 class="loginErrado">${modelName}</h3>
                 <!--   <button onclick="if(IsFormValid()){this.submit()}else{document.getElementById('info').innerText='Campos inválidos!';return false;}" >Entrar</button>      -->              
                   
               </form>
                
                
            </div>
        </div>
        
        </p>
    </body>
    
    
    <script>
        
        function verConsulta(){
            console.log("testesss");
        }
        
        function IsFormValid(){
            var elEmail = document.getElementById('txEmail');
            var elPwd = document.getElementById('txPwd');
            
            if (elEmail.value.length>0 && elPwd.value.length>3) {
                elEmail.value.style = "border:1px #000 solid";
                elPwd.value.style = "border:1px #000 solid";
                return true;
            }
            else {
                elEmail.style = "border:1px red solid";
                elPwd.style = "border:1px red solid";
                return false;
            }
            
        }
    </script>
    
    
</html>


