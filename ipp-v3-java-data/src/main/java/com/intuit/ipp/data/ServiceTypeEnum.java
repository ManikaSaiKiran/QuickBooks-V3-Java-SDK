//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.01.16 at 03:08:03 PM IST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ServiceTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADVT"/&gt;
 *     &lt;enumeration value="AIRPORTSERVICES"/&gt;
 *     &lt;enumeration value="AIRTRANSPORT"/&gt;
 *     &lt;enumeration value="AIRTRVLAGNT"/&gt;
 *     &lt;enumeration value="ARCHITECT"/&gt;
 *     &lt;enumeration value="ASSTMGMT"/&gt;
 *     &lt;enumeration value="ATMMAINTENANCE"/&gt;
 *     &lt;enumeration value="AUCTIONSERV"/&gt;
 *     &lt;enumeration value="AUTHSERST"/&gt;
 *     &lt;enumeration value="BANKANDFIN"/&gt;
 *     &lt;enumeration value="BEAUTYPARLOR"/&gt;
 *     &lt;enumeration value="BROADCAST"/&gt;
 *     &lt;enumeration value="BUSINESSAUX"/&gt;
 *     &lt;enumeration value="BUSINESSEXHIBITION"/&gt;
 *     &lt;enumeration value="BUSINESSSUPPORTSERV"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="CABLEOPTR"/&gt;
 *     &lt;enumeration value="CARGOHAND"/&gt;
 *     &lt;enumeration value="CLEANINGSERV"/&gt;
 *     &lt;enumeration value="CLEARANDFORW"/&gt;
 *     &lt;enumeration value="CLUBSANDASSSERVICE"/&gt;
 *     &lt;enumeration value="COMMCOACHORTRAINING"/&gt;
 *     &lt;enumeration value="CONSENG"/&gt;
 *     &lt;enumeration value="CONSTRCOMMERCIALCOMPLEX"/&gt;
 *     &lt;enumeration value="CONTAINERRAILTRANS"/&gt;
 *     &lt;enumeration value="CONVSERV"/&gt;
 *     &lt;enumeration value="COSTACC"/&gt;
 *     &lt;enumeration value="COURIER"/&gt;
 *     &lt;enumeration value="CREDITCARD"/&gt;
 *     &lt;enumeration value="CREDITRATAGNCY"/&gt;
 *     &lt;enumeration value="CRUISESHIPTOUR"/&gt;
 *     &lt;enumeration value="CS"/&gt;
 *     &lt;enumeration value="CUSHOUSEAG"/&gt;
 *     &lt;enumeration value="DESIGNSERV"/&gt;
 *     &lt;enumeration value="DEVELOPSUPPLYCONTENT"/&gt;
 *     &lt;enumeration value="DREDGING"/&gt;
 *     &lt;enumeration value="DRYCLEANING"/&gt;
 *     &lt;enumeration value="ERECTIONCOMMORINSTALL"/&gt;
 *     &lt;enumeration value="EVENTMGMT"/&gt;
 *     &lt;enumeration value="FASHIONDES"/&gt;
 *     &lt;enumeration value="FOREXBROKING"/&gt;
 *     &lt;enumeration value="FORWARDCONTRACT"/&gt;
 *     &lt;enumeration value="FRANCHISESERV"/&gt;
 *     &lt;enumeration value="GENERALINSURANCE"/&gt;
 *     &lt;enumeration value="GOODSTRANSPORT"/&gt;
 *     &lt;enumeration value="HEALTHCLUBANDFITNESS"/&gt;
 *     &lt;enumeration value="INFORMATIONSERV"/&gt;
 *     &lt;enumeration value="INSURAUX"/&gt;
 *     &lt;enumeration value="INTDEC"/&gt;
 *     &lt;enumeration value="INTELLECTUALPROPERTY"/&gt;
 *     &lt;enumeration value="INTERNATIONALAIRTRAVEL"/&gt;
 *     &lt;enumeration value="INTERNETCAFE"/&gt;
 *     &lt;enumeration value="INTERNETTELEPHONY"/&gt;
 *     &lt;enumeration value="LIFEINS"/&gt;
 *     &lt;enumeration value="MAILLISTCOMPILE"/&gt;
 *     &lt;enumeration value="MANDAPKEEPER"/&gt;
 *     &lt;enumeration value="MANPWRRECRUIT"/&gt;
 *     &lt;enumeration value="MGMTCONSUL"/&gt;
 *     &lt;enumeration value="MGMTMAINTREPAIR"/&gt;
 *     &lt;enumeration value="MININGOIL"/&gt;
 *     &lt;enumeration value="MKTRESAGNCY"/&gt;
 *     &lt;enumeration value="ONLINEINFORMRETRIEVAL"/&gt;
 *     &lt;enumeration value="OPINIONPOLL"/&gt;
 *     &lt;enumeration value="OUTDOORCATERING"/&gt;
 *     &lt;enumeration value="PACKAGINGSERV"/&gt;
 *     &lt;enumeration value="PANDALSHAMIANA"/&gt;
 *     &lt;enumeration value="PHOTOGRAPHY"/&gt;
 *     &lt;enumeration value="PORT"/&gt;
 *     &lt;enumeration value="PORTSER"/&gt;
 *     &lt;enumeration value="PROCESSCLEARHOUSE"/&gt;
 *     &lt;enumeration value="PUBLICRELATIONMGMT"/&gt;
 *     &lt;enumeration value="RAILTRAVELAGNT"/&gt;
 *     &lt;enumeration value="REALESTAGT"/&gt;
 *     &lt;enumeration value="RECOVERYAGENTS"/&gt;
 *     &lt;enumeration value="REGISTRARSERV"/&gt;
 *     &lt;enumeration value="RENTACAB"/&gt;
 *     &lt;enumeration value="RENTINGIMMOVABLEPROP"/&gt;
 *     &lt;enumeration value="RESIDENTIALCOMPLEXCONST"/&gt;
 *     &lt;enumeration value="SALEOFSPACEFORADVT"/&gt;
 *     &lt;enumeration value="SCANDTECHCONSUL"/&gt;
 *     &lt;enumeration value="SECAG"/&gt;
 *     &lt;enumeration value="SERVICESPROVIDEDFORTRANSACTION"/&gt;
 *     &lt;enumeration value="SHARETRANSFERSERV"/&gt;
 *     &lt;enumeration value="SHIPMGMT"/&gt;
 *     &lt;enumeration value="SITEPREP"/&gt;
 *     &lt;enumeration value="SOUNDRECORD"/&gt;
 *     &lt;enumeration value="SPONSORSHIP"/&gt;
 *     &lt;enumeration value="STAG"/&gt;
 *     &lt;enumeration value="STOCKBROKING"/&gt;
 *     &lt;enumeration value="STOCKEXCHGSERV"/&gt;
 *     &lt;enumeration value="STORANDWAREHOUSING"/&gt;
 *     &lt;enumeration value="SUPPLYTANGIBLEGOODS"/&gt;
 *     &lt;enumeration value="SURVEYANDMAPMAKING"/&gt;
 *     &lt;enumeration value="SURVEYMINERALS"/&gt;
 *     &lt;enumeration value="TECHINSPECTION"/&gt;
 *     &lt;enumeration value="TECHTESTING"/&gt;
 *     &lt;enumeration value="TELECOMMUNICATIONSERV"/&gt;
 *     &lt;enumeration value="TELEVISIONANDRADIO"/&gt;
 *     &lt;enumeration value="TOUROP"/&gt;
 *     &lt;enumeration value="TRANSPORTPIPELINE"/&gt;
 *     &lt;enumeration value="TRAVELAGENT"/&gt;
 *     &lt;enumeration value="ULIPMANAGEMENT"/&gt;
 *     &lt;enumeration value="UNDERWRITER"/&gt;
 *     &lt;enumeration value="VIDEOTAPEPROD"/&gt;
 *     &lt;enumeration value="WORKSCONTRACT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceTypeEnum")
@XmlEnum
public enum ServiceTypeEnum {

    ADVT,
    AIRPORTSERVICES,
    AIRTRANSPORT,
    AIRTRVLAGNT,
    ARCHITECT,
    ASSTMGMT,
    ATMMAINTENANCE,
    AUCTIONSERV,
    AUTHSERST,
    BANKANDFIN,
    BEAUTYPARLOR,
    BROADCAST,
    BUSINESSAUX,
    BUSINESSEXHIBITION,
    BUSINESSSUPPORTSERV,
    CA,
    CABLEOPTR,
    CARGOHAND,
    CLEANINGSERV,
    CLEARANDFORW,
    CLUBSANDASSSERVICE,
    COMMCOACHORTRAINING,
    CONSENG,
    CONSTRCOMMERCIALCOMPLEX,
    CONTAINERRAILTRANS,
    CONVSERV,
    COSTACC,
    COURIER,
    CREDITCARD,
    CREDITRATAGNCY,
    CRUISESHIPTOUR,
    CS,
    CUSHOUSEAG,
    DESIGNSERV,
    DEVELOPSUPPLYCONTENT,
    DREDGING,
    DRYCLEANING,
    ERECTIONCOMMORINSTALL,
    EVENTMGMT,
    FASHIONDES,
    FOREXBROKING,
    FORWARDCONTRACT,
    FRANCHISESERV,
    GENERALINSURANCE,
    GOODSTRANSPORT,
    HEALTHCLUBANDFITNESS,
    INFORMATIONSERV,
    INSURAUX,
    INTDEC,
    INTELLECTUALPROPERTY,
    INTERNATIONALAIRTRAVEL,
    INTERNETCAFE,
    INTERNETTELEPHONY,
    LIFEINS,
    MAILLISTCOMPILE,
    MANDAPKEEPER,
    MANPWRRECRUIT,
    MGMTCONSUL,
    MGMTMAINTREPAIR,
    MININGOIL,
    MKTRESAGNCY,
    ONLINEINFORMRETRIEVAL,
    OPINIONPOLL,
    OUTDOORCATERING,
    PACKAGINGSERV,
    PANDALSHAMIANA,
    PHOTOGRAPHY,
    PORT,
    PORTSER,
    PROCESSCLEARHOUSE,
    PUBLICRELATIONMGMT,
    RAILTRAVELAGNT,
    REALESTAGT,
    RECOVERYAGENTS,
    REGISTRARSERV,
    RENTACAB,
    RENTINGIMMOVABLEPROP,
    RESIDENTIALCOMPLEXCONST,
    SALEOFSPACEFORADVT,
    SCANDTECHCONSUL,
    SECAG,
    SERVICESPROVIDEDFORTRANSACTION,
    SHARETRANSFERSERV,
    SHIPMGMT,
    SITEPREP,
    SOUNDRECORD,
    SPONSORSHIP,
    STAG,
    STOCKBROKING,
    STOCKEXCHGSERV,
    STORANDWAREHOUSING,
    SUPPLYTANGIBLEGOODS,
    SURVEYANDMAPMAKING,
    SURVEYMINERALS,
    TECHINSPECTION,
    TECHTESTING,
    TELECOMMUNICATIONSERV,
    TELEVISIONANDRADIO,
    TOUROP,
    TRANSPORTPIPELINE,
    TRAVELAGENT,
    ULIPMANAGEMENT,
    UNDERWRITER,
    VIDEOTAPEPROD,
    WORKSCONTRACT;

    public String value() {
        return name();
    }

    public static ServiceTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
