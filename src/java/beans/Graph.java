/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

import beans.*;
import javax.inject.Inject;

/**
 *
 * @author Sergey
 */
@Named(value = "graph")
@SessionScoped
public class Graph implements Serializable {
    
    @Inject
    FinanceBean financeBean;
    @Inject
    QuestionsBean questionsBean;
    @Inject
    MeasureBean measureBean;
    @Inject
    DashBoardBean dashBoardBean;

    private int annualKW = 0;
    private String utilityDistrict = "";
    private boolean enableHouseGas = false;
    private int gasCostPerMonth = 0;
    private boolean enabledSolar = false;
    private boolean enabledHPP = false;
    private boolean introduceVehicle = false;
    private int vehicleMileage = 0;
    private int milesTraveled = 0;
    private int gasCost = 0;
    
    private int electricHPP = 0;
    private int gasHPP = 0;
    private int years = 0;
    private double interest = 0;
    
    private int recomendCustomPanels = 0;
    private int recommendedCustomSize = 0;
    private int numberOfCustomPanels = 0;
    private double systemSizeInKw = 0;
    private double costOfSolar = 0;
    private int anySolarAdders = 0;
    private double grossHP = 0;
    private int utilityRebates = 0;
    
    private double grossSolar = 0;
    private double taxCredit30 = 0;
    private double taxWriteOff33 = 0;
    private double grossProjectCost = 0;
    private double netProjectCost = 0;
    private double hpMoPayment = 0;
    private double solarMoPayment = 0;
    private double totMonthlyPayment = 0;
    private double costPerKW = 0;
    
    private int recommendedFullSize = 0;
    private int customSSystemSize = 0;
    
    public Graph() {
    }

    public FinanceBean getFinanceBean() {
        return financeBean;
    }

    public void setFinanceBean(FinanceBean financeBean) {
        this.financeBean = financeBean;
    }

    public QuestionsBean getQuestionsBean() {
        return questionsBean;
    }

    public void setQuestionsBean(QuestionsBean questionsBean) {
        this.questionsBean = questionsBean;
    }

    public MeasureBean getMeasureBean() {
        return measureBean;
    }

    public void setMeasureBean(MeasureBean measureBean) {
        this.measureBean = measureBean;
    }

    public int getAnnualKW() {
        return annualKW;
    }

    public void setAnnualKW(int annualKW) {
        this.annualKW = annualKW;
    }

    public String getUtilityDistrict() {
        return utilityDistrict;
    }

    public void setUtilityDistrict(String utilityDistrict) {
        this.utilityDistrict = utilityDistrict;
    }

    public boolean isEnableHouseGas() {
        return enableHouseGas;
    }

    public void setEnableHouseGas(boolean enableHouseGas) {
        this.enableHouseGas = enableHouseGas;
    }
    
    public int getGasCostPerMonth() {
        return gasCostPerMonth;
    }

    public void setGasCostPerMonth(int gasCostPerMonth) {
        this.gasCostPerMonth = gasCostPerMonth;
    }

    public boolean isEnabledSolar() {
        return enabledSolar;
    }

    public void setEnabledSolar(boolean enabledSolar) {
        this.enabledSolar = enabledSolar;
    }

    public boolean isEnabledHPP() {
        return enabledHPP;
    }

    public void setEnabledHPP(boolean enabledHPP) {
        this.enabledHPP = enabledHPP;
    }

    public boolean isIntroduceVehicle() {
        return introduceVehicle;
    }

    public void setIntroduceVehicle(boolean introduceVehicle) {
        this.introduceVehicle = introduceVehicle;
    }
    
    public int getVehicleMileage() {
        return vehicleMileage;
    }

    public void setVehicleMileage(int vehicleMileage) {
        this.vehicleMileage = vehicleMileage;
    }

    public int getMilesTraveled() {
        return milesTraveled;
    }

    public void setMilesTraveled(int milesTraveled) {
        this.milesTraveled = milesTraveled;
    }

    public int getGasCost() {
        return gasCost;
    }

    public void setGasCost(int gasCost) {
        this.gasCost = gasCost;
    }

    public int getElectricHPP() {
        return electricHPP;
    }

    public void setElectricHPP(int electricHPP) {
        this.electricHPP = electricHPP;
    }

    public int getGasHPP() {
        return gasHPP;
    }

    public void setGasHPP(int gasHPP) {
        this.gasHPP = gasHPP;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getRecommendedCustomSize() {
        return recommendedCustomSize;
    }

    public void setRecommendedCustomSize(int recommendedCustomSize) {
        this.recommendedCustomSize = recommendedCustomSize;
    }

    public int getNumberOfCustomPanels() {
        return numberOfCustomPanels;
    }

    public int getRecomendCustomPanels() {
        return recomendCustomPanels;
    }

    public void setRecomendCustomPanels(int recomendCustomPanels) {
        this.recomendCustomPanels = recomendCustomPanels;
    }

    public void setNumberOfCustomPanels(int numberOfCustomPanels) {
        this.numberOfCustomPanels = numberOfCustomPanels;
    }

    public double getSystemSizeInKw() {
        double k = Math.round(getNumberOfCustomPanels() * 27.1);
        this.systemSizeInKw = k / 100;
        return systemSizeInKw;
    }

    public void setSystemSizeInKw(double systemSizeInKw) {
        this.systemSizeInKw = systemSizeInKw;
    }

    public double getCostOfSolar() {
        double k = Math.round(measureBean.getNumber93CostPerKWInt() * this.getSystemSizeInKw() * 100);
        this.costOfSolar = k / 100;
        return costOfSolar;
    }

    public void setCostOfSolar(double costOfSolar) {
        this.costOfSolar = costOfSolar;
    }

    public int getAnySolarAdders() {
        return anySolarAdders;
    }

    public void setAnySolarAdders(int anySolarAdders) {
        this.anySolarAdders = anySolarAdders;
    }

    public double getGrossHP() {
        if ( isEnabledHPP() == true ) {
            grossHP = dashBoardBean.getGrossHPCost();
        } else {
            grossHP = 0;
        }
        return grossHP;
    }

    public void setGrossHP(double grossHP) {
        this.grossHP = grossHP;
    }

    public int getUtilityRebates() {
        return utilityRebates;
    }

    public void setUtilityRebates(int utilityRebates) {
        this.utilityRebates = utilityRebates;
    }

    public double getGrossSolar() {
        if ( isEnabledSolar() == true ) {
            grossSolar = getCostOfSolar() + getAnySolarAdders();
        } else {
            grossSolar = 0;
        }
        return grossSolar;
    }

    public void setGrossSolar(double grossSolar) {
        this.grossSolar = grossSolar;
    }

    public double getTaxCredit30() {
        if ( isEnabledSolar() == true ) {
            taxCredit30 = getGrossSolar() * 0.3 + 500;
        } else {
            taxCredit30 = 0;
        }
        return taxCredit30;
    }

    public void setTaxCredit30(double taxCredit30) {
        this.taxCredit30 = taxCredit30;
    }

    public double getTaxWriteOff33() {
        double k = Math.round(this.getGrossProjectCost() * 33);
        this.taxWriteOff33 = k / 100;
        return taxWriteOff33;
    }

    public void setTaxWriteOff33(double taxWriteOff33) {
        this.taxWriteOff33 = taxWriteOff33;
    }

    public double getGrossProjectCost() {
        double k = Math.round((getGrossSolar() + getGrossHP()) * 100);
        this.grossProjectCost = k / 100;
        return grossProjectCost;
    }

    public void setGrossProjectCost(double grossProjectCost) {
        this.grossProjectCost = grossProjectCost;
    }

    public double getNetProjectCost() {
        double k = Math.round((getGrossProjectCost() - getUtilityRebates()) * 100);
        this.netProjectCost = k / 100;
        return netProjectCost;
    }

    public void setNetProjectCost(double netProjectCost) {
        this.netProjectCost = netProjectCost;
    }

    public double getHpMoPayment() {
        double k = 0.0;
        hpMoPayment = getGrossHP() - getUtilityRebates();
        k = getInterest() * 1.0;
        System.out.println("getInterest() = " + getInterest());
        k = k / 100;
        System.out.println("k = " + k);
        for ( int index = 0; index <= getYears(); index++ ) {
            hpMoPayment *= (1 + k);
        }
        if ( getYears() != 0 ) {
            hpMoPayment /= (12 * getYears());
        } else {
            hpMoPayment = 0;
        }
        k = Math.round(hpMoPayment * 100) ;
        this.hpMoPayment = k / 100;
        return hpMoPayment;
    }

    public void setHpMoPayment(double hpMoPayment) {
        this.hpMoPayment = hpMoPayment;
    }
    
    public double getSolarMoPayment() {
        double k = 0.0;
        solarMoPayment = getGrossSolar();
        k = getInterest() * 1.0;
        System.out.println("getInterest() = " + getInterest());
        k = k / 100;
        System.out.println("k = " + k);
        for ( int index = 0; index <= getYears(); index++ ) {
            solarMoPayment *= (1 + k);
        }
        if ( getYears() != 0 ) {
            solarMoPayment /= (12 * getYears());
        } else {
            solarMoPayment = 0;
        }
        k = Math.round(solarMoPayment * 100) ;
        this.solarMoPayment = k / 100;
        return solarMoPayment;
    }

    public void setSolarMoPayment(double solarMoPayment) {
        this.solarMoPayment = solarMoPayment;
    }

    public double getTotMonthlyPayment() {
        totMonthlyPayment = getHpMoPayment() + getSolarMoPayment();
        double k = Math.round(totMonthlyPayment * 100);
        totMonthlyPayment = k / 100;
        return totMonthlyPayment;
    }

    public void setTotMonthlyPayment(double totMonthlyPayment) {
        this.totMonthlyPayment = totMonthlyPayment;
    }

    public double getCostPerKW() {
        return costPerKW;
    }

    public void setCostPerKW(double costPerKW) {
        this.costPerKW = costPerKW;
    }

    public int getRecommendedFullSize() {
        return recommendedFullSize;
    }

    public void setRecommendedFullSize(int recommendedFullSize) {
        this.recommendedFullSize = recommendedFullSize;
    }

    public int getCustomSSystemSize() {
        return customSSystemSize;
    }

    public void setCustomSSystemSize(int customSSystemSize) {
        this.customSSystemSize = customSSystemSize;
    }
    
}
