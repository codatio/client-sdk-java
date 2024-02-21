# BankStatementUploadConfiguration

Settings for uploading banking data to Codat


## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `accountId`                                                                                | *Optional<? extends String>*                                                               | :heavy_minus_sign:                                                                         | The ID of the account in the 3rd party platform                                            |
| `providerId`                                                                               | *Optional<? extends String>*                                                               | :heavy_minus_sign:                                                                         | The truelayer provider ID, required if source is truelayer, ignored otherwise              |
| `source`                                                                                   | [Optional<? extends io.codat.lending.models.shared.Source>](../../models/shared/Source.md) | :heavy_minus_sign:                                                                         | The source or format of the banking data e.g. Codat                                        |