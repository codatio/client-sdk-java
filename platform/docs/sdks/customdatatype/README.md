# CustomDataType
(*customDataType()*)

## Overview

Configure and pull additional data types that are not included in Codat's standardized data model.

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
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.ConfigureCustomDataTypeRequest;
import io.codat.platform.models.operations.ConfigureCustomDataTypeResponse;
import io.codat.platform.models.shared.CustomDataTypeConfiguration;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ConfigureCustomDataTypeRequest req = ConfigureCustomDataTypeRequest.builder()
                .customDataIdentifier("DynamicsPurchaseOrders")
                .platformKey("gbol")
                .customDataTypeConfiguration(CustomDataTypeConfiguration.builder()
                    .dataSource("api/purchaseOrders?$filter=currencyCode eq 'NOK'")
                    .keyBy(List.of(
                        "$[*].id"))
                    .requiredData(Map.ofEntries(
                        Map.entry("currencyCode", "$[*].currencyCode"),
                        Map.entry("id", "$[*].id"),
                        Map.entry("number", "$[*].number"),
                        Map.entry("orderDate", "$[*].orderDate"),
                        Map.entry("totalAmountExcludingTax", "$[*].totalAmountExcludingTax"),
                        Map.entry("totalTaxAmount", "$[*].totalTaxAmount"),
                        Map.entry("vendorName", "$[*].number")))
                    .sourceModifiedDate(List.of(
                        "$[*].lastModifiedDateTime"))
                    .build())
                .build();

        ConfigureCustomDataTypeResponse res = sdk.customDataType().configure()
                .request(req)
                .call();

        if (res.customDataTypeConfiguration().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ConfigureCustomDataTypeRequest](../../models/operations/ConfigureCustomDataTypeRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ConfigureCustomDataTypeResponse](../../models/operations/ConfigureCustomDataTypeResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## getConfiguration

The *Get custom data configuration* endpoint returns existing configuration details for the specified custom data type and integration pair you previously configured.

A [custom data type](https://docs.codat.io/using-the-api/custom-data) is an additional data type you can create that is not included in Codat's standardized data model.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.GetCustomDataTypeConfigurationRequest;
import io.codat.platform.models.operations.GetCustomDataTypeConfigurationResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
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
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [GetCustomDataTypeConfigurationRequest](../../models/operations/GetCustomDataTypeConfigurationRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[GetCustomDataTypeConfigurationResponse](../../models/operations/GetCustomDataTypeConfigurationResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## list

The *List custom data type records* endpoint returns a paginated list of records pulled for the specified custom data type you previously configured.

A [custom data type](https://docs.codat.io/using-the-api/custom-data) is an additional data type you can create that is not included in Codat's standardized data model.s endpoint returns a paginated list of records whose schema is defined [Configure custom data type](https://docs.codat.io/platform-api#/operations/configure-custom-data-type)

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.ListCustomDataTypeRecordsRequest;
import io.codat.platform.models.operations.ListCustomDataTypeRecordsResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
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
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListCustomDataTypeRecordsRequest](../../models/operations/ListCustomDataTypeRecordsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListCustomDataTypeRecordsResponse](../../models/operations/ListCustomDataTypeRecordsResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/ErrorMessage                  | 400, 401, 402, 403, 404, 429, 451, 500, 503 | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |

## refresh

The *Refresh custom data type* endpoint refreshes the specified custom data type for a given company. This is an asynchronous operation that will sync updated data from the linked integration into Codat for you to view.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.RefreshCustomDataTypeRequest;
import io.codat.platform.models.operations.RefreshCustomDataTypeResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
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
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RefreshCustomDataTypeRequest](../../models/operations/RefreshCustomDataTypeRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RefreshCustomDataTypeResponse](../../models/operations/RefreshCustomDataTypeResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 401, 402, 403, 404, 429, 451, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |