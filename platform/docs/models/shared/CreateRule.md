# CreateRule

Create a message that notifies a URL of an event based on its given type or condition.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `companyId`                                               | *Optional\<String>*                                       | :heavy_minus_sign:                                        | Unique identifier for your SMB in Codat.                  | 8a210b68-6988-11ed-a1eb-0242ac120002                      |
| `notifiers`                                               | [WebhookNotifier](../../models/shared/WebhookNotifier.md) | :heavy_check_mark:                                        | N/A                                                       |                                                           |
| `type`                                                    | *String*                                                  | :heavy_check_mark:                                        | The type of webhook.                                      |                                                           |