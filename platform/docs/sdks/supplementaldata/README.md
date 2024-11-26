# SupplementalData
(*supplementalData()*)

## Overview

Configure and pull additional data you can include in Codat's standard data types.

### Available Operations

* [configure](#configure) - Configure
* [getConfiguration](#getconfiguration) - Get configuration

## configure

The *Configure* endpoint allows you to maintain or change configuration required to return supplemental data for each integration and data type combination.

[Supplemental data](https://docs.codat.io/using-the-api/supplemental-data/overview) is additional data you can include in Codat's standard data types.

**Integration-specific behaviour**
See the *examples* for integration-specific frequently requested properties.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.ConfigureSupplementalDataRequest;
import io.codat.platform.models.operations.ConfigureSupplementalDataResponse;
import io.codat.platform.models.operations.DataType;
import io.codat.platform.models.shared.Security;
import io.codat.platform.models.shared.SupplementalDataConfiguration;
import io.codat.platform.models.shared.SupplementalDataSourceConfiguration;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ConfigureSupplementalDataRequest req = ConfigureSupplementalDataRequest.builder()
                .dataType(DataType.INVOICES)
                .platformKey("gbol")
                .supplementalDataConfiguration(SupplementalDataConfiguration.builder()
                    .supplementalDataConfig(Map.ofEntries(
                        Map.entry("orders-supplemental-data", SupplementalDataSourceConfiguration.builder()
                            .dataSource("/orders")
                            .pullData(Map.ofEntries(
                                Map.entry("orderNumber", "order_num")))
                            .pushData(Map.ofEntries(
                                Map.entry("orderNumber", "order_num")))
                            .build())))
                    .build())
                .build();

        ConfigureSupplementalDataResponse res = sdk.supplementalData().configure()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ConfigureSupplementalDataRequest](../../models/operations/ConfigureSupplementalDataRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ConfigureSupplementalDataResponse](../../models/operations/ConfigureSupplementalDataResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## getConfiguration

The *Get configuration* endpoint returns supplemental data configuration previously created for each integration and data type combination.

[Supplemental data](https://docs.codat.io/using-the-api/supplemental-data/overview) is additional data you can include in Codat's standard data types.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.GetSupplementalDataConfigurationRequest;
import io.codat.platform.models.operations.GetSupplementalDataConfigurationResponse;
import io.codat.platform.models.operations.PathParamDataType;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetSupplementalDataConfigurationRequest req = GetSupplementalDataConfigurationRequest.builder()
                .dataType(PathParamDataType.INVOICES)
                .platformKey("gbol")
                .build();

        GetSupplementalDataConfigurationResponse res = sdk.supplementalData().getConfiguration()
                .request(req)
                .call();

        if (res.supplementalDataConfiguration().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [GetSupplementalDataConfigurationRequest](../../models/operations/GetSupplementalDataConfigurationRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[GetSupplementalDataConfigurationResponse](../../models/operations/GetSupplementalDataConfigurationResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |