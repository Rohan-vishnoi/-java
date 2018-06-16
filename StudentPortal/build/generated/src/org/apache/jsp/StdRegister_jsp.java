package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class StdRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:lightseagreen\">\n");
      out.write("    <center>\n");
      out.write("        <h1 style=\"color: green\"> Student Registration Form</h1>\n");
      out.write("\n");
      out.write("        <table cellpadding=\"4\">\n");
      out.write("            <form action=\"#\" method=\"POST\">\n");
      out.write("                <tr><th>Student Name</th><td> <input type=\"text\" name=\"name\"/></td></tr>\n");
      out.write("                <tr><th>Course Name</th><td><input type=\"text\" name=\"course\"/></td></tr>\n");
      out.write("                <tr><th>Roll Number</th><td> <input type=\"number_format\" name=\"rollno\"/></td></tr>\n");
      out.write("                <tr><th>Email-ID</th><td> <input type=\"email\" name=\"email\"/></td></tr>\n");
      out.write("                <tr><th>City</th><td> <input type=\"text\" name=\"city\"/></td></tr>\n");
      out.write("                <tr><th>Date Of Birth</th><td> <input type=\"date\" name=\"dob\"/></td></tr>\n");
      out.write("                <tr><td><td><input type=\"submit\" name=\"submit\" value=\"Register\"/><input type=\"reset\" name=\"reset\" value=\"Reset\"/></td></td></tr>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </table> \n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>\n");

    String sname = request.getParameter("name");
    String cname = request.getParameter("course");
    String rno = request.getParameter("rollno");
    String email = request.getParameter("email");
    String city = request.getParameter("city");
    String dob = request.getParameter("dob");

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DAC", "root", "");
        Statement st = con.createStatement();
        int i = st.executeUpdate("insert into StudentRegister(StudentName,CourseName,RollNumber,Email,City,DOB) values('" + sname + "','" + cname + "','" + rno + "','" + email + "','" + city + "','" + dob + "')");

        //ResultSet rs = ps.executeQuery();
        out.print("Data Inserted");
    } catch (Exception e) {
        e.printStackTrace();
    }



      out.write('\n');
      out.write('\n');
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
