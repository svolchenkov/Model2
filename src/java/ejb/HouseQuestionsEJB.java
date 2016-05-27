/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import db.CreateHibernateSession;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import org.hibernate.SessionFactory;

/**
 *
 * @author Sergey
 */
@Stateless
@LocalBean
public class HouseQuestionsEJB {
    
    private final SessionFactory sessionFactory;

    public HouseQuestionsEJB() {
        sessionFactory = CreateHibernateSession.getSessionFactory();
    }
    
    
    
}
