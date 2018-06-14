/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.object.demo;

import javax.security.auth.login.Configuration;
import javax.websocket.Session;

/**
 *
 * @author rohan
 */
public class App {
    public static void main(String[] args){
            Alien object =  new Alien();
                object.setid(101);
                object.setname("rohan"); //this data save in database using save(object);
                object.setColor("red");
                
                Configuration con = new configuration();
                
                Session session = sf.openSession();
                
                SessionFactory sf=;
               save(object); 
               
                
    }

    private static void save(Alien object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
