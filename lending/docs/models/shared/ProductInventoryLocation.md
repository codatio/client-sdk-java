# ProductInventoryLocation


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `locationRef`                                                    | [Optional<LocationRef>](../../models/shared/LocationRef.md)      | :heavy_minus_sign:                                               | Reference to the geographic location where the order was placed. |
| `quantity`                                                       | *Optional<BigDecimal>*                                           | :heavy_minus_sign:                                               | The quantity of stock remaining at location.                     |