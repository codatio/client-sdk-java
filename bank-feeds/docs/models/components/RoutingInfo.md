# RoutingInfo

Routing information for the bank. This does not include account number.


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `bankCode`                                            | *JsonNullable<String>*                                | :heavy_minus_sign:                                    | The numeric identifier of the routing number          |
| `type`                                                | [JsonNullable<Type>](../../models/components/Type.md) | :heavy_minus_sign:                                    | The type of routing number.                           |