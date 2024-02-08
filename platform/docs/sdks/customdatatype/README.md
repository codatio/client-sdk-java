# CustomDataType
(*customDataType()*)

## Overview

View and configure custom data types for supported integrations.

### Available Operations

* [configure](#configure) - Configure custom data type
* [getConfiguration](#getconfiguration) - Get custom data configuration
* [list](#list) - List custom data type records
* [refresh](#refresh) - Refresh custom data type

## configure

The *Configure custom data type* endpoint allows you to maintain or change the configuration required to return a custom data type for a specific integration. 

A [custom data type](https://docs.codat.io/using-the-api/custom-data) is an additional data type you can create that is not included in Codat's standardized data model.

### Tips and traps

- You can only configure a single custom data type for a single platform at a time. Use the endpoint multiple times if you need to configure it for multiple platforms. 

- You can only indicate a single data source for each customer data type. 

- Make your custom configuration as similar as possible to our standard data types so you can interact with them in exactly the same way.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.ConfigureCustomDataTypeRequest;
import io.codat.platform.models.operations.ConfigureCustomDataTypeResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.CustomDataTypeConfiguration;
import io.codat.platform.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            ConfigureCustomDataTypeRequest req = ConfigureCustomDataTypeRequest.builder()
                .customDataIdentifier("DynamicsPurchaseOrders")
                .platformKey("gbol")
                .customDataTypeConfiguration(CustomDataTypeConfiguration.builder()
                    .dataSource("string")
                    .keyBy(java.util.List.of(
                        "string"))
                    .requiredData(java.util.Map.ofEntries(
                        entry("key", "string")))
                    .sourceModifiedDate(java.util.List.of(
                        "string"))
                    .build())
                .build();

            ConfigureCustomDataTypeResponse res = sdk.customDataType().configure()
                .request(req)
                .call();

            if (res.customDataTypeConfiguration().isPresent()) {
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

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [io.codat.platform.models.operations.ConfigureCustomDataTypeRequest](../../models/operations/ConfigureCustomDataTypeRequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |


### Response

**[Optional<? extends io.codat.platform.models.operations.ConfigureCustomDataTypeResponse>](../../models/operations/ConfigureCustomDataTypeResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getConfiguration

The *Get custom data configuration* endpoint returns existing configuration details for the specified custom data type and integration pair you previously configured.

A [custom data type](https://docs.codat.io/using-the-api/custom-data) is an additional data type you can create that is not included in Codat's standardized data model.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.GetCustomDataTypeConfigurationRequest;
import io.codat.platform.models.operations.GetCustomDataTypeConfigurationResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            GetCustomDataTypeConfigurationRequest req = GetCustomDataTypeConfigurationRequest.builder()
                .customDataIdentifier("DynamicsPurchaseOrders")
                .platformKey("gbol")
                .build();

            GetCustomDataTypeConfigurationResponse res = sdk.customDataType().getConfiguration()
                .request(req)
                .call();

            if (res.customDataTypeRecords().isPresent()) {
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

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [io.codat.platform.models.operations.GetCustomDataTypeConfigurationRequest](../../models/operations/GetCustomDataTypeConfigurationRequest.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |


### Response

**[Optional<? extends io.codat.platform.models.operations.GetCustomDataTypeConfigurationResponse>](../../models/operations/GetCustomDataTypeConfigurationResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List custom data type records* endpoint returns a paginated list of records pulled for the specified custom data type you previously configured.

A [custom data type](https://docs.codat.io/using-the-api/custom-data) is an additional data type you can create that is not included in Codat's standardized data model.s endpoint returns a paginated list of records whose schema is defined [Configure custom data type](https://docs.codat.io/platform-api#/operations/configure-custom-data-type)

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.ListCustomDataTypeRecordsRequest;
import io.codat.platform.models.operations.ListCustomDataTypeRecordsResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            ListCustomDataTypeRecordsRequest req = ListCustomDataTypeRecordsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .customDataIdentifier("DynamicsPurchaseOrders")
                .page(1)
                .pageSize(100)
                .build();

            ListCustomDataTypeRecordsResponse res = sdk.customDataType().list()
                .request(req)
                .call();

            if (res.customDataTypeRecords().isPresent()) {
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

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [io.codat.platform.models.operations.ListCustomDataTypeRecordsRequest](../../models/operations/ListCustomDataTypeRecordsRequest.md) | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |


### Response

**[Optional<? extends io.codat.platform.models.operations.ListCustomDataTypeRecordsResponse>](../../models/operations/ListCustomDataTypeRecordsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## refresh

The *Refresh custom data type* endpoint refreshes the specified custom data type for a given company. This is an asynchronous operation that will sync updated data from the linked integration into Codat for you to view.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.RefreshCustomDataTypeRequest;
import io.codat.platform.models.operations.RefreshCustomDataTypeResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            RefreshCustomDataTypeRequest req = RefreshCustomDataTypeRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .customDataIdentifier("DynamicsPurchaseOrders")
                .build();

            RefreshCustomDataTypeResponse res = sdk.customDataType().refresh()
                .request(req)
                .call();

            if (res.pullOperation().isPresent()) {
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

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [io.codat.platform.models.operations.RefreshCustomDataTypeRequest](../../models/operations/RefreshCustomDataTypeRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[Optional<? extends io.codat.platform.models.operations.RefreshCustomDataTypeResponse>](../../models/operations/RefreshCustomDataTypeResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
