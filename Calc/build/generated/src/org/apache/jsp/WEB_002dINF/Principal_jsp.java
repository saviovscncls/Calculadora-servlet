package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Calculadora Daora</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            html{\n");
      out.write("                background: #2196f3;\n");
      out.write("                font-family: Arial;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #back{\n");
      out.write("                width: 500px;\n");
      out.write("                height: 500px;\n");
      out.write("                margin-left: 33%;\n");
      out.write("                margin-top:100px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #n{\n");
      out.write("                padding: 10px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #btns{\n");
      out.write("                padding: 10px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            .resull{\n");
      out.write("                border: 3px dotted black;\n");
      out.write("                padding: 10px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                background: #f7e560;\n");
      out.write("                margin-top: 52px;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("\n");
      out.write("                font-size: 60px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"back\">\n");
      out.write("            <h1>Calculadora Zika</h1>\n");
      out.write("            <br>\n");
      out.write("            <form method=\"GET\" action=\"/Calc/Processo\">\n");
      out.write("                Numero 1: <input type=\"text\" name=\"valor1\" id=\"n\"  />\n");
      out.write("                <br> <br>\n");
      out.write("                Numero 2: <input type=\"text\" name=\"valor2\" id=\"n\" />\n");
      out.write("                <br>\n");
      out.write("                <div class=\"resull\">\n");
      out.write("                    Resultado: <span id=\"resultado\"></span>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.print( request.getAttribute("resultado") );
      out.write("\n");
      out.write("                <input type=\"submit\" id=\"btns\" name=\"operacao\" value=\"Somar\" />\n");
      out.write("                <input type=\"submit\" id=\"btns\" name=\"operacao\" value=\"Subtrair\" />\n");
      out.write("                <input type=\"submit\" id=\"btns\" name=\"operacao\" value=\"Dividir\" />\n");
      out.write("                <input type=\"submit\" id=\"btns\" name=\"operacao\" value=\"Multiplicar\" />\n");
      out.write("                <input type=\"submit\" id=\"btns\" name=\"operacao\" value=\"Limpar\" />\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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
