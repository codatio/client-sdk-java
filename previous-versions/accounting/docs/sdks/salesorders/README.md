# SalesOrders
(*salesOrders()*)

## Overview

Sales orders

### Available Operations

* [get](#get) - Get sales order
* [list](#list) - List sales orders

## get

The *Get sales order* endpoint returns a single sales order for a given salesOrderId.

[Sales orders](https://docs.codat.io/accounting-api#/schemas/SalesOrder) represent a customer's intention to purchase goods or services from the SMB.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=salesOrders) for integrations that support getting a specific sales order.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetSalesOrderRequest;
import io.codat.accounting.models.operations.GetSalesOrderResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetSalesOrderRequest req = GetSalesOrderRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .salesOrderId("<value>")
                .build();

            GetSalesOrderResponse res = sdk.salesOrders().get()
                .request(req)
                .call();

            if (res.salesOrder().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.SDKError e) {
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
| `request`                                                                                                     | [io.codat.accounting.models.operations.GetSalesOrderRequest](../../models/operations/GetSalesOrderRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetSalesOrderResponse>](../../models/operations/GetSalesOrderResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List sales orders* endpoint returns a list of [sales orders](https://docs.codat.io/accounting-api#/schemas/SalesOrder) for a given company's connection.

[Sales orders](https://docs.codat.io/accounting-api#/schemas/SalesOrder) represent a customer's intention to purchase goods or services from the SMB.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.ListSalesOrdersRequest;
import io.codat.accounting.models.operations.ListSalesOrdersResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListSalesOrdersRequest req = ListSalesOrdersRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListSalesOrdersResponse res = sdk.salesOrders().list()
                .request(req)
                .call();

            if (res.salesOrders().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [io.codat.accounting.models.operations.ListSalesOrdersRequest](../../models/operations/ListSalesOrdersRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[Optional<? extends io.codat.accounting.models.operations.ListSalesOrdersResponse>](../../models/operations/ListSalesOrdersResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
