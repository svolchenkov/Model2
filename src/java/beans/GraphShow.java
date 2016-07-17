/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.DataUtilityDistrict;
import entity.UtilityDistrict;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Map;
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
@Named(value = "graphShow")
@SessionScoped
public class GraphShow implements Serializable {

    Map<Integer, Double> lineMap;

    @Inject
    Graph graph;
    @Inject
    DashBoardBean dashBoardBean;
    double wholePaimentIn20Years;

    private CartesianChartModel combinedModel;

//    @PostConstruct
//    public void init() {
//        createCombinedModel();
//    }
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

        //filling map line
        combinedModel = new BarChartModel();

        LineChartSeries asIs = new LineChartSeries();
        asIs.setLabel("current situation");

        double tempa = graph.getCurrentMonthPayment();
        double tempb;
        int i = currentYear;
        do {
            asIs.set(i, tempa);
            tempb = Math.round((tempa += delta) * 100);
            tempa = tempb / 100;
            i++;
        } while (i < lastYear + 5);

        //filling mo payment after project
        combinedModel = new BarChartModel();
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
                if (i >= lastYear ) {
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
//                double k = Math.round(tempa * 100);
//                tempa = k / 100;
                if (graph.isAccountForTaxWrite() == true) {
                    tempa *= 0.67;
                }
                if (i < currentYear + graph.getTimeTravel() * 0.3) {
                    tobe.set(i, 0);
                }
                if (i >= currentYear + graph.getTimeTravel() * 0.3 && i < lastYear) {
                    tobe.set(i, tempa);
                }
                if (i >= lastYear ) {
                    tobe.set(i, 0);
                }
            }
            i++;
        } while (i < lastYear + 5);

        combinedModel.addSeries(tobe);
        //this line is showing current situation
//        combinedModel.addSeries(asIs);
        combinedModel.addSeries(futMoPaiment);

        combinedModel.setTitle("Graph");
        combinedModel.setLegendPosition("ne");
        combinedModel.setMouseoverHighlight(false);
        combinedModel.setShowDatatip(false);
        combinedModel.setShowPointLabels(true);
        Axis yAxis = combinedModel.getAxis(AxisType.Y);
        yAxis.setMin(0);
//        yAxis.setMax(graph.getFutureMonthPayment() * 1.5);
        yAxis.setMax(graph.getTotMonthlyPayment() * 3);
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

        ChartSeries tier2 = new ChartSeries();
        tier2.set("tiers", dataUtilityDistrict.tire2kw);

        ChartSeries tier3 = new ChartSeries();
        tier3.set("tiers", dataUtilityDistrict.tire3kw);

        ChartSeries tier4 = new ChartSeries();
        tier4.set("tiers", dataUtilityDistrict.tire4kw);

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

    //******************************slider******************************
    private int slideMin = 0;
    private int slideMax = 1;

    public int getSlideMin() {
        return slideMin;
    }

    public void setSlideMin(int slideMin) {
//        if ( graph.getDailyHoursForSolar() == 0 )  {
//            graph.setNumberOfCustomPanels(0);
//        } else {
//            graph.setNumberOfCustomPanels((int) (Integer.valueOf(slideMax - slideMin) / (Math.round(30 * graph.getDailyHoursForSolar() * 0.271))));
//        }
        this.slideMin = slideMin;
    }

    public int getSlideMax() {
        return slideMax;
    }

    public void setSlideMax(int slideMax) {
//        if ( graph.getDailyHoursForSolar() == 0 )  {
//            graph.setNumberOfCustomPanels(0);
//        } else {
//            graph.setNumberOfCustomPanels((int) (Integer.valueOf(slideMax - slideMin) / (Math.round(30 * graph.getDailyHoursForSolar() * 0.271))));
//        }
        this.slideMax = slideMax;
    }

    //temp calculate for show only
    public double getWholePaimentIn20Years() {
        wholePaimentIn20Years = graph.getFutureMonthPayment();
        return wholePaimentIn20Years;
    }

    public void setWholePaimentIn20Years(double wholePaimentIn20Years) {
        this.wholePaimentIn20Years = wholePaimentIn20Years;
    }

}
