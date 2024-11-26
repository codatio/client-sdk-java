# SourceAccountBatchCreateResponse

The account ID and source account object of the successfully created source account.


## Fields

| Field                                                                                                                                                                                                                                   | Type                                                                                                                                                                                                                                    | Required                                                                                                                                                                                                                                | Description                                                                                                                                                                                                                             | Example                                                                                                                                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `result`                                                                                                                                                                                                                                | [Optional\<SourceAccount>](../../models/components/SourceAccount.md)                                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                                                                      | The target bank account in a supported accounting software for ingestion into a bank feed.                                                                                                                                              | {<br/>"id": "acc-002",<br/>"accountName": "account-081",<br/>"sortCode": "123456",<br/>"accountType": "Credit",<br/>"accountNumber": "12345670",<br/>"currency": "GBP",<br/>"balance": 99.99,<br/>"modifiedDate": "2023-01-09T14:14:14.1057478Z",<br/>"status": "pending"<br/>} |
| `sourceAccountId`                                                                                                                                                                                                                       | *Optional\<String>*                                                                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                                      | Unique ID for the source account.                                                                                                                                                                                                       | 12345                                                                                                                                                                                                                                   |