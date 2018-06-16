package com.logic;

import PojoClass.PojoStd;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDetails {

    public List fetchStd(String email, String sname) {
        List list = null;
        Session session = null;
        try {
            
            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
            SessionFactory sf = cfg.buildSessionFactory();
            session = sf.openSession();
            Transaction t = session.beginTransaction();
            Query query = session.createQuery("from PojoStd where email=:em and name=:sn");
            
            query.setParameter("em", email);
            query.setParameter("sn", sname);
            
            list = query.list();
            Iterator<PojoStd> it = list.iterator();
          
            /*
             for(int j=0;j<std1.size();j++)*/
            while (it.hasNext()) {
            
                PojoStd ps = (PojoStd) it.next();
                System.out.println(ps.getName() + " ");
                System.out.println(ps.getCourse() + " ");
                System.out.println(ps.getRoll() + " ");
                System.out.println(ps.getEmail() + " ");
                System.out.println(ps.getCity() + " ");
                System.out.println(ps.getDob() + " ");

            }

        } catch (Exception e) {

            System.out.println("Exception during Fetching : " + e);
            list = null;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return list;
    }
}
