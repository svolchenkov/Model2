/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sergey
 */
@Entity
@Table(name = "CUSTOMER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByFirstMeeting", query = "SELECT c FROM Customer c WHERE c.firstMeeting = :firstMeeting"),
    @NamedQuery(name = "Customer.findByFollowUpWithEs", query = "SELECT c FROM Customer c WHERE c.followUpWithEs = :followUpWithEs"),
    @NamedQuery(name = "Customer.findByAdvisorsId", query = "SELECT c FROM Customer c WHERE c.advisorsId = :advisorsId"),
    @NamedQuery(name = "Customer.findByAmbasadorsId", query = "SELECT c FROM Customer c WHERE c.ambasadorsId = :ambasadorsId"),
    @NamedQuery(name = "Customer.findByFirstName1", query = "SELECT c FROM Customer c WHERE c.firstName1 = :firstName1"),
    @NamedQuery(name = "Customer.findByLastName1", query = "SELECT c FROM Customer c WHERE c.lastName1 = :lastName1"),
    @NamedQuery(name = "Customer.findByEmail1", query = "SELECT c FROM Customer c WHERE c.email1 = :email1"),
    @NamedQuery(name = "Customer.findByPhone1", query = "SELECT c FROM Customer c WHERE c.phone1 = :phone1"),
    @NamedQuery(name = "Customer.findByFirstName2", query = "SELECT c FROM Customer c WHERE c.firstName2 = :firstName2"),
    @NamedQuery(name = "Customer.findByLastName2", query = "SELECT c FROM Customer c WHERE c.lastName2 = :lastName2"),
    @NamedQuery(name = "Customer.findByEmail2", query = "SELECT c FROM Customer c WHERE c.email2 = :email2"),
    @NamedQuery(name = "Customer.findByPhone2", query = "SELECT c FROM Customer c WHERE c.phone2 = :phone2"),
    @NamedQuery(name = "Customer.findByAddress", query = "SELECT c FROM Customer c WHERE c.address = :address"),
    @NamedQuery(name = "Customer.findByCity", query = "SELECT c FROM Customer c WHERE c.city = :city"),
    @NamedQuery(name = "Customer.findByZip", query = "SELECT c FROM Customer c WHERE c.zip = :zip"),
    @NamedQuery(name = "Customer.findBySquareFootage", query = "SELECT c FROM Customer c WHERE c.squareFootage = :squareFootage"),
    @NamedQuery(name = "Customer.findByYearHome", query = "SELECT c FROM Customer c WHERE c.yearHome = :yearHome"),
    @NamedQuery(name = "Customer.findByEffciencyUpgrades", query = "SELECT c FROM Customer c WHERE c.effciencyUpgrades = :effciencyUpgrades"),
    @NamedQuery(name = "Customer.findByFicoScore", query = "SELECT c FROM Customer c WHERE c.ficoScore = :ficoScore"),
    @NamedQuery(name = "Customer.findByStateQualifierIncome75k", query = "SELECT c FROM Customer c WHERE c.stateQualifierIncome75k = :stateQualifierIncome75k"),
    @NamedQuery(name = "Customer.findByFreePgeWeatherStripping", query = "SELECT c FROM Customer c WHERE c.freePgeWeatherStripping = :freePgeWeatherStripping"),
    @NamedQuery(name = "Customer.findByReasonForCareProgram", query = "SELECT c FROM Customer c WHERE c.reasonForCareProgram = :reasonForCareProgram"),
    @NamedQuery(name = "Customer.findByTimeTravelExplained", query = "SELECT c FROM Customer c WHERE c.timeTravelExplained = :timeTravelExplained"),
    @NamedQuery(name = "Customer.findByQualifySpeakWithHub", query = "SELECT c FROM Customer c WHERE c.qualifySpeakWithHub = :qualifySpeakWithHub"),
    @NamedQuery(name = "Customer.findByAdditionalNotes", query = "SELECT c FROM Customer c WHERE c.additionalNotes = :additionalNotes"),
    @NamedQuery(name = "Customer.findByDirectorId", query = "SELECT c FROM Customer c WHERE c.directorId = :directorId"),
    @NamedQuery(name = "Customer.findByNumberOfAppointments", query = "SELECT c FROM Customer c WHERE c.numberOfAppointments = :numberOfAppointments"),
    @NamedQuery(name = "Customer.findByCustomAddUser", query = "SELECT c FROM Customer c WHERE c.customAddUser = :customAddUser"),
    @NamedQuery(name = "Customer.findByMileage", query = "SELECT c FROM Customer c WHERE c.mileage = :mileage"),
    @NamedQuery(name = "Customer.findByFinanceId", query = "SELECT c FROM Customer c WHERE c.financeId = :financeId"),
    @NamedQuery(name = "Customer.findById", query = "SELECT c FROM Customer c WHERE c.id = :id"),
    @NamedQuery(name = "Customer.findByCaseId", query = "SELECT c FROM Customer c WHERE c.caseId = :caseId")})
public class CustomerEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "FIRST_MEETING")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstMeeting;
    @Column(name = "FOLLOW_UP_WITH_ES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date followUpWithEs;
    @Size(max = 100)
    @Column(name = "ADVISORS_ID")
    private String advisorsId;
    @Size(max = 100)
    @Column(name = "AMBASADORS_ID")
    private String ambasadorsId;
    @Size(max = 100)
    @Column(name = "FIRST_NAME1")
    private String firstName1;
    @Size(max = 100)
    @Column(name = "LAST_NAME1")
    private String lastName1;
    @Size(max = 100)
    @Column(name = "EMAIL1")
    private String email1;
    @Size(max = 20)
    @Column(name = "PHONE1")
    private String phone1;
    @Size(max = 100)
    @Column(name = "FIRST_NAME2")
    private String firstName2;
    @Size(max = 100)
    @Column(name = "LAST_NAME2")
    private String lastName2;
    @Size(max = 100)
    @Column(name = "EMAIL2")
    private String email2;
    @Size(max = 20)
    @Column(name = "PHONE2")
    private String phone2;
    @Size(max = 150)
    @Column(name = "ADDRESS")
    private String address;
    @Size(max = 50)
    @Column(name = "CITY")
    private String city;
    @Column(name = "ZIP")
    private Integer zip;
    @Column(name = "SQUARE_FOOTAGE")
    private Integer squareFootage;
    @Column(name = "YEAR_HOME")
    private Integer yearHome;
    @Size(max = 100)
    @Column(name = "EFFCIENCY_UPGRADES")
    private String effciencyUpgrades;
    @Column(name = "FICO_SCORE")
    private Integer ficoScore;
    @Size(max = 100)
    @Column(name = "STATE_QUALIFIER_INCOME75K")
    private String stateQualifierIncome75k;
    @Size(max = 100)
    @Column(name = "FREE_PGE_WEATHER_STRIPPING")
    private String freePgeWeatherStripping;
    @Size(max = 100)
    @Column(name = "REASON_FOR_CARE_PROGRAM")
    private String reasonForCareProgram;
    @Size(max = 100)
    @Column(name = "TIME_TRAVEL_EXPLAINED")
    private String timeTravelExplained;
    @Size(max = 100)
    @Column(name = "QUALIFY_SPEAK_WITH_HUB")
    private String qualifySpeakWithHub;
    @Size(max = 100)
    @Column(name = "ADDITIONAL_NOTES")
    private String additionalNotes;
    @Size(max = 100)
    @Column(name = "DIRECTOR_ID")
    private String directorId;
    @Column(name = "NUMBER_OF_APPOINTMENTS")
    private Integer numberOfAppointments;
    @Size(max = 100)
    @Column(name = "CUSTOM_ADD_USER")
    private String customAddUser;
    @Column(name = "MILEAGE")
    private Integer mileage;
    @Column(name = "FINANCE_ID")
    private Integer financeId;
    @Column(name = "ID")
    private BigInteger id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CASE_ID")
    private BigDecimal caseId;

    public CustomerEntity() {
    }

    public CustomerEntity(BigDecimal caseId) {
        this.caseId = caseId;
    }

    public Date getFirstMeeting() {
        return firstMeeting;
    }

    public void setFirstMeeting(Date firstMeeting) {
        this.firstMeeting = firstMeeting;
    }

    public Date getFollowUpWithEs() {
        return followUpWithEs;
    }

    public void setFollowUpWithEs(Date followUpWithEs) {
        this.followUpWithEs = followUpWithEs;
    }

    public String getAdvisorsId() {
        return advisorsId;
    }

    public void setAdvisorsId(String advisorsId) {
        this.advisorsId = advisorsId;
    }

    public String getAmbasadorsId() {
        return ambasadorsId;
    }

    public void setAmbasadorsId(String ambasadorsId) {
        this.ambasadorsId = ambasadorsId;
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

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public Integer getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(Integer squareFootage) {
        this.squareFootage = squareFootage;
    }

    public Integer getYearHome() {
        return yearHome;
    }

    public void setYearHome(Integer yearHome) {
        this.yearHome = yearHome;
    }

    public String getEffciencyUpgrades() {
        return effciencyUpgrades;
    }

    public void setEffciencyUpgrades(String effciencyUpgrades) {
        this.effciencyUpgrades = effciencyUpgrades;
    }

    public Integer getFicoScore() {
        return ficoScore;
    }

    public void setFicoScore(Integer ficoScore) {
        this.ficoScore = ficoScore;
    }

    public String getStateQualifierIncome75k() {
        return stateQualifierIncome75k;
    }

    public void setStateQualifierIncome75k(String stateQualifierIncome75k) {
        this.stateQualifierIncome75k = stateQualifierIncome75k;
    }

    public String getFreePgeWeatherStripping() {
        return freePgeWeatherStripping;
    }

    public void setFreePgeWeatherStripping(String freePgeWeatherStripping) {
        this.freePgeWeatherStripping = freePgeWeatherStripping;
    }

    public String getReasonForCareProgram() {
        return reasonForCareProgram;
    }

    public void setReasonForCareProgram(String reasonForCareProgram) {
        this.reasonForCareProgram = reasonForCareProgram;
    }

    public String getTimeTravelExplained() {
        return timeTravelExplained;
    }

    public void setTimeTravelExplained(String timeTravelExplained) {
        this.timeTravelExplained = timeTravelExplained;
    }

    public String getQualifySpeakWithHub() {
        return qualifySpeakWithHub;
    }

    public void setQualifySpeakWithHub(String qualifySpeakWithHub) {
        this.qualifySpeakWithHub = qualifySpeakWithHub;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    public String getDirectorId() {
        return directorId;
    }

    public void setDirectorId(String directorId) {
        this.directorId = directorId;
    }

    public Integer getNumberOfAppointments() {
        return numberOfAppointments;
    }

    public void setNumberOfAppointments(Integer numberOfAppointments) {
        this.numberOfAppointments = numberOfAppointments;
    }

    public String getCustomAddUser() {
        return customAddUser;
    }

    public void setCustomAddUser(String customAddUser) {
        this.customAddUser = customAddUser;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getFinanceId() {
        return financeId;
    }

    public void setFinanceId(Integer financeId) {
        this.financeId = financeId;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigDecimal getCaseId() {
        return caseId;
    }

    public void setCaseId(BigDecimal caseId) {
        this.caseId = caseId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (caseId != null ? caseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerEntity)) {
            return false;
        }
        CustomerEntity other = (CustomerEntity) object;
        if ((this.caseId == null && other.caseId != null) || (this.caseId != null && !this.caseId.equals(other.caseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.entity.Customer[ caseId=" + caseId + " ]";
    }
    
}
