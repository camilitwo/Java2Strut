package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Comparte tu Carro Duoc UC Login</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        \n");
      out.write("      $(document).ready(function(){\n");
      out.write("          $( \"#btnRecuperar\" ).click(function() {\n");
      out.write("            $('#txtEmail').val(\"\");\n");
      out.write("          });\n");
      out.write("      })\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      function validaEmail(){\n");
      out.write("          var email = $('#txtEmail').val();\n");
      out.write("          \n");
      out.write("          if(email ===\"\" || email ===null){\n");
      out.write("              alert(\"El campo debe ser completado\");\n");
      out.write("          }\n");
      out.write("          \n");
      out.write("          if((email.indexOf('@', 0) == -1 || email.indexOf('.', 0) == -1)\n");
      out.write("                  && email!==\"\") {\n");
      out.write("            alert('El correo electrónico introducido no es correcto.');\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    <body style=\"background-color: #0dab9b\">  \n");
      out.write("        \n");
      out.write("        <div class=\"form-horizontal\">\n");
      out.write("            <image \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\"> \n");
      out.write("            body { \n");
      out.write("             background-image: url(\"img/adedo_desktop_bg_1_Ues.jpg\"); \n");
      out.write("             background-repeat: no-repeat;\n");
      out.write("             background-position: center;\n");
      out.write("             background-size: contain;\n");
      out.write("             background-attachment: scroll;\n");
      out.write("             image-resolution: normal;\n");
      out.write("         \n");
      out.write("              \n");
      out.write("             \n");
      out.write("             \n");
      out.write("            } \n");
      out.write("        </style>\n");
      out.write("        <form action=\"LoginServlet\" method=\"post\" accept-charset=\"UTF-8\">\n");
      out.write("         \n");
      out.write("            <div style=\"margin-top: 13%; margin-left: 75%;\" class=\"contenedor-footer\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"email\"><strong>Usuario:</strong></label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"txtUser\" style=\"width: 55%;\" required=\"Completar Campo\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"pwd\"><strong>Password:</strong></label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"txtPass\" style=\"width: 55%\" required=\"Completar Campo\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"checkbox\">\n");
      out.write("                  <label><input type=\"checkbox\"><strong>Remember me</strong></label>\n");
      out.write("              </div>\n");
      out.write("            \n");
      out.write("                <button type=\"submit\" class=\"btn btn-success\" >Enviar</button>\n");
      out.write("              \n");
      out.write("            <button type=\"button\" class=\"btn btn-danger\" data-toggle=\"modal\" \n");
      out.write("                    data-target=\"#modalRecuperaclave\" id=\"btnRecuperar\">Recuperar Contraseña</button>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("                            \n");
      out.write("                        <!-- Modal -->\n");
      out.write("                            <div class=\"modal fade\" id=\"modalRecuperaclave\" role=\"dialog\">\n");
      out.write("                              <div class=\"modal-dialog modal-lg\">\n");
      out.write("                                <div class=\"modal-content\">\n");
      out.write("                                  <div class=\"modal-header\">\n");
      out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                    <h4 class=\"modal-title\">Recuperar Contraseña</h4>\n");
      out.write("                                  </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"modal-body\">\n");
      out.write("                                            <p><strong>Email</strong></p>\n");
      out.write("                                            <p>\n");
      out.write("                                                <input type=\"text\" class=\"form-control small\" name=\"txtEmail\" \n");
      out.write("                                                       style=\"width: 500px\"  id=\"txtEmail\">\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-success small\" style=\"margin-top: 20px\" onclick=\"validaEmail()\">Send</button>\n");
      out.write("                                            </p>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"modal-footer\">\n");
      out.write("                                          <button type=\"button\" class=\"btn btn-default small\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                                        </div>\n");
      out.write("                                   </div>\n");
      out.write("                                </div>\n");
      out.write("                                    \n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                         </form>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
