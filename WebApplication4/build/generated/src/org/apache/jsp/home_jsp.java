package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.object.model.User;
import com.object.service.LoginService;
import java.util.List;
import java.util.Date;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"/>\n");
      out.write("     <title>Result Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("     <div id=\"container\">\n");
      out.write("         <h1>Result Page</h1>\n");
      out.write("             <b>This is Sample Result Page</b><br/>\n");
      out.write("             ");
      out.print(new Date());
      out.write("</br>\n");
      out.write("             ");

                 User user = (User) session.getAttribute("User");
             
      out.write("     \n");
      out.write("             <b>Welcome ");
      out.print( user.getFirstName() + " " + user.getLastName());
      out.write("</b>     \n");
      out.write("             <br/>\n");
      out.write("             <a href=\"logout.jsp\">Logout</a>\n");
      out.write("         \n");
      out.write(" \n");
      out.write("         <table>\n");
      out.write("             <thead>\n");
      out.write("                 <tr>\n");
      out.write("                     <th>User ID</th>\n");
      out.write("                     <th>First Name</th>\n");
      out.write("                     <th>Middle Name</th>\n");
      out.write("                     <th>Last Name</th>\n");
      out.write("                     <th>email</th>                \n");
      out.write("                 </tr>\n");
      out.write("             </thead>\n");
      out.write("             <tbody>\n");
      out.write("                 ");

                     LoginService loginService = new LoginService()
                             ;
                     List<User> list = loginService.getListOfUsers();
                     for (User u : list) {
                 
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                     <td>");
      out.print(u.getUserId());
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(u.getFirstName());
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(u.getMiddleName());
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(u.getLastName());
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(u.getEmail());
      out.write("</td>\n");
      out.write("                 </tr>\n");
      out.write("                 ");
}
      out.write("\n");
      out.write("             <tbody>\n");
      out.write("         </table>    \n");
      out.write("         <br/>\n");
      out.write("     </div>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
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
