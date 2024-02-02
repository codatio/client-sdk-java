# Companies
(*companies()*)

## Overview

Create and manage your Codat companies.

### Available Operations

* [createCompany](#createcompany) - Create company
* [deleteCompany](#deletecompany) - Delete a company
* [getCompany](#getcompany) - Get company
* [listCompanies](#listcompanies) - List companies
* [updateCompany](#updatecompany) - Update company

## createCompany

﻿Use the *Create company* endpoint to create a new [company](https://docs.codat.io/lending-api#/schemas/Company) that represents your customer in Codat. 

A [company](https://docs.codat.io/lending-api#/schemas/Company) represents a business sharing access to their data.
Each company can have multiple [connections](https://docs.codat.io/lending-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.

If forbidden characters (see `name` pattern) are present in the request, a company will be created with the forbidden characters removed. For example, `Company (Codat[1])` with be created as `Company Codat1`.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.CreateCompanyResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.CompanyRequestBody;
import io.codat.lending.models.shared.Items;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    Items.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().createCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }

        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [io.codat.lending.models.shared.CompanyRequestBody](../../models/shared/CompanyRequestBody.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[Optional<? extends io.codat.lending.models.operations.CreateCompanyResponse>](../../models/operations/CreateCompanyResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## deleteCompany

﻿The *Delete company* endpoint permanently deletes a [company](https://docs.codat.io/lending-api#/schemas/Company), its [connections](https://docs.codat.io/lending-api#/schemas/Connection) and any cached data. This operation is irreversible.

A [company](https://docs.codat.io/lending-api#/schemas/Company) represents a business sharing access to their data.
Each company can have multiple [connections](https://docs.codat.io/lending-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.DeleteCompanyRequest;
import io.codat.lending.models.operations.DeleteCompanyResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            DeleteCompanyRequest req = DeleteCompanyRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            DeleteCompanyResponse res = sdk.companies().deleteCompany()
                .request(req)
                .call();

            // handle response

        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [io.codat.lending.models.operations.DeleteCompanyRequest](../../models/operations/DeleteCompanyRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Optional<? extends io.codat.lending.models.operations.DeleteCompanyResponse>](../../models/operations/DeleteCompanyResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCompany

﻿The *Get company* endpoint returns a single company for a given `companyId`.

A [company](https://docs.codat.io/lending-api#/schemas/Company) represents a business sharing access to their data.
Each company can have multiple [connections](https://docs.codat.io/lending-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetCompanyRequest;
import io.codat.lending.models.operations.GetCompanyResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetCompanyRequest req = GetCompanyRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetCompanyResponse res = sdk.companies().getCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }

        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [io.codat.lending.models.operations.GetCompanyRequest](../../models/operations/GetCompanyRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetCompanyResponse>](../../models/operations/GetCompanyResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listCompanies

﻿The *List companies* endpoint returns a list of [companies] associated to your instances.

A [company](https://docs.codat.io/lending-api#/schemas/Company) represents a business sharing access to their data.
Each company can have multiple [connections](https://docs.codat.io/lending-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.ListCompaniesRequest;
import io.codat.lending.models.operations.ListCompaniesResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            ListCompaniesRequest req = ListCompaniesRequest.builder()
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("string")
                .build();

            ListCompaniesResponse res = sdk.companies().listCompanies()
                .request(req)
                .call();

            if (res.companies().isPresent()) {
                // handle response
            }

        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [io.codat.lending.models.operations.ListCompaniesRequest](../../models/operations/ListCompaniesRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Optional<? extends io.codat.lending.models.operations.ListCompaniesResponse>](../../models/operations/ListCompaniesResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## updateCompany

﻿Use the *Update company* endpoint to update both the name and description of the company. 
If you use [groups](https://docs.codat.io/lending-api#/schemas/Group) to manage a set of companies, use the [Add company](https://docs.codat.io/lending-api#/operations/add-company-to-group) or [Remove company](https://docs.codat.io/lending-api#/operations/remove-company-from-group) endpoints to add or remove a company from a group.

A [company](https://docs.codat.io/lending-api#/schemas/Company) represents a business sharing access to their data.
Each company can have multiple [connections](https://docs.codat.io/lending-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.UpdateCompanyRequest;
import io.codat.lending.models.operations.UpdateCompanyResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.CompanyRequestBody;
import io.codat.lending.models.shared.Items;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            UpdateCompanyRequest req = UpdateCompanyRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyRequestBody(CompanyRequestBody.builder()
                    .name("Bank of Dave")
                    .description("Requested early access to the new financing scheme.")
                    .groups(java.util.List.of(
                        Items.builder()
                            .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                            .build()))
                    .build())
                .build();

            UpdateCompanyResponse res = sdk.companies().updateCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }

        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [io.codat.lending.models.operations.UpdateCompanyRequest](../../models/operations/UpdateCompanyRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Optional<? extends io.codat.lending.models.operations.UpdateCompanyResponse>](../../models/operations/UpdateCompanyResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
