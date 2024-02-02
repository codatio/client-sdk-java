# ProductInventory

Information about the total inventory as well as the locations inventory is in.


## Fields

| Field                                                                                                            | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `locations`                                                                                                      | List<[io.codat.lending.models.shared.ProductInventoryLocation](../../models/shared/ProductInventoryLocation.md)> | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |
| `totalQuantity`                                                                                                  | *JsonNullable<? extends Double>*                                                                                 | :heavy_minus_sign:                                                                                               | The total quantity of stock remaining across locations.                                                          |