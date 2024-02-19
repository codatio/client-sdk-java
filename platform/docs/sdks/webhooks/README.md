# Webhooks
(*webhooks()*)

## Overview

Manage webhooks, rules, and events.

### Available Operations

* [create](#create) - Create webhook
* [get](#get) - Get webhook
* [list](#list) - List webhooks

## create

Create a new webhook configuration

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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
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

## get

Get a single webhook

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.GetWebhookRequest;
import io.codat.platform.models.operations.GetWebhookResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
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

## list

List webhooks that you are subscribed to.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.ListRulesRequest;
import io.codat.platform.models.operations.ListRulesResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
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
