<%-- 
    Document   : response
    Created on : 7 Jun, 2018, 8:40:37 PM
    Author     : rohan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.Namehandler" />
        <jsp:setProperty name="mybean" property="name" />
        <h1>Hello,<jsp:getProperty name="mybean" property="name" />!</h1>
    </body>
</html>
