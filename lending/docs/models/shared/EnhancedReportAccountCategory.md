# EnhancedReportAccountCategory


## Fields

| Field                                                                                                                                    | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `levels`                                                                                                                                 | List<[io.codat.lending.models.shared.AccountCategoryLevel](../../models/shared/AccountCategoryLevel.md)>                                 | :heavy_minus_sign:                                                                                                                       | N/A                                                                                                                                      |
| `status`                                                                                                                                 | *Optional<? extends String>*                                                                                                             | :heavy_minus_sign:                                                                                                                       | Returns a status of "Suggested" or "Confirmed". If an account has a confirmed category, it will replace any suggested category returned. |