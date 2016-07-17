/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.DataUtilityDistrict;
import entity.UtilityDistrict;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.BarChartSeries;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author Sergey
 */
@Named(value = "showForSteven")
@SessionScoped
public class ShowForSteven implements Serializable {

    @Inject
    Graph graph;
    Map<Integer, Double> lineMap;
    @Inject
    DashBoardBean dashBoardBean;
    double wholePaimentIn20Years;

    String step = "0";
    String test = "test2";
    double currentMoPayment = 0;
    double futureMoPayment = 0;
    double wholePayment = 0;
    String today;
    double costOnCheck = 0;
    String payToTheOnCheck = "Ygreen";
    String memo = "";
    private CartesianChartModel combinedModel;

    public ShowForSteven() {
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getStep() {
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
        if ("2".equals(this.getStep()) || "3".equals(this.getStep())) {
            Calendar now = Calendar.getInstance();
            today = String.valueOf(now.get(Calendar.DAY_OF_MONTH) + "/" + now.get(Calendar.MONTH) + "/" + now.get(Calendar.YEAR));
        }
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public double getCostOnCheck() {
        if ("2".equals(this.getStep()) || "3".equals(this.getStep())) {
            costOnCheck = graph.getTotMonthlyPayment() * 12 * graph.getYears();
        } else {
            costOnCheck = 0;
        }
        return costOnCheck;
    }

    public void setCostOnCheck(double costOnCheck) {
        this.costOnCheck = costOnCheck;
    }

    public String getPayToTheOnCheck() {
        if ("2".equals(this.getStep()) || "3".equals(this.getStep())) {
            payToTheOnCheck = "Ygreen";
        } else {
            payToTheOnCheck = "";
        }
        return payToTheOnCheck;
    }

    public void setPayToTheOnCheck(String payToTheOnCheck) {
        this.payToTheOnCheck = payToTheOnCheck;
    }

    public String getMemo() {
        if ("2".equals(this.getStep()) || "3".equals(this.getStep())) {
            memo = graph.getYears() + " years payment plan";
        } else {
            memo = "";
        }
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    //************ graph ******************************
    public CartesianChartModel getCombinedModel() {
        createCombinedModel();
        return combinedModel;
    }

    private void createCombinedModel() {

        //years
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int lastYear = currentYear + graph.getTimeTravel() + 1;

        //monthly paiments
        double delta = (graph.getFutureMonthPayment() - graph.getCurrentMonthPayment()) / graph.getTimeTravel();

        //filling empty series
        combinedModel = new BarChartModel();
        LineChartSeries emptySeries = new LineChartSeries();
        emptySeries.setLabel(" ");
        int i = currentYear;
        do {
            emptySeries.set(i, 0);
            i++;
        } while (i < lastYear + 5);

        //filling map line
        LineChartSeries asIs = new LineChartSeries();
        asIs.setLabel("current situation");

        double tempa = graph.getCurrentMonthPayment();
        double tempb;
        i = currentYear;
        do {
            asIs.set(i, tempa);
            tempb = Math.round((tempa += delta) * 100);
            tempa = tempb / 100;
            i++;
        } while (i < lastYear + 5);

        //filling mo payment after project
//        combinedModel = new BarChartModel();
        LineChartSeries futMoPaiment = new LineChartSeries();
        futMoPaiment.setLabel("mo payment after realised project");
        delta = (graph.getMoPaimentAfterImproveFuture() - graph.getCurrentMonthPaymentAfterImprove()) / graph.getTimeTravel();
        i = currentYear;
        do {
            if (graph.getFrontLoadTaxBenefit() == 0) {
                tempa = graph.getHpMoPayment() + graph.getSolarMoPayment() + graph.getCurrentMonthPaymentAfterImprove();
                if (graph.isAccountForTaxWrite() == true) {
                    tempa = graph.getHpMoPayment() * 0.67 + graph.getSolarMoPayment() * 0.67 + graph.getCurrentMonthPaymentAfterImprove();
                }
                if (i < lastYear) {
                    futMoPaiment.set(i, tempa);
                } else {
                    futMoPaiment.set(i, graph.getCurrentMonthPaymentAfterImprove());
                }
            }
            if (graph.getFrontLoadTaxBenefit() == 1) {
                tempa = graph.getHpMoPayment() + graph.getSolarMoPaymentAfterFrontLoad() + graph.getCurrentMonthPaymentAfterImprove();
                double k = Math.round(tempa * 100);
                tempa = k / 100;
                System.out.println("graph.isAccountForTaxWrite() == true = " + graph.isAccountForTaxWrite());
                if (graph.isAccountForTaxWrite() == true) {
                    tempa = graph.getHpMoPayment() * 0.67 + graph.getSolarMoPaymentAfterFrontLoad() * 0.67 + graph.getCurrentMonthPaymentAfterImprove();
                }
                if (i < lastYear) {
                    futMoPaiment.set(i, tempa);
                } else {
                    futMoPaiment.set(i, graph.getCurrentMonthPaymentAfterImprove());
                }
            }
            if (graph.getFrontLoadTaxBenefit() == 2) {
                tempa = graph.getHpMoPayment() + graph.getSolarMoPayment() + graph.getCurrentMonthPaymentAfterImprove();
                if (graph.isAccountForTaxWrite() == true) {
                    tempa = graph.getHpMoPayment() * 0.67 + graph.getSolarMoPayment() * 0.67 + graph.getCurrentMonthPaymentAfterImprove();
                }
                if (i < currentYear + graph.getTimeTravel() * 0.3) {
                    futMoPaiment.set(i, graph.getCurrentMonthPaymentAfterImprove());
                }
                if (i >= currentYear + graph.getTimeTravel() * 0.3 && i < lastYear) {
                    futMoPaiment.set(i, tempa);
                }
                if (i >= lastYear) {
                    futMoPaiment.set(i, graph.getCurrentMonthPaymentAfterImprove());
                }
            }
            i++;
        } while (i < lastYear + 5);
        //filling bar map
        BarChartSeries tobe = new BarChartSeries();
        tobe.setLabel("mo payment for improvement");
        i = currentYear;

        do {
            if (graph.getFrontLoadTaxBenefit() == 0) {
                tempa = graph.getTotMonthlyPayment();
                if (graph.isAccountForTaxWrite() == true) {
                    tempa *= 0.67;
                }
                if (i < lastYear) {
                    tobe.set(i, tempa);
                } else {
                    tobe.set(i, 0);
                }
            }
            if (graph.getFrontLoadTaxBenefit() == 1) {
                tempa = graph.getHpMoPayment() + graph.getSolarMoPaymentAfterFrontLoad();
                double k = Math.round(tempa * 100);
                tempa = k / 100;
                if (graph.isAccountForTaxWrite() == true) {
                    tempa *= 0.67;
                }
                if (i < lastYear) {
                    tobe.set(i, tempa);
                } else {
                    tobe.set(i, 0);
                }
            }
            if (graph.getFrontLoadTaxBenefit() == 2) {
                tempa = graph.getTotMonthlyPayment();
                if (graph.isAccountForTaxWrite() == true) {
                    tempa *= 0.67;
                }
                if (i < currentYear + graph.getTimeTravel() * 0.3) {
                    tobe.set(i, 0);
                }
                if (i >= currentYear + graph.getTimeTravel() * 0.3 && i < lastYear) {
                    tobe.set(i, tempa);
                }
                if (i >= lastYear) {
                    tobe.set(i, 0);
                }
            }
            i++;
        } while (i < lastYear + 5);

//        switch ( getStep() ) {
//            case "0": {
//                System.out.println(" getStep() = " + getStep());
//                System.out.println("case 0");
//                break;
//            }
//            case "1": {
//                System.out.println(" getStep() = " + getStep());
//                System.out.println("case 1");
//                combinedModel.addSeries(asIs);
//                break;
//            }
//            case "2": {
//                
//                break;
//            }
//            case "3": {
//                
//                break;
//            }
//                
//        }
        if (getStep().equals("0")) {
            combinedModel.addSeries(emptySeries);
        }
        if (getStep().equals("1")) {
            combinedModel.addSeries(asIs);
        }
        if (getStep().equals("2")) {
            combinedModel.addSeries(tobe);
            combinedModel.addSeries(futMoPaiment);
        }
        if (getStep().equals("3")) {
            combinedModel.addSeries(futMoPaiment);
        }

//        combinedModel.addSeries(tobe);
////        this line is showing current situation
//        combinedModel.addSeries(asIs);
//        combinedModel.addSeries(futMoPaiment);
        combinedModel.setTitle("Graph");
        combinedModel.setLegendPosition("ne");
        combinedModel.setMouseoverHighlight(false);
        combinedModel.setShowDatatip(false);
        combinedModel.setShowPointLabels(true);
        Axis yAxis = combinedModel.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(graph.getFutureMonthPayment() * 1.5);
//        yAxis.setMax(graph.getTotMonthlyPayment() * 3);
        Axis xAxis = combinedModel.getAxis(AxisType.X);
        xAxis.setMin(currentYear);
        xAxis.setMax(lastYear);
    }

    // *****************bar *********************************
    private HorizontalBarChartModel horizontalBarModel;

    public HorizontalBarChartModel getHorizontalBarModel() {
        createHorizontalBarModel();
        return horizontalBarModel;
    }

    private void createHorizontalBarModel() {
        horizontalBarModel = new HorizontalBarChartModel();

        UtilityDistrict ud = new UtilityDistrict();
        DataUtilityDistrict dataUtilityDistrict = ud.getUtilityDistrict(graph.getUtilityDistrict());

        ChartSeries tier1 = new ChartSeries();
        tier1.set("tiers", dataUtilityDistrict.tire1kw);
        System.out.println("dataUtilityDistrict.tire1kw = " + dataUtilityDistrict.tire1kw);

        ChartSeries tier2 = new ChartSeries();
        tier2.set("tiers", dataUtilityDistrict.tire2kw);
        System.out.println("dataUtilityDistrict.tire2kw = " + dataUtilityDistrict.tire2kw);

        ChartSeries tier3 = new ChartSeries();
        tier3.set("tiers", dataUtilityDistrict.tire3kw);
        System.out.println("dataUtilityDistrict.tire3kw = " + dataUtilityDistrict.tire3kw);

        ChartSeries tier4 = new ChartSeries();
        tier4.set("tiers", dataUtilityDistrict.tire4kw);
        System.out.println("dataUtilityDistrict.tire4kw = " + dataUtilityDistrict.tire4kw);

        ChartSeries tier5 = new ChartSeries();
        int temp = (int) ((int) ((graph.getAnnualKW() / 12) - dataUtilityDistrict.tire1kw
                - dataUtilityDistrict.tire2kw - dataUtilityDistrict.tire3kw - dataUtilityDistrict.tire4kw) < 0 ? 0 : ((graph.getAnnualKW() / 12) - dataUtilityDistrict.tire1kw
                        - dataUtilityDistrict.tire2kw - dataUtilityDistrict.tire3kw - dataUtilityDistrict.tire4kw));
        tier5.set("tiers", temp);

        horizontalBarModel.addSeries(tier1);
        horizontalBarModel.addSeries(tier2);
        horizontalBarModel.addSeries(tier3);
        horizontalBarModel.addSeries(tier4);
        horizontalBarModel.addSeries(tier5);

        horizontalBarModel.setStacked(true);

        Axis xAxis = horizontalBarModel.getAxis(AxisType.X);
        xAxis.setMin(0);
        xAxis.setMax(dataUtilityDistrict.tire1kw + dataUtilityDistrict.tire2kw
                + dataUtilityDistrict.tire3kw + dataUtilityDistrict.tire4kw
                + (int) ((graph.getAnnualKW() / 12) - dataUtilityDistrict.tire1kw
                - dataUtilityDistrict.tire2kw - dataUtilityDistrict.tire3kw - dataUtilityDistrict.tire4kw) + 50);
//        xAxis.setMax(graph.getTotMonthlyPayment() * 1.2);
        Axis yAxis = horizontalBarModel.getAxis(AxisType.Y);
    }

}
