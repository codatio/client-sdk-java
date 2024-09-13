# PushFieldValidation


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `details`                                             | *String*                                              | :heavy_check_mark:                                    | Details on the validation issue.                      |
| `field`                                               | *Optional<String>*                                    | :heavy_minus_sign:                                    | Field name that resulted in the validation issue.     |
| `ref`                                                 | *JsonNullable<String>*                                | :heavy_minus_sign:                                    | Unique reference identifier for the validation issue. |