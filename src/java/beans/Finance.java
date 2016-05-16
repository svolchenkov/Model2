/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

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

    private String receivingDraftAgreement3String;
    private boolean receivingDraftAgreement3CheckBox;
    private String receivingDraftAgreement3Done;

    private Date gatheringDOBSSN4Date;
    private String gatheringDOBSSN4String;
    private boolean gatheringDOBSSN4CheckBox;
    private String gatheringDOBSSN4Done;

    private UploadedFile signingERIAgeement5FileUpload;
    private String signingERIAgeement5String;
    private boolean signingERIAgeement5CheckBox;
    private String signingERIAgeement5Done;

    private String applyToFinancing6String;
    private boolean applyToFinancing6CheckBox;
    private String applyToFinancing6Done;

    private UploadedFile financingDocsReceived7FileUpload;
    private String financingDocsReceived7String;
    private boolean financingDocsReceived7CheckBox;
    private String financingDocsReceived7Done;

    private Date scheduleAppointmentByCustomer8Date;
    private String scheduleAppointmentByCustomer8String;
    private boolean scheduleAppointmentByCustomer8CheckBox;
    private String scheduleAppointmentByCustomer8Done;

    private UploadedFile signingContractByCustomer9FileUpload;
    private String signingContractByCustomer9String;
    private boolean signingContractByCustomer9CheckBox;
    private String signingContractByCustomer9Done;

    private String allDocsCompleted10String;
    private boolean allDocsCompleted10CheckBox;
    private String allDocsCompleted10Done;
    
    private String noticeToProceed11String;
    private boolean noticeToProceed11CheckBox;
    private String noticeToProceed11Done;
    
    private String giveNForConcierge12String;
    private boolean giveNForConcierge12CheckBox;
    private String giveNForConcierge12Done;

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
        states.put(10, "All docs completed");
        states.put(11, "Notice to proceed");
        states.put(12, "give # for concierge");
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
    
    //********************* 3.Receiving draft agreement  *********************

    public String getReceivingDraftAgreement3String() {
        return receivingDraftAgreement3String;
    }

    public void setReceivingDraftAgreement3String(String receivingDraftAgreement3String) {
        this.receivingDraftAgreement3String = receivingDraftAgreement3String;
    }

    public boolean isReceivingDraftAgreement3CheckBox() {
        return receivingDraftAgreement3CheckBox;
    }

    public void setReceivingDraftAgreement3CheckBox(boolean receivingDraftAgreement3CheckBox) {
        this.receivingDraftAgreement3CheckBox = receivingDraftAgreement3CheckBox;
    }

    public String getReceivingDraftAgreement3Done() {
        if ( isReceivingDraftAgreement3CheckBox() == true ) {
            receivingDraftAgreement3Done = "done";
        } else {
            receivingDraftAgreement3Done = "";
        }
        return receivingDraftAgreement3Done;
    }

    public void setReceivingDraftAgreement3Done(String receivingDraftAgreement3Done) {
        this.receivingDraftAgreement3Done = receivingDraftAgreement3Done;
    }
    
    //************************** 4.Gathering DOB, SS# ************************

    public Date getGatheringDOBSSN4Date() {
        return gatheringDOBSSN4Date;
    }

    public void setGatheringDOBSSN4Date(Date gatheringDOBSSN4Date) {
        this.gatheringDOBSSN4Date = gatheringDOBSSN4Date;
    }

    public String getGatheringDOBSSN4String() {
        return gatheringDOBSSN4String;
    }

    public void setGatheringDOBSSN4String(String gatheringDOBSSN4String) {
        this.gatheringDOBSSN4String = gatheringDOBSSN4String;
    }

    public boolean isGatheringDOBSSN4CheckBox() {
        return gatheringDOBSSN4CheckBox;
    }

    public void setGatheringDOBSSN4CheckBox(boolean gatheringDOBSSN4CheckBox) {
        this.gatheringDOBSSN4CheckBox = gatheringDOBSSN4CheckBox;
    }

    public String getGatheringDOBSSN4Done() {
        if ( isGatheringDOBSSN4CheckBox() == true ) {
            gatheringDOBSSN4Done = "done";
        } else {
            gatheringDOBSSN4Done = "";
        }
        return gatheringDOBSSN4Done;
    }

    public void setGatheringDOBSSN4Done(String gatheringDOBSSN4Done) {
        this.gatheringDOBSSN4Done = gatheringDOBSSN4Done;
    }
    
    // ************* 5. Signing ERI Ageement ****************************

    public UploadedFile getSigningERIAgeement5FileUpload() {
        return signingERIAgeement5FileUpload;
    }

    public void setSigningERIAgeement5FileUpload(UploadedFile signingERIAgeement5FileUpload) {
        this.signingERIAgeement5FileUpload = signingERIAgeement5FileUpload;
    }

    public String getSigningERIAgeement5String() {
        return signingERIAgeement5String;
    }

    public void setSigningERIAgeement5String(String signingERIAgeement5String) {
        this.signingERIAgeement5String = signingERIAgeement5String;
    }

    public boolean isSigningERIAgeement5CheckBox() {
        return signingERIAgeement5CheckBox;
    }

    public void setSigningERIAgeement5CheckBox(boolean signingERIAgeement5CheckBox) {
        this.signingERIAgeement5CheckBox = signingERIAgeement5CheckBox;
    }

    public String getSigningERIAgeement5Done() {
        if ( isSigningERIAgeement5CheckBox() == true ) {
            signingERIAgeement5Done = "done";
        } else {
            signingERIAgeement5Done = "";
        }
        return signingERIAgeement5Done;
    }

    public void setSigningERIAgeement5Done(String signingERIAgeement5Done) {
        this.signingERIAgeement5Done = signingERIAgeement5Done;
    }
    
    public void signingERIAgeement5upload() {
        if( signingERIAgeement5FileUpload != null ) {
            FacesMessage message = new FacesMessage("Succesful", signingERIAgeement5FileUpload.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
    
    //********************* 6. Apply to financing  *********************

    public String getApplyToFinancing6String() {
        return applyToFinancing6String;
    }

    public void setApplyToFinancing6String(String applyToFinancing6String) {
        this.applyToFinancing6String = applyToFinancing6String;
    }

    public boolean isApplyToFinancing6CheckBox() {
        return applyToFinancing6CheckBox;
    }

    public void setApplyToFinancing6CheckBox(boolean applyToFinancing6CheckBox) {
        this.applyToFinancing6CheckBox = applyToFinancing6CheckBox;
    }

    public String getApplyToFinancing6Done() {
        if ( isApplyToFinancing6CheckBox() == true ) {
            applyToFinancing6Done = "done";
        } else {
            applyToFinancing6Done = "";
        }
        return applyToFinancing6Done;
    }

    public void setApplyToFinancing6Done(String applyToFinancing6Done) {
        this.applyToFinancing6Done = applyToFinancing6Done;
    }

   // *************** 7. Financing docs received *******************

    public UploadedFile getFinancingDocsReceived7FileUpload() {
        return financingDocsReceived7FileUpload;
    }

    public void setFinancingDocsReceived7FileUpload(UploadedFile financingDocsReceived7FileUpload) {
        this.financingDocsReceived7FileUpload = financingDocsReceived7FileUpload;
    }

    public String getFinancingDocsReceived7String() {
        return financingDocsReceived7String;
    }

    public void setFinancingDocsReceived7String(String financingDocsReceived7String) {
        this.financingDocsReceived7String = financingDocsReceived7String;
    }

    public boolean isFinancingDocsReceived7CheckBox() {
        return financingDocsReceived7CheckBox;
    }

    public void setFinancingDocsReceived7CheckBox(boolean financingDocsReceived7CheckBox) {
        this.financingDocsReceived7CheckBox = financingDocsReceived7CheckBox;
    }

    public String getFinancingDocsReceived7Done() {
        if ( isFinancingDocsReceived7CheckBox() == true ) {
            financingDocsReceived7Done = "done";
        } else {
            financingDocsReceived7Done = "";
        }
        return financingDocsReceived7Done;
    }

    public void setFinancingDocsReceived7Done(String financingDocsReceived7Done) {
        this.financingDocsReceived7Done = financingDocsReceived7Done;
    }
    
    public void financingDocsReceived7upload() {
        if( financingDocsReceived7FileUpload != null ) {
            FacesMessage message = new FacesMessage("Succesful", financingDocsReceived7FileUpload.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
    
    //************ 8.Schedule appointment by customer ************************

    public Date getScheduleAppointmentByCustomer8Date() {
        return scheduleAppointmentByCustomer8Date;
    }

    public void setScheduleAppointmentByCustomer8Date(Date scheduleAppointmentByCustomer8Date) {
        this.scheduleAppointmentByCustomer8Date = scheduleAppointmentByCustomer8Date;
    }

    public String getScheduleAppointmentByCustomer8String() {
        return scheduleAppointmentByCustomer8String;
    }

    public void setScheduleAppointmentByCustomer8String(String scheduleAppointmentByCustomer8String) {
        this.scheduleAppointmentByCustomer8String = scheduleAppointmentByCustomer8String;
    }

    public boolean isScheduleAppointmentByCustomer8CheckBox() {
        return scheduleAppointmentByCustomer8CheckBox;
    }

    public void setScheduleAppointmentByCustomer8CheckBox(boolean scheduleAppointmentByCustomer8CheckBox) {
        this.scheduleAppointmentByCustomer8CheckBox = scheduleAppointmentByCustomer8CheckBox;
    }

    public String getScheduleAppointmentByCustomer8Done() {
        if ( isScheduleAppointmentByCustomer8CheckBox() == true ) {
            scheduleAppointmentByCustomer8Done = "done";
        } else {
            scheduleAppointmentByCustomer8Done = "";
        }
        return scheduleAppointmentByCustomer8Done;
    }

    public void setScheduleAppointmentByCustomer8Done(String scheduleAppointmentByCustomer8Done) {
        this.scheduleAppointmentByCustomer8Done = scheduleAppointmentByCustomer8Done;
    }
    
    // ********************** 9.Signing contract by customer *****************

    public UploadedFile getSigningContractByCustomer9FileUpload() {
        return signingContractByCustomer9FileUpload;
    }

    public void setSigningContractByCustomer9FileUpload(UploadedFile signingContractByCustomer9FileUpload) {
        this.signingContractByCustomer9FileUpload = signingContractByCustomer9FileUpload;
    }

    public String getSigningContractByCustomer9String() {
        return signingContractByCustomer9String;
    }

    public void setSigningContractByCustomer9String(String signingContractByCustomer9String) {
        this.signingContractByCustomer9String = signingContractByCustomer9String;
    }

    public boolean isSigningContractByCustomer9CheckBox() {
        return signingContractByCustomer9CheckBox;
    }

    public void setSigningContractByCustomer9CheckBox(boolean signingContractByCustomer9CheckBox) {
        this.signingContractByCustomer9CheckBox = signingContractByCustomer9CheckBox;
    }

    public String getSigningContractByCustomer9Done() {
        if ( isSigningContractByCustomer9CheckBox() == true ) {
            signingContractByCustomer9Done = "done";
        } else {
            signingContractByCustomer9Done = "";
        }
        return signingContractByCustomer9Done;
    }

    public void setSigningContractByCustomer9Done(String signingContractByCustomer9Done) {
        this.signingContractByCustomer9Done = signingContractByCustomer9Done;
    }
    
    public void signingContractByCustomer9upload() {
        if( signingContractByCustomer9FileUpload != null ) {
            FacesMessage message = new FacesMessage("Succesful", signingContractByCustomer9FileUpload.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
    
    //---------------- 10.All docs completed -----------------------------

    public String getAllDocsCompleted10String() {
        return allDocsCompleted10String;
    }

    public void setAllDocsCompleted10String(String allDocsCompleted10String) {
        this.allDocsCompleted10String = allDocsCompleted10String;
    }

    public boolean isAllDocsCompleted10CheckBox() {
        return allDocsCompleted10CheckBox;
    }

    public void setAllDocsCompleted10CheckBox(boolean allDocsCompleted10CheckBox) {
        this.allDocsCompleted10CheckBox = allDocsCompleted10CheckBox;
    }

    public String getAllDocsCompleted10Done() {
        if ( isAllDocsCompleted10CheckBox() == true ) {
            this.allDocsCompleted10Done = "done";
        } else {
            this.allDocsCompleted10Done = "";
        }
        return allDocsCompleted10Done;
    }

    public void setAllDocsCompleted10Done(String allDocsCompleted10Done) {
        this.allDocsCompleted10Done = allDocsCompleted10Done;
    }
    
    // ----------------------- 11.Notice to proceed -----------------------

    public String getNoticeToProceed11String() {
        return noticeToProceed11String;
    }

    public void setNoticeToProceed11String(String noticeToProceed11String) {
        this.noticeToProceed11String = noticeToProceed11String;
    }

    public boolean isNoticeToProceed11CheckBox() {
        return noticeToProceed11CheckBox;
    }

    public void setNoticeToProceed11CheckBox(boolean noticeToProceed11CheckBox) {
        this.noticeToProceed11CheckBox = noticeToProceed11CheckBox;
    }

    public String getNoticeToProceed11Done() {
        if ( isNoticeToProceed11CheckBox() == true ) {
            this.noticeToProceed11Done = "done";
        } else {
            this.noticeToProceed11Done = "";
        }
        return noticeToProceed11Done;
    }

    public void setNoticeToProceed11Done(String noticeToProceed11Done) {
        this.noticeToProceed11Done = noticeToProceed11Done;
    }
    
    // ------------ 12.give # for concierge ------------------------------

    public String getGiveNForConcierge12String() {
        return giveNForConcierge12String;
    }

    public void setGiveNForConcierge12String(String giveNForConcierge12String) {
        this.giveNForConcierge12String = giveNForConcierge12String;
    }

    public boolean isGiveNForConcierge12CheckBox() {
        return giveNForConcierge12CheckBox;
    }

    public void setGiveNForConcierge12CheckBox(boolean giveNForConcierge12CheckBox) {
        this.giveNForConcierge12CheckBox = giveNForConcierge12CheckBox;
    }

    public String getGiveNForConcierge12Done() {
        if ( isGatheringDOBSSN4CheckBox() == true ) {
            this.giveNForConcierge12Done = "done";
        } else {
            this.giveNForConcierge12Done = "";
        }
        return giveNForConcierge12Done;
    }

    public void setGiveNForConcierge12Done(String giveNForConcierge12Done) {
        this.giveNForConcierge12Done = giveNForConcierge12Done;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //********************

    @Override
        public String toString() {
        return "Finance{" + "gatheringDOBSSN4Date=" + gatheringDOBSSN4Date + '}';
    }
    
    
    
}
