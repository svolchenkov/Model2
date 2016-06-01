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
    private Integer total;
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
    private Serializable number1insulatatticblownresult;
    @Column(name = "NUMBER2REMOVEANDREPLACECHE")
    private Integer number2removeandreplaceche;
    @Column(name = "SQFT2")
    private Integer sqft2;
    @Column(name = "NUMBER2REMOVEANDREPLACERESULT")
    private Serializable number2removeandreplaceresult;
    @Column(name = "NUMBER3INSTALLBATTEDINIONCHE")
    private Integer number3installbattedinionche;
    @Column(name = "SQFT3")
    private Integer sqft3;
    @Column(name = "NUMBER3INSTALLBATTEDINRESULT")
    private Serializable number3installbattedinresult;
    @Column(name = "NUMBER4SEALDUCTINGCODCHECKBOX")
    private Integer number4sealductingcodcheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER4SEALDUCTINGCODECSTRING")
    private String number4sealductingcodecstring;
    @Column(name = "SQFT4")
    private Integer sqft4;
    @Column(name = "NUMBER4SEALDUCTINGCODERESULT")
    private Serializable number4sealductingcoderesult;
    @Column(name = "SQFT5")
    private Integer sqft5;
    @Column(name = "NUMBER5AIRSEALPCHECKBOX")
    private Integer number5airsealpcheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER5AIRSEALSTRING")
    private String number5airsealstring;
    @Column(name = "NUMBER5AIRSEALPARESULT")
    private Serializable number5airsealparesult;
    @Column(name = "SQFT6")
    private Integer sqft6;
    @Column(name = "NUMBER6CAZAREARECHECKBOX")
    private Integer number6cazarearecheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER6CAZAREATSTRING")
    private String number6cazareatstring;
    @Column(name = "NUMBER6CAZAREARESULT")
    private Serializable number6cazarearesult;
    @Column(name = "SQFT7A")
    private Integer sqft7a;
    @Column(name = "NUMBER7AINSTALLDUCTINGCHECKBOX")
    private Integer number7ainstallductingcheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER7AINSTALLDUCTINGSTRING")
    private String number7ainstallductingstring;
    @Column(name = "NUMBER7AINSTALLDUCTINGRESULT")
    private Serializable number7ainstallductingresult;
    @Column(name = "SQFT7B")
    private Integer sqft7b;
    @Column(name = "NUMBER7BINSTALLR8DUCHECKBOX")
    private Integer number7binstallr8ducheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER7BINSTALLR8DUCTSTRING")
    private String number7binstallr8ductstring;
    @Column(name = "NUMBER7BINSTALLR8DUCTRESULT")
    private Serializable number7binstallr8ductresult;
    @Column(name = "SQFT8A")
    private Integer sqft8a;
    @Column(name = "NUMBER8ANEWHVACICHECKBOX")
    private Integer number8anewhvacicheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER8ANEWHVACSTRING")
    private String number8anewhvacstring;
    @Column(name = "NUMBER8ANEWHVARESULT")
    private Serializable number8anewhvaresult;
    @Column(name = "SQFT8B")
    private Integer sqft8b;
    @Column(name = "NUMBER8BNEWHVACSYCHECKBOX")
    private Integer number8bnewhvacsycheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER8BNEWHVACSYSSTRING")
    private String number8bnewhvacsysstring;
    @Column(name = "NUMBER8BNEWHVACSYRESULT")
    private Serializable number8bnewhvacsyresult;
    @Column(name = "SQFT8BII")
    private Integer sqft8bii;
    @Column(name = "NUMBER8BIIINCLUDECHECKBOX")
    private Integer number8biiincludecheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER8BIIINCLUDESTRING")
    private String number8biiincludestring;
    @Column(name = "NUMBER8BIIINCLUDRESULT")
    private Serializable number8biiincludresult;
    @Column(name = "SQFT9")
    private Integer sqft9;
    @Column(name = "NUMBER9SINGLEDUALZCHECKBOX")
    private Integer number9singledualzcheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER9SINGLEDUALZOSTRING")
    private String number9singledualzostring;
    @Column(name = "NUMBER9SINGLEDRESULT")
    private Serializable number9singledresult;
    @Column(name = "SQFT91")
    private Integer sqft91;
    @Column(name = "NUMBER91ARELOCHECKBOX")
    private Integer number91arelocheckbox;
    @Column(name = "NUMBER91ARELOINT")
    private Integer number91areloint;
    @Column(name = "NUMBER91ARELOCRESULT")
    private Serializable number91arelocresult;
    @Column(name = "NUMBER91BCUTINSUPPLYVCHECKBOX")
    private Integer number91bcutinsupplyvcheckbox;
    @Column(name = "NUMBER91BCUTINSUPPLYINT")
    private Integer number91bcutinsupplyint;
    @Column(name = "NUMBER91BCUTINSUPPLYVRESULT")
    private Serializable number91bcutinsupplyvresult;
    @Column(name = "NUMBER91CHCHECKBOX")
    private Integer number91chcheckbox;
    @Column(name = "NUMBER91CHVAINT")
    private Integer number91chvaint;
    @Column(name = "NUMBER91CHVACCUTINRESULT")
    private Serializable number91chvaccutinresult;
    @Column(name = "NUMBER91DDUCHECKBOX")
    private Integer number91dducheckbox;
    @Column(name = "NUMBER91DDUCINT")
    private Integer number91dducint;
    @Column(name = "NUMBER91DDUCTRESULT")
    private Serializable number91dductresult;
    @Column(name = "NUMBER91ENECHECKBOX")
    private Integer number91enecheckbox;
    @Column(name = "NUMBER91ENEINT")
    private Integer number91eneint;
    @Column(name = "NUMBER91ENERESULT")
    private Serializable number91eneresult;
    @Column(name = "NUMBER91FENLACHECKBOX")
    private Integer number91fenlacheckbox;
    @Column(name = "NUMBER91FENLARGINT")
    private Integer number91fenlargint;
    @Column(name = "NUMBER91FENLARGERRESULT")
    private Serializable number91fenlargerresult;
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
    private Serializable number93costperkwresalt;
    @Column(name = "NUMBER93DCKWSINT")
    private Integer number93dckwsint;
    @Column(name = "NUMBER93DCKWSRESALT")
    private Serializable number93dckwsresalt;
    @Size(max = 20)
    @Column(name = "NUMBER10INSTALLWINDOWSCHECKBOX")
    private String number10installwindowscheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER10NUMOFWINDOWS")
    private String number10numofwindows;
    @Column(name = "NUMBER10TOTALUNITEDINCHESINT")
    private Integer number10totalunitedinchesint;
    @Column(name = "NUMBER10INSTALLRESULT")
    private Serializable number10installresult;
    @Size(max = 300)
    @Column(name = "NUMBER10NUMOFSLIDERS")
    private String number10numofsliders;
    @Size(max = 300)
    @Column(name = "NUMBER10LINEARFEET")
    private String number10linearfeet;
    @Column(name = "NUMBER10LINEARFEETRESULT")
    private Serializable number10linearfeetresult;
    @Column(name = "NUMBER101ACUTINDOORCHECKBOX")
    private Integer number101acutindoorcheckbox;
    @Column(name = "NUMBER101ACUTINDOORINT")
    private Integer number101acutindoorint;
    @Column(name = "NUMBER101ACUTINDOORRESULT")
    private Serializable number101acutindoorresult;
    @Column(name = "NUMBER101BADDHEADERCHECKBOX")
    private Integer number101baddheadercheckbox;
    @Column(name = "NUMBER101BADDHEADERINT")
    private Integer number101baddheaderint;
    @Column(name = "NUMBER101BADDHEADERRESULT")
    private Serializable number101baddheaderresult;
    @Column(name = "NUMBER102ACUTDOWNCHECKBOX")
    private Integer number102acutdowncheckbox;
    @Column(name = "NUMBER102ACUTDOWNWIRESULT")
    private Serializable number102acutdownwiresult;
    @Column(name = "NUMBER102BELECTRICALCHECKBOX")
    private Integer number102belectricalcheckbox;
    @Column(name = "NUMBER102BELECTRICALRERESULT")
    private Serializable number102belectricalreresult;
    @Column(name = "NUMBER102CGARDENCHECKBOX")
    private Integer number102cgardencheckbox;
    @Column(name = "NUMBER102CGARDENRESULT")
    private Serializable number102cgardenresult;
    @Column(name = "NUMBER102DGARDENWICHECKBOX")
    private Integer number102dgardenwicheckbox;
    @Column(name = "NUMBER102DGARDENWIRESULT")
    private Serializable number102dgardenwiresult;
    @Column(name = "NUMBER103ALLGLAZINGCHECKBOX")
    private Integer number103allglazingcheckbox;
    @Column(name = "NUMBER104WICHECKBOX")
    private Integer number104wicheckbox;
    @Column(name = "NUMBER11INSTALLPOOLCHECKBOX")
    private Integer number11installpoolcheckbox;
    @Column(name = "NUMBER11INSTALLPOOLPUMPRESULT")
    private Serializable number11installpoolpumpresult;
    @Column(name = "NUMBER12INSTALLWHOLECHECKBOX")
    private Integer number12installwholecheckbox;
    @Column(name = "NUMBER12INSTALLWHOLEHOINT")
    private Integer number12installwholehoint;
    @Column(name = "NUMBER12INSTALLWHOLEHORESULT")
    private Serializable number12installwholehoresult;
    @Column(name = "NUMBER13INSTALLWACHECKBOX")
    private Integer number13installwacheckbox;
    @Column(name = "NUMBER13INSTALLWATERHEDOUBLE")
    private Serializable number13installwaterhedouble;
    @Column(name = "NUMBER13INSTALLWARESULT")
    private Serializable number13installwaresult;
    @Column(name = "NUMBER14PERMITSCHECKBOX")
    private Integer number14permitscheckbox;
    @Column(name = "NUMBER14PERMITSRESULT")
    private Serializable number14permitsresult;
    @Column(name = "NUMBER15INSTALLBATTERYCHECKBOX")
    private Integer number15installbatterycheckbox;
    @Column(name = "NUMBER15INSTALLBARESULT")
    private Serializable number15installbaresult;
    @Column(name = "NUMBER15AINSTALLKWDCSOCHECKBOX")
    private Integer number15ainstallkwdcsocheckbox;
    @Column(name = "NUMBER15AINSTALLKWDCSOINT")
    private Integer number15ainstallkwdcsoint;
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
    private Serializable wholecost;
    @Column(name = "SOLARCOST")
    private Serializable solarcost;
    @Column(name = "NEW1")
    private Integer new1;

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

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
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

    public Serializable getNumber1insulatatticblownresult() {
        return number1insulatatticblownresult;
    }

    public void setNumber1insulatatticblownresult(Serializable number1insulatatticblownresult) {
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

    public Serializable getNumber2removeandreplaceresult() {
        return number2removeandreplaceresult;
    }

    public void setNumber2removeandreplaceresult(Serializable number2removeandreplaceresult) {
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

    public Serializable getNumber3installbattedinresult() {
        return number3installbattedinresult;
    }

    public void setNumber3installbattedinresult(Serializable number3installbattedinresult) {
        this.number3installbattedinresult = number3installbattedinresult;
    }

    public Integer getNumber4sealductingcodcheckbox() {
        return number4sealductingcodcheckbox;
    }

    public void setNumber4sealductingcodcheckbox(Integer number4sealductingcodcheckbox) {
        this.number4sealductingcodcheckbox = number4sealductingcodcheckbox;
    }

    public String getNumber4sealductingcodecstring() {
        return number4sealductingcodecstring;
    }

    public void setNumber4sealductingcodecstring(String number4sealductingcodecstring) {
        this.number4sealductingcodecstring = number4sealductingcodecstring;
    }

    public Integer getSqft4() {
        return sqft4;
    }

    public void setSqft4(Integer sqft4) {
        this.sqft4 = sqft4;
    }

    public Serializable getNumber4sealductingcoderesult() {
        return number4sealductingcoderesult;
    }

    public void setNumber4sealductingcoderesult(Serializable number4sealductingcoderesult) {
        this.number4sealductingcoderesult = number4sealductingcoderesult;
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

    public Serializable getNumber5airsealparesult() {
        return number5airsealparesult;
    }

    public void setNumber5airsealparesult(Serializable number5airsealparesult) {
        this.number5airsealparesult = number5airsealparesult;
    }

    public Integer getSqft6() {
        return sqft6;
    }

    public void setSqft6(Integer sqft6) {
        this.sqft6 = sqft6;
    }

    public Integer getNumber6cazarearecheckbox() {
        return number6cazarearecheckbox;
    }

    public void setNumber6cazarearecheckbox(Integer number6cazarearecheckbox) {
        this.number6cazarearecheckbox = number6cazarearecheckbox;
    }

    public String getNumber6cazareatstring() {
        return number6cazareatstring;
    }

    public void setNumber6cazareatstring(String number6cazareatstring) {
        this.number6cazareatstring = number6cazareatstring;
    }

    public Serializable getNumber6cazarearesult() {
        return number6cazarearesult;
    }

    public void setNumber6cazarearesult(Serializable number6cazarearesult) {
        this.number6cazarearesult = number6cazarearesult;
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

    public Serializable getNumber7ainstallductingresult() {
        return number7ainstallductingresult;
    }

    public void setNumber7ainstallductingresult(Serializable number7ainstallductingresult) {
        this.number7ainstallductingresult = number7ainstallductingresult;
    }

    public Integer getSqft7b() {
        return sqft7b;
    }

    public void setSqft7b(Integer sqft7b) {
        this.sqft7b = sqft7b;
    }

    public Integer getNumber7binstallr8ducheckbox() {
        return number7binstallr8ducheckbox;
    }

    public void setNumber7binstallr8ducheckbox(Integer number7binstallr8ducheckbox) {
        this.number7binstallr8ducheckbox = number7binstallr8ducheckbox;
    }

    public String getNumber7binstallr8ductstring() {
        return number7binstallr8ductstring;
    }

    public void setNumber7binstallr8ductstring(String number7binstallr8ductstring) {
        this.number7binstallr8ductstring = number7binstallr8ductstring;
    }

    public Serializable getNumber7binstallr8ductresult() {
        return number7binstallr8ductresult;
    }

    public void setNumber7binstallr8ductresult(Serializable number7binstallr8ductresult) {
        this.number7binstallr8ductresult = number7binstallr8ductresult;
    }

    public Integer getSqft8a() {
        return sqft8a;
    }

    public void setSqft8a(Integer sqft8a) {
        this.sqft8a = sqft8a;
    }

    public Integer getNumber8anewhvacicheckbox() {
        return number8anewhvacicheckbox;
    }

    public void setNumber8anewhvacicheckbox(Integer number8anewhvacicheckbox) {
        this.number8anewhvacicheckbox = number8anewhvacicheckbox;
    }

    public String getNumber8anewhvacstring() {
        return number8anewhvacstring;
    }

    public void setNumber8anewhvacstring(String number8anewhvacstring) {
        this.number8anewhvacstring = number8anewhvacstring;
    }

    public Serializable getNumber8anewhvaresult() {
        return number8anewhvaresult;
    }

    public void setNumber8anewhvaresult(Serializable number8anewhvaresult) {
        this.number8anewhvaresult = number8anewhvaresult;
    }

    public Integer getSqft8b() {
        return sqft8b;
    }

    public void setSqft8b(Integer sqft8b) {
        this.sqft8b = sqft8b;
    }

    public Integer getNumber8bnewhvacsycheckbox() {
        return number8bnewhvacsycheckbox;
    }

    public void setNumber8bnewhvacsycheckbox(Integer number8bnewhvacsycheckbox) {
        this.number8bnewhvacsycheckbox = number8bnewhvacsycheckbox;
    }

    public String getNumber8bnewhvacsysstring() {
        return number8bnewhvacsysstring;
    }

    public void setNumber8bnewhvacsysstring(String number8bnewhvacsysstring) {
        this.number8bnewhvacsysstring = number8bnewhvacsysstring;
    }

    public Serializable getNumber8bnewhvacsyresult() {
        return number8bnewhvacsyresult;
    }

    public void setNumber8bnewhvacsyresult(Serializable number8bnewhvacsyresult) {
        this.number8bnewhvacsyresult = number8bnewhvacsyresult;
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

    public Serializable getNumber8biiincludresult() {
        return number8biiincludresult;
    }

    public void setNumber8biiincludresult(Serializable number8biiincludresult) {
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

    public Serializable getNumber9singledresult() {
        return number9singledresult;
    }

    public void setNumber9singledresult(Serializable number9singledresult) {
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

    public Serializable getNumber91arelocresult() {
        return number91arelocresult;
    }

    public void setNumber91arelocresult(Serializable number91arelocresult) {
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

    public Serializable getNumber91bcutinsupplyvresult() {
        return number91bcutinsupplyvresult;
    }

    public void setNumber91bcutinsupplyvresult(Serializable number91bcutinsupplyvresult) {
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

    public Serializable getNumber91chvaccutinresult() {
        return number91chvaccutinresult;
    }

    public void setNumber91chvaccutinresult(Serializable number91chvaccutinresult) {
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

    public Serializable getNumber91dductresult() {
        return number91dductresult;
    }

    public void setNumber91dductresult(Serializable number91dductresult) {
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

    public Serializable getNumber91eneresult() {
        return number91eneresult;
    }

    public void setNumber91eneresult(Serializable number91eneresult) {
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

    public Serializable getNumber91fenlargerresult() {
        return number91fenlargerresult;
    }

    public void setNumber91fenlargerresult(Serializable number91fenlargerresult) {
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

    public Serializable getNumber93costperkwresalt() {
        return number93costperkwresalt;
    }

    public void setNumber93costperkwresalt(Serializable number93costperkwresalt) {
        this.number93costperkwresalt = number93costperkwresalt;
    }

    public Integer getNumber93dckwsint() {
        return number93dckwsint;
    }

    public void setNumber93dckwsint(Integer number93dckwsint) {
        this.number93dckwsint = number93dckwsint;
    }

    public Serializable getNumber93dckwsresalt() {
        return number93dckwsresalt;
    }

    public void setNumber93dckwsresalt(Serializable number93dckwsresalt) {
        this.number93dckwsresalt = number93dckwsresalt;
    }

    public String getNumber10installwindowscheckbox() {
        return number10installwindowscheckbox;
    }

    public void setNumber10installwindowscheckbox(String number10installwindowscheckbox) {
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

    public Serializable getNumber10installresult() {
        return number10installresult;
    }

    public void setNumber10installresult(Serializable number10installresult) {
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

    public Serializable getNumber10linearfeetresult() {
        return number10linearfeetresult;
    }

    public void setNumber10linearfeetresult(Serializable number10linearfeetresult) {
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

    public Serializable getNumber101acutindoorresult() {
        return number101acutindoorresult;
    }

    public void setNumber101acutindoorresult(Serializable number101acutindoorresult) {
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

    public Serializable getNumber101baddheaderresult() {
        return number101baddheaderresult;
    }

    public void setNumber101baddheaderresult(Serializable number101baddheaderresult) {
        this.number101baddheaderresult = number101baddheaderresult;
    }

    public Integer getNumber102acutdowncheckbox() {
        return number102acutdowncheckbox;
    }

    public void setNumber102acutdowncheckbox(Integer number102acutdowncheckbox) {
        this.number102acutdowncheckbox = number102acutdowncheckbox;
    }

    public Serializable getNumber102acutdownwiresult() {
        return number102acutdownwiresult;
    }

    public void setNumber102acutdownwiresult(Serializable number102acutdownwiresult) {
        this.number102acutdownwiresult = number102acutdownwiresult;
    }

    public Integer getNumber102belectricalcheckbox() {
        return number102belectricalcheckbox;
    }

    public void setNumber102belectricalcheckbox(Integer number102belectricalcheckbox) {
        this.number102belectricalcheckbox = number102belectricalcheckbox;
    }

    public Serializable getNumber102belectricalreresult() {
        return number102belectricalreresult;
    }

    public void setNumber102belectricalreresult(Serializable number102belectricalreresult) {
        this.number102belectricalreresult = number102belectricalreresult;
    }

    public Integer getNumber102cgardencheckbox() {
        return number102cgardencheckbox;
    }

    public void setNumber102cgardencheckbox(Integer number102cgardencheckbox) {
        this.number102cgardencheckbox = number102cgardencheckbox;
    }

    public Serializable getNumber102cgardenresult() {
        return number102cgardenresult;
    }

    public void setNumber102cgardenresult(Serializable number102cgardenresult) {
        this.number102cgardenresult = number102cgardenresult;
    }

    public Integer getNumber102dgardenwicheckbox() {
        return number102dgardenwicheckbox;
    }

    public void setNumber102dgardenwicheckbox(Integer number102dgardenwicheckbox) {
        this.number102dgardenwicheckbox = number102dgardenwicheckbox;
    }

    public Serializable getNumber102dgardenwiresult() {
        return number102dgardenwiresult;
    }

    public void setNumber102dgardenwiresult(Serializable number102dgardenwiresult) {
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

    public Serializable getNumber11installpoolpumpresult() {
        return number11installpoolpumpresult;
    }

    public void setNumber11installpoolpumpresult(Serializable number11installpoolpumpresult) {
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

    public Serializable getNumber12installwholehoresult() {
        return number12installwholehoresult;
    }

    public void setNumber12installwholehoresult(Serializable number12installwholehoresult) {
        this.number12installwholehoresult = number12installwholehoresult;
    }

    public Integer getNumber13installwacheckbox() {
        return number13installwacheckbox;
    }

    public void setNumber13installwacheckbox(Integer number13installwacheckbox) {
        this.number13installwacheckbox = number13installwacheckbox;
    }

    public Serializable getNumber13installwaterhedouble() {
        return number13installwaterhedouble;
    }

    public void setNumber13installwaterhedouble(Serializable number13installwaterhedouble) {
        this.number13installwaterhedouble = number13installwaterhedouble;
    }

    public Serializable getNumber13installwaresult() {
        return number13installwaresult;
    }

    public void setNumber13installwaresult(Serializable number13installwaresult) {
        this.number13installwaresult = number13installwaresult;
    }

    public Integer getNumber14permitscheckbox() {
        return number14permitscheckbox;
    }

    public void setNumber14permitscheckbox(Integer number14permitscheckbox) {
        this.number14permitscheckbox = number14permitscheckbox;
    }

    public Serializable getNumber14permitsresult() {
        return number14permitsresult;
    }

    public void setNumber14permitsresult(Serializable number14permitsresult) {
        this.number14permitsresult = number14permitsresult;
    }

    public Integer getNumber15installbatterycheckbox() {
        return number15installbatterycheckbox;
    }

    public void setNumber15installbatterycheckbox(Integer number15installbatterycheckbox) {
        this.number15installbatterycheckbox = number15installbatterycheckbox;
    }

    public Serializable getNumber15installbaresult() {
        return number15installbaresult;
    }

    public void setNumber15installbaresult(Serializable number15installbaresult) {
        this.number15installbaresult = number15installbaresult;
    }

    public Integer getNumber15ainstallkwdcsocheckbox() {
        return number15ainstallkwdcsocheckbox;
    }

    public void setNumber15ainstallkwdcsocheckbox(Integer number15ainstallkwdcsocheckbox) {
        this.number15ainstallkwdcsocheckbox = number15ainstallkwdcsocheckbox;
    }

    public Integer getNumber15ainstallkwdcsoint() {
        return number15ainstallkwdcsoint;
    }

    public void setNumber15ainstallkwdcsoint(Integer number15ainstallkwdcsoint) {
        this.number15ainstallkwdcsoint = number15ainstallkwdcsoint;
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

    public Serializable getWholecost() {
        return wholecost;
    }

    public void setWholecost(Serializable wholecost) {
        this.wholecost = wholecost;
    }

    public Serializable getSolarcost() {
        return solarcost;
    }

    public void setSolarcost(Serializable solarcost) {
        this.solarcost = solarcost;
    }

    public Integer getNew1() {
        return new1;
    }

    public void setNew1(Integer new1) {
        this.new1 = new1;
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
