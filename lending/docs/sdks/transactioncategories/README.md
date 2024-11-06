# TransactionCategories
(*banking().transactionCategories()*)

## Overview

### Available Operations

* [get](#get) - Get transaction category
* [list](#list) - List transaction categories

## get

The *Get transaction category* endpoint returns a single transaction category for a given transactionCategoryId.

[Transaction categories](https://docs.codat.io/lending-api#/schemas/TransactionCategory) are associated with a transaction to provide greater contextual meaning to transaction activity.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetBankingTransactionCategoryRequest;
import io.codat.lending.models.operations.GetBankingTransactionCategoryResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetBankingTransactionCategoryRequest req = GetBankingTransactionCategoryRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .transactionCategoryId("<id>")
                .build();

        GetBankingTransactionCategoryResponse res = sdk.banking().transactionCategories().get()
                .request(req)
                .call();

        if (res.bankingTransactionCategory().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [GetBankingTransactionCategoryRequest](../../models/operations/GetBankingTransactionCategoryRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[GetBankingTransactionCategoryResponse](../../models/operations/GetBankingTransactionCategoryResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 401, 402, 403, 404, 409, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## list

The *List transaction categories* endpoint returns a list of [transaction categories](https://docs.codat.io/lending-api#/schemas/TransactionCategory) for a given company's connection.

[Transaction categories](https://docs.codat.io/lending-api#/schemas/TransactionCategory) are associated with a transaction to provide greater contextual meaning to transaction activity.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.ListBankingTransactionCategoriesRequest;
import io.codat.lending.models.operations.ListBankingTransactionCategoriesResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ListBankingTransactionCategoriesRequest req = ListBankingTransactionCategoriesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListBankingTransactionCategoriesResponse res = sdk.banking().transactionCategories().list()
                .request(req)
                .call();

        if (res.bankingTransactionCategories().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [ListBankingTransactionCategoriesRequest](../../models/operations/ListBankingTransactionCategoriesRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[ListBankingTransactionCategoriesResponse](../../models/operations/ListBankingTransactionCategoriesResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/ErrorMessage                  | 400, 401, 402, 403, 404, 409, 429, 500, 503 | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |