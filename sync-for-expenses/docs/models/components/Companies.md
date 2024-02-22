# Companies


## Fields

| Field                                                                                                                       | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 | Example                                                                                                                     |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `links`                                                                                                                     | [io.codat.sync.expenses.models.components.Links](../../models/components/Links.md)                                          | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         | {"self":{"href":"/companies/{id}/data/{dataType}"},"current":{"href":"/companies/{id}/data/{dataType}?page=1&pageSize=10"}} |
| `pageNumber`                                                                                                                | *long*                                                                                                                      | :heavy_check_mark:                                                                                                          | Current page number.                                                                                                        |                                                                                                                             |
| `pageSize`                                                                                                                  | *long*                                                                                                                      | :heavy_check_mark:                                                                                                          | Number of items to return in results array.                                                                                 |                                                                                                                             |
| `results`                                                                                                                   | List<[io.codat.sync.expenses.models.components.Company](../../models/components/Company.md)>                                | :heavy_minus_sign:                                                                                                          | N/A                                                                                                                         |                                                                                                                             |
| `totalResults`                                                                                                              | *long*                                                                                                                      | :heavy_check_mark:                                                                                                          | Total number of items.                                                                                                      |                                                                                                                             |