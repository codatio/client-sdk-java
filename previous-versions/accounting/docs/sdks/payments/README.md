# Payments
(*payments()*)

## Overview

Access standardized Payments from linked accounting software.

### Available Operations

* [create](#create) - Create payment
* [get](#get) - Get payment
* [getCreateModel](#getcreatemodel) - Get create payment model
* [list](#list) - List payments
* [payments](#payments) - List payments

## create

The *Create payment* endpoint creates a new [payment](https://docs.codat.io/accounting-api#/schemas/Payment) for a given company's connection.

[Payments](https://docs.codat.io/accounting-api#/schemas/Payment) represent an allocation of money within any customer accounts receivable account.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create payment model](https://docs.codat.io/accounting-api#/operations/get-create-payments-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=payments) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.Payment;
import io.codat.accounting.models.components.PaymentLine;
import io.codat.accounting.models.components.PaymentMethodRef;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.CreatePaymentRequest;
import io.codat.accounting.models.operations.CreatePaymentResponse;
import java.lang.Exception;
import java.math.BigDecimal;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreatePaymentRequest req = CreatePaymentRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .payment(Payment.builder()
                    .date("2022-10-23T00:00:00Z")
                    .currency("EUR")
                    .lines(List.of(
                        PaymentLine.builder()
                            .amount(new BigDecimal("4174.58"))
                            .allocatedOnDate("2022-10-23T00:00:00Z")
                            .build()))
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .paymentMethodRef(PaymentMethodRef.builder()
                        .id("<id>")
                        .build())
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .build())
                .build();

            CreatePaymentResponse res = sdk.payments().create()
                .request(req)
                .call();

            if (res.createPaymentResponse().isPresent()) {
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

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreatePaymentRequest](../../models/operations/CreatePaymentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreatePaymentResponse](../../models/operations/CreatePaymentResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## get

The *Get payment* endpoint returns a single payment for a given paymentId.

[Payments](https://docs.codat.io/accounting-api#/schemas/Payment) represent an allocation of money within any customer accounts receivable account.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=payments) for integrations that support getting a specific payment.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.GetPaymentRequest;
import io.codat.accounting.models.operations.GetPaymentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetPaymentRequest req = GetPaymentRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .paymentId("<value>")
                .build();

            GetPaymentResponse res = sdk.payments().get()
                .request(req)
                .call();

            if (res.payment().isPresent()) {
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

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetPaymentRequest](../../models/operations/GetPaymentRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetPaymentResponse](../../models/operations/GetPaymentResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 401,402,403,404,409,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## getCreateModel

The *Get create payment model* endpoint returns the expected data for the request payload when creating a [payment](https://docs.codat.io/accounting-api#/schemas/Payment) for a given company and integration.

[Payments](https://docs.codat.io/accounting-api#/schemas/Payment) represent an allocation of money within any customer accounts receivable account.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=payments) for integrations that support creating a payment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.GetCreatePaymentsModelRequest;
import io.codat.accounting.models.operations.GetCreatePaymentsModelResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetCreatePaymentsModelRequest req = GetCreatePaymentsModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreatePaymentsModelResponse res = sdk.payments().getCreateModel()
                .request(req)
                .call();

            if (res.pushOption().isPresent()) {
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

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetCreatePaymentsModelRequest](../../models/operations/GetCreatePaymentsModelRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetCreatePaymentsModelResponse](../../models/operations/GetCreatePaymentsModelResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## list

The *List payments* endpoint returns a list of [payments](https://docs.codat.io/accounting-api#/schemas/Payment) for a given company's connection.

[Payments](https://docs.codat.io/accounting-api#/schemas/Payment) represent an allocation of money within any customer accounts receivable account.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.ListPaymentsRequest;
import io.codat.accounting.models.operations.ListPaymentsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListPaymentsRequest req = ListPaymentsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            ListPaymentsResponse res = sdk.payments().list()
                .request(req)
                .call();

            if (res.payments().isPresent()) {
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

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListPaymentsRequest](../../models/operations/ListPaymentsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListPaymentsResponse](../../models/operations/ListPaymentsResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/ErrorMessage          | 400,401,402,403,404,409,429,500,503 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |


## payments

The *List payments* endpoint returns a list of [payments](https://docs.codat.io/accounting-api#/schemas/Payment) for a given company's connection.

[Payments](https://docs.codat.io/accounting-api#/schemas/Payment) represent an allocation of money within any customer accounts receivable account.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.PaymentsRequest;
import io.codat.accounting.models.operations.PaymentsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            PaymentsRequest req = PaymentsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .linkType("invoice")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            PaymentsResponse res = sdk.payments().payments()
                .request(req)
                .call();

            if (res.payments().isPresent()) {
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

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [PaymentsRequest](../../models/operations/PaymentsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[PaymentsResponse](../../models/operations/PaymentsResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/ErrorMessage          | 400,401,402,403,404,409,429,500,503 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |
