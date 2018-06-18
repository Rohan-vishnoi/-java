/*
 * To change this licecomnse header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import com.mvc.dao.*;
import com.mvc.bean.RegisterBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rohan
 */
public class RegisterServlet extends HttpServlet {
    
    public RegisterServlet() {
        
        }
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        
        String fullname =request.getParameter("fullname");
        String username =request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        RegisterBean registerBean = new RegisterBean();
        
        registerBean.setfullname(fullname);
        registerBean.setemail(email);
        registerBean.setpassword(password);
        registerBean.setusername(username);
        
        RegisterDao registerDao = new RegisterDao();
        
        String userRegistered = registerDao.registerUser(registerBean);
        
        if(userRegistered.equals("SUCCESS"))
        {
                request.getRequestDispatcher("/Home.jsp").forward(request, response);
        }
        else
        {
            request.setAttribute("errMessage", userRegistered);
            request.getRequestDispatcher("/Register.jsp").forward(request, response);
        }
    }

    
}
