# AccountBalance


## Fields

| Field                                           | Type                                            | Required                                        | Description                                     | Example                                         |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `available`                                     | *Optional<? extends Double>*                    | :heavy_minus_sign:                              | The account's current balance                   |                                                 |
| `currency`                                      | *Optional<? extends String>*                    | :heavy_minus_sign:                              | The currency of the account                     | GBP                                             |
| `pending`                                       | *Optional<? extends Double>*                    | :heavy_minus_sign:                              | Funds that are not yet available in the balance |                                                 |
| `reserved`                                      | *Optional<? extends java.lang.Object>*          | :heavy_minus_sign:                              | Funds reserved as holdings                      |                                                 |