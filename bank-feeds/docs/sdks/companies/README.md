# Companies
(*companies()*)

## Overview

Create and manage your Codat companies.

### Available Operations

* [create](#create) - Create company
* [delete](#delete) - Delete a company
* [get](#get) - Get company
* [list](#list) - List companies
* [update](#update) - Update company

## create

﻿Use the *Create company* endpoint to create a new [company](https://docs.codat.io/bank-feeds-api#/schemas/Company) that represents your customer in Codat. 

A [company](https://docs.codat.io/bank-feeds-api#/schemas/Company) represents a business sharing access to their data.
Each company can have multiple [connections](https://docs.codat.io/bank-feeds-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.

If forbidden characters (see `name` pattern) are present in the request, a company will be created with the forbidden characters removed. For example, `Company (Codat[1])` with be created as `Company Codat1`.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.CompanyRequestBody;
import io.codat.bank_feeds.models.components.Items;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.CreateCompanyResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    Items.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().create()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }
        } catch (io.codat.bank_feeds.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [io.codat.bank_feeds.models.components.CompanyRequestBody](../../models/shared/CompanyRequestBody.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.CreateCompanyResponse>](../../models/operations/CreateCompanyResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## delete

﻿The *Delete company* endpoint permanently deletes a [company](https://docs.codat.io/bank-feeds-api#/schemas/Company), its [connections](https://docs.codat.io/bank-feeds-api#/schemas/Connection) and any cached data. This operation is irreversible.

A [company](https://docs.codat.io/bank-feeds-api#/schemas/Company) represents a business sharing access to their data.
Each company can have multiple [connections](https://docs.codat.io/bank-feeds-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.


### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.DeleteCompanyRequest;
import io.codat.bank_feeds.models.operations.DeleteCompanyResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            DeleteCompanyRequest req = DeleteCompanyRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            DeleteCompanyResponse res = sdk.companies().delete()
                .request(req)
                .call();

            // handle response
        } catch (io.codat.bank_feeds.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [io.codat.bank_feeds.models.operations.DeleteCompanyRequest](../../models/operations/DeleteCompanyRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.DeleteCompanyResponse>](../../models/operations/DeleteCompanyResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## get

﻿The *Get company* endpoint returns a single company for a given `companyId`.

A [company](https://docs.codat.io/bank-feeds-api#/schemas/Company) represents a business sharing access to their data.
Each company can have multiple [connections](https://docs.codat.io/bank-feeds-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.


### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.GetCompanyRequest;
import io.codat.bank_feeds.models.operations.GetCompanyResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetCompanyRequest req = GetCompanyRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetCompanyResponse res = sdk.companies().get()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }
        } catch (io.codat.bank_feeds.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [io.codat.bank_feeds.models.operations.GetCompanyRequest](../../models/operations/GetCompanyRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.GetCompanyResponse>](../../models/operations/GetCompanyResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

﻿The *List companies* endpoint returns a list of [companies] associated to your instances.

A [company](https://docs.codat.io/bank-feeds-api#/schemas/Company) represents a business sharing access to their data.
Each company can have multiple [connections](https://docs.codat.io/bank-feeds-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.ListCompaniesRequest;
import io.codat.bank_feeds.models.operations.ListCompaniesResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListCompaniesRequest req = ListCompaniesRequest.builder()
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListCompaniesResponse res = sdk.companies().list()
                .request(req)
                .call();

            if (res.companies().isPresent()) {
                // handle response
            }
        } catch (io.codat.bank_feeds.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [io.codat.bank_feeds.models.operations.ListCompaniesRequest](../../models/operations/ListCompaniesRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.ListCompaniesResponse>](../../models/operations/ListCompaniesResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## update

﻿Use the *Update company* endpoint to update both the name and description of the company. 
If you use [groups](https://docs.codat.io/bank-feeds-api#/schemas/Group) to manage a set of companies, use the [Add company](https://docs.codat.io/bank-feeds-api#/operations/add-company-to-group) or [Remove company](https://docs.codat.io/bank-feeds-api#/operations/remove-company-from-group) endpoints to add or remove a company from a group.

A [company](https://docs.codat.io/bank-feeds-api#/schemas/Company) represents a business sharing access to their data.
Each company can have multiple [connections](https://docs.codat.io/bank-feeds-api#/schemas/Connection) to different data sources, such as one connection to Xero for accounting data, two connections to Plaid for two bank accounts, and a connection to Zettle for POS data.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.CompanyRequestBody;
import io.codat.bank_feeds.models.components.Items;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.UpdateCompanyRequest;
import io.codat.bank_feeds.models.operations.UpdateCompanyResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
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

            UpdateCompanyResponse res = sdk.companies().update()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }
        } catch (io.codat.bank_feeds.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [io.codat.bank_feeds.models.operations.UpdateCompanyRequest](../../models/operations/UpdateCompanyRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.UpdateCompanyResponse>](../../models/operations/UpdateCompanyResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
