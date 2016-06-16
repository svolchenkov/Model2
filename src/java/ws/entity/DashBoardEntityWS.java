/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.entity;

import javax.xml.bind.annotation.XmlRootElement;

import beans.QuestionsBean;
import db.manage.HouseManage;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Sergey
 *?
 */

@XmlRootElement
public class DashBoardEntityWS implements Serializable {
    
    @EJB
    private HouseManage houseManage;
    
    private String first;
    private int second;
    private String caseId;

    public DashBoardEntityWS() {
        
    }

    public void fillDashBoardEntityWS() {
        first = "newFirst";
        second = 1;
    }
    
    public String getCaseId() {
//        caseId = "caseId";
//        caseId = questionsBean.getCaseID();
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }
    
    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

}
