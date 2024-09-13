# AccountInfo


## Fields

| Field                                                                                                                                                                                                                                 | Type                                                                                                                                                                                                                                  | Required                                                                                                                                                                                                                              | Description                                                                                                                                                                                                                           | Example                                                                                                                                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `accountOpenDate`                                                                                                                                                                                                                     | *JsonNullable<String>*                                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                                    | In Codat's data model, dates are represented using the <a class="external" href="https://en.wikipedia.org/wiki/ISO_8601" target="_blank">ISO 8601 standard</a>. Date fields are formatted as strings; for example:<br/>```<br/>2020-10-08<br/>``` | 2022-10-23                                                                                                                                                                                                                            |
| `availableBalance`                                                                                                                                                                                                                    | *JsonNullable<BigDecimal>*                                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                                    | Balance of funds available for use. This includes pending activity.                                                                                                                                                                   |                                                                                                                                                                                                                                       |
| `description`                                                                                                                                                                                                                         | *JsonNullable<String>*                                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                                    | Description of the account.                                                                                                                                                                                                           |                                                                                                                                                                                                                                       |
| `nickname`                                                                                                                                                                                                                            | *JsonNullable<String>*                                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                                    | Name given to the account by the user. Used in UIs to assist in account selection.                                                                                                                                                    |                                                                                                                                                                                                                                       |