<%-- 
    Document   : login
    Created on : Jun 14, 2018, 8:22:02 PM
    Author     : cdac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body background="images/pattern.jpg">
        <form method="post" action="LoginServlet">
            <div style="padding: 100px 0 0 250px;">
                <div id="login-box">
                    <h2>Login page</h2>
                    please provide your credential to use this website
                    <br>
                    <br>
                   
                       <br />
                        <div id="login-box-name"><b>Password:</b></div>
                       <br />
                    <div id="login-box-field">
                        <input name="password" type="password" class="form-login"
                               title="password" value="" size="30" maxlength="48">
                    </div>
                       <br />
                       <span class="login-box-options">
                           <b>New User?</b> <a href="register.jsp" style="margin-left:30px"><b>Register Here</b></a>
                       </span>
                    <br />
                    <br />
                    <input style="margin-left: 100px" type="submit" value="login"/>
                    </div>
            </div>
        </form>
        </body>
    </html>
