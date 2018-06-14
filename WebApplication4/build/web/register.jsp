<%-- 
    Document   : register
    Created on : Jun 14, 2018, 8:22:42 PM
    Author     : cdac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form</title>
        <style type="text/css">
            h3{
                font-family: Calibri;
                font-size: 22pt;
                font-style: normal;
                font-weight: bold;
                margin-left: 100px;
            } 
            #table{
                margin-left: 100px;
                margin-top: 50px;
            }
        </style>
    </head>
  <body background="images/pattern.jpg">
      <h3>Student registration form</h3>
           <form method="post" action="RegisterServlet">
               <table id="table">
                   <tr>
                       <td>First name</td>
                       <td><input type="text" name="firstname" maxlength="30"/>
                       </td>
                   </tr>
                   <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr>
                       <td>Middle name</td>
                       <td><input type="text" name="middlename" maxlength="30"/>
                       </td>
                   </tr>
                     <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr>
                       <td>Last name</td>
                       <td><input type="text" name="lastname" maxlength="30"/>
                       </td>
                   </tr>
                     <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr>
                       <td>Email</td>
                       <td><input type="text" name="email" maxlength="100"/>
                       </td>
                   </tr>
                     <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr>
                       <td>User Id</td>
                       <td><input type="text" name="User Id" maxlength="30"/>
                       </td>
                   </tr>
                     <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr>
                       <td>Password</td>
                       <td><input type="text" name="password" maxlength="30"/>
                       </td>
                   </tr>
                     <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr></tr>
                   <tr>
                       <td>
                           <input type="submit" value="Submit">
                           <input type="reset"  value="Reset">
                       </td>
                   </tr>
               </table>
           </form>
    </body>
</html>
