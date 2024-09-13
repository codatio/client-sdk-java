# CompanyInformation

Information about the company from the underlying accounting software.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `baseCurrency`                                                      | *Optional<String>*                                                  | :heavy_minus_sign:                                                  | Currency set in the accounting software of the linked company.      |
| `companyName`                                                       | *Optional<String>*                                                  | :heavy_minus_sign:                                                  | Name of the linked company.                                         |
| `multicurrencyEnabled`                                              | *JsonNullable<Boolean>*                                             | :heavy_minus_sign:                                                  | Boolean showing if the organisation has multicurrency enabled       |
| `planType`                                                          | *JsonNullable<String>*                                              | :heavy_minus_sign:                                                  | Accounting software subscription type such as Trial, Demo, Standard |