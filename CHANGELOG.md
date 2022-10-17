# Version 2.0.2

## Date: 2022-10-10

- Various changes to models, i.e. adding parentCategory to TrackingCategory model
- In particular, SyncStatus model's ...SyncStart datetimes are now nullable
- Some endpoints such as CRM Opportunities API have PATCH endpoints allowing for modification, this is a newer pattern please ask your customer success representative for details.
- Fix missing @JsonIgnoreProperties(ignoreUnknown = true) meaning models were not forwards compatible
- Fix a misconfigured Kotlin plugin that did not recognized dynamic enum values

# Version 2.0.1

## Date: 2022-08-22

- Changed UNKNOWN_DEFAULT_OPEN_API to MERGE_NONSTANDARD_VALUE to adhere to prior SDK behavior
- Added @JvmStatic to the MODEL.normalize methods, allowing them to be called like static methods instead of going through the kotlin companion object

# Version 2.0.0

## Date: 2022-08-16

- Initial commit of the Merge Kotlin SDK 
  - /merge-api/merge-sdk-kotlin in github
  - dev.merge.client in java package naming
- Includes all Merge categories in one package
  - Accounting
  - ATS (applicant Tracking Systems)
  - CRM (Customer Relationship Management)
  - HRIS (Human Resource Information Systems)
  - Ticketing
- First Kotlin language SDK so it differs in its dependencies from the preceding merge-hris-java, merge-ats-java, etc.
  - ktor for client library
  - jackson for serialization library
  - data classes for request and response models (request models did not exist at all in prior Merge SDK's)
- Preliminary support for the Merge API `expand` parameter, which changes some response values
  - note that due to the dynamic nature of the response, it results in jackson `JsonNode` property values that can be further deserialized (see README). 
