/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.hibernate.dao.UserDAO;
/**
 *
 * @author rohan
 */
public class UserControllerServlet extends HttpServlet {
    
    private static final long serialVersionUID =1L;
    
    
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        
        String firstname = request.getParameter("firstname");
        String middlename = request.getParameter("middlename");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String userid = request.getParameter("userid");
        String password = request.getParameter("password");
    
        
        HttpSession session = request.getSession(true);
        try{
            UserDAO userDAO = new UserDAO();
            userDAO.addUserDetails(firstname,middlename,lastname,email,userid,password);
            response.sendRedirect("Success");
            
        }catch (IOException e) {
        }
    }
}
        
                
