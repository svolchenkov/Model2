/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Sergey
 */
public class CreateHibernateSession {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    private static SessionFactory configureSessionFactory() {
        
        sessionFactory = new AnnotationConfiguration().
                configure().addAnnotatedClass(db.entity.CustomerEntity.class).
                configure().addAnnotatedClass(db.entity.FinanceEntity.class).
                configure().addAnnotatedClass(db.entity.PropertiesEntity.class).
                configure().addAnnotatedClass(db.entity.MeasureEntity.class).
                buildSessionFactory();

        return sessionFactory;

    }

    public static SessionFactory getSessionFactory() {
        return configureSessionFactory();
    }

}
