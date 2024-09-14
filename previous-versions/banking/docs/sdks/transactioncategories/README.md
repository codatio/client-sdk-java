# TransactionCategories
(*transactionCategories()*)

## Overview

Hierarchical categories associated with a transaction for greater contextual meaning to transaction activity.

### Available Operations

* [get](#get) - Get transaction category
* [list](#list) - List transaction categories

## get

The *Get transaction category* endpoint returns a single transaction category for a given transactionCategoryId.

[Transaction categories](https://docs.codat.io/banking-api#/schemas/TransactionCategory) are associated with a transaction to provide greater contextual meaning to transaction activity.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/banking?view=tab-by-data-type&dataType=banking-transactionCategories) for integrations that support getting a specific transaction category.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.banking.CodatBanking;
import io.codat.banking.models.errors.SDKError;
import io.codat.banking.models.operations.GetTransactionCategoryRequest;
import io.codat.banking.models.operations.GetTransactionCategoryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatBanking sdk = CodatBanking.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetTransactionCategoryRequest req = GetTransactionCategoryRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .transactionCategoryId("<value>")
                .build();

            GetTransactionCategoryResponse res = sdk.transactionCategories().get()
                .request(req)
                .call();

            if (res.transactionCategory().isPresent()) {
                // handle response
            }
        } catch (io.codat.banking.models.errors.ErrorMessage e) {
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

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetTransactionCategoryRequest](../../models/operations/GetTransactionCategoryRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetTransactionCategoryResponse](../../models/operations/GetTransactionCategoryResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 401,402,403,404,409,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## list

The *List transaction categories* endpoint returns a list of [transaction categories](https://docs.codat.io/banking-api#/schemas/TransactionCategory) for a given company's connection.

[Transaction categories](https://docs.codat.io/banking-api#/schemas/TransactionCategory) are associated with a transaction to provide greater contextual meaning to transaction activity.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.banking.CodatBanking;
import io.codat.banking.models.errors.SDKError;
import io.codat.banking.models.operations.ListTransactionCategoriesRequest;
import io.codat.banking.models.operations.ListTransactionCategoriesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatBanking sdk = CodatBanking.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListTransactionCategoriesRequest req = ListTransactionCategoriesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            ListTransactionCategoriesResponse res = sdk.transactionCategories().list()
                .request(req)
                .call();

            if (res.transactionCategories().isPresent()) {
                // handle response
            }
        } catch (io.codat.banking.models.errors.ErrorMessage e) {
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

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListTransactionCategoriesRequest](../../models/operations/ListTransactionCategoriesRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListTransactionCategoriesResponse](../../models/operations/ListTransactionCategoriesResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/ErrorMessage          | 400,401,402,403,404,409,429,500,503 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |
