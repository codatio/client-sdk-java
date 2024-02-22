# BankFeedAccountMappingResponse

The result from POSTing a Bank Account mapping.


## Fields

| Field                                  | Type                                   | Required                               | Description                            |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `error`                                | *JsonNullable<? extends String>*       | :heavy_minus_sign:                     | Error returned during the post request |
| `status`                               | *JsonNullable<? extends String>*       | :heavy_minus_sign:                     | Status of the POST request.            |
| `sourceAccountId`                      | *Optional<? extends String>*           | :heavy_minus_sign:                     | Unique ID for the source account.      |
| `targetAccountId`                      | *JsonNullable<? extends String>*       | :heavy_minus_sign:                     | Unique ID for the target account.      |