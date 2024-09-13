# ReportLine


## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `accountId`                                                                    | *JsonNullable<String>*                                                         | :heavy_minus_sign:                                                             | Identifier for the account, unique for the company in the accounting software. |
| `items`                                                                        | List<[ReportLine](../../models/components/ReportLine.md)>                      | :heavy_minus_sign:                                                             | An array of ReportLine items.                                                  |
| `name`                                                                         | *JsonNullable<String>*                                                         | :heavy_minus_sign:                                                             | Name of the report line item.                                                  |
| `value`                                                                        | *BigDecimal*                                                                   | :heavy_check_mark:                                                             | Numerical value of the line item.                                              |