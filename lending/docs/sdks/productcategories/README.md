# ProductCategories
(*sales().productCategories()*)

## Overview

### Available Operations

* [get](#get) - Get product category
* [list](#list) - List product categories

## get

The *Get product* endpoint returns a single product for a given productId.

[Product categories](https://docs.codat.io/lending-api#/schemas/ProductCategory) are used to classify a group of products together, either by type (e.g. "Furniture"), or sometimes by tax profile.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCommerceProductCategoryRequest;
import io.codat.lending.models.operations.GetCommerceProductCategoryResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetCommerceProductCategoryRequest req = GetCommerceProductCategoryRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .productId("7110701885")
                .build();

        GetCommerceProductCategoryResponse res = sdk.sales().productCategories().get()
                .request(req)
                .call();

        if (res.commerceProductCategory().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetCommerceProductCategoryRequest](../../models/operations/GetCommerceProductCategoryRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetCommerceProductCategoryResponse](../../models/operations/GetCommerceProductCategoryResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 401, 402, 403, 404, 409, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## list

The *List product categories* endpoint returns a list of [product categories](https://docs.codat.io/lending-api#/schemas/ProductCategory) for a given company's connection.

[Product categories](https://docs.codat.io/lending-api#/schemas/ProductCategory) are used to classify a group of products together, either by type (e.g. "Furniture"), or sometimes by tax profile.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.ListCommerceProductCategoriesRequest;
import io.codat.lending.models.operations.ListCommerceProductCategoriesResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ListCommerceProductCategoriesRequest req = ListCommerceProductCategoriesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListCommerceProductCategoriesResponse res = sdk.sales().productCategories().list()
                .request(req)
                .call();

        if (res.commerceProductCategories().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [ListCommerceProductCategoriesRequest](../../models/operations/ListCommerceProductCategoriesRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[ListCommerceProductCategoriesResponse](../../models/operations/ListCommerceProductCategoriesResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/ErrorMessage                  | 400, 401, 402, 403, 404, 409, 429, 500, 503 | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |