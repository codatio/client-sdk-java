# TaxRateRef

Data types that reference a tax rate, for example invoice and bill line items, use a taxRateRef that includes the ID and name of the linked tax rate.

Found on:

- Bill line items
- Bill Credit Note line items
- Credit Note line items
- Direct incomes line items
- Invoice line items
- Items


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `effectiveTaxRate`                                             | *Optional\<BigDecimal>*                                        | :heavy_minus_sign:                                             | Applicable tax rate.                                           |
| `id`                                                           | *Optional\<String>*                                            | :heavy_minus_sign:                                             | Unique identifier for the tax rate in the accounting software. |
| `name`                                                         | *Optional\<String>*                                            | :heavy_minus_sign:                                             | Name of the tax rate in the accounting software.               |