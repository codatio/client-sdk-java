# ClientRateLimitReachedWebhook

Webhook request body for a client that has reached their rate limit.


## Fields

| Field                                                                                                                                            | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `alertId`                                                                                                                                        | *Optional<? extends String>*                                                                                                                     | :heavy_minus_sign:                                                                                                                               | Unique identifier of the webhook event.                                                                                                          |
| `clientId`                                                                                                                                       | *Optional<? extends String>*                                                                                                                     | :heavy_minus_sign:                                                                                                                               | Unique identifier for your client in Codat.                                                                                                      |
| `clientName`                                                                                                                                     | *Optional<? extends String>*                                                                                                                     | :heavy_minus_sign:                                                                                                                               | Name of your client in Codat.                                                                                                                    |
| `data`                                                                                                                                           | [Optional<? extends io.codat.lending.models.shared.ClientRateLimitReachedWebhookData>](../../models/shared/ClientRateLimitReachedWebhookData.md) | :heavy_minus_sign:                                                                                                                               | N/A                                                                                                                                              |
| `message`                                                                                                                                        | *Optional<? extends String>*                                                                                                                     | :heavy_minus_sign:                                                                                                                               | A human readable message about the webhook.                                                                                                      |
| `ruleId`                                                                                                                                         | *Optional<? extends String>*                                                                                                                     | :heavy_minus_sign:                                                                                                                               | Unique identifier for the rule.                                                                                                                  |
| `ruleType`                                                                                                                                       | *Optional<? extends String>*                                                                                                                     | :heavy_minus_sign:                                                                                                                               | The type of rule.                                                                                                                                |