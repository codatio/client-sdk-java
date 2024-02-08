# SupplementalDataSourceConfiguration

The client's defined name for the object.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `dataSource`                                                                        | *Optional<? extends String>*                                                        | :heavy_minus_sign:                                                                  | The underlying endpoint of the source system which the configuration is targeting.  |
| `pullData`                                                                          | Map<String, *String*>                                                               | :heavy_minus_sign:                                                                  | The additional properties that are required when pulling records.                   |
| `pushData`                                                                          | Map<String, *String*>                                                               | :heavy_minus_sign:                                                                  | The additional properties that are required to create and/or update records.        |