import PojoClass.PojoStd;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetStudentDetails {

    public static void main(String args[]) {
/*        ArrayList<PojoStd> std1 = new ArrayList<PojoStd>(20);
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();

        Query query = session.createQuery("from PojoStd");

        java.util.List<PojoStd> list = query.list();
        //System.out.println(list);

        Iterator it = list.iterator();
       
//         for(int j=0;j<std1.size();j++)
        while (it.hasNext()) {
            PojoStd ps = (PojoStd) it.next();
            System.out.println(ps.getName() + " ");
            System.out.println(ps.getCourse() + " ");
            System.out.println(ps.getRoll() + " ");
            System.out.println(ps.getEmail() + " ");
            System.out.println(ps.getCity() + " ");
            System.out.println(ps.getDob() + " ");

        }
        t.commit();
        session.close();*/
        
        java.util.Date utilDate = new Date();
        // Convert it to java.sql.Date
        java.sql.Date date = new java.sql.Date(utilDate.getTime());
        System.err.println("Date = "+date);
    }

}
