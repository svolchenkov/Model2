/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.Calendar;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author Sergey
 */
@Named(value = "showForSteven")
@SessionScoped
public class ShowForSteven implements Serializable {

    @Inject
    Graph graph;        
    
    String step = "0";
    String test = "test2";
    double currentMoPayment = 0;
    double futureMoPayment = 0;
    double wholePayment = 0;
    String today;
    
    
    
    public ShowForSteven() {
    }

    public void setStep(String step) {
        System.out.println("step set = " + getStep());
        this.step = step;
    }
    
    public String getStep() {
        System.out.println("step = " + step);
        return step;
    }

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    public double getCurrentMoPayment() {
        if (!"0".equals(step)) {
            currentMoPayment = graph.getCurrentMonthPayment();
        } else {
            currentMoPayment = 0;
        }
        return currentMoPayment;
    }

    public void setCurrentMoPayment(double currentMoPayment) {
        this.currentMoPayment = currentMoPayment;
    }

    public double getFutureMoPayment() {
        System.out.println("getFutureMoPayment");
        if (!"0".equals(step)) {
            futureMoPayment = graph.getFutureMonthPayment();
        } else {
            futureMoPayment = 0;
        }
        return futureMoPayment;
    }

    public void setFutureMoPayment(double futureMoPayment) {
        this.futureMoPayment = futureMoPayment;
    }

    public double getWholePayment() {
        if (!"0".equals(step)) {
            wholePayment = graph.getTotalFuture();
        } else {
            wholePayment = 0;
        }
        return wholePayment;
    }

    public void setWholePayment(double wholePayment) {
        this.wholePayment = wholePayment;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getToday() {
        String today = "";
        Calendar now = Calendar.getInstance();
        today = String.valueOf(now.get(Calendar.DAY_OF_MONTH) + "/" + now.get(Calendar.MONTH) + "/" + now.get(Calendar.YEAR));
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }
    
}
