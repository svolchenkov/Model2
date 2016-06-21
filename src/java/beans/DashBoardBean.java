/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Inject;
import ejb.DashBoardEJB;
import java.util.Map;

/**
 *
 * @author Sergey
 */
@Named(value = "dashBoardBean")
@SessionScoped
public class DashBoardBean implements Serializable {

    @Inject
    MeasureBean measureBean;
    @Inject
    QuestionsBean questionsBean;
    @EJB
    DashBoardEJB dashBoardEJB;
    @Inject
    Graph graph;

    private String caseID;

    private double wholeCost;
    private int marginPercentage;
    private double grossHPCost;
    private double netHPCost;
    private double solarCost;
    private double combinedGrossCost;
    private int toalRabateAmount;
    private double financedTotal;

    private double pgErebateAmount;
    private double smUDRabateAmount;
    private double costPerKW;
    private double dcKW;
    
    private String listForShow = "";

    /**
     * Creates a new instance of DashBoard
     */
    public DashBoardBean() {
    }

    // ----------- common ---------------------------------
    public MeasureBean getMeasureBean() {
        return measureBean;
    }

    public void setMeasureBean(MeasureBean measureBean) {
        this.measureBean = measureBean;
    }

    public String getCaseID() {
        caseID = questionsBean.getCaseID();
        System.out.println("caseID: " + caseID);
        return caseID;
    }

    public void setCaseID(String caseID) {
        this.caseID = caseID;
    }

    public String wayToHouseFinance() {
        return "housefinance";
    }

    // ----------- solar bar ------------------------------
    public double getCostPerKW() {
        return costPerKW;
    }

    public void setCostPerKW(double costPerKW) {
        if (getMeasureBean() != null) {
            this.costPerKW = getMeasureBean().getNumber93CostPerKWInt();
        } else {
            this.costPerKW = 0;
        }

        this.costPerKW = costPerKW;
    }

    public double getDcKW() {
        return dcKW;
    }

    public void setDcKW(double dcKW) {
        this.dcKW = dcKW;
    }

//    dBsave.getMeasureBean().setNumber93DCKWsInt((int) dCKWs);
    
    //------------------measures--------------------------

    public String getListForShow() {
        Map<String, Double> measureMap = dashBoardEJB.createResult(measureBean);
        StringBuilder measureStrBuilder = new StringBuilder();
        for (String str : measureMap.keySet()) {
             measureStrBuilder.append(str).append("\\n");
        }
        listForShow = measureStrBuilder.toString();
        System.out.println("" + listForShow);
        return listForShow;
    }

    public void setListForShow(String listForShow) {
        this.listForShow = listForShow;
    }
    
    // ----------- cost -----------------------------------
    public double getWholeCost() {
        if (getMeasureBean() == null) {
            this.wholeCost = 0;
        } else {
            this.wholeCost = getMeasureBean().getTotal();
        }
        this.wholeCost = getMeasureBean().getTotal();
        return wholeCost;
    }

    public void setWholeCost(double wholeCost) {
        this.wholeCost = wholeCost;
    }

    public int getMarginPercentage() {
        marginPercentage = measureBean.getMarginPercentage();
        return marginPercentage;
    }

    public void setMarginPercentage(int marginPercentage) {
        this.marginPercentage = marginPercentage;
        measureBean.setMarginPercentage(this.marginPercentage);
    }

    public double getGrossHPCost() {
        if (getMarginPercentage() == 0) {
            grossHPCost = 0;
        } else {
            double k = 10000 * getWholeCost() / getMarginPercentage();
            int j = (int) Math.round(k);
            grossHPCost = j * 1.0 / 100;
        }
        return grossHPCost;
    }

    public void setGrossHPCost(double grossHPCost) {
        this.grossHPCost = grossHPCost;
    }

    public double getNetHPCost() {
        netHPCost = getGrossHPCost() - getToalRabateAmount();
        return netHPCost;
    }

    public void setNetHPCost(double netHPCost) {
        this.netHPCost = netHPCost;
    }

    public double getSolarCost() {
        solarCost = graph.getCostOfSolar();
        return solarCost;
    }

    public void setSolarCost(double solarCost) {
        this.solarCost = solarCost;
    }

    public double getCombinedGrossCost() {
        combinedGrossCost = getSolarCost() + getGrossHPCost();
        return combinedGrossCost;
    }

    public void setCombinedGrossCost(double combinedGrossCost) {
        this.combinedGrossCost = combinedGrossCost;
    }

    public int getToalRabateAmount() {
        toalRabateAmount = Math.round(measureBean.getPgeRebateAmount() + measureBean.getSmudRebateAmount());
        return toalRabateAmount;
    }

    public void setToalRabateAmount(int toalRabateAmount) {
        this.toalRabateAmount = toalRabateAmount;
    }

    public double getFinancedTotal() {
        financedTotal = getCombinedGrossCost() - getToalRabateAmount();
        return financedTotal;
    }

    public void setFinancedTotal(double financedTotal) {
        this.financedTotal = financedTotal;
    }

    public double getPgErebateAmount() {
        return pgErebateAmount;
    }

    public void setPgErebateAmount(double pgErebateAmount) {
        this.pgErebateAmount = pgErebateAmount;
    }

    public double getSmUDRabateAmount() {
        return smUDRabateAmount;
    }

    public void setSmUDRabateAmount(double smUDRabateAmount) {
        this.smUDRabateAmount = smUDRabateAmount;
    }

    // ----------- finance --------------------------------
    // ----------- diagram --------------------------------
}
