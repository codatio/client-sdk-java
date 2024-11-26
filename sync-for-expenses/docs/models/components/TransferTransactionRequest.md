# TransferTransactionRequest


## Fields

| Field                                             | Type                                              | Required                                          | Description                                       | Example                                           |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `date`                                            | *String*                                          | :heavy_check_mark:                                | N/A                                               | 2022-10-23 00:00:00 +0000 UTC                     |
| `description`                                     | *Optional\<String>*                               | :heavy_minus_sign:                                | Any private, company notes about the transaction. | Transfer from bank account Y to bank account Z    |
| `from`                                            | [From](../../models/components/From.md)           | :heavy_check_mark:                                | N/A                                               |                                                   |
| `to`                                              | [To](../../models/components/To.md)               | :heavy_check_mark:                                | N/A                                               |                                                   |