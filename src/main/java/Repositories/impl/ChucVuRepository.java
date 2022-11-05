
package Repositories.impl;

import DomainModels.ChucVu;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class ChucVuRepository {
    public static void main(String[] args) {
        
        SessionFactory sessionFactory = ConnectionUtil.HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        
        
        List<ChucVu> list = session.createCriteria(ChucVu.class).list();
        
        for (ChucVu chucVu : list) {
            System.out.println(chucVu.toString());
        }
        
//        ChucVu cv = new ChucVu(null, "CV999", "Phuong svip");
//        
//        transaction.begin();
//        session.save(cv);
//        transaction.commit();
//        
        
    }
}
