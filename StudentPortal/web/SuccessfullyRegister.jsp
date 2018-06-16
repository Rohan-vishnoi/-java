<%-- 
    Document   : SuccessfullyRegister
    Created on : Jun 11, 2018, 8:14:28 PM
    Author     : pc
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Successfull Register</title>
    </head>
    <body style="background-color:lightseagreen">
    <center>
        <h1 style="color: green"> Your have Registered successfully </h1><br/><br/>

        <h3><a href="Login.jsp">CLICK Here to Login</a></h3>

    </center>
</body>
</html>


<%

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
        //out.print("Data Inserted");
    } catch (Exception e) {
        e.printStackTrace();
    }


%>
