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
import javax.ejb.EJB;
import db.entity.CustomerEntity;
import db.manage.HouseManage;
import db.manage.PropertiesManage;
import java.util.Calendar;
import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Sergey
 */
@Named(value = "questions")
@SessionScoped
public class QuestionsBean implements Serializable {

    @EJB
    private HouseManage houseManage;
    @Inject
    FinanceBean financeBean;
    @Inject
    MeasureBean measureBean;
    @EJB
    PropertiesManage propertiesManage;

    private int customerID = 0;
    private String caseID = "0";
    private Date firstMeeting;
    private Date followUpWithES;
    private String advisor;
    private String ambassador;
    private String firstName1;
    private String lastName1;
    private String email1;
    private String phone1;
    private String firstName2;
    private String lastName2;
    private String email2;
    private String phone2;
    private String address;
    private String city;
    private int zip = 0;
    private int squareFootage = 0;
    private int yearHome = 0;
    private String EffciencyUpgrades;
    private int ficoScore = 0;
    private String stateQualifierMedianIncome75K;
    private String freePGEWeatherStripping;
    private String[] reasonForCareProgram;
    private String timeTravelExplained;
    private String qualifyToSpeakWithHub;
    private String additionalNOTES;
    private String director;
    private int numberOfAppointments;
    private String CustomAddUser;
    private int mileage = 0;
    private int financeID = 0;

    public QuestionsBean() {
    }

    public String receiveNewHouse() {
        cleanQuestionsHouseBean();
        financeBean.cleanFinanceBean();
        measureBean.cleanMeasureBean();
        
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        this.caseID = "C_" + calendar.get(Calendar.YEAR) + "_" + (calendar.get(Calendar.MONTH)+1)
                + "_" + calendar.get(Calendar.DAY_OF_MONTH) + "_" +
                + propertiesManage.receiveCaseIdAddition();
        financeBean.setCaseID(this.caseID);
        measureBean.setCaseId(this.caseID);
        return "housefinance.xhtml";
    }
    
    public List<CustomerEntity> findHouseByCaseId (String caseId) {
        List<CustomerEntity> customers = houseManage.getHouseByLikeCaseID(caseId);
        return customers;
    }
    
    public String getCaseID() {
        return caseID;
    }

    public void setCaseID(String caseID) {
        this.caseID = caseID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getFirstMeeting() {
        return firstMeeting;
    }

    public void setFirstMeeting(Date firstMeeting) {
        this.firstMeeting = firstMeeting;
    }

    public Date getFollowUpWithES() {
        return followUpWithES;
    }

    public void setFollowUpWithES(Date followUpWithES) {
        this.followUpWithES = followUpWithES;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getAmbassador() {
        return ambassador;
    }

    public void setAmbassador(String ambassador) {
        this.ambassador = ambassador;
    }

    public String getFirstName1() {
        return firstName1;
    }

    public void setFirstName1(String firstName1) {
        this.firstName1 = firstName1;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getFirstName2() {
        return firstName2;
    }

    public void setFirstName2(String firstName2) {
        this.firstName2 = firstName2;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getYearHome() {
        return yearHome;
    }

    public void setYearHome(int yearHome) {
        this.yearHome = yearHome;
    }

    public String getEffciencyUpgrades() {
        return EffciencyUpgrades;
    }

    public void setEffciencyUpgrades(String EffciencyUpgrades) {
        this.EffciencyUpgrades = EffciencyUpgrades;
    }

    public int getFicoScore() {
        return ficoScore;
    }

    public void setFicoScore(int ficoScore) {
        this.ficoScore = ficoScore;
    }

    public String getStateQualifierMedianIncome75K() {
        return stateQualifierMedianIncome75K;
    }

    public void setStateQualifierMedianIncome75K(String stateQualifierMedianIncome75K) {
        this.stateQualifierMedianIncome75K = stateQualifierMedianIncome75K;
    }

    public String getFreePGEWeatherStripping() {
        return freePGEWeatherStripping;
    }

    public void setFreePGEWeatherStripping(String freePGEWeatherStripping) {
        this.freePGEWeatherStripping = freePGEWeatherStripping;
    }

    public String[] getReasonForCareProgram() {
        return reasonForCareProgram;
    }

    public void setReasonForCareProgram(String[] reasonForCareProgram) {
        this.reasonForCareProgram = reasonForCareProgram;
    }

    public String getTimeTravelExplained() {
        return timeTravelExplained;
    }

    public void setTimeTravelExplained(String timeTravelExplained) {
        this.timeTravelExplained = timeTravelExplained;
    }

    public String getQualifyToSpeakWithHub() {
        return qualifyToSpeakWithHub;
    }

    public void setQualifyToSpeakWithHub(String qualifyToSpeakWithHub) {
        this.qualifyToSpeakWithHub = qualifyToSpeakWithHub;
    }

    public String getAdditionalNOTES() {
        return additionalNOTES;
    }

    public void setAdditionalNOTES(String additionalNOTES) {
        this.additionalNOTES = additionalNOTES;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getNumberOfAppointments() {
        return numberOfAppointments;
    }

    public void setNumberOfAppointments(int numberOfAppointments) {
        this.numberOfAppointments = numberOfAppointments;
    }

    public String getCustomAddUser() {
        return CustomAddUser;
    }

    public void setCustomAddUser(String CustomAddUser) {
        this.CustomAddUser = CustomAddUser;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getFinanceID() {
        return financeID;
    }

    public void setFinanceID(int financeID) {
        this.financeID = financeID;
    }

    public void submit() {
        System.out.println("" + this.toString());
    }

    public void reset() {
        Date date = new Date();
        int customerID = 0;
        setFirstMeeting(null);
        setFollowUpWithES(null);
        setAdvisor("select");
        setAmbassador("select");
        setFirstName1("");
        setLastName1("");
        setEmail1("");
        setPhone1("");
        setFirstName2("");
        setLastName2("");
        setEmail2("");
        setPhone2("");
        setAddress("");
        setCity("");
        setZip(0);
        setSquareFootage(0);
        setYearHome(0);
        setEffciencyUpgrades("");
        setFicoScore(0);
        setStateQualifierMedianIncome75K("");
        setFreePGEWeatherStripping("");
//        setReasonForCareProgram(s);  // need to handle clearing field
        setTimeTravelExplained("");
        setQualifyToSpeakWithHub("");
        setAdditionalNOTES("");
        setDirector("select");
        setNumberOfAppointments(0);
        setCustomAddUser("");
        setMileage(0);
    }

    public String printReasonforCareProgram() {
        StringBuilder sb = new StringBuilder();
        for (String s : reasonForCareProgram) {
            sb.append(s).append(", ");
        }
        return sb.toString();
    }

    public void sendNotification() {
//        function.sendingEmail("svolchenkov@gmail.com", "ConfirmingNotise");
    }

    @Override
    public String toString() {
        return ", timeTravelExplained="
                + "Questions{" + "customerID=" + customerID + ", firstMeeting=" + firstMeeting
                + ", followUpWithES=" + followUpWithES + ", advisor=" + advisor + ", ambassador="
                + ambassador + ", firstName1=" + firstName1 + ", lastName1=" + lastName1
                + ", email1=" + email1 + ", phone1=" + phone1 + ", firstName2=" + firstName2
                + ", lastName2=" + lastName2 + ", email2=" + email2 + ", phone2=" + phone2
                + ", address=" + address + ", city=" + city + ", zip=" + zip + ", squareFootage="
                + squareFootage + ", yearHome=" + yearHome + ", EffciencyUpgrades="
                + EffciencyUpgrades + ", ficoScore=" + ficoScore + ", stateQualifierMedianIncome75K="
                + stateQualifierMedianIncome75K + ", freePGEWeatherStripping=" + freePGEWeatherStripping
                + timeTravelExplained + ", qualifyToSpeakWithHub=" + qualifyToSpeakWithHub
                + ", additionalNOTES=" + additionalNOTES + ", director=" + director
                + ", numberOfAppointments=" + numberOfAppointments + ", CustomAddUser="
                + CustomAddUser + ", mileage=" + mileage + '}';
    }

    public void saveQuestionsHouse() {
        /*
        1.We have QuestionsBean (current)
        2.HouseManage.addOrUpdateHouse(this); this receive data from HouseManage.fillFields(questionsBean);
            if new1 = 1 (house new) it call save, if new1 = 0 it call update
        3.HouseManage.fillFields(questionsBean); receive data from HouseManage.getHouseByCaseID(String caseID), 
            filled fields in received houseEntity and return this houseEWntity
        4.HouseManage.getHouseByCaseID(String caseID)  if caseId found in DB, new1 = 0 (this new house), 
            if caseId didn't find in db, new1 = 1 (this new house), return houseEntity (empty or filled)
        */
        measureBean.saveMeasure();
        houseManage.addOrUpdateHouse(this);
        financeBean.saveFinance();
    }
    
    public void receiveQuestionsHouseByCaseID(String caseID) {

        CustomerEntity customerEntity = houseManage.getHouseByCaseID(caseID);

        setFirstMeeting(customerEntity.getFirstMeeting());
        setFollowUpWithES(customerEntity.getFollowUpWithEs());
        setAdvisor(customerEntity.getAdvisorsId());
        setAmbassador(customerEntity.getAmbasadorsId());
        setFirstName1(customerEntity.getFirstName1());
        setLastName1(customerEntity.getLastName1());
        setEmail1(customerEntity.getEmail1());
        setPhone1(customerEntity.getPhone1());
        setFirstName2(customerEntity.getFirstName2());
        setLastName2(customerEntity.getLastName2());
        setEmail2(customerEntity.getEmail2());
        setPhone2(customerEntity.getPhone2());
        setAddress(customerEntity.getAddress());
        setCity(customerEntity.getCity());
        setZip(customerEntity.getZip());
        setSquareFootage(customerEntity.getSquareFootage());
        setYearHome(customerEntity.getYearHome());
        setEffciencyUpgrades(customerEntity.getEffciencyUpgrades());
        setFicoScore(customerEntity.getFicoScore());
        setStateQualifierMedianIncome75K(customerEntity.getStateQualifierIncome75k());
        setFreePGEWeatherStripping(customerEntity.getFreePgeWeatherStripping());
        String[] str = new String[1];
        str[0] = customerEntity.getReasonForCareProgram();
        setReasonForCareProgram(str);
        setTimeTravelExplained(customerEntity.getTimeTravelExplained());
        setQualifyToSpeakWithHub(customerEntity.getQualifySpeakWithHub());
        setAdditionalNOTES(customerEntity.getAdditionalNotes());
        setDirector(customerEntity.getDirectorId());
        setNumberOfAppointments(customerEntity.getNumberOfAppointments());
        setCustomAddUser(customerEntity.getCustomAddUser());
        setMileage(customerEntity.getMileage());
        setFinanceID(customerEntity.getFinanceId());
        setCustomerID(0);
        setCaseID(customerEntity.getCaseId());

    }

    public void addAdvisor() {
//        advisorManage.addAdvisor();
    }

   private void cleanQuestionsHouseBean() {
       reset();
   }
    
}
