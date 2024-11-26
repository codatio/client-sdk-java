# Result


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             | Example                                                                 |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `error`                                                                 | *Optional\<String>*                                                     | :heavy_minus_sign:                                                      | The error description for the attempted creation of the source account. | A bank account already exists with the same Id                          |
| `statusCode`                                                            | *Optional\<String>*                                                     | :heavy_minus_sign:                                                      | The error status code for the attempted creation of the source account. | 409                                                                     |