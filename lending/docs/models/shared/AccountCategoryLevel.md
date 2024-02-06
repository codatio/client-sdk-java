# AccountCategoryLevel

An object containing an ordered list of account category levels.


## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `confidence`                                                                                 | *Optional<? extends Double>*                                                                 | :heavy_minus_sign:                                                                           | Confidence level of the category. This will only be populated where `status` is `Suggested`. |
| `levelName`                                                                                  | *Optional<? extends String>*                                                                 | :heavy_minus_sign:                                                                           | Account category name.                                                                       |