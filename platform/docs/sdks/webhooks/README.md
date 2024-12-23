# Webhooks
(*webhooks()*)

## Overview

Create and manage webhooks that listen to Codat's events.

### Available Operations

* [~~create~~](#create) - Create webhook (legacy) :warning: **Deprecated**
* [createConsumer](#createconsumer) - Create webhook consumer
* [deleteConsumer](#deleteconsumer) - Delete webhook consumer
* [~~get~~](#get) - Get webhook (legacy) :warning: **Deprecated**
* [~~list~~](#list) - List webhooks (legacy) :warning: **Deprecated**
* [listConsumers](#listconsumers) - List webhook consumers

## ~~create~~

Use the *Create webhooks (legacy)* endpoint to create a rule-based webhook for your client.

**Note:** This endpoint has been deprecated. Please use the [*Create webhook consumer*](https://docs.codat.io/platform-api#/operations/create-webhook-consumer) endpoint to create a webhook moving forward.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.CreateRuleResponse;
import io.codat.platform.models.shared.CreateRule;
import io.codat.platform.models.shared.Security;
import io.codat.platform.models.shared.WebhookNotifier;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        CreateRule req = CreateRule.builder()
                .notifiers(WebhookNotifier.builder()
                    .emails(List.of(
                        "info@client.com"))
                    .webhook("https://webhook.client.com")
                    .build())
                .type("<value>")
                .companyId("39b73b17-cc2e-429e-915d-71654e9dcd1e")
                .build();

        CreateRuleResponse res = sdk.webhooks().create()
                .request(req)
                .call();

        if (res.webhook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [CreateRule](../../models/shared/CreateRule.md) | :heavy_check_mark:                              | The request object to use for the request.      |

### Response

**[CreateRuleResponse](../../models/operations/CreateRuleResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorMessage   | 401, 402, 403, 429, 500, 503 | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## createConsumer

﻿Use the *Create webhook consumer* endpoint to create a new webhook consumer that will listen to messages we send you.

[Webhook consumer](https://docs.codat.io/platform-api#/schemas/WebhookConsumer) is an HTTP endpoint that you configure to subscribe to specific events. See our documentation for more details on [Codat's webhook service](https://docs.codat.io/using-the-api/webhooks/overview).

### Tips and traps
- The number of webhook consumers you can create is limited to 50. If you have reached the maximum number of consumers, use the [*Delete webhook consumer*](https://docs.codat.io/platform-api#/operations/delete-webhook-consumer) endpoint to delete an unused consumer first.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.CreateWebhookConsumerResponse;
import io.codat.platform.models.shared.Security;
import io.codat.platform.models.shared.WebhookConsumerPrototype;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        WebhookConsumerPrototype req = WebhookConsumerPrototype.builder()
                .build();

        CreateWebhookConsumerResponse res = sdk.webhooks().createConsumer()
                .request(req)
                .call();

        if (res.webhookConsumer().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [WebhookConsumerPrototype](../../models/shared/WebhookConsumerPrototype.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateWebhookConsumerResponse](../../models/operations/CreateWebhookConsumerResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 400, 401, 402, 403, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## deleteConsumer

﻿Use the *Delete webhook consumer* endpoint to delete an existing webhoook consumer, providing its valid `id` as a parameter.

[Webhook consumer](https://docs.codat.io/platform-api#/schemas/WebhookConsumer) is an HTTP endpoint that you configure to subscribe to specific events. See our documentation for more details on [Codat's webhook service](https://docs.codat.io/using-the-api/webhooks/overview).

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.DeleteWebhookConsumerRequest;
import io.codat.platform.models.operations.DeleteWebhookConsumerResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        DeleteWebhookConsumerRequest req = DeleteWebhookConsumerRequest.builder()
                .webhookId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

        DeleteWebhookConsumerResponse res = sdk.webhooks().deleteConsumer()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [DeleteWebhookConsumerRequest](../../models/operations/DeleteWebhookConsumerRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[DeleteWebhookConsumerResponse](../../models/operations/DeleteWebhookConsumerResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## ~~get~~

Use the *Get webhook (legacy)* endpoint to retrieve a specific webhook for your client.

**Note:** This endpoint has been deprecated. Please use the [*List webhook consumers*](https://docs.codat.io/platform-api#/operations/list-webhook-consumers) endpoint for listing webhooks moving forward.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.GetWebhookRequest;
import io.codat.platform.models.operations.GetWebhookResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetWebhookRequest req = GetWebhookRequest.builder()
                .ruleId("7318949f-c008-4936-a8ff-10d7ab563fa6")
                .build();

        GetWebhookResponse res = sdk.webhooks().get()
                .request(req)
                .call();

        if (res.webhook().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetWebhookRequest](../../models/operations/GetWebhookRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetWebhookResponse](../../models/operations/GetWebhookResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## ~~list~~

Use the *List webhooks (legacy)* endpoint to retrieve all existing rule-based webhooks for your client.

**Note:** This endpoint has been deprecated. Please use the [*List webhook consumers*](https://docs.codat.io/platform-api#/operations/list-webhook-consumers) endpoint for listing webhooks moving forward.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.ListRulesRequest;
import io.codat.platform.models.operations.ListRulesResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ListRulesRequest req = ListRulesRequest.builder()
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListRulesResponse res = sdk.webhooks().list()
                .request(req)
                .call();

        if (res.webhooks().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [ListRulesRequest](../../models/operations/ListRulesRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[ListRulesResponse](../../models/operations/ListRulesResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## listConsumers

﻿Use the *List webhook consumers* endpoint to return a list of all webhook consumers that currently exist for your client.

[Webhook consumer](https://docs.codat.io/platform-api#/schemas/WebhookConsumer) is an HTTP endpoint that you configure to subscribe to specific events. See our documentation for more details on [Codat's webhook service](https://docs.codat.io/using-the-api/webhooks/overview).

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.ListWebhookConsumersResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ListWebhookConsumersResponse res = sdk.webhooks().listConsumers()
                .call();

        if (res.webhookConsumers().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListWebhookConsumersResponse](../../models/operations/ListWebhookConsumersResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 400, 401, 402, 403, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |