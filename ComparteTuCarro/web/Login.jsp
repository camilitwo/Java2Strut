<%-- 
    Document   : Login
    Created on : 22-ago-2016, 21:55:00
    Author     : cvillalobos
--%>


<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comparte tu Carro Duoc UC Login</title>
    </head>
    
    <script>
        
      $(document).ready(function(){
          $( "#btnRecuperar" ).click(function() {
            $('#txtEmail').val("");
          });
      })
      
      
      
      function validaEmail(){
          var email = $('#txtEmail').val();
          
          if(email ==="" || email ===null){
              alert("El campo debe ser completado");
          }
          
          if((email.indexOf('@', 0) == -1 || email.indexOf('.', 0) == -1)
                  && email!=="") {
            alert('El correo electrónico introducido no es correcto.');
            return false;
        }
      }
    </script>
    
    
    <body style="background-color: #0dab9b">  
        
        <div class="form-horizontal">
            <image 
        </div>
        
        <style type="text/css"> 
            body { 
             background-image: url("img/adedo_desktop_bg_1_Ues.jpg"); 
             background-repeat: no-repeat;
             background-position: center;
             background-size: contain;
             background-attachment: scroll;
             image-resolution: normal;
         
              
             
             
            } 
        </style>
        <form action="LoginServlet" method="post" accept-charset="UTF-8">
         
            <div style="margin-top: 13%; margin-left: 75%;" class="contenedor-footer">
            <div class="form-group">
                <label for="email"><strong>Usuario:</strong></label>
                <input type="text" class="form-control" name="txtUser" style="width: 55%;" required="Completar Campo">
              </div>
              <div class="form-group">
                <label for="pwd"><strong>Password:</strong></label>
                <input type="password" class="form-control" name="txtPass" style="width: 55%" required="Completar Campo">
              </div>
              <div class="checkbox">
                  <label><input type="checkbox"><strong>Remember me</strong></label>
              </div>
            
                <button type="submit" class="btn btn-success" >Enviar</button>
              
            <button type="button" class="btn btn-danger" data-toggle="modal" 
                    data-target="#modalRecuperaclave" id="btnRecuperar">Recuperar Contraseña</button>
                    
                    
                  
            </div>
            
             
            
                            
                        <!-- Modal -->
                            <div class="modal fade" id="modalRecuperaclave" role="dialog">
                              <div class="modal-dialog modal-lg">
                                <div class="modal-content">
                                  <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                    <h4 class="modal-title">Recuperar Contraseña</h4>
                                  </div>
                                    <div>
                                        <div class="modal-body">
                                            <p><strong>Email</strong></p>
                                            <p>
                                                <input type="text" class="form-control small" name="txtEmail" 
                                                       style="width: 500px"  id="txtEmail">
                                                <button type="button" class="btn btn-success small" style="margin-top: 20px" onclick="validaEmail()">Send</button>
                                            </p>
                                        </div>
                                        <div class="modal-footer">
                                          <button type="button" class="btn btn-default small" data-dismiss="modal">Cerrar</button>
                                        </div>
                                   </div>
                                </div>
                                    
                              </div>
                            </div>
                         </form>
            </div>
           
        
        
    </body>
    
</html>
