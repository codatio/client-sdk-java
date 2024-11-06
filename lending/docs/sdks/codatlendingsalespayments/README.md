# CodatLendingSalesPayments
(*sales().payments()*)

## Overview

### Available Operations

* [get](#get) - Get payment
* [list](#list) - List payments

## get

The *Get payment* endpoint returns a single payment for a given paymentId.

[Payments](https://docs.codat.io/lending-api#/schemas/Payment) contain details of all payments made by customers to the company.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCommercePaymentRequest;
import io.codat.lending.models.operations.GetCommercePaymentResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetCommercePaymentRequest req = GetCommercePaymentRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .paymentId("7110701885")
                .build();

        GetCommercePaymentResponse res = sdk.sales().payments().get()
                .request(req)
                .call();

        if (res.commercePayment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetCommercePaymentRequest](../../models/operations/GetCommercePaymentRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetCommercePaymentResponse](../../models/operations/GetCommercePaymentResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 401, 402, 403, 404, 409, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## list

The *List payments* endpoint returns a list of [payments](https://docs.codat.io/lending-api#/schemas/Payment) for a given company's connection.

[Payments](https://docs.codat.io/lending-api#/schemas/Payment) contain details of all payments made by customers to the company.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.ListCommercePaymentsRequest;
import io.codat.lending.models.operations.ListCommercePaymentsResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ListCommercePaymentsRequest req = ListCommercePaymentsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListCommercePaymentsResponse res = sdk.sales().payments().list()
                .request(req)
                .call();

        if (res.commercePayments().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListCommercePaymentsRequest](../../models/operations/ListCommercePaymentsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListCommercePaymentsResponse](../../models/operations/ListCommercePaymentsResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/ErrorMessage                  | 400, 401, 402, 403, 404, 409, 429, 500, 503 | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |