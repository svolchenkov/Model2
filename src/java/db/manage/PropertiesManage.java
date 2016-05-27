/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.manage;

import db.CreateHibernateSession;
import db.entity.CustomerEntity;
import db.entity.PropertiesEntity;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Sergey
 */
@Stateless
@LocalBean
public class PropertiesManage {

    private final SessionFactory sessionFactory;
    
    public PropertiesManage() {
        sessionFactory = CreateHibernateSession.getSessionFactory();
    }

    public int receiveCaseIdAddition() {
        int result = -1;
        PropertiesEntity propertiesEntity = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            int i = 0;
            String sql = "SELECT * FROM PROPERTIES WHERE ID = 0";
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(PropertiesEntity.class);
//            query.setParameter(0, 0);
            List properties = query.list();
            if ( properties.isEmpty() ) {
                System.err.println("properties have broken: class PropertiesManage ");
            } else {
                propertiesEntity = (PropertiesEntity) properties.get(0);
            }
            result = propertiesEntity.getCaseNumber();
            result++;
            propertiesEntity.setCaseNumber(result);
            session.update(propertiesEntity);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }
    
}
