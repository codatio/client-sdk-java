# Bills
(*bills()*)

## Overview

Bills

### Available Operations

* [create](#create) - Create bill
* [downloadAttachment](#downloadattachment) - Download bill attachment
* [getBillOptions](#getbilloptions) - Get bill mapping options
* [list](#list) - List bills
* [listAttachments](#listattachments) - List bill attachments
* [uploadAttachment](#uploadattachment) - Upload bill attachment

## create

The *Create bill* endpoint creates a new [bill](https://docs.codat.io/sync-for-payables-api#/schemas/Bill) for a given company's connection.

[Bills](https://docs.codat.io/sync-for-payables-api#/schemas/Bill) are invoices that represent the SMB's financial obligations to their supplier for a purchase of goods or services.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.*;
import io.codat.sync.payables.models.components.BillAccountRef;
import io.codat.sync.payables.models.components.BillLineItem;
import io.codat.sync.payables.models.components.BillPrototype;
import io.codat.sync.payables.models.components.BillStatus;
import io.codat.sync.payables.models.components.BillTaxRateRef;
import io.codat.sync.payables.models.components.Security;
import io.codat.sync.payables.models.components.SupplierRef;
import io.codat.sync.payables.models.operations.*;
import io.codat.sync.payables.models.operations.CreateBillRequest;
import io.codat.sync.payables.models.operations.CreateBillResponse;
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

            CreateBillRequest req = CreateBillRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .idempotencyKey("<value>")
                .billPrototype(BillPrototype.builder()
                    .currency("USD")
                    .dueDate("2022-10-23T00:00:00Z")
                    .issueDate("2022-10-23T00:00:00Z")
                    .status(BillStatus.OPEN)
                    .supplierRef(SupplierRef.builder()
                            .id("<value>")
                            .supplierName("<value>")
                            .build())
                    .amountDue(new BigDecimal("8592.13"))
                    .currencyRate(new BigDecimal("4174.58"))
                    .lineItems(java.util.List.of(
                        BillLineItem.builder()
                            .accountRef(BillAccountRef.builder()
                                    .id("<id>")
                                    .build())
                            .quantity(new BigDecimal("7865.46"))
                            .taxRateRef(BillTaxRateRef.builder()
                                    .id("<id>")
                                    .build())
                            .unitAmount(new BigDecimal("690.25"))
                            .build()))
                    .reference("<value>")
                    .totalAmount(new BigDecimal("9967.06"))
                    .build())
                .build();

            CreateBillResponse res = sdk.bills().create()
                .request(req)
                .call();

            if (res.bill().isPresent()) {
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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [io.codat.sync.payables.models.operations.CreateBillRequest](../../models/operations/CreateBillRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Optional<? extends io.codat.sync.payables.models.operations.CreateBillResponse>](../../models/operations/CreateBillResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## downloadAttachment

The *Download bill attachment* endpoint downloads a specific attachment for a given `billId` and `attachmentId`.

[Bills](https://docs.codat.io/sync-for-payables-api#/schemas/Bill) are invoices that represent the SMB's financial obligations to their supplier for a purchase of goods or services.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=bills) for integrations that support downloading a bill attachment.


### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.*;
import io.codat.sync.payables.models.components.Security;
import io.codat.sync.payables.models.operations.*;
import io.codat.sync.payables.models.operations.DownloadBillAttachmentRequest;
import io.codat.sync.payables.models.operations.DownloadBillAttachmentResponse;
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

            DownloadBillAttachmentRequest req = DownloadBillAttachmentRequest.builder()
                .attachmentId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .billId("EILBDVJVNUAGVKRQ")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            DownloadBillAttachmentResponse res = sdk.bills().downloadAttachment()
                .request(req)
                .call();

            if (res.data().isPresent()) {
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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [io.codat.sync.payables.models.operations.DownloadBillAttachmentRequest](../../models/operations/DownloadBillAttachmentRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[Optional<? extends io.codat.sync.payables.models.operations.DownloadBillAttachmentResponse>](../../models/operations/DownloadBillAttachmentResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getBillOptions

﻿Use the *Get mapping options - Bills* endpoint to return a list of available mapping options for a given company's connection ID.

Mapping options are a set of accounts and tax rates used to configure the SMB's payables integration.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.*;
import io.codat.sync.payables.models.components.Security;
import io.codat.sync.payables.models.operations.*;
import io.codat.sync.payables.models.operations.GetMappingOptionsBillsRequest;
import io.codat.sync.payables.models.operations.GetMappingOptionsBillsResponse;
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

            GetMappingOptionsBillsRequest req = GetMappingOptionsBillsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .continuationToken("continuationToken=eyJwYWdlIjoyLCJwYWdlU2l6ZSI6MTAwLCJwYWdlQ291bnQiOjExfQ==")
                .build();

            GetMappingOptionsBillsResponse res = sdk.bills().getBillOptions()
                .request(req)
                .call();

            if (res.billMappingOptions().isPresent()) {
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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [io.codat.sync.payables.models.operations.GetMappingOptionsBillsRequest](../../models/operations/GetMappingOptionsBillsRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[Optional<? extends io.codat.sync.payables.models.operations.GetMappingOptionsBillsResponse>](../../models/operations/GetMappingOptionsBillsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## list

The *List bills* endpoint returns a list of [bills](https://docs.codat.io/sync-for-payables-api#/schemas/Bill) for a given company's connection.

[Bills](https://docs.codat.io/sync-for-payables-api#/schemas/Bill) are invoices that represent the SMB's financial obligations to their supplier for a purchase of goods or services.

By default, the endpoint will return all bills with a status of 'Open' & 'PartiallyPaid' to show all oustanding bills.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.*;
import io.codat.sync.payables.models.components.Security;
import io.codat.sync.payables.models.operations.*;
import io.codat.sync.payables.models.operations.ListBillsRequest;
import io.codat.sync.payables.models.operations.ListBillsResponse;
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

            ListBillsRequest req = ListBillsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .continuationToken("continuationToken=eyJwYWdlIjoyLCJwYWdlU2l6ZSI6MTAwLCJwYWdlQ291bnQiOjExfQ==")
                .query("<value>")
                .build();

            ListBillsResponse res = sdk.bills().list()
                .request(req)
                .call();

            if (res.bills().isPresent()) {
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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [io.codat.sync.payables.models.operations.ListBillsRequest](../../models/operations/ListBillsRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[Optional<? extends io.codat.sync.payables.models.operations.ListBillsResponse>](../../models/operations/ListBillsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listAttachments

The *List bill attachments* endpoint returns a list of attachments available to download for a given `billId`.

[Bills](https://docs.codat.io/sync-for-payables-api#/schemas/Bill) are invoices that represent the SMB's financial obligations to their supplier for a purchase of goods or services.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.*;
import io.codat.sync.payables.models.components.Security;
import io.codat.sync.payables.models.operations.*;
import io.codat.sync.payables.models.operations.ListBillAttachmentsRequest;
import io.codat.sync.payables.models.operations.ListBillAttachmentsResponse;
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

            ListBillAttachmentsRequest req = ListBillAttachmentsRequest.builder()
                .billId("EILBDVJVNUAGVKRQ")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            ListBillAttachmentsResponse res = sdk.bills().listAttachments()
                .request(req)
                .call();

            if (res.attachment().isPresent()) {
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [io.codat.sync.payables.models.operations.ListBillAttachmentsRequest](../../models/operations/ListBillAttachmentsRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[Optional<? extends io.codat.sync.payables.models.operations.ListBillAttachmentsResponse>](../../models/operations/ListBillAttachmentsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## uploadAttachment

The *Upload bill attachment* endpoint uploads an attachment and assigns it against a specific `billId`.

[Bills](https://docs.codat.io/sync-for-payables-api#/schemas/Bill) are invoices that represent the SMB's financial obligations to their supplier for a purchase of goods or services.

### Example Usage

```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.*;
import io.codat.sync.payables.models.components.AttachmentUpload;
import io.codat.sync.payables.models.components.CodatFile;
import io.codat.sync.payables.models.components.Security;
import io.codat.sync.payables.models.operations.*;
import io.codat.sync.payables.models.operations.UploadBillAttachmentRequest;
import io.codat.sync.payables.models.operations.UploadBillAttachmentResponse;
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

            UploadBillAttachmentRequest req = UploadBillAttachmentRequest.builder()
                .billId("EILBDVJVNUAGVKRQ")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .attachmentUpload(AttachmentUpload.builder()
                    .file(CodatFile.builder()
                            .content("0x3ABc1980Ef".getBytes())
                            .fileName("<value>")
                            .build())
                    .build())
                .build();

            UploadBillAttachmentResponse res = sdk.bills().uploadAttachment()
                .request(req)
                .call();

            // handle response
        } catch (io.codat.sync.payables.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [io.codat.sync.payables.models.operations.UploadBillAttachmentRequest](../../models/operations/UploadBillAttachmentRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends io.codat.sync.payables.models.operations.UploadBillAttachmentResponse>](../../models/operations/UploadBillAttachmentResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
