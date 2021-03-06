/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.manage;

import beans.MeasureBean;
import db.CreateHibernateSession;
import db.entity.MeasureEntity;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Sergey
 */
@Stateless
@LocalBean
public class MeasureManage {

    private final SessionFactory sessionFactory;

    public MeasureManage() {
        sessionFactory = CreateHibernateSession.getSessionFactory();
    }

    public MeasureEntity receiveMeasureByCaseID(String caseID) {
        MeasureEntity measureEntity = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "SELECT * FROM MEASURE WHERE CASE_ID = " + "'" + caseID + "'";
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(MeasureEntity.class);
            List measures = query.list();
            if (measures.isEmpty()) {
                measureEntity = new MeasureEntity();
                measureEntity.setNew1(1);
                measureEntity.setTotal(0);
                measureEntity.setCaseId(caseID);
                measureEntity.setCustomerid(0);
                measureEntity.setNumber1insulatatticblownche(0);
                measureEntity.setNumber1insulatatticblownstring("");
                measureEntity.setSqft1(0);
                measureEntity.setNumber1insulatatticblownresult(0);
                measureEntity.setNumber2removeandreplaceche(0);
                measureEntity.setSqft2(0);
                measureEntity.setNumber2removeandreplaceresult(0);
                measureEntity.setNumber3installbattedinionche(0);
                measureEntity.setSqft3(0);
                measureEntity.setNumber3installbattedinresult(0);
                measureEntity.setNumber4replaceductscheckbox(0);
                measureEntity.setNumber4replaceductsstring("");
                measureEntity.setSqft4(0);
                measureEntity.setNumber4replaceductsresult(0);
                measureEntity.setSqft5(0);
                measureEntity.setNumber5airsealpcheckbox(0);
                measureEntity.setNumber5airsealstring("");
                measureEntity.setNumber5airsealparesult(0);
                measureEntity.setSqft5a(0);
                measureEntity.setNumber5acheckbox(0);
                measureEntity.setNumber5airsealstring("");
                measureEntity.setNumber5airsealparesult(0);
                measureEntity.setSqft6(0);
                measureEntity.setNumber6checkbox(0);
                measureEntity.setNumber6string("");
                measureEntity.setNumber6result(0);
                measureEntity.setSqft7a(0);
                measureEntity.setNumber7ainstallductingcheckbox(0);
                measureEntity.setNumber7ainstallductingstring("");
                measureEntity.setNumber7ainstallductingresult(0);
                measureEntity.setSqft7b(0);
                measureEntity.setNumber7bcheckbox(0);
                measureEntity.setNumber7bstring("");
                measureEntity.setNumber7bresult(0);
                measureEntity.setSqft8a(0);
                measureEntity.setNumber8acheckbox(0);
                measureEntity.setNumber8anewhvacstring("");
                measureEntity.setNumber8aresult(0);
                measureEntity.setSqft8b(0);
                measureEntity.setNumber8bcheckbox(0);
                measureEntity.setNumber8bnewhvacsysstring("");
                measureEntity.setNumber8bresult(0);
                measureEntity.setNumber8ccheckbox(0);
                measureEntity.setSqft8c(0);
                measureEntity.setNumber8cresult(0);
                measureEntity.setNumber8dresult(0);
                measureEntity.setNumber8dcheckbox(0);
                measureEntity.setSqft8bii(0);
                measureEntity.setNumber8biiincludecheckbox(0);
                measureEntity.setNumber8biiincludestring("");
                measureEntity.setNumber8biiincludresult(0);
                measureEntity.setSqft9(0);
                measureEntity.setNumber9singledualzcheckbox(0);
                measureEntity.setNumber9singledualzostring("");
                measureEntity.setNumber9singledresult(0);
                measureEntity.setSqft91(0);
                measureEntity.setNumber91arelocheckbox(0);
                measureEntity.setNumber91areloint(0);
                measureEntity.setNumber91arelocresult(0);
                measureEntity.setNumber91bcutinsupplyvcheckbox(0);
                measureEntity.setNumber91bcutinsupplyint(0);
                measureEntity.setNumber91bcutinsupplyvresult(0);
                measureEntity.setNumber91chcheckbox(0);
                measureEntity.setNumber91chvaint(0);
                measureEntity.setNumber91chvaccutinresult(0);
                measureEntity.setNumber91dducheckbox(0);
                measureEntity.setNumber91dducint(0);
                measureEntity.setNumber91dductresult(0);
                measureEntity.setNumber91enecheckbox(0);
                measureEntity.setNumber91eneint(0);
                measureEntity.setNumber91eneresult(0);
                measureEntity.setNumber91fenlacheckbox(0);
                measureEntity.setNumber91fenlargint(0);
                measureEntity.setNumber91fenlargerresult(0);
                measureEntity.setNumber92notescheckbox(0);
                measureEntity.setNumber92notesstring("");
                measureEntity.setNumber93costperkwcheckbox(0);
                measureEntity.setNumber93costperkwint(0);
                measureEntity.setNumber93costperkwresalt(0);
                measureEntity.setNumber93dckwsdouble(0);
                measureEntity.setNumber93dckwsresalt(0);
                measureEntity.setNumber10installwindowscheckbox(0);
                measureEntity.setNumber10numofwindows("");
                measureEntity.setNumber10totalunitedinchesint(0);
                measureEntity.setNumber10installresult(0);
                measureEntity.setNumber10numofsliders("");
                measureEntity.setNumber10linearfeet("");
                measureEntity.setNumber10linearfeetresult(0);
                measureEntity.setNumber101acutindoorcheckbox(0);
                measureEntity.setNumber101acutindoorint(0);
                measureEntity.setNumber101acutindoorresult(0);
                measureEntity.setNumber101baddheadercheckbox(0);
                measureEntity.setNumber101baddheaderint(0);
                measureEntity.setNumber101baddheaderresult(0);
                measureEntity.setNumber102acutdowncheckbox(0);
                measureEntity.setNumber102acutdownwiresult(0);
                measureEntity.setNumber102belectricalcheckbox(0);
                measureEntity.setNumber102belectricalreresult(0);
                measureEntity.setNumber102cgardencheckbox(0);
                measureEntity.setNumber102cgardenresult(0);
                measureEntity.setNumber102dgardenwicheckbox(0);
                measureEntity.setNumber102dgardenwiresult(0);
                measureEntity.setNumber103allglazingcheckbox(0);
                measureEntity.setNumber104wicheckbox(0);
                measureEntity.setNumber11installpoolcheckbox(0);
                measureEntity.setNumber11installpoolpumpresult(0);
                measureEntity.setNumber12installwholecheckbox(0);
                measureEntity.setNumber12installwholehoint(0);
                measureEntity.setNumber12installwholehoresult(0);
                measureEntity.setNumber13installwacheckbox(0);
                measureEntity.setNumber13installwaterhedouble(0);
                measureEntity.setNumber13installwaresult(0);
                measureEntity.setNumber14permitscheckbox(0);
                measureEntity.setNumber14permitsresult(0);
                measureEntity.setNumber15installbatterycheckbox(0);
                measureEntity.setNumber15installbaresult(0);
                measureEntity.setNumber15ainstallkwdcsocheckbox(0);
                measureEntity.setNumber15ainstallkwdcsodouble(0);
                measureEntity.setNumber15bincludesexcheckbox(0);
                measureEntity.setNumber15csolarcheckbox(0);
                measureEntity.setNumber15dincludessycheckbox(0);
                measureEntity.setNumber15eicheckbox(0);
                measureEntity.setNumber15fcanadiansocheckbox(0);
                measureEntity.setN16checkbox(0);
                measureEntity.setN16int(0);
                measureEntity.setN16result(0);
                measureEntity.setN17checkbox(0);
                measureEntity.setN17result(0);
                measureEntity.setN17sqft(0);
                measureEntity.setN17string("");
                measureEntity.setN18checkbox(0);
                measureEntity.setN18result(0);
                measureEntity.setN18string("");
                measureEntity.setWholecost(0);
                measureEntity.setSolarcost(0);
                measureEntity.setMarginpercentage(0);
                measureEntity.setPgerebateamount(0);
                measureEntity.setPgerebatepoints(0);
                measureEntity.setSmudrebateamount(0);
            } else {
                measureEntity = (MeasureEntity) measures.get(0);
                System.out.println("total = " + measureEntity.getTotal() );
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return measureEntity;
    }

    private MeasureEntity fillFields(MeasureBean measureBean) {
        MeasureEntity measureEntity = receiveMeasureByCaseID(measureBean.getCaseId());

        measureEntity.setCaseId(measureBean.getCaseId());
        measureEntity.setTotal(measureBean.getTotal());
        measureEntity.setCustomerid(measureBean.getCustomerID());
        measureEntity.setNumber1insulatatticblownche(measureBean.isNumber1InsulatAtticBlownCheckBox() == true ? 1 : 0);
        measureEntity.setNumber1insulatatticblownstring(measureBean.getNumber1InsulatAtticBlownString());
        measureEntity.setSqft1(measureBean.getSqft1());
        measureEntity.setNumber1insulatatticblownresult(measureBean.getNumber1InsulatAtticBlownResult());
        measureEntity.setNumber2removeandreplaceche(measureBean.isNumber2RemoveAndReplaceCheckBox() == true ? 1 : 0);
        measureEntity.setSqft2(measureBean.getSqft2());
        measureEntity.setNumber2removeandreplaceresult(measureBean.getNumber2RemoveAndReplaceResult());
        measureEntity.setNumber3installbattedinionche(measureBean.isNumber3InstallBattedInsulationCheckBox() == true ? 1 : 0);
        measureEntity.setSqft3(measureBean.getSqft3());
        measureEntity.setNumber3installbattedinresult(measureBean.getNumber3InstallBattedInsulationResult());
        measureEntity.setNumber4replaceductscheckbox(measureBean.isNumber4ReplaceDuctsEquipmentCheckBox() == true ? 1 : 0);
        measureEntity.setNumber4replaceductsstring(measureBean.getNumber4ReplaceDuctsEquipmentString());
        measureEntity.setSqft4(measureBean.getSqft4());
        measureEntity.setNumber4replaceductsresult(measureBean.getNumber4ReplaceDuctsEquipmentResult());
        measureEntity.setSqft5(measureBean.getSqft5());
        measureEntity.setNumber5airsealpcheckbox(measureBean.isNumber5AirSealPackageCheckBox() == true ? 1 : 0);
        measureEntity.setNumber5airsealstring(measureBean.getNumber5AirSealPackageString());
        measureEntity.setNumber5airsealparesult(measureBean.getNumber5AirSealPackageResult());
        measureEntity.setSqft5a(measureBean.getSqft5a());
        measureEntity.setNumber5acheckbox(measureBean.isNumber5ACheckBox() == true ? 1 : 0);
        measureEntity.setNumber5astring(measureBean.getNumber5AString());
        measureEntity.setNumber5aresult(measureBean.getNumber5AResult());
        measureEntity.setSqft5b(measureBean.getSqft5b());
        measureEntity.setNumber5bcheckbox(measureBean.isNumber5BCheckBox() == true ? 1 : 0);
        measureEntity.setNumber5bstring(measureBean.getNumber5BString());
        measureEntity.setNumber5bresult(measureBean.getNumber5BResult());
        measureEntity.setSqft6(measureBean.getSqft6());
        measureEntity.setNumber6checkbox(measureBean.isNumber6CheckBox() == true ? 1 : 0);
        measureEntity.setNumber6string(measureBean.getNumber6String());
        measureEntity.setNumber6result(measureBean.getNumber6Result());
        measureEntity.setSqft7a(measureBean.getSqft7a());
        measureEntity.setNumber7ainstallductingcheckbox(measureBean.isNumber7AInstallDuctingStandaloneCheckBox() == true ? 1 : 0);
        measureEntity.setNumber7ainstallductingstring(measureBean.getNumber7AInstallDuctingStandaloneString());
        measureEntity.setNumber7ainstallductingresult(measureBean.getNumber7AInstallDuctingStandaloneResult());
        measureEntity.setSqft7b(measureBean.getSqft7b());
        measureEntity.setNumber7bcheckbox(measureBean.isNumber7BCheckBox() == true ? 1 : 0);
        measureEntity.setNumber7bstring(measureBean.getNumber7BString());
        measureEntity.setNumber7bresult(measureBean.getNumber7BResult());
        measureEntity.setNumber8acheckbox(measureBean.isNumber8ACheckBox() == true ? 1 : 0);
        measureEntity.setNumber8aresult(measureBean.getNumber8AResult());
        measureEntity.setNumber8bcheckbox(measureBean.isNumber8BCheckBox() == true ? 1 : 0);
        measureEntity.setNumber8bresult(measureBean.getNumber8BResult());
        measureEntity.setNumber8ccheckbox(measureBean.isNumber8CCheckBox() == true ? 1 : 0);
        measureEntity.setSqft8c(measureBean.getSqft8c());
        measureEntity.setNumber8cresult(measureBean.getNumber8CResult());
        measureEntity.setNumber8dcheckbox(measureBean.isNumber8DCheckBox() == true ? 1 : 0);
        measureEntity.setNumber8dresult(measureBean.getNumber8DResult());
        measureEntity.setSqft9(measureBean.getSqft9());
        measureEntity.setNumber9singledualzcheckbox(measureBean.isNumber9SingleDualZoneHVACSystemCheckBox() == true ? 1 : 0);
        measureEntity.setNumber9singledualzostring(measureBean.getNumber9SingleDualZoneHVACSystemString());
        measureEntity.setNumber9singledresult(measureBean.getNumber9SingleDualZoneHVACSystemResult());
        measureEntity.setSqft91(measureBean.getSqft91());
        measureEntity.setNumber91arelocheckbox(measureBean.isNumber91aRelocateCondenserCheckBox() == true ? 1 : 0);
        measureEntity.setNumber91areloint(measureBean.getNumber91aRelocateCondenserInt());
        measureEntity.setNumber91arelocresult(measureBean.getNumber91aRelocateCondenserResult());
        measureEntity.setNumber91bcutinsupplyvcheckbox(measureBean.isNumber91bCutInSupplyVentNewDuctCheckBox() == true ? 1 : 0);
        measureEntity.setNumber91bcutinsupplyint(measureBean.getNumber91bCutInSupplyVentNewDuctInt());
        measureEntity.setNumber91bcutinsupplyvresult(measureBean.getNumber91bCutInSupplyVentNewDuctResult());
        measureEntity.setNumber91chcheckbox(measureBean.isNumber91cHVACCutInCheckBox() == true ? 1 : 0);
        measureEntity.setNumber91chvaint(measureBean.getNumber91cHVACCutInInt());
        measureEntity.setNumber91chvaccutinresult(measureBean.getNumber91cHVACCutInResult());
        measureEntity.setNumber91dducheckbox(measureBean.isNumber91dDuctSealOnlyCheckBox() == true ? 1 : 0);
        measureEntity.setNumber91dducint(measureBean.getNumber91dDuctSealOnlyInt());
        measureEntity.setNumber91dductresult(measureBean.getNumber91dDuctSealOnlyResult());
        measureEntity.setNumber91enecheckbox(measureBean.isNumber91eNewLineSetCheckBox() == true ? 1 : 0);
        measureEntity.setNumber91eneint(measureBean.getNumber91eNewLineSetInt());
        measureEntity.setNumber91eneresult(measureBean.getNumber91eNewLineSetResult());
        measureEntity.setNumber91fenlacheckbox(measureBean.isNumber91fEnlargeReturnAirCheckBox() == true ? 1 : 0);
        measureEntity.setNumber91fenlargint(measureBean.getNumber91eNewLineSetInt());
        measureEntity.setNumber91fenlargerresult(measureBean.getNumber91fEnlargeReturnAirResult());
        measureEntity.setNumber92notescheckbox(measureBean.isNumber92NotesCheckBox() == true ? 1 : 0);
        measureEntity.setNumber92notesstring(measureBean.getNumber92NotesString());
        measureEntity.setNumber93costperkwcheckbox(measureBean.isNumber93CostPerKWCheckBox() == true ? 1 : 0);
        measureEntity.setNumber93costperkwint(measureBean.getNumber93CostPerKWInt());
        measureEntity.setNumber93costperkwresalt(measureBean.getNumber93CostPerKWResalt());
        measureEntity.setNumber93dckwsdouble(measureBean.getNumber93DCKWsDouble());
        measureEntity.setNumber93dckwsresalt(measureBean.getNumber93DCKWsResalt());
        measureEntity.setNumber10installwindowscheckbox(measureBean.isNumber10InstallWindowsCheckBox() == true ? 1 : 0);
        measureEntity.setNumber10numofwindows(measureBean.getNumber10numOfWindows());
        measureEntity.setNumber10totalunitedinchesint(measureBean.getNumber10TotalUnitedInchesInt());
        measureEntity.setNumber10installresult(measureBean.getNumber10InstallResult());
        measureEntity.setNumber10numofsliders(measureBean.getNumber10numOfSliders());
        measureEntity.setNumber10linearfeet(measureBean.getNumber10LinearFeet());
        measureEntity.setNumber10linearfeetresult(measureBean.getNumber10LinearFeetResult());
        measureEntity.setNumber101acutindoorcheckbox(measureBean.isNumber101ACutInDoorCheckBox() == true ? 1 : 0);
        measureEntity.setNumber101acutindoorint(measureBean.getNumber101ACutInDoorInt());
        measureEntity.setNumber101acutindoorresult(measureBean.getNumber101ACutInDoorResult());
        measureEntity.setNumber101baddheadercheckbox(measureBean.isNumber101BAddHeaderCheckBox() == true ? 1 : 0);
        measureEntity.setNumber101baddheaderint(measureBean.getNumber101BAddHeaderInt());
        measureEntity.setNumber101baddheaderresult(measureBean.getNumber101BAddHeaderResult());
        measureEntity.setNumber102acutdowncheckbox(measureBean.isNumber102ACutDownWindowCheckBox() == true ? 1 : 0);
        measureEntity.setNumber102acutdownwiresult(measureBean.getNumber102ACutDownWindowResult());
        measureEntity.setNumber102belectricalcheckbox(measureBean.isNumber102BElectricalReroutesCheckBox() == true ? 1 : 0);
        measureEntity.setNumber102belectricalreresult(measureBean.getNumber102BElectricalReroutesResult());
        measureEntity.setNumber102cgardencheckbox(measureBean.isNumber102CGardenWindow4CheckBox() == true ? 1 : 0);
        measureEntity.setNumber102cgardenresult(measureBean.getNumber102CGardenWindow4Result());
        measureEntity.setNumber102dgardenwicheckbox(measureBean.isNumber102DGardenWindow6CheckBox() == true ? 1 : 0);
        measureEntity.setNumber102dgardenwiresult(measureBean.getNumber102DGardenWindow6Result());
        measureEntity.setNumber103allglazingcheckbox(measureBean.isNumber103AllGlazingCheckBox() == true ? 1 : 0);
        measureEntity.setNumber104wicheckbox(measureBean.isNumber104WindowsToMatcCheckBox() == true ? 1 : 0);
        measureEntity.setNumber11installpoolcheckbox(measureBean.isNumber11InstallPoolPumpCheckBox() == true ? 1 : 0);
        measureEntity.setNumber11installpoolpumpresult(measureBean.getNumber11InstallPoolPumpResult());
        measureEntity.setNumber12installwholecheckbox(measureBean.isNumber12InstallWholeHouseFanCheckBox() == true ? 1 : 0);
        measureEntity.setNumber12installwholehoint(measureBean.getNumber12InstallWholeHouseFanInt());
        measureEntity.setNumber12installwholehoresult(measureBean.getNumber12InstallWholeHouseFanResult());
        measureEntity.setNumber13installwacheckbox(measureBean.isNumber13InstallWaterHeaterCheckBox() == true ? 1 : 0);
        measureEntity.setNumber13installwaterhedouble(measureBean.getNumber13InstallWaterHeaterDouble());
        measureEntity.setNumber13installwaresult(measureBean.getNumber13InstallWaterHeaterResult());
        measureEntity.setNumber14permitscheckbox(measureBean.isNumber14PermitsCheckBox() == true ? 1 : 0);
        measureEntity.setNumber14permitsresult(measureBean.getNumber14PermitsResult());
        measureEntity.setNumber15installbatterycheckbox(measureBean.isNumber15InstallBatteryOperatedCheckBox() == true ? 1 : 0);
        measureEntity.setNumber15installbaresult(measureBean.getNumber15InstallBatteryOperatedResult());
        measureEntity.setNumber15ainstallkwdcsocheckbox(measureBean.isNumber15AInstallKWDCSolarSystemCheckBox() == true ? 1 : 0);
        measureEntity.setNumber15ainstallkwdcsodouble(measureBean.getNumber15aInstallKWDCSolarSystemDouble());
        measureEntity.setNumber15bincludesexcheckbox(measureBean.isNumber15BIncludesExtrudedAluminumCheckBox() == true ? 1 : 0);
        measureEntity.setNumber15csolarcheckbox(0);
        measureEntity.setNumber15csolarcheckbox(measureBean.isNumber15CSolarEdgeWithPowerOptimizersCheckBox() == true ? 1 : 0);
        measureEntity.setNumber15dincludessycheckbox(measureBean.isNumber15DIncludesSystemPVProductionCheckBox() == true ? 1 : 0);
        measureEntity.setNumber15eicheckbox(measureBean.isNumber15EIncludesAllPermitsCheckBox() == true ? 1 : 0);
        measureEntity.setNumber15fcanadiansocheckbox(measureBean.isNumber15FCanadianSolar270WattCheckBox() == true ? 1 : 0);
        measureEntity.setN16checkbox(measureBean.isN16CheckBox() == true ? 1 : 0);
        measureEntity.setN16int(measureBean.getN16Int());
        measureEntity.setN16result(measureBean.getN16Result());
        measureEntity.setN17checkbox(measureBean.isN17CheckBox() == true ? 1 : 0);
        measureEntity.setN17result(measureBean.getN17Result());
        measureEntity.setN17sqft(measureBean.getN17Sqft());
        measureEntity.setN17string(measureBean.getN17String());
        measureEntity.setN18checkbox(measureBean.isN16CheckBox() == true ? 1 : 0);
        measureEntity.setN18result(measureBean.getN18Result());
        measureEntity.setN18string(measureBean.getN18String());
        measureEntity.setWholecost(measureBean.getWholeCost());
        measureEntity.setSolarcost(measureBean.getSolarCost());
        measureEntity.setMarginpercentage(measureBean.getMarginPercentage());
        measureEntity.setPgerebateamount(measureBean.getPgeRebateAmount());
        measureEntity.setPgerebatepoints(measureBean.getPgeRebatePoints());
        measureEntity.setSmudrebateamount(measureBean.getSmudRebateAmount());
        
        return measureEntity;

    }

    public int addOrUpdateMeasure(MeasureBean measureBean) {
        int result = 1;
        Session session = sessionFactory.openSession();
        MeasureEntity measureEntity = fillFields(measureBean);
        try {
            session.beginTransaction();
            if (measureEntity.getNew1() == 1) {
                measureEntity.setNew1(0);
                session.save(measureEntity);
            } else {
                session.update(measureEntity);
            }
            session.getTransaction().commit();
            result = 0;
        } catch (HibernateException e) {
            System.err.println("addFinance broken: " + e.getMessage());
        } finally {
            measureEntity = null;
            System.gc();
            session.close();
        }
        return result;
    }

}
