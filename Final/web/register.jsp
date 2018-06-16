<%-- 
    Document   : register
    Created on : 16 Jun, 2018, 2:24:03 PM
    Author     : rohan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign up</title>
    </head>
    <body background="images/pattern.jpg">
        <h1>Registration Form</h1>
        <div>
            <form action="Success" method="post">
        
            <table>
                <tr>
                    <td>first name</td>
                    <td><input type="text" name="firstname"/></td>
                </tr>
                <tr>
                    <td>middle name</td>
                    <td><input type="text" name="middlename"</td>
                </tr>
                <tr>
                    <td>Last name</td>
                    <td><input type="text" name="lastname"/></td>
                </tr>
                <tr>
                    <td>email</td>
                    <td><input type="email" name="email"/></td>
                </tr>
                <tr>
                    <td>Userid</td>
                    <td><input type="text" name="userid"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"/></td>
                </tr>
            </table>
                
                    <br />
                    <br />
                    
                <input type="submit" value="Submit" name="submit">
                <input type="reset" name="reset">
               
        </form>
                </div>  
            
        </div>
    </body>
</html>
