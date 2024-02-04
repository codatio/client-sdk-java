# Configuration
(*configuration()*)

## Overview

Manage mapping options and sync configuration.

### Available Operations

* [getCompanyConfiguration](#getcompanyconfiguration) - Get company configuration
* [getMappingOptions](#getmappingoptions) - Mapping options
* [setCompanyConfiguration](#setcompanyconfiguration) - Set company configuration

## getCompanyConfiguration

Gets a companies expense sync configuration

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.GetCompanyConfigurationRequest;
import io.codat.sync_for_expenses.models.operations.GetCompanyConfigurationResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetCompanyConfigurationRequest req = GetCompanyConfigurationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetCompanyConfigurationResponse res = sdk.configuration().getCompanyConfiguration()
                .request(req)
                .call();

            if (res.companyConfiguration().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [io.codat.sync_for_expenses.models.operations.GetCompanyConfigurationRequest](../../models/operations/GetCompanyConfigurationRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.GetCompanyConfigurationResponse>](../../models/operations/GetCompanyConfigurationResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getMappingOptions

Gets the expense mapping options for a companies accounting software

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.GetMappingOptionsRequest;
import io.codat.sync_for_expenses.models.operations.GetMappingOptionsResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetMappingOptionsRequest req = GetMappingOptionsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetMappingOptionsResponse res = sdk.configuration().getMappingOptions()
                .request(req)
                .call();

            if (res.mappingOptions().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [io.codat.sync_for_expenses.models.operations.GetMappingOptionsRequest](../../models/operations/GetMappingOptionsRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.GetMappingOptionsResponse>](../../models/operations/GetMappingOptionsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## setCompanyConfiguration

Sets a companies expense sync configuration

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.SetCompanyConfigurationRequest;
import io.codat.sync_for_expenses.models.operations.SetCompanyConfigurationResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.BankAccount;
import io.codat.sync_for_expenses.models.shared.CompanyConfiguration;
import io.codat.sync_for_expenses.models.shared.CustomerDetails;
import io.codat.sync_for_expenses.models.shared.Security;
import io.codat.sync_for_expenses.models.shared.SupplierDetails;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            SetCompanyConfigurationRequest req = SetCompanyConfigurationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyConfiguration(CompanyConfiguration.builder()
                    .bankAccount(BankAccount.builder()
                            .id("32")
                            .build())
                    .customer(CustomerDetails.builder()
                            .id("<ID>")
                            .build())
                    .supplier(SupplierDetails.builder()
                            .id("<ID>")
                            .build())
                    .build())
                .build();

            SetCompanyConfigurationResponse res = sdk.configuration().setCompanyConfiguration()
                .request(req)
                .call();

            if (res.companyConfiguration().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [io.codat.sync_for_expenses.models.operations.SetCompanyConfigurationRequest](../../models/operations/SetCompanyConfigurationRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.SetCompanyConfigurationResponse>](../../models/operations/SetCompanyConfigurationResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
