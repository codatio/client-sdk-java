# BankFeedAccountMappingResponse

The result from POSTing a Bank Account mapping.


## Fields

| Field                                  | Type                                   | Required                               | Description                            |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `error`                                | *JsonNullable<String>*                 | :heavy_minus_sign:                     | Error returned during the post request |
| `status`                               | *JsonNullable<String>*                 | :heavy_minus_sign:                     | Status of the POST request.            |
| `sourceAccountId`                      | *Optional<String>*                     | :heavy_minus_sign:                     | Unique ID for the source account.      |
| `targetAccountId`                      | *JsonNullable<String>*                 | :heavy_minus_sign:                     | Unique ID for the target account.      |