/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import javax.ejb.Stateless;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Criteria;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Projections;


/**
 *
 * @author Sergey
 */
@Stateless
public class DBrequests {
//
//    private final SessionFactory sessionFactory;
//    
//    public DBrequests() {
//        sessionFactory = CreateHibernateSession.getSessionFactory();
//    }
//
//    public int receiveNextAdvisorsID () {
//        int resalt = 0;
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//      try{
//         tx = session.beginTransaction();
//         Criteria cr = session.createCriteria(AdvisorsEntity.class);
//         cr.setProjection(Projections.rowCount());
//         List rowCount = cr.list();
//         resalt = Integer.valueOf(rowCount.get(0).toString());
//         System.out.println("Total Coint: " + rowCount.get(0) );
//         tx.commit();
//      }catch (HibernateException e) {
//         if (tx!=null) tx.rollback();
//         e.printStackTrace(); 
//      }finally {
//         session.close(); 
//      }
//      return resalt;
//    }
    
}
