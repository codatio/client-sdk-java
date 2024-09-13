# Configuration
(*configuration()*)

## Overview

View and manage mapping configuration and defaults for expense transactions.

### Available Operations

* [get](#get) - Get company configuration
* [set](#set) - Set company configuration

## get

Gets a company's expense sync configuration

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.errors.SDKError;
import io.codat.sync.expenses.models.operations.GetCompanyConfigurationRequest;
import io.codat.sync.expenses.models.operations.GetCompanyConfigurationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
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
        } catch (io.codat.sync.expenses.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetCompanyConfigurationRequest](../../models/operations/GetCompanyConfigurationRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetCompanyConfigurationResponse](../../models/operations/GetCompanyConfigurationResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## set

Sets a company's expense sync configuration

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.BankAccountDetails;
import io.codat.sync.expenses.models.components.CompanyConfiguration;
import io.codat.sync.expenses.models.components.CustomerDetails;
import io.codat.sync.expenses.models.components.SupplierDetails;
import io.codat.sync.expenses.models.errors.SDKError;
import io.codat.sync.expenses.models.operations.SetCompanyConfigurationRequest;
import io.codat.sync.expenses.models.operations.SetCompanyConfigurationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            SetCompanyConfigurationRequest req = SetCompanyConfigurationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyConfiguration(CompanyConfiguration.builder()
                    .bankAccount(BankAccountDetails.builder()
                        .id("32")
                        .build())
                    .customer(CustomerDetails.builder()
                        .build())
                    .supplier(SupplierDetails.builder()
                        .build())
                    .build())
                .build();

            SetCompanyConfigurationResponse res = sdk.configuration().set()
                .request(req)
                .call();

            if (res.companyConfiguration().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [SetCompanyConfigurationRequest](../../models/operations/SetCompanyConfigurationRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[SetCompanyConfigurationResponse](../../models/operations/SetCompanyConfigurationResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |
