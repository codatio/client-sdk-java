# BillCreditNotes
(*billCreditNotes()*)

## Overview

Bill credit notes

### Available Operations

* [create](#create) - Create bill credit note
* [get](#get) - Get bill credit note
* [getCreateUpdateModel](#getcreateupdatemodel) - Get create/update bill credit note model
* [list](#list) - List bill credit notes
* [update](#update) - Update bill credit note
* [uploadAttachment](#uploadattachment) - Upload bill credit note attachment

## create

The *Create bill credit note* endpoint creates a new [bill credit note](https://docs.codat.io/accounting-api#/schemas/BillCreditNote) for a given company's connection.

[Bill credit notes](https://docs.codat.io/accounting-api#/schemas/BillCreditNote) are issued by a supplier for the purpose of recording credit.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update bill credit note model](https://docs.codat.io/accounting-api#/operations/get-create-update-billCreditNotes-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=billCreditNotes) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AccountRef;
import io.codat.accounting.models.components.AccountingCustomerRef;
import io.codat.accounting.models.components.Allocation;
import io.codat.accounting.models.components.BillCreditNote;
import io.codat.accounting.models.components.BillCreditNoteLineItem;
import io.codat.accounting.models.components.BillCreditNoteLineItemTracking;
import io.codat.accounting.models.components.BillCreditNoteStatus;
import io.codat.accounting.models.components.BilledToType;
import io.codat.accounting.models.components.ItemRef;
import io.codat.accounting.models.components.Metadata;
import io.codat.accounting.models.components.PaymentAllocationItems;
import io.codat.accounting.models.components.PaymentAllocationPayment;
import io.codat.accounting.models.components.ProjectRef;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.components.SupplementalData;
import io.codat.accounting.models.components.SupplierRef;
import io.codat.accounting.models.components.TaxRateRef;
import io.codat.accounting.models.components.TrackingCategoryRef;
import io.codat.accounting.models.components.WithholdingTaxItems;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.CreateBillCreditNoteRequest;
import io.codat.accounting.models.operations.CreateBillCreditNoteResponse;
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

            CreateBillCreditNoteRequest req = CreateBillCreditNoteRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .billCreditNote(BillCreditNote.builder()
                    .discountPercentage(0d)
                    .status(BillCreditNoteStatus.PAID)
                    .subTotal(805.78d)
                    .totalAmount(805.78d)
                    .totalDiscount(0d)
                    .totalTaxAmount(0d)
                    .allocatedOnDate("2022-10-23T00:00:00Z")
                    .billCreditNoteNumber("91fe2a83-e161-4c21-929d-c5c10c4b07e5")
                    .currency("USD")
                    .currencyRate(6384.24d)
                    .id("1509398f-98e2-436d-8a5d-c042e0c74ffc")
                    .issueDate("2022-10-23T00:00:00Z")
                    .lineItems(java.util.List.of(
                        BillCreditNoteLineItem.builder()
                            .quantity(1343.65d)
                            .unitAmount(7865.46d)
                            .build()))
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .note("Bill Credit Note with 1 line items, totaling 805.78")
                    .paymentAllocations(java.util.List.of(
                        PaymentAllocationItems.builder()
                            .allocation(Allocation.builder()
                                    .allocatedOnDate("2022-10-23T00:00:00Z")
                                    .currency("GBP")
                                    .currencyRate(4552.22d)
                                    .totalAmount(1697.27d)
                                    .build())
                            .payment(PaymentAllocationPayment.builder()
                                    .accountRef(AccountRef.builder()
                                        .id("<id>")
                                        .name("<value>")
                                        .build())
                                    .currency("GBP")
                                    .currencyRate(899.64d)
                                    .id("<id>")
                                    .note("<value>")
                                    .paidOnDate("2022-10-23T00:00:00Z")
                                    .reference("<value>")
                                    .totalAmount(7926.2d)
                                    .build())
                            .build()))
                    .remainingCredit(0d)
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
                    .withholdingTax(java.util.List.of(
                        WithholdingTaxItems.builder()
                            .amount(5519.29d)
                            .name("<value>")
                            .build()))
                    .build())
                .timeoutInMinutes(586220)
                .build();

            CreateBillCreditNoteResponse res = sdk.billCreditNotes().create()
                .request(req)
                .call();

            if (res.createBillCreditNoteResponse().isPresent()) {
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

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [io.codat.accounting.models.operations.CreateBillCreditNoteRequest](../../models/operations/CreateBillCreditNoteRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[Optional<? extends io.codat.accounting.models.operations.CreateBillCreditNoteResponse>](../../models/operations/CreateBillCreditNoteResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## get

The *Get bill credit note* endpoint returns a single bill credit note for a given billCreditNoteId.

[Bill credit notes](https://docs.codat.io/accounting-api#/schemas/BillCreditNote) are issued by a supplier for the purpose of recording credit.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=billCreditNotes) for integrations that support getting a specific bill credit note.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetBillCreditNoteRequest;
import io.codat.accounting.models.operations.GetBillCreditNoteResponse;
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

            GetBillCreditNoteRequest req = GetBillCreditNoteRequest.builder()
                .billCreditNoteId("<value>")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetBillCreditNoteResponse res = sdk.billCreditNotes().get()
                .request(req)
                .call();

            if (res.billCreditNote().isPresent()) {
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
| `request`                                                                                                             | [io.codat.accounting.models.operations.GetBillCreditNoteRequest](../../models/operations/GetBillCreditNoteRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetBillCreditNoteResponse>](../../models/operations/GetBillCreditNoteResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateUpdateModel

The *Get create/update bill credit note model* endpoint returns the expected data for the request payload when creating and updating a [bill credit note](https://docs.codat.io/accounting-api#/schemas/BillCreditNote) for a given company and integration.

[Bill credit notes](https://docs.codat.io/accounting-api#/schemas/BillCreditNote) are issued by a supplier for the purpose of recording credit.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=billCreditNotes) for integrations that support creating and updating a bill credit note.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetCreateUpdateBillCreditNotesModelRequest;
import io.codat.accounting.models.operations.GetCreateUpdateBillCreditNotesModelResponse;
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

            GetCreateUpdateBillCreditNotesModelRequest req = GetCreateUpdateBillCreditNotesModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateUpdateBillCreditNotesModelResponse res = sdk.billCreditNotes().getCreateUpdateModel()
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

| Parameter                                                                                                                                                 | Type                                                                                                                                                      | Required                                                                                                                                                  | Description                                                                                                                                               |
| --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                 | [io.codat.accounting.models.operations.GetCreateUpdateBillCreditNotesModelRequest](../../models/operations/GetCreateUpdateBillCreditNotesModelRequest.md) | :heavy_check_mark:                                                                                                                                        | The request object to use for the request.                                                                                                                |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetCreateUpdateBillCreditNotesModelResponse>](../../models/operations/GetCreateUpdateBillCreditNotesModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List bill credit notes* endpoint returns a list of [bill credit notes](https://docs.codat.io/accounting-api#/schemas/BillCreditNote) for a given company's connection.

[Bill credit notes](https://docs.codat.io/accounting-api#/schemas/BillCreditNote) are issued by a supplier for the purpose of recording credit.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.ListBillCreditNotesRequest;
import io.codat.accounting.models.operations.ListBillCreditNotesResponse;
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

            ListBillCreditNotesRequest req = ListBillCreditNotesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListBillCreditNotesResponse res = sdk.billCreditNotes().list()
                .request(req)
                .call();

            if (res.billCreditNotes().isPresent()) {
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

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [io.codat.accounting.models.operations.ListBillCreditNotesRequest](../../models/operations/ListBillCreditNotesRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[Optional<? extends io.codat.accounting.models.operations.ListBillCreditNotesResponse>](../../models/operations/ListBillCreditNotesResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## update

The *Update bill credit note* endpoint updates an existing [bill credit note](https://docs.codat.io/accounting-api#/schemas/BillCreditNote) for a given company's connection.

[Bill credit notes](https://docs.codat.io/accounting-api#/schemas/BillCreditNote) are issued by a supplier for the purpose of recording credit.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update bill credit note model](https://docs.codat.io/accounting-api#/operations/get-create-update-billCreditNotes-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=billCreditNotes) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AccountRef;
import io.codat.accounting.models.components.AccountingCustomerRef;
import io.codat.accounting.models.components.Allocation;
import io.codat.accounting.models.components.BillCreditNote;
import io.codat.accounting.models.components.BillCreditNoteLineItem;
import io.codat.accounting.models.components.BillCreditNoteLineItemTracking;
import io.codat.accounting.models.components.BillCreditNoteStatus;
import io.codat.accounting.models.components.BilledToType;
import io.codat.accounting.models.components.ItemRef;
import io.codat.accounting.models.components.Metadata;
import io.codat.accounting.models.components.PaymentAllocationItems;
import io.codat.accounting.models.components.PaymentAllocationPayment;
import io.codat.accounting.models.components.ProjectRef;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.components.SupplementalData;
import io.codat.accounting.models.components.SupplierRef;
import io.codat.accounting.models.components.TaxRateRef;
import io.codat.accounting.models.components.TrackingCategoryRef;
import io.codat.accounting.models.components.WithholdingTaxItems;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.UpdateBillCreditNoteRequest;
import io.codat.accounting.models.operations.UpdateBillCreditNoteResponse;
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

            UpdateBillCreditNoteRequest req = UpdateBillCreditNoteRequest.builder()
                .billCreditNoteId("<value>")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .billCreditNote(BillCreditNote.builder()
                    .discountPercentage(0d)
                    .status(BillCreditNoteStatus.PAID)
                    .subTotal(805.78d)
                    .totalAmount(805.78d)
                    .totalDiscount(0d)
                    .totalTaxAmount(0d)
                    .allocatedOnDate("2022-10-23T00:00:00Z")
                    .billCreditNoteNumber("91fe2a83-e161-4c21-929d-c5c10c4b07e5")
                    .currency("GBP")
                    .currencyRate(5971.29d)
                    .id("1509398f-98e2-436d-8a5d-c042e0c74ffc")
                    .issueDate("2022-10-23T00:00:00Z")
                    .lineItems(java.util.List.of(
                        BillCreditNoteLineItem.builder()
                            .quantity(9914.64d)
                            .unitAmount(2703.24d)
                            .build()))
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .note("Bill Credit Note with 1 line items, totaling 805.78")
                    .paymentAllocations(java.util.List.of(
                        PaymentAllocationItems.builder()
                            .allocation(Allocation.builder()
                                    .allocatedOnDate("2022-10-23T00:00:00Z")
                                    .currency("GBP")
                                    .currencyRate(2782.81d)
                                    .totalAmount(8965.01d)
                                    .build())
                            .payment(PaymentAllocationPayment.builder()
                                    .accountRef(AccountRef.builder()
                                        .id("<id>")
                                        .name("<value>")
                                        .build())
                                    .currency("USD")
                                    .currencyRate(4468.63d)
                                    .id("<id>")
                                    .note("<value>")
                                    .paidOnDate("2022-10-23T00:00:00Z")
                                    .reference("<value>")
                                    .totalAmount(3115.07d)
                                    .build())
                            .build()))
                    .remainingCredit(0d)
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
                    .withholdingTax(java.util.List.of(
                        WithholdingTaxItems.builder()
                            .amount(3668.07d)
                            .name("<value>")
                            .build()))
                    .build())
                .forceUpdate(false)
                .timeoutInMinutes(139579)
                .build();

            UpdateBillCreditNoteResponse res = sdk.billCreditNotes().update()
                .request(req)
                .call();

            if (res.updateBillCreditNoteResponse().isPresent()) {
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

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [io.codat.accounting.models.operations.UpdateBillCreditNoteRequest](../../models/operations/UpdateBillCreditNoteRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[Optional<? extends io.codat.accounting.models.operations.UpdateBillCreditNoteResponse>](../../models/operations/UpdateBillCreditNoteResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## uploadAttachment

---
stoplight-id: c26f5b1b19168
---

The *Upload bill credit note attachment* endpoint uploads an attachment and assigns it against a specific `billCreditNoteId`.

[Bill Credit Notes](https://docs.codat.io/accounting-api#/schemas/BillCreditNote) are issued by a supplier for the purpose of recording credit.

**Integration-specific behaviour**

For more details on supported file types by integration see [Attachments](https://docs.codat.io/accounting-api#/schemas/Attachment).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=billCreditNotes) for integrations that support uploading a bill credit note attachment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AttachmentUpload;
import io.codat.accounting.models.components.CodatFile;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.UploadBillCreditNoteAttachmentRequest;
import io.codat.accounting.models.operations.UploadBillCreditNoteAttachmentResponse;
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

            UploadBillCreditNoteAttachmentRequest req = UploadBillCreditNoteAttachmentRequest.builder()
                .billCreditNoteId("<value>")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .attachmentUpload(AttachmentUpload.builder()
                    .file(CodatFile.builder()
                            .content("0xE3ABc1980E".getBytes())
                            .fileName("<value>")
                            .build())
                    .build())
                .build();

            UploadBillCreditNoteAttachmentResponse res = sdk.billCreditNotes().uploadAttachment()
                .request(req)
                .call();

            // handle response
        } catch (io.codat.accounting.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                       | [io.codat.accounting.models.operations.UploadBillCreditNoteAttachmentRequest](../../models/operations/UploadBillCreditNoteAttachmentRequest.md) | :heavy_check_mark:                                                                                                                              | The request object to use for the request.                                                                                                      |


### Response

**[Optional<? extends io.codat.accounting.models.operations.UploadBillCreditNoteAttachmentResponse>](../../models/operations/UploadBillCreditNoteAttachmentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
