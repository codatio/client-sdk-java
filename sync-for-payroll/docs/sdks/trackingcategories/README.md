# TrackingCategories
(*trackingCategories()*)

## Overview

Get, create, and update Tracking Categories for additional categorization of payroll components.

### Available Operations

* [get](#get) - Get tracking categories
* [list](#list) - List tracking categories

## get

The *Get tracking category* endpoint returns a single tracking category for a given `trackingCategoryId`.

[Tracking categories](https://docs.codat.io/sync-for-payroll-api#/schemas/TrackingCategory) are used to monitor cost centres and control budgets that sit outside the standard set of accounts.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=trackingCategories) for integrations that support getting a specific tracking category.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-payroll-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.GetTrackingCategoryRequest;
import io.codat.sync.payroll.models.operations.GetTrackingCategoryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetTrackingCategoryRequest req = GetTrackingCategoryRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .trackingCategoryId("<value>")
                .build();

            GetTrackingCategoryResponse res = sdk.trackingCategories().get()
                .request(req)
                .call();

            if (res.trackingCategoryTree().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.ErrorMessage e) {
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

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetTrackingCategoryRequest](../../models/operations/GetTrackingCategoryRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetTrackingCategoryResponse](../../models/operations/GetTrackingCategoryResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 401,402,403,404,409,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## list

The *List tracking categories* endpoint returns a list of [tracking categories](https://docs.codat.io/sync-for-payroll-api#/schemas/TrackingCategory) for a given company's connection.

[Tracking categories](https://docs.codat.io/sync-for-payroll-api#/schemas/TrackingCategory) are used to monitor cost centres and control budgets that sit outside the standard set of accounts.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-payroll-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.ListTrackingCategoriesRequest;
import io.codat.sync.payroll.models.operations.ListTrackingCategoriesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListTrackingCategoriesRequest req = ListTrackingCategoriesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            ListTrackingCategoriesResponse res = sdk.trackingCategories().list()
                .request(req)
                .call();

            if (res.trackingCategories().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.ErrorMessage e) {
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
| `request`                                                                                 | [ListTrackingCategoriesRequest](../../models/operations/ListTrackingCategoriesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListTrackingCategoriesResponse](../../models/operations/ListTrackingCategoriesResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/ErrorMessage          | 400,401,402,403,404,409,429,500,503 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |
