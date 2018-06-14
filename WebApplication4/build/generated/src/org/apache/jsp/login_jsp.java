package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"images/pattern.jpg\">\n");
      out.write("        <form method=\"post\" action=\"LoginServlet\">\n");
      out.write("            <div style=\"padding: 100px 0 0 250px;\">\n");
      out.write("                <div id=\"login-box\">\n");
      out.write("                    <h2>Login page</h2>\n");
      out.write("                    please provide your credential to use this website\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div id=\"login-box-name\" style=\"margin-top:20px\"><b>User id:</b></div>\n");
      out.write("                    <div id=\"login-box-field\" style=\"margin-top:20px;\">\n");
      out.write("                        <input name=\"userId\" class=\"form-login\" title=\"Username\"\n");
      out.write("                         value=\"\" size=\"30\" maxlength=\"50\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <br />\n");
      out.write("                        <div id=\"login-box-name\"><b>Password:</b></div>\n");
      out.write("                       <br />\n");
      out.write("                    <div id=\"login-box-field\">\n");
      out.write("                        <input name=\"password\" type=\"password\" class=\"form-login\"\n");
      out.write("                               title=\"password\" value=\"\" size=\"30\" maxlength=\"48\">\n");
      out.write("                    </div>\n");
      out.write("                       <br />\n");
      out.write("                       <span class=\"login-box-options\">\n");
      out.write("                           <b>New User?</b> <a href=\"register.jsp\" style=\"margin-left:30px\"><b>Register Here</b></a>\n");
      out.write("                       </span>\n");
      out.write("                    <br />\n");
      out.write("                    <br />\n");
      out.write("                    <input style=\"margin-left: 100px\" type=\"submit\" value=\"login\"/>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
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
