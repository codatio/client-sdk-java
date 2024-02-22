# SyncConnectionDeletedWebhook

A Sync for Commerce connection is deleted.


## Fields

| Field                                       | Type                                        | Required                                    | Description                                 | Example                                     |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| `alertId`                                   | *Optional<? extends String>*                | :heavy_minus_sign:                          | Unique identifier of the webhook event.     |                                             |
| `clientId`                                  | *Optional<? extends String>*                | :heavy_minus_sign:                          | Unique identifier for your client in Codat. |                                             |
| `clientName`                                | *Optional<? extends String>*                | :heavy_minus_sign:                          | Name of your client in Codat.               |                                             |
| `companyId`                                 | *Optional<? extends String>*                | :heavy_minus_sign:                          | Unique identifier for your SMB in Codat.    | 8a210b68-6988-11ed-a1eb-0242ac120002        |
| `message`                                   | *Optional<? extends String>*                | :heavy_minus_sign:                          | A human readable message about the webhook. |                                             |
| `ruleId`                                    | *Optional<? extends String>*                | :heavy_minus_sign:                          | Unique identifier for the rule.             |                                             |
| `ruleType`                                  | *Optional<? extends String>*                | :heavy_minus_sign:                          | The type of rule.                           |                                             |