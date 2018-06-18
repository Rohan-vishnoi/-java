/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author rohan
 */
public class DBConnection {
    public static Connection createConnection()
    {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/customers?zeroDateTimeBehavior=convertToNull [root on Default schema]";
        String username="root";
        String password="123456";
        
        try{
            try{
                Class.forName("com.mysql.jdbc.driver");
            }
            catch(ClassNotFoundExecption e)
            {
                e.printstackTrace();
            }
            
            con = DriverManager.getConnection(url, username,password);
            System.out.println("Printing connection object" + con);
        }
        catch(Exception e )
        {
            e.printStackTrace();
        }
        
        return com;
    }
}
    }
}
