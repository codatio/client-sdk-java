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
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.CreateApiKeyResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.CreateApiKey;
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

            CreateApiKey req = CreateApiKey.builder()
                .name("azure-invoice-finance-processor")
                .build();

            CreateApiKeyResponse res = sdk.settings().createApiKey()
                .request(req)
                .call();

            if (res.apiKeyDetails().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
            // handle exception
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [io.codat.platform.models.shared.CreateApiKey](../../models/shared/CreateApiKey.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |


### Response

**[Optional<? extends io.codat.platform.models.operations.CreateApiKeyResponse>](../../models/operations/CreateApiKeyResponse.md)**
### Errors

| Error Object                                 | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| io.codat.platform.models.errors.ErrorMessage | 400,401,402,403,409,429,500,503              | application/json                             |
| models/errors/SDKError                       | 4xx-5xx                                      | */*                                          |

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
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.DeleteApiKeyRequest;
import io.codat.platform.models.operations.DeleteApiKeyResponse;
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

            DeleteApiKeyRequest req = DeleteApiKeyRequest.builder()
                .apiKeyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            DeleteApiKeyResponse res = sdk.settings().deleteApiKey()
                .request(req)
                .call();

            if (res.errorMessage().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
            // handle exception
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [io.codat.platform.models.operations.DeleteApiKeyRequest](../../models/operations/DeleteApiKeyRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[Optional<? extends io.codat.platform.models.operations.DeleteApiKeyResponse>](../../models/operations/DeleteApiKeyResponse.md)**
### Errors

| Error Object                                 | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| io.codat.platform.models.errors.ErrorMessage | 401,402,403,404,429,500,503                  | application/json                             |
| models/errors/SDKError                       | 4xx-5xx                                      | */*                                          |

## getProfile

Fetch your Codat profile.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.GetProfileResponse;
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

            GetProfileResponse res = sdk.settings().getProfile()
                .call();

            if (res.profile().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
            // handle exception
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends io.codat.platform.models.operations.GetProfileResponse>](../../models/operations/GetProfileResponse.md)**
### Errors

| Error Object                                 | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| io.codat.platform.models.errors.ErrorMessage | 401,402,403,429,500,503                      | application/json                             |
| models/errors/SDKError                       | 4xx-5xx                                      | */*                                          |

## getSyncSettings

Retrieve the [sync settings](https://docs.codat.io/knowledge-base/advanced-sync-settings) for your client. This includes how often data types should be queued to be updated, and how much history should be fetched.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.GetProfileSyncSettingsResponse;
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

            GetProfileSyncSettingsResponse res = sdk.settings().getSyncSettings()
                .call();

            if (res.syncSettings().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
            // handle exception
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends io.codat.platform.models.operations.GetProfileSyncSettingsResponse>](../../models/operations/GetProfileSyncSettingsResponse.md)**
### Errors

| Error Object                                 | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| io.codat.platform.models.errors.ErrorMessage | 401,402,403,429,500,503                      | application/json                             |
| models/errors/SDKError                       | 4xx-5xx                                      | */*                                          |

## listApiKeys

Use the *List API keys* endpoint to return a list of all API keys that currently exist for your client. This includes keys created via the Portal UI or the *Create API keys* endpoint.

[API keys](https://docs.codat.io/platform-api#/schemas/apiKeys) are tokens used to control access to the API. Include this token in the `Authorization` header parameter when making API calls, following the word "Basic" and a space with your API key.

You can [read more](https://docs.codat.io/using-the-api/authentication) about authentication at Codat and managing API keys via the Portal UI or API.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.ListApiKeysResponse;
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

            ListApiKeysResponse res = sdk.settings().listApiKeys()
                .call();

            if (res.apiKeys().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
            // handle exception
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends io.codat.platform.models.operations.ListApiKeysResponse>](../../models/operations/ListApiKeysResponse.md)**
### Errors

| Error Object                                 | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| io.codat.platform.models.errors.ErrorMessage | 401,402,403,429,500,503                      | application/json                             |
| models/errors/SDKError                       | 4xx-5xx                                      | */*                                          |

## updateProfile

Update your Codat profile

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.UpdateProfileResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Profile;
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

            Profile req = Profile.builder()
                .name("Bob's Burgers")
                .redirectUrl("https://bobs-burgers.{countrySuffix}/{companyId}")
                .alertAuthHeader("Bearer tXEiHiRK7XCtI8TNHbpGs1LI1pumdb4Cl1QIo7B2")
                .apiKey("sartANTjHAkLdbyDfaynoTQb7pkmj6hXHmnQKMrB")
                .confirmCompanyName(false)
                .iconUrl("https://client-images.codat.io/icon/042399f5-d104-4f38-9ce8-cac3524f4e88_3f5623af-d992-4c22-bc08-e58c520a8526.ico")
                .logoUrl("https://client-images.codat.io/logo/042399f5-d104-4f38-9ce8-cac3524f4e88_5806cb1f-7342-4c0e-a0a8-99bfbc47b0ff.png")
                .whiteListUrls(java.util.List.of(
                    "https://bobs-burgers.com"))
                .build();

            UpdateProfileResponse res = sdk.settings().updateProfile()
                .request(req)
                .call();

            if (res.profile().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
            // handle exception
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [io.codat.platform.models.shared.Profile](../../models/shared/Profile.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |


### Response

**[Optional<? extends io.codat.platform.models.operations.UpdateProfileResponse>](../../models/operations/UpdateProfileResponse.md)**
### Errors

| Error Object                                 | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| io.codat.platform.models.errors.ErrorMessage | 401,402,403,429,500,503                      | application/json                             |
| models/errors/SDKError                       | 4xx-5xx                                      | */*                                          |

## updateSyncSettings

Update sync settings for all data types.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.UpdateProfileSyncSettingsRequestBody;
import io.codat.platform.models.operations.UpdateProfileSyncSettingsResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.DataType;
import io.codat.platform.models.shared.Security;
import io.codat.platform.models.shared.SyncSetting;
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

            UpdateProfileSyncSettingsRequestBody req = UpdateProfileSyncSettingsRequestBody.builder()
                .clientId("ce429104-79f0-4085-a720-e2d40fcc800f")
                .settings(java.util.List.of(
                        SyncSetting.builder()
                            .dataType(DataType.INVOICES)
                            .fetchOnFirstLink(false)
                            .syncOrder(995823L)
                            .syncSchedule(24L)
                            .monthsToSync(24L)
                            .syncFromUtc("2022-10-23T00:00:00Z")
                            .syncFromWindow(24L)
                            .build()))
                .overridesDefaults(false)
                .build();

            UpdateProfileSyncSettingsResponse res = sdk.settings().updateSyncSettings()
                .request(req)
                .call();

            // handle response
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
            // handle exception
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [io.codat.platform.models.operations.UpdateProfileSyncSettingsRequestBody](../../models/operations/UpdateProfileSyncSettingsRequestBody.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |


### Response

**[Optional<? extends io.codat.platform.models.operations.UpdateProfileSyncSettingsResponse>](../../models/operations/UpdateProfileSyncSettingsResponse.md)**
### Errors

| Error Object                                 | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| io.codat.platform.models.errors.ErrorMessage | 401,402,403,429,500,503                      | application/json                             |
| models/errors/SDKError                       | 4xx-5xx                                      | */*                                          |
