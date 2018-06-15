<%-- 
    Document   : home
    Created on : Jun 14, 2018, 8:21:46 PM
    Author     : cdac
--%>
<%@page import="com.object.model.User" %>
<%@page import="com.object.service.LoginService" %>
<%@page import="java.util.List"%>
<%@page import="com.object.service.LoginService"%>
<%@page import="java.util.Date"%>
<%@page import="com.object.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <link rel="stylesheet" type="text/css" href="css/style.css"/>
     <title>Result Page</title>
</head>
<body>
<center>
     <div id="container">
         <h1>Result Page</h1>
             <b>This is Sample Result Page</b><br/>
             <%=new Date()%></br>
             <%
                 User user = (User) session.getAttribute("user");
             %>     
             <b>Welcome <%= user.getFirstName() + " " + user.getLastName()%></b>     
             <br/>
             <a href="logout.jsp">Logout</a>
 
 
         <table>
             <thead>
                 <tr>
                     <th>User ID</th>
                     <th>First Name</th>
                     <th>Middle Name</th>
                     <th>Last Name</th>
                     <th>email</th>                
                 </tr>
             </thead>
             <tbody>
               
                 <%}%>
             <tbody>
         </table>    
         <br/>
     </div>
    </center>
</body>
</html>
