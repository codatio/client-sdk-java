# BillPayments
(*accountsPayable().billPayments()*)

## Overview

### Available Operations

* [get](#get) - Get bill payment
* [list](#list) - List bill payments

## get

The *Get bill payment* endpoint returns a single bill payment for a given billPaymentId.

[Bill payments](https://docs.codat.io/lending-api#/schemas/BillPayment) are an allocation of money within any customer accounts payable account.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetAccountingBillPaymentRequest;
import io.codat.lending.models.operations.GetAccountingBillPaymentResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetAccountingBillPaymentRequest req = GetAccountingBillPaymentRequest.builder()
                .billPaymentId("7110701885")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

        GetAccountingBillPaymentResponse res = sdk.accountsPayable().billPayments().get()
                .request(req)
                .call();

        if (res.accountingBillPayment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetAccountingBillPaymentRequest](../../models/operations/GetAccountingBillPaymentRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetAccountingBillPaymentResponse](../../models/operations/GetAccountingBillPaymentResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 401, 402, 403, 404, 409, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## list

The *List bill payments* endpoint returns a list of [bill payments](https://docs.codat.io/lending-api#/schemas/BillPayment) for a given company's connection.

[Bill payments](https://docs.codat.io/lending-api#/schemas/BillPayment) are an allocation of money within any customer accounts payable account.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.ListAccountingBillPaymentsRequest;
import io.codat.lending.models.operations.ListAccountingBillPaymentsResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ListAccountingBillPaymentsRequest req = ListAccountingBillPaymentsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListAccountingBillPaymentsResponse res = sdk.accountsPayable().billPayments().list()
                .request(req)
                .call();

        if (res.accountingBillPayments().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListAccountingBillPaymentsRequest](../../models/operations/ListAccountingBillPaymentsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListAccountingBillPaymentsResponse](../../models/operations/ListAccountingBillPaymentsResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/ErrorMessage                  | 400, 401, 402, 403, 404, 409, 429, 500, 503 | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |