# BankStatementUploadConfiguration

Configuration settings for uploading banking data to Codat


## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `accountId`                                                  | *Optional\<String>*                                          | :heavy_minus_sign:                                           | The ID of the account in the third-party platform            |
| `providerId`                                                 | *Optional\<String>*                                          | :heavy_minus_sign:                                           | TrueLayer provider ID (only required if source is TrueLayer) |
| `source`                                                     | [Optional\<Source>](../../models/shared/Source.md)           | :heavy_minus_sign:                                           | The source of the banking data that determines its format    |