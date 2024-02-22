# Supplier

﻿> View the coverage for suppliers in the <a className="external" href="https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=suppliers" target="_blank">Data coverage explorer</a>.

## Overview

Suppliers are people or organizations that provide something, such as a product or service. Use **Suppliers** endpoints to retrieve supplier data for a company. 

Suppliers' data links to accounts payable [bills](https://docs.codat.io/sync-for-payables-api#/schemas/Bill).
 


## Fields

| Field                                                                                                            | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      | Example                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `addresses`                                                                                                      | List<[io.codat.sync.payables.models.components.AccountingAddress](../../models/components/AccountingAddress.md)> | :heavy_minus_sign:                                                                                               | An array of Addresses.                                                                                           |                                                                                                                  |
| `contactName`                                                                                                    | *JsonNullable<? extends String>*                                                                                 | :heavy_minus_sign:                                                                                               | Name of the main contact for the supplier.                                                                       |                                                                                                                  |
| `emailAddress`                                                                                                   | *JsonNullable<? extends String>*                                                                                 | :heavy_minus_sign:                                                                                               | Email address that the supplier may be contacted on.                                                             |                                                                                                                  |
| `id`                                                                                                             | *Optional<? extends String>*                                                                                     | :heavy_minus_sign:                                                                                               | Identifier for the supplier, unique to the company in the accounting platform.                                   |                                                                                                                  |
| `phone`                                                                                                          | *JsonNullable<? extends String>*                                                                                 | :heavy_minus_sign:                                                                                               | Phone number that the supplier may be contacted on.                                                              | +44 25691 154789                                                                                                 |
| `sourceModifiedDate`                                                                                             | *Optional<? extends String>*                                                                                     | :heavy_minus_sign:                                                                                               | N/A                                                                                                              | 2022-10-23 00:00:00 +0000 UTC                                                                                    |
| `status`                                                                                                         | [io.codat.sync.payables.models.components.SupplierStatus](../../models/components/SupplierStatus.md)             | :heavy_check_mark:                                                                                               | Status of the supplier.                                                                                          |                                                                                                                  |
| `supplierName`                                                                                                   | *JsonNullable<? extends String>*                                                                                 | :heavy_minus_sign:                                                                                               | Name of the supplier as recorded in the accounting system, typically the company name.                           |                                                                                                                  |