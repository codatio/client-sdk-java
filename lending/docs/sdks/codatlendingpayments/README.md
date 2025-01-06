# CodatLendingPayments
(*loanWriteback().payments()*)

## Overview

### Available Operations

* [create](#create) - Create payment
* [getCreateModel](#getcreatemodel) - Get create payment model

## create

The *Create payment* endpoint creates a new [payment](https://docs.codat.io/lending-api#/schemas/Payment) for a given company's connection.

[Payments](https://docs.codat.io/lending-api#/schemas/Payment) represent an allocation of money within any customer accounts receivable account.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create payment model](https://docs.codat.io/lending-api#/operations/get-create-payments-model).

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.CreatePaymentRequest;
import io.codat.lending.models.operations.CreatePaymentResponse;
import io.codat.lending.models.shared.AccountRef;
import io.codat.lending.models.shared.AccountingCustomerRef;
import io.codat.lending.models.shared.AccountingPayment;
import io.codat.lending.models.shared.PaymentLine;
import io.codat.lending.models.shared.PaymentLineLink;
import io.codat.lending.models.shared.PaymentLinkType;
import io.codat.lending.models.shared.PaymentMethodRef;
import io.codat.lending.models.shared.Security;
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

        CreatePaymentRequest req = CreatePaymentRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .accountingPayment(AccountingPayment.builder()
                    .date("2023-02-10T11:47:04.792Z")
                    .accountRef(AccountRef.builder()
                        .id("8000002E-1675267199")
                        .name("Undeposited Funds")
                        .build())
                    .currency("USD")
                    .currencyRate(new BigDecimal("1"))
                    .customerRef(AccountingCustomerRef.builder()
                        .id("80000002-1674552702")
                        .companyName("string")
                        .build())
                    .lines(List.of(
                        PaymentLine.builder()
                            .amount(new BigDecimal("28"))
                            .allocatedOnDate("2023-02-11T11:47:04.792Z")
                            .links(List.of(
                                PaymentLineLink.builder()
                                    .type(PaymentLinkType.INVOICE)
                                    .amount(new BigDecimal("-28"))
                                    .currencyRate(new BigDecimal("1"))
                                    .id("181-1676374586")
                                    .build()))
                            .build()))
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .note("note 14/02 1147")
                    .paymentMethodRef(PaymentMethodRef.builder()
                        .id("string")
                        .name("string")
                        .build())
                    .reference("ref 14/02 1147")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .totalAmount(new BigDecimal("28"))
                    .build())
                .build();

        CreatePaymentResponse res = sdk.loanWriteback().payments().create()
                .request(req)
                .call();

        if (res.accountingCreatePaymentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreatePaymentRequest](../../models/operations/CreatePaymentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreatePaymentResponse](../../models/operations/CreatePaymentResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## getCreateModel

The *Get create payment model* endpoint returns the expected data for the request payload when creating a [payment](https://docs.codat.io/lending-api#/schemas/Payment) for a given company and integration.

[Payments](https://docs.codat.io/lending-api#/schemas/Payment) represent an allocation of money within any customer accounts receivable account.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCreatePaymentModelRequest;
import io.codat.lending.models.operations.GetCreatePaymentModelResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetCreatePaymentModelRequest req = GetCreatePaymentModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

        GetCreatePaymentModelResponse res = sdk.loanWriteback().payments().getCreateModel()
                .request(req)
                .call();

        if (res.pushOption().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetCreatePaymentModelRequest](../../models/operations/GetCreatePaymentModelRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetCreatePaymentModelResponse](../../models/operations/GetCreatePaymentModelResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |