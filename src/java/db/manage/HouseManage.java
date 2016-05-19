/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.manage;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import db.CreateHibernateSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import db.enttity.CustomerEntity;
import org.hibernate.HibernateException;

/**
 *
 * @author Sergey
 */
@Stateless
@LocalBean
public class HouseManage {

    private final SessionFactory sessionFactory;

    public HouseManage() {
        sessionFactory = CreateHibernateSession.getSessionFactory();
    }

    public int addHouse() {
        int result = 1;
        Session session = sessionFactory.openSession();
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setId(0);
        customerEntity.setFirstName1("firstName1");
        try {
            session.beginTransaction();
            session.save(customerEntity);
            session.getTransaction().commit();
        } catch ( HibernateException e )  {
            System.err.println("addHouse broken" + e.getMessage());
        } finally {
            customerEntity = null;
            session.close();
        }

        return result;
    }

}
