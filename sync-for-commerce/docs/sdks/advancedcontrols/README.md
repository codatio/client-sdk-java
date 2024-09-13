# AdvancedControls
(*advancedControls()*)

## Overview

View and manage mapping configured for a company's commerce sync.

### Available Operations

* [createCompany](#createcompany) - Create company
* [getConfiguration](#getconfiguration) - Get company configuration
* [listCompanies](#listcompanies) - List companies
* [setConfiguration](#setconfiguration) - Set configuration

## createCompany

Creates a Codat company

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.CreateCompany;
import io.codat.sync.commerce.models.components.GroupReference;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.CreateCompanyResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateCompany req = CreateCompany.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(List.of(
                    GroupReference.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.advancedControls().createCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
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

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `request`                                             | [CreateCompany](../../models/shared/CreateCompany.md) | :heavy_check_mark:                                    | The request object to use for the request.            |

### Response

**[CreateCompanyResponse](../../models/operations/CreateCompanyResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 400,401,402,403,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getConfiguration

Returns a company's commerce sync configuration'.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.GetConfigurationRequest;
import io.codat.sync.commerce.models.operations.GetConfigurationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetConfigurationRequest req = GetConfigurationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetConfigurationResponse res = sdk.advancedControls().getConfiguration()
                .request(req)
                .call();

            if (res.configuration().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
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

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetConfigurationRequest](../../models/operations/GetConfigurationRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetConfigurationResponse](../../models/operations/GetConfigurationResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## listCompanies

Returns a list of companies.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.ListCompaniesRequest;
import io.codat.sync.commerce.models.operations.ListCompaniesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListCompaniesRequest req = ListCompaniesRequest.builder()
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            ListCompaniesResponse res = sdk.advancedControls().listCompanies()
                .request(req)
                .call();

            if (res.companies().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
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

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListCompaniesRequest](../../models/operations/ListCompaniesRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListCompaniesResponse](../../models/operations/ListCompaniesResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## setConfiguration

Sets a company's commerce sync configuration.

### Example Usage

```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.errors.SDKError;
import io.codat.sync.commerce.models.operations.SetConfigurationRequest;
import io.codat.sync.commerce.models.operations.SetConfigurationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            SetConfigurationRequest req = SetConfigurationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            SetConfigurationResponse res = sdk.advancedControls().setConfiguration()
                .request(req)
                .call();

            if (res.configuration().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.commerce.models.errors.ErrorMessage e) {
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

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [SetConfigurationRequest](../../models/operations/SetConfigurationRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[SetConfigurationResponse](../../models/operations/SetConfigurationResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/ErrorMessage          | 400,401,402,403,404,409,429,500,503 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |
