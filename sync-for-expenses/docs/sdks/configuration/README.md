# Configuration
(*configuration()*)

## Overview

Manage mapping options and sync configuration.

### Available Operations

* [get](#get) - Get company configuration
* [getMappingOptions](#getmappingoptions) - Mapping options
* [set](#set) - Set company configuration

## get

Gets a companies expense sync configuration

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.GetCompanyConfigurationRequest;
import io.codat.sync.expenses.models.operations.GetCompanyConfigurationResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetCompanyConfigurationRequest req = GetCompanyConfigurationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetCompanyConfigurationResponse res = sdk.configuration().get()
                .request(req)
                .call();

            if (res.companyConfiguration().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [io.codat.sync.expenses.models.operations.GetCompanyConfigurationRequest](../../models/operations/GetCompanyConfigurationRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.GetCompanyConfigurationResponse>](../../models/operations/GetCompanyConfigurationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getMappingOptions

Gets the expense mapping options for a companies accounting software

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.GetMappingOptionsRequest;
import io.codat.sync.expenses.models.operations.GetMappingOptionsResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
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
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [io.codat.sync.expenses.models.operations.GetMappingOptionsRequest](../../models/operations/GetMappingOptionsRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.GetMappingOptionsResponse>](../../models/operations/GetMappingOptionsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## set

Sets a companies expense sync configuration

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.BankAccount;
import io.codat.sync.expenses.models.components.CompanyConfiguration;
import io.codat.sync.expenses.models.components.CustomerDetails;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.components.SupplierDetails;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.SetCompanyConfigurationRequest;
import io.codat.sync.expenses.models.operations.SetCompanyConfigurationResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            SetCompanyConfigurationRequest req = SetCompanyConfigurationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyConfiguration(CompanyConfiguration.builder()
                    .bankAccount(BankAccount.builder()
                            .id("32")
                            .build())
                    .customer(CustomerDetails.builder()
                            .id("<id>")
                            .build())
                    .supplier(SupplierDetails.builder()
                            .id("<id>")
                            .build())
                    .build())
                .build();

            SetCompanyConfigurationResponse res = sdk.configuration().set()
                .request(req)
                .call();

            if (res.companyConfiguration().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [io.codat.sync.expenses.models.operations.SetCompanyConfigurationRequest](../../models/operations/SetCompanyConfigurationRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.SetCompanyConfigurationResponse>](../../models/operations/SetCompanyConfigurationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
