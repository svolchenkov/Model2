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

//    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CASE_ID")
    private String caseId;
    @Column(name = "TOTAL")
    private double total;
    @Column(name = "CUSTOMERID")
    private int customerid;
    @Column(name = "NUMBER1INSULATATTICBLOWNCHE")
    private int number1insulatatticblownche;
    @Size(max = 300)
    @Column(name = "NUMBER1INSULATATTICBLOWNSTRING")
    private String number1insulatatticblownstring;
    @Column(name = "SQFT1")
    private int sqft1;
    @Column(name = "NUMBER1INSULATATTICBLOWNRESULT")
    private double number1insulatatticblownresult;
    @Column(name = "NUMBER2REMOVEANDREPLACECHE")
    private int number2removeandreplaceche;
    @Column(name = "SQFT2")
    private int sqft2;
    @Column(name = "NUMBER2REMOVEANDREPLACERESULT")
    private double number2removeandreplaceresult;
    @Column(name = "NUMBER3INSTALLBATTEDINIONCHE")
    private int number3installbattedinionche;
    @Column(name = "SQFT3")
    private int sqft3;
    @Column(name = "NUMBER3INSTALLBATTEDINRESULT")
    private double number3installbattedinresult;
    @Column(name = "NUMBER4SEALDUCTINGCODCHECKBOX")
    private int number4sealductingcodcheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER4SEALDUCTINGCODECSTRING")
    private String number4sealductingcodecstring;
    @Column(name = "SQFT4")
    private int sqft4;
    @Column(name = "NUMBER4SEALDUCTINGCODERESULT")
    private double number4sealductingcoderesult;
    @Column(name = "SQFT5")
    private int sqft5;
    @Column(name = "NUMBER5AIRSEALPCHECKBOX")
    private int number5airsealpcheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER5AIRSEALSTRING")
    private String number5airsealstring;
    @Column(name = "NUMBER5AIRSEALPARESULT")
    private double number5airsealparesult;
    @Column(name = "SQFT6")
    private int sqft6;
    @Column(name = "NUMBER6CAZAREARECHECKBOX")
    private int number6cazarearecheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER6CAZAREATSTRING")
    private String number6cazareatstring;
    @Column(name = "NUMBER6CAZAREARESULT")
    private double number6cazarearesult;
    @Column(name = "SQFT7A")
    private int sqft7a;
    @Column(name = "NUMBER7AINSTALLDUCTINGCHECKBOX")
    private int number7ainstallductingcheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER7AINSTALLDUCTINGSTRING")
    private String number7ainstallductingstring;
    @Column(name = "NUMBER7AINSTALLDUCTINGRESULT")
    private double number7ainstallductingresult;
    @Column(name = "SQFT7B")
    private int sqft7b;
    @Column(name = "NUMBER7BINSTALLR8DUCHECKBOX")
    private int number7binstallr8ducheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER7BINSTALLR8DUCTSTRING")
    private String number7binstallr8ductstring;
    @Column(name = "NUMBER7BINSTALLR8DUCTRESULT")
    private double number7binstallr8ductresult;
    @Column(name = "SQFT8A")
    private int sqft8a;
    @Column(name = "NUMBER8ANEWHVACICHECKBOX")
    private int number8anewhvacicheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER8ANEWHVACSTRING")
    private String number8anewhvacstring;
    @Column(name = "NUMBER8ANEWHVARESULT")
    private double number8anewhvaresult;
    @Column(name = "SQFT8B")
    private int sqft8b;
    @Column(name = "NUMBER8BNEWHVACSYCHECKBOX")
    private int number8bnewhvacsycheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER8BNEWHVACSYSSTRING")
    private String number8bnewhvacsysstring;
    @Column(name = "NUMBER8BNEWHVACSYRESULT")
    private double number8bnewhvacsyresult;
    @Column(name = "SQFT8BII")
    private int sqft8bii;
    @Column(name = "NUMBER8BIIINCLUDECHECKBOX")
    private int number8biiincludecheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER8BIIINCLUDESTRING")
    private String number8biiincludestring;
    @Column(name = "NUMBER8BIIINCLUDRESULT")
    private double number8biiincludresult;
    @Column(name = "SQFT9")
    private int sqft9;
    @Column(name = "NUMBER9SINGLEDUALZCHECKBOX")
    private int number9singledualzcheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER9SINGLEDUALZOSTRING")
    private String number9singledualzostring;
    @Column(name = "NUMBER9SINGLEDRESULT")
    private double number9singledresult;
    @Column(name = "SQFT91")
    private int sqft91;
    @Column(name = "NUMBER91ARELOCHECKBOX")
    private int number91arelocheckbox;
    @Column(name = "NUMBER91ARELOINT")
    private int number91areloint;
    @Column(name = "NUMBER91ARELOCRESULT")
    private double number91arelocresult;
    @Column(name = "NUMBER91BCUTINSUPPLYVCHECKBOX")
    private int number91bcutinsupplyvcheckbox;
    @Column(name = "NUMBER91BCUTINSUPPLYINT")
    private int number91bcutinsupplyint;
    @Column(name = "NUMBER91BCUTINSUPPLYVRESULT")
    private double number91bcutinsupplyvresult;
    @Column(name = "NUMBER91CHCHECKBOX")
    private int number91chcheckbox;
    @Column(name = "NUMBER91CHVAINT")
    private int number91chvaint;
    @Column(name = "NUMBER91CHVACCUTINRESULT")
    private double number91chvaccutinresult;
    @Column(name = "NUMBER91DDUCHECKBOX")
    private int number91dducheckbox;
    @Column(name = "NUMBER91DDUCINT")
    private int number91dducint;
    @Column(name = "NUMBER91DDUCTRESULT")
    private double number91dductresult;
    @Column(name = "NUMBER91ENECHECKBOX")
    private int number91enecheckbox;
    @Column(name = "NUMBER91ENEINT")
    private int number91eneint;
    @Column(name = "NUMBER91ENERESULT")
    private double number91eneresult;
    @Column(name = "NUMBER91FENLACHECKBOX")
    private int number91fenlacheckbox;
    @Column(name = "NUMBER91FENLARGINT")
    private int number91fenlargint;
    @Column(name = "NUMBER91FENLARGERRESULT")
    private double number91fenlargerresult;
    @Column(name = "NUMBER92NOTESCHECKBOX")
    private int number92notescheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER92NOTESSTRING")
    private String number92notesstring;
    @Column(name = "NUMBER93COSTPERKWCHECKBOX")
    private int number93costperkwcheckbox;
    @Column(name = "NUMBER93COSTPERKWINT")
    private int number93costperkwint;
    @Column(name = "NUMBER93COSTPERKWRESALT")
    private double number93costperkwresalt;
    @Column(name = "NUMBER93DCKWSINT")
    private int number93dckwsint;
    @Column(name = "NUMBER93DCKWSRESALT")
    private double number93dckwsresalt;
    @Column(name = "NUMBER10INSTALLWINDOWSCHECKBOX")
    private int number10installwindowscheckbox;
    @Size(max = 300)
    @Column(name = "NUMBER10NUMOFWINDOWS")
    private String number10numofwindows;
    @Column(name = "NUMBER10TOTALUNITEDINCHESINT")
    private int number10totalunitedinchesint;
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
    private int number101acutindoorcheckbox;
    @Column(name = "NUMBER101ACUTINDOORINT")
    private int number101acutindoorint;
    @Column(name = "NUMBER101ACUTINDOORRESULT")
    private double number101acutindoorresult;
    @Column(name = "NUMBER101BADDHEADERCHECKBOX")
    private int number101baddheadercheckbox;
    @Column(name = "NUMBER101BADDHEADERINT")
    private int number101baddheaderint;
    @Column(name = "NUMBER101BADDHEADERRESULT")
    private double number101baddheaderresult;
    @Column(name = "NUMBER102ACUTDOWNCHECKBOX")
    private int number102acutdowncheckbox;
    @Column(name = "NUMBER102ACUTDOWNWIRESULT")
    private double number102acutdownwiresult;
    @Column(name = "NUMBER102BELECTRICALCHECKBOX")
    private int number102belectricalcheckbox;
    @Column(name = "NUMBER102BELECTRICALRERESULT")
    private double number102belectricalreresult;
    @Column(name = "NUMBER102CGARDENCHECKBOX")
    private int number102cgardencheckbox;
    @Column(name = "NUMBER102CGARDENRESULT")
    private double number102cgardenresult;
    @Column(name = "NUMBER102DGARDENWICHECKBOX")
    private int number102dgardenwicheckbox;
    @Column(name = "NUMBER102DGARDENWIRESULT")
    private double number102dgardenwiresult;
    @Column(name = "NUMBER103ALLGLAZINGCHECKBOX")
    private int number103allglazingcheckbox;
    @Column(name = "NUMBER104WICHECKBOX")
    private int number104wicheckbox;
    @Column(name = "NUMBER11INSTALLPOOLCHECKBOX")
    private int number11installpoolcheckbox;
    @Column(name = "NUMBER11INSTALLPOOLPUMPRESULT")
    private double number11installpoolpumpresult;
    @Column(name = "NUMBER12INSTALLWHOLECHECKBOX")
    private int number12installwholecheckbox;
    @Column(name = "NUMBER12INSTALLWHOLEHOINT")
    private int number12installwholehoint;
    @Column(name = "NUMBER12INSTALLWHOLEHORESULT")
    private double number12installwholehoresult;
    @Column(name = "NUMBER13INSTALLWACHECKBOX")
    private int number13installwacheckbox;
    @Column(name = "NUMBER13INSTALLWATERHEDOUBLE")
    private double number13installwaterhedouble;
    @Column(name = "NUMBER13INSTALLWARESULT")
    private double number13installwaresult;
    @Column(name = "NUMBER14PERMITSCHECKBOX")
    private int number14permitscheckbox;
    @Column(name = "NUMBER14PERMITSRESULT")
    private double number14permitsresult;
    @Column(name = "NUMBER15INSTALLBATTERYCHECKBOX")
    private int number15installbatterycheckbox;
    @Column(name = "NUMBER15INSTALLBARESULT")
    private double number15installbaresult;
    @Column(name = "NUMBER15AINSTALLKWDCSOCHECKBOX")
    private int number15ainstallkwdcsocheckbox;
    @Column(name = "NUMBER15AINSTALLKWDCSOINT")
    private int number15ainstallkwdcsoint;
    @Column(name = "NUMBER15BINCLUDESEXCHECKBOX")
    private int number15bincludesexcheckbox;
    @Column(name = "NUMBER15CSOLARCHECKBOX")
    private int number15csolarcheckbox;
    @Column(name = "NUMBER15DINCLUDESSYCHECKBOX")
    private int number15dincludessycheckbox;
    @Column(name = "NUMBER15EICHECKBOX")
    private int number15eicheckbox;
    @Column(name = "NUMBER15FCANADIANSOCHECKBOX")
    private int number15fcanadiansocheckbox;
    @Column(name = "WHOLECOST")
    private double wholecost;
    @Column(name = "SOLARCOST")
    private double solarcost;
    @Column(name = "NEW1")
    private int new1;
    @Column(name = "MARGINPERCENTAGE")
    private int marginpercentage;
    @Column(name = "PGEREBATEPOINTS")
    private int pgeRebatePoints;
    @Column(name = "PGEREBATEAMOUNT")
    private int pgeRebateAmount;
    @Column(name = "SMUDREBATEAMOUNT")
    private int smudRebateAmount;

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

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getNumber1insulatatticblownche() {
        return number1insulatatticblownche;
    }

    public void setNumber1insulatatticblownche(int number1insulatatticblownche) {
        this.number1insulatatticblownche = number1insulatatticblownche;
    }

    public String getNumber1insulatatticblownstring() {
        return number1insulatatticblownstring;
    }

    public void setNumber1insulatatticblownstring(String number1insulatatticblownstring) {
        this.number1insulatatticblownstring = number1insulatatticblownstring;
    }

    public int getSqft1() {
        return sqft1;
    }

    public void setSqft1(int sqft1) {
        this.sqft1 = sqft1;
    }

    public double getNumber1insulatatticblownresult() {
        return number1insulatatticblownresult;
    }

    public void setNumber1insulatatticblownresult(double number1insulatatticblownresult) {
        this.number1insulatatticblownresult = number1insulatatticblownresult;
    }

    public int getNumber2removeandreplaceche() {
        return number2removeandreplaceche;
    }

    public void setNumber2removeandreplaceche(int number2removeandreplaceche) {
        this.number2removeandreplaceche = number2removeandreplaceche;
    }

    public int getSqft2() {
        return sqft2;
    }

    public void setSqft2(int sqft2) {
        this.sqft2 = sqft2;
    }

    public double getNumber2removeandreplaceresult() {
        return number2removeandreplaceresult;
    }

    public void setNumber2removeandreplaceresult(double number2removeandreplaceresult) {
        this.number2removeandreplaceresult = number2removeandreplaceresult;
    }

    public int getNumber3installbattedinionche() {
        return number3installbattedinionche;
    }

    public void setNumber3installbattedinionche(int number3installbattedinionche) {
        this.number3installbattedinionche = number3installbattedinionche;
    }

    public int getSqft3() {
        return sqft3;
    }

    public void setSqft3(int sqft3) {
        this.sqft3 = sqft3;
    }

    public double getNumber3installbattedinresult() {
        return number3installbattedinresult;
    }

    public void setNumber3installbattedinresult(double number3installbattedinresult) {
        this.number3installbattedinresult = number3installbattedinresult;
    }

    public int getNumber4sealductingcodcheckbox() {
        return number4sealductingcodcheckbox;
    }

    public void setNumber4sealductingcodcheckbox(int number4sealductingcodcheckbox) {
        this.number4sealductingcodcheckbox = number4sealductingcodcheckbox;
    }

    public String getNumber4sealductingcodecstring() {
        return number4sealductingcodecstring;
    }

    public void setNumber4sealductingcodecstring(String number4sealductingcodecstring) {
        this.number4sealductingcodecstring = number4sealductingcodecstring;
    }

    public int getSqft4() {
        return sqft4;
    }

    public void setSqft4(int sqft4) {
        this.sqft4 = sqft4;
    }

    public double getNumber4sealductingcoderesult() {
        return number4sealductingcoderesult;
    }

    public void setNumber4sealductingcoderesult(double number4sealductingcoderesult) {
        this.number4sealductingcoderesult = number4sealductingcoderesult;
    }

    public int getSqft5() {
        return sqft5;
    }

    public void setSqft5(int sqft5) {
        this.sqft5 = sqft5;
    }

    public int getNumber5airsealpcheckbox() {
        return number5airsealpcheckbox;
    }

    public void setNumber5airsealpcheckbox(int number5airsealpcheckbox) {
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

    public int getSqft6() {
        return sqft6;
    }

    public void setSqft6(int sqft6) {
        this.sqft6 = sqft6;
    }

    public int getNumber6cazarearecheckbox() {
        return number6cazarearecheckbox;
    }

    public void setNumber6cazarearecheckbox(int number6cazarearecheckbox) {
        this.number6cazarearecheckbox = number6cazarearecheckbox;
    }

    public String getNumber6cazareatstring() {
        return number6cazareatstring;
    }

    public void setNumber6cazareatstring(String number6cazareatstring) {
        this.number6cazareatstring = number6cazareatstring;
    }

    public double getNumber6cazarearesult() {
        return number6cazarearesult;
    }

    public void setNumber6cazarearesult(double number6cazarearesult) {
        this.number6cazarearesult = number6cazarearesult;
    }

    public int getSqft7a() {
        return sqft7a;
    }

    public void setSqft7a(int sqft7a) {
        this.sqft7a = sqft7a;
    }

    public int getNumber7ainstallductingcheckbox() {
        return number7ainstallductingcheckbox;
    }

    public void setNumber7ainstallductingcheckbox(int number7ainstallductingcheckbox) {
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

    public int getSqft7b() {
        return sqft7b;
    }

    public void setSqft7b(int sqft7b) {
        this.sqft7b = sqft7b;
    }

    public int getNumber7binstallr8ducheckbox() {
        return number7binstallr8ducheckbox;
    }

    public void setNumber7binstallr8ducheckbox(int number7binstallr8ducheckbox) {
        this.number7binstallr8ducheckbox = number7binstallr8ducheckbox;
    }

    public String getNumber7binstallr8ductstring() {
        return number7binstallr8ductstring;
    }

    public void setNumber7binstallr8ductstring(String number7binstallr8ductstring) {
        this.number7binstallr8ductstring = number7binstallr8ductstring;
    }

    public double getNumber7binstallr8ductresult() {
        return number7binstallr8ductresult;
    }

    public void setNumber7binstallr8ductresult(double number7binstallr8ductresult) {
        this.number7binstallr8ductresult = number7binstallr8ductresult;
    }

    public int getSqft8a() {
        return sqft8a;
    }

    public void setSqft8a(int sqft8a) {
        this.sqft8a = sqft8a;
    }

    public int getNumber8anewhvacicheckbox() {
        return number8anewhvacicheckbox;
    }

    public void setNumber8anewhvacicheckbox(int number8anewhvacicheckbox) {
        this.number8anewhvacicheckbox = number8anewhvacicheckbox;
    }

    public String getNumber8anewhvacstring() {
        return number8anewhvacstring;
    }

    public void setNumber8anewhvacstring(String number8anewhvacstring) {
        this.number8anewhvacstring = number8anewhvacstring;
    }

    public double getNumber8anewhvaresult() {
        return number8anewhvaresult;
    }

    public void setNumber8anewhvaresult(double number8anewhvaresult) {
        this.number8anewhvaresult = number8anewhvaresult;
    }

    public int getSqft8b() {
        return sqft8b;
    }

    public void setSqft8b(int sqft8b) {
        this.sqft8b = sqft8b;
    }

    public int getNumber8bnewhvacsycheckbox() {
        return number8bnewhvacsycheckbox;
    }

    public void setNumber8bnewhvacsycheckbox(int number8bnewhvacsycheckbox) {
        this.number8bnewhvacsycheckbox = number8bnewhvacsycheckbox;
    }

    public String getNumber8bnewhvacsysstring() {
        return number8bnewhvacsysstring;
    }

    public void setNumber8bnewhvacsysstring(String number8bnewhvacsysstring) {
        this.number8bnewhvacsysstring = number8bnewhvacsysstring;
    }

    public double getNumber8bnewhvacsyresult() {
        return number8bnewhvacsyresult;
    }

    public void setNumber8bnewhvacsyresult(double number8bnewhvacsyresult) {
        this.number8bnewhvacsyresult = number8bnewhvacsyresult;
    }

    public int getSqft8bii() {
        return sqft8bii;
    }

    public void setSqft8bii(int sqft8bii) {
        this.sqft8bii = sqft8bii;
    }

    public int getNumber8biiincludecheckbox() {
        return number8biiincludecheckbox;
    }

    public void setNumber8biiincludecheckbox(int number8biiincludecheckbox) {
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

    public int getSqft9() {
        return sqft9;
    }

    public void setSqft9(int sqft9) {
        this.sqft9 = sqft9;
    }

    public int getNumber9singledualzcheckbox() {
        return number9singledualzcheckbox;
    }

    public void setNumber9singledualzcheckbox(int number9singledualzcheckbox) {
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

    public int getSqft91() {
        return sqft91;
    }

    public void setSqft91(int sqft91) {
        this.sqft91 = sqft91;
    }

    public int getNumber91arelocheckbox() {
        return number91arelocheckbox;
    }

    public void setNumber91arelocheckbox(int number91arelocheckbox) {
        this.number91arelocheckbox = number91arelocheckbox;
    }

    public int getNumber91areloint() {
        return number91areloint;
    }

    public void setNumber91areloint(int number91areloint) {
        this.number91areloint = number91areloint;
    }

    public double getNumber91arelocresult() {
        return number91arelocresult;
    }

    public void setNumber91arelocresult(double number91arelocresult) {
        this.number91arelocresult = number91arelocresult;
    }

    public int getNumber91bcutinsupplyvcheckbox() {
        return number91bcutinsupplyvcheckbox;
    }

    public void setNumber91bcutinsupplyvcheckbox(int number91bcutinsupplyvcheckbox) {
        this.number91bcutinsupplyvcheckbox = number91bcutinsupplyvcheckbox;
    }

    public int getNumber91bcutinsupplyint() {
        return number91bcutinsupplyint;
    }

    public void setNumber91bcutinsupplyint(int number91bcutinsupplyint) {
        this.number91bcutinsupplyint = number91bcutinsupplyint;
    }

    public double getNumber91bcutinsupplyvresult() {
        return number91bcutinsupplyvresult;
    }

    public void setNumber91bcutinsupplyvresult(double number91bcutinsupplyvresult) {
        this.number91bcutinsupplyvresult = number91bcutinsupplyvresult;
    }

    public int getNumber91chcheckbox() {
        return number91chcheckbox;
    }

    public void setNumber91chcheckbox(int number91chcheckbox) {
        this.number91chcheckbox = number91chcheckbox;
    }

    public int getNumber91chvaint() {
        return number91chvaint;
    }

    public void setNumber91chvaint(int number91chvaint) {
        this.number91chvaint = number91chvaint;
    }

    public double getNumber91chvaccutinresult() {
        return number91chvaccutinresult;
    }

    public void setNumber91chvaccutinresult(double number91chvaccutinresult) {
        this.number91chvaccutinresult = number91chvaccutinresult;
    }

    public int getNumber91dducheckbox() {
        return number91dducheckbox;
    }

    public void setNumber91dducheckbox(int number91dducheckbox) {
        this.number91dducheckbox = number91dducheckbox;
    }

    public int getNumber91dducint() {
        return number91dducint;
    }

    public void setNumber91dducint(int number91dducint) {
        this.number91dducint = number91dducint;
    }

    public double getNumber91dductresult() {
        return number91dductresult;
    }

    public void setNumber91dductresult(double number91dductresult) {
        this.number91dductresult = number91dductresult;
    }

    public int getNumber91enecheckbox() {
        return number91enecheckbox;
    }

    public void setNumber91enecheckbox(int number91enecheckbox) {
        this.number91enecheckbox = number91enecheckbox;
    }

    public int getNumber91eneint() {
        return number91eneint;
    }

    public void setNumber91eneint(int number91eneint) {
        this.number91eneint = number91eneint;
    }

    public double getNumber91eneresult() {
        return number91eneresult;
    }

    public void setNumber91eneresult(double number91eneresult) {
        this.number91eneresult = number91eneresult;
    }

    public int getNumber91fenlacheckbox() {
        return number91fenlacheckbox;
    }

    public void setNumber91fenlacheckbox(int number91fenlacheckbox) {
        this.number91fenlacheckbox = number91fenlacheckbox;
    }

    public int getNumber91fenlargint() {
        return number91fenlargint;
    }

    public void setNumber91fenlargint(int number91fenlargint) {
        this.number91fenlargint = number91fenlargint;
    }

    public double getNumber91fenlargerresult() {
        return number91fenlargerresult;
    }

    public void setNumber91fenlargerresult(double number91fenlargerresult) {
        this.number91fenlargerresult = number91fenlargerresult;
    }

    public int getNumber92notescheckbox() {
        return number92notescheckbox;
    }

    public void setNumber92notescheckbox(int number92notescheckbox) {
        this.number92notescheckbox = number92notescheckbox;
    }

    public String getNumber92notesstring() {
        return number92notesstring;
    }

    public void setNumber92notesstring(String number92notesstring) {
        this.number92notesstring = number92notesstring;
    }

    public int getNumber93costperkwcheckbox() {
        return number93costperkwcheckbox;
    }

    public void setNumber93costperkwcheckbox(int number93costperkwcheckbox) {
        this.number93costperkwcheckbox = number93costperkwcheckbox;
    }

    public int getNumber93costperkwint() {
        return number93costperkwint;
    }

    public void setNumber93costperkwint(int number93costperkwint) {
        this.number93costperkwint = number93costperkwint;
    }

    public double getNumber93costperkwresalt() {
        return number93costperkwresalt;
    }

    public void setNumber93costperkwresalt(double number93costperkwresalt) {
        this.number93costperkwresalt = number93costperkwresalt;
    }

    public int getNumber93dckwsint() {
        return number93dckwsint;
    }

    public void setNumber93dckwsint(int number93dckwsint) {
        this.number93dckwsint = number93dckwsint;
    }

    public double getNumber93dckwsresalt() {
        return number93dckwsresalt;
    }

    public void setNumber93dckwsresalt(double number93dckwsresalt) {
        this.number93dckwsresalt = number93dckwsresalt;
    }

    public int getNumber10installwindowscheckbox() {
        return number10installwindowscheckbox;
    }

    public void setNumber10installwindowscheckbox(int number10installwindowscheckbox) {
        this.number10installwindowscheckbox = number10installwindowscheckbox;
    }

    public String getNumber10numofwindows() {
        return number10numofwindows;
    }

    public void setNumber10numofwindows(String number10numofwindows) {
        this.number10numofwindows = number10numofwindows;
    }

    public int getNumber10totalunitedinchesint() {
        return number10totalunitedinchesint;
    }

    public void setNumber10totalunitedinchesint(int number10totalunitedinchesint) {
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

    public int getNumber101acutindoorcheckbox() {
        return number101acutindoorcheckbox;
    }

    public void setNumber101acutindoorcheckbox(int number101acutindoorcheckbox) {
        this.number101acutindoorcheckbox = number101acutindoorcheckbox;
    }

    public int getNumber101acutindoorint() {
        return number101acutindoorint;
    }

    public void setNumber101acutindoorint(int number101acutindoorint) {
        this.number101acutindoorint = number101acutindoorint;
    }

    public double getNumber101acutindoorresult() {
        return number101acutindoorresult;
    }

    public void setNumber101acutindoorresult(double number101acutindoorresult) {
        this.number101acutindoorresult = number101acutindoorresult;
    }

    public int getNumber101baddheadercheckbox() {
        return number101baddheadercheckbox;
    }

    public void setNumber101baddheadercheckbox(int number101baddheadercheckbox) {
        this.number101baddheadercheckbox = number101baddheadercheckbox;
    }

    public int getNumber101baddheaderint() {
        return number101baddheaderint;
    }

    public void setNumber101baddheaderint(int number101baddheaderint) {
        this.number101baddheaderint = number101baddheaderint;
    }

    public double getNumber101baddheaderresult() {
        return number101baddheaderresult;
    }

    public void setNumber101baddheaderresult(double number101baddheaderresult) {
        this.number101baddheaderresult = number101baddheaderresult;
    }

    public int getNumber102acutdowncheckbox() {
        return number102acutdowncheckbox;
    }

    public void setNumber102acutdowncheckbox(int number102acutdowncheckbox) {
        this.number102acutdowncheckbox = number102acutdowncheckbox;
    }

    public double getNumber102acutdownwiresult() {
        return number102acutdownwiresult;
    }

    public void setNumber102acutdownwiresult(double number102acutdownwiresult) {
        this.number102acutdownwiresult = number102acutdownwiresult;
    }

    public int getNumber102belectricalcheckbox() {
        return number102belectricalcheckbox;
    }

    public void setNumber102belectricalcheckbox(int number102belectricalcheckbox) {
        this.number102belectricalcheckbox = number102belectricalcheckbox;
    }

    public double getNumber102belectricalreresult() {
        return number102belectricalreresult;
    }

    public void setNumber102belectricalreresult(double number102belectricalreresult) {
        this.number102belectricalreresult = number102belectricalreresult;
    }

    public int getNumber102cgardencheckbox() {
        return number102cgardencheckbox;
    }

    public void setNumber102cgardencheckbox(int number102cgardencheckbox) {
        this.number102cgardencheckbox = number102cgardencheckbox;
    }

    public double getNumber102cgardenresult() {
        return number102cgardenresult;
    }

    public void setNumber102cgardenresult(double number102cgardenresult) {
        this.number102cgardenresult = number102cgardenresult;
    }

    public int getNumber102dgardenwicheckbox() {
        return number102dgardenwicheckbox;
    }

    public void setNumber102dgardenwicheckbox(int number102dgardenwicheckbox) {
        this.number102dgardenwicheckbox = number102dgardenwicheckbox;
    }

    public double getNumber102dgardenwiresult() {
        return number102dgardenwiresult;
    }

    public void setNumber102dgardenwiresult(double number102dgardenwiresult) {
        this.number102dgardenwiresult = number102dgardenwiresult;
    }

    public int getNumber103allglazingcheckbox() {
        return number103allglazingcheckbox;
    }

    public void setNumber103allglazingcheckbox(int number103allglazingcheckbox) {
        this.number103allglazingcheckbox = number103allglazingcheckbox;
    }

    public int getNumber104wicheckbox() {
        return number104wicheckbox;
    }

    public void setNumber104wicheckbox(int number104wicheckbox) {
        this.number104wicheckbox = number104wicheckbox;
    }

    public int getNumber11installpoolcheckbox() {
        return number11installpoolcheckbox;
    }

    public void setNumber11installpoolcheckbox(int number11installpoolcheckbox) {
        this.number11installpoolcheckbox = number11installpoolcheckbox;
    }

    public double getNumber11installpoolpumpresult() {
        return number11installpoolpumpresult;
    }

    public void setNumber11installpoolpumpresult(double number11installpoolpumpresult) {
        this.number11installpoolpumpresult = number11installpoolpumpresult;
    }

    public int getNumber12installwholecheckbox() {
        return number12installwholecheckbox;
    }

    public void setNumber12installwholecheckbox(int number12installwholecheckbox) {
        this.number12installwholecheckbox = number12installwholecheckbox;
    }

    public int getNumber12installwholehoint() {
        return number12installwholehoint;
    }

    public void setNumber12installwholehoint(int number12installwholehoint) {
        this.number12installwholehoint = number12installwholehoint;
    }

    public double getNumber12installwholehoresult() {
        return number12installwholehoresult;
    }

    public void setNumber12installwholehoresult(double number12installwholehoresult) {
        this.number12installwholehoresult = number12installwholehoresult;
    }

    public int getNumber13installwacheckbox() {
        return number13installwacheckbox;
    }

    public void setNumber13installwacheckbox(int number13installwacheckbox) {
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

    public int getNumber14permitscheckbox() {
        return number14permitscheckbox;
    }

    public void setNumber14permitscheckbox(int number14permitscheckbox) {
        this.number14permitscheckbox = number14permitscheckbox;
    }

    public double getNumber14permitsresult() {
        return number14permitsresult;
    }

    public void setNumber14permitsresult(double number14permitsresult) {
        this.number14permitsresult = number14permitsresult;
    }

    public int getNumber15installbatterycheckbox() {
        return number15installbatterycheckbox;
    }

    public void setNumber15installbatterycheckbox(int number15installbatterycheckbox) {
        this.number15installbatterycheckbox = number15installbatterycheckbox;
    }

    public double getNumber15installbaresult() {
        return number15installbaresult;
    }

    public void setNumber15installbaresult(double number15installbaresult) {
        this.number15installbaresult = number15installbaresult;
    }

    public int getNumber15ainstallkwdcsocheckbox() {
        return number15ainstallkwdcsocheckbox;
    }

    public void setNumber15ainstallkwdcsocheckbox(int number15ainstallkwdcsocheckbox) {
        this.number15ainstallkwdcsocheckbox = number15ainstallkwdcsocheckbox;
    }

    public int getNumber15ainstallkwdcsoint() {
        return number15ainstallkwdcsoint;
    }

    public void setNumber15ainstallkwdcsoint(int number15ainstallkwdcsoint) {
        this.number15ainstallkwdcsoint = number15ainstallkwdcsoint;
    }

    public int getNumber15bincludesexcheckbox() {
        return number15bincludesexcheckbox;
    }

    public void setNumber15bincludesexcheckbox(int number15bincludesexcheckbox) {
        this.number15bincludesexcheckbox = number15bincludesexcheckbox;
    }

    public int getNumber15csolarcheckbox() {
        return number15csolarcheckbox;
    }

    public void setNumber15csolarcheckbox(int number15csolarcheckbox) {
        this.number15csolarcheckbox = number15csolarcheckbox;
    }

    public int getNumber15dincludessycheckbox() {
        return number15dincludessycheckbox;
    }

    public void setNumber15dincludessycheckbox(int number15dincludessycheckbox) {
        this.number15dincludessycheckbox = number15dincludessycheckbox;
    }

    public int getNumber15eicheckbox() {
        return number15eicheckbox;
    }

    public void setNumber15eicheckbox(int number15eicheckbox) {
        this.number15eicheckbox = number15eicheckbox;
    }

    public int getNumber15fcanadiansocheckbox() {
        return number15fcanadiansocheckbox;
    }

    public void setNumber15fcanadiansocheckbox(int number15fcanadiansocheckbox) {
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

    public int getNew1() {
        return new1;
    }

    public void setNew1(int new1) {
        this.new1 = new1;
    }

    public int getMarginpercentage() {
        return marginpercentage;
    }

    public void setMarginpercentage(int marginpercentage) {
        this.marginpercentage = marginpercentage;
    }

    public int getPgeRebatePoints() {
        return pgeRebatePoints;
    }

    public void setPgeRebatePoints(int pgeRebatePoints) {
        this.pgeRebatePoints = pgeRebatePoints;
    }

    public int getPgeRebateAmount() {
        return pgeRebateAmount;
    }

    public void setPgeRebateAmount(int pgeRebateAmount) {
        this.pgeRebateAmount = pgeRebateAmount;
    }

    public int getSmudRebateAmount() {
        return smudRebateAmount;
    }

    public void setSmudRebateAmount(int smudRebateAmount) {
        this.smudRebateAmount = smudRebateAmount;
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
