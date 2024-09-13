# AccountBalance


## Fields

| Field                                           | Type                                            | Required                                        | Description                                     | Example                                         |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `available`                                     | *Optional<BigDecimal>*                          | :heavy_minus_sign:                              | The account's current balance                   |                                                 |
| `currency`                                      | *Optional<String>*                              | :heavy_minus_sign:                              | The currency of the account                     | GBP                                             |
| `pending`                                       | *Optional<BigDecimal>*                          | :heavy_minus_sign:                              | Funds that are not yet available in the balance |                                                 |
| `reserved`                                      | *Optional<Object>*                              | :heavy_minus_sign:                              | Funds reserved as holdings                      |                                                 |