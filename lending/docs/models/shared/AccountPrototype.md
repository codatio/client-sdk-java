# AccountPrototype


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                                                        | Type                                                                                                                                                                                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                                                                                                                                                                                  | Example                                                                                                                                                                                                                                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `currency`                                                                                                                                                                                                                                                                                                                                                                                   | *Optional<? extends String>*                                                                                                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.<br/><br/>## Unknown currencies<br/><br/>In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. <br/><br/>There are only a very small number of edge cases where this currency code is returned by the Codat system. | GBP                                                                                                                                                                                                                                                                                                                                                                                          |
| `currentBalance`                                                                                                                                                                                                                                                                                                                                                                             | *JsonNullable<? extends Double>*                                                                                                                                                                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | Current balance in the account.                                                                                                                                                                                                                                                                                                                                                              | 0                                                                                                                                                                                                                                                                                                                                                                                            |
| `description`                                                                                                                                                                                                                                                                                                                                                                                | *JsonNullable<? extends String>*                                                                                                                                                                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | Description for the account.                                                                                                                                                                                                                                                                                                                                                                 | Invoices the business has issued but has not yet collected payment on.                                                                                                                                                                                                                                                                                                                       |
| `fullyQualifiedCategory`                                                                                                                                                                                                                                                                                                                                                                     | *JsonNullable<? extends String>*                                                                                                                                                                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | Full category of the account. 
| `fullyQualifiedName`                                                                                                                                                                                                                                                                                                                                                                         | *JsonNullable<? extends String>*                                                                                                                                                                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | Full name of the account, for example:<br/>- `Cash On Hand`<br/>- `Rents Held In Trust`<br/>- `Fixed Asset`                                                                                                                                                                                                                                                                                  | Cash On Hand                                                                                                                                                                                                                                                                                                                                                                                 |
| `isBankAccount`                                                                                                                                                                                                                                                                                                                                                                              | *Optional<? extends Boolean>*                                                                                                                                                                                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | Confirms whether the account is a bank account or not.                                                                                                                                                                                                                                                                                                                                       |                                                                                                                                                                                                                                                                                                                                                                                              |
| `name`                                                                                                                                                                                                                                                                                                                                                                                       | *JsonNullable<? extends String>*                                                                                                                                                                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | Name of the account.                                                                                                                                                                                                                                                                                                                                                                         | Accounts Receivable                                                                                                                                                                                                                                                                                                                                                                          |
| `nominalCode`                                                                                                                                                                                                                                                                                                                                                                                | *JsonNullable<? extends String>*                                                                                                                                                                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | Reference given to each nominal account for a business. It ensures money is allocated to the correct account. This code isn't a unique identifier in the Codat system.                                                                                                                                                                                                                       | 610                                                                                                                                                                                                                                                                                                                                                                                          |
| `status`                                                                                                                                                                                                                                                                                                                                                                                     | [Optional<? extends io.codat.lending.models.shared.AccountStatus>](../../models/shared/AccountStatus.md)                                                                                                                                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | Status of the account                                                                                                                                                                                                                                                                                                                                                                        | Active                                                                                                                                                                                                                                                                                                                                                                                       |
| `supplementalData`                                                                                                                                                                                                                                                                                                                                                                           | [Optional<? extends io.codat.lending.models.shared.SupplementalData>](../../models/shared/SupplementalData.md)                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | Supplemental data is additional data you can include in our standard data types. <br/><br/>It is referenced as a configured dynamic key value pair that is unique to the accounting platform. [Learn more](https://docs.codat.io/using-the-api/supplemental-data/overview) about supplemental data.                                                                                          |                                                                                                                                                                                                                                                                                                                                                                                              |
| `type`                                                                                                                                                                                                                                                                                                                                                                                       | [Optional<? extends io.codat.lending.models.shared.AccountType>](../../models/shared/AccountType.md)                                                                                                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | Type of account                                                                                                                                                                                                                                                                                                                                                                              | Asset                                                                                                                                                                                                                                                                                                                                                                                        |
| `validDatatypeLinks`                                                                                                                                                                                                                                                                                                                                                                         | List<[io.codat.lending.models.shared.ValidDataTypeLinks](../../models/shared/ValidDataTypeLinks.md)>                                                                                                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | The validDatatypeLinks can be used to determine whether an account can be correctly mapped to another object; for example, accounts with a `type` of `income` might only support being used on an Invoice and Direct Income. For more information, see [Valid Data Type Links](/lending-api#/schemas/ValidDataTypeLinks).                                                                    |                                                                                                                                                                                                                                                                                                                                                                                              |