# PropertieTracking

Categories, and a project and customer, against which the item is tracked.


## Fields

| Field                                                                                                                               | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `categoryRefs`                                                                                                                      | List<[io.codat.accounting.models.components.TrackingCategoryRef](../../models/components/TrackingCategoryRef.md)>                   | :heavy_check_mark:                                                                                                                  | N/A                                                                                                                                 |
| `customerRef`                                                                                                                       | [Optional<? extends io.codat.accounting.models.components.AccountingCustomerRef>](../../models/components/AccountingCustomerRef.md) | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |
| `isBilledTo`                                                                                                                        | [io.codat.accounting.models.components.BilledToType](../../models/components/BilledToType.md)                                       | :heavy_check_mark:                                                                                                                  | Defines if the invoice or credit note is billed/rebilled to a project or customer.                                                  |
| `isRebilledTo`                                                                                                                      | [io.codat.accounting.models.components.BilledToType](../../models/components/BilledToType.md)                                       | :heavy_check_mark:                                                                                                                  | Defines if the invoice or credit note is billed/rebilled to a project or customer.                                                  |
| `projectRef`                                                                                                                        | [Optional<? extends io.codat.accounting.models.components.ProjectRef>](../../models/components/ProjectRef.md)                       | :heavy_minus_sign:                                                                                                                  | N/A                                                                                                                                 |