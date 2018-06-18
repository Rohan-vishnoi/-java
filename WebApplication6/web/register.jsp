<%-- 
    Document   : register
    Created on : 18 Jun, 2018, 10:16:10 PM
    Author     : rohan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <script>
            function validate()
            {
                var fullname = document.form.fullname.value;
                var email = document.form.email.value;
                var username = document.form.password.value;
                var password = document.form.password.value;
                var compassword = document.form.compassword.value;
                
                if (fullname==null || fullname=="")
                {
                    alert("Full Name cant be blank");
                    return false;
                }
                else if (email== null || email=="")
                {
                    alert("Email cant be blank");
                    return false;
                }
                else if (username== null || username=="")
                {
                    alert("Username cant be blank");
                    return false;
                }
                else if(password.length<6)
                {
                    alert("password must be atleast 6 character");
                    return false;
                }
                else if (password=!compassword)
                {
                    alert("password should be match with confirm password")
                    return false;
                    
                }
            
                }
                </script>
            
          
    </head>
    <body>
    <center><H2>JAVA REGISTRATION</H2>
        <form action="RegisterServlet" method="post">
            <table align="center">
                <tr>
                    <td>Full Name</td>
                    <td><input type="text" name="fullname" /></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="email" name="Email" /></td>
                </tr>
                <tr>
                    <td>username</td>
                    <td><input type="text" name="username" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td><%=(request.getAttribute("errMessage") == null ) ? ""
                            : request.getAttribute("errMessage")%></td>
                    
                </tr>
                <tr>
                <td></td>
                <td><input type="submit" value="Register"/><input type="reset" value="Reset"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
