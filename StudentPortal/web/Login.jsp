<%-- 
    Document   : Login
    Created on : 7 Jun, 2018, 6:35:38 PM
    Author     : Shree
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="index.jsp" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>


    <center>
        <h1>Login Form</h1>  
        <%
            String profile_msg = (String) request.getAttribute("profile_msg");

            //out.print(profile_msg);
            if (profile_msg != null) {
                out.print(profile_msg);
            }
            String login_msg = (String) request.getAttribute("login_msg");
            if (login_msg != null) {
                out.print(login_msg);
            }
        %>  
        <br/>

        <form action="StudentProfile.jsp" method="POST">
            <table>
                <tr><th> Enter Name </th><td> <input type="text" name="name" required/> </td></tr>
                <tr><th> Email-ID </th><td> <input type="email" name="email" required/> </td></tr>
                <tr><td><td><input align="center" type="submit" value="Login" name="submit"/></td></td></tr>    
            </table>

        </form>

    </center>
