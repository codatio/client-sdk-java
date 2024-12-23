# Settings
(*settings()*)

## Overview

Manage company profile configuration, sync settings, and API keys.

### Available Operations

* [createApiKey](#createapikey) - Create API key
* [deleteApiKey](#deleteapikey) - Delete API key
* [getProfile](#getprofile) - Get profile
* [getSyncSettings](#getsyncsettings) - Get sync settings
* [listApiKeys](#listapikeys) - List API keys
* [updateProfile](#updateprofile) - Update profile
* [updateSyncSettings](#updatesyncsettings) - Update all sync settings

## createApiKey

Use the *Create API keys* endpoint to generate a new API key for your client.

[API keys](https://docs.codat.io/platform-api#/schemas/apiKeys) are tokens used to control access to the API. Include this token in the `Authorization` header parameter when making API calls, following the word "Basic" and a space with your API key.

You can [read more](https://docs.codat.io/using-the-api/authentication) about authentication at Codat and managing API keys via the Portal UI or API.

### Tips and pitfalls

* Your first API key is created for you. Access this key via [Codat's Portal](https://app.codat.io/developers/api-keys).
* If you require multiple API keys, perform multiple calls to the *Create API keys* endpoint. 
* The number of API keys is limited to 10. If you have reached the maximum amount of keys, use the *Delete API key* endpoint to delete an unused key first.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.CreateApiKeyResponse;
import io.codat.platform.models.shared.CreateApiKey;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        CreateApiKey req = CreateApiKey.builder()
                .name("azure-invoice-finance-processor")
                .build();

        CreateApiKeyResponse res = sdk.settings().createApiKey()
                .request(req)
                .call();

        if (res.apiKeyDetails().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [CreateApiKey](../../models/shared/CreateApiKey.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[CreateApiKeyResponse](../../models/operations/CreateApiKeyResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 409, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## deleteApiKey

Use the *Delete API keys* endpoint to delete an existing API key, providing its valid `id` as a parameter. Note that this operation is not reversible.

[API keys](https://docs.codat.io/platform-api#/schemas/apiKeys) are tokens used to control access to the API. Include this token in the `Authorization` header parameter when making API calls, following the word "Basic" and a space with your API key.

You can [read more](https://docs.codat.io/using-the-api/authentication) about authentication at Codat and managing API keys via the Portal UI or API.

### Tips and pitfalls

* It is possible to delete the last remaining API key. If this happens, a new key can be created via the [API key management page](https://app.codat.io/developers/api-keys) of the Portal.
* It is possible to delete the API key used to authenticate the *Delete API key* request.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.DeleteApiKeyRequest;
import io.codat.platform.models.operations.DeleteApiKeyResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        DeleteApiKeyRequest req = DeleteApiKeyRequest.builder()
                .apiKeyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

        DeleteApiKeyResponse res = sdk.settings().deleteApiKey()
                .request(req)
                .call();

        if (res.errorMessage().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeleteApiKeyRequest](../../models/operations/DeleteApiKeyRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DeleteApiKeyResponse](../../models/operations/DeleteApiKeyResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## getProfile

Fetch your Codat profile.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.GetProfileResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetProfileResponse res = sdk.settings().getProfile()
                .call();

        if (res.profile().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetProfileResponse](../../models/operations/GetProfileResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorMessage   | 401, 402, 403, 429, 500, 503 | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## getSyncSettings

Retrieve the [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings) for your client. This includes how often data types should be queued to be updated, and how much history should be fetched.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.GetProfileSyncSettingsResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetProfileSyncSettingsResponse res = sdk.settings().getSyncSettings()
                .call();

        if (res.syncSettings().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetProfileSyncSettingsResponse](../../models/operations/GetProfileSyncSettingsResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorMessage   | 401, 402, 403, 429, 500, 503 | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## listApiKeys

Use the *List API keys* endpoint to return a list of all API keys that currently exist for your client. This includes keys created via the Portal UI or the *Create API keys* endpoint.

[API keys](https://docs.codat.io/platform-api#/schemas/apiKeys) are tokens used to control access to the API. Include this token in the `Authorization` header parameter when making API calls, following the word "Basic" and a space with your API key.

You can [read more](https://docs.codat.io/using-the-api/authentication) about authentication at Codat and managing API keys via the Portal UI or API.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.ListApiKeysResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ListApiKeysResponse res = sdk.settings().listApiKeys()
                .call();

        if (res.apiKeys().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListApiKeysResponse](../../models/operations/ListApiKeysResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorMessage   | 401, 402, 403, 429, 500, 503 | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## updateProfile

Update your Codat profile

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.UpdateProfileResponse;
import io.codat.platform.models.shared.Profile;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        Profile req = Profile.builder()
                .name("Bob's Burgers")
                .redirectUrl("https://bobs-burgers.{countrySuffix}/{companyId}")
                .confirmCompanyName(true)
                .iconUrl("https://client-images.codat.io/icon/042399f5-d104-4f38-9ce8-cac3524f4e88_3f5623af-d992-4c22-bc08-e58c520a8526.ico")
                .logoUrl("https://client-images.codat.io/logo/042399f5-d104-4f38-9ce8-cac3524f4e88_5806cb1f-7342-4c0e-a0a8-99bfbc47b0ff.png")
                .whiteListUrls(List.of(
                    "https://bobs-burgers.com",
                    "https://bobs-burgers.co.uk"))
                .build();

        UpdateProfileResponse res = sdk.settings().updateProfile()
                .request(req)
                .call();

        if (res.profile().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Profile](../../models/shared/Profile.md)  | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[UpdateProfileResponse](../../models/operations/UpdateProfileResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorMessage   | 401, 402, 403, 429, 500, 503 | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |

## updateSyncSettings

Update sync settings for all data types.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.UpdateProfileSyncSettingsRequestBody;
import io.codat.platform.models.operations.UpdateProfileSyncSettingsResponse;
import io.codat.platform.models.shared.DataType;
import io.codat.platform.models.shared.Security;
import io.codat.platform.models.shared.SyncSetting;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        UpdateProfileSyncSettingsRequestBody req = UpdateProfileSyncSettingsRequestBody.builder()
                .clientId("c4907f05-7024-4fc0-bf55-4785be5c9671")
                .settings(List.of(
                    SyncSetting.builder()
                        .dataType(DataType.INVOICES)
                        .fetchOnFirstLink(false)
                        .syncOrder(721380L)
                        .syncSchedule(24L)
                        .isLocked(true)
                        .monthsToSync(24L)
                        .syncFromUtc("2020-01-01T12:00:00.000Z")
                        .syncFromWindow(24L)
                        .build()))
                .build();

        UpdateProfileSyncSettingsResponse res = sdk.settings().updateSyncSettings()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [UpdateProfileSyncSettingsRequestBody](../../models/operations/UpdateProfileSyncSettingsRequestBody.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[UpdateProfileSyncSettingsResponse](../../models/operations/UpdateProfileSyncSettingsResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorMessage   | 401, 402, 403, 429, 500, 503 | application/json             |
| models/errors/SDKError       | 4XX, 5XX                     | \*/\*                        |