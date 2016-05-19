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
import javax.faces.context.FacesContext;

/**
 *
 * @author Sergey
 */
@Named(value = "dashBoard")
@SessionScoped
public class DashBoard implements Serializable {
    
    MeasureBean measureBean;
    
    private int customerID;
    
    private double wholeCost;
    private double marginPercentage;
    private double grossHPCost;
    private double netHPCost;
    private double solarCost;
    private double combinedGrossCost;
    private double toalRabateAmount;
    private double financedTotal;
    
    private double pgErebateAmount;
    private double smUDRabateAmount;
    private double costPerKW;
    private double dcKW;
            
    /**
     * Creates a new instance of DashBoard
     */
    public DashBoard() {
    }
    
    // ----------- common ---------------------------------

    public MeasureBean getMeasureBean() {
        MeasureBean measureBean = (MeasureBean) FacesContext.getCurrentInstance().
		getExternalContext().getSessionMap().get("measureBean");
        System.out.println("measureBean = " + measureBean.toString());
        return measureBean;
    }

    public void setMeasureBean(MeasureBean measureBean) {
        this.measureBean = measureBean;
    }
    
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    
    public String wayToHouseFinance () {
        return "housefinance";
    }
    
    // ----------- solar bar ------------------------------

    public double getCostPerKW() {
        return costPerKW;
    }

    public void setCostPerKW(double costPerKW) {
        if ( getMeasureBean() != null ) {
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
    
    // ----------- cost -----------------------------------

    
    public double getWholeCost() {
        System.out.println("getWholeCost");
        if ( getMeasureBean() == null ) {
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

    public double getMarginPercentage() {
        return marginPercentage;
    }

    public void setMarginPercentage(double marginPercentage) {
        this.marginPercentage = marginPercentage / 100;
    }

    public double getGrossHPCost() {
        return grossHPCost;
    }

    public void setGrossHPCost(double grossHPCost) {
        this.grossHPCost = grossHPCost;
    }

    public double getNetHPCost() {
        return netHPCost;
    }

    public void setNetHPCost(double netHPCost) {
        this.netHPCost = netHPCost;
    }

    public double getSolarCost() {
        return solarCost;
    }

    public void setSolarCost(double solarCost) {
        this.solarCost = solarCost;
    }

    public double getCombinedGrossCost() {
        return combinedGrossCost;
    }

    public void setCombinedGrossCost(double combinedGrossCost) {
        this.combinedGrossCost = combinedGrossCost;
    }

    public double getToalRabateAmount() {
        return toalRabateAmount;
    }

    public void setToalRabateAmount(double toalRabateAmount) {
        this.toalRabateAmount = toalRabateAmount;
    }

    public double getFinancedTotal() {
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
