//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.23 at 05:01:01 PM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADVT"/>
 *     &lt;enumeration value="AIRPORTSERVICES"/>
 *     &lt;enumeration value="AIRTRANSPORT"/>
 *     &lt;enumeration value="AIRTRVLAGNT"/>
 *     &lt;enumeration value="ARCHITECT"/>
 *     &lt;enumeration value="ASSTMGMT"/>
 *     &lt;enumeration value="ATMMAINTENANCE"/>
 *     &lt;enumeration value="AUCTIONSERV"/>
 *     &lt;enumeration value="AUTHSERST"/>
 *     &lt;enumeration value="BANKANDFIN"/>
 *     &lt;enumeration value="BEAUTYPARLOR"/>
 *     &lt;enumeration value="BROADCAST"/>
 *     &lt;enumeration value="BUSINESSAUX"/>
 *     &lt;enumeration value="BUSINESSEXHIBITION"/>
 *     &lt;enumeration value="BUSINESSSUPPORTSERV"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CABLEOPTR"/>
 *     &lt;enumeration value="CARGOHAND"/>
 *     &lt;enumeration value="CLEANINGSERV"/>
 *     &lt;enumeration value="CLEARANDFORW"/>
 *     &lt;enumeration value="CLUBSANDASSSERVICE"/>
 *     &lt;enumeration value="COMMCOACHORTRAINING"/>
 *     &lt;enumeration value="CONSENG"/>
 *     &lt;enumeration value="CONSTRCOMMERCIALCOMPLEX"/>
 *     &lt;enumeration value="CONTAINERRAILTRANS"/>
 *     &lt;enumeration value="CONVSERV"/>
 *     &lt;enumeration value="COSTACC"/>
 *     &lt;enumeration value="COURIER"/>
 *     &lt;enumeration value="CREDITCARD"/>
 *     &lt;enumeration value="CREDITRATAGNCY"/>
 *     &lt;enumeration value="CRUISESHIPTOUR"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CUSHOUSEAG"/>
 *     &lt;enumeration value="DESIGNSERV"/>
 *     &lt;enumeration value="DEVELOPSUPPLYCONTENT"/>
 *     &lt;enumeration value="DREDGING"/>
 *     &lt;enumeration value="DRYCLEANING"/>
 *     &lt;enumeration value="ERECTIONCOMMORINSTALL"/>
 *     &lt;enumeration value="EVENTMGMT"/>
 *     &lt;enumeration value="FASHIONDES"/>
 *     &lt;enumeration value="FOREXBROKING"/>
 *     &lt;enumeration value="FORWARDCONTRACT"/>
 *     &lt;enumeration value="FRANCHISESERV"/>
 *     &lt;enumeration value="GENERALINSURANCE"/>
 *     &lt;enumeration value="GOODSTRANSPORT"/>
 *     &lt;enumeration value="HEALTHCLUBANDFITNESS"/>
 *     &lt;enumeration value="INFORMATIONSERV"/>
 *     &lt;enumeration value="INSURAUX"/>
 *     &lt;enumeration value="INTDEC"/>
 *     &lt;enumeration value="INTELLECTUALPROPERTY"/>
 *     &lt;enumeration value="INTERNATIONALAIRTRAVEL"/>
 *     &lt;enumeration value="INTERNETCAFE"/>
 *     &lt;enumeration value="INTERNETTELEPHONY"/>
 *     &lt;enumeration value="LIFEINS"/>
 *     &lt;enumeration value="MAILLISTCOMPILE"/>
 *     &lt;enumeration value="MANDAPKEEPER"/>
 *     &lt;enumeration value="MANPWRRECRUIT"/>
 *     &lt;enumeration value="MGMTCONSUL"/>
 *     &lt;enumeration value="MGMTMAINTREPAIR"/>
 *     &lt;enumeration value="MININGOIL"/>
 *     &lt;enumeration value="MKTRESAGNCY"/>
 *     &lt;enumeration value="ONLINEINFORMRETRIEVAL"/>
 *     &lt;enumeration value="OPINIONPOLL"/>
 *     &lt;enumeration value="OUTDOORCATERING"/>
 *     &lt;enumeration value="PACKAGINGSERV"/>
 *     &lt;enumeration value="PANDALSHAMIANA"/>
 *     &lt;enumeration value="PHOTOGRAPHY"/>
 *     &lt;enumeration value="PORT"/>
 *     &lt;enumeration value="PORTSER"/>
 *     &lt;enumeration value="PROCESSCLEARHOUSE"/>
 *     &lt;enumeration value="PUBLICRELATIONMGMT"/>
 *     &lt;enumeration value="RAILTRAVELAGNT"/>
 *     &lt;enumeration value="REALESTAGT"/>
 *     &lt;enumeration value="RECOVERYAGENTS"/>
 *     &lt;enumeration value="REGISTRARSERV"/>
 *     &lt;enumeration value="RENTACAB"/>
 *     &lt;enumeration value="RENTINGIMMOVABLEPROP"/>
 *     &lt;enumeration value="RESIDENTIALCOMPLEXCONST"/>
 *     &lt;enumeration value="SALEOFSPACEFORADVT"/>
 *     &lt;enumeration value="SCANDTECHCONSUL"/>
 *     &lt;enumeration value="SECAG"/>
 *     &lt;enumeration value="SERVICESPROVIDEDFORTRANSACTION"/>
 *     &lt;enumeration value="SHARETRANSFERSERV"/>
 *     &lt;enumeration value="SHIPMGMT"/>
 *     &lt;enumeration value="SITEPREP"/>
 *     &lt;enumeration value="SOUNDRECORD"/>
 *     &lt;enumeration value="SPONSORSHIP"/>
 *     &lt;enumeration value="STAG"/>
 *     &lt;enumeration value="STOCKBROKING"/>
 *     &lt;enumeration value="STOCKEXCHGSERV"/>
 *     &lt;enumeration value="STORANDWAREHOUSING"/>
 *     &lt;enumeration value="SUPPLYTANGIBLEGOODS"/>
 *     &lt;enumeration value="SURVEYANDMAPMAKING"/>
 *     &lt;enumeration value="SURVEYMINERALS"/>
 *     &lt;enumeration value="TECHINSPECTION"/>
 *     &lt;enumeration value="TECHTESTING"/>
 *     &lt;enumeration value="TELECOMMUNICATIONSERV"/>
 *     &lt;enumeration value="TELEVISIONANDRADIO"/>
 *     &lt;enumeration value="TOUROP"/>
 *     &lt;enumeration value="TRANSPORTPIPELINE"/>
 *     &lt;enumeration value="TRAVELAGENT"/>
 *     &lt;enumeration value="ULIPMANAGEMENT"/>
 *     &lt;enumeration value="UNDERWRITER"/>
 *     &lt;enumeration value="VIDEOTAPEPROD"/>
 *     &lt;enumeration value="WORKSCONTRACT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
