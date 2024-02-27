# BillPayments
(*billPayments()*)

## Overview

Bill payments

### Available Operations

* [create](#create) - Create bill payment

## create

The *Create bill payment* endpoint creates a new [bill payment](https://docs.codat.io/sync-for-payables-api#/schemas/BillPayment) for a given company's connection.

[Bill payments](https://docs.codat.io/sync-for-payables-api#/schemas/BillPayment) are an allocation of money within any customer accounts payable account.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.*;
import io.codat.sync.payables.models.components.BillAccountRef;
import io.codat.sync.payables.models.components.BillPaymentPrototype;
import io.codat.sync.payables.models.components.Security;
import io.codat.sync.payables.models.operations.*;
import io.codat.sync.payables.models.operations.CreateBillPaymentRequest;
import io.codat.sync.payables.models.operations.CreateBillPaymentResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncPayables sdk = CodatSyncPayables.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateBillPaymentRequest req = CreateBillPaymentRequest.builder()
                .billId("9wg4lep4ush5cxs79pl8sozmsndbaukll3ind4g7buqbm1h2")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .idempotencyKey("<value>")
                .billPaymentPrototype(BillPaymentPrototype.builder()
                    .accountRef(BillAccountRef.builder()
                            .id("<id>")
                            .build())
                    .amount(new BigDecimal("1329.54"))
                    .date("2022-10-23T00:00:00Z")
                    .currencyRate(new BigDecimal("6384.24"))
                    .reference("Bill Payment against bill c13e37b6-dfaa-4894-b3be-9fe97bda9f44")
                    .build())
                .build();

            CreateBillPaymentResponse res = sdk.billPayments().create()
                .request(req)
                .call();

            if (res.billPayment().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payables.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [io.codat.sync.payables.models.operations.CreateBillPaymentRequest](../../models/operations/CreateBillPaymentRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Optional<? extends io.codat.sync.payables.models.operations.CreateBillPaymentResponse>](../../models/operations/CreateBillPaymentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
