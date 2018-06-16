<%-- 
    Document   : StdRegister
    Created on : 7 Jun, 2018, 9:33:32 PM
    Author     : Shree
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body style="background-color:lightseagreen">
    <center>
        <h1 style="color: green"> Student Registration Form</h1>

        <table cellpadding="4">
            <form action="SuccessfullyRegister.jsp" method="POST">
                <tr><th>Student Name</th><td> <input type="text" name="name"/></td></tr>
                <tr><th>Course Name</th><td><input type="text" name="course"/></td></tr>
                <tr><th>Roll Number</th><td> <input type="number_format" name="rollno"/></td></tr>
                <tr><th>Email-ID</th><td> <input type="email" name="email"/></td></tr>
                <tr><th>City</th><td> <input type="text" name="city"/></td></tr>
                <tr><th>Date Of Birth</th><td> <input type="date" name="dob"/></td></tr>
                <tr><td><td><input type="submit" name="submit" value="Register"/><input type="reset" name="reset" value="Reset"/></td></td></tr>

            </form>
        </table> 

    </center>
</body>
</html>

