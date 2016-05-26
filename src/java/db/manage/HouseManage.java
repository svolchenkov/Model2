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

import db.entity.CustomerEntity;
import org.hibernate.HibernateException;
import org.hibernate.cfg.AnnotationConfiguration;

import beans.QuestionsBean;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

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

    public CustomerEntity getHouseByCaseID(int caseID) {
        CustomerEntity customerEntity = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "SELECT * FROM CUSTOMER WHERE CASE_ID = " + caseID;
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(CustomerEntity.class);
            List customers = query.list();
            if ( customers.isEmpty() ) {
                customerEntity = new CustomerEntity();
                customerEntity.setCaseId(0);
                customerEntity.setId(BigDecimal.valueOf(-1));
                customerEntity.setZip(0);
                customerEntity.setSquareFootage(0);
                customerEntity.setYearHome(0);
                customerEntity.setFicoScore(0);
                customerEntity.setNumberOfAppointments(0);
                customerEntity.setMileage(0);
                customerEntity.setFinanceId(0);
                customerEntity.setCaseId(0);
                customerEntity.setFirstName1("Didn't find");
                
            } else {
                customerEntity = (CustomerEntity) customers.get(0);
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return customerEntity;
    }

    public int addOrUpdateHouse(QuestionsBean questionsBean) {
        int result = 1;

        Session session = sessionFactory.openSession();
        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setCaseId(questionsBean.getCaseID());
        customerEntity.setFirstMeeting(questionsBean.getFirstMeeting());
        customerEntity.setFollowUpWithEs(questionsBean.getFollowUpWithES());
        customerEntity.setAdvisorsId(questionsBean.getAdvisor());
        customerEntity.setAmbasadorsId(questionsBean.getAmbassador());
        customerEntity.setFirstName1(questionsBean.getFirstName1());
        customerEntity.setLastName1(questionsBean.getLastName1());
        customerEntity.setEmail1(questionsBean.getEmail1());
        customerEntity.setPhone1(questionsBean.getPhone1());
        customerEntity.setFirstName2(questionsBean.getFirstName2());
        customerEntity.setLastName2(questionsBean.getLastName2());
        customerEntity.setEmail2(questionsBean.getEmail2());
        customerEntity.setPhone2(questionsBean.getPhone2());
        customerEntity.setAddress(questionsBean.getAddress());
        customerEntity.setCity(questionsBean.getCity());
        customerEntity.setZip(questionsBean.getZip());
        customerEntity.setSquareFootage(questionsBean.getSquareFootage());
        customerEntity.setYearHome(questionsBean.getYearHome());
        customerEntity.setEffciencyUpgrades(questionsBean.getEffciencyUpgrades());
        customerEntity.setFicoScore(questionsBean.getFicoScore());
        customerEntity.setStateQualifierIncome75k(questionsBean.getStateQualifierMedianIncome75K());
        customerEntity.setFreePgeWeatherStripping(questionsBean.getFreePGEWeatherStripping());
        customerEntity.setReasonForCareProgram(questionsBean.getReasonForCareProgram().toString());
        customerEntity.setTimeTravelExplained(questionsBean.getTimeTravelExplained());
        customerEntity.setQualifySpeakWithHub(questionsBean.getQualifyToSpeakWithHub());
        customerEntity.setAdditionalNotes(questionsBean.getAdditionalNOTES());
        customerEntity.setDirectorId(questionsBean.getDirector());
        customerEntity.setNumberOfAppointments(questionsBean.getNumberOfAppointments());
        customerEntity.setCustomAddUser(questionsBean.getCustomAddUser());
        customerEntity.setMileage(questionsBean.getMileage());
        customerEntity.setFinanceId(questionsBean.getFinanceID());
        try {
            session.beginTransaction();
            if ( questionsBean.getCustomerID() == -1 ) {
                customerEntity.setId(new BigDecimal(receiveNextCustomerID()));
                session.save(customerEntity);
            } else {
                customerEntity.setId(new BigDecimal(questionsBean.getCustomerID()));
                session.update(customerEntity);
            }
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.err.println("addHouse broken: " + e.getMessage());
        } finally {
            customerEntity = null;
            System.gc();
            session.close();
        }
        return result;
    }

    public int receiveNextCustomerID() {
        int result = 0;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Criteria cr = session.createCriteria(CustomerEntity.class);
            cr.setProjection(Projections.rowCount());
            List rowCount = cr.list();
            result = Integer.valueOf(rowCount.get(0).toString());
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
