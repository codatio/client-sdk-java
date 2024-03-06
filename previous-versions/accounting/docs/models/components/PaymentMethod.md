# PaymentMethod

> View the coverage for payment methods in the <a className="external" href="https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=paymentMethods" target="_blank">Data coverage explorer</a>.

## Overview

A Payment Method represents the payment method(s) used to pay a Bill. Payment Methods are referenced on [Bill Payments](https://docs.codat.io/accounting-api#/schemas/BillPayment) and [Payments](https://docs.codat.io/accounting-api#/schemas/Payment).


## Fields

| Field                                                                                                                           | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     | Example                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                            | *Optional<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                              | Unique identifier for the payment method.                                                                                       |                                                                                                                                 |
| `metadata`                                                                                                                      | [Optional<? extends io.codat.accounting.models.components.Metadata>](../../models/components/Metadata.md)                       | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             |                                                                                                                                 |
| `modifiedDate`                                                                                                                  | *Optional<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             | 2022-10-23 00:00:00 +0000 UTC                                                                                                   |
| `name`                                                                                                                          | *JsonNullable<? extends String>*                                                                                                | :heavy_minus_sign:                                                                                                              | Name of the payment method.                                                                                                     |                                                                                                                                 |
| `sourceModifiedDate`                                                                                                            | *Optional<? extends String>*                                                                                                    | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             | 2022-10-23 00:00:00 +0000 UTC                                                                                                   |
| `status`                                                                                                                        | [Optional<? extends io.codat.accounting.models.components.PaymentMethodStatus>](../../models/components/PaymentMethodStatus.md) | :heavy_minus_sign:                                                                                                              | Status of the Payment Method.                                                                                                   |                                                                                                                                 |
| `type`                                                                                                                          | [Optional<? extends io.codat.accounting.models.components.PaymentMethodType>](../../models/components/PaymentMethodType.md)     | :heavy_minus_sign:                                                                                                              | Method of payment.                                                                                                              |                                                                                                                                 |