# ItemReceipts
(*itemReceipts()*)

## Overview

Access standardized Item receipts from linked accounting software.

### Available Operations

* [get](#get) - Get item receipt
* [list](#list) - List item receipts

## get

The *Get item receipt* endpoint returns a single item receipt for a given itemReceiptId.

[Item receipts](https://docs.codat.io/accounting-api#/schemas/ItemReceipt) represent the receipt of items into a SMBs inventory.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=itemReceipts) for integrations that support getting a specific item receipt.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.GetItemReceiptRequest;
import io.codat.accounting.models.operations.GetItemReceiptResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetItemReceiptRequest req = GetItemReceiptRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .itemReceiptId("<value>")
                .build();

            GetItemReceiptResponse res = sdk.itemReceipts().get()
                .request(req)
                .call();

            if (res.itemReceipt().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.ErrorMessage e) {
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

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetItemReceiptRequest](../../models/operations/GetItemReceiptRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetItemReceiptResponse](../../models/operations/GetItemReceiptResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 401,402,403,404,409,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## list

The *List item receipts* endpoint returns a list of [item receipts](https://docs.codat.io/accounting-api#/schemas/ItemReceipt) for a given company's connection.

[Item Receipt](https://docs.codat.io/accounting-api#/schemas/ItemReceipt) represent the receipt of items into a SMBs inventory.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.ListItemReceiptsRequest;
import io.codat.accounting.models.operations.ListItemReceiptsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListItemReceiptsRequest req = ListItemReceiptsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            ListItemReceiptsResponse res = sdk.itemReceipts().list()
                .request(req)
                .call();

            if (res.itemReceipts().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.ErrorMessage e) {
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
| `request`                                                                     | [ListItemReceiptsRequest](../../models/operations/ListItemReceiptsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListItemReceiptsResponse](../../models/operations/ListItemReceiptsResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/ErrorMessage          | 400,401,402,403,404,409,429,500,503 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |
