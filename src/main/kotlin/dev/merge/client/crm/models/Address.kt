/**
 * Merge CRM API
 *
 * The unified API for building rich integrations with multiple CRM platforms.
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

package dev.merge.client.crm.models

import dev.merge.client.crm.models.AddressTypeEnum
import dev.merge.client.crm.models.CountryEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Address Object ### Description The `Address` object is used to represent an entity's address. ### Usage Example TODO
 *
 * @param street1 Line 1 of the address's street.
 * @param street2 Line 2 of the address's street.
 * @param city The address's city.
 * @param state The address's state.
 * @param postalCode The address's postal code.
 * @param country The address's country.  * `AF` - Afghanistan * `AX` - Åland Islands * `AL` - Albania * `DZ` - Algeria * `AS` - American Samoa * `AD` - Andorra * `AO` - Angola * `AI` - Anguilla * `AQ` - Antarctica * `AG` - Antigua and Barbuda * `AR` - Argentina * `AM` - Armenia * `AW` - Aruba * `AU` - Australia * `AT` - Austria * `AZ` - Azerbaijan * `BS` - Bahamas * `BH` - Bahrain * `BD` - Bangladesh * `BB` - Barbados * `BY` - Belarus * `BE` - Belgium * `BZ` - Belize * `BJ` - Benin * `BM` - Bermuda * `BT` - Bhutan * `BO` - Bolivia * `BQ` - Bonaire, Sint Eustatius and Saba * `BA` - Bosnia and Herzegovina * `BW` - Botswana * `BV` - Bouvet Island * `BR` - Brazil * `IO` - British Indian Ocean Territory * `BN` - Brunei * `BG` - Bulgaria * `BF` - Burkina Faso * `BI` - Burundi * `CV` - Cabo Verde * `KH` - Cambodia * `CM` - Cameroon * `CA` - Canada * `KY` - Cayman Islands * `CF` - Central African Republic * `TD` - Chad * `CL` - Chile * `CN` - China * `CX` - Christmas Island * `CC` - Cocos (Keeling) Islands * `CO` - Colombia * `KM` - Comoros * `CG` - Congo * `CD` - Congo (the Democratic Republic of the) * `CK` - Cook Islands * `CR` - Costa Rica * `CI` - Côte d'Ivoire * `HR` - Croatia * `CU` - Cuba * `CW` - Curaçao * `CY` - Cyprus * `CZ` - Czechia * `DK` - Denmark * `DJ` - Djibouti * `DM` - Dominica * `DO` - Dominican Republic * `EC` - Ecuador * `EG` - Egypt * `SV` - El Salvador * `GQ` - Equatorial Guinea * `ER` - Eritrea * `EE` - Estonia * `SZ` - Eswatini * `ET` - Ethiopia * `FK` - Falkland Islands (Malvinas) * `FO` - Faroe Islands * `FJ` - Fiji * `FI` - Finland * `FR` - France * `GF` - French Guiana * `PF` - French Polynesia * `TF` - French Southern Territories * `GA` - Gabon * `GM` - Gambia * `GE` - Georgia * `DE` - Germany * `GH` - Ghana * `GI` - Gibraltar * `GR` - Greece * `GL` - Greenland * `GD` - Grenada * `GP` - Guadeloupe * `GU` - Guam * `GT` - Guatemala * `GG` - Guernsey * `GN` - Guinea * `GW` - Guinea-Bissau * `GY` - Guyana * `HT` - Haiti * `HM` - Heard Island and McDonald Islands * `VA` - Holy See * `HN` - Honduras * `HK` - Hong Kong * `HU` - Hungary * `IS` - Iceland * `IN` - India * `ID` - Indonesia * `IR` - Iran * `IQ` - Iraq * `IE` - Ireland * `IM` - Isle of Man * `IL` - Israel * `IT` - Italy * `JM` - Jamaica * `JP` - Japan * `JE` - Jersey * `JO` - Jordan * `KZ` - Kazakhstan * `KE` - Kenya * `KI` - Kiribati * `KW` - Kuwait * `KG` - Kyrgyzstan * `LA` - Laos * `LV` - Latvia * `LB` - Lebanon * `LS` - Lesotho * `LR` - Liberia * `LY` - Libya * `LI` - Liechtenstein * `LT` - Lithuania * `LU` - Luxembourg * `MO` - Macao * `MG` - Madagascar * `MW` - Malawi * `MY` - Malaysia * `MV` - Maldives * `ML` - Mali * `MT` - Malta * `MH` - Marshall Islands * `MQ` - Martinique * `MR` - Mauritania * `MU` - Mauritius * `YT` - Mayotte * `MX` - Mexico * `FM` - Micronesia (Federated States of) * `MD` - Moldova * `MC` - Monaco * `MN` - Mongolia * `ME` - Montenegro * `MS` - Montserrat * `MA` - Morocco * `MZ` - Mozambique * `MM` - Myanmar * `NA` - Namibia * `NR` - Nauru * `NP` - Nepal * `NL` - Netherlands * `NC` - New Caledonia * `NZ` - New Zealand * `NI` - Nicaragua * `NE` - Niger * `NG` - Nigeria * `NU` - Niue * `NF` - Norfolk Island * `KP` - North Korea * `MK` - North Macedonia * `MP` - Northern Mariana Islands * `NO` - Norway * `OM` - Oman * `PK` - Pakistan * `PW` - Palau * `PS` - Palestine, State of * `PA` - Panama * `PG` - Papua New Guinea * `PY` - Paraguay * `PE` - Peru * `PH` - Philippines * `PN` - Pitcairn * `PL` - Poland * `PT` - Portugal * `PR` - Puerto Rico * `QA` - Qatar * `RE` - Réunion * `RO` - Romania * `RU` - Russia * `RW` - Rwanda * `BL` - Saint Barthélemy * `SH` - Saint Helena, Ascension and Tristan da Cunha * `KN` - Saint Kitts and Nevis * `LC` - Saint Lucia * `MF` - Saint Martin (French part) * `PM` - Saint Pierre and Miquelon * `VC` - Saint Vincent and the Grenadines * `WS` - Samoa * `SM` - San Marino * `ST` - Sao Tome and Principe * `SA` - Saudi Arabia * `SN` - Senegal * `RS` - Serbia * `SC` - Seychelles * `SL` - Sierra Leone * `SG` - Singapore * `SX` - Sint Maarten (Dutch part) * `SK` - Slovakia * `SI` - Slovenia * `SB` - Solomon Islands * `SO` - Somalia * `ZA` - South Africa * `GS` - South Georgia and the South Sandwich Islands * `KR` - South Korea * `SS` - South Sudan * `ES` - Spain * `LK` - Sri Lanka * `SD` - Sudan * `SR` - Suriname * `SJ` - Svalbard and Jan Mayen * `SE` - Sweden * `CH` - Switzerland * `SY` - Syria * `TW` - Taiwan * `TJ` - Tajikistan * `TZ` - Tanzania * `TH` - Thailand * `TL` - Timor-Leste * `TG` - Togo * `TK` - Tokelau * `TO` - Tonga * `TT` - Trinidad and Tobago * `TN` - Tunisia * `TR` - Turkey * `TM` - Turkmenistan * `TC` - Turks and Caicos Islands * `TV` - Tuvalu * `UG` - Uganda * `UA` - Ukraine * `AE` - United Arab Emirates * `GB` - United Kingdom * `UM` - United States Minor Outlying Islands * `US` - United States of America * `UY` - Uruguay * `UZ` - Uzbekistan * `VU` - Vanuatu * `VE` - Venezuela * `VN` - Vietnam * `VG` - Virgin Islands (British) * `VI` - Virgin Islands (U.S.) * `WF` - Wallis and Futuna * `EH` - Western Sahara * `YE` - Yemen * `ZM` - Zambia * `ZW` - Zimbabwe
 * @param addressType The address type.  * `BILLING` - BILLING * `SHIPPING` - SHIPPING
 * @param modifiedAt This is the datetime that this object was last updated by Merge
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Address (

    /* Line 1 of the address's street. */
    @field:JsonProperty("street_1")
    val street1: kotlin.String? = null,

    /* Line 2 of the address's street. */
    @field:JsonProperty("street_2")
    val street2: kotlin.String? = null,

    /* The address's city. */
    @field:JsonProperty("city")
    val city: kotlin.String? = null,

    /* The address's state. */
    @field:JsonProperty("state")
    val state: kotlin.String? = null,

    /* The address's postal code. */
    @field:JsonProperty("postal_code")
    val postalCode: kotlin.String? = null,

    /* The address's country.  * `AF` - Afghanistan * `AX` - Åland Islands * `AL` - Albania * `DZ` - Algeria * `AS` - American Samoa * `AD` - Andorra * `AO` - Angola * `AI` - Anguilla * `AQ` - Antarctica * `AG` - Antigua and Barbuda * `AR` - Argentina * `AM` - Armenia * `AW` - Aruba * `AU` - Australia * `AT` - Austria * `AZ` - Azerbaijan * `BS` - Bahamas * `BH` - Bahrain * `BD` - Bangladesh * `BB` - Barbados * `BY` - Belarus * `BE` - Belgium * `BZ` - Belize * `BJ` - Benin * `BM` - Bermuda * `BT` - Bhutan * `BO` - Bolivia * `BQ` - Bonaire, Sint Eustatius and Saba * `BA` - Bosnia and Herzegovina * `BW` - Botswana * `BV` - Bouvet Island * `BR` - Brazil * `IO` - British Indian Ocean Territory * `BN` - Brunei * `BG` - Bulgaria * `BF` - Burkina Faso * `BI` - Burundi * `CV` - Cabo Verde * `KH` - Cambodia * `CM` - Cameroon * `CA` - Canada * `KY` - Cayman Islands * `CF` - Central African Republic * `TD` - Chad * `CL` - Chile * `CN` - China * `CX` - Christmas Island * `CC` - Cocos (Keeling) Islands * `CO` - Colombia * `KM` - Comoros * `CG` - Congo * `CD` - Congo (the Democratic Republic of the) * `CK` - Cook Islands * `CR` - Costa Rica * `CI` - Côte d'Ivoire * `HR` - Croatia * `CU` - Cuba * `CW` - Curaçao * `CY` - Cyprus * `CZ` - Czechia * `DK` - Denmark * `DJ` - Djibouti * `DM` - Dominica * `DO` - Dominican Republic * `EC` - Ecuador * `EG` - Egypt * `SV` - El Salvador * `GQ` - Equatorial Guinea * `ER` - Eritrea * `EE` - Estonia * `SZ` - Eswatini * `ET` - Ethiopia * `FK` - Falkland Islands (Malvinas) * `FO` - Faroe Islands * `FJ` - Fiji * `FI` - Finland * `FR` - France * `GF` - French Guiana * `PF` - French Polynesia * `TF` - French Southern Territories * `GA` - Gabon * `GM` - Gambia * `GE` - Georgia * `DE` - Germany * `GH` - Ghana * `GI` - Gibraltar * `GR` - Greece * `GL` - Greenland * `GD` - Grenada * `GP` - Guadeloupe * `GU` - Guam * `GT` - Guatemala * `GG` - Guernsey * `GN` - Guinea * `GW` - Guinea-Bissau * `GY` - Guyana * `HT` - Haiti * `HM` - Heard Island and McDonald Islands * `VA` - Holy See * `HN` - Honduras * `HK` - Hong Kong * `HU` - Hungary * `IS` - Iceland * `IN` - India * `ID` - Indonesia * `IR` - Iran * `IQ` - Iraq * `IE` - Ireland * `IM` - Isle of Man * `IL` - Israel * `IT` - Italy * `JM` - Jamaica * `JP` - Japan * `JE` - Jersey * `JO` - Jordan * `KZ` - Kazakhstan * `KE` - Kenya * `KI` - Kiribati * `KW` - Kuwait * `KG` - Kyrgyzstan * `LA` - Laos * `LV` - Latvia * `LB` - Lebanon * `LS` - Lesotho * `LR` - Liberia * `LY` - Libya * `LI` - Liechtenstein * `LT` - Lithuania * `LU` - Luxembourg * `MO` - Macao * `MG` - Madagascar * `MW` - Malawi * `MY` - Malaysia * `MV` - Maldives * `ML` - Mali * `MT` - Malta * `MH` - Marshall Islands * `MQ` - Martinique * `MR` - Mauritania * `MU` - Mauritius * `YT` - Mayotte * `MX` - Mexico * `FM` - Micronesia (Federated States of) * `MD` - Moldova * `MC` - Monaco * `MN` - Mongolia * `ME` - Montenegro * `MS` - Montserrat * `MA` - Morocco * `MZ` - Mozambique * `MM` - Myanmar * `NA` - Namibia * `NR` - Nauru * `NP` - Nepal * `NL` - Netherlands * `NC` - New Caledonia * `NZ` - New Zealand * `NI` - Nicaragua * `NE` - Niger * `NG` - Nigeria * `NU` - Niue * `NF` - Norfolk Island * `KP` - North Korea * `MK` - North Macedonia * `MP` - Northern Mariana Islands * `NO` - Norway * `OM` - Oman * `PK` - Pakistan * `PW` - Palau * `PS` - Palestine, State of * `PA` - Panama * `PG` - Papua New Guinea * `PY` - Paraguay * `PE` - Peru * `PH` - Philippines * `PN` - Pitcairn * `PL` - Poland * `PT` - Portugal * `PR` - Puerto Rico * `QA` - Qatar * `RE` - Réunion * `RO` - Romania * `RU` - Russia * `RW` - Rwanda * `BL` - Saint Barthélemy * `SH` - Saint Helena, Ascension and Tristan da Cunha * `KN` - Saint Kitts and Nevis * `LC` - Saint Lucia * `MF` - Saint Martin (French part) * `PM` - Saint Pierre and Miquelon * `VC` - Saint Vincent and the Grenadines * `WS` - Samoa * `SM` - San Marino * `ST` - Sao Tome and Principe * `SA` - Saudi Arabia * `SN` - Senegal * `RS` - Serbia * `SC` - Seychelles * `SL` - Sierra Leone * `SG` - Singapore * `SX` - Sint Maarten (Dutch part) * `SK` - Slovakia * `SI` - Slovenia * `SB` - Solomon Islands * `SO` - Somalia * `ZA` - South Africa * `GS` - South Georgia and the South Sandwich Islands * `KR` - South Korea * `SS` - South Sudan * `ES` - Spain * `LK` - Sri Lanka * `SD` - Sudan * `SR` - Suriname * `SJ` - Svalbard and Jan Mayen * `SE` - Sweden * `CH` - Switzerland * `SY` - Syria * `TW` - Taiwan * `TJ` - Tajikistan * `TZ` - Tanzania * `TH` - Thailand * `TL` - Timor-Leste * `TG` - Togo * `TK` - Tokelau * `TO` - Tonga * `TT` - Trinidad and Tobago * `TN` - Tunisia * `TR` - Turkey * `TM` - Turkmenistan * `TC` - Turks and Caicos Islands * `TV` - Tuvalu * `UG` - Uganda * `UA` - Ukraine * `AE` - United Arab Emirates * `GB` - United Kingdom * `UM` - United States Minor Outlying Islands * `US` - United States of America * `UY` - Uruguay * `UZ` - Uzbekistan * `VU` - Vanuatu * `VE` - Venezuela * `VN` - Vietnam * `VG` - Virgin Islands (British) * `VI` - Virgin Islands (U.S.) * `WF` - Wallis and Futuna * `EH` - Western Sahara * `YE` - Yemen * `ZM` - Zambia * `ZW` - Zimbabwe */
    @field:JsonProperty("country")
    val country: CountryEnum? = null,

    /* The address type.  * `BILLING` - BILLING * `SHIPPING` - SHIPPING */
    @field:JsonProperty("address_type")
    val addressType: AddressTypeEnum? = null,

    /* This is the datetime that this object was last updated by Merge */
    @field:JsonProperty("modified_at")
    val modifiedAt: java.time.OffsetDateTime? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("street_1")
        val street1: JsonNode?,

        @field:JsonProperty("street_2")
        val street2: JsonNode?,

        @field:JsonProperty("city")
        val city: JsonNode?,

        @field:JsonProperty("state")
        val state: JsonNode?,

        @field:JsonProperty("postal_code")
        val postalCode: JsonNode?,

        @field:JsonProperty("country")
        val country: JsonNode?,

        @field:JsonProperty("address_type")
        val addressType: JsonNode?,

        @field:JsonProperty("modified_at")
        val modifiedAt: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Address.Expanded): Address {
            return Address(
                street1 = ApiClient.jsonConvertSafe(expanded.street1),
                street2 = ApiClient.jsonConvertSafe(expanded.street2),
                city = ApiClient.jsonConvertSafe(expanded.city),
                state = ApiClient.jsonConvertSafe(expanded.state),
                postalCode = ApiClient.jsonConvertSafe(expanded.postalCode),
                country = ApiClient.jsonConvertSafe(expanded.country),
                addressType = ApiClient.jsonConvertSafe(expanded.addressType),
                modifiedAt = ApiClient.jsonConvertSafe(expanded.modifiedAt)
            )
        }
    }
}

