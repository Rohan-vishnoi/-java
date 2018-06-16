/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.hibernate.dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rohan
 */
public class Success extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        
        PrintWriter writer = response.getWriter();
        
        String firstname = request.getParameter("firstname");
        String middlename = request.getParameter("middlename");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String userid = request.getParameter("userid");
        String password = request.getParameter("password"); 
        
        
//        writer.println("" + "" + "<center>" + "Details added Succesfully" + "</center>" + "");

        UserDAO a =new UserDAO();
        a.addUserDetails(firstname, middlename, lastname, email, userid, password);

        
        writer.println("<h1>Details added Succesfully</h1>");
    }
    
}

