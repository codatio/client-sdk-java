# CreateItemRequest


## Fields

| Field                                                                                                 | Type                                                                                                  | Required                                                                                              | Description                                                                                           | Example                                                                                               |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `item`                                                                                                | [JsonNullable<? extends io.codat.accounting.models.components.Item>](../../models/components/Item.md) | :heavy_minus_sign:                                                                                    | N/A                                                                                                   |                                                                                                       |
| `companyId`                                                                                           | *String*                                                                                              | :heavy_check_mark:                                                                                    | Unique identifier for a company.                                                                      | 8a210b68-6988-11ed-a1eb-0242ac120002                                                                  |
| `connectionId`                                                                                        | *String*                                                                                              | :heavy_check_mark:                                                                                    | Unique identifier for a connection.                                                                   | 2e9d2c44-f675-40ba-8049-353bfcb5e171                                                                  |
| `timeoutInMinutes`                                                                                    | *Optional<? extends Integer>*                                                                         | :heavy_minus_sign:                                                                                    | Time limit for the push operation to complete before it is timed out.                                 |                                                                                                       |