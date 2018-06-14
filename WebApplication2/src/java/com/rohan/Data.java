
package com.rohan;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;



@ManagedBean
@SessionScoped
public class Data {
    
    private Members m;
    private HibernateUtil helper;
    private Session session;
    
    public void addMember() {
        m = new Members("Steve");
        session = HibernateUtil.getSessionFactory().openSession();
        session.save(m);
        session.getTransaction().commit();
        session.close();
        
    }
    
}
