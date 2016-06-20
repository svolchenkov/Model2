/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import jxl.Workbook;

import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import beans.MeasureBean;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

import beans.QuestionsBean;
import javax.inject.Inject;

/**
 *
 * @author Sergey
 */
@Stateless
@LocalBean
public class MeasureEJB {

    @Inject
    QuestionsBean questionsBean;
    
    Map<String, Double> measureMap;

    public MeasureEJB() {
    }

    public int printToExcel(MeasureBean measureBean) {
//        Path path = Paths.get("C:\\Users\\Sergey\\Desktop\\customrID.xls");
        measureMap = createResult(measureBean);
        int result = 1;
        try {
            WritableWorkbook wworkbook;
//            Files.delete(path);
            wworkbook = Workbook.createWorkbook(new File( System.getProperty("user.home") + "\\Desktop" + "\\" + questionsBean.getCaseID() + ".xls" ));
            String customerName = "CustomerNameEmpty";
            if ( questionsBean.getFirstName1().length() != 0 ) {
                customerName = questionsBean.getFirstName1();
            }
            WritableSheet wsheet = wworkbook.createSheet(customerName, 0);
            Label label;
            Number number;
            int index = 0;
            for (String str : measureMap.keySet()) {
                label = new Label(0, index++, str);
                wsheet.addCell(label);
            }
            index = 0;
            for (String str : measureMap.keySet()) {
                number = new Number(1, index, measureMap.get(str));
                wsheet.addCell(number);
                label = new Label(2, index++, "$");
                wsheet.addCell(label);
            }
            wworkbook.write();
            wworkbook.close();

            /* reading xls 
            Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\Sergey\\Desktop\\output.xls"));
            Sheet sheet = workbook.getSheet(0);
            Cell cell1 = sheet.getCell(0, 2);
            System.out.println(cell1.getContents());
            Cell cell2 = sheet.getCell(3, 4);
            System.out.println(cell2.getContents());
            workbook.close();
             */
        } catch (IOException ex) {
            Logger.getLogger(MeasureEJB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (WriteException ex) {
            Logger.getLogger(MeasureEJB.class.getName()).log(Level.SEVERE, null, ex);
        }
        measureMap = null;
        return result;
    }

    public Map<String, Double> createResult(MeasureBean measureBean) {
        measureMap = new LinkedHashMap<>();
        StringBuilder temporaryString = new StringBuilder();
        // ************* 1 *****************
        if (measureBean.isNumber1InsulatAtticBlownCheckBox() == true) {
            temporaryString.append("1.");
            switch (measureBean.getNumber1InsulatAtticBlownString()) {
                case "1.251":
                    temporaryString.append(" Insulate Attic Blown in Fiberglass R-38 Value");
                    break;
                case "1.252":
                    temporaryString.append(" Insulate Attic Blown in Fiberglass R-44 Value");
                    break;
                case "1.253":
                    temporaryString.append(" Insulate Attic Cellalose R-38 Value");
                    break;
                case "1.254":
                    temporaryString.append(" Insulate Attic Cellalose R-44 Value");
                    break;
            }
            temporaryString.append(", sqft: ");
            temporaryString.append(measureBean.getSqft1());
            measureMap.put(temporaryString.toString(), measureBean.getNumber1InsulatAtticBlownResult());
            temporaryString.setLength(0);
        }
        //************************ 2 *******************
        if (measureBean.isNumber2RemoveAndReplaceCheckBox() == true) {
            measureMap.put("2.Fresh Start: Remove and Replace Attic Insulation, sqft: " + measureBean.getSqft2(), measureBean.getNumber2RemoveAndReplaceResult());
        }
        //************************ 3 ******************
        if (measureBean.isNumber3InstallBattedInsulationCheckBox() == true) {
            measureMap.put("3. Crawl Space Insulation: Install R-19 Batted Insulation (with Vapor Barrier) for conditioned "
                    + "space that's accessible, sqft: " + measureBean.getSqft3(), measureBean.getNumber3InstallBattedInsulationResult());
        }
        // ************* 4 *****************
        if (measureBean.isNumber4SealDuctingCodeComplianceCheckBox() == true) {
            temporaryString.append("4.");
            switch (measureBean.getNumber4SealDuctingCodeComplianceString()) {
                case "1.001":
                    temporaryString.append(" Seal Ducting to Code Compliance Standards");
                    break;
                case "1.002":
                    temporaryString.append(" Seal Ducting to CCS for Both Systems");
                    break;
            }
            temporaryString.append(", sqft: ");
            temporaryString.append(measureBean.getSqft4());
            measureMap.put(temporaryString.toString(), measureBean.getNumber4SealDuctingCodeComplianceResult());
            temporaryString.setLength(0);
        }

        // ************* 5 *****************
        if (measureBean.isNumber5AirSealPackageCheckBox() == true) {
            temporaryString.append("5.");
            switch (measureBean.getNumber5AirSealPackageString()) {
                case "0.5":
                    temporaryString.append(" Air Seal Attic Penetration to Target");
                    break;
                case "0.8":
                    temporaryString.append(" Air Seal Attic/Floor Penetration to Target");
                    break;
                case "1.1":
                    temporaryString.append(" Level 3 Air Seal Attic/Floor Penetration to Target");
                    break;
                case "600":
                    temporaryString.append(" Install Mechanical Ventilation to meet BAS standards");
                    break;
                default:
                    temporaryString.append(" nothing");
            }
            temporaryString.append(", sqft: ");
            temporaryString.append(measureBean.getSqft5());
            measureMap.put(temporaryString.toString(), measureBean.getNumber5AirSealPackageResult());
            temporaryString.setLength(0);
        }
        //********************** 6 ***************************************
        if (measureBean.isNumber6CAZAreaReportCheckBox() == true) {
            temporaryString.append("6.");
            switch (measureBean.getNumber6CAZAreaReportString()) {
                case "0.001":
                    temporaryString.append(" Add Ventilation to DHW Area for test out compliance");
                    break;
                case "0.002":
                    temporaryString.append(" Add Ventilation to Furnace Area for test out compliance");
                    break;
                case "0.003":
                    temporaryString.append(" Add Ventilation to DHW and Furnace Area for test out compliance");
                    break;
                case "0.004":
                    temporaryString.append(" Visual Inspection shows adequate ventilation");
                    break;
                case "0.005":
                    temporaryString.append(" Visual Inspection shows adequate ventilation");
                    break;
                default:
                    temporaryString.append(" nothing");
            }
            temporaryString.append(", sqft: ");
            temporaryString.append(measureBean.getSqft6());
            measureMap.put(temporaryString.toString(), measureBean.getNumber6CAZAreaReportResult());
            temporaryString.setLength(0);
        }

        //********************** 7a ***************************************
        if (measureBean.isNumber7AInstallDuctingStandaloneCheckBox() == true) {
            temporaryString.append("7.a.");
            switch (measureBean.getNumber7AInstallDuctingStandaloneString()) {
                case "3300":
                    temporaryString.append(" Install 2 Ton Energy Star R-8 Ducting in Attic Crawlspace");
                    break;
                case "3630":
                    temporaryString.append(" Install 2.5 Ton Energy Star R-8 Ducting in Attic Crawlspace");
                    break;
                case "3800":
                    temporaryString.append(" Install 3 Ton Energy Star R-8 Ducting in Attic Crawlspace");
                    break;
                case "4000":
                    temporaryString.append(" Install 3.5 Ton Energy Star R-8 Ducting in Attic Crawlspace");
                    break;
                case "4650":
                    temporaryString.append(" Install 4 Ton Energy Star R-8 Ducting in Attic Crawlspace");
                    break;
                case "5150":
                    temporaryString.append(" Install 5 Ton Energy Star R-8 Ducting in Attic Crawlspace");
                    break;
                case "3050":
                    temporaryString.append(" Install 2 Ton Energy Star R-8 Ducting in Attic");
                    break;
                case "3380":
                    temporaryString.append(" Install 2.5 Ton Energy Star R-8 Ducting in Attic");
                    break;
                case "3550":
                    temporaryString.append(" Install 3 Ton Energy Star R-8 Ducting in Attic");
                    break;
                case "3750":
                    temporaryString.append(" Install 3.5 Ton Energy Star R-8 Ducting in Attic");
                    break;
                case "4400":
                    temporaryString.append(" Install 4 Ton Energy Star R-8 Ducting in Attic");
                    break;
                case "4900":
                    temporaryString.append(" Install 5 Ton Energy Star R-8 Ducting in Attic");
                    break;
                case "3300.001":
                    temporaryString.append(" Install 2 Ton  Energy Star R-8 Ducting in Crawlspace");
                    break;
                case "3630.001":
                    temporaryString.append(" Install 2.5 Ton Energy Star R-8 Ducting in Crawlspace");
                    break;
                case "3800.001":
                    temporaryString.append(" Install 3 Ton Energy Star R-8 Ducting in Crawlspace");
                    break;
                case "4000.001":
                    temporaryString.append(" Install 3.5 Ton Energy Star R-8 Ducting in Crawlspace");
                    break;
                case "4650.001":
                    temporaryString.append(" Install 4 Ton Energy Star R-8 Ducting in Crawlspace");
                    break;
                case "5150.001":
                    temporaryString.append(" Install 5 Ton Energy Star R-8 Ducting in Crawlspace");
                    break;
                default:
                    temporaryString.append(" nothing");
            }
            temporaryString.append(", sqft: ");
            temporaryString.append(measureBean.getSqft7a());
            measureMap.put(temporaryString.toString(), measureBean.getNumber7AInstallDuctingStandaloneResult());
            temporaryString.setLength(0);
        }

        //********************** 7b ***************************************
        if (measureBean.isNumber7BInstallR8DuctingNewHVACCheckBox() == true) {
            temporaryString.append("7.b.");
            switch (measureBean.getNumber7BInstallR8DuctingNewHVACString()) {
                case "2":
                    temporaryString.append(" Install R-8 Radiant Barrier Ducting");
                    break;

                default:
                    temporaryString.append(" nothing");
            }
            temporaryString.append(", sqft: ");
            temporaryString.append(measureBean.getSqft7b());
            measureMap.put(temporaryString.toString(), measureBean.getNumber7BInstallR8DuctingNewHVACResult());
            temporaryString.setLength(0);
        }

        //********************** 8a ***************************************
        if (measureBean.isNumber8ANewHVACSystemERICheckBox() == true) {
            temporaryString.append("8.a.");
            switch (measureBean.getNumber8ANewHVACSystemERIString()) {
                case "8550.001":
                    temporaryString.append(" Install 16 Seer HVAC / 96% 2 Ton Split System");
                    break;
                case "8550.002":
                    temporaryString.append(" Install 16 Seer HVAC/ 96% 2.5 Ton Split System");
                    break;
                case "9350":
                    temporaryString.append(" Install 16 Seer HVAC/ 96% 3 Ton Split System");
                    break;
                case "10450":
                    temporaryString.append(" Install 16 Seer HVAC/ 96% 3.5 Ton Split System");
                    break;
                case "11350":
                    temporaryString.append(" Install 15 Seer HVAC/ 96% 5 Ton Split System");
                    break;
                case "8550.003":
                    temporaryString.append(" Install ERI 16 Seer HVAC/ 81% 2 Ton 2 Stage Heat Package System");
                    break;
                case "8550.004":
                    temporaryString.append(" Install ERI 16 Seer HVAC/ 81% 2.5 Ton 2 Stage Heat Package System");
                    break;
                case "9100":
                    temporaryString.append(" Install ERI 16 Seer HVAC/ 81% 3 Ton 2 Stage Heat Package System");
                    break;
                case "9700":
                    temporaryString.append(" Install ERI 16 Seer HVAC/ 81% 3.5 Ton 2 Stage Heat Package System");
                    break;
                case "10100":
                    temporaryString.append(" Install ERI 16 Seer HVAC/ 81% 4 Ton 2 Stage Heat Package System");
                    break;
                case "11100":
                    temporaryString.append(" Install ERI 14 Seer HVAC/ 81% 5 Ton 2 Stage Heat Package System");
                    break;
                default:
                    temporaryString.append(" nothing");
            }
            temporaryString.append(", sqft: ");
            temporaryString.append(measureBean.getSqft8a());
            measureMap.put(temporaryString.toString(), measureBean.getNumber8ANewHVACSystemERIResult());
            temporaryString.setLength(0);
        }

        //********************** 8b ***************************************
        if (measureBean.isNumber8BNewHVACSystemERIPrivateCheckBox() == true) {
            temporaryString.append("8.b.");
            switch (measureBean.getNumber8BNewHVACSystemERIPrivateString()) {
                case "8550.001":
                    temporaryString.append(" Install 16 Seer HVAC / 96% 2 Ton Split System");
                    break;
                case "8550.002":
                    temporaryString.append(" Install 16 Seer HVAC/ 96% 2.5 Ton Split System");
                    break;
                case "9350":
                    temporaryString.append(" Install 16 Seer HVAC/ 96% 3 Ton Split System");
                    break;
                case "10450":
                    temporaryString.append(" Install 16 Seer HVAC/ 96% 3.5 Ton Split System");
                    break;
                case "11350":
                    temporaryString.append(" Install 15 Seer HVAC/ 96% 5 Ton Split System");
                    break;
                case "8550.003":
                    temporaryString.append(" Install ERI 16 Seer HVAC/ 81% 2 Ton 2 Stage Heat Package System");
                    break;
                case "8550.004":
                    temporaryString.append(" Install ERI 16 Seer HVAC/ 81% 2.5 Ton 2 Stage Heat Package System");
                    break;
                case "9100":
                    temporaryString.append(" Install ERI 16 Seer HVAC/ 81% 3 Ton 2 Stage Heat Package System");
                    break;
                case "9700":
                    temporaryString.append(" Install ERI 16 Seer HVAC/ 81% 3.5 Ton 2 Stage Heat Package System");
                    break;
                case "10100":
                    temporaryString.append(" Install ERI 16 Seer HVAC/ 81% 4 Ton 2 Stage Heat Package System");
                    break;
                case "11100":
                    temporaryString.append(" Install ERI 14 Seer HVAC/ 81% 5 Ton 2 Stage Heat Package System");
                    break;
                default:
                    temporaryString.append(" nothing");
            }
            System.out.println("temporaryString.toString() = " + temporaryString.toString());
            measureMap.put(temporaryString.toString(), measureBean.getNumber8BNewHVACSystemERIPrivateResult());
            temporaryString.setLength(0);
        }
        //************************ 8bii *******************
        if (measureBean.isNumber8BIIIncludes10YearPartsCheckBox() == true) {
            measureMap.put("8bii. Includes 10 Year Parts and Labor/MERV 11 Filtration/UV Coil ", measureBean.getNumber8BIIIncludes10YearPartsResult());
        }
        //********************** 9 ***************************************
        if (measureBean.isNumber9SingleDualZoneHVACSystemCheckBox() == true) {
            temporaryString.append("9.");
            switch (measureBean.getNumber9SingleDualZoneHVACSystemString()) {
                case "0":
                    temporaryString.append(" Single Zone HVAC System");
                    break;
                case "1650":
                    temporaryString.append(" Dual Zone HVAC System");
                    break;
                default:
                    temporaryString.append(" nothing");
            }
            measureMap.put(temporaryString.toString(), measureBean.getNumber9SingleDualZoneHVACSystemResult());
            temporaryString.setLength(0);
        }
        //************************ 91a *******************
        if (measureBean.isNumber91aRelocateCondenserCheckBox() == true) {
            measureMap.put("9.1.a Relocate Condenser", measureBean.getNumber91aRelocateCondenserResult());
        }
        //************************ 91b *******************
        if (measureBean.isNumber91bCutInSupplyVentNewDuctCheckBox() == true) {
            measureMap.put("9.1.b Cut in Supply Vent w/ New Duct", measureBean.getNumber91bCutInSupplyVentNewDuctResult());
        }
        //************************ 91c *******************
        if (measureBean.isNumber91cHVACCutInCheckBox() == true) {
            measureMap.put("9.1.c HVAC Cut In", measureBean.getNumber91cHVACCutInResult());
        }
        //************************ 91d *******************
        if (measureBean.isNumber91dDuctSealOnlyCheckBox() == true) {
            measureMap.put("9.1.d Duct Seal Only", measureBean.getNumber91dDuctSealOnlyResult());
        }
        //************************ 91e *******************
        if (measureBean.isNumber91eNewLineSetCheckBox() == true) {
            measureMap.put("9.1.e New Line Set", measureBean.getNumber91eNewLineSetResult());
        }
        //************************ 91f *******************
        if (measureBean.isNumber91fEnlargeReturnAirCheckBox() == true) {
            measureMap.put("9.1.f Cut in Supply Vent w/ New Duct", measureBean.getNumber91fEnlargeReturnAirResult());
        }
        //************************ 92 *******************
        if (measureBean.isNumber92NotesCheckBox() == true) {
            measureMap.put("9.2 Notes " + measureBean.getNumber92NotesString(), 0d);
        }
        //************************ 93a *******************
        if (measureBean.isNumber93CostPerKWCheckBox() == true) {
            measureMap.put("9.3a.Cost per KW: " + measureBean.getNumber93CostPerKWResalt(), 0d);
        }
        //************************ 93b *******************
        if (measureBean.isNumber93CostPerKWCheckBox() == true) {
            measureMap.put("9.3b.DC KWs: " + measureBean.getNumber93DCKWsResalt(), 0d);
        }
        //************************ 10 *******************
        if (measureBean.isNumber10InstallWindowsCheckBox() == true) {
            measureMap.put("10. Install" + measureBean.getNumber10numOfWindows() + " High Performance Retrofit Windows, total united inches:"
                    + measureBean.getNumber10TotalUnitedInchesInt() + " ", measureBean.getNumber10InstallResult());
            measureMap.put("10. AND" + measureBean.getNumber10numOfSliders() + "Sliders, linear Feet"
                    + measureBean.getNumber10LinearFeet() + " ", measureBean.getNumber10LinearFeetResult());
        }
        //************************ 101a *******************
        if (measureBean.isNumber101ACutInDoorCheckBox() == true) {
            measureMap.put("10.1a Misc. Items (Windows, per lin. Ft.) Cut In Door / Window, lin. Ft.: " + measureBean.getNumber101ACutInDoorInt(), measureBean.getNumber101ACutInDoorResult());
        }
        //************************ 101b *******************
        if (measureBean.isNumber101BAddHeaderCheckBox() == true) {
            measureMap.put("10.1b Misc. Items (Windows, per lin. Ft.), 	Add Header / Enlarge Opening, 	lin. Ft: "
                    + measureBean.getNumber101BAddHeaderInt(), measureBean.getNumber101BAddHeaderResult());
        }
        //************************ 102a *******************
        if (measureBean.isNumber102ACutDownWindowCheckBox() == true) {
            measureMap.put("10.2a Misc. Items (Windows, Bulk),Cut Down Window no Electric  "
                    + measureBean.getNumber101BAddHeaderInt(), measureBean.getNumber102ACutDownWindowResult());
        }
        //************************ 102b *******************
        if (measureBean.isNumber102BElectricalReroutesCheckBox() == true) {
            measureMap.put("10.2b Misc. Items (Windows, Bulk), Electrical Reroutes "
                    + measureBean.getNumber101BAddHeaderInt(), measureBean.getNumber102BElectricalReroutesResult());
        }
        //************************ 102c *******************
        if (measureBean.isNumber102CGardenWindow4CheckBox() == true) {
            measureMap.put("10.2c Misc. Items (Windows, Bulk), Garden Window 4 "
                    + measureBean.getNumber101BAddHeaderInt(), measureBean.getNumber102CGardenWindow4Result());
        }
        //************************ 102c *******************
        if (measureBean.isNumber102DGardenWindow6CheckBox() == true) {
            measureMap.put("10.2d Misc. Items (Windows, Bulk), Garden Window 6 "
                    + measureBean.getNumber101BAddHeaderInt(), measureBean.getNumber102DGardenWindow6Result());
        }
        //************************ 103 *******************
        if (measureBean.isNumber103AllGlazingCheckBox() == true) {
            measureMap.put("10.3 All glazing is Triple lowE, tempered where required by code and obscured in bathrooms as required by customer ", 0d);
        }
        //************************ 104 *******************
        if (measureBean.isNumber104WindowsToMatcCheckBox() == true) {
            measureMap.put("10.4 Windows to match existing configuration with white vinyl frames, including bug screens and Argon gas-filled glass pack ", 0d);
        }
        //************************ 11 *******************
        if (measureBean.isNumber11InstallPoolPumpCheckBox() == true) {
            measureMap.put("11. Install Pool Pump, Pentair 3HP Intelliflo Variable Speed Pool Pump ", measureBean.getNumber11InstallPoolPumpResult());
        }
        //************************ 12 *******************
        if (measureBean.isNumber12InstallWholeHouseFanCheckBox() == true) {
            temporaryString.append("12. Install Whole House Fan");
            switch (measureBean.getNumber12InstallWholeHouseFanInt()) {
                case 900:
                    temporaryString.append(" Install 16 Seer HVAC / 96% 2 Ton Split System");
                    break;
                case 1350:
                    temporaryString.append(" Quiet Cool WH Fan Tri 2.5 2500 CFM");
                    break;
                case 1550:
                    temporaryString.append(" Quiet Cool WH Fan Tri 3.3 3300 CFM");
                    break;
                case 1800:
                    temporaryString.append(" Quiet Cool WH Fan Tri 4.8 4800 CFM");
                    break;
                default:
                    temporaryString.append(" nothing");
            }
            System.out.println("temporaryString.toString() = " + temporaryString.toString());
            measureMap.put(temporaryString.toString(), measureBean.getNumber12InstallWholeHouseFanResult());
            temporaryString.setLength(0);
        }
        //************************ 13 *******************
        if (measureBean.isNumber13InstallWaterHeaterCheckBox() == true) {
            temporaryString.append("13.Install Water Heater, ");
            switch (String.valueOf(measureBean.getNumber13InstallWaterHeaterDouble())) {
                case "1200":
                    temporaryString.append(" Install 40 Gallon Gas Water Heater");
                    break;
                case "1400":
                    temporaryString.append(" Install 50 Gallon Gas Water Heater");
                    break;
                case "1200.001":
                    temporaryString.append(" Install 40 Gallon Electric Water Heater");
                    break;
                case "1400.001":
                    temporaryString.append(" Install 50 Gallon Electric Water Heater");
                    break;
                case "1900":
                    temporaryString.append(" Install 75 Gallon Water Heater");
                    break;
                default:
                    temporaryString.append(" nothing");
            }
            System.out.println("temporaryString.toString() = " + temporaryString.toString());
            measureMap.put(temporaryString.toString(), measureBean.getNumber13InstallWaterHeaterResult());
            temporaryString.setLength(0);
        }
        //************************ 14 *******************
        if (measureBean.isNumber14PermitsCheckBox() == true) {
            measureMap.put("14.Permits, Includes all permits 3rd party verification as needed BPI test in and test out ", 0d);
        }
        //************************ 15 *******************
        if (measureBean.isNumber15InstallBatteryOperatedCheckBox() == true) {
            measureMap.put("15.Install battery-operated CO and smoke detectors as needed Install battery-operated CO and smoke detectors as needed (no charge)", 0d);
        }
        //************************ 15a *******************
        if (measureBean.isNumber15AInstallKWDCSolarSystemCheckBox() == true) {
            measureMap.put("15a.Install " + measureBean.getNumber15aInstallKWDCSolarSystemDouble() + " KW DC Solar System", 0d);
        }
        //************************ 15b *******************
        if (measureBean.isNumber15BIncludesExtrudedAluminumCheckBox() == true) {
            measureMap.put("15b.Includes Extruded Aluminum Roof Mount Racking", 0d);
        }
        //************************ 15c *******************
        if (measureBean.isNumber15CSolarEdgeWithPowerOptimizersCheckBox() == true) {
            measureMap.put("15c.SolarEdge with Power Optimizers", 0d);
        }
        //************************ 15d *******************
        if (measureBean.isNumber15DIncludesSystemPVProductionCheckBox() == true) {
            measureMap.put("15d.Includes system PV production monitoring", 0d);
        }
        //************************ 15e *******************
        if (measureBean.isNumber15EIncludesAllPermitsCheckBox() == true) {
            measureMap.put("15e.Includes all permits, engineering, NEM approval, interconnection and PTO system initiation", 0d);
        }
        //************************ 15f *******************
        if (measureBean.isNumber15FCanadianSolar270WattCheckBox() == true) {
            measureMap.put("15f. 270 Watt Investment Grade Panels", 0d);
        }

        return measureMap;
    }

}
