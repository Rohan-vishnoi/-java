
package com.mvc.dao;

import com.mvc.bean.RegisterBean;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mvc.util;
import java.sql.Connection;


public class RegisterDao {

public String registerUser(RegisterBean registerBean)
{
    String fullname = registerBean.getFullName();
    String email = registerBean.getEmail();
    String username = registerBean.getUsername();
    String password = registerBean.getPassword();
    
    Connection con = null;
    PreparedStatement preparedStatement = null;
    
    try {
        
        con = DBConnection.createConnection();
        String query = "Insert into users(Slno,fullname,Email,username,password) values (NULL,?,?,?,?)";
        preparedStatement = con.preparedStatement(query);
        preparedStatement.setString(1, fullname);
        preparedStatement.setString(2, email);
        preparedStatement.setString(3, username);
        preparedStatement.setString(4, password);
        
        int i = preparedStatement.executeUpdate();
        
        if(i!=0){
            return "SUCCESS";
        }
        catch(SQL Exception e){
                e.printStackTrace();
                
        }
                return "oops something wong there ......";
                }
    }
    }
}
}
