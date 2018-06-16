<%-- 
    Document   : LoginProfile
    Created on : 7 Jun, 2018, 6:59:07 PM
    Author     : Shree
--%>

<%@page import="PojoClass.PojoStd"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.logic.FetchDetails"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="obj" class="PojoClass.PojoStd"/>
<%@page import="VerifyDetails.LoginCheck"%>
<jsp:setProperty property="*" name="obj"/> 

<html>
    <head><title>Student Profile</title></head>
    <header style="text-align: right; border-bottom:solid; border-bottom-color:black; ">
        <center style="color:greenyellow"><% out.println("<h1> :) Hello and Welcome   " + request.getParameter("name") + "</h3>"); %></center>
        <h3><a href="Logout.jsp">Logout</a></h3>
        <h3><a href="Contact_us.jsp">About us</a></h3>
    </header>
</html>
<%
//    boolean status = LoginCheck.Validate(obj);
//    if (status) {
//        out.println("<h3>You are successfully logged in as " + request.getParameter("name") + "</h3>");
//        String st = request.getParameter("name");
//
//        session.setAttribute("session", "TRUE");
//    } else {
//        out.print("<h3 color:red>" + "Sorry, email or password doesn't match" + "<h3>");
  
    try {
        String n = request.getParameter("name");
        String e = request.getParameter("email");
        System.out.println("Value of n : " + n);
        System.out.println("Value of e : " + e);

        FetchDetails fd = new FetchDetails();
        List<PojoStd> list = fd.fetchStd(e, n);
        System.out.println("After List : ");
        Iterator<PojoStd> it = list.iterator();
        System.out.println("Entering into While block..... : ");
       
//        for(int j=0;j<std1.size();j++)
        while (it.hasNext())
        {
            System.out.println("In hasNext : ");
            PojoStd ps = (PojoStd) it.next();
%>
<center>
    
    <table border="1px" >
        <tr><th>Name</th><td><%=ps.getName()%></td></tr>
        <tr><th>Course Name</th><td><%=ps.getCourse()%></td></tr>
        <tr><th>Roll No</th><td><%=ps.getRoll()%></td></tr>
        <tr><th>Email</th><td><%=ps.getEmail()%></td></tr>
        <tr><th>City</th><td><%=ps.getCity()%></td></tr>
        <tr><th>DOB</th><td><%=ps.getDob()%></td></tr>
    </table>
</center>
<%
            System.out.println(ps.getName() + " ");
            System.out.println(ps.getCourse() + " ");
            System.out.println(ps.getRoll() + " ");
            System.out.println(ps.getEmail() + " ");
            System.out.println(ps.getCity() + " ");
            System.out.println(ps.getDob() + " ");

        }

    } catch (Exception e) {
        System.out.println("Email Or Name Does't Match" + e);
    }
%>


