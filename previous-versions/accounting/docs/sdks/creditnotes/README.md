# CreditNotes
(*creditNotes()*)

## Overview

Credit notes

### Available Operations

* [create](#create) - Create credit note
* [get](#get) - Get credit note
* [getCreateUpdateModel](#getcreateupdatemodel) - Get create/update credit note model
* [list](#list) - List credit notes
* [update](#update) - Update credit note

## create

The *Create credit note* endpoint creates a new [credit note](https://docs.codat.io/accounting-api#/schemas/CreditNote) for a given company's connection.

[Credit notes](https://docs.codat.io/accounting-api#/schemas/CreditNote) are issued to a customer to indicate debt, typically with reference to a previously issued invoice and/or purchase.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update credit note model](https://docs.codat.io/accounting-api#/operations/get-create-update-creditNotes-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=creditNotes) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AccountRef;
import io.codat.accounting.models.components.AccountingCustomerRef;
import io.codat.accounting.models.components.Allocation;
import io.codat.accounting.models.components.BilledToType1;
import io.codat.accounting.models.components.CreditNote;
import io.codat.accounting.models.components.CreditNoteLineItem;
import io.codat.accounting.models.components.CreditNoteLineItemTracking;
import io.codat.accounting.models.components.CreditNoteStatus;
import io.codat.accounting.models.components.InvoiceTo;
import io.codat.accounting.models.components.ItemRef;
import io.codat.accounting.models.components.Metadata;
import io.codat.accounting.models.components.PaymentAllocationItems;
import io.codat.accounting.models.components.PaymentAllocationPayment;
import io.codat.accounting.models.components.ProjectRef;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.components.SupplementalData;
import io.codat.accounting.models.components.TaxRateRef;
import io.codat.accounting.models.components.TrackingCategoryRef;
import io.codat.accounting.models.components.WithholdingTaxItems;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.CreateCreditNoteRequest;
import io.codat.accounting.models.operations.CreateCreditNoteResponse;
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

            CreateCreditNoteRequest req = CreateCreditNoteRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .creditNote(CreditNote.builder()
                    .discountPercentage(4865.89d)
                    .remainingCredit(4893.82d)
                    .status(CreditNoteStatus.PAID)
                    .subTotal(8592.13d)
                    .totalAmount(4174.58d)
                    .totalDiscount(2884.08d)
                    .totalTaxAmount(1343.65d)
                    .additionalTaxAmount(7865.46d)
                    .additionalTaxPercentage(690.25d)
                    .allocatedOnDate("2022-10-23T00:00:00Z")
                    .creditNoteNumber("<value>")
                    .currency("EUR")
                    .currencyRate(3768.44d)
                    .customerRef(AccountingCustomerRef.builder()
                        .id("<value>")
                        .companyName("Toy, Abbott and Klocko")
                        .build())
                    .id("<id>")
                    .issueDate("2022-10-23T00:00:00Z")
                    .lineItems(java.util.List.of(
                        CreditNoteLineItem.builder()
                            .quantity(7150.4d)
                            .unitAmount(7926.2d)
                            .build()))
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .note("<value>")
                    .paymentAllocations(java.util.List.of(
                        PaymentAllocationItems.builder()
                            .allocation(Allocation.builder()
                                    .allocatedOnDate("2022-10-23T00:00:00Z")
                                    .currency("USD")
                                    .currencyRate(9574.09d)
                                    .totalAmount(6562.56d)
                                    .build())
                            .payment(PaymentAllocationPayment.builder()
                                    .accountRef(AccountRef.builder()
                                        .id("<id>")
                                        .name("<value>")
                                        .build())
                                    .currency("USD")
                                    .currencyRate(285.48d)
                                    .id("<id>")
                                    .note("<value>")
                                    .paidOnDate("2022-10-23T00:00:00Z")
                                    .reference("<value>")
                                    .totalAmount(9011.76d)
                                    .build())
                            .build()))
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "<value>")))))
                        .build())
                    .withholdingTax(java.util.List.of(
                        WithholdingTaxItems.builder()
                            .amount(2303.13d)
                            .name("<value>")
                            .build()))
                    .build())
                .timeoutInMinutes(207565)
                .build();

            CreateCreditNoteResponse res = sdk.creditNotes().create()
                .request(req)
                .call();

            if (res.createCreditNoteResponse().isPresent()) {
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
| `request`                                                                                                           | [io.codat.accounting.models.operations.CreateCreditNoteRequest](../../models/operations/CreateCreditNoteRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[Optional<? extends io.codat.accounting.models.operations.CreateCreditNoteResponse>](../../models/operations/CreateCreditNoteResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## get

The *Get credit note* endpoint returns a single credit note for a given creditNoteId.

[Credit notes](https://docs.codat.io/accounting-api#/schemas/CreditNote) are issued to a customer to indicate debt, typically with reference to a previously issued invoice and/or purchase.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=creditNotes) for integrations that support getting a specific credit note.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetCreditNoteRequest;
import io.codat.accounting.models.operations.GetCreditNoteResponse;
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

            GetCreditNoteRequest req = GetCreditNoteRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .creditNoteId("<value>")
                .build();

            GetCreditNoteResponse res = sdk.creditNotes().get()
                .request(req)
                .call();

            if (res.creditNote().isPresent()) {
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
| `request`                                                                                                     | [io.codat.accounting.models.operations.GetCreditNoteRequest](../../models/operations/GetCreditNoteRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetCreditNoteResponse>](../../models/operations/GetCreditNoteResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateUpdateModel

﻿The *Get create/update credit note model* endpoint returns the expected data for the request payload when creating and updating a [credit note](https://docs.codat.io/accounting-api#/schemas/CreditNote) for a given company and integration.

[Credit notes](https://docs.codat.io/accounting-api#/schemas/CreditNote) are issued to a customer to indicate debt, typically with reference to a previously issued invoice and/or purchase.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=creditNotes) for integrations that support creating and updating a credit note.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetCreateUpdateCreditNotesModelRequest;
import io.codat.accounting.models.operations.GetCreateUpdateCreditNotesModelResponse;
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

            GetCreateUpdateCreditNotesModelRequest req = GetCreateUpdateCreditNotesModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateUpdateCreditNotesModelResponse res = sdk.creditNotes().getCreateUpdateModel()
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

| Parameter                                                                                                                                         | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                         | [io.codat.accounting.models.operations.GetCreateUpdateCreditNotesModelRequest](../../models/operations/GetCreateUpdateCreditNotesModelRequest.md) | :heavy_check_mark:                                                                                                                                | The request object to use for the request.                                                                                                        |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetCreateUpdateCreditNotesModelResponse>](../../models/operations/GetCreateUpdateCreditNotesModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List credit notes* endpoint returns a list of [credit notes](https://docs.codat.io/accounting-api#/schemas/CreditNote) for a given company's connection.

[Credit notes](https://docs.codat.io/accounting-api#/schemas/CreditNote) are issued to a customer to indicate debt, typically with reference to a previously issued invoice and/or purchase.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.ListCreditNotesRequest;
import io.codat.accounting.models.operations.ListCreditNotesResponse;
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

            ListCreditNotesRequest req = ListCreditNotesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListCreditNotesResponse res = sdk.creditNotes().list()
                .request(req)
                .call();

            if (res.creditNotes().isPresent()) {
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
| `request`                                                                                                         | [io.codat.accounting.models.operations.ListCreditNotesRequest](../../models/operations/ListCreditNotesRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[Optional<? extends io.codat.accounting.models.operations.ListCreditNotesResponse>](../../models/operations/ListCreditNotesResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## update

The *Update credit note* endpoint updates an existing [credit note](https://docs.codat.io/accounting-api#/schemas/CreditNote) for a given company's connection.

[Credit notes](https://docs.codat.io/accounting-api#/schemas/CreditNote) are issued to a customer to indicate debt, typically with reference to a previously issued invoice and/or purchase.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update credit note model](https://docs.codat.io/accounting-api#/operations/get-create-update-creditNotes-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=creditNotes) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AccountRef;
import io.codat.accounting.models.components.AccountingCustomerRef;
import io.codat.accounting.models.components.Allocation;
import io.codat.accounting.models.components.BilledToType1;
import io.codat.accounting.models.components.CreditNote;
import io.codat.accounting.models.components.CreditNoteLineItem;
import io.codat.accounting.models.components.CreditNoteLineItemTracking;
import io.codat.accounting.models.components.CreditNoteStatus;
import io.codat.accounting.models.components.InvoiceTo;
import io.codat.accounting.models.components.ItemRef;
import io.codat.accounting.models.components.Metadata;
import io.codat.accounting.models.components.PaymentAllocationItems;
import io.codat.accounting.models.components.PaymentAllocationPayment;
import io.codat.accounting.models.components.ProjectRef;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.components.SupplementalData;
import io.codat.accounting.models.components.TaxRateRef;
import io.codat.accounting.models.components.TrackingCategoryRef;
import io.codat.accounting.models.components.WithholdingTaxItems;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.UpdateCreditNoteRequest;
import io.codat.accounting.models.operations.UpdateCreditNoteResponse;
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

            UpdateCreditNoteRequest req = UpdateCreditNoteRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .creditNoteId("<value>")
                .creditNote(CreditNote.builder()
                    .discountPercentage(8574.78d)
                    .remainingCredit(245.55d)
                    .status(CreditNoteStatus.PAID)
                    .subTotal(156.52d)
                    .totalAmount(3446.2d)
                    .totalDiscount(7084.55d)
                    .totalTaxAmount(9914.64d)
                    .additionalTaxAmount(2703.24d)
                    .additionalTaxPercentage(6276.9d)
                    .allocatedOnDate("2022-10-23T00:00:00Z")
                    .creditNoteNumber("<value>")
                    .currency("USD")
                    .currencyRate(4430.76d)
                    .customerRef(AccountingCustomerRef.builder()
                        .id("<value>")
                        .companyName("Collier, Becker and Gottlieb")
                        .build())
                    .id("<id>")
                    .issueDate("2022-10-23T00:00:00Z")
                    .lineItems(java.util.List.of(
                        CreditNoteLineItem.builder()
                            .quantity(3691.82d)
                            .unitAmount(3115.07d)
                            .build()))
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .note("<value>")
                    .paymentAllocations(java.util.List.of(
                        PaymentAllocationItems.builder()
                            .allocation(Allocation.builder()
                                    .allocatedOnDate("2022-10-23T00:00:00Z")
                                    .currency("EUR")
                                    .currencyRate(8898.38d)
                                    .totalAmount(3451.87d)
                                    .build())
                            .payment(PaymentAllocationPayment.builder()
                                    .accountRef(AccountRef.builder()
                                        .id("<id>")
                                        .name("<value>")
                                        .build())
                                    .currency("GBP")
                                    .currencyRate(118.73d)
                                    .id("<id>")
                                    .note("<value>")
                                    .paidOnDate("2022-10-23T00:00:00Z")
                                    .reference("<value>")
                                    .totalAmount(4380.51d)
                                    .build())
                            .build()))
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "<value>")))))
                        .build())
                    .withholdingTax(java.util.List.of(
                        WithholdingTaxItems.builder()
                            .amount(6935.08d)
                            .name("<value>")
                            .build()))
                    .build())
                .forceUpdate(false)
                .timeoutInMinutes(957481)
                .build();

            UpdateCreditNoteResponse res = sdk.creditNotes().update()
                .request(req)
                .call();

            if (res.updateCreditNoteResponse().isPresent()) {
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
| `request`                                                                                                           | [io.codat.accounting.models.operations.UpdateCreditNoteRequest](../../models/operations/UpdateCreditNoteRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[Optional<? extends io.codat.accounting.models.operations.UpdateCreditNoteResponse>](../../models/operations/UpdateCreditNoteResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
