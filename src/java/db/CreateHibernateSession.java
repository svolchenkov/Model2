/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.File;
import java.util.Date;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Sergey
 */
public class CreateHibernateSession {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    private static SessionFactory configureSessionFactory() {

//        Configuration config = new Configuration();
////        config.addClass(db.enttity.CustomerEntity.class);
//        config.configure();
//        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
//        sessionFactory = config.buildSessionFactory(serviceRegistry);

//        Configuration configuration = new Configuration().addClass(db.enttity.CustomerEntity.class);

        sessionFactory = new AnnotationConfiguration().
                configure().
                addAnnotatedClass(db.entity.CustomerEntity.class).
                addAnnotatedClass(db.entity.FinanceEntity.class).
                buildSessionFactory();

        return sessionFactory;

    }

    public static SessionFactory getSessionFactory() {
        return configureSessionFactory();
    }

}
