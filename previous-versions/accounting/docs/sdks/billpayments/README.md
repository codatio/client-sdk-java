# BillPayments
(*billPayments()*)

## Overview

Bill payments

### Available Operations

* [create](#create) - Create bill payments
* [delete](#delete) - Delete bill payment
* [get](#get) - Get bill payment
* [getCreateModel](#getcreatemodel) - Get create bill payment model
* [list](#list) - List bill payments

## create

The *Create bill payment* endpoint creates a new [bill payment](https://docs.codat.io/accounting-api#/schemas/BillPayment) for a given company's connection.

[Bill payments](https://docs.codat.io/accounting-api#/schemas/BillPayment) are an allocation of money within any customer accounts payable account.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create bill payment model](https://docs.codat.io/accounting-api#/operations/get-create-billPayments-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=billPayments) for integrations that support creating a bill payment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AccountRef;
import io.codat.accounting.models.components.BillPayment;
import io.codat.accounting.models.components.BillPaymentLine;
import io.codat.accounting.models.components.BillPaymentLineLink;
import io.codat.accounting.models.components.BillPaymentLineLinkType;
import io.codat.accounting.models.components.Metadata;
import io.codat.accounting.models.components.PaymentMethodRef;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.components.SupplementalData;
import io.codat.accounting.models.components.SupplierRef;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.CreateBillPaymentRequest;
import io.codat.accounting.models.operations.CreateBillPaymentResponse;
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

            CreateBillPaymentRequest req = CreateBillPaymentRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .billPayment(BillPayment.builder()
                    .date("2022-10-23T00:00:00Z")
                    .accountRef(AccountRef.builder()
                        .id("<id>")
                        .name("<value>")
                        .build())
                    .currency("USD")
                    .currencyRate(6384.24d)
                    .id("3d5a8e00-d108-4045-8823-7f342676cffa")
                    .lines(java.util.List.of(
                        BillPaymentLine.builder()
                            .amount(2884.08d)
                            .allocatedOnDate("2022-10-23T00:00:00Z")
                            .build()))
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .note("Bill Payment against bill c13e37b6-dfaa-4894-b3be-9fe97bda9f44")
                    .paymentMethodRef(PaymentMethodRef.builder()
                        .id("<value>")
                        .name("<value>")
                        .build())
                    .reference("<value>")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "<value>")))))
                        .build())
                    .supplierRef(SupplierRef.builder()
                        .id("<value>")
                        .supplierName("<value>")
                        .build())
                    .totalAmount(1329.54d)
                    .build())
                .timeoutInMinutes(69025)
                .build();

            CreateBillPaymentResponse res = sdk.billPayments().create()
                .request(req)
                .call();

            if (res.createBillPaymentResponse().isPresent()) {
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

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [io.codat.accounting.models.operations.CreateBillPaymentRequest](../../models/operations/CreateBillPaymentRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[Optional<? extends io.codat.accounting.models.operations.CreateBillPaymentResponse>](../../models/operations/CreateBillPaymentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## delete

The *Delete bill payment* endpoint allows you to delete a specified bill payment from an accounting platform.

[Bill payments](https://docs.codat.io/accounting-api#/schemas/BillPayment) are an allocation of money within any customer accounts payable account.

### Process
1. Pass the `{billPaymentId}` to the *Delete bill payment* endpoint and store the `pushOperationKey` returned.
2. Check the status of the delete operation by checking the status of the push operation either via
   1. [Push operation webhook](https://docs.codat.io/introduction/webhooks/core-rules-types#push-operation-status-has-changed) (advised),
   2. [Push operation status endpoint](https://docs.codat.io/codat-api#/operations/get-push-operation).

   A `Success` status indicates that the bill payment object was deleted from the accounting platform.
3. (Optional) Check that the bill payment was deleted from the accounting platform.

### Effect on related objects
Be aware that deleting a bill payment from an accounting platform might cause related objects to be modified.

## Integration specifics
Integrations that support soft delete do not permanently delete the object in the accounting platform.

| Integration | Soft Delete | Details |
|-------------|-------------|---------|
| QuickBooks Online  | No  | -
| QuickBooks Desktop | No  | -
| Oracle NetSuite    | No  | See [here](/integrations/accounting/netsuite/accounting-netsuite-how-deleting-bill-payments-works) to learn more.
| Xero               | Yes | -     
| Sage Intacct       | No  | Some bill payments in Sage Intacct can only be deleted, whilst others can only be voided. Codat have applied logic to handle this complexity. 

> **Supported integrations**
>
> This functionality is currently supported for our QuickBooks Online, QuickBooks Desktop, Oracle NetSuite, Xero and Sage Intacct integrations.

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.DeleteBillPaymentRequest;
import io.codat.accounting.models.operations.DeleteBillPaymentResponse;
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

            DeleteBillPaymentRequest req = DeleteBillPaymentRequest.builder()
                .billPaymentId("<value>")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            DeleteBillPaymentResponse res = sdk.billPayments().delete()
                .request(req)
                .call();

            if (res.pushOperationSummary().isPresent()) {
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

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [io.codat.accounting.models.operations.DeleteBillPaymentRequest](../../models/operations/DeleteBillPaymentRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[Optional<? extends io.codat.accounting.models.operations.DeleteBillPaymentResponse>](../../models/operations/DeleteBillPaymentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## get

The *Get bill payment* endpoint returns a single bill payment for a given billPaymentId.

[Bill payments](https://docs.codat.io/accounting-api#/schemas/BillPayment) are an allocation of money within any customer accounts payable account.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=billPayments) for integrations that support getting a specific bill payment.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetBillPaymentsRequest;
import io.codat.accounting.models.operations.GetBillPaymentsResponse;
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

            GetBillPaymentsRequest req = GetBillPaymentsRequest.builder()
                .billPaymentId("<value>")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetBillPaymentsResponse res = sdk.billPayments().get()
                .request(req)
                .call();

            if (res.billPayment().isPresent()) {
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
| `request`                                                                                                         | [io.codat.accounting.models.operations.GetBillPaymentsRequest](../../models/operations/GetBillPaymentsRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetBillPaymentsResponse>](../../models/operations/GetBillPaymentsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateModel

The *Get create bill payment model* endpoint returns the expected data for the request payload when creating a [bill payment](https://docs.codat.io/accounting-api#/schemas/BillPayment) for a given company and integration.

[Bill payments](https://docs.codat.io/accounting-api#/schemas/BillPayment) are an allocation of money within any customer accounts payable account.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=billPayments) for integrations that support creating a bill payment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetCreateBillPaymentsModelRequest;
import io.codat.accounting.models.operations.GetCreateBillPaymentsModelResponse;
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

            GetCreateBillPaymentsModelRequest req = GetCreateBillPaymentsModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateBillPaymentsModelResponse res = sdk.billPayments().getCreateModel()
                .request(req)
                .call();

            if (res.pushOption().isPresent()) {
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

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [io.codat.accounting.models.operations.GetCreateBillPaymentsModelRequest](../../models/operations/GetCreateBillPaymentsModelRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetCreateBillPaymentsModelResponse>](../../models/operations/GetCreateBillPaymentsModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List bill payments* endpoint returns a list of [bill payments](https://docs.codat.io/accounting-api#/schemas/BillPayment) for a given company's connection.

[Bill payments](https://docs.codat.io/accounting-api#/schemas/BillPayment) are an allocation of money within any customer accounts payable account.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.ListBillPaymentsRequest;
import io.codat.accounting.models.operations.ListBillPaymentsResponse;
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

            ListBillPaymentsRequest req = ListBillPaymentsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListBillPaymentsResponse res = sdk.billPayments().list()
                .request(req)
                .call();

            if (res.billPayments().isPresent()) {
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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [io.codat.accounting.models.operations.ListBillPaymentsRequest](../../models/operations/ListBillPaymentsRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[Optional<? extends io.codat.accounting.models.operations.ListBillPaymentsResponse>](../../models/operations/ListBillPaymentsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
