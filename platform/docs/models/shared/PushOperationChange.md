# PushOperationChange


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `attachmentId`                                                        | *JsonNullable<String>*                                                | :heavy_minus_sign:                                                    | Unique identifier for the attachment created otherwise null.          |
| `recordRef`                                                           | [Optional<PushOperationRef>](../../models/shared/PushOperationRef.md) | :heavy_minus_sign:                                                    | N/A                                                                   |
| `type`                                                                | [Optional<PushChangeType>](../../models/shared/PushChangeType.md)     | :heavy_minus_sign:                                                    | Type of change being applied to record in third party platform.       |