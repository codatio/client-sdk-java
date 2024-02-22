# GetAccountResponse


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Example                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `account`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | [JsonNullable<? extends io.codat.banking.models.components.Account>](../../models/components/Account.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Success                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | {"results":[{"id":"1703194f-7805-4da8-bac0-2ba5da4a4216","name":"Business Current Account","informalName":"Codat","holder":"Codat Ltd","type":"Debit","balance":{"available":-459987.97,"current":-459964.9,"limit":5000},"identifiers":{"type":"Depository","subtype":"checking","number":"46762629","bankCode":009911,"iban":"GB29 LOYD 4773 2346 7626 29","bic":"LOYDGB21006","maskedAccountNumber":"LOYDGB21006"},"currency":"GBP","institution":{"id":"lloyds-bank","name":"Lloyds Bank"},"modifiedDate":"2022-05-23T16:32:50Z","sourceModifiedDate":"2021-08-14T05:04:12"}]} |
| `contentType`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | HTTP response content type for this operation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| `errorMessage`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | [Optional<? extends io.codat.banking.models.components.ErrorMessage>](../../models/components/ErrorMessage.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Your API request was not properly authorized.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| `statusCode`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | *int*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | HTTP response status code for this operation                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| `rawResponse`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | [HttpResponse<InputStream>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html)                                                                                                                                                                                                                                                                                                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Raw HTTP response; suitable for custom response parsing                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |