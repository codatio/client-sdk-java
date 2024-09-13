# BillLineItem


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `accountRef`                                                | [BillAccountRef](../../models/components/BillAccountRef.md) | :heavy_check_mark:                                          | Reference to the account to which the line item is linked.  |
| `description`                                               | *JsonNullable<String>*                                      | :heavy_minus_sign:                                          | Friendly name of the goods or services received.            |
| `quantity`                                                  | *BigDecimal*                                                | :heavy_check_mark:                                          | Number of units of goods or services received.              |
| `taxAmount`                                                 | *Optional<BigDecimal>*                                      | :heavy_minus_sign:                                          | Amount of tax applied to the line item.                     |
| `taxRateRef`                                                | [BillTaxRateRef](../../models/components/BillTaxRateRef.md) | :heavy_check_mark:                                          | Reference to the tax rate to which the line item is linked. |
| `totalAmount`                                               | *JsonNullable<BigDecimal>*                                  | :heavy_minus_sign:                                          | Total amount of the line, including tax.                    |
| `unitAmount`                                                | *BigDecimal*                                                | :heavy_check_mark:                                          | Unit price of the goods or service.                         |