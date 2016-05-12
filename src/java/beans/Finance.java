/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sergey
 */
@Named(value = "finance")
@SessionScoped
public class Finance implements Serializable {

    private int state;
    private Map<Integer, String> states;
    
    private String dataReceivedFromSales0String;
    private boolean dataReceivedFromSales0CheckBox;
    private String dataReceivedFromSales0Done;
    
    private String checkingAvailableFinancing1YgreenString;
    private String checkingAvailableFinancing1CalFirstString;
    private String checkingAvailableFinancing1HeroString;
    private boolean checkingAvailableFinancing1CheckBox;
    private String checkingAvailableFinancing1Done;
    
    private String evaluateHP2Button;
    private boolean evaluateHP2CheckBox;
    private String evaluateHP2Done;
    
    /**
     * Creates a new instance of Finance
     */
    public Finance() {
        states = new HashMap<>();
        states.put(0, "Data received from Sales");
        states.put(1, "Checking available financing");
        states.put(2, "Evaluate HP");
        states.put(3, "Receiving draft agreement");
        states.put(4, "Getting DOB, SS#");
        states.put(5, "Signing ERI Ageement");
        states.put(6, "Apply to financing");
        states.put(7, "Financing docs received");
        states.put(8, "Schedule appointment by customer");
        states.put(9, "Signing contract by customer");
        states.put(9, "All docs completed");
        states.put(10, "Notice to proceed");
        states.put(11, "# gave to concierge");
    }
    
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Map<Integer, String> getStates() {
        return states;
    }

    public void setStates(Map<Integer, String> states) {
        this.states = states;
    }
    
    // *********  0.Data received from Sales ************************

    public String getDataReceivedFromSales0String() {
        return dataReceivedFromSales0String;
    }

    public void setDataReceivedFromSales0String(String dataReceivedFromSales0String) {
        this.dataReceivedFromSales0String = dataReceivedFromSales0String;
    }

    public boolean isDataReceivedFromSales0CheckBox() {
        return dataReceivedFromSales0CheckBox;
    }

    public void setDataReceivedFromSales0CheckBox(boolean dataReceivedFromSales0CheckBox) {
        this.dataReceivedFromSales0CheckBox = dataReceivedFromSales0CheckBox;
    }

    public String getDataReceivedFromSales0Done() {
        if ( isDataReceivedFromSales0CheckBox() == true ) {
            dataReceivedFromSales0Done = "done";
        } else {
            dataReceivedFromSales0Done = "";
        }
        return dataReceivedFromSales0Done;
    }

    public void setDataReceivedFromSales0Done(String dataReceivedFromSales0Done) {
        this.dataReceivedFromSales0Done = dataReceivedFromSales0Done;
    }

    //******************** 1.Checking available financing *****************

    public String getCheckingAvailableFinancing1YgreenString() {
        return checkingAvailableFinancing1YgreenString;
    }

    public void setCheckingAvailableFinancing1YgreenString(String checkingAvailableFinancing1YgreenString) {
        this.checkingAvailableFinancing1YgreenString = checkingAvailableFinancing1YgreenString;
    }

    public String getCheckingAvailableFinancing1CalFirstString() {
        return checkingAvailableFinancing1CalFirstString;
    }

    public void setCheckingAvailableFinancing1CalFirstString(String checkingAvailableFinancing1CalFirstString) {
        this.checkingAvailableFinancing1CalFirstString = checkingAvailableFinancing1CalFirstString;
    }

    public String getCheckingAvailableFinancing1HeroString() {
        return checkingAvailableFinancing1HeroString;
    }

    public void setCheckingAvailableFinancing1HeroString(String checkingAvailableFinancing1HeroString) {
        this.checkingAvailableFinancing1HeroString = checkingAvailableFinancing1HeroString;
    }
    
    public boolean isCheckingAvailableFinancing1CheckBox() {
        return checkingAvailableFinancing1CheckBox;
    }

    public void setCheckingAvailableFinancing1CheckBox(boolean checkingAvailableFinancing1CheckBox) {
        this.checkingAvailableFinancing1CheckBox = checkingAvailableFinancing1CheckBox;
    }

    public String getCheckingAvailableFinancing1Done() {
        if ( isCheckingAvailableFinancing1CheckBox() == true ) {
            this.checkingAvailableFinancing1Done = "done";
        } else {
            this.checkingAvailableFinancing1Done = "";
        }
        return checkingAvailableFinancing1Done;
    }

    public void setCheckingAvailableFinancing1Done(String checkingAvailableFinancing1Done) {
        this.checkingAvailableFinancing1Done = checkingAvailableFinancing1Done;
    }
    
    //*********** 2.Evaluate HP ****************************************

    public String receiveWayToMeasures () {
        return "measures";
    }
    
    public String getEvaluateHP2Button() {
        return evaluateHP2Button;
    }

    public void setEvaluateHP2Button(String evaluateHP2Button) {
        this.evaluateHP2Button = evaluateHP2Button;
    }
    
    public boolean isEvaluateHP2CheckBox() {
        return evaluateHP2CheckBox;
    }

    public void setEvaluateHP2CheckBox(boolean evaluateHP2CheckBox) {
        this.evaluateHP2CheckBox = evaluateHP2CheckBox;
    }

    public String getEvaluateHP2Done() {
        return evaluateHP2Done;
    }

    public void setEvaluateHP2Done(String evaluateHP2Done) {
        this.evaluateHP2Done = evaluateHP2Done;
    }
    
    //********************
    
}
