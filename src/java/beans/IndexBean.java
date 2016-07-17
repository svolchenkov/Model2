/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import db.entity.CustomerEntity;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Sergey
 */
@Named(value = "index")
@SessionScoped
public class IndexBean implements Serializable {

    @Inject
    QuestionsBean questionsBean;
    @Inject
    FinanceBean financeBean;
    @Inject
    MeasureBean measureBean;
    
    private String findHouseInputText;
    private List<CustomerEntity> customers;
    private CustomerEntity customerEntity;
    
    public IndexBean() {
    }
    
    public String wayToHouseFinance (String caseId) {
        
        /*
        1.IndexBean.wayToHouseFinance
        2.questionsBean.receiveQuestionsHouseByCaseID(caseId)
        3.houseManage.getHouseByCaseID(caseID) here new1 = 0
         */

        measureBean.receiveMeasureByCaseId(caseId);
        questionsBean.receiveQuestionsHouseByCaseID(caseId);
        financeBean.receiveFinanceBeanByCaseID(caseId);
        
        return "housefinance.xhtml";
    }
    
    public String findHouse() {
        if ( getFindHouseInputText().length() != 0 ) {
           customers = questionsBean.findHouseByCaseId( getFindHouseInputText() ); 
        }
        return "index.xhtml";
    }

    public String getFindHouseInputText() {
        return findHouseInputText;
    }

    public void setFindHouseInputText(String findHouseInputText) {
        this.findHouseInputText = findHouseInputText;
    }

    public List<CustomerEntity> getCustomers() {
        return customers;
    }

    public void setCustomers(List<CustomerEntity> customers) {
        this.customers = customers;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }
    
}
