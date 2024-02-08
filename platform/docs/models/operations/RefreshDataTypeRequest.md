# RefreshDataTypeRequest


## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                | Example                                                                                    |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `companyId`                                                                                | *String*                                                                                   | :heavy_check_mark:                                                                         | Unique identifier for a company.                                                           | 8a210b68-6988-11ed-a1eb-0242ac120002                                                       |
| `connectionId`                                                                             | *Optional<? extends String>*                                                               | :heavy_minus_sign:                                                                         | Optionally, provide a data connection id to only queue pull operations on that connection. |                                                                                            |
| `dataType`                                                                                 | [io.codat.platform.models.shared.SchemaDataType](../../models/shared/SchemaDataType.md)    | :heavy_check_mark:                                                                         | The key of a Codat data type                                                               | invoices                                                                                   |