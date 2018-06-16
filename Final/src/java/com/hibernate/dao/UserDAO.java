
package com.hibernate.dao;

import com.hibernate.bean.User;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;




public class UserDAO {
    public void addUserDetails(String firstname,String middlename,String lastname,String email,String password,String userid) {
        
        try {
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

            SessionFactory sessionFactory = configuration.buildSessionFactory();
            
            Session session = sessionFactory.openSession();
            
            Transaction transaction = session.beginTransaction();
            
            User user = new User();
            user.setFirstname(firstname);
            user.setMiddlename(middlename);
            user.setLastname(lastname);
            user.setEmail(email);
            user.setUserid(userid);
            user.setPassword(password);
            session.save(user);
            transaction.commit();
            System.out.println("\n\n Details Added \n");
        }catch (HibernateException e) {
            System.out.println(e.getMessage());
            System.out.println("error");
        }
    }
    
}
