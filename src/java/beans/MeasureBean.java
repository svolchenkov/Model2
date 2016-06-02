/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import com.sun.org.apache.bcel.internal.generic.D2F;
import db.entity.MeasureEntity;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import ejb.MeasureEJB;
import javax.ejb.EJB;

import db.manage.MeasureManage;

/**
 *
 * @author Sergey
 */
@Named(value = "measureBean")
@SessionScoped
public class MeasureBean implements Serializable {

    @EJB
    private MeasureEJB measureEJB;
    @EJB
    MeasureManage measureManage;

    FinanceBean finance;

    private double total;
    private String caseId;
    private int customerID;
    private int new1;

    private boolean number1InsulatAtticBlownCheckBox;
    private String number1InsulatAtticBlownString;
    private int sqft1;
    private double number1InsulatAtticBlownResult;

    private boolean number2RemoveAndReplaceCheckBox;
    private int sqft2;
    private double number2RemoveAndReplaceResult;

    private boolean number3InstallBattedInsulationCheckBox;
    private int sqft3;
    private double number3InstallBattedInsulationResult;

    private boolean number4SealDuctingCodeComplianceCheckBox;
    private String number4SealDuctingCodeComplianceString;
    private int sqft4;
    private double number4SealDuctingCodeComplianceResult;

    private int sqft5;
    private boolean number5AirSealPackageCheckBox;
    private String number5AirSealPackageString;
    private double number5AirSealPackageResult;

    private int sqft6;
    private boolean number6CAZAreaReportCheckBox;
    private String number6CAZAreaReportString;
    private double number6CAZAreaReportResult;

    private int sqft7a;
    private boolean number7AInstallDuctingStandaloneCheckBox;
    private String number7AInstallDuctingStandaloneString;
    private double number7AInstallDuctingStandaloneResult;

    private int sqft7b;
    private boolean number7BInstallR8DuctingNewHVACCheckBox;
    private String number7BInstallR8DuctingNewHVACString;
    private double number7BInstallR8DuctingNewHVACResult;

    private int sqft8a;
    private boolean number8ANewHVACSystemERICheckBox;
    private String number8ANewHVACSystemERIString;
    private double number8ANewHVACSystemERIResult;

    private int sqft8b;
    private boolean number8BNewHVACSystemERIPrivateCheckBox;
    private String number8BNewHVACSystemERIPrivateString;
    private double number8BNewHVACSystemERIPrivateResult;

    private int sqft8bii;
    private boolean number8BIIIncludes10YearPartsCheckBox;
    private String number8BIIIncludes10YearPartsString;
    private double number8BIIIncludes10YearPartsResult;

    private int sqft9;
    private boolean number9SingleDualZoneHVACSystemCheckBox;
    private String number9SingleDualZoneHVACSystemString;
    private double number9SingleDualZoneHVACSystemResult;

    private int sqft91;
    private boolean number91aRelocateCondenserCheckBox;
    private int number91aRelocateCondenserInt;
    private double number91aRelocateCondenserResult;

    private boolean number91bCutInSupplyVentNewDuctCheckBox;
    private int number91bCutInSupplyVentNewDuctInt;
    private double number91bCutInSupplyVentNewDuctResult;

    private boolean number91cHVACCutInCheckBox;
    private int number91cHVACCutInInt;
    private double number91cHVACCutInResult;

    private boolean number91dDuctSealOnlyCheckBox;
    private int number91dDuctSealOnlyInt;
    private double number91dDuctSealOnlyResult;

    private boolean number91eNewLineSetCheckBox;
    private int number91eNewLineSetInt;
    private double number91eNewLineSetResult;

    private boolean number91fEnlargeReturnAirCheckBox;
    private int number91fEnlargeReturnAirInt;
    private double number91fEnlargeReturnAirResult;

    private boolean number92NotesCheckBox;
    private String number92NotesString;

    private boolean number93CostPerKWCheckBox;
    private int number93CostPerKWInt;
    private double number93CostPerKWResalt;
    private int number93DCKWsInt;
    private double number93DCKWsResalt;

    private boolean number10InstallWindowsCheckBox;
    private String number10numOfWindows;
    private int number10TotalUnitedInchesInt;
    private double number10InstallResult;
    private String number10numOfSliders;
    private String number10LinearFeet;
    private double number10LinearFeetResult;

    private boolean number101ACutInDoorCheckBox;
    private int number101ACutInDoorInt;
    private double number101ACutInDoorResult;

    private boolean number101BAddHeaderCheckBox;
    private int number101BAddHeaderInt;
    private double number101BAddHeaderResult;

    private boolean number102ACutDownWindowCheckBox;
    private double number102ACutDownWindowResult;

    private boolean number102BElectricalReroutesCheckBox;
    private double number102BElectricalReroutesResult;

    private boolean number102CGardenWindow4CheckBox;
    private double number102CGardenWindow4Result;

    private boolean number102DGardenWindow6CheckBox;
    private double number102DGardenWindow6Result;

    private boolean number103AllGlazingCheckBox;
    private boolean number104WindowsToMatcCheckBox;

    private boolean number11InstallPoolPumpCheckBox;
    private double number11InstallPoolPumpResult;

    private boolean number12InstallWholeHouseFanCheckBox;
    private int number12InstallWholeHouseFanInt;
    private double number12InstallWholeHouseFanResult;

    private boolean number13InstallWaterHeaterCheckBox;
    private double number13InstallWaterHeaterDouble;
    private double number13InstallWaterHeaterResult;

    private boolean number14PermitsCheckBox;
    private double number14PermitsResult;

    private boolean number15InstallBatteryOperatedCheckBox;
    private double number15InstallBatteryOperatedResult;

    private boolean number15AInstallKWDCSolarSystemCheckBox;
    private int number15aInstallKWDCSolarSystemInt;

    private boolean number15BIncludesExtrudedAluminumCheckBox;
    private boolean number15CSolarEdgeWithPowerOptimizersCheckBox;
    private boolean number15DIncludesSystemPVProductionCheckBox;
    private boolean number15EIncludesAllPermitsCheckBox;
    private boolean number15FCanadianSolar270WattCheckBox;

    // Calculate whole cost
    private double wholeCost;
    private double solarCost;

    /**
     * Creates a new instance of MeasureBean
     */
    public MeasureBean() {
    }
    
    public void saveMeasure () {
        measureManage.addOrUpdateMeasure(this);
    }

    //****************** 0 **********************************
    public void printToExcel() {
        measureEJB.printToExcel(this);
    }

    public String wayToHouseFinance() {
        return "housefinance";
    }

    public FinanceBean getFinance() {
        return finance;
    }

    public void setFinance(FinanceBean finance) {
        this.finance = finance;
    }

    //******************** 1. Number1InsulatAtticBlown***************************
    public int getSqft1() {
        return sqft1;
    }

    public void setSqft1(int sqft1) {
        this.sqft1 = sqft1;
    }

    public boolean isNumber1InsulatAtticBlownCheckBox() {
        return number1InsulatAtticBlownCheckBox;
    }

    public void setNumber1InsulatAtticBlownCheckBox(boolean number1InsulatAtticBlownCheckBox) {
        this.number1InsulatAtticBlownCheckBox = number1InsulatAtticBlownCheckBox;
    }

    public String getNumber1InsulatAtticBlownString() {
        if (this.number1InsulatAtticBlownString == null) {
            this.number1InsulatAtticBlownString = "0";
        }
        return number1InsulatAtticBlownString;
    }

    public void setNumber1InsulatAtticBlownString(String number1InsulatAtticBlownString) {
        this.number1InsulatAtticBlownString = number1InsulatAtticBlownString;
    }

    public double getNumber1InsulatAtticBlownResult() {
        if (isNumber1InsulatAtticBlownCheckBox() == true) {
            double k = Math.round(Double.valueOf(getNumber1InsulatAtticBlownString()) * 100);
            this.number1InsulatAtticBlownResult = k / 100 * getSqft1();
        } else {
            this.number1InsulatAtticBlownResult = 0;
        }
        return number1InsulatAtticBlownResult;
    }

    public void setNumber1InsulatAtticBlownResult(double number1InsulatAtticBlownResult) {
        this.number1InsulatAtticBlownResult = number1InsulatAtticBlownResult;
    }

    //******************** 2. Fresh Start***************************
    public int getSqft2() {
        return sqft2;
    }

    public void setSqft2(int sqft2) {
        this.sqft2 = sqft2;
    }

    public boolean isNumber2RemoveAndReplaceCheckBox() {
        return number2RemoveAndReplaceCheckBox;
    }

    public void setNumber2RemoveAndReplaceCheckBox(boolean number2RemoveAndReplaceCheckBox) {
        this.number2RemoveAndReplaceCheckBox = number2RemoveAndReplaceCheckBox;
    }

    public double getNumber2RemoveAndReplaceResult() {
        if (isNumber2RemoveAndReplaceCheckBox() == true) {
            this.number2RemoveAndReplaceResult = 1.5 * getSqft2();
        } else {
            this.number2RemoveAndReplaceResult = 0;
        }
        return number2RemoveAndReplaceResult;
    }

    public void setNumber2RemoveAndReplaceResult(double number2RemoveAndReplaceResult) {
        this.number2RemoveAndReplaceResult = number2RemoveAndReplaceResult;
    }

    //******************** 3. Crawl Space Insulation ***************************
    public int getSqft3() {
        return sqft3;
    }

    public void setSqft3(int sqft3) {
        this.sqft3 = sqft3;
    }

    public boolean isNumber3InstallBattedInsulationCheckBox() {
        return number3InstallBattedInsulationCheckBox;
    }

    public void setNumber3InstallBattedInsulationCheckBox(boolean number3InstallBattedInsulationCheckBox) {
        this.number3InstallBattedInsulationCheckBox = number3InstallBattedInsulationCheckBox;
    }

    public double getNumber3InstallBattedInsulationResult() {
        if (isNumber3InstallBattedInsulationCheckBox() == true) {
            this.number3InstallBattedInsulationResult = 2 * sqft3;
        } else {
            this.number3InstallBattedInsulationResult = 0;
        }
        return number3InstallBattedInsulationResult;
    }

    public void setNumber3InstallBattedInsulationResult(double number3InstallBattedInsulationResult) {
        this.number3InstallBattedInsulationResult = number3InstallBattedInsulationResult;
    }

    //******************** 4. Seal Ducting to Code Compliance Standards ***************************
    public int getSqft4() {
        return sqft4;
    }

    public void setSqft4(int sqft4) {
        this.sqft4 = sqft4;
    }

    public boolean isNumber4SealDuctingCodeComplianceCheckBox() {
        return number4SealDuctingCodeComplianceCheckBox;
    }

    public void setNumber4SealDuctingCodeComplianceCheckBox(boolean number4SealDuctingCodeComplianceCheckBox) {
        this.number4SealDuctingCodeComplianceCheckBox = number4SealDuctingCodeComplianceCheckBox;
    }

    public String getNumber4SealDuctingCodeComplianceString() {
        if (this.number4SealDuctingCodeComplianceString == null) {
            this.number4SealDuctingCodeComplianceString = "0";
        }
        return number4SealDuctingCodeComplianceString;
    }

    public void setNumber4SealDuctingCodeComplianceString(String number4SealDuctingCodeComplianceString) {
        this.number4SealDuctingCodeComplianceString = number4SealDuctingCodeComplianceString;
    }

    public double getNumber4SealDuctingCodeComplianceResult() {
        if (isNumber4SealDuctingCodeComplianceCheckBox() == true) {
            double k = Math.round(Double.valueOf(getNumber4SealDuctingCodeComplianceString()) * 100);
            this.number4SealDuctingCodeComplianceResult = k / 100 * sqft4;
        } else {
            this.number4SealDuctingCodeComplianceResult = 0;
        }
        return number4SealDuctingCodeComplianceResult;
    }

    public void setNumber4SealDuctingCodeComplianceResult(double number4SealDuctingCodeComplianceResult) {
        this.number4SealDuctingCodeComplianceResult = number4SealDuctingCodeComplianceResult;
    }

    //****************************** 5. Air Seal Package ************************************
    public int getSqft5() {
        return sqft5;
    }

    public void setSqft5(int sqft5) {
        this.sqft5 = sqft5;
    }

    public boolean isNumber5AirSealPackageCheckBox() {
        return number5AirSealPackageCheckBox;
    }

    public void setNumber5AirSealPackageCheckBox(boolean number5AirSealPackageCheckBox) {
        this.number5AirSealPackageCheckBox = number5AirSealPackageCheckBox;
    }

    public String getNumber5AirSealPackageString() {
        if (this.number5AirSealPackageString == null) {
            this.number5AirSealPackageString = "0";
        }
        return number5AirSealPackageString;
    }

    public void setNumber5AirSealPackageString(String number5AirSealPackageString) {
        this.number5AirSealPackageString = number5AirSealPackageString;
    }

    public double getNumber5AirSealPackageResult() {
        if (isNumber5AirSealPackageCheckBox() == true) {
            this.number5AirSealPackageResult = Double.valueOf(getNumber5AirSealPackageString()) * getSqft5();
            double k = Math.round(this.number5AirSealPackageResult * 1000);
            this.number5AirSealPackageResult = k / 1000;
        } else {
            this.number5AirSealPackageString = "0";
        }
        return number5AirSealPackageResult;
    }

    public void setNumber5AirSealPackageResult(double number5AirSealPackageResult) {
        this.number5AirSealPackageResult = number5AirSealPackageResult;
    }

    //****************************** 6. CAZ Area Report *****************************************
    public int getSqft6() {
        return sqft6;
    }

    public void setSqft6(int sqft6) {
        this.sqft6 = sqft6;
    }

    public boolean isNumber6CAZAreaReportCheckBox() {
        return number6CAZAreaReportCheckBox;
    }

    public void setNumber6CAZAreaReportCheckBox(boolean number6CAZAreaReportCheckBox) {
        this.number6CAZAreaReportCheckBox = number6CAZAreaReportCheckBox;
    }

    public String getNumber6CAZAreaReportString() {
        if (this.number6CAZAreaReportString == null) {
            this.number6CAZAreaReportString = "0";
        }
        return number6CAZAreaReportString;
    }

    public void setNumber6CAZAreaReportString(String number6CAZAreaReportString) {
        this.number6CAZAreaReportString = number6CAZAreaReportString;
    }

    public double getNumber6CAZAreaReportResult() {
        if (isNumber6CAZAreaReportCheckBox() == true) {
            double k = Math.round(Double.valueOf(getNumber6CAZAreaReportString()) * 100);
            this.number6CAZAreaReportResult = k / 100 * getSqft6();
        } else {
            this.number6CAZAreaReportResult = 0;
        }
        return number6CAZAreaReportResult;
    }

    public void setNumber6CAZAreaReportResult(double number6CAZAreaReportResult) {
        this.number6CAZAreaReportResult = number6CAZAreaReportResult;
    }

    //****************************** 7a. Install R-8 Ducting Standalone *****************************************
    public int getSqft7a() {
        this.sqft7a = 0;
        return sqft7a;
    }

    public void setSqft7a(int sqft7a) {
        this.sqft7a = 0;
        this.sqft7a = sqft7a;
    }

    public boolean isNumber7AInstallDuctingStandaloneCheckBox() {
        return number7AInstallDuctingStandaloneCheckBox;
    }

    public void setNumber7AInstallDuctingStandaloneCheckBox(boolean number7AInstallDuctingStandaloneCheckBox) {
        this.number7AInstallDuctingStandaloneCheckBox = number7AInstallDuctingStandaloneCheckBox;
    }

    public String getNumber7AInstallDuctingStandaloneString() {
        if (this.number7AInstallDuctingStandaloneString == null) {
            this.number7AInstallDuctingStandaloneString = "0";
        }
        return number7AInstallDuctingStandaloneString;
    }

    public void setNumber7AInstallDuctingStandaloneString(String number7AInstallDuctingStandaloneString) {
        this.number7AInstallDuctingStandaloneString = number7AInstallDuctingStandaloneString;
    }

    public double getNumber7AInstallDuctingStandaloneResult() {
        if (isNumber7AInstallDuctingStandaloneCheckBox() == true) {
            this.number7AInstallDuctingStandaloneResult = Double.valueOf(getNumber7AInstallDuctingStandaloneString()) * 1;
        } else {
            this.number7AInstallDuctingStandaloneResult = 0;
        }
        return number7AInstallDuctingStandaloneResult;
    }

    public void setNumber7AInstallDuctingStandaloneResult(double number7AInstallDuctingStandaloneResult) {
        this.number7AInstallDuctingStandaloneResult = number7AInstallDuctingStandaloneResult;
    }

    //******************************* 7b. Install R-8 Ducting w/ New HVAC System ******************************
    public int getSqft7b() {
        return sqft7b;
    }

    public void setSqft7b(int sqft7b) {
        this.sqft7b = sqft7b;
    }

    public boolean isNumber7BInstallR8DuctingNewHVACCheckBox() {
        return number7BInstallR8DuctingNewHVACCheckBox;
    }

    public void setNumber7BInstallR8DuctingNewHVACCheckBox(boolean number7BInstallR8DuctingNewHVACCheckBox) {
        this.number7BInstallR8DuctingNewHVACCheckBox = number7BInstallR8DuctingNewHVACCheckBox;
    }

    public String getNumber7BInstallR8DuctingNewHVACString() {
        if (this.number7BInstallR8DuctingNewHVACString == null) {
            this.number7BInstallR8DuctingNewHVACString = "0";
        }
        return number7BInstallR8DuctingNewHVACString;
    }

    public void setNumber7BInstallR8DuctingNewHVACString(String number7BInstallR8DuctingNewHVACString) {
        this.number7BInstallR8DuctingNewHVACString = number7BInstallR8DuctingNewHVACString;
    }

    public double getNumber7BInstallR8DuctingNewHVACResult() {
        if (isNumber7BInstallR8DuctingNewHVACCheckBox() == true) {
            this.number7BInstallR8DuctingNewHVACResult = Double.valueOf(getNumber7BInstallR8DuctingNewHVACString()) * sqft7b;
        } else {
            this.number7BInstallR8DuctingNewHVACResult = 0;
        }
        //!!!! Currently bloced
        this.number7BInstallR8DuctingNewHVACResult = 0;
        return number7BInstallR8DuctingNewHVACResult;
    }

    public void setNumber7BInstallR8DuctingNewHVACResult(double number7BInstallR8DuctingNewHVACResult) {
        this.number7BInstallR8DuctingNewHVACResult = number7BInstallR8DuctingNewHVACResult;
    }

    //******************************* 8a. New HVAC System (ERI Private Label) ******************************
    public int getSqft8a() {
        this.sqft8a = 0;
        return sqft8a;
    }

    public void setSqft8a(int sqft8a) {
        this.sqft8a = sqft8a;
    }

    public boolean isNumber8ANewHVACSystemERICheckBox() {
        return number8ANewHVACSystemERICheckBox;
    }

    public void setNumber8ANewHVACSystemERICheckBox(boolean number8ANewHVACSystemERICheckBox) {
        this.number8ANewHVACSystemERICheckBox = number8ANewHVACSystemERICheckBox;
    }

    public String getNumber8ANewHVACSystemERIString() {
        if (this.number8ANewHVACSystemERIString == null) {
            this.number8ANewHVACSystemERIString = "0";
        }
        return number8ANewHVACSystemERIString;
    }

    public void setNumber8ANewHVACSystemERIString(String number8ANewHVACSystemERIString) {
        this.number8ANewHVACSystemERIString = number8ANewHVACSystemERIString;
    }

    public double getNumber8ANewHVACSystemERIResult() {
        if (isNumber8ANewHVACSystemERICheckBox() == true) {
            double k = Math.round(Double.valueOf(Double.valueOf(getNumber8ANewHVACSystemERIString())) * 100);
            this.number8ANewHVACSystemERIResult = k / 100 * 1;
        } else {
            this.number8ANewHVACSystemERIResult = 0;
        }
        return number8ANewHVACSystemERIResult;
    }

    public void setNumber8ANewHVACSystemERIResult(double number8ANewHVACSystemERIResult) {
        this.number8ANewHVACSystemERIResult = number8ANewHVACSystemERIResult;
    }

    //******************************* 8b. New HVAC System (ERI Private Label) ******************************
    public int getSqft8b() {
        return sqft8b;
    }

    public void setSqft8b(int sqft8b) {
        this.sqft8b = sqft8b;
    }

    public boolean isNumber8BNewHVACSystemERIPrivateCheckBox() {
        return number8BNewHVACSystemERIPrivateCheckBox;
    }

    public void setNumber8BNewHVACSystemERIPrivateCheckBox(boolean number8BNewHVACSystemERIPrivateCheckBox) {
        this.number8BNewHVACSystemERIPrivateCheckBox = number8BNewHVACSystemERIPrivateCheckBox;
    }

    public String getNumber8BNewHVACSystemERIPrivateString() {
        if (this.number8BNewHVACSystemERIPrivateString == null) {
            this.number8BNewHVACSystemERIPrivateString = "0";
        }
        return number8BNewHVACSystemERIPrivateString;
    }

    public void setNumber8BNewHVACSystemERIPrivateString(String number8BNewHVACSystemERIPrivateString) {
        this.number8BNewHVACSystemERIPrivateString = number8BNewHVACSystemERIPrivateString;
    }

    public double getNumber8BNewHVACSystemERIPrivateResult() {
        if (isNumber8BNewHVACSystemERIPrivateCheckBox() == true) {
            double k = Math.round(Double.valueOf(getNumber8BNewHVACSystemERIPrivateString()) * 100);
            this.number8BNewHVACSystemERIPrivateResult = k / 100 * 1;
        } else {
            this.number8BNewHVACSystemERIPrivateResult = 0;
        }
        return number8BNewHVACSystemERIPrivateResult;
    }

    public void setNumber8BNewHVACSystemERIPrivateResult(double number8BNewHVACSystemERIPrivateResult) {
        this.number8BNewHVACSystemERIPrivateResult = number8BNewHVACSystemERIPrivateResult;
    }

    //******************************* 8bii. Includes 10 Year Parts and Labor/MERV 11 Filtration/UV Coil ******************************
    public int getSqft8bii() {
        this.sqft8bii = 0;
        return sqft8bii;
    }

    public void setSqft8bii(int sqft8bii) {
        this.sqft8bii = sqft8bii;
    }

    public boolean isNumber8BIIIncludes10YearPartsCheckBox() {
        return number8BIIIncludes10YearPartsCheckBox;
    }

    public void setNumber8BIIIncludes10YearPartsCheckBox(boolean number8BIIIncludes10YearPartsCheckBox) {
        this.number8BIIIncludes10YearPartsCheckBox = number8BIIIncludes10YearPartsCheckBox;
    }

    public String getNumber8BIIIncludes10YearPartsString() {
        if (this.number8BIIIncludes10YearPartsString == null) {
            this.number8BIIIncludes10YearPartsString = "0";
        }
        return number8BIIIncludes10YearPartsString;
    }

    public void setNumber8BIIIncludes10YearPartsString(String number8BIIIncludes10YearPartsString) {
        this.number8BIIIncludes10YearPartsString = number8BIIIncludes10YearPartsString;
    }

    public double getNumber8BIIIncludes10YearPartsResult() {
        if (isNumber8BIIIncludes10YearPartsCheckBox() == true) {
            this.number8BIIIncludes10YearPartsResult = Double.valueOf(getNumber8BIIIncludes10YearPartsString()) * getSqft8bii();
        } else {
            this.number8BIIIncludes10YearPartsResult = 0;
        }
        //Usually = 0, why? I don't know
        this.number8BIIIncludes10YearPartsResult = 0;
        return number8BIIIncludes10YearPartsResult;
    }

    public void setNumber8BIIIncludes10YearPartsResult(double number8BIIIncludes10YearPartsResult) {
        this.number8BIIIncludes10YearPartsResult = number8BIIIncludes10YearPartsResult;
    }

    //******************** 9. Single/Dual Zone HVAC System ***************************
    public int getSqft9() {
        this.sqft9 = 0;
        return sqft9;
    }

    public void setSqft9(int sqft9) {
        this.sqft9 = sqft9;
    }

    public boolean isNumber9SingleDualZoneHVACSystemCheckBox() {
        return number9SingleDualZoneHVACSystemCheckBox;
    }

    public void setNumber9SingleDualZoneHVACSystemCheckBox(boolean number9SingleDualZoneHVACSystemCheckBox) {
        this.number9SingleDualZoneHVACSystemCheckBox = number9SingleDualZoneHVACSystemCheckBox;
    }

    public String getNumber9SingleDualZoneHVACSystemString() {
        if (this.number9SingleDualZoneHVACSystemString == null) {
            this.number9SingleDualZoneHVACSystemString = "0";
        }
        return number9SingleDualZoneHVACSystemString;
    }

    public void setNumber9SingleDualZoneHVACSystemString(String number9SingleDualZoneHVACSystemString) {
        this.number9SingleDualZoneHVACSystemString = number9SingleDualZoneHVACSystemString;
    }

    public double getNumber9SingleDualZoneHVACSystemResult() {
        if (isNumber9SingleDualZoneHVACSystemCheckBox() == true) {
            this.number9SingleDualZoneHVACSystemResult = Double.valueOf(getNumber9SingleDualZoneHVACSystemString()) * 1;
        } else {
            this.number9SingleDualZoneHVACSystemResult = 0;
        }
        return number9SingleDualZoneHVACSystemResult;
    }

    public void setNumber9SingleDualZoneHVACSystemResult(double number9SingleDualZoneHVACSystemResult) {
        this.number9SingleDualZoneHVACSystemResult = number9SingleDualZoneHVACSystemResult;
    }

    //******************** 9.1. Miscellaneous Items HVAC ***************************
    // 91a
    public int getSqft91() {
        return sqft91;
    }

    public void setSqft91(int sqft91) {
        this.sqft91 = sqft91;
    }

    public boolean isNumber91aRelocateCondenserCheckBox() {
        return number91aRelocateCondenserCheckBox;
    }

    public void setNumber91aRelocateCondenserCheckBox(boolean number91aRelocateCondenserCheckBox) {
        this.number91aRelocateCondenserCheckBox = number91aRelocateCondenserCheckBox;
    }

    public int getNumber91aRelocateCondenserInt() {
        return number91aRelocateCondenserInt;
    }

    public void setNumber91aRelocateCondenserInt(int number91aRelocateCondenserInt) {
        this.number91aRelocateCondenserInt = number91aRelocateCondenserInt;
    }

    public double getNumber91aRelocateCondenserResult() {
        if (isNumber91aRelocateCondenserCheckBox() == true) {
            this.number91aRelocateCondenserResult = getNumber91aRelocateCondenserInt();
        } else {
            this.number91aRelocateCondenserResult = 0;
        }
        return number91aRelocateCondenserResult;
    }

    public void setNumber91aRelocateCondenserResult(double number91aRelocateCondenserResult) {
        this.number91aRelocateCondenserResult = number91aRelocateCondenserResult;
    }

    //91b
    public boolean isNumber91bCutInSupplyVentNewDuctCheckBox() {
        return number91bCutInSupplyVentNewDuctCheckBox;
    }

    public void setNumber91bCutInSupplyVentNewDuctCheckBox(boolean number91bCutInSupplyVentNewDuctCheckBox) {
        this.number91bCutInSupplyVentNewDuctCheckBox = number91bCutInSupplyVentNewDuctCheckBox;
    }

    public int getNumber91bCutInSupplyVentNewDuctInt() {
        return number91bCutInSupplyVentNewDuctInt;
    }

    public void setNumber91bCutInSupplyVentNewDuctInt(int number91bCutInSupplyVentNewDuctInt) {
        this.number91bCutInSupplyVentNewDuctInt = number91bCutInSupplyVentNewDuctInt;
    }

    public double getNumber91bCutInSupplyVentNewDuctResult() {
        if (isNumber91bCutInSupplyVentNewDuctCheckBox() == true) {
            this.number91bCutInSupplyVentNewDuctResult = getNumber91bCutInSupplyVentNewDuctInt();
        } else {
            this.number91bCutInSupplyVentNewDuctResult = 0;
        }
        return number91bCutInSupplyVentNewDuctResult;
    }

    public void setNumber91bCutInSupplyVentNewDuctResult(double number91bCutInSupplyVentNewDuctResult) {
        this.number91bCutInSupplyVentNewDuctResult = number91bCutInSupplyVentNewDuctResult;
    }

    // 91c
    public boolean isNumber91cHVACCutInCheckBox() {
        return number91cHVACCutInCheckBox;
    }

    public void setNumber91cHVACCutInCheckBox(boolean number91cHVACCutInCheckBox) {
        this.number91cHVACCutInCheckBox = number91cHVACCutInCheckBox;
    }

    public int getNumber91cHVACCutInInt() {
        return number91cHVACCutInInt;
    }

    public void setNumber91cHVACCutInInt(int number91cHVACCutInInt) {
        this.number91cHVACCutInInt = number91cHVACCutInInt;
    }

    public double getNumber91cHVACCutInResult() {
        if (isNumber91cHVACCutInCheckBox() == true) {
            this.number91cHVACCutInResult = getNumber91cHVACCutInInt();
        } else {
            this.number91cHVACCutInResult = 0;
        }
        return number91cHVACCutInResult;
    }

    public void setNumber91cHVACCutInResult(double number91cHVACCutInResult) {
        this.number91cHVACCutInResult = number91cHVACCutInResult;
    }

    // 91d
    public boolean isNumber91dDuctSealOnlyCheckBox() {
        return number91dDuctSealOnlyCheckBox;
    }

    public void setNumber91dDuctSealOnlyCheckBox(boolean number91dDuctSealOnlyCheckBox) {
        this.number91dDuctSealOnlyCheckBox = number91dDuctSealOnlyCheckBox;
    }

    public int getNumber91dDuctSealOnlyInt() {
        return number91dDuctSealOnlyInt;
    }

    public void setNumber91dDuctSealOnlyInt(int number91dDuctSealOnlyInt) {
        this.number91dDuctSealOnlyInt = number91dDuctSealOnlyInt;
    }

    public double getNumber91dDuctSealOnlyResult() {
        if (isNumber91dDuctSealOnlyCheckBox() == true) {
            this.number91dDuctSealOnlyResult = getNumber91dDuctSealOnlyInt();
        } else {
            this.number91dDuctSealOnlyResult = 0;
        }
        return number91dDuctSealOnlyResult;
    }

    public void setNumber91dDuctSealOnlyResult(double number91dDuctSealOnlyResult) {
        this.number91dDuctSealOnlyResult = number91dDuctSealOnlyResult;
    }

    // 91e
    public boolean isNumber91eNewLineSetCheckBox() {
        return number91eNewLineSetCheckBox;
    }

    public void setNumber91eNewLineSetCheckBox(boolean number91eNewLineSetCheckBox) {
        this.number91eNewLineSetCheckBox = number91eNewLineSetCheckBox;
    }

    public int getNumber91eNewLineSetInt() {
        return number91eNewLineSetInt;
    }

    public void setNumber91eNewLineSetInt(int number91eNewLineSetInt) {
        this.number91eNewLineSetInt = number91eNewLineSetInt;
    }

    public double getNumber91eNewLineSetResult() {
        if (isNumber91eNewLineSetCheckBox() == true) {
            this.number91eNewLineSetResult = getNumber91eNewLineSetInt();
        } else {
            this.number91eNewLineSetResult = 0;
        }
        return number91eNewLineSetResult;
    }

    public void setNumber91eNewLineSetResult(double number91eNewLineSetResult) {
        this.number91eNewLineSetResult = number91eNewLineSetResult;
    }

    //91f
    public boolean isNumber91fEnlargeReturnAirCheckBox() {
        return number91fEnlargeReturnAirCheckBox;
    }

    public void setNumber91fEnlargeReturnAirCheckBox(boolean number91fEnlargeReturnAirCheckBox) {
        this.number91fEnlargeReturnAirCheckBox = number91fEnlargeReturnAirCheckBox;
    }

    public int getNumber91fEnlargeReturnAirInt() {
        return number91fEnlargeReturnAirInt;
    }

    public void setNumber91fEnlargeReturnAirInt(int number91fEnlargeReturnAirInt) {
        this.number91fEnlargeReturnAirInt = number91fEnlargeReturnAirInt;
    }

    public double getNumber91fEnlargeReturnAirResult() {
        if (isNumber91fEnlargeReturnAirCheckBox() == true) {
            this.number91fEnlargeReturnAirResult = getNumber91fEnlargeReturnAirInt();
        } else {
            this.number91fEnlargeReturnAirResult = 0;
        }
        return number91fEnlargeReturnAirResult;
    }

    public void setNumber91fEnlargeReturnAirResult(double number91fEnlargeReturnAirResult) {
        this.number91fEnlargeReturnAirResult = number91fEnlargeReturnAirResult;
    }

    //****************   9.2 notes   **************************************
    public String getNumber92NotesString() {
        return number92NotesString;
    }

    public void setNumber92NotesString(String number92NotesString) {
        this.number92NotesString = number92NotesString;
    }

    public boolean isNumber92NotesCheckBox() {
        return number92NotesCheckBox;
    }

    public void setNumber92NotesCheckBox(boolean number92NotesCheckBox) {
        this.number92NotesCheckBox = number92NotesCheckBox;
    }

    //****************** 9.3 CostPerKW  *****************************
    public boolean isNumber93CostPerKWCheckBox() {
        return number93CostPerKWCheckBox;
    }

    public void setNumber93CostPerKWCheckBox(boolean number93CostPerKWCheckBox) {
        this.number93CostPerKWCheckBox = number93CostPerKWCheckBox;
    }

    public int getNumber93CostPerKWInt() {
        return number93CostPerKWInt;
    }

    public void setNumber93CostPerKWInt(int number93CostPerKWInt) {
        this.number93CostPerKWInt = number93CostPerKWInt;
    }

    public double getNumber93CostPerKWResalt() {
        if (isNumber93CostPerKWCheckBox() == true) {
            this.number93CostPerKWResalt = getNumber93CostPerKWInt();
        } else {
            this.number93CostPerKWResalt = 0;
        }
        return number93CostPerKWResalt;
    }

    public void setNumber93CostPerKWResalt(double number93CostPerKWResalt) {
        this.number93CostPerKWResalt = number93CostPerKWResalt;
    }

    public int getNumber93DCKWsInt() {
        return number93DCKWsInt;
    }

    public void setNumber93DCKWsInt(int number93DCKWsInt) {
        this.number93DCKWsInt = number93DCKWsInt;
    }

    public double getNumber93DCKWsResalt() {
        if (isNumber93CostPerKWCheckBox() == true) {
            this.number93DCKWsResalt = getNumber93DCKWsInt();
        } else {
            this.number93DCKWsResalt = 0;
        }
        return number93DCKWsResalt;
    }

    public void setNumber93DCKWsResalt(double number93DCKWsResalt) {
        this.number93DCKWsResalt = number93DCKWsResalt;
    }

    //***************************** 10. Install Windows:  ******************************************
    public String getNumber10numOfWindows() {
        if (this.number10numOfWindows == null) {
            this.number10numOfWindows = "0";
        }
        return number10numOfWindows;
    }

    public void setNumber10numOfWindows(String number10numOfWindows) {
        this.number10numOfWindows = number10numOfWindows;
    }

    public boolean isNumber10InstallWindowsCheckBox() {
        return number10InstallWindowsCheckBox;
    }

    public void setNumber10InstallWindowsCheckBox(boolean number10InstallWindowsCheckBox) {
        setNumber103AllGlazingCheckBox(number10InstallWindowsCheckBox);
        setNumber104WindowsToMatcCheckBox(number10InstallWindowsCheckBox);
        this.number10InstallWindowsCheckBox = number10InstallWindowsCheckBox;
    }

    public int getNumber10TotalUnitedInchesInt() {
        return number10TotalUnitedInchesInt;
    }

    public void setNumber10TotalUnitedInchesInt(int number10TotalUnitedInchesInt) {
        this.number10TotalUnitedInchesInt = number10TotalUnitedInchesInt;
    }

    public double getNumber10InstallResult() {
        if (isNumber10InstallWindowsCheckBox() == true) {
            this.number10InstallResult = getNumber10TotalUnitedInchesInt() * 4.25;
        } else {
            this.number10InstallResult = 0;
        }
        return number10InstallResult;
    }

    public void setNumber10InstallResult(double number10InstallResult) {
        this.number10InstallResult = number10InstallResult;
    }

    public String getNumber10numOfSliders() {
        if (this.number10numOfSliders == null) {
            this.number10numOfSliders = "0";
        }
        return number10numOfSliders;
    }

    public void setNumber10numOfSliders(String number10numOfSliders) {
        this.number10numOfSliders = number10numOfSliders;
    }

    public String getNumber10LinearFeet() {
        if (this.number10LinearFeet == null) {
            this.number10LinearFeet = "0";
        }
        return number10LinearFeet;
    }

    public void setNumber10LinearFeet(String number10LinearFeet) {
        this.number10LinearFeet = number10LinearFeet;
    }

    public double getNumber10LinearFeetResult() {
        if (isNumber10InstallWindowsCheckBox() == true) {
            this.number10LinearFeetResult = Double.valueOf(getNumber10LinearFeet());
        } else {
            this.number10LinearFeetResult = 0;
        }
        return number10LinearFeetResult;
    }

    public void setNumber10LinearFeetResult(double number10LinearFeetResult) {
        this.number10LinearFeetResult = number10LinearFeetResult;
    }

    //***************************** 101A. Install Windows:  ******************************************
    public boolean isNumber101ACutInDoorCheckBox() {
        return number101ACutInDoorCheckBox;
    }

    public void setNumber101ACutInDoorCheckBox(boolean number101ACutInDoorCheckBox) {
        this.number101ACutInDoorCheckBox = number101ACutInDoorCheckBox;
    }

    public int getNumber101ACutInDoorInt() {
        return number101ACutInDoorInt;
    }

    public void setNumber101ACutInDoorInt(int number101ACutInDoorInt) {
        this.number101ACutInDoorInt = number101ACutInDoorInt;
    }

    public double getNumber101ACutInDoorResult() {
        if (isNumber101ACutInDoorCheckBox() == true) {
            this.number101ACutInDoorResult = getNumber101ACutInDoorInt() * 125;
        } else {
            this.number101ACutInDoorResult = 0;
        }
        return number101ACutInDoorResult;
    }

    public void setNumber101ACutInDoorResult(double number101ACutInDoorResult) {
        this.number101ACutInDoorResult = number101ACutInDoorResult;
    }

    //***************************** 101B. Add Header:  ******************************************
    public boolean isNumber101BAddHeaderCheckBox() {
        return number101BAddHeaderCheckBox;
    }

    public void setNumber101BAddHeaderCheckBox(boolean number101BAddHeaderCheckBox) {
        this.number101BAddHeaderCheckBox = number101BAddHeaderCheckBox;
    }

    public int getNumber101BAddHeaderInt() {
        return number101BAddHeaderInt;
    }

    public void setNumber101BAddHeaderInt(int number101BAddHeaderInt) {
        this.number101BAddHeaderInt = number101BAddHeaderInt;
    }

    public double getNumber101BAddHeaderResult() {
        if (isNumber101BAddHeaderCheckBox() == true) {
            this.number101BAddHeaderResult = getNumber101BAddHeaderInt() * 100;
        } else {
            this.number101BAddHeaderResult = 0;
        }
        return number101BAddHeaderResult;
    }

    public void setNumber101BAddHeaderResult(double number101BAddHeaderResult) {
        this.number101BAddHeaderResult = number101BAddHeaderResult;
    }

    //***************************** 102B Misc. Items (Windows, Bulk)  ******************************************
    public boolean isNumber102ACutDownWindowCheckBox() {
        return number102ACutDownWindowCheckBox;
    }

    public void setNumber102ACutDownWindowCheckBox(boolean number102ACutDownWindowCheckBox) {
        this.number102ACutDownWindowCheckBox = number102ACutDownWindowCheckBox;
    }

    public double getNumber102ACutDownWindowResult() {
        if (isNumber102ACutDownWindowCheckBox() == true) {
            this.number102ACutDownWindowResult = 400;
        } else {
            this.number102ACutDownWindowResult = 0;
        }
        return number102ACutDownWindowResult;
    }

    public void setNumber102ACutDownWindowResult(double number102ACutDownWindowResult) {
        this.number102ACutDownWindowResult = number102ACutDownWindowResult;
    }

    public boolean isNumber102BElectricalReroutesCheckBox() {
        return number102BElectricalReroutesCheckBox;
    }

    public void setNumber102BElectricalReroutesCheckBox(boolean number102BElectricalReroutesCheckBox) {
        this.number102BElectricalReroutesCheckBox = number102BElectricalReroutesCheckBox;
    }

    public double getNumber102BElectricalReroutesResult() {
        if (isNumber102BElectricalReroutesCheckBox() == true) {
            this.number102BElectricalReroutesResult = 200;
        } else {
            this.number102BElectricalReroutesResult = 0;
        }
        return number102BElectricalReroutesResult;
    }

    public void setNumber102BElectricalReroutesResult(double number102BElectricalReroutesResult) {
        this.number102BElectricalReroutesResult = number102BElectricalReroutesResult;
    }

    public boolean isNumber102CGardenWindow4CheckBox() {
        return number102CGardenWindow4CheckBox;
    }

    public void setNumber102CGardenWindow4CheckBox(boolean number102CGardenWindow4CheckBox) {
        this.number102CGardenWindow4CheckBox = number102CGardenWindow4CheckBox;
    }

    public double getNumber102CGardenWindow4Result() {
        if (isNumber102CGardenWindow4CheckBox() == true) {
            this.number102CGardenWindow4Result = 1200;
        } else {
            this.number102CGardenWindow4Result = 0;
        }
        return number102CGardenWindow4Result;
    }

    public void setNumber102CGardenWindow4Result(double number102CGardenWindow4Result) {
        this.number102CGardenWindow4Result = number102CGardenWindow4Result;
    }

    public boolean isNumber102DGardenWindow6CheckBox() {
        return number102DGardenWindow6CheckBox;
    }

    public void setNumber102DGardenWindow6CheckBox(boolean number102DGardenWindow6CheckBox) {
        this.number102DGardenWindow6CheckBox = number102DGardenWindow6CheckBox;
    }

    public double getNumber102DGardenWindow6Result() {
        if (isNumber102DGardenWindow6CheckBox() == true) {
            this.number102DGardenWindow6Result = 1400;
        } else {
            this.number102DGardenWindow6Result = 0;
        }
        return number102DGardenWindow6Result;
    }

    public void setNumber102DGardenWindow6Result(double number102DGardenWindow6Result) {
        this.number102DGardenWindow6Result = number102DGardenWindow6Result;
    }

    //******************************** 103 + 104 *************************************
    public boolean isNumber103AllGlazingCheckBox() {
        return number103AllGlazingCheckBox;
    }

    public void setNumber103AllGlazingCheckBox(boolean number103AllGlazingCheckBox) {
        this.number103AllGlazingCheckBox = number103AllGlazingCheckBox;
    }

    public boolean isNumber104WindowsToMatcCheckBox() {
        return number104WindowsToMatcCheckBox;
    }

    public void setNumber104WindowsToMatcCheckBox(boolean number104WindowsToMatcCheckBox) {
        this.number104WindowsToMatcCheckBox = number104WindowsToMatcCheckBox;
    }

    //******************************** 11 Install Pool Pump *************************************
    public boolean isNumber11InstallPoolPumpCheckBox() {
        return number11InstallPoolPumpCheckBox;
    }

    public void setNumber11InstallPoolPumpCheckBox(boolean number11InstallPoolPumpCheckBox) {
        this.number11InstallPoolPumpCheckBox = number11InstallPoolPumpCheckBox;
    }

    public double getNumber11InstallPoolPumpResult() {
        if (isNumber11InstallPoolPumpCheckBox() == true) {
            this.number11InstallPoolPumpResult = 1500;
        } else {
            this.number11InstallPoolPumpResult = 0;
        }
        return number11InstallPoolPumpResult;
    }

    public void setNumber11InstallPoolPumpResult(double number11InstallPoolPumpResult) {
        this.number11InstallPoolPumpResult = number11InstallPoolPumpResult;
    }

    //******************************** 12 Install Whole House Fan *************************************
    public boolean isNumber12InstallWholeHouseFanCheckBox() {
        return number12InstallWholeHouseFanCheckBox;
    }

    public void setNumber12InstallWholeHouseFanCheckBox(boolean number12InstallWholeHouseFanCheckBox) {
        this.number12InstallWholeHouseFanCheckBox = number12InstallWholeHouseFanCheckBox;
    }

    public int getNumber12InstallWholeHouseFanInt() {
        return number12InstallWholeHouseFanInt;
    }

    public void setNumber12InstallWholeHouseFanInt(int number12InstallWholeHouseFanInt) {
        this.number12InstallWholeHouseFanInt = number12InstallWholeHouseFanInt;
    }

    public double getNumber12InstallWholeHouseFanResult() {
        if (isNumber12InstallWholeHouseFanCheckBox() == true) {
            this.number12InstallWholeHouseFanResult = getNumber12InstallWholeHouseFanInt();
        } else {
            this.number12InstallWholeHouseFanResult = 0;
        }
        return number12InstallWholeHouseFanResult;
    }

    public void setNumber12InstallWholeHouseFanResult(double number12InstallWholeHouseFanResult) {
        this.number12InstallWholeHouseFanResult = number12InstallWholeHouseFanResult;
    }

    //******************************** 13 Install Water Heater *************************************
    public boolean isNumber13InstallWaterHeaterCheckBox() {
        return number13InstallWaterHeaterCheckBox;
    }

    public void setNumber13InstallWaterHeaterCheckBox(boolean number13InstallWaterHeaterCheckBox) {
        this.number13InstallWaterHeaterCheckBox = number13InstallWaterHeaterCheckBox;
    }

    public double getNumber13InstallWaterHeaterDouble() {
        return number13InstallWaterHeaterDouble;
    }

    public void setNumber13InstallWaterHeaterDouble(double number13InstallWaterHeaterDouble) {
        this.number13InstallWaterHeaterDouble = number13InstallWaterHeaterDouble;
    }

    public double getNumber13InstallWaterHeaterResult() {
        if (isNumber13InstallWaterHeaterCheckBox() == true) {
            double k = Math.round(this.number13InstallWaterHeaterDouble);
            this.number13InstallWaterHeaterResult = k;
        } else {
            this.number13InstallWaterHeaterResult = 0;
        }
        return number13InstallWaterHeaterResult;
    }

    public void setNumber13InstallWaterHeaterResult(double number13InstallWaterHeaterResult) {
        this.number13InstallWaterHeaterResult = number13InstallWaterHeaterResult;
    }

    //******************************** 14 Permits *************************************
    public boolean isNumber14PermitsCheckBox() {
        return number14PermitsCheckBox;
    }

    public void setNumber14PermitsCheckBox(boolean number14PermitsCheckBox) {
        this.number14PermitsCheckBox = number14PermitsCheckBox;
    }

    public double getNumber14PermitsResult() {
        this.number14PermitsResult = 0;
        return number14PermitsResult;
    }

    public void setNumber14PermitsResult(double number14PermitsResult) {
        this.number14PermitsResult = number14PermitsResult;
    }

    //******************************** 15 Install battery-operated CO and smoke detectors as needed *************************************
    public boolean isNumber15InstallBatteryOperatedCheckBox() {
        return number15InstallBatteryOperatedCheckBox;
    }

    public void setNumber15InstallBatteryOperatedCheckBox(boolean number15InstallBatteryOperatedCheckBox) {
        this.number15InstallBatteryOperatedCheckBox = number15InstallBatteryOperatedCheckBox;
    }

    public double getNumber15InstallBatteryOperatedResult() {
        this.number15InstallBatteryOperatedResult = 0;
        return number15InstallBatteryOperatedResult;
    }

    public void setNumber15InstallBatteryOperatedResult(double number15InstallBatteryOperatedResult) {
        this.number15InstallBatteryOperatedResult = number15InstallBatteryOperatedResult;
    }

    //******************************** 15A Install KW DC Solar System *************************************
    public boolean isNumber15AInstallKWDCSolarSystemCheckBox() {
        return number15AInstallKWDCSolarSystemCheckBox;
    }

    public void setNumber15AInstallKWDCSolarSystemCheckBox(boolean number15AInstallKWDCSolarSystemCheckBox) {
        this.number15AInstallKWDCSolarSystemCheckBox = number15AInstallKWDCSolarSystemCheckBox;
    }

    public int getNumber15aInstallKWDCSolarSystemInt() {
        return number15aInstallKWDCSolarSystemInt;
    }

    public void setNumber15aInstallKWDCSolarSystemInt(int number15aInstallKWDCSolarSystemInt) {
        this.number15aInstallKWDCSolarSystemInt = number15aInstallKWDCSolarSystemInt;
    }

    //******************************** 15B-F *************************************
    public boolean isNumber15BIncludesExtrudedAluminumCheckBox() {
        return number15BIncludesExtrudedAluminumCheckBox;
    }

    public void setNumber15BIncludesExtrudedAluminumCheckBox(boolean number15BIncludesExtrudedAluminumCheckBox) {
        this.number15BIncludesExtrudedAluminumCheckBox = number15BIncludesExtrudedAluminumCheckBox;
    }

    public boolean isNumber15CSolarEdgeWithPowerOptimizersCheckBox() {
        return number15CSolarEdgeWithPowerOptimizersCheckBox;
    }

    public void setNumber15CSolarEdgeWithPowerOptimizersCheckBox(boolean number15CSolarEdgeWithPowerOptimizersCheckBox) {
        this.number15CSolarEdgeWithPowerOptimizersCheckBox = number15CSolarEdgeWithPowerOptimizersCheckBox;
    }

    public boolean isNumber15DIncludesSystemPVProductionCheckBox() {
        return number15DIncludesSystemPVProductionCheckBox;
    }

    public void setNumber15DIncludesSystemPVProductionCheckBox(boolean number15DIncludesSystemPVProductionCheckBox) {
        this.number15DIncludesSystemPVProductionCheckBox = number15DIncludesSystemPVProductionCheckBox;
    }

    public boolean isNumber15EIncludesAllPermitsCheckBox() {
        return number15EIncludesAllPermitsCheckBox;
    }

    public void setNumber15EIncludesAllPermitsCheckBox(boolean number15EIncludesAllPermitsCheckBox) {
        this.number15EIncludesAllPermitsCheckBox = number15EIncludesAllPermitsCheckBox;
    }

    public boolean isNumber15FCanadianSolar270WattCheckBox() {
        return number15FCanadianSolar270WattCheckBox;
    }

    public void setNumber15FCanadianSolar270WattCheckBox(boolean number15FCanadianSolar270WattCheckBox) {
        this.number15FCanadianSolar270WattCheckBox = number15FCanadianSolar270WattCheckBox;
    }

    //*********************************************************************

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String CaseId) {
        this.caseId = CaseId;
    }
    
    public double getTotal() {
        this.total = getNumber1InsulatAtticBlownResult() + getNumber2RemoveAndReplaceResult()
                + getNumber3InstallBattedInsulationResult() + getNumber4SealDuctingCodeComplianceResult()
                + getNumber5AirSealPackageResult() + getNumber6CAZAreaReportResult()
                + getNumber7AInstallDuctingStandaloneResult() + getNumber7BInstallR8DuctingNewHVACResult()
                + getNumber8ANewHVACSystemERIResult() + getNumber8BNewHVACSystemERIPrivateResult()
                + getNumber8BIIIncludes10YearPartsResult() + getNumber9SingleDualZoneHVACSystemResult()
                + getNumber91aRelocateCondenserResult() + getNumber91bCutInSupplyVentNewDuctResult()
                + getNumber91cHVACCutInResult() + getNumber91dDuctSealOnlyResult()
                + getNumber91eNewLineSetResult() + getNumber91fEnlargeReturnAirResult()
                + getNumber10InstallResult() + getNumber10LinearFeetResult() + getNumber101ACutInDoorResult()
                + getNumber101BAddHeaderResult() + getNumber102ACutDownWindowResult() + getNumber102BElectricalReroutesResult()
                + getNumber102CGardenWindow4Result() + getNumber102DGardenWindow6Result() + getNumber11InstallPoolPumpResult()
                + getNumber12InstallWholeHouseFanResult() + getNumber13InstallWaterHeaterResult() + getNumber14PermitsResult()
                + getNumber15InstallBatteryOperatedResult();
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getWholeCost() {
        return wholeCost;
    }

    public void setWholeCost(double wholeCost) {
        this.wholeCost = wholeCost;
    }

    public double getSolarCost() {
        return solarCost;
    }

    public void setSolarCost(double solarCost) {
        this.solarCost = solarCost;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getNew1() {
        return new1;
    }

    public void setNew1(int new1) {
        this.new1 = new1;
    }

    //************************************************
    public String goToDashboard() {
        return "dashboard.xhtml";
    }

    //************************************************
    public void cleanMeasureBean() {

        setTotal(0);
        setCustomerID(0);

        setNumber1InsulatAtticBlownCheckBox(false);
        setNumber1InsulatAtticBlownString("");
        setSqft1(0);
        setNumber1InsulatAtticBlownResult(0);

        setNumber2RemoveAndReplaceCheckBox(false);
        setSqft2(0);
        setNumber2RemoveAndReplaceResult(0);

        setNumber3InstallBattedInsulationCheckBox(false);
        setSqft3(0);
        setNumber3InstallBattedInsulationResult(0);

        setNumber4SealDuctingCodeComplianceCheckBox(false);
        setNumber4SealDuctingCodeComplianceString("");
        setSqft4(0);
        setNumber4SealDuctingCodeComplianceResult(0);

        setSqft5(0);
        setNumber5AirSealPackageCheckBox(false);
        setNumber5AirSealPackageString("");
        setNumber5AirSealPackageResult(0);

        setSqft6(0);
        setNumber6CAZAreaReportCheckBox(false);
        setNumber6CAZAreaReportString("");
        setNumber6CAZAreaReportResult(0);

        setSqft7a(0);
        setNumber7AInstallDuctingStandaloneCheckBox(false);
        setNumber7AInstallDuctingStandaloneString("");
        setNumber7AInstallDuctingStandaloneResult(0);

        setSqft7b(0);
        setNumber7BInstallR8DuctingNewHVACCheckBox(false);
        setNumber7BInstallR8DuctingNewHVACString("");
        setNumber7BInstallR8DuctingNewHVACResult(0);

        setSqft8a(0);
        setNumber8ANewHVACSystemERICheckBox(false);
        setNumber8ANewHVACSystemERIString("");
        setNumber8ANewHVACSystemERIResult(0);

        setSqft8b(0);
        setNumber8BNewHVACSystemERIPrivateCheckBox(false);
        setNumber8BNewHVACSystemERIPrivateString("");
        setNumber8BNewHVACSystemERIPrivateResult(0);

        setSqft8bii(0);
        setNumber8BIIIncludes10YearPartsCheckBox(false);
        setNumber8BIIIncludes10YearPartsString("");
        setNumber8BIIIncludes10YearPartsResult(0);

        setSqft9(0);
        setNumber9SingleDualZoneHVACSystemCheckBox(false);
        setNumber9SingleDualZoneHVACSystemString("");
        setNumber9SingleDualZoneHVACSystemResult(0);

        setSqft91(0);
        setNumber91aRelocateCondenserCheckBox(false);
        setNumber91aRelocateCondenserInt(0);
        setNumber91aRelocateCondenserResult(0);

        setNumber91bCutInSupplyVentNewDuctCheckBox(false);
        setNumber91bCutInSupplyVentNewDuctInt(0);
        setNumber91bCutInSupplyVentNewDuctResult(0);

        setNumber91cHVACCutInCheckBox(false);
        setNumber91cHVACCutInInt(0);
        setNumber91cHVACCutInResult(0);

        setNumber91dDuctSealOnlyCheckBox(false);
        setNumber91dDuctSealOnlyInt(0);
        setNumber91dDuctSealOnlyResult(0);

        setNumber91eNewLineSetCheckBox(false);
        setNumber91eNewLineSetInt(0);
        setNumber91eNewLineSetResult(0);

        setNumber91fEnlargeReturnAirCheckBox(false);
        setNumber91fEnlargeReturnAirInt(0);
        setNumber91fEnlargeReturnAirResult(0);

        setNumber92NotesCheckBox(false);
        setNumber92NotesString("");

        setNumber93CostPerKWCheckBox(false);
        setNumber93CostPerKWInt(0);
        setNumber93CostPerKWResalt(0);
        setNumber93DCKWsInt(0);
        setNumber93DCKWsResalt(0);

        setNumber10InstallWindowsCheckBox(false);
        setNumber10numOfWindows("");
        setNumber10TotalUnitedInchesInt(0);
        setNumber10InstallResult(0);
        setNumber10numOfSliders("");
        setNumber10LinearFeet("");
        setNumber10LinearFeetResult(0);

        setNumber101ACutInDoorCheckBox(false);
        setNumber101ACutInDoorInt(0);
        setNumber101ACutInDoorResult(0);

        setNumber101BAddHeaderCheckBox(false);
        setNumber101BAddHeaderInt(0);
        setNumber101BAddHeaderResult(0);

        setNumber102ACutDownWindowCheckBox(false);
        setNumber102ACutDownWindowResult(0);

        setNumber102BElectricalReroutesCheckBox(false);
        setNumber102BElectricalReroutesResult(0);

        setNumber102CGardenWindow4CheckBox(false);
        setNumber102CGardenWindow4Result(0);

        setNumber102DGardenWindow6CheckBox(false);
        setNumber102DGardenWindow6Result(0);

        setNumber103AllGlazingCheckBox(false);
        setNumber104WindowsToMatcCheckBox(false);

        setNumber11InstallPoolPumpCheckBox(false);
        setNumber11InstallPoolPumpResult(0);

        setNumber12InstallWholeHouseFanCheckBox(false);
        setNumber12InstallWholeHouseFanInt(0);
        setNumber12InstallWholeHouseFanResult(0);

        setNumber13InstallWaterHeaterCheckBox(false);
        setNumber13InstallWaterHeaterDouble(0);
        setNumber13InstallWaterHeaterResult(0);

        setNumber14PermitsCheckBox(false);
        setNumber14PermitsResult(0);

        setNumber15InstallBatteryOperatedCheckBox(false);
        setNumber15InstallBatteryOperatedResult(0);

        setNumber15AInstallKWDCSolarSystemCheckBox(false);
        setNumber15aInstallKWDCSolarSystemInt(0);

        setNumber15BIncludesExtrudedAluminumCheckBox(false);
        setNumber15CSolarEdgeWithPowerOptimizersCheckBox(false);
        setNumber15DIncludesSystemPVProductionCheckBox(false);
        setNumber15EIncludesAllPermitsCheckBox(false);
        setNumber15FCanadianSolar270WattCheckBox(false);

        // Calculate whole cost
//    private double wholeCost;
//    private double solarCost;
    }

    public void receiveMeasureByCaseId(String caseId) {
        
        MeasureEntity measureEntity = measureManage.receiveMeasureByCaseID(caseId);
        
        setCaseId(measureEntity.getCaseId());
        setTotal(measureEntity.getTotal());
        setCustomerID(measureEntity.getCustomerid());

        setNumber1InsulatAtticBlownCheckBox(measureEntity.getNumber1insulatatticblownche() == 1);
        setNumber1InsulatAtticBlownString(measureEntity.getNumber1insulatatticblownstring());
        setSqft1(measureEntity.getSqft1());
        setNumber1InsulatAtticBlownResult(measureEntity.getNumber1insulatatticblownresult());

        setNumber2RemoveAndReplaceCheckBox(measureEntity.getNumber2removeandreplaceche() == 1);
        setSqft2(measureEntity.getSqft2());
        setNumber2RemoveAndReplaceResult(measureEntity.getNumber2removeandreplaceresult());

        setNumber3InstallBattedInsulationCheckBox(measureEntity.getNumber3installbattedinionche() == 1);
        setSqft3(measureEntity.getSqft3());
        setNumber3InstallBattedInsulationResult(measureEntity.getNumber3installbattedinresult());

        setNumber4SealDuctingCodeComplianceCheckBox(measureEntity.getNumber4sealductingcodcheckbox() == 1);
        setNumber4SealDuctingCodeComplianceString(measureEntity.getNumber4sealductingcodecstring());
        setSqft4(measureEntity.getSqft4());
        setNumber4SealDuctingCodeComplianceResult(measureEntity.getNumber4sealductingcoderesult());

        setSqft5(measureEntity.getSqft5());
        setNumber5AirSealPackageCheckBox(measureEntity.getNumber5airsealpcheckbox() == 1);
        setNumber5AirSealPackageString(measureEntity.getNumber5airsealstring());
        setNumber5AirSealPackageResult(measureEntity.getNumber5airsealparesult());

        setSqft6(measureEntity.getSqft6());
        setNumber6CAZAreaReportCheckBox(measureEntity.getNumber6cazarearecheckbox() == 1);
        setNumber6CAZAreaReportString(measureEntity.getNumber6cazareatstring());
        setNumber6CAZAreaReportResult(measureEntity.getNumber6cazarearesult());

        setSqft7a(measureEntity.getSqft7a());
        setNumber7AInstallDuctingStandaloneCheckBox(measureEntity.getNumber7ainstallductingcheckbox() == 1);
        setNumber7AInstallDuctingStandaloneString(measureEntity.getNumber7ainstallductingstring());
        setNumber7AInstallDuctingStandaloneResult(measureEntity.getNumber7ainstallductingresult());

        setSqft7b(measureEntity.getSqft7b());
        setNumber7BInstallR8DuctingNewHVACCheckBox(measureEntity.getNumber7binstallr8ducheckbox() == 1);
        setNumber7BInstallR8DuctingNewHVACString(measureEntity.getNumber7binstallr8ductstring());
        setNumber7BInstallR8DuctingNewHVACResult(measureEntity.getNumber7binstallr8ductresult());

        setSqft8a(measureEntity.getSqft8a());
        setNumber8ANewHVACSystemERICheckBox(measureEntity.getNumber8anewhvacicheckbox() == 1);
        setNumber8ANewHVACSystemERIString(measureEntity.getNumber8anewhvacstring());
        setNumber8ANewHVACSystemERIResult(measureEntity.getNumber8anewhvaresult());

        setSqft8b(measureEntity.getSqft8b());
        setNumber8BNewHVACSystemERIPrivateCheckBox(measureEntity.getNumber8biiincludecheckbox() == 1);
        setNumber8BNewHVACSystemERIPrivateString(measureEntity.getNumber8bnewhvacsysstring());
        setNumber8BNewHVACSystemERIPrivateResult(measureEntity.getNumber8bnewhvacsyresult());

        setSqft8bii(measureEntity.getSqft8bii());
        setNumber8BIIIncludes10YearPartsCheckBox(measureEntity.getNumber8biiincludecheckbox() == 1);
        setNumber8BIIIncludes10YearPartsString(measureEntity.getNumber8biiincludestring());
        setNumber8BIIIncludes10YearPartsResult(measureEntity.getNumber8biiincludresult());

        setSqft9(measureEntity.getSqft9());
        setNumber9SingleDualZoneHVACSystemCheckBox(measureEntity.getNumber91arelocheckbox() == 1);
        setNumber9SingleDualZoneHVACSystemString(measureEntity.getNumber9singledualzostring());
        setNumber9SingleDualZoneHVACSystemResult(measureEntity.getNumber9singledresult());

        setSqft91(measureEntity.getSqft91());
        setNumber91aRelocateCondenserCheckBox(measureEntity.getNumber91arelocheckbox() == 1);
        setNumber91aRelocateCondenserInt(measureEntity.getNumber91areloint());
        setNumber91aRelocateCondenserResult(measureEntity.getNumber91arelocresult());

        setNumber91bCutInSupplyVentNewDuctCheckBox(measureEntity.getNumber91bcutinsupplyvcheckbox() == 1);
        setNumber91bCutInSupplyVentNewDuctInt(measureEntity.getNumber91bcutinsupplyint());
        setNumber91bCutInSupplyVentNewDuctResult(measureEntity.getNumber91bcutinsupplyvresult());

        setNumber91cHVACCutInCheckBox(measureEntity.getNumber91chcheckbox() == 1);
        setNumber91cHVACCutInInt(measureEntity.getNumber91chvaint());
        setNumber91cHVACCutInResult(measureEntity.getNumber91chvaccutinresult());

        setNumber91dDuctSealOnlyCheckBox(measureEntity.getNumber91dducheckbox() == 1);
        setNumber91dDuctSealOnlyInt(measureEntity.getNumber91dducint());
        setNumber91dDuctSealOnlyResult(measureEntity.getNumber91dductresult());

        setNumber91eNewLineSetCheckBox(measureEntity.getNumber91enecheckbox() == 1);
        setNumber91eNewLineSetInt(measureEntity.getNumber91eneint());
        setNumber91eNewLineSetResult(measureEntity.getNumber91eneresult());

        setNumber91fEnlargeReturnAirCheckBox(measureEntity.getNumber91fenlacheckbox() == 1);
        setNumber91fEnlargeReturnAirInt(measureEntity.getNumber91fenlargint());
        setNumber91fEnlargeReturnAirResult(measureEntity.getNumber91fenlargerresult());

        setNumber92NotesCheckBox(measureEntity.getNumber92notescheckbox() == 1);
        setNumber92NotesString(measureEntity.getNumber92notesstring());

        setNumber93CostPerKWCheckBox(measureEntity.getNumber93costperkwcheckbox() == 1);
        setNumber93CostPerKWInt(measureEntity.getNumber93costperkwint());
        setNumber93CostPerKWResalt(measureEntity.getNumber93costperkwresalt());
        setNumber93DCKWsInt(measureEntity.getNumber93dckwsint());
        setNumber93DCKWsResalt(measureEntity.getNumber93dckwsresalt());

        setNumber10InstallWindowsCheckBox(measureEntity.getNumber101acutindoorcheckbox() == 1);
        setNumber10numOfWindows(measureEntity.getNumber10numofwindows());
        setNumber10TotalUnitedInchesInt(measureEntity.getNumber10totalunitedinchesint());
        setNumber10InstallResult(measureEntity.getNumber10installresult());
        setNumber10numOfSliders(measureEntity.getNumber10numofsliders());
        setNumber10LinearFeet(measureEntity.getNumber10linearfeet());
        setNumber10LinearFeetResult(measureEntity.getNumber10linearfeetresult());

        setNumber101ACutInDoorCheckBox(measureEntity.getNumber101acutindoorcheckbox() == 1);
        setNumber101ACutInDoorInt(measureEntity.getNumber101acutindoorint());
        setNumber101ACutInDoorResult(measureEntity.getNumber101acutindoorresult());

        setNumber101BAddHeaderCheckBox(measureEntity.getNumber101baddheadercheckbox() == 1);
        setNumber101BAddHeaderInt(measureEntity.getNumber101baddheaderint());
        setNumber101BAddHeaderResult(measureEntity.getNumber101baddheaderresult());

        setNumber102ACutDownWindowCheckBox(measureEntity.getNumber102acutdowncheckbox() == 1);
        setNumber102ACutDownWindowResult(measureEntity.getNumber102acutdownwiresult());

        setNumber102BElectricalReroutesCheckBox(measureEntity.getNumber102belectricalcheckbox() == 1);
        setNumber102BElectricalReroutesResult(measureEntity.getNumber102belectricalreresult());

        setNumber102CGardenWindow4CheckBox(measureEntity.getNumber102cgardencheckbox() == 1);
        setNumber102CGardenWindow4Result(measureEntity.getNumber102cgardenresult());

        setNumber102DGardenWindow6CheckBox(measureEntity.getNumber102dgardenwicheckbox() == 1);
        setNumber102DGardenWindow6Result(measureEntity.getNumber102dgardenwiresult());

        setNumber103AllGlazingCheckBox(measureEntity.getNumber103allglazingcheckbox() == 1);
        setNumber104WindowsToMatcCheckBox(measureEntity.getNumber104wicheckbox() == 1);

        setNumber11InstallPoolPumpCheckBox(measureEntity.getNumber11installpoolcheckbox() == 1);
        setNumber11InstallPoolPumpResult(measureEntity.getNumber11installpoolpumpresult());

        setNumber12InstallWholeHouseFanCheckBox(measureEntity.getNumber12installwholecheckbox() == 1);
        setNumber12InstallWholeHouseFanInt(measureEntity.getNumber12installwholehoint());
        setNumber12InstallWholeHouseFanResult(measureEntity.getNumber12installwholehoresult());

        setNumber13InstallWaterHeaterCheckBox(measureEntity.getNumber13installwacheckbox() == 1);
        setNumber13InstallWaterHeaterDouble(measureEntity.getNumber13installwaterhedouble());
        setNumber13InstallWaterHeaterResult(measureEntity.getNumber13installwaresult());

        setNumber14PermitsCheckBox(measureEntity.getNumber14permitscheckbox() == 1);
        setNumber14PermitsResult(measureEntity.getNumber14permitsresult());

        setNumber15InstallBatteryOperatedCheckBox(measureEntity.getNumber15installbatterycheckbox() == 1);
        setNumber15InstallBatteryOperatedResult(measureEntity.getNumber15installbaresult());

        setNumber15AInstallKWDCSolarSystemCheckBox(measureEntity.getNumber15ainstallkwdcsocheckbox() == 1);
        setNumber15aInstallKWDCSolarSystemInt(measureEntity.getNumber15ainstallkwdcsoint());

        setNumber15BIncludesExtrudedAluminumCheckBox(measureEntity.getNumber15bincludesexcheckbox() == 1);
        setNumber15CSolarEdgeWithPowerOptimizersCheckBox(measureEntity.getNumber15csolarcheckbox() == 1);
        setNumber15DIncludesSystemPVProductionCheckBox(measureEntity.getNumber15dincludessycheckbox() == 1);
        setNumber15EIncludesAllPermitsCheckBox(measureEntity.getNumber15eicheckbox() == 1);
        setNumber15FCanadianSolar270WattCheckBox(measureEntity.getNumber15fcanadiansocheckbox() == 1);
        
    }
    
}
