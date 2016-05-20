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
@Table(name = "FINANCE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Finance.findAll", query = "SELECT f FROM Finance f"),
    @NamedQuery(name = "Finance.findById", query = "SELECT f FROM Finance f WHERE f.id = :id"),
    @NamedQuery(name = "Finance.findByStateCurrent", query = "SELECT f FROM Finance f WHERE f.stateCurrent = :stateCurrent"),
    @NamedQuery(name = "Finance.findByDatareceivedfromsales0string", query = "SELECT f FROM Finance f WHERE f.datareceivedfromsales0string = :datareceivedfromsales0string"),
    @NamedQuery(name = "Finance.findByDatareceivedfromsales0checkbox", query = "SELECT f FROM Finance f WHERE f.datareceivedfromsales0checkbox = :datareceivedfromsales0checkbox"),
    @NamedQuery(name = "Finance.findByDatareceivedfromsales0done", query = "SELECT f FROM Finance f WHERE f.datareceivedfromsales0done = :datareceivedfromsales0done"),
    @NamedQuery(name = "Finance.findByCheckingavailablefinancing1y", query = "SELECT f FROM Finance f WHERE f.checkingavailablefinancing1y = :checkingavailablefinancing1y"),
    @NamedQuery(name = "Finance.findByCheckingavailablefinancing1ca", query = "SELECT f FROM Finance f WHERE f.checkingavailablefinancing1ca = :checkingavailablefinancing1ca"),
    @NamedQuery(name = "Finance.findByCheckingavailablefinancing1he", query = "SELECT f FROM Finance f WHERE f.checkingavailablefinancing1he = :checkingavailablefinancing1he"),
    @NamedQuery(name = "Finance.findByCheckingavailablefinancing1che", query = "SELECT f FROM Finance f WHERE f.checkingavailablefinancing1che = :checkingavailablefinancing1che"),
    @NamedQuery(name = "Finance.findByCheckingavailablefinancing1d", query = "SELECT f FROM Finance f WHERE f.checkingavailablefinancing1d = :checkingavailablefinancing1d"),
    @NamedQuery(name = "Finance.findByEvaluatehp2button", query = "SELECT f FROM Finance f WHERE f.evaluatehp2button = :evaluatehp2button"),
    @NamedQuery(name = "Finance.findByEvaluatehp2checkbox", query = "SELECT f FROM Finance f WHERE f.evaluatehp2checkbox = :evaluatehp2checkbox"),
    @NamedQuery(name = "Finance.findByEvaluatehp2done", query = "SELECT f FROM Finance f WHERE f.evaluatehp2done = :evaluatehp2done"),
    @NamedQuery(name = "Finance.findByReceivingdraftagreement3string", query = "SELECT f FROM Finance f WHERE f.receivingdraftagreement3string = :receivingdraftagreement3string"),
    @NamedQuery(name = "Finance.findByReceivingdraftagreement3ch", query = "SELECT f FROM Finance f WHERE f.receivingdraftagreement3ch = :receivingdraftagreement3ch"),
    @NamedQuery(name = "Finance.findByReceivingdraftagreement3done", query = "SELECT f FROM Finance f WHERE f.receivingdraftagreement3done = :receivingdraftagreement3done"),
    @NamedQuery(name = "Finance.findByGatheringdobssn4date", query = "SELECT f FROM Finance f WHERE f.gatheringdobssn4date = :gatheringdobssn4date"),
    @NamedQuery(name = "Finance.findByGatheringdobssn4string", query = "SELECT f FROM Finance f WHERE f.gatheringdobssn4string = :gatheringdobssn4string"),
    @NamedQuery(name = "Finance.findByGatheringdobssn4che", query = "SELECT f FROM Finance f WHERE f.gatheringdobssn4che = :gatheringdobssn4che"),
    @NamedQuery(name = "Finance.findByGatheringdobssn4done", query = "SELECT f FROM Finance f WHERE f.gatheringdobssn4done = :gatheringdobssn4done"),
    @NamedQuery(name = "Finance.findBySigningeriageement5fileupload", query = "SELECT f FROM Finance f WHERE f.signingeriageement5fileupload = :signingeriageement5fileupload"),
    @NamedQuery(name = "Finance.findBySigningeriageement5string", query = "SELECT f FROM Finance f WHERE f.signingeriageement5string = :signingeriageement5string"),
    @NamedQuery(name = "Finance.findBySigningeriageement5che", query = "SELECT f FROM Finance f WHERE f.signingeriageement5che = :signingeriageement5che"),
    @NamedQuery(name = "Finance.findBySigningeriageement5done", query = "SELECT f FROM Finance f WHERE f.signingeriageement5done = :signingeriageement5done"),
    @NamedQuery(name = "Finance.findByApplytofinancing6string", query = "SELECT f FROM Finance f WHERE f.applytofinancing6string = :applytofinancing6string"),
    @NamedQuery(name = "Finance.findByApplytofinancing6checkbox", query = "SELECT f FROM Finance f WHERE f.applytofinancing6checkbox = :applytofinancing6checkbox"),
    @NamedQuery(name = "Finance.findByApplytofinancing6done", query = "SELECT f FROM Finance f WHERE f.applytofinancing6done = :applytofinancing6done"),
    @NamedQuery(name = "Finance.findByFinancingdocsreceived7fileupl", query = "SELECT f FROM Finance f WHERE f.financingdocsreceived7fileupl = :financingdocsreceived7fileupl"),
    @NamedQuery(name = "Finance.findByFinancingdocsreceived7string", query = "SELECT f FROM Finance f WHERE f.financingdocsreceived7string = :financingdocsreceived7string"),
    @NamedQuery(name = "Finance.findByFinancingdocsreceived7che", query = "SELECT f FROM Finance f WHERE f.financingdocsreceived7che = :financingdocsreceived7che"),
    @NamedQuery(name = "Finance.findByFinancingdocsreceived7do", query = "SELECT f FROM Finance f WHERE f.financingdocsreceived7do = :financingdocsreceived7do"),
    @NamedQuery(name = "Finance.findByScheduleappointmentby8d", query = "SELECT f FROM Finance f WHERE f.scheduleappointmentby8d = :scheduleappointmentby8d"),
    @NamedQuery(name = "Finance.findByScheduleappointmentby8st", query = "SELECT f FROM Finance f WHERE f.scheduleappointmentby8st = :scheduleappointmentby8st"),
    @NamedQuery(name = "Finance.findByScheduleappointmentby8che", query = "SELECT f FROM Finance f WHERE f.scheduleappointmentby8che = :scheduleappointmentby8che"),
    @NamedQuery(name = "Finance.findByScheduleappointmentby8do", query = "SELECT f FROM Finance f WHERE f.scheduleappointmentby8do = :scheduleappointmentby8do"),
    @NamedQuery(name = "Finance.findBySigningcontractbycustomer9fi", query = "SELECT f FROM Finance f WHERE f.signingcontractbycustomer9fi = :signingcontractbycustomer9fi"),
    @NamedQuery(name = "Finance.findBySigningcontractbycustomer9st", query = "SELECT f FROM Finance f WHERE f.signingcontractbycustomer9st = :signingcontractbycustomer9st"),
    @NamedQuery(name = "Finance.findBySigningcontractbycustomer9che", query = "SELECT f FROM Finance f WHERE f.signingcontractbycustomer9che = :signingcontractbycustomer9che"),
    @NamedQuery(name = "Finance.findBySigningcontractbycustomer9done", query = "SELECT f FROM Finance f WHERE f.signingcontractbycustomer9done = :signingcontractbycustomer9done"),
    @NamedQuery(name = "Finance.findByAlldocscompleted10string", query = "SELECT f FROM Finance f WHERE f.alldocscompleted10string = :alldocscompleted10string"),
    @NamedQuery(name = "Finance.findByAlldocscompleted10checkbox", query = "SELECT f FROM Finance f WHERE f.alldocscompleted10checkbox = :alldocscompleted10checkbox"),
    @NamedQuery(name = "Finance.findByAlldocscompleted10do", query = "SELECT f FROM Finance f WHERE f.alldocscompleted10do = :alldocscompleted10do"),
    @NamedQuery(name = "Finance.findByNoticetoproceed11string", query = "SELECT f FROM Finance f WHERE f.noticetoproceed11string = :noticetoproceed11string"),
    @NamedQuery(name = "Finance.findByNoticetoproceed11checkbox", query = "SELECT f FROM Finance f WHERE f.noticetoproceed11checkbox = :noticetoproceed11checkbox"),
    @NamedQuery(name = "Finance.findByNoticetoproceed11done", query = "SELECT f FROM Finance f WHERE f.noticetoproceed11done = :noticetoproceed11done"),
    @NamedQuery(name = "Finance.findByGivenforconcierge12string", query = "SELECT f FROM Finance f WHERE f.givenforconcierge12string = :givenforconcierge12string"),
    @NamedQuery(name = "Finance.findByGivenforconcierge12checkbox", query = "SELECT f FROM Finance f WHERE f.givenforconcierge12checkbox = :givenforconcierge12checkbox"),
    @NamedQuery(name = "Finance.findByGivenforconcierge12done", query = "SELECT f FROM Finance f WHERE f.givenforconcierge12done = :givenforconcierge12done")})
public class FinanceEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "STATE_CURRENT")
    private BigInteger stateCurrent;
    @Size(max = 300)
    @Column(name = "DATARECEIVEDFROMSALES0STRING")
    private String datareceivedfromsales0string;
    @Column(name = "DATARECEIVEDFROMSALES0CHECKBOX")
    private Short datareceivedfromsales0checkbox;
    @Size(max = 5)
    @Column(name = "DATARECEIVEDFROMSALES0DONE")
    private String datareceivedfromsales0done;
    @Size(max = 10)
    @Column(name = "CHECKINGAVAILABLEFINANCING1Y")
    private String checkingavailablefinancing1y;
    @Size(max = 10)
    @Column(name = "CHECKINGAVAILABLEFINANCING1CA")
    private String checkingavailablefinancing1ca;
    @Size(max = 10)
    @Column(name = "CHECKINGAVAILABLEFINANCING1HE")
    private String checkingavailablefinancing1he;
    @Size(max = 1)
    @Column(name = "CHECKINGAVAILABLEFINANCING1CHE")
    private String checkingavailablefinancing1che;
    @Size(max = 5)
    @Column(name = "CHECKINGAVAILABLEFINANCING1D")
    private String checkingavailablefinancing1d;
    @Size(max = 20)
    @Column(name = "EVALUATEHP2BUTTON")
    private String evaluatehp2button;
    @Column(name = "EVALUATEHP2CHECKBOX")
    private Short evaluatehp2checkbox;
    @Size(max = 5)
    @Column(name = "EVALUATEHP2DONE")
    private String evaluatehp2done;
    @Size(max = 300)
    @Column(name = "RECEIVINGDRAFTAGREEMENT3STRING")
    private String receivingdraftagreement3string;
    @Column(name = "RECEIVINGDRAFTAGREEMENT3CH")
    private Short receivingdraftagreement3ch;
    @Size(max = 5)
    @Column(name = "RECEIVINGDRAFTAGREEMENT3DONE")
    private String receivingdraftagreement3done;
    @Column(name = "GATHERINGDOBSSN4DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gatheringdobssn4date;
    @Size(max = 300)
    @Column(name = "GATHERINGDOBSSN4STRING")
    private String gatheringdobssn4string;
    @Column(name = "GATHERINGDOBSSN4CHE")
    private Short gatheringdobssn4che;
    @Size(max = 5)
    @Column(name = "GATHERINGDOBSSN4DONE")
    private String gatheringdobssn4done;
    @Size(max = 100)
    @Column(name = "SIGNINGERIAGEEMENT5FILEUPLOAD")
    private String signingeriageement5fileupload;
    @Size(max = 300)
    @Column(name = "SIGNINGERIAGEEMENT5STRING")
    private String signingeriageement5string;
    @Column(name = "SIGNINGERIAGEEMENT5CHE")
    private Short signingeriageement5che;
    @Size(max = 5)
    @Column(name = "SIGNINGERIAGEEMENT5DONE")
    private String signingeriageement5done;
    @Size(max = 300)
    @Column(name = "APPLYTOFINANCING6STRING")
    private String applytofinancing6string;
    @Column(name = "APPLYTOFINANCING6CHECKBOX")
    private Short applytofinancing6checkbox;
    @Size(max = 5)
    @Column(name = "APPLYTOFINANCING6DONE")
    private String applytofinancing6done;
    @Size(max = 100)
    @Column(name = "FINANCINGDOCSRECEIVED7FILEUPL")
    private String financingdocsreceived7fileupl;
    @Size(max = 300)
    @Column(name = "FINANCINGDOCSRECEIVED7STRING")
    private String financingdocsreceived7string;
    @Column(name = "FINANCINGDOCSRECEIVED7CHE")
    private Short financingdocsreceived7che;
    @Size(max = 5)
    @Column(name = "FINANCINGDOCSRECEIVED7DO")
    private String financingdocsreceived7do;
    @Column(name = "SCHEDULEAPPOINTMENTBY8D")
    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduleappointmentby8d;
    @Size(max = 300)
    @Column(name = "SCHEDULEAPPOINTMENTBY8ST")
    private String scheduleappointmentby8st;
    @Column(name = "SCHEDULEAPPOINTMENTBY8CHE")
    private Short scheduleappointmentby8che;
    @Size(max = 5)
    @Column(name = "SCHEDULEAPPOINTMENTBY8DO")
    private String scheduleappointmentby8do;
    @Size(max = 100)
    @Column(name = "SIGNINGCONTRACTBYCUSTOMER9FI")
    private String signingcontractbycustomer9fi;
    @Size(max = 300)
    @Column(name = "SIGNINGCONTRACTBYCUSTOMER9ST")
    private String signingcontractbycustomer9st;
    @Column(name = "SIGNINGCONTRACTBYCUSTOMER9CHE")
    private Short signingcontractbycustomer9che;
    @Size(max = 5)
    @Column(name = "SIGNINGCONTRACTBYCUSTOMER9DONE")
    private String signingcontractbycustomer9done;
    @Size(max = 300)
    @Column(name = "ALLDOCSCOMPLETED10STRING")
    private String alldocscompleted10string;
    @Column(name = "ALLDOCSCOMPLETED10CHECKBOX")
    private BigInteger alldocscompleted10checkbox;
    @Size(max = 5)
    @Column(name = "ALLDOCSCOMPLETED10DO")
    private String alldocscompleted10do;
    @Size(max = 300)
    @Column(name = "NOTICETOPROCEED11STRING")
    private String noticetoproceed11string;
    @Column(name = "NOTICETOPROCEED11CHECKBOX")
    private Short noticetoproceed11checkbox;
    @Size(max = 5)
    @Column(name = "NOTICETOPROCEED11DONE")
    private String noticetoproceed11done;
    @Size(max = 300)
    @Column(name = "GIVENFORCONCIERGE12STRING")
    private String givenforconcierge12string;
    @Column(name = "GIVENFORCONCIERGE12CHECKBOX")
    private Short givenforconcierge12checkbox;
    @Size(max = 5)
    @Column(name = "GIVENFORCONCIERGE12DONE")
    private String givenforconcierge12done;

    public FinanceEntity() {
    }

    public FinanceEntity(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getStateCurrent() {
        return stateCurrent;
    }

    public void setStateCurrent(BigInteger stateCurrent) {
        this.stateCurrent = stateCurrent;
    }

    public String getDatareceivedfromsales0string() {
        return datareceivedfromsales0string;
    }

    public void setDatareceivedfromsales0string(String datareceivedfromsales0string) {
        this.datareceivedfromsales0string = datareceivedfromsales0string;
    }

    public Short getDatareceivedfromsales0checkbox() {
        return datareceivedfromsales0checkbox;
    }

    public void setDatareceivedfromsales0checkbox(Short datareceivedfromsales0checkbox) {
        this.datareceivedfromsales0checkbox = datareceivedfromsales0checkbox;
    }

    public String getDatareceivedfromsales0done() {
        return datareceivedfromsales0done;
    }

    public void setDatareceivedfromsales0done(String datareceivedfromsales0done) {
        this.datareceivedfromsales0done = datareceivedfromsales0done;
    }

    public String getCheckingavailablefinancing1y() {
        return checkingavailablefinancing1y;
    }

    public void setCheckingavailablefinancing1y(String checkingavailablefinancing1y) {
        this.checkingavailablefinancing1y = checkingavailablefinancing1y;
    }

    public String getCheckingavailablefinancing1ca() {
        return checkingavailablefinancing1ca;
    }

    public void setCheckingavailablefinancing1ca(String checkingavailablefinancing1ca) {
        this.checkingavailablefinancing1ca = checkingavailablefinancing1ca;
    }

    public String getCheckingavailablefinancing1he() {
        return checkingavailablefinancing1he;
    }

    public void setCheckingavailablefinancing1he(String checkingavailablefinancing1he) {
        this.checkingavailablefinancing1he = checkingavailablefinancing1he;
    }

    public String getCheckingavailablefinancing1che() {
        return checkingavailablefinancing1che;
    }

    public void setCheckingavailablefinancing1che(String checkingavailablefinancing1che) {
        this.checkingavailablefinancing1che = checkingavailablefinancing1che;
    }

    public String getCheckingavailablefinancing1d() {
        return checkingavailablefinancing1d;
    }

    public void setCheckingavailablefinancing1d(String checkingavailablefinancing1d) {
        this.checkingavailablefinancing1d = checkingavailablefinancing1d;
    }

    public String getEvaluatehp2button() {
        return evaluatehp2button;
    }

    public void setEvaluatehp2button(String evaluatehp2button) {
        this.evaluatehp2button = evaluatehp2button;
    }

    public Short getEvaluatehp2checkbox() {
        return evaluatehp2checkbox;
    }

    public void setEvaluatehp2checkbox(Short evaluatehp2checkbox) {
        this.evaluatehp2checkbox = evaluatehp2checkbox;
    }

    public String getEvaluatehp2done() {
        return evaluatehp2done;
    }

    public void setEvaluatehp2done(String evaluatehp2done) {
        this.evaluatehp2done = evaluatehp2done;
    }

    public String getReceivingdraftagreement3string() {
        return receivingdraftagreement3string;
    }

    public void setReceivingdraftagreement3string(String receivingdraftagreement3string) {
        this.receivingdraftagreement3string = receivingdraftagreement3string;
    }

    public Short getReceivingdraftagreement3ch() {
        return receivingdraftagreement3ch;
    }

    public void setReceivingdraftagreement3ch(Short receivingdraftagreement3ch) {
        this.receivingdraftagreement3ch = receivingdraftagreement3ch;
    }

    public String getReceivingdraftagreement3done() {
        return receivingdraftagreement3done;
    }

    public void setReceivingdraftagreement3done(String receivingdraftagreement3done) {
        this.receivingdraftagreement3done = receivingdraftagreement3done;
    }

    public Date getGatheringdobssn4date() {
        return gatheringdobssn4date;
    }

    public void setGatheringdobssn4date(Date gatheringdobssn4date) {
        this.gatheringdobssn4date = gatheringdobssn4date;
    }

    public String getGatheringdobssn4string() {
        return gatheringdobssn4string;
    }

    public void setGatheringdobssn4string(String gatheringdobssn4string) {
        this.gatheringdobssn4string = gatheringdobssn4string;
    }

    public Short getGatheringdobssn4che() {
        return gatheringdobssn4che;
    }

    public void setGatheringdobssn4che(Short gatheringdobssn4che) {
        this.gatheringdobssn4che = gatheringdobssn4che;
    }

    public String getGatheringdobssn4done() {
        return gatheringdobssn4done;
    }

    public void setGatheringdobssn4done(String gatheringdobssn4done) {
        this.gatheringdobssn4done = gatheringdobssn4done;
    }

    public String getSigningeriageement5fileupload() {
        return signingeriageement5fileupload;
    }

    public void setSigningeriageement5fileupload(String signingeriageement5fileupload) {
        this.signingeriageement5fileupload = signingeriageement5fileupload;
    }

    public String getSigningeriageement5string() {
        return signingeriageement5string;
    }

    public void setSigningeriageement5string(String signingeriageement5string) {
        this.signingeriageement5string = signingeriageement5string;
    }

    public Short getSigningeriageement5che() {
        return signingeriageement5che;
    }

    public void setSigningeriageement5che(Short signingeriageement5che) {
        this.signingeriageement5che = signingeriageement5che;
    }

    public String getSigningeriageement5done() {
        return signingeriageement5done;
    }

    public void setSigningeriageement5done(String signingeriageement5done) {
        this.signingeriageement5done = signingeriageement5done;
    }

    public String getApplytofinancing6string() {
        return applytofinancing6string;
    }

    public void setApplytofinancing6string(String applytofinancing6string) {
        this.applytofinancing6string = applytofinancing6string;
    }

    public Short getApplytofinancing6checkbox() {
        return applytofinancing6checkbox;
    }

    public void setApplytofinancing6checkbox(Short applytofinancing6checkbox) {
        this.applytofinancing6checkbox = applytofinancing6checkbox;
    }

    public String getApplytofinancing6done() {
        return applytofinancing6done;
    }

    public void setApplytofinancing6done(String applytofinancing6done) {
        this.applytofinancing6done = applytofinancing6done;
    }

    public String getFinancingdocsreceived7fileupl() {
        return financingdocsreceived7fileupl;
    }

    public void setFinancingdocsreceived7fileupl(String financingdocsreceived7fileupl) {
        this.financingdocsreceived7fileupl = financingdocsreceived7fileupl;
    }

    public String getFinancingdocsreceived7string() {
        return financingdocsreceived7string;
    }

    public void setFinancingdocsreceived7string(String financingdocsreceived7string) {
        this.financingdocsreceived7string = financingdocsreceived7string;
    }

    public Short getFinancingdocsreceived7che() {
        return financingdocsreceived7che;
    }

    public void setFinancingdocsreceived7che(Short financingdocsreceived7che) {
        this.financingdocsreceived7che = financingdocsreceived7che;
    }

    public String getFinancingdocsreceived7do() {
        return financingdocsreceived7do;
    }

    public void setFinancingdocsreceived7do(String financingdocsreceived7do) {
        this.financingdocsreceived7do = financingdocsreceived7do;
    }

    public Date getScheduleappointmentby8d() {
        return scheduleappointmentby8d;
    }

    public void setScheduleappointmentby8d(Date scheduleappointmentby8d) {
        this.scheduleappointmentby8d = scheduleappointmentby8d;
    }

    public String getScheduleappointmentby8st() {
        return scheduleappointmentby8st;
    }

    public void setScheduleappointmentby8st(String scheduleappointmentby8st) {
        this.scheduleappointmentby8st = scheduleappointmentby8st;
    }

    public Short getScheduleappointmentby8che() {
        return scheduleappointmentby8che;
    }

    public void setScheduleappointmentby8che(Short scheduleappointmentby8che) {
        this.scheduleappointmentby8che = scheduleappointmentby8che;
    }

    public String getScheduleappointmentby8do() {
        return scheduleappointmentby8do;
    }

    public void setScheduleappointmentby8do(String scheduleappointmentby8do) {
        this.scheduleappointmentby8do = scheduleappointmentby8do;
    }

    public String getSigningcontractbycustomer9fi() {
        return signingcontractbycustomer9fi;
    }

    public void setSigningcontractbycustomer9fi(String signingcontractbycustomer9fi) {
        this.signingcontractbycustomer9fi = signingcontractbycustomer9fi;
    }

    public String getSigningcontractbycustomer9st() {
        return signingcontractbycustomer9st;
    }

    public void setSigningcontractbycustomer9st(String signingcontractbycustomer9st) {
        this.signingcontractbycustomer9st = signingcontractbycustomer9st;
    }

    public Short getSigningcontractbycustomer9che() {
        return signingcontractbycustomer9che;
    }

    public void setSigningcontractbycustomer9che(Short signingcontractbycustomer9che) {
        this.signingcontractbycustomer9che = signingcontractbycustomer9che;
    }

    public String getSigningcontractbycustomer9done() {
        return signingcontractbycustomer9done;
    }

    public void setSigningcontractbycustomer9done(String signingcontractbycustomer9done) {
        this.signingcontractbycustomer9done = signingcontractbycustomer9done;
    }

    public String getAlldocscompleted10string() {
        return alldocscompleted10string;
    }

    public void setAlldocscompleted10string(String alldocscompleted10string) {
        this.alldocscompleted10string = alldocscompleted10string;
    }

    public BigInteger getAlldocscompleted10checkbox() {
        return alldocscompleted10checkbox;
    }

    public void setAlldocscompleted10checkbox(BigInteger alldocscompleted10checkbox) {
        this.alldocscompleted10checkbox = alldocscompleted10checkbox;
    }

    public String getAlldocscompleted10do() {
        return alldocscompleted10do;
    }

    public void setAlldocscompleted10do(String alldocscompleted10do) {
        this.alldocscompleted10do = alldocscompleted10do;
    }

    public String getNoticetoproceed11string() {
        return noticetoproceed11string;
    }

    public void setNoticetoproceed11string(String noticetoproceed11string) {
        this.noticetoproceed11string = noticetoproceed11string;
    }

    public Short getNoticetoproceed11checkbox() {
        return noticetoproceed11checkbox;
    }

    public void setNoticetoproceed11checkbox(Short noticetoproceed11checkbox) {
        this.noticetoproceed11checkbox = noticetoproceed11checkbox;
    }

    public String getNoticetoproceed11done() {
        return noticetoproceed11done;
    }

    public void setNoticetoproceed11done(String noticetoproceed11done) {
        this.noticetoproceed11done = noticetoproceed11done;
    }

    public String getGivenforconcierge12string() {
        return givenforconcierge12string;
    }

    public void setGivenforconcierge12string(String givenforconcierge12string) {
        this.givenforconcierge12string = givenforconcierge12string;
    }

    public Short getGivenforconcierge12checkbox() {
        return givenforconcierge12checkbox;
    }

    public void setGivenforconcierge12checkbox(Short givenforconcierge12checkbox) {
        this.givenforconcierge12checkbox = givenforconcierge12checkbox;
    }

    public String getGivenforconcierge12done() {
        return givenforconcierge12done;
    }

    public void setGivenforconcierge12done(String givenforconcierge12done) {
        this.givenforconcierge12done = givenforconcierge12done;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FinanceEntity)) {
            return false;
        }
        FinanceEntity other = (FinanceEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.entity.Finance[ id=" + id + " ]";
    }
    
}
