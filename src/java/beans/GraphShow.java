/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.BarChartSeries;
import org.primefaces.model.chart.CartesianChartModel;
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
        if (graph.getFrontLoadTaxBenefit() == 0) {
            tempa = graph.getHpMoPayment() + graph.getSolarMoPayment() + graph.getCurrentMonthPaymentAfterImprove();
        } else {
            tempa = graph.getHpMoPayment() + graph.getSolarMoPaymentAfterFrontLoad() + graph.getCurrentMonthPaymentAfterImprove();
            double k = Math.round(tempa * 100);
            tempa = k / 100;
        }
        if (graph.isAccountForTaxWrite() == true) {
            tempa *= 0.67;
        }
        i = currentYear;
        do {
            if (i < lastYear) {
                tempb = Math.round((tempa += delta) * 100);
                tempa = tempb / 100;
                futMoPaiment.set(i, tempa);
            } else {
                if ( i == lastYear) {
                    tempa -= (graph.getHpMoPayment() + graph.getSolarMoPayment());
                }
                tempb = Math.round((tempa += delta) * 100);
                tempa = tempb / 100;
                tempa = tempa < 0 ? 0 : tempa; 
                futMoPaiment.set(i, tempa);
            }
            i++;
        } while (i < lastYear + 5);

        //filling bar map
        BarChartSeries tobe = new BarChartSeries();
        tobe.setLabel("mo payment for improvement");
        i = currentYear;
        if (graph.getFrontLoadTaxBenefit() == 0) {
            tempa = graph.getTotMonthlyPayment();
        } else {
            tempa = graph.getHpMoPayment() + graph.getSolarMoPaymentAfterFrontLoad();
            double k = Math.round(tempa * 100);
            tempa = k / 100;
        }
        if (graph.isAccountForTaxWrite() == true) {
            tempa *= 0.67;
        }

        do {
            if (i < lastYear) {
                tobe.set(i, tempa);
                i++;
            } else {
                tobe.set(i, 0);
                i++;
            }
        } while (i < lastYear + 5);
        
        

        combinedModel.addSeries(tobe);
        combinedModel.addSeries(asIs);
        combinedModel.addSeries(futMoPaiment);

        combinedModel.setTitle("Best graph");
        combinedModel.setLegendPosition("ne");
        combinedModel.setMouseoverHighlight(false);
        combinedModel.setShowDatatip(false);
        combinedModel.setShowPointLabels(true);
        Axis yAxis = combinedModel.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(graph.getFutureMonthPayment() * 1.5);
        Axis xAxis = combinedModel.getAxis(AxisType.X);
        xAxis.setMin(currentYear);
        xAxis.setMax(lastYear);
    }

}
