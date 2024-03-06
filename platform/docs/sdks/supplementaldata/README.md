# SupplementalData
(*supplementalData()*)

## Overview

View and configure supplemental data for supported data types.

### Available Operations

* [configure](#configure) - Configure
* [getConfiguration](#getconfiguration) - Get configuration

## configure

The *Configure* endpoint allows you to maintain or change configuration required to return supplemental data for each integration and data type combination.

[Supplemental data](https://docs.codat.io/using-the-api/additional-data) is additional data you can include in Codat's standard data types.

**Integration-specific behaviour**
See the *examples* for integration-specific frequently requested properties.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.ConfigureSupplementalDataRequest;
import io.codat.platform.models.operations.ConfigureSupplementalDataResponse;
import io.codat.platform.models.operations.DataType;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.Security;
import io.codat.platform.models.shared.SupplementalDataConfiguration;
import io.codat.platform.models.shared.SupplementalDataSourceConfiguration;
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

            ConfigureSupplementalDataRequest req = ConfigureSupplementalDataRequest.builder()
                .dataType(DataType.INVOICES)
                .platformKey("gbol")
                .supplementalDataConfiguration(SupplementalDataConfiguration.builder()
                    .supplementalDataConfig(java.util.Map.ofEntries(
                        entry("key", SupplementalDataSourceConfiguration.builder()
                            .build())))
                    .build())
                .build();

            ConfigureSupplementalDataResponse res = sdk.supplementalData().configure()
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

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [io.codat.platform.models.operations.ConfigureSupplementalDataRequest](../../models/operations/ConfigureSupplementalDataRequest.md) | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |


### Response

**[Optional<? extends io.codat.platform.models.operations.ConfigureSupplementalDataResponse>](../../models/operations/ConfigureSupplementalDataResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getConfiguration

The *Get configuration* endpoint returns supplemental data configuration previously created for each integration and data type combination.

[Supplemental data](https://docs.codat.io/using-the-api/additional-data) is additional data you can include in Codat's standard data types.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.GetSupplementalDataConfigurationRequest;
import io.codat.platform.models.operations.GetSupplementalDataConfigurationResponse;
import io.codat.platform.models.operations.PathParamDataType;
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
        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                         | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                         | [io.codat.platform.models.operations.GetSupplementalDataConfigurationRequest](../../models/operations/GetSupplementalDataConfigurationRequest.md) | :heavy_check_mark:                                                                                                                                | The request object to use for the request.                                                                                                        |


### Response

**[Optional<? extends io.codat.platform.models.operations.GetSupplementalDataConfigurationResponse>](../../models/operations/GetSupplementalDataConfigurationResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
