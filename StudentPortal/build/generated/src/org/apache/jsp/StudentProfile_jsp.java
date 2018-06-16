package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import PojoClass.PojoStd;
import java.util.Iterator;
import java.util.List;
import com.logic.FetchDetails;
import VerifyDetails.LoginCheck;

public final class StudentProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.jsp", out, false);
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      PojoClass.PojoStd obj = null;
      synchronized (_jspx_page_context) {
        obj = (PojoClass.PojoStd) _jspx_page_context.getAttribute("obj", PageContext.PAGE_SCOPE);
        if (obj == null){
          obj = new PojoClass.PojoStd();
          _jspx_page_context.setAttribute("obj", obj, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("obj"), request);
      out.write(" \n");
      out.write("\n");
      out.write("\n");


//    boolean status = LoginCheck.Validate(obj);
//    if (status) {
//        out.println("<h3>You are successfully logged in as " + request.getParameter("name") + "</h3>");
//        String st = request.getParameter("name");
//
//        session.setAttribute("session", "TRUE");
//    } else {
//        out.print("<h3 color:red>" + "Sorry, email or password doesn't match" + "<h3>");

    try
    {
        String n = request.getParameter("name");
        String e = request.getParameter("email");
        System.out.println("Value of n : "+n);
        System.out.println("Value of e : "+e);
        
        FetchDetails fd=new FetchDetails();
        List list = fd.fetchStd(n,e);
        System.out.println("After List : ");
        Iterator<PojoStd> it = list.iterator();
        /*
        for(int j=0;j<std1.size();j++)*/
        while(it.hasNext())
        {
            System.out.println("In hasNext : ");
            PojoStd ps = (PojoStd)it.next();
            System.out.println(ps.getName()+ " ");
            System.out.println(ps.getCourse()+ " ");
            System.out.println(ps.getRoll()+ " ");
            System.out.println(ps.getEmail()+ " ");
            System.out.println(ps.getCity()+ " ");
            System.out.println(ps.getDob()+ " ");
            
        }
        
        
    }
    catch(Exception e)
    {
        System.out.println("Email Or Name Does't Match" + e);
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
