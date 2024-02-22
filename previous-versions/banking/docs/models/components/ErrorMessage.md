# ErrorMessage


## Fields

| Field                                                                                                                                                        | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `canBeRetried`                                                                                                                                               | *Optional<? extends String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                           | `True` if the error occurred transiently and can be retried.                                                                                                 |
| `correlationId`                                                                                                                                              | *Optional<? extends String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                           | Unique identifier used to propagate to all downstream services and determine the source of the error.                                                        |
| `detailedErrorCode`                                                                                                                                          | *Optional<? extends Long>*                                                                                                                                   | :heavy_minus_sign:                                                                                                                                           | Machine readable error code used to automate processes based on the code returned.                                                                           |
| `error`                                                                                                                                                      | *Optional<? extends String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                           | A brief description of the error.                                                                                                                            |
| `service`                                                                                                                                                    | *Optional<? extends String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                           | Codat's service the returned the error.                                                                                                                      |
| `statusCode`                                                                                                                                                 | *Optional<? extends Long>*                                                                                                                                   | :heavy_minus_sign:                                                                                                                                           | The HTTP status code returned by the error.                                                                                                                  |
| `validation`                                                                                                                                                 | [JsonNullable<? extends io.codat.banking.models.components.ErrorValidation>](../../models/components/ErrorValidation.md)                                     | :heavy_minus_sign:                                                                                                                                           | A human-readable object describing validation decisions Codat has made. If an operation has failed because of validation errors, they will be detailed here. |