# SchemaTransaction


## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `integrationType`                                                                              | [JsonNullable\<IntegrationType>](../../models/components/IntegrationType.md)                   | :heavy_minus_sign:                                                                             | Type of transaction that has been processed e.g. Expense or Bank Feed.                         | expenses                                                                                       |
| `message`                                                                                      | *JsonNullable\<String>*                                                                        | :heavy_minus_sign:                                                                             | Metadata such as validation errors or the resulting record created in the accounting software. |                                                                                                |
| `status`                                                                                       | [JsonNullable\<TransactionStatus>](../../models/components/TransactionStatus.md)               | :heavy_minus_sign:                                                                             | Status of the transaction.                                                                     | Completed                                                                                      |
| `transactionId`                                                                                | *JsonNullable\<String>*                                                                        | :heavy_minus_sign:                                                                             | Your unique idenfier of the transaction.                                                       | aa02271d-ed5f-47f5-be76-778d5905225a                                                           |