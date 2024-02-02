# GetAccountingCashFlowStatementRequest


## Fields

| Field                                             | Type                                              | Required                                          | Description                                       | Example                                           |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `companyId`                                       | *String*                                          | :heavy_check_mark:                                | Unique identifier for a company.                  | 8a210b68-6988-11ed-a1eb-0242ac120002              |
| `periodLength`                                    | *int*                                             | :heavy_check_mark:                                | Number of months defining the period of interest. | 4                                                 |
| `periodsToCompare`                                | *int*                                             | :heavy_check_mark:                                | Number of periods with `periodLength` to compare. | 20                                                |
| `startMonth`                                      | *Optional<? extends String>*                      | :heavy_minus_sign:                                | The month the report starts from.                 | 2022-10-23 00:00:00 +0000 UTC                     |