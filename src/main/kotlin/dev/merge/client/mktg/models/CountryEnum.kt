/**
 * Merge Marketing Automation API
 *
 * The unified API for building rich integrations with multiple Marketing Automation platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package dev.merge.client.mktg.models


import com.fasterxml.jackson.annotation.JsonEnumDefaultValue
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * Values: AF,AX,AL,DZ,AS,AD,AO,AI,AQ,AG,AR,AM,AW,AU,AT,AZ,BS,BH,BD,BB,BY,BE,BZ,BJ,BM,BT,BO,BQ,BA,BW,BV,BR,IO,BN,BG,BF,BI,CV,KH,CM,CA,KY,CF,TD,CL,CN,CX,CC,CO,KM,CG,CD,CK,CR,CI,HR,CU,CW,CY,CZ,DK,DJ,DM,DO,EC,EG,SV,GQ,ER,EE,SZ,ET,FK,FO,FJ,FI,FR,GF,PF,TF,GA,GM,GE,DE,GH,GI,GR,GL,GD,GP,GU,GT,GG,GN,GW,GY,HT,HM,VA,HN,HK,HU,IS,IN,ID,IR,IQ,IE,IM,IL,IT,JM,JP,JE,JO,KZ,KE,KI,KW,KG,LA,LV,LB,LS,LR,LY,LI,LT,LU,MO,MG,MW,MY,MV,ML,MT,MH,MQ,MR,MU,YT,MX,FM,MD,MC,MN,ME,MS,MA,MZ,MM,NA,NR,NP,NL,NC,NZ,NI,NE,NG,NU,NF,KP,MK,MP,NO,OM,PK,PW,PS,PA,PG,PY,PE,PH,PN,PL,PT,PR,QA,RE,RO,RU,RW,BL,SH,KN,LC,MF,PM,VC,WS,SM,ST,SA,SN,RS,SC,SL,SG,SX,SK,SI,SB,SO,ZA,GS,KR,SS,ES,LK,SD,SR,SJ,SE,CH,SY,TW,TJ,TZ,TH,TL,TG,TK,TO,TT,TN,TR,TM,TC,TV,UG,UA,AE,GB,UM,US,UY,UZ,VU,VE,VN,VG,VI,WF,EH,YE,ZM,ZW
 */
enum class CountryEnum(val value: kotlin.String) {

    @JsonEnumDefaultValue
    @JsonProperty(value = "MERGE_NONSTANDARD_VALUE")
    MERGE_NONSTANDARD_VALUE("MERGE_NONSTANDARD_VALUE"),


    @JsonProperty(value = "AF")
    AF("AF"),


    @JsonProperty(value = "AX")
    AX("AX"),


    @JsonProperty(value = "AL")
    AL("AL"),


    @JsonProperty(value = "DZ")
    DZ("DZ"),


    @JsonProperty(value = "AS")
    AS("AS"),


    @JsonProperty(value = "AD")
    AD("AD"),


    @JsonProperty(value = "AO")
    AO("AO"),


    @JsonProperty(value = "AI")
    AI("AI"),


    @JsonProperty(value = "AQ")
    AQ("AQ"),


    @JsonProperty(value = "AG")
    AG("AG"),


    @JsonProperty(value = "AR")
    AR("AR"),


    @JsonProperty(value = "AM")
    AM("AM"),


    @JsonProperty(value = "AW")
    AW("AW"),


    @JsonProperty(value = "AU")
    AU("AU"),


    @JsonProperty(value = "AT")
    AT("AT"),


    @JsonProperty(value = "AZ")
    AZ("AZ"),


    @JsonProperty(value = "BS")
    BS("BS"),


    @JsonProperty(value = "BH")
    BH("BH"),


    @JsonProperty(value = "BD")
    BD("BD"),


    @JsonProperty(value = "BB")
    BB("BB"),


    @JsonProperty(value = "BY")
    BY("BY"),


    @JsonProperty(value = "BE")
    BE("BE"),


    @JsonProperty(value = "BZ")
    BZ("BZ"),


    @JsonProperty(value = "BJ")
    BJ("BJ"),


    @JsonProperty(value = "BM")
    BM("BM"),


    @JsonProperty(value = "BT")
    BT("BT"),


    @JsonProperty(value = "BO")
    BO("BO"),


    @JsonProperty(value = "BQ")
    BQ("BQ"),


    @JsonProperty(value = "BA")
    BA("BA"),


    @JsonProperty(value = "BW")
    BW("BW"),


    @JsonProperty(value = "BV")
    BV("BV"),


    @JsonProperty(value = "BR")
    BR("BR"),


    @JsonProperty(value = "IO")
    IO("IO"),


    @JsonProperty(value = "BN")
    BN("BN"),


    @JsonProperty(value = "BG")
    BG("BG"),


    @JsonProperty(value = "BF")
    BF("BF"),


    @JsonProperty(value = "BI")
    BI("BI"),


    @JsonProperty(value = "CV")
    CV("CV"),


    @JsonProperty(value = "KH")
    KH("KH"),


    @JsonProperty(value = "CM")
    CM("CM"),


    @JsonProperty(value = "CA")
    CA("CA"),


    @JsonProperty(value = "KY")
    KY("KY"),


    @JsonProperty(value = "CF")
    CF("CF"),


    @JsonProperty(value = "TD")
    TD("TD"),


    @JsonProperty(value = "CL")
    CL("CL"),


    @JsonProperty(value = "CN")
    CN("CN"),


    @JsonProperty(value = "CX")
    CX("CX"),


    @JsonProperty(value = "CC")
    CC("CC"),


    @JsonProperty(value = "CO")
    CO("CO"),


    @JsonProperty(value = "KM")
    KM("KM"),


    @JsonProperty(value = "CG")
    CG("CG"),


    @JsonProperty(value = "CD")
    CD("CD"),


    @JsonProperty(value = "CK")
    CK("CK"),


    @JsonProperty(value = "CR")
    CR("CR"),


    @JsonProperty(value = "CI")
    CI("CI"),


    @JsonProperty(value = "HR")
    HR("HR"),


    @JsonProperty(value = "CU")
    CU("CU"),


    @JsonProperty(value = "CW")
    CW("CW"),


    @JsonProperty(value = "CY")
    CY("CY"),


    @JsonProperty(value = "CZ")
    CZ("CZ"),


    @JsonProperty(value = "DK")
    DK("DK"),


    @JsonProperty(value = "DJ")
    DJ("DJ"),


    @JsonProperty(value = "DM")
    DM("DM"),


    @JsonProperty(value = "DO")
    DO("DO"),


    @JsonProperty(value = "EC")
    EC("EC"),


    @JsonProperty(value = "EG")
    EG("EG"),


    @JsonProperty(value = "SV")
    SV("SV"),


    @JsonProperty(value = "GQ")
    GQ("GQ"),


    @JsonProperty(value = "ER")
    ER("ER"),


    @JsonProperty(value = "EE")
    EE("EE"),


    @JsonProperty(value = "SZ")
    SZ("SZ"),


    @JsonProperty(value = "ET")
    ET("ET"),


    @JsonProperty(value = "FK")
    FK("FK"),


    @JsonProperty(value = "FO")
    FO("FO"),


    @JsonProperty(value = "FJ")
    FJ("FJ"),


    @JsonProperty(value = "FI")
    FI("FI"),


    @JsonProperty(value = "FR")
    FR("FR"),


    @JsonProperty(value = "GF")
    GF("GF"),


    @JsonProperty(value = "PF")
    PF("PF"),


    @JsonProperty(value = "TF")
    TF("TF"),


    @JsonProperty(value = "GA")
    GA("GA"),


    @JsonProperty(value = "GM")
    GM("GM"),


    @JsonProperty(value = "GE")
    GE("GE"),


    @JsonProperty(value = "DE")
    DE("DE"),


    @JsonProperty(value = "GH")
    GH("GH"),


    @JsonProperty(value = "GI")
    GI("GI"),


    @JsonProperty(value = "GR")
    GR("GR"),


    @JsonProperty(value = "GL")
    GL("GL"),


    @JsonProperty(value = "GD")
    GD("GD"),


    @JsonProperty(value = "GP")
    GP("GP"),


    @JsonProperty(value = "GU")
    GU("GU"),


    @JsonProperty(value = "GT")
    GT("GT"),


    @JsonProperty(value = "GG")
    GG("GG"),


    @JsonProperty(value = "GN")
    GN("GN"),


    @JsonProperty(value = "GW")
    GW("GW"),


    @JsonProperty(value = "GY")
    GY("GY"),


    @JsonProperty(value = "HT")
    HT("HT"),


    @JsonProperty(value = "HM")
    HM("HM"),


    @JsonProperty(value = "VA")
    VA("VA"),


    @JsonProperty(value = "HN")
    HN("HN"),


    @JsonProperty(value = "HK")
    HK("HK"),


    @JsonProperty(value = "HU")
    HU("HU"),


    @JsonProperty(value = "IS")
    IS("IS"),


    @JsonProperty(value = "IN")
    IN("IN"),


    @JsonProperty(value = "ID")
    ID("ID"),


    @JsonProperty(value = "IR")
    IR("IR"),


    @JsonProperty(value = "IQ")
    IQ("IQ"),


    @JsonProperty(value = "IE")
    IE("IE"),


    @JsonProperty(value = "IM")
    IM("IM"),


    @JsonProperty(value = "IL")
    IL("IL"),


    @JsonProperty(value = "IT")
    IT("IT"),


    @JsonProperty(value = "JM")
    JM("JM"),


    @JsonProperty(value = "JP")
    JP("JP"),


    @JsonProperty(value = "JE")
    JE("JE"),


    @JsonProperty(value = "JO")
    JO("JO"),


    @JsonProperty(value = "KZ")
    KZ("KZ"),


    @JsonProperty(value = "KE")
    KE("KE"),


    @JsonProperty(value = "KI")
    KI("KI"),


    @JsonProperty(value = "KW")
    KW("KW"),


    @JsonProperty(value = "KG")
    KG("KG"),


    @JsonProperty(value = "LA")
    LA("LA"),


    @JsonProperty(value = "LV")
    LV("LV"),


    @JsonProperty(value = "LB")
    LB("LB"),


    @JsonProperty(value = "LS")
    LS("LS"),


    @JsonProperty(value = "LR")
    LR("LR"),


    @JsonProperty(value = "LY")
    LY("LY"),


    @JsonProperty(value = "LI")
    LI("LI"),


    @JsonProperty(value = "LT")
    LT("LT"),


    @JsonProperty(value = "LU")
    LU("LU"),


    @JsonProperty(value = "MO")
    MO("MO"),


    @JsonProperty(value = "MG")
    MG("MG"),


    @JsonProperty(value = "MW")
    MW("MW"),


    @JsonProperty(value = "MY")
    MY("MY"),


    @JsonProperty(value = "MV")
    MV("MV"),


    @JsonProperty(value = "ML")
    ML("ML"),


    @JsonProperty(value = "MT")
    MT("MT"),


    @JsonProperty(value = "MH")
    MH("MH"),


    @JsonProperty(value = "MQ")
    MQ("MQ"),


    @JsonProperty(value = "MR")
    MR("MR"),


    @JsonProperty(value = "MU")
    MU("MU"),


    @JsonProperty(value = "YT")
    YT("YT"),


    @JsonProperty(value = "MX")
    MX("MX"),


    @JsonProperty(value = "FM")
    FM("FM"),


    @JsonProperty(value = "MD")
    MD("MD"),


    @JsonProperty(value = "MC")
    MC("MC"),


    @JsonProperty(value = "MN")
    MN("MN"),


    @JsonProperty(value = "ME")
    ME("ME"),


    @JsonProperty(value = "MS")
    MS("MS"),


    @JsonProperty(value = "MA")
    MA("MA"),


    @JsonProperty(value = "MZ")
    MZ("MZ"),


    @JsonProperty(value = "MM")
    MM("MM"),


    @JsonProperty(value = "NA")
    NA("NA"),


    @JsonProperty(value = "NR")
    NR("NR"),


    @JsonProperty(value = "NP")
    NP("NP"),


    @JsonProperty(value = "NL")
    NL("NL"),


    @JsonProperty(value = "NC")
    NC("NC"),


    @JsonProperty(value = "NZ")
    NZ("NZ"),


    @JsonProperty(value = "NI")
    NI("NI"),


    @JsonProperty(value = "NE")
    NE("NE"),


    @JsonProperty(value = "NG")
    NG("NG"),


    @JsonProperty(value = "NU")
    NU("NU"),


    @JsonProperty(value = "NF")
    NF("NF"),


    @JsonProperty(value = "KP")
    KP("KP"),


    @JsonProperty(value = "MK")
    MK("MK"),


    @JsonProperty(value = "MP")
    MP("MP"),


    @JsonProperty(value = "NO")
    NO("NO"),


    @JsonProperty(value = "OM")
    OM("OM"),


    @JsonProperty(value = "PK")
    PK("PK"),


    @JsonProperty(value = "PW")
    PW("PW"),


    @JsonProperty(value = "PS")
    PS("PS"),


    @JsonProperty(value = "PA")
    PA("PA"),


    @JsonProperty(value = "PG")
    PG("PG"),


    @JsonProperty(value = "PY")
    PY("PY"),


    @JsonProperty(value = "PE")
    PE("PE"),


    @JsonProperty(value = "PH")
    PH("PH"),


    @JsonProperty(value = "PN")
    PN("PN"),


    @JsonProperty(value = "PL")
    PL("PL"),


    @JsonProperty(value = "PT")
    PT("PT"),


    @JsonProperty(value = "PR")
    PR("PR"),


    @JsonProperty(value = "QA")
    QA("QA"),


    @JsonProperty(value = "RE")
    RE("RE"),


    @JsonProperty(value = "RO")
    RO("RO"),


    @JsonProperty(value = "RU")
    RU("RU"),


    @JsonProperty(value = "RW")
    RW("RW"),


    @JsonProperty(value = "BL")
    BL("BL"),


    @JsonProperty(value = "SH")
    SH("SH"),


    @JsonProperty(value = "KN")
    KN("KN"),


    @JsonProperty(value = "LC")
    LC("LC"),


    @JsonProperty(value = "MF")
    MF("MF"),


    @JsonProperty(value = "PM")
    PM("PM"),


    @JsonProperty(value = "VC")
    VC("VC"),


    @JsonProperty(value = "WS")
    WS("WS"),


    @JsonProperty(value = "SM")
    SM("SM"),


    @JsonProperty(value = "ST")
    ST("ST"),


    @JsonProperty(value = "SA")
    SA("SA"),


    @JsonProperty(value = "SN")
    SN("SN"),


    @JsonProperty(value = "RS")
    RS("RS"),


    @JsonProperty(value = "SC")
    SC("SC"),


    @JsonProperty(value = "SL")
    SL("SL"),


    @JsonProperty(value = "SG")
    SG("SG"),


    @JsonProperty(value = "SX")
    SX("SX"),


    @JsonProperty(value = "SK")
    SK("SK"),


    @JsonProperty(value = "SI")
    SI("SI"),


    @JsonProperty(value = "SB")
    SB("SB"),


    @JsonProperty(value = "SO")
    SO("SO"),


    @JsonProperty(value = "ZA")
    ZA("ZA"),


    @JsonProperty(value = "GS")
    GS("GS"),


    @JsonProperty(value = "KR")
    KR("KR"),


    @JsonProperty(value = "SS")
    SS("SS"),


    @JsonProperty(value = "ES")
    ES("ES"),


    @JsonProperty(value = "LK")
    LK("LK"),


    @JsonProperty(value = "SD")
    SD("SD"),


    @JsonProperty(value = "SR")
    SR("SR"),


    @JsonProperty(value = "SJ")
    SJ("SJ"),


    @JsonProperty(value = "SE")
    SE("SE"),


    @JsonProperty(value = "CH")
    CH("CH"),


    @JsonProperty(value = "SY")
    SY("SY"),


    @JsonProperty(value = "TW")
    TW("TW"),


    @JsonProperty(value = "TJ")
    TJ("TJ"),


    @JsonProperty(value = "TZ")
    TZ("TZ"),


    @JsonProperty(value = "TH")
    TH("TH"),


    @JsonProperty(value = "TL")
    TL("TL"),


    @JsonProperty(value = "TG")
    TG("TG"),


    @JsonProperty(value = "TK")
    TK("TK"),


    @JsonProperty(value = "TO")
    TO("TO"),


    @JsonProperty(value = "TT")
    TT("TT"),


    @JsonProperty(value = "TN")
    TN("TN"),


    @JsonProperty(value = "TR")
    TR("TR"),


    @JsonProperty(value = "TM")
    TM("TM"),


    @JsonProperty(value = "TC")
    TC("TC"),


    @JsonProperty(value = "TV")
    TV("TV"),


    @JsonProperty(value = "UG")
    UG("UG"),


    @JsonProperty(value = "UA")
    UA("UA"),


    @JsonProperty(value = "AE")
    AE("AE"),


    @JsonProperty(value = "GB")
    GB("GB"),


    @JsonProperty(value = "UM")
    UM("UM"),


    @JsonProperty(value = "US")
    US("US"),


    @JsonProperty(value = "UY")
    UY("UY"),


    @JsonProperty(value = "UZ")
    UZ("UZ"),


    @JsonProperty(value = "VU")
    VU("VU"),


    @JsonProperty(value = "VE")
    VE("VE"),


    @JsonProperty(value = "VN")
    VN("VN"),


    @JsonProperty(value = "VG")
    VG("VG"),


    @JsonProperty(value = "VI")
    VI("VI"),


    @JsonProperty(value = "WF")
    WF("WF"),


    @JsonProperty(value = "EH")
    EH("EH"),


    @JsonProperty(value = "YE")
    YE("YE"),


    @JsonProperty(value = "ZM")
    ZM("ZM"),


    @JsonProperty(value = "ZW")
    ZW("ZW");


    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise. We do not encode to
         * MERGE_NONSTANDARD_VALUE since the API never expects to receive this value, so encoding it is not valid.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is CountryEnum) "$data" else null

        /**
         * Returns a valid [CountryEnum] for [data], MERGE_NONSTANDARD_VALUE otherwise
         */
        fun decode(data: kotlin.Any?): CountryEnum = data?.let {
          val normalizedData = "$it".lowercase()
          return values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          } ?: MERGE_NONSTANDARD_VALUE
        } ?: MERGE_NONSTANDARD_VALUE
    }
}

