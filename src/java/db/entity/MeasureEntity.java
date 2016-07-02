/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sergey
 */
@Entity
@Table(name = "MEASURE")
@XmlRootElement
public class MeasureEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CASE_ID")
    private String caseId;
    @Column(name = "TOTAL")
    private double total;
    @Column(name = "CUSTOMERID")
    private Integer customerid;
    @Column(name = "NUMBER1INSULATATTICBLOWNCHE")
    private Integer number1insulatatticblownche;
    @Size(max = 300)
    @Column(name = "NUMBER1INSULATATTICBLOWNSTRING")
    private String number1insulatatticblownstring;
    @Column(name = "SQFT1")
    private Integer sqft1;
    @Column(name = "NUMBER1INSULATATTICBLOWNRESULT")
    private double number1insulatatticblownresult;
    @Column(name = "NUMBER2REMOVEANDREPLACECHE")
    private Integer number2removeandreplaceche;
    @Column(name = "SQFT2")
    private Integer sqft2;
    @Column(name = "NUMBER2REMOVEANDREPLACERESULT")
    private double number2removeandreplaceresult;
    @Column(name = "NUMBER3INSTALLBATTEDINIONCHE")
    private Integer number3installbattedinionche;
    @Column(name = "SQFT3")
    private Integer sqft3;
    @Column(name = "NUMBER3INSTALLBATTEDINRESULT")
    private double number3installbattedinresult;
    @Column(name = "NUMBER4REPLACEDUCTSCHECKBOX")
    private Integer number4replaceductscheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER4REPLACEDUCTSSTRING")
    private String number4replaceductsstring;
    @Column(name = "SQFT4")
    private Integer sqft4;
    @Column(name = "NUMBER4REPLACEDUCTSRESULT")
    private double number4replaceductsresult;
    @Column(name = "SQFT5")
    private Integer sqft5;
    @Column(name = "NUMBER5AIRSEALPCHECKBOX")
    private Integer number5airsealpcheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER5AIRSEALSTRING")
    private String number5airsealstring;
    @Column(name = "NUMBER5AIRSEALPARESULT")
    private double number5airsealparesult;
    @Column(name = "SQFT6")
    private Integer sqft6;
    @Column(name = "NUMBER6CHECKBOX")
    private Integer number6checkbox;
    @Size(max = 300)
    @Column(name = "NUMBER6STRING")
    private String number6string;
    @Column(name = "NUMBER6RESULT")
    private double number6result;
    @Column(name = "SQFT7A")
    private Integer sqft7a;
    @Column(name = "NUMBER7AINSTALLDUCTINGCHECKBOX")
    private Integer number7ainstallductingcheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER7AINSTALLDUCTINGSTRING")
    private String number7ainstallductingstring;
    @Column(name = "NUMBER7AINSTALLDUCTINGRESULT")
    private double number7ainstallductingresult;
    @Column(name = "SQFT7B")
    private Integer sqft7b;
    @Column(name = "NUMBER7BCHECKBOX")
    private Integer number7bcheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER7BSTRING")
    private String number7bstring;
    @Column(name = "NUMBER7BRESULT")
    private double number7bresult;
    @Column(name = "SQFT8A")
    private Integer sqft8a;
    @Column(name = "NUMBER8ACHECKBOX")
    private Integer number8acheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER8ANEWHVACSTRING")
    private String number8anewhvacstring;
    @Column(name = "NUMBER8ARESULT")
    private double number8aresult;
    @Column(name = "SQFT8B")
    private Integer sqft8b;
    @Column(name = "NUMBER8BCHECKBOX")
    private Integer number8bcheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER8BNEWHVACSYSSTRING")
    private String number8bnewhvacsysstring;
    @Column(name = "NUMBER8BRESULT")
    private double number8bresult;
    @Column(name = "SQFT8BII")
    private Integer sqft8bii;
    @Column(name = "NUMBER8BIIINCLUDECHECKBOX")
    private Integer number8biiincludecheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER8BIIINCLUDESTRING")
    private String number8biiincludestring;
    @Column(name = "NUMBER8BIIINCLUDRESULT")
    private double number8biiincludresult;
    @Column(name = "SQFT9")
    private Integer sqft9;
    @Column(name = "NUMBER9SINGLEDUALZCHECKBOX")
    private Integer number9singledualzcheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER9SINGLEDUALZOSTRING")
    private String number9singledualzostring;
    @Column(name = "NUMBER9SINGLEDRESULT")
    private double number9singledresult;
    @Column(name = "SQFT91")
    private Integer sqft91;
    @Column(name = "NUMBER91ARELOCHECKBOX")
    private Integer number91arelocheckbox;
    @Column(name = "NUMBER91ARELOINT")
    private Integer number91areloint;
    @Column(name = "NUMBER91ARELOCRESULT")
    private double number91arelocresult;
    @Column(name = "NUMBER91BCUTINSUPPLYVCHECKBOX")
    private Integer number91bcutinsupplyvcheckbox;
    @Column(name = "NUMBER91BCUTINSUPPLYINT")
    private Integer number91bcutinsupplyint;
    @Column(name = "NUMBER91BCUTINSUPPLYVRESULT")
    private double number91bcutinsupplyvresult;
    @Column(name = "NUMBER91CHCHECKBOX")
    private Integer number91chcheckbox;
    @Column(name = "NUMBER91CHVAINT")
    private Integer number91chvaint;
    @Column(name = "NUMBER91CHVACCUTINRESULT")
    private double number91chvaccutinresult;
    @Column(name = "NUMBER91DDUCHECKBOX")
    private Integer number91dducheckbox;
    @Column(name = "NUMBER91DDUCINT")
    private Integer number91dducint;
    @Column(name = "NUMBER91DDUCTRESULT")
    private double number91dductresult;
    @Column(name = "NUMBER91ENECHECKBOX")
    private Integer number91enecheckbox;
    @Column(name = "NUMBER91ENEINT")
    private Integer number91eneint;
    @Column(name = "NUMBER91ENERESULT")
    private double number91eneresult;
    @Column(name = "NUMBER91FENLACHECKBOX")
    private Integer number91fenlacheckbox;
    @Column(name = "NUMBER91FENLARGINT")
    private Integer number91fenlargint;
    @Column(name = "NUMBER91FENLARGERRESULT")
    private double number91fenlargerresult;
    @Column(name = "NUMBER92NOTESCHECKBOX")
    private Integer number92notescheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER92NOTESSTRING")
    private String number92notesstring;
    @Column(name = "NUMBER93COSTPERKWCHECKBOX")
    private Integer number93costperkwcheckbox;
    @Column(name = "NUMBER93COSTPERKWINT")
    private Integer number93costperkwint;
    @Column(name = "NUMBER93COSTPERKWRESALT")
    private double number93costperkwresalt;
    @Column(name = "NUMBER93DCKWSDOUBLE")
    private double number93dckwsdouble;
    @Column(name = "NUMBER93DCKWSRESALT")
    private double number93dckwsresalt;
    @Column(name = "NUMBER10INSTALLWINDOWSCHECKBOX")
    private Integer number10installwindowscheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER10NUMOFWINDOWS")
    private String number10numofwindows;
    @Column(name = "NUMBER10TOTALUNITEDINCHESINT")
    private Integer number10totalunitedinchesint;
    @Column(name = "NUMBER10INSTALLRESULT")
    private double number10installresult;
    @Size(max = 300)
    @Column(name = "NUMBER10NUMOFSLIDERS")
    private String number10numofsliders;
    @Size(max = 300)
    @Column(name = "NUMBER10LINEARFEET")
    private String number10linearfeet;
    @Column(name = "NUMBER10LINEARFEETRESULT")
    private double number10linearfeetresult;
    @Column(name = "NUMBER101ACUTINDOORCHECKBOX")
    private Integer number101acutindoorcheckbox;
    @Column(name = "NUMBER101ACUTINDOORINT")
    private Integer number101acutindoorint;
    @Column(name = "NUMBER101ACUTINDOORRESULT")
    private double number101acutindoorresult;
    @Column(name = "NUMBER101BADDHEADERCHECKBOX")
    private Integer number101baddheadercheckbox;
    @Column(name = "NUMBER101BADDHEADERINT")
    private Integer number101baddheaderint;
    @Column(name = "NUMBER101BADDHEADERRESULT")
    private double number101baddheaderresult;
    @Column(name = "NUMBER102ACUTDOWNCHECKBOX")
    private Integer number102acutdowncheckbox;
    @Column(name = "NUMBER102ACUTDOWNWIRESULT")
    private double number102acutdownwiresult;
    @Column(name = "NUMBER102BELECTRICALCHECKBOX")
    private Integer number102belectricalcheckbox;
    @Column(name = "NUMBER102BELECTRICALRERESULT")
    private double number102belectricalreresult;
    @Column(name = "NUMBER102CGARDENCHECKBOX")
    private Integer number102cgardencheckbox;
    @Column(name = "NUMBER102CGARDENRESULT")
    private double number102cgardenresult;
    @Column(name = "NUMBER102DGARDENWICHECKBOX")
    private Integer number102dgardenwicheckbox;
    @Column(name = "NUMBER102DGARDENWIRESULT")
    private double number102dgardenwiresult;
    @Column(name = "NUMBER103ALLGLAZINGCHECKBOX")
    private Integer number103allglazingcheckbox;
    @Column(name = "NUMBER104WICHECKBOX")
    private Integer number104wicheckbox;
    @Column(name = "NUMBER11INSTALLPOOLCHECKBOX")
    private Integer number11installpoolcheckbox;
    @Column(name = "NUMBER11INSTALLPOOLPUMPRESULT")
    private double number11installpoolpumpresult;
    @Column(name = "NUMBER12INSTALLWHOLECHECKBOX")
    private Integer number12installwholecheckbox;
    @Column(name = "NUMBER12INSTALLWHOLEHOINT")
    private Integer number12installwholehoint;
    @Column(name = "NUMBER12INSTALLWHOLEHORESULT")
    private double number12installwholehoresult;
    @Column(name = "NUMBER13INSTALLWACHECKBOX")
    private Integer number13installwacheckbox;
    @Column(name = "NUMBER13INSTALLWATERHEDOUBLE")
    private double number13installwaterhedouble;
    @Column(name = "NUMBER13INSTALLWARESULT")
    private double number13installwaresult;
    @Column(name = "NUMBER14PERMITSCHECKBOX")
    private Integer number14permitscheckbox;
    @Column(name = "NUMBER14PERMITSRESULT")
    private double number14permitsresult;
    @Column(name = "NUMBER15INSTALLBATTERYCHECKBOX")
    private Integer number15installbatterycheckbox;
    @Column(name = "NUMBER15INSTALLBARESULT")
    private double number15installbaresult;
    @Column(name = "NUMBER15AINSTALLKWDCSOCHECKBOX")
    private Integer number15ainstallkwdcsocheckbox;
    @Column(name = "NUMBER15AINSTALLKWDCSODOUBLE")
    private double number15ainstallkwdcsodouble;
    @Column(name = "NUMBER15BINCLUDESEXCHECKBOX")
    private Integer number15bincludesexcheckbox;
    @Column(name = "NUMBER15CSOLARCHECKBOX")
    private Integer number15csolarcheckbox;
    @Column(name = "NUMBER15DINCLUDESSYCHECKBOX")
    private Integer number15dincludessycheckbox;
    @Column(name = "NUMBER15EICHECKBOX")
    private Integer number15eicheckbox;
    @Column(name = "NUMBER15FCANADIANSOCHECKBOX")
    private Integer number15fcanadiansocheckbox;
    @Column(name = "WHOLECOST")
    private double wholecost;
    @Column(name = "SOLARCOST")
    private double solarcost;
    @Column(name = "NEW1")
    private Integer new1;
    @Column(name = "MARGINPERCENTAGE")
    private Integer marginpercentage;
    @Column(name = "PGEREBATEPOINTS")
    private Integer pgerebatepoints;
    @Column(name = "PGEREBATEAMOUNT")
    private Integer pgerebateamount;
    @Column(name = "SMUDREBATEAMOUNT")
    private Integer smudrebateamount;
    @Column(name = "SQFT5A")
    private Integer sqft5a;
    @Column(name = "NUMBER5ACHECKBOX")
    private Integer number5acheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER5ASTRING")
    private String number5astring;
    @Column(name = "NUMBER5ARESULT")
    private double number5aresult;
    @Column(name = "SQFT5B")
    private Integer sqft5b;
    @Column(name = "NUMBER5BCHECKBOX")
    private Integer number5bcheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER5BSTRING")
    private String number5bstring;
    @Column(name = "NUMBER5BRESULT")
    private double number5bresult;
    @Column(name = "SQFT8C")
    private Integer sqft8c;
    @Column(name = "NUMBER8CCHECKBOX")
    private Integer number8ccheckbox;
    @Column(name = "NUMBER8CRESULT")
    private double number8cresult;
    @Column(name = "NUMBER8DCHECKBOX")
    private Integer number8dcheckbox;
    @Column(name = "NUMBER8DRESULT")
    private double number8dresult;

    public MeasureEntity() {
    }

    public MeasureEntity(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getNumber1insulatatticblownche() {
        return number1insulatatticblownche;
    }

    public void setNumber1insulatatticblownche(Integer number1insulatatticblownche) {
        this.number1insulatatticblownche = number1insulatatticblownche;
    }

    public String getNumber1insulatatticblownstring() {
        return number1insulatatticblownstring;
    }

    public void setNumber1insulatatticblownstring(String number1insulatatticblownstring) {
        this.number1insulatatticblownstring = number1insulatatticblownstring;
    }

    public Integer getSqft1() {
        return sqft1;
    }

    public void setSqft1(Integer sqft1) {
        this.sqft1 = sqft1;
    }

    public double getNumber1insulatatticblownresult() {
        return number1insulatatticblownresult;
    }

    public void setNumber1insulatatticblownresult(double number1insulatatticblownresult) {
        this.number1insulatatticblownresult = number1insulatatticblownresult;
    }

    public Integer getNumber2removeandreplaceche() {
        return number2removeandreplaceche;
    }

    public void setNumber2removeandreplaceche(Integer number2removeandreplaceche) {
        this.number2removeandreplaceche = number2removeandreplaceche;
    }

    public Integer getSqft2() {
        return sqft2;
    }

    public void setSqft2(Integer sqft2) {
        this.sqft2 = sqft2;
    }

    public double getNumber2removeandreplaceresult() {
        return number2removeandreplaceresult;
    }

    public void setNumber2removeandreplaceresult(double number2removeandreplaceresult) {
        this.number2removeandreplaceresult = number2removeandreplaceresult;
    }

    public Integer getNumber3installbattedinionche() {
        return number3installbattedinionche;
    }

    public void setNumber3installbattedinionche(Integer number3installbattedinionche) {
        this.number3installbattedinionche = number3installbattedinionche;
    }

    public Integer getSqft3() {
        return sqft3;
    }

    public void setSqft3(Integer sqft3) {
        this.sqft3 = sqft3;
    }

    public double getNumber3installbattedinresult() {
        return number3installbattedinresult;
    }

    public void setNumber3installbattedinresult(double number3installbattedinresult) {
        this.number3installbattedinresult = number3installbattedinresult;
    }

    public Integer getNumber4replaceductscheckbox() {
        return number4replaceductscheckbox;
    }

    public void setNumber4replaceductscheckbox(Integer number4replaceductscheckbox) {
        this.number4replaceductscheckbox = number4replaceductscheckbox;
    }

    public String getNumber4replaceductsstring() {
        return number4replaceductsstring;
    }

    public void setNumber4replaceductsstring(String number4replaceductsstring) {
        this.number4replaceductsstring = number4replaceductsstring;
    }

    public Integer getSqft4() {
        return sqft4;
    }

    public void setSqft4(Integer sqft4) {
        this.sqft4 = sqft4;
    }

    public double getNumber4replaceductsresult() {
        return number4replaceductsresult;
    }

    public void setNumber4replaceductsresult(double number4replaceductsresult) {
        this.number4replaceductsresult = number4replaceductsresult;
    }

    public Integer getSqft5() {
        return sqft5;
    }

    public void setSqft5(Integer sqft5) {
        this.sqft5 = sqft5;
    }

    public Integer getNumber5airsealpcheckbox() {
        return number5airsealpcheckbox;
    }

    public void setNumber5airsealpcheckbox(Integer number5airsealpcheckbox) {
        this.number5airsealpcheckbox = number5airsealpcheckbox;
    }

    public String getNumber5airsealstring() {
        return number5airsealstring;
    }

    public void setNumber5airsealstring(String number5airsealstring) {
        this.number5airsealstring = number5airsealstring;
    }

    public double getNumber5airsealparesult() {
        return number5airsealparesult;
    }

    public void setNumber5airsealparesult(double number5airsealparesult) {
        this.number5airsealparesult = number5airsealparesult;
    }

    public Integer getSqft6() {
        return sqft6;
    }

    public void setSqft6(Integer sqft6) {
        this.sqft6 = sqft6;
    }

    public Integer getNumber6checkbox() {
        return number6checkbox;
    }

    public void setNumber6checkbox(Integer number6checkbox) {
        this.number6checkbox = number6checkbox;
    }

    public String getNumber6string() {
        return number6string;
    }

    public void setNumber6string(String number6string) {
        this.number6string = number6string;
    }

    public double getNumber6result() {
        return number6result;
    }

    public void setNumber6result(double number6result) {
        this.number6result = number6result;
    }

    public Integer getSqft7a() {
        return sqft7a;
    }

    public void setSqft7a(Integer sqft7a) {
        this.sqft7a = sqft7a;
    }

    public Integer getNumber7ainstallductingcheckbox() {
        return number7ainstallductingcheckbox;
    }

    public void setNumber7ainstallductingcheckbox(Integer number7ainstallductingcheckbox) {
        this.number7ainstallductingcheckbox = number7ainstallductingcheckbox;
    }

    public String getNumber7ainstallductingstring() {
        return number7ainstallductingstring;
    }

    public void setNumber7ainstallductingstring(String number7ainstallductingstring) {
        this.number7ainstallductingstring = number7ainstallductingstring;
    }

    public double getNumber7ainstallductingresult() {
        return number7ainstallductingresult;
    }

    public void setNumber7ainstallductingresult(double number7ainstallductingresult) {
        this.number7ainstallductingresult = number7ainstallductingresult;
    }

    public Integer getSqft7b() {
        return sqft7b;
    }

    public void setSqft7b(Integer sqft7b) {
        this.sqft7b = sqft7b;
    }

    public Integer getNumber7bcheckbox() {
        return number7bcheckbox;
    }

    public void setNumber7bcheckbox(Integer number7bcheckbox) {
        this.number7bcheckbox = number7bcheckbox;
    }

    public String getNumber7bstring() {
        return number7bstring;
    }

    public void setNumber7bstring(String number7bstring) {
        this.number7bstring = number7bstring;
    }

    public double getNumber7bresult() {
        return number7bresult;
    }

    public void setNumber7bresult(double number7bresult) {
        this.number7bresult = number7bresult;
    }

    public Integer getSqft8a() {
        return sqft8a;
    }

    public void setSqft8a(Integer sqft8a) {
        this.sqft8a = sqft8a;
    }

    public Integer getNumber8acheckbox() {
        return number8acheckbox;
    }

    public void setNumber8acheckbox(Integer number8acheckbox) {
        this.number8acheckbox = number8acheckbox;
    }

    public String getNumber8anewhvacstring() {
        return number8anewhvacstring;
    }

    public void setNumber8anewhvacstring(String number8anewhvacstring) {
        this.number8anewhvacstring = number8anewhvacstring;
    }

    public double getNumber8aresult() {
        return number8aresult;
    }

    public void setNumber8aresult(double number8aresult) {
        this.number8aresult = number8aresult;
    }

    public Integer getSqft8b() {
        return sqft8b;
    }

    public void setSqft8b(Integer sqft8b) {
        this.sqft8b = sqft8b;
    }

    public Integer getNumber8bcheckbox() {
        return number8bcheckbox;
    }

    public void setNumber8bcheckbox(Integer number8bcheckbox) {
        this.number8bcheckbox = number8bcheckbox;
    }

    public String getNumber8bnewhvacsysstring() {
        return number8bnewhvacsysstring;
    }

    public void setNumber8bnewhvacsysstring(String number8bnewhvacsysstring) {
        this.number8bnewhvacsysstring = number8bnewhvacsysstring;
    }

    public double getNumber8bresult() {
        return number8bresult;
    }

    public void setNumber8bresult(double number8bresult) {
        this.number8bresult = number8bresult;
    }

    public Integer getSqft8bii() {
        return sqft8bii;
    }

    public void setSqft8bii(Integer sqft8bii) {
        this.sqft8bii = sqft8bii;
    }

    public Integer getNumber8biiincludecheckbox() {
        return number8biiincludecheckbox;
    }

    public void setNumber8biiincludecheckbox(Integer number8biiincludecheckbox) {
        this.number8biiincludecheckbox = number8biiincludecheckbox;
    }

    public String getNumber8biiincludestring() {
        return number8biiincludestring;
    }

    public void setNumber8biiincludestring(String number8biiincludestring) {
        this.number8biiincludestring = number8biiincludestring;
    }

    public double getNumber8biiincludresult() {
        return number8biiincludresult;
    }

    public void setNumber8biiincludresult(double number8biiincludresult) {
        this.number8biiincludresult = number8biiincludresult;
    }

    public Integer getSqft9() {
        return sqft9;
    }

    public void setSqft9(Integer sqft9) {
        this.sqft9 = sqft9;
    }

    public Integer getNumber9singledualzcheckbox() {
        return number9singledualzcheckbox;
    }

    public void setNumber9singledualzcheckbox(Integer number9singledualzcheckbox) {
        this.number9singledualzcheckbox = number9singledualzcheckbox;
    }

    public String getNumber9singledualzostring() {
        return number9singledualzostring;
    }

    public void setNumber9singledualzostring(String number9singledualzostring) {
        this.number9singledualzostring = number9singledualzostring;
    }

    public double getNumber9singledresult() {
        return number9singledresult;
    }

    public void setNumber9singledresult(double number9singledresult) {
        this.number9singledresult = number9singledresult;
    }

    public Integer getSqft91() {
        return sqft91;
    }

    public void setSqft91(Integer sqft91) {
        this.sqft91 = sqft91;
    }

    public Integer getNumber91arelocheckbox() {
        return number91arelocheckbox;
    }

    public void setNumber91arelocheckbox(Integer number91arelocheckbox) {
        this.number91arelocheckbox = number91arelocheckbox;
    }

    public Integer getNumber91areloint() {
        return number91areloint;
    }

    public void setNumber91areloint(Integer number91areloint) {
        this.number91areloint = number91areloint;
    }

    public double getNumber91arelocresult() {
        return number91arelocresult;
    }

    public void setNumber91arelocresult(double number91arelocresult) {
        this.number91arelocresult = number91arelocresult;
    }

    public Integer getNumber91bcutinsupplyvcheckbox() {
        return number91bcutinsupplyvcheckbox;
    }

    public void setNumber91bcutinsupplyvcheckbox(Integer number91bcutinsupplyvcheckbox) {
        this.number91bcutinsupplyvcheckbox = number91bcutinsupplyvcheckbox;
    }

    public Integer getNumber91bcutinsupplyint() {
        return number91bcutinsupplyint;
    }

    public void setNumber91bcutinsupplyint(Integer number91bcutinsupplyint) {
        this.number91bcutinsupplyint = number91bcutinsupplyint;
    }

    public double getNumber91bcutinsupplyvresult() {
        return number91bcutinsupplyvresult;
    }

    public void setNumber91bcutinsupplyvresult(double number91bcutinsupplyvresult) {
        this.number91bcutinsupplyvresult = number91bcutinsupplyvresult;
    }

    public Integer getNumber91chcheckbox() {
        return number91chcheckbox;
    }

    public void setNumber91chcheckbox(Integer number91chcheckbox) {
        this.number91chcheckbox = number91chcheckbox;
    }

    public Integer getNumber91chvaint() {
        return number91chvaint;
    }

    public void setNumber91chvaint(Integer number91chvaint) {
        this.number91chvaint = number91chvaint;
    }

    public double getNumber91chvaccutinresult() {
        return number91chvaccutinresult;
    }

    public void setNumber91chvaccutinresult(double number91chvaccutinresult) {
        this.number91chvaccutinresult = number91chvaccutinresult;
    }

    public Integer getNumber91dducheckbox() {
        return number91dducheckbox;
    }

    public void setNumber91dducheckbox(Integer number91dducheckbox) {
        this.number91dducheckbox = number91dducheckbox;
    }

    public Integer getNumber91dducint() {
        return number91dducint;
    }

    public void setNumber91dducint(Integer number91dducint) {
        this.number91dducint = number91dducint;
    }

    public double getNumber91dductresult() {
        return number91dductresult;
    }

    public void setNumber91dductresult(double number91dductresult) {
        this.number91dductresult = number91dductresult;
    }

    public Integer getNumber91enecheckbox() {
        return number91enecheckbox;
    }

    public void setNumber91enecheckbox(Integer number91enecheckbox) {
        this.number91enecheckbox = number91enecheckbox;
    }

    public Integer getNumber91eneint() {
        return number91eneint;
    }

    public void setNumber91eneint(Integer number91eneint) {
        this.number91eneint = number91eneint;
    }

    public double getNumber91eneresult() {
        return number91eneresult;
    }

    public void setNumber91eneresult(double number91eneresult) {
        this.number91eneresult = number91eneresult;
    }

    public Integer getNumber91fenlacheckbox() {
        return number91fenlacheckbox;
    }

    public void setNumber91fenlacheckbox(Integer number91fenlacheckbox) {
        this.number91fenlacheckbox = number91fenlacheckbox;
    }

    public Integer getNumber91fenlargint() {
        return number91fenlargint;
    }

    public void setNumber91fenlargint(Integer number91fenlargint) {
        this.number91fenlargint = number91fenlargint;
    }

    public double getNumber91fenlargerresult() {
        return number91fenlargerresult;
    }

    public void setNumber91fenlargerresult(double number91fenlargerresult) {
        this.number91fenlargerresult = number91fenlargerresult;
    }

    public Integer getNumber92notescheckbox() {
        return number92notescheckbox;
    }

    public void setNumber92notescheckbox(Integer number92notescheckbox) {
        this.number92notescheckbox = number92notescheckbox;
    }

    public String getNumber92notesstring() {
        return number92notesstring;
    }

    public void setNumber92notesstring(String number92notesstring) {
        this.number92notesstring = number92notesstring;
    }

    public Integer getNumber93costperkwcheckbox() {
        return number93costperkwcheckbox;
    }

    public void setNumber93costperkwcheckbox(Integer number93costperkwcheckbox) {
        this.number93costperkwcheckbox = number93costperkwcheckbox;
    }

    public Integer getNumber93costperkwint() {
        return number93costperkwint;
    }

    public void setNumber93costperkwint(Integer number93costperkwint) {
        this.number93costperkwint = number93costperkwint;
    }

    public double getNumber93costperkwresalt() {
        return number93costperkwresalt;
    }

    public void setNumber93costperkwresalt(double number93costperkwresalt) {
        this.number93costperkwresalt = number93costperkwresalt;
    }

    public double getNumber93dckwsdouble() {
        return number93dckwsdouble;
    }

    public void setNumber93dckwsdouble(double number93dckwsdouble) {
        this.number93dckwsdouble = number93dckwsdouble;
    }

    public double getNumber93dckwsresalt() {
        return number93dckwsresalt;
    }

    public void setNumber93dckwsresalt(double number93dckwsresalt) {
        this.number93dckwsresalt = number93dckwsresalt;
    }

    public Integer getNumber10installwindowscheckbox() {
        return number10installwindowscheckbox;
    }

    public void setNumber10installwindowscheckbox(Integer number10installwindowscheckbox) {
        this.number10installwindowscheckbox = number10installwindowscheckbox;
    }

    public String getNumber10numofwindows() {
        return number10numofwindows;
    }

    public void setNumber10numofwindows(String number10numofwindows) {
        this.number10numofwindows = number10numofwindows;
    }

    public Integer getNumber10totalunitedinchesint() {
        return number10totalunitedinchesint;
    }

    public void setNumber10totalunitedinchesint(Integer number10totalunitedinchesint) {
        this.number10totalunitedinchesint = number10totalunitedinchesint;
    }

    public double getNumber10installresult() {
        return number10installresult;
    }

    public void setNumber10installresult(double number10installresult) {
        this.number10installresult = number10installresult;
    }

    public String getNumber10numofsliders() {
        return number10numofsliders;
    }

    public void setNumber10numofsliders(String number10numofsliders) {
        this.number10numofsliders = number10numofsliders;
    }

    public String getNumber10linearfeet() {
        return number10linearfeet;
    }

    public void setNumber10linearfeet(String number10linearfeet) {
        this.number10linearfeet = number10linearfeet;
    }

    public double getNumber10linearfeetresult() {
        return number10linearfeetresult;
    }

    public void setNumber10linearfeetresult(double number10linearfeetresult) {
        this.number10linearfeetresult = number10linearfeetresult;
    }

    public Integer getNumber101acutindoorcheckbox() {
        return number101acutindoorcheckbox;
    }

    public void setNumber101acutindoorcheckbox(Integer number101acutindoorcheckbox) {
        this.number101acutindoorcheckbox = number101acutindoorcheckbox;
    }

    public Integer getNumber101acutindoorint() {
        return number101acutindoorint;
    }

    public void setNumber101acutindoorint(Integer number101acutindoorint) {
        this.number101acutindoorint = number101acutindoorint;
    }

    public double getNumber101acutindoorresult() {
        return number101acutindoorresult;
    }

    public void setNumber101acutindoorresult(double number101acutindoorresult) {
        this.number101acutindoorresult = number101acutindoorresult;
    }

    public Integer getNumber101baddheadercheckbox() {
        return number101baddheadercheckbox;
    }

    public void setNumber101baddheadercheckbox(Integer number101baddheadercheckbox) {
        this.number101baddheadercheckbox = number101baddheadercheckbox;
    }

    public Integer getNumber101baddheaderint() {
        return number101baddheaderint;
    }

    public void setNumber101baddheaderint(Integer number101baddheaderint) {
        this.number101baddheaderint = number101baddheaderint;
    }

    public double getNumber101baddheaderresult() {
        return number101baddheaderresult;
    }

    public void setNumber101baddheaderresult(double number101baddheaderresult) {
        this.number101baddheaderresult = number101baddheaderresult;
    }

    public Integer getNumber102acutdowncheckbox() {
        return number102acutdowncheckbox;
    }

    public void setNumber102acutdowncheckbox(Integer number102acutdowncheckbox) {
        this.number102acutdowncheckbox = number102acutdowncheckbox;
    }

    public double getNumber102acutdownwiresult() {
        return number102acutdownwiresult;
    }

    public void setNumber102acutdownwiresult(double number102acutdownwiresult) {
        this.number102acutdownwiresult = number102acutdownwiresult;
    }

    public Integer getNumber102belectricalcheckbox() {
        return number102belectricalcheckbox;
    }

    public void setNumber102belectricalcheckbox(Integer number102belectricalcheckbox) {
        this.number102belectricalcheckbox = number102belectricalcheckbox;
    }

    public double getNumber102belectricalreresult() {
        return number102belectricalreresult;
    }

    public void setNumber102belectricalreresult(double number102belectricalreresult) {
        this.number102belectricalreresult = number102belectricalreresult;
    }

    public Integer getNumber102cgardencheckbox() {
        return number102cgardencheckbox;
    }

    public void setNumber102cgardencheckbox(Integer number102cgardencheckbox) {
        this.number102cgardencheckbox = number102cgardencheckbox;
    }

    public double getNumber102cgardenresult() {
        return number102cgardenresult;
    }

    public void setNumber102cgardenresult(double number102cgardenresult) {
        this.number102cgardenresult = number102cgardenresult;
    }

    public Integer getNumber102dgardenwicheckbox() {
        return number102dgardenwicheckbox;
    }

    public void setNumber102dgardenwicheckbox(Integer number102dgardenwicheckbox) {
        this.number102dgardenwicheckbox = number102dgardenwicheckbox;
    }

    public double getNumber102dgardenwiresult() {
        return number102dgardenwiresult;
    }

    public void setNumber102dgardenwiresult(double number102dgardenwiresult) {
        this.number102dgardenwiresult = number102dgardenwiresult;
    }

    public Integer getNumber103allglazingcheckbox() {
        return number103allglazingcheckbox;
    }

    public void setNumber103allglazingcheckbox(Integer number103allglazingcheckbox) {
        this.number103allglazingcheckbox = number103allglazingcheckbox;
    }

    public Integer getNumber104wicheckbox() {
        return number104wicheckbox;
    }

    public void setNumber104wicheckbox(Integer number104wicheckbox) {
        this.number104wicheckbox = number104wicheckbox;
    }

    public Integer getNumber11installpoolcheckbox() {
        return number11installpoolcheckbox;
    }

    public void setNumber11installpoolcheckbox(Integer number11installpoolcheckbox) {
        this.number11installpoolcheckbox = number11installpoolcheckbox;
    }

    public double getNumber11installpoolpumpresult() {
        return number11installpoolpumpresult;
    }

    public void setNumber11installpoolpumpresult(double number11installpoolpumpresult) {
        this.number11installpoolpumpresult = number11installpoolpumpresult;
    }

    public Integer getNumber12installwholecheckbox() {
        return number12installwholecheckbox;
    }

    public void setNumber12installwholecheckbox(Integer number12installwholecheckbox) {
        this.number12installwholecheckbox = number12installwholecheckbox;
    }

    public Integer getNumber12installwholehoint() {
        return number12installwholehoint;
    }

    public void setNumber12installwholehoint(Integer number12installwholehoint) {
        this.number12installwholehoint = number12installwholehoint;
    }

    public double getNumber12installwholehoresult() {
        return number12installwholehoresult;
    }

    public void setNumber12installwholehoresult(double number12installwholehoresult) {
        this.number12installwholehoresult = number12installwholehoresult;
    }

    public Integer getNumber13installwacheckbox() {
        return number13installwacheckbox;
    }

    public void setNumber13installwacheckbox(Integer number13installwacheckbox) {
        this.number13installwacheckbox = number13installwacheckbox;
    }

    public double getNumber13installwaterhedouble() {
        return number13installwaterhedouble;
    }

    public void setNumber13installwaterhedouble(double number13installwaterhedouble) {
        this.number13installwaterhedouble = number13installwaterhedouble;
    }

    public double getNumber13installwaresult() {
        return number13installwaresult;
    }

    public void setNumber13installwaresult(double number13installwaresult) {
        this.number13installwaresult = number13installwaresult;
    }

    public Integer getNumber14permitscheckbox() {
        return number14permitscheckbox;
    }

    public void setNumber14permitscheckbox(Integer number14permitscheckbox) {
        this.number14permitscheckbox = number14permitscheckbox;
    }

    public double getNumber14permitsresult() {
        return number14permitsresult;
    }

    public void setNumber14permitsresult(double number14permitsresult) {
        this.number14permitsresult = number14permitsresult;
    }

    public Integer getNumber15installbatterycheckbox() {
        return number15installbatterycheckbox;
    }

    public void setNumber15installbatterycheckbox(Integer number15installbatterycheckbox) {
        this.number15installbatterycheckbox = number15installbatterycheckbox;
    }

    public double getNumber15installbaresult() {
        return number15installbaresult;
    }

    public void setNumber15installbaresult(double number15installbaresult) {
        this.number15installbaresult = number15installbaresult;
    }

    public Integer getNumber15ainstallkwdcsocheckbox() {
        return number15ainstallkwdcsocheckbox;
    }

    public void setNumber15ainstallkwdcsocheckbox(Integer number15ainstallkwdcsocheckbox) {
        this.number15ainstallkwdcsocheckbox = number15ainstallkwdcsocheckbox;
    }

    public double getNumber15ainstallkwdcsodouble() {
        return number15ainstallkwdcsodouble;
    }

    public void setNumber15ainstallkwdcsodouble(double number15ainstallkwdcsodouble) {
        this.number15ainstallkwdcsodouble = number15ainstallkwdcsodouble;
    }

    public Integer getNumber15bincludesexcheckbox() {
        return number15bincludesexcheckbox;
    }

    public void setNumber15bincludesexcheckbox(Integer number15bincludesexcheckbox) {
        this.number15bincludesexcheckbox = number15bincludesexcheckbox;
    }

    public Integer getNumber15csolarcheckbox() {
        return number15csolarcheckbox;
    }

    public void setNumber15csolarcheckbox(Integer number15csolarcheckbox) {
        this.number15csolarcheckbox = number15csolarcheckbox;
    }

    public Integer getNumber15dincludessycheckbox() {
        return number15dincludessycheckbox;
    }

    public void setNumber15dincludessycheckbox(Integer number15dincludessycheckbox) {
        this.number15dincludessycheckbox = number15dincludessycheckbox;
    }

    public Integer getNumber15eicheckbox() {
        return number15eicheckbox;
    }

    public void setNumber15eicheckbox(Integer number15eicheckbox) {
        this.number15eicheckbox = number15eicheckbox;
    }

    public Integer getNumber15fcanadiansocheckbox() {
        return number15fcanadiansocheckbox;
    }

    public void setNumber15fcanadiansocheckbox(Integer number15fcanadiansocheckbox) {
        this.number15fcanadiansocheckbox = number15fcanadiansocheckbox;
    }

    public double getWholecost() {
        return wholecost;
    }

    public void setWholecost(double wholecost) {
        this.wholecost = wholecost;
    }

    public double getSolarcost() {
        return solarcost;
    }

    public void setSolarcost(double solarcost) {
        this.solarcost = solarcost;
    }

    public Integer getNew1() {
        return new1;
    }

    public void setNew1(Integer new1) {
        this.new1 = new1;
    }

    public Integer getMarginpercentage() {
        return marginpercentage;
    }

    public void setMarginpercentage(Integer marginpercentage) {
        this.marginpercentage = marginpercentage;
    }

    public Integer getPgerebatepoints() {
        return pgerebatepoints;
    }

    public void setPgerebatepoints(Integer pgerebatepoints) {
        this.pgerebatepoints = pgerebatepoints;
    }

    public Integer getPgerebateamount() {
        return pgerebateamount;
    }

    public void setPgerebateamount(Integer pgerebateamount) {
        this.pgerebateamount = pgerebateamount;
    }

    public Integer getSmudrebateamount() {
        return smudrebateamount;
    }

    public void setSmudrebateamount(Integer smudrebateamount) {
        this.smudrebateamount = smudrebateamount;
    }

    public Integer getSqft5a() {
        return sqft5a;
    }

    public void setSqft5a(Integer sqft5a) {
        this.sqft5a = sqft5a;
    }

    public Integer getNumber5acheckbox() {
        return number5acheckbox;
    }

    public void setNumber5acheckbox(Integer number5acheckbox) {
        this.number5acheckbox = number5acheckbox;
    }

    public String getNumber5astring() {
        return number5astring;
    }

    public void setNumber5astring(String number5astring) {
        this.number5astring = number5astring;
    }

    public double getNumber5aresult() {
        return number5aresult;
    }

    public void setNumber5aresult(double number5aresult) {
        this.number5aresult = number5aresult;
    }

    public Integer getSqft5b() {
        return sqft5b;
    }

    public void setSqft5b(Integer sqft5b) {
        this.sqft5b = sqft5b;
    }

    public Integer getNumber5bcheckbox() {
        return number5bcheckbox;
    }

    public void setNumber5bcheckbox(Integer number5bcheckbox) {
        this.number5bcheckbox = number5bcheckbox;
    }

    public String getNumber5bstring() {
        return number5bstring;
    }

    public void setNumber5bstring(String number5bstring) {
        this.number5bstring = number5bstring;
    }

    public double getNumber5bresult() {
        return number5bresult;
    }

    public void setNumber5bresult(double number5bresult) {
        this.number5bresult = number5bresult;
    }

    public Integer getSqft8c() {
        return sqft8c;
    }

    public void setSqft8c(Integer sqft8c) {
        this.sqft8c = sqft8c;
    }

    public Integer getNumber8ccheckbox() {
        return number8ccheckbox;
    }

    public void setNumber8ccheckbox(Integer number8ccheckbox) {
        this.number8ccheckbox = number8ccheckbox;
    }

    public double getNumber8cresult() {
        return number8cresult;
    }

    public void setNumber8cresult(double number8cresult) {
        this.number8cresult = number8cresult;
    }

    public Integer getNumber8dcheckbox() {
        return number8dcheckbox;
    }

    public void setNumber8dcheckbox(Integer number8dcheckbox) {
        this.number8dcheckbox = number8dcheckbox;
    }

    public double getNumber8dresult() {
        return number8dresult;
    }

    public void setNumber8dresult(double number8dresult) {
        this.number8dresult = number8dresult;
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
        if (!(object instanceof MeasureEntity)) {
            return false;
        }
        MeasureEntity other = (MeasureEntity) object;
        if ((this.caseId == null && other.caseId != null) || (this.caseId != null && !this.caseId.equals(other.caseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.entity.Measure[ caseId=" + caseId + " ]";
    }
    
}
