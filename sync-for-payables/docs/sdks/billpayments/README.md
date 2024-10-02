# BillPayments
(*billPayments()*)

## Overview

Get, create, and update Bill payments.

### Available Operations

* [create](#create) - Create bill payment
* [getPaymentOptions](#getpaymentoptions) - Get payment mapping options

## create

The *Create bill payment* endpoint creates a new [bill payment](https://docs.codat.io/sync-for-payables-api#/schemas/BillPayment) for a given company's connection.

[Bill payments](https://docs.codat.io/sync-for-payables-api#/schemas/BillPayment) are an allocation of money within any Accounts Payable account.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.BillPaymentAccountRef;
import io.codat.sync.payables.models.components.BillPaymentPrototype;
import io.codat.sync.payables.models.errors.ErrorMessage;
import io.codat.sync.payables.models.operations.CreateBillPaymentRequest;
import io.codat.sync.payables.models.operations.CreateBillPaymentResponse;
import java.lang.Exception;
import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncPayables sdk = CodatSyncPayables.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CreateBillPaymentRequest req = CreateBillPaymentRequest.builder()
                .billId("9wg4lep4ush5cxs79pl8sozmsndbaukll3ind4g7buqbm1h2")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .billPaymentPrototype(BillPaymentPrototype.builder()
                    .accountRef(BillPaymentAccountRef.builder()
                        .id("<id>")
                        .build())
                    .amount(new BigDecimal("1329.54"))
                    .date("2022-10-23T00:00:00Z")
                    .reference("Bill Payment against bill c13e37b6-dfaa-4894-b3be-9fe97bda9f44")
                    .build())
                .build();

        CreateBillPaymentResponse res = sdk.billPayments().create()
                .request(req)
                .call();

        if (res.billPayment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateBillPaymentRequest](../../models/operations/CreateBillPaymentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateBillPaymentResponse](../../models/operations/CreateBillPaymentResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/ErrorMessage                  | 400, 401, 402, 403, 404, 409, 429, 500, 503 | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |

## getPaymentOptions

Use the *Get mapping options - Payments* endpoint to return a list of available mapping options for a given company's connection ID.

By default, this endpoint returns a list of active bank accounts. You can use [querying](https://docs.codat.io/using-the-api/querying) to change that.

Mapping options are a set of bank accounts used to configure the SMB's payables integration.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.errors.ErrorMessage;
import io.codat.sync.payables.models.operations.GetMappingOptionsPaymentsRequest;
import io.codat.sync.payables.models.operations.GetMappingOptionsPaymentsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncPayables sdk = CodatSyncPayables.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetMappingOptionsPaymentsRequest req = GetMappingOptionsPaymentsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .continuationToken("continuationToken=eyJwYWdlIjoyLCJwYWdlU2l6ZSI6MTAwLCJwYWdlQ291bnQiOjExfQ==")
                .statusQuery("status=Archived")
                .build();

        GetMappingOptionsPaymentsResponse res = sdk.billPayments().getPaymentOptions()
                .request(req)
                .call();

        if (res.paymentMappingOptions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetMappingOptionsPaymentsRequest](../../models/operations/GetMappingOptionsPaymentsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetMappingOptionsPaymentsResponse](../../models/operations/GetMappingOptionsPaymentsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |