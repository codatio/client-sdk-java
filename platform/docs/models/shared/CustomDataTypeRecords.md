# CustomDataTypeRecords

Resulting records pulled from the source platform for a specific custom data type.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `pageNumber`                                                              | *Optional<Long>*                                                          | :heavy_minus_sign:                                                        | Current page number.                                                      |
| `pageSize`                                                                | *Optional<Long>*                                                          | :heavy_minus_sign:                                                        | Number of items to return in results array.                               |
| `results`                                                                 | List<[CustomDataTypeRecord](../../models/shared/CustomDataTypeRecord.md)> | :heavy_minus_sign:                                                        | N/A                                                                       |
| `totalResults`                                                            | *Optional<Long>*                                                          | :heavy_minus_sign:                                                        | Total number of items.                                                    |