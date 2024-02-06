# DataIntegrityByAmount


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                                                        | Type                                                                                                                                                                                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                                                                                                                                                                                  | Example                                                                                                                                                                                                                                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `currency`                                                                                                                                                                                                                                                                                                                                                                                   | *Optional<? extends String>*                                                                                                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | The currency data type in Codat is the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code, e.g. _GBP_.<br/><br/>## Unknown currencies<br/><br/>In line with the ISO 4217 specification, the code _XXX_ is used when the data source does not return a currency for a transaction. <br/><br/>There are only a very small number of edge cases where this currency code is returned by the Codat system. | GBP                                                                                                                                                                                                                                                                                                                                                                                          |
| `matchPercentage`                                                                                                                                                                                                                                                                                                                                                                            | *Optional<? extends Double>*                                                                                                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | The percentage of the absolute value of transactions of the type specified in the route which have a match.                                                                                                                                                                                                                                                                                  |                                                                                                                                                                                                                                                                                                                                                                                              |
| `matched`                                                                                                                                                                                                                                                                                                                                                                                    | *Optional<? extends Double>*                                                                                                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | The sum of the absolute value of transactions of the type specified in the route which have a match.                                                                                                                                                                                                                                                                                         |                                                                                                                                                                                                                                                                                                                                                                                              |
| `total`                                                                                                                                                                                                                                                                                                                                                                                      | *Optional<? extends Double>*                                                                                                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | The total of unmatched and matched.                                                                                                                                                                                                                                                                                                                                                          |                                                                                                                                                                                                                                                                                                                                                                                              |
| `unmatched`                                                                                                                                                                                                                                                                                                                                                                                  | *Optional<? extends Double>*                                                                                                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                           | The sum of the absolute value of transactions of the type specified in the route which don't have a match.                                                                                                                                                                                                                                                                                   |                                                                                                                                                                                                                                                                                                                                                                                              |