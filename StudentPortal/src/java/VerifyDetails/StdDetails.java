package VerifyDetails;

import PojoClass.PojoStd;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StdDetails {

    public void addStudentDetails(String sname, String course, int roll, String city, String email, String dob) {
        try {
            Configuration configuration = new Configuration().configure();
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction t = session.beginTransaction();

            PojoStd pj = new PojoStd();
            pj.setName(sname);
            pj.setEmail(email);

            t.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("error");
        }
    }
}
