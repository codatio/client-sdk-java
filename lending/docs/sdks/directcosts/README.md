# DirectCosts
(*loanWriteback().directCosts()*)

## Overview

### Available Operations

* [create](#create) - Create direct cost
* [getCreateModel](#getcreatemodel) - Get create direct cost model

## create

The *Create direct cost* endpoint creates a new [direct cost](https://docs.codat.io/lending-api#/schemas/DirectCost) for a given company's connection.

[Direct costs](https://docs.codat.io/lending-api#/schemas/DirectCost) are the expenses associated with a business' operations. For example, purchases of raw materials that are paid off at the point of the purchase and service fees are considered direct costs.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create direct cost model](https://docs.codat.io/lending-api#/operations/get-create-directCosts-model).

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.CreateDirectCostRequest;
import io.codat.lending.models.operations.CreateDirectCostResponse;
import io.codat.lending.models.shared.AccountingPaymentAllocation;
import io.codat.lending.models.shared.Allocation;
import io.codat.lending.models.shared.DirectCostLineItem;
import io.codat.lending.models.shared.DirectCostPrototype;
import io.codat.lending.models.shared.PaymentAllocationPayment;
import io.codat.lending.models.shared.RecordRef;
import io.codat.lending.models.shared.Security;
import io.codat.lending.models.shared.Tracking;
import io.codat.lending.models.shared.TrackingRecordRef;
import io.codat.lending.models.shared.TrackingRecordRefDataType;
import java.lang.Exception;
import java.math.BigDecimal;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        CreateDirectCostRequest req = CreateDirectCostRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .directCostPrototype(DirectCostPrototype.builder()
                    .currency("USD")
                    .issueDate("2022-10-23T00:00:00Z")
                    .lineItems(List.of(
                        DirectCostLineItem.builder()
                            .quantity(new BigDecimal("4174.58"))
                            .unitAmount(new BigDecimal("1343.65"))
                            .tracking(Tracking.builder()
                                .recordRefs(List.of(
                                    TrackingRecordRef.builder()
                                        .dataType(TrackingRecordRefDataType.TRACKING_CATEGORIES)
                                        .build()))
                                .invoiceTo(RecordRef.builder()
                                    .dataType("journalEntry")
                                    .build())
                                .build())
                            .build()))
                    .paymentAllocations(List.of(
                        AccountingPaymentAllocation.builder()
                            .allocation(Allocation.builder()
                                .allocatedOnDate("2022-10-23T00:00:00Z")
                                .currency("EUR")
                                .build())
                            .payment(PaymentAllocationPayment.builder()
                                .currency("GBP")
                                .paidOnDate("2022-10-23T00:00:00Z")
                                .build())
                            .build()))
                    .subTotal(new BigDecimal("899.64"))
                    .taxAmount(new BigDecimal("7926.20"))
                    .totalAmount(new BigDecimal("8165.87"))
                    .build())
                .build();

        CreateDirectCostResponse res = sdk.loanWriteback().directCosts().create()
                .request(req)
                .call();

        if (res.accountingCreateDirectCostResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateDirectCostRequest](../../models/operations/CreateDirectCostRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateDirectCostResponse](../../models/operations/CreateDirectCostResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## getCreateModel

The *Get create direct cost model* endpoint returns the expected data for the request payload when creating a [direct cost](https://docs.codat.io/lending-api#/schemas/DirectCost) for a given company and integration.

[Direct costs](https://docs.codat.io/lending-api#/schemas/DirectCost) are purchases of items that are paid off at the point of the purchase.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCreateDirectCostsModelRequest;
import io.codat.lending.models.operations.GetCreateDirectCostsModelResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetCreateDirectCostsModelRequest req = GetCreateDirectCostsModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

        GetCreateDirectCostsModelResponse res = sdk.loanWriteback().directCosts().getCreateModel()
                .request(req)
                .call();

        if (res.pushOption().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetCreateDirectCostsModelRequest](../../models/operations/GetCreateDirectCostsModelRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetCreateDirectCostsModelResponse](../../models/operations/GetCreateDirectCostsModelResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |