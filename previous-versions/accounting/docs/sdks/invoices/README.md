# Invoices
(*invoices()*)

## Overview

Invoices

### Available Operations

* [create](#create) - Create invoice
* [delete](#delete) - Delete invoice
* [downloadAttachment](#downloadattachment) - Download invoice attachment
* [downloadPdf](#downloadpdf) - Get invoice as PDF
* [get](#get) - Get invoice
* [getAttachment](#getattachment) - Get invoice attachment
* [getCreateUpdateModel](#getcreateupdatemodel) - Get create/update invoice model
* [list](#list) - List invoices
* [listAttachments](#listattachments) - List invoice attachments
* [update](#update) - Update invoice
* [uploadAttachment](#uploadattachment) - Upload invoice attachment

## create

The *Create invoice* endpoint creates a new [invoice](https://docs.codat.io/accounting-api#/schemas/Invoice) for a given company's connection.

[Invoices](https://docs.codat.io/accounting-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update invoice model](https://docs.codat.io/accounting-api#/operations/get-create-update-invoices-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=invoices) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AccountRef;
import io.codat.accounting.models.components.AccountingCustomerRef;
import io.codat.accounting.models.components.Allocation;
import io.codat.accounting.models.components.BilledToType1;
import io.codat.accounting.models.components.Invoice;
import io.codat.accounting.models.components.InvoiceLineItem;
import io.codat.accounting.models.components.InvoiceStatus;
import io.codat.accounting.models.components.InvoiceTo;
import io.codat.accounting.models.components.ItemRef;
import io.codat.accounting.models.components.Metadata;
import io.codat.accounting.models.components.PaymentAllocationItems;
import io.codat.accounting.models.components.PaymentAllocationPayment;
import io.codat.accounting.models.components.ProjectRef;
import io.codat.accounting.models.components.PropertieTracking1;
import io.codat.accounting.models.components.SalesOrderRef;
import io.codat.accounting.models.components.SalesOrderRefDataType;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.components.SupplementalData;
import io.codat.accounting.models.components.TaxRateRef;
import io.codat.accounting.models.components.TrackingCategoryRef;
import io.codat.accounting.models.components.WithholdingTaxItems;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.CreateInvoiceRequest;
import io.codat.accounting.models.operations.CreateInvoiceResponse;
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

            CreateInvoiceRequest req = CreateInvoiceRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .invoice(Invoice.builder()
                    .amountDue(4865.89d)
                    .issueDate("2022-10-23T00:00:00Z")
                    .status(InvoiceStatus.PARTIALLY_PAID)
                    .totalAmount(8592.13d)
                    .totalTaxAmount(4174.58d)
                    .additionalTaxAmount(2884.08d)
                    .additionalTaxPercentage(1343.65d)
                    .currency("EUR")
                    .currencyRate(690.25d)
                    .customerRef(AccountingCustomerRef.builder()
                        .id("<value>")
                        .companyName("Schinner, Hodkiewicz and Wiegand")
                        .build())
                    .discountPercentage(8915.1d)
                    .dueDate("2022-10-23T00:00:00Z")
                    .id("<id>")
                    .invoiceNumber("<value>")
                    .lineItems(java.util.List.of(
                        InvoiceLineItem.builder()
                            .quantity(3015.1d)
                            .unitAmount(899.64d)
                            .build()))
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .note("<value>")
                    .paidOnDate("2022-10-23T00:00:00Z")
                    .paymentAllocations(java.util.List.of(
                        PaymentAllocationItems.builder()
                            .allocation(Allocation.builder()
                                    .allocatedOnDate("2022-10-23T00:00:00Z")
                                    .currency("EUR")
                                    .currencyRate(4915.7d)
                                    .totalAmount(9574.09d)
                                    .build())
                            .payment(PaymentAllocationPayment.builder()
                                    .accountRef(AccountRef.builder()
                                        .id("<id>")
                                        .name("<value>")
                                        .build())
                                    .currency("USD")
                                    .currencyRate(3570.21d)
                                    .id("<id>")
                                    .note("<value>")
                                    .paidOnDate("2022-10-23T00:00:00Z")
                                    .reference("<value>")
                                    .totalAmount(2596.29d)
                                    .build())
                            .build()))
                    .salesOrderRefs(java.util.List.of(
                        SalesOrderRef.builder()
                            .build()))
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .subTotal(177.59d)
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "<value>")))))
                        .build())
                    .totalDiscount(5190.28d)
                    .withholdingTax(java.util.List.of(
                        WithholdingTaxItems.builder()
                            .amount(2075.65d)
                            .name("<value>")
                            .build()))
                    .build())
                .timeoutInMinutes(211337)
                .build();

            CreateInvoiceResponse res = sdk.invoices().create()
                .request(req)
                .call();

            if (res.createInvoiceResponse().isPresent()) {
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
| `request`                                                                                                     | [io.codat.accounting.models.operations.CreateInvoiceRequest](../../models/operations/CreateInvoiceRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends io.codat.accounting.models.operations.CreateInvoiceResponse>](../../models/operations/CreateInvoiceResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## delete

﻿The *Delete invoice* endpoint allows you to delete a specified invoice from an accounting platform.

[Invoices](https://docs.codat.io/accounting-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.

### Process
1. Pass the `{invoiceId}` to the *Delete invoice* endpoint and store the `pushOperationKey` returned.
2. Check the status of the delete operation by checking the status of push operation either via
    1. [Push operation webhook](https://docs.codat.io/introduction/webhooks/core-rules-types#push-operation-status-has-changed) (advised),
    2. [Push operation status endpoint](https://docs.codat.io/codat-api#/operations/get-push-operation).

   A `Success` status indicates that the invoice object was deleted from the accounting platform.
3. (Optional) Check that the invoice was deleted from the accounting platform.

### Effect on related objects

Be aware that deleting an invoice from an accounting platform might cause related objects to be modified. For example, if you delete a paid invoice from QuickBooks Online, the invoice is deleted but the payment against that invoice is not. The payment is converted to a payment on account.

## Integration specifics
Integrations that support soft delete do not permanently delete the object in the accounting platform.

| Integration | Soft Deleted | 
|-------------|--------------|
| QuickBooks Online | Yes    |     

> **Supported Integrations**
> 
> This functionality is currently only supported for our QuickBooks Online integration. Check out our [public roadmap](https://portal.productboard.com/codat/7-public-product-roadmap/tabs/46-accounting-api) to see what we're building next, and to submit ideas for new features.
> We're increasing support for object deletion across various accounting platforms and data types. You can check our [Accounting API Public Product Roadmap](https://portal.productboard.com/codat/7-public-product-roadmap/tabs/46-accounting-api) for the latest status.

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.DeleteInvoiceRequest;
import io.codat.accounting.models.operations.DeleteInvoiceResponse;
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

            DeleteInvoiceRequest req = DeleteInvoiceRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .invoiceId("<value>")
                .build();

            DeleteInvoiceResponse res = sdk.invoices().delete()
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [io.codat.accounting.models.operations.DeleteInvoiceRequest](../../models/operations/DeleteInvoiceRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends io.codat.accounting.models.operations.DeleteInvoiceResponse>](../../models/operations/DeleteInvoiceResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## downloadAttachment

The *Download invoice attachment* endpoint downloads a specific attachment for a given `invoiceId` and `attachmentId`.

[Invoices](https://docs.codat.io/accounting-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=invoices) for integrations that support downloading an invoice attachment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.DownloadInvoiceAttachmentRequest;
import io.codat.accounting.models.operations.DownloadInvoiceAttachmentResponse;
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

            DownloadInvoiceAttachmentRequest req = DownloadInvoiceAttachmentRequest.builder()
                .attachmentId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .invoiceId("<value>")
                .build();

            DownloadInvoiceAttachmentResponse res = sdk.invoices().downloadAttachment()
                .request(req)
                .call();

            if (res.data().isPresent()) {
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

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [io.codat.accounting.models.operations.DownloadInvoiceAttachmentRequest](../../models/operations/DownloadInvoiceAttachmentRequest.md) | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |


### Response

**[Optional<? extends io.codat.accounting.models.operations.DownloadInvoiceAttachmentResponse>](../../models/operations/DownloadInvoiceAttachmentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## downloadPdf

﻿Download invoice as a pdf.

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.DownloadInvoicePdfRequest;
import io.codat.accounting.models.operations.DownloadInvoicePdfResponse;
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

            DownloadInvoicePdfRequest req = DownloadInvoicePdfRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .invoiceId("<value>")
                .build();

            DownloadInvoicePdfResponse res = sdk.invoices().downloadPdf()
                .request(req)
                .call();

            if (res.data().isPresent()) {
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

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [io.codat.accounting.models.operations.DownloadInvoicePdfRequest](../../models/operations/DownloadInvoicePdfRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[Optional<? extends io.codat.accounting.models.operations.DownloadInvoicePdfResponse>](../../models/operations/DownloadInvoicePdfResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## get

The *Get invoice* endpoint returns a single invoice for a given invoiceId.

[Invoices](https://docs.codat.io/accounting-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=invoices) for integrations that support getting a specific invoice.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetInvoiceRequest;
import io.codat.accounting.models.operations.GetInvoiceResponse;
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

            GetInvoiceRequest req = GetInvoiceRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .invoiceId("<value>")
                .build();

            GetInvoiceResponse res = sdk.invoices().get()
                .request(req)
                .call();

            if (res.invoice().isPresent()) {
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

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [io.codat.accounting.models.operations.GetInvoiceRequest](../../models/operations/GetInvoiceRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetInvoiceResponse>](../../models/operations/GetInvoiceResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getAttachment

The *Get invoice attachment* endpoint returns a specific attachment for a given `invoiceId` and `attachmentId`.

[Invoices](https://docs.codat.io/accounting-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=invoices) for integrations that support getting an invoice attachment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetInvoiceAttachmentRequest;
import io.codat.accounting.models.operations.GetInvoiceAttachmentResponse;
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

            GetInvoiceAttachmentRequest req = GetInvoiceAttachmentRequest.builder()
                .attachmentId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .invoiceId("<value>")
                .build();

            GetInvoiceAttachmentResponse res = sdk.invoices().getAttachment()
                .request(req)
                .call();

            if (res.attachment().isPresent()) {
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
| `request`                                                                                                                   | [io.codat.accounting.models.operations.GetInvoiceAttachmentRequest](../../models/operations/GetInvoiceAttachmentRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetInvoiceAttachmentResponse>](../../models/operations/GetInvoiceAttachmentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateUpdateModel

The *Get create/update invoice model* endpoint returns the expected data for the request payload when creating and updating an [invoice](https://docs.codat.io/accounting-api#/schemas/Invoice) for a given company and integration.

[Invoices](https://docs.codat.io/accounting-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=invoices) for integrations that support creating and updating an invoice.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetCreateUpdateInvoicesModelRequest;
import io.codat.accounting.models.operations.GetCreateUpdateInvoicesModelResponse;
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

            GetCreateUpdateInvoicesModelRequest req = GetCreateUpdateInvoicesModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateUpdateInvoicesModelResponse res = sdk.invoices().getCreateUpdateModel()
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

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [io.codat.accounting.models.operations.GetCreateUpdateInvoicesModelRequest](../../models/operations/GetCreateUpdateInvoicesModelRequest.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetCreateUpdateInvoicesModelResponse>](../../models/operations/GetCreateUpdateInvoicesModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List invoices* endpoint returns a list of [invoices](https://docs.codat.io/accounting-api#/schemas/Invoice) for a given company's connection.

[Invoices](https://docs.codat.io/accounting-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    
### Useful queries

- Outstanding invoices - `query = amountDue > 0`
- Invoices due after a certain date: `query = dueDate > 2021-01-28`

[Read more about querying](https://docs.codat.io/using-the-api/querying).

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.ListInvoicesRequest;
import io.codat.accounting.models.operations.ListInvoicesResponse;
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

            ListInvoicesRequest req = ListInvoicesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListInvoicesResponse res = sdk.invoices().list()
                .request(req)
                .call();

            if (res.invoices().isPresent()) {
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

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [io.codat.accounting.models.operations.ListInvoicesRequest](../../models/operations/ListInvoicesRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[Optional<? extends io.codat.accounting.models.operations.ListInvoicesResponse>](../../models/operations/ListInvoicesResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listAttachments

The *List invoice attachments* endpoint returns a list of attachments available to download for given `invoiceId`.

[Invoices](https://docs.codat.io/accounting-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=invoices) for integrations that support listing invoice attachments.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.ListInvoiceAttachmentsRequest;
import io.codat.accounting.models.operations.ListInvoiceAttachmentsResponse;
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

            ListInvoiceAttachmentsRequest req = ListInvoiceAttachmentsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .invoiceId("<value>")
                .build();

            ListInvoiceAttachmentsResponse res = sdk.invoices().listAttachments()
                .request(req)
                .call();

            if (res.attachmentsDataset().isPresent()) {
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

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [io.codat.accounting.models.operations.ListInvoiceAttachmentsRequest](../../models/operations/ListInvoiceAttachmentsRequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |


### Response

**[Optional<? extends io.codat.accounting.models.operations.ListInvoiceAttachmentsResponse>](../../models/operations/ListInvoiceAttachmentsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## update

The *Update invoice* endpoint updates an existing [invoice](https://docs.codat.io/accounting-api#/schemas/Invoice) for a given company's connection.

[Invoices](https://docs.codat.io/accounting-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update invoice model](https://docs.codat.io/accounting-api#/operations/get-create-update-invoices-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=invoices) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AccountRef;
import io.codat.accounting.models.components.AccountingCustomerRef;
import io.codat.accounting.models.components.Allocation;
import io.codat.accounting.models.components.BilledToType1;
import io.codat.accounting.models.components.Invoice;
import io.codat.accounting.models.components.InvoiceLineItem;
import io.codat.accounting.models.components.InvoiceStatus;
import io.codat.accounting.models.components.InvoiceTo;
import io.codat.accounting.models.components.ItemRef;
import io.codat.accounting.models.components.Metadata;
import io.codat.accounting.models.components.PaymentAllocationItems;
import io.codat.accounting.models.components.PaymentAllocationPayment;
import io.codat.accounting.models.components.ProjectRef;
import io.codat.accounting.models.components.PropertieTracking1;
import io.codat.accounting.models.components.SalesOrderRef;
import io.codat.accounting.models.components.SalesOrderRefDataType;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.components.SupplementalData;
import io.codat.accounting.models.components.TaxRateRef;
import io.codat.accounting.models.components.TrackingCategoryRef;
import io.codat.accounting.models.components.WithholdingTaxItems;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.UpdateInvoiceRequest;
import io.codat.accounting.models.operations.UpdateInvoiceResponse;
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

            UpdateInvoiceRequest req = UpdateInvoiceRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .invoiceId("<value>")
                .invoice(Invoice.builder()
                    .amountDue(8574.78d)
                    .issueDate("2022-10-23T00:00:00Z")
                    .status(InvoiceStatus.PARTIALLY_PAID)
                    .totalAmount(156.52d)
                    .totalTaxAmount(3446.2d)
                    .additionalTaxAmount(7084.55d)
                    .additionalTaxPercentage(9914.64d)
                    .currency("GBP")
                    .currencyRate(6276.9d)
                    .customerRef(AccountingCustomerRef.builder()
                        .id("<value>")
                        .companyName("Kuhn, Kihn and Wyman")
                        .build())
                    .discountPercentage(1341.51d)
                    .dueDate("2022-10-23T00:00:00Z")
                    .id("<id>")
                    .invoiceNumber("<value>")
                    .lineItems(java.util.List.of(
                        InvoiceLineItem.builder()
                            .quantity(4995.57d)
                            .unitAmount(4468.63d)
                            .build()))
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .note("<value>")
                    .paidOnDate("2022-10-23T00:00:00Z")
                    .paymentAllocations(java.util.List.of(
                        PaymentAllocationItems.builder()
                            .allocation(Allocation.builder()
                                    .allocatedOnDate("2022-10-23T00:00:00Z")
                                    .currency("EUR")
                                    .currencyRate(9936.8d)
                                    .totalAmount(8898.38d)
                                    .build())
                            .payment(PaymentAllocationPayment.builder()
                                    .accountRef(AccountRef.builder()
                                        .id("<id>")
                                        .name("<value>")
                                        .build())
                                    .currency("USD")
                                    .currencyRate(3024.61d)
                                    .id("<id>")
                                    .note("<value>")
                                    .paidOnDate("2022-10-23T00:00:00Z")
                                    .reference("<value>")
                                    .totalAmount(4643.85d)
                                    .build())
                            .build()))
                    .salesOrderRefs(java.util.List.of(
                        SalesOrderRef.builder()
                            .build()))
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .subTotal(7712.03d)
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "<value>")))))
                        .build())
                    .totalDiscount(6298.17d)
                    .withholdingTax(java.util.List.of(
                        WithholdingTaxItems.builder()
                            .amount(9574.81d)
                            .name("<value>")
                            .build()))
                    .build())
                .forceUpdate(false)
                .timeoutInMinutes(404265)
                .build();

            UpdateInvoiceResponse res = sdk.invoices().update()
                .request(req)
                .call();

            if (res.updateInvoiceResponse().isPresent()) {
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
| `request`                                                                                                     | [io.codat.accounting.models.operations.UpdateInvoiceRequest](../../models/operations/UpdateInvoiceRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends io.codat.accounting.models.operations.UpdateInvoiceResponse>](../../models/operations/UpdateInvoiceResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## uploadAttachment

The *Upload invoice attachment* endpoint uploads an attachment and assigns it against a specific `invoiceId`.

[Invoices](https://docs.codat.io/accounting-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.

**Integration-specific behaviour**

For more details on supported file types by integration see [Attachments](https://docs.codat.io/accounting-api#/schemas/Attachment).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=invoices) for integrations that support uploading an invoice attachment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AttachmentUpload;
import io.codat.accounting.models.components.CodatFile;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.UploadInvoiceAttachmentRequest;
import io.codat.accounting.models.operations.UploadInvoiceAttachmentResponse;
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

            UploadInvoiceAttachmentRequest req = UploadInvoiceAttachmentRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .invoiceId("<value>")
                .attachmentUpload(AttachmentUpload.builder()
                    .file(CodatFile.builder()
                            .content("0xE3ABc1980E".getBytes())
                            .fileName("<value>")
                            .build())
                    .build())
                .build();

            UploadInvoiceAttachmentResponse res = sdk.invoices().uploadAttachment()
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

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [io.codat.accounting.models.operations.UploadInvoiceAttachmentRequest](../../models/operations/UploadInvoiceAttachmentRequest.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |


### Response

**[Optional<? extends io.codat.accounting.models.operations.UploadInvoiceAttachmentResponse>](../../models/operations/UploadInvoiceAttachmentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
