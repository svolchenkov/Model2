/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.manage;

import beans.FinanceBean;
import beans.QuestionsBean;
import db.CreateHibernateSession;
import db.entity.CustomerEntity;
import db.entity.FinanceEntity;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

/**
 *
 * @author Sergey
 */
@Stateless
@LocalBean
public class FinanceManage {

    private final SessionFactory sessionFactory;

    public FinanceManage() {
        sessionFactory = CreateHibernateSession.getSessionFactory();
    }

    public FinanceEntity receiveFinanceByCaseID(String caseID) {
        FinanceEntity financeEntity = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "SELECT * FROM FINANCE WHERE CASE_ID = " + "'" + caseID + "'";
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(FinanceEntity.class);
            List finances = query.list();
            if (finances.isEmpty()) {
                financeEntity = new FinanceEntity();
                financeEntity.setCaseId(caseID);
                financeEntity.setNew1(1);
                financeEntity.setStateCurrent(0);
                financeEntity.setDatareceivedfromsales0string("");
                financeEntity.setDatareceivedfromsales0checkbox(0);
                financeEntity.setDatareceivedfromsales0done("");
                financeEntity.setCheckingavailablefinancing1y("");
                financeEntity.setCheckingavailablefinancing1ca("");
                financeEntity.setCheckingavailablefinancing1he("");
                financeEntity.setCheckingavailablefinancing1che(0);
                financeEntity.setCheckingavailablefinancing1d("");
                financeEntity.setEvaluatehp2button("");
                financeEntity.setEvaluateHP2CheckBox(0);
                financeEntity.setEvaluatehp2done("");
                financeEntity.setReceivingdraftagreement3string("");
                financeEntity.setReceivingdraftagreement3ch(0);
                financeEntity.setReceivingdraftagreement3done("");
                financeEntity.setGatheringdobssn4date(null);
                financeEntity.setGatheringdobssn4string("");
                financeEntity.setGatheringdobssn4che(0);
                financeEntity.setGatheringdobssn4done("");
//        financeEntity.setSigningeriageement5fileupload(financeBean.getSigningERIAgeement5FileUpload());
                financeEntity.setSigningeriageement5string("");
                financeEntity.setSigningeriageement5che(0);
                financeEntity.setSigningeriageement5done("");
                financeEntity.setApplytofinancing6string("");
                financeEntity.setApplytofinancing6checkbox(0);
                financeEntity.setApplytofinancing6done("");
//        financeEntity.setFinancingdocsreceived7fileupl(financeBean.getFinancingDocsReceived7FileUpload());
                financeEntity.setFinancingdocsreceived7string("");
                financeEntity.setFinancingdocsreceived7che(0);
                financeEntity.setFinancingdocsreceived7do("");
                financeEntity.setScheduleappointmentby8d(null);
                financeEntity.setScheduleappointmentby8st("");
                financeEntity.setScheduleappointmentby8che(0);
                financeEntity.setScheduleappointmentby8do("");
//        financeEntity.setSigningcontractbycustomer9fi(financeBean.getSigningContractByCustomer9FileUpload());
                financeEntity.setSigningcontractbycustomer9st("");
                financeEntity.setSigningcontractbycustomer9che(0);
                financeEntity.setSigningcontractbycustomer9done("");
                financeEntity.setAlldocscompleted10string("");
                financeEntity.setAlldocscompleted10checkbox(0);
                financeEntity.setAlldocscompleted10do("");
                financeEntity.setNoticetoproceed11string("");
                financeEntity.setNoticetoproceed11checkbox(0);
                financeEntity.setNoticetoproceed11done("");
                financeEntity.setGivenforconcierge12string("");
                financeEntity.setGivenforconcierge12checkbox(0);
                financeEntity.setGivenforconcierge12done("");
                financeEntity.setGivenforconcierge12checkbox(0);
                financeEntity.setGivenforconcierge12done("");
                financeEntity.setCustomerId(0);
            } else {
                financeEntity = (FinanceEntity) finances.get(0);
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
        return financeEntity;
    }

    private FinanceEntity fillFields(FinanceBean financeBean) {
        FinanceEntity financeEntity = receiveFinanceByCaseID(financeBean.getCaseID());

        financeEntity.setStateCurrent(0);
        financeEntity.setDatareceivedfromsales0string(financeBean.getDataReceivedFromSales0String());
        financeEntity.setDatareceivedfromsales0checkbox(financeBean.isDataReceivedFromSales0CheckBox() ? 1 : 0);
        financeEntity.setDatareceivedfromsales0done(financeBean.getDataReceivedFromSales0Done());
        financeEntity.setCheckingavailablefinancing1y(financeBean.getCheckingAvailableFinancing1YgreenString());
        financeEntity.setCheckingavailablefinancing1ca(financeBean.getCheckingAvailableFinancing1CalFirstString());
        financeEntity.setCheckingavailablefinancing1he(financeBean.getCheckingAvailableFinancing1HeroString());
        financeEntity.setCheckingavailablefinancing1che(financeBean.isCheckingAvailableFinancing1CheckBox() ? 1 : 0);
        financeEntity.setCheckingavailablefinancing1d(financeBean.getCheckingAvailableFinancing1Done());
        financeEntity.setEvaluatehp2button(financeBean.getEvaluateHP2Button());

        financeEntity.setEvaluateHP2CheckBox(financeBean.isEvaluateHP2CheckBox() == true ? 1 : 0);
        financeEntity.setEvaluatehp2done(financeBean.getEvaluateHP2Done());

        financeEntity.setReceivingdraftagreement3string(financeBean.getReceivingDraftAgreement3String());
        financeEntity.setReceivingdraftagreement3ch(financeBean.isReceivingDraftAgreement3CheckBox() ? 1 : 0);
        financeEntity.setReceivingdraftagreement3done(financeBean.getReceivingDraftAgreement3Done());
        financeEntity.setGatheringdobssn4date(financeBean.getGatheringDOBSSN4Date());
        financeEntity.setGatheringdobssn4string(financeBean.getGatheringDOBSSN4String());
        financeEntity.setGatheringdobssn4che(financeBean.isGatheringDOBSSN4CheckBox() ? 1 : 0);
        financeEntity.setGatheringdobssn4done(financeBean.getGatheringDOBSSN4Done());

//        financeEntity.setSigningeriageement5fileupload(financeBean.getSigningERIAgeement5FileUpload());
        financeEntity.setSigningeriageement5string(financeBean.getSigningERIAgeement5String());
        financeEntity.setSigningeriageement5che(financeBean.isSigningERIAgeement5CheckBox() ? 1 : 0);
        financeEntity.setSigningeriageement5done(financeBean.getSigningERIAgeement5Done());
        financeEntity.setApplytofinancing6string(financeBean.getApplyToFinancing6String());
        financeEntity.setApplytofinancing6checkbox(financeBean.isApplyToFinancing6CheckBox() ? 1 : 0);
        financeEntity.setApplytofinancing6done(financeBean.getAllDocsCompleted10Done());
//        financeEntity.setFinancingdocsreceived7fileupl(financeBean.getFinancingDocsReceived7FileUpload());
        financeEntity.setFinancingdocsreceived7string(financeBean.getFinancingDocsReceived7String());
        financeEntity.setFinancingdocsreceived7che(financeBean.isFinancingDocsReceived7CheckBox() ? 1 : 0);
        financeEntity.setFinancingdocsreceived7do(financeBean.getFinancingDocsReceived7Done());
        financeEntity.setScheduleappointmentby8d(financeBean.getScheduleAppointmentByCustomer8Date());
        financeEntity.setScheduleappointmentby8st(financeBean.getFinancingDocsReceived7String());
        financeEntity.setScheduleappointmentby8che(financeBean.isScheduleAppointmentByCustomer8CheckBox() ? 1 : 0);
        financeEntity.setScheduleappointmentby8do(financeBean.getScheduleAppointmentByCustomer8Done());
//        financeEntity.setSigningcontractbycustomer9fi(financeBean.getSigningContractByCustomer9FileUpload());
        financeEntity.setSigningcontractbycustomer9st(financeBean.getSigningContractByCustomer9String());
        financeEntity.setSigningcontractbycustomer9che(financeBean.isSigningContractByCustomer9CheckBox() ? 1 : 0);
        financeEntity.setSigningcontractbycustomer9done(financeBean.getSigningContractByCustomer9Done());
        financeEntity.setAlldocscompleted10string(financeBean.getAllDocsCompleted10String());
        financeEntity.setAlldocscompleted10checkbox(financeBean.isAllDocsCompleted10CheckBox() ? 1 : 0);
        financeEntity.setAlldocscompleted10do(financeBean.getAllDocsCompleted10Done());
        financeEntity.setNoticetoproceed11string(financeBean.getNoticeToProceed11String());
        financeEntity.setNoticetoproceed11checkbox(financeBean.isNoticeToProceed11CheckBox() ? 1 : 0);
        financeEntity.setNoticetoproceed11done(financeBean.getNoticeToProceed11Done());
        financeEntity.setGivenforconcierge12string(financeBean.getGiveNForConcierge12String());
        financeEntity.setGivenforconcierge12checkbox(financeBean.isGiveNForConcierge12CheckBox() ? 1 : 0);
        financeEntity.setGivenforconcierge12done(financeBean.getGiveNForConcierge12Done());
        financeEntity.setGivenforconcierge12checkbox(financeBean.isGiveNForConcierge12CheckBox() ? 1 : 0);
        financeEntity.setGivenforconcierge12done(financeBean.getGiveNForConcierge12Done());
        financeEntity.setCustomerId(financeBean.getCustomerID());
        financeEntity.setCaseId(financeBean.getCaseID());

        return financeEntity;

    }

    public int addOrUpdateFinance(FinanceBean financeBean) {
        int result = 1;
        Session session = sessionFactory.openSession();
        FinanceEntity financeEntity = fillFields(financeBean);
        try {
            session.beginTransaction();
            if (financeEntity.getNew1() == 1) {
                financeEntity.setNew1(0);
                session.save(financeEntity);
            } else {
                session.update(financeEntity);
            }
            session.getTransaction().commit();
            result = 0;
        } catch (HibernateException e) {
            System.err.println("addFinance broken: " + e.getMessage());
        } finally {
            financeEntity = null;
            System.gc();
            session.close();
        }
        return result;
    }

}
