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
    
    /**
     * Creates a new instance of Finance
     */
    public Finance() {
        states = new HashMap<>();
        states.put(0, "Data received from Sales");
        states.put(1, "Check finacing");
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
        System.out.println( "setDataReceivedFromSales0CheckBox " + dataReceivedFromSales0CheckBox );
        this.dataReceivedFromSales0CheckBox = dataReceivedFromSales0CheckBox;
    }

    public String getDataReceivedFromSales0Done() {
        System.out.println("getDataReceivedFromSales0Done" + isDataReceivedFromSales0CheckBox() );
        return dataReceivedFromSales0Done;
    }

    public void setDataReceivedFromSales0Done(String dataReceivedFromSales0Done) {
        this.dataReceivedFromSales0Done = dataReceivedFromSales0Done;
    }
    
    
    
}
