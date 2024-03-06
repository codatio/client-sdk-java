# Webhooks
(*webhooks()*)

## Overview

Manage webhooks, rules, and events.

### Available Operations

* [~~create~~](#create) - Create webhook :warning: **Deprecated**
* [createConsumer](#createconsumer) - Create webhook consumer
* [deleteConsumer](#deleteconsumer) - Delete webhook consumer
* [~~get~~](#get) - Get webhook :warning: **Deprecated**
* [~~list~~](#list) - List webhooks :warning: **Deprecated**
* [listConsumers](#listconsumers) - List webhook consumers

## ~~create~~

Create a new webhook configuration

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.CreateRuleResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.CreateRule;
import io.codat.platform.models.shared.Security;
import io.codat.platform.models.shared.WebhookNotifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CreateRule req = CreateRule.builder()
                .notifiers(WebhookNotifier.builder()
                        .emails(java.util.List.of(
                            "info@client.com"))
                        .webhook("https://webhook.client.com")
                        .build())
                .type("<value>")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            CreateRuleResponse res = sdk.webhooks().create()
                .request(req)
                .call();

            if (res.webhook().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [io.codat.platform.models.shared.CreateRule](../../models/shared/CreateRule.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |


### Response

**[Optional<? extends io.codat.platform.models.operations.CreateRuleResponse>](../../models/operations/CreateRuleResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## createConsumer

﻿Use the *Create webhook consumer* endpoint to create a new webhook consumer that will listen to messages we send you.

[Webhook consumer](https://docs.codat.io/platform-api#/schemas/WebhookConsumer) is an HTTP endpoint that you configure to subscribe to specific events. See our documentation for more details on [Codat's webhook service](https://docs.codat.io/using-the-api/webhooks/overview).

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.CreateWebhookConsumerResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import io.codat.platform.models.shared.WebhookConsumerPrototype;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            WebhookConsumerPrototype req = WebhookConsumerPrototype.builder()
                .disabled(false)
                .eventTypes(java.util.List.of(
                    "<value>"))
                .url("https://illegal-billion.info")
                .build();

            CreateWebhookConsumerResponse res = sdk.webhooks().createConsumer()
                .request(req)
                .call();

            if (res.webhookConsumer().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [io.codat.platform.models.shared.WebhookConsumerPrototype](../../models/shared/WebhookConsumerPrototype.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[Optional<? extends io.codat.platform.models.operations.CreateWebhookConsumerResponse>](../../models/operations/CreateWebhookConsumerResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## deleteConsumer

﻿Use the *Delete webhook consumer* endpoint to delete an existing webhoook consumer, providing its valid `id` as a parameter.

[Webhook consumer](https://docs.codat.io/platform-api#/schemas/WebhookConsumer) is an HTTP endpoint that you configure to subscribe to specific events. See our documentation for more details on [Codat's webhook service](https://docs.codat.io/using-the-api/webhooks/overview).

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.DeleteWebhookConsumerRequest;
import io.codat.platform.models.operations.DeleteWebhookConsumerResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [io.codat.platform.models.operations.DeleteWebhookConsumerRequest](../../models/operations/DeleteWebhookConsumerRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[Optional<? extends io.codat.platform.models.operations.DeleteWebhookConsumerResponse>](../../models/operations/DeleteWebhookConsumerResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## ~~get~~

Get a single webhook

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.GetWebhookRequest;
import io.codat.platform.models.operations.GetWebhookResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [io.codat.platform.models.operations.GetWebhookRequest](../../models/operations/GetWebhookRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |


### Response

**[Optional<? extends io.codat.platform.models.operations.GetWebhookResponse>](../../models/operations/GetWebhookResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## ~~list~~

List webhooks that you are subscribed to.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.ListRulesRequest;
import io.codat.platform.models.operations.ListRulesResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            ListRulesRequest req = ListRulesRequest.builder()
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListRulesResponse res = sdk.webhooks().list()
                .request(req)
                .call();

            if (res.webhooks().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [io.codat.platform.models.operations.ListRulesRequest](../../models/operations/ListRulesRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |


### Response

**[Optional<? extends io.codat.platform.models.operations.ListRulesResponse>](../../models/operations/ListRulesResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listConsumers

﻿Use the *List webhook consumers* endpoint to return a list of all webhook consumers that currently exist for your client.

[Webhook consumer](https://docs.codat.io/platform-api#/schemas/WebhookConsumer) is an HTTP endpoint that you configure to subscribe to specific events. See our documentation for more details on [Codat's webhook service](https://docs.codat.io/using-the-api/webhooks/overview).

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.ListWebhookConsumersResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends io.codat.platform.models.operations.ListWebhookConsumersResponse>](../../models/operations/ListWebhookConsumersResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
