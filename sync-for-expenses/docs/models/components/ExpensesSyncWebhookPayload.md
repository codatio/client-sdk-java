# ExpensesSyncWebhookPayload


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `referenceCompany`                                                         | [Optional\<CompanyReference>](../../models/components/CompanyReference.md) | :heavy_minus_sign:                                                         | N/A                                                                        |
| `syncId`                                                                   | *Optional\<String>*                                                        | :heavy_minus_sign:                                                         | Unique identifier of the sync.                                             |
| `transactions`                                                             | List\<[Transaction](../../models/components/Transaction.md)>               | :heavy_minus_sign:                                                         | N/A                                                                        |