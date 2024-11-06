# Invoices
(*accountsReceivable().invoices()*)

## Overview

### Available Operations

* [downloadAttachment](#downloadattachment) - Download invoice attachment
* [downloadPdf](#downloadpdf) - Get invoice as PDF
* [get](#get) - Get invoice
* [getAttachment](#getattachment) - Get invoice attachment
* [list](#list) - List invoices
* [listAttachments](#listattachments) - List invoice attachments
* [listReconciled](#listreconciled) - List reconciled invoices

## downloadAttachment

The *Download invoice attachment* endpoint downloads a specific attachment for a given `invoiceId` and `attachmentId`.

[Invoices](https://docs.codat.io/lending-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.DownloadAccountingInvoiceAttachmentRequest;
import io.codat.lending.models.operations.DownloadAccountingInvoiceAttachmentResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        DownloadAccountingInvoiceAttachmentRequest req = DownloadAccountingInvoiceAttachmentRequest.builder()
                .attachmentId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .invoiceId("EILBDVJVNUAGVKRQ")
                .build();

        DownloadAccountingInvoiceAttachmentResponse res = sdk.accountsReceivable().invoices().downloadAttachment()
                .request(req)
                .call();

        if (res.data().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [DownloadAccountingInvoiceAttachmentRequest](../../models/operations/DownloadAccountingInvoiceAttachmentRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[DownloadAccountingInvoiceAttachmentResponse](../../models/operations/DownloadAccountingInvoiceAttachmentResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## downloadPdf

﻿Download invoice as a pdf.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.DownloadAccountingInvoicePdfRequest;
import io.codat.lending.models.operations.DownloadAccountingInvoicePdfResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        DownloadAccountingInvoicePdfRequest req = DownloadAccountingInvoicePdfRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .invoiceId("13d946f0-c5d5-42bc-b092-97ece17923ab")
                .build();

        DownloadAccountingInvoicePdfResponse res = sdk.accountsReceivable().invoices().downloadPdf()
                .request(req)
                .call();

        if (res.data().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [DownloadAccountingInvoicePdfRequest](../../models/operations/DownloadAccountingInvoicePdfRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[DownloadAccountingInvoicePdfResponse](../../models/operations/DownloadAccountingInvoicePdfResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 401, 402, 403, 404, 409, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## get

The *Get invoice* endpoint returns a single invoice for a given invoiceId.

[Invoices](https://docs.codat.io/lending-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).

### Tips and traps

To access the `paymentAllocations` property, ensure that the `payments` data type is queued and cached in Codat before retrieving `invoices` from Codat's cache.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetAccountingInvoiceRequest;
import io.codat.lending.models.operations.GetAccountingInvoiceResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetAccountingInvoiceRequest req = GetAccountingInvoiceRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .invoiceId("7110701885")
                .build();

        GetAccountingInvoiceResponse res = sdk.accountsReceivable().invoices().get()
                .request(req)
                .call();

        if (res.accountingInvoice().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAccountingInvoiceRequest](../../models/operations/GetAccountingInvoiceRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountingInvoiceResponse](../../models/operations/GetAccountingInvoiceResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 401, 402, 403, 404, 409, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## getAttachment

The *Get invoice attachment* endpoint returns a specific attachment for a given `invoiceId` and `attachmentId`.

[Invoices](https://docs.codat.io/lending-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetAccountingInvoiceAttachmentRequest;
import io.codat.lending.models.operations.GetAccountingInvoiceAttachmentResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetAccountingInvoiceAttachmentRequest req = GetAccountingInvoiceAttachmentRequest.builder()
                .attachmentId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .invoiceId("EILBDVJVNUAGVKRQ")
                .build();

        GetAccountingInvoiceAttachmentResponse res = sdk.accountsReceivable().invoices().getAttachment()
                .request(req)
                .call();

        if (res.accountingAttachment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [GetAccountingInvoiceAttachmentRequest](../../models/operations/GetAccountingInvoiceAttachmentRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[GetAccountingInvoiceAttachmentResponse](../../models/operations/GetAccountingInvoiceAttachmentResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## list

The *List invoices* endpoint returns a list of [invoices](https://docs.codat.io/lending-api#/schemas/Invoice) for a given company's connection.

[Invoices](https://docs.codat.io/lending-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
    
### Useful queries

- Outstanding invoices - `query = amountDue > 0`
- Invoices due after a certain date: `query = dueDate > 2021-01-28`

[Read more about querying](https://docs.codat.io/using-the-api/querying).

### Tips and traps

To access the `paymentAllocations` property, ensure that the `payments` data type is queued and cached in Codat before retrieving `invoices` from Codat's cache.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.ListAccountingInvoicesRequest;
import io.codat.lending.models.operations.ListAccountingInvoicesResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ListAccountingInvoicesRequest req = ListAccountingInvoicesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListAccountingInvoicesResponse res = sdk.accountsReceivable().invoices().list()
                .request(req)
                .call();

        if (res.accountingInvoices().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAccountingInvoicesRequest](../../models/operations/ListAccountingInvoicesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAccountingInvoicesResponse](../../models/operations/ListAccountingInvoicesResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/ErrorMessage                  | 400, 401, 402, 403, 404, 409, 429, 500, 503 | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |

## listAttachments

The *List invoice attachments* endpoint returns a list of attachments available to download for given `invoiceId`.

[Invoices](https://docs.codat.io/lending-api#/schemas/Invoice) are itemized records of goods sold or services provided to a customer.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.ListAccountingInvoiceAttachmentsRequest;
import io.codat.lending.models.operations.ListAccountingInvoiceAttachmentsResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ListAccountingInvoiceAttachmentsRequest req = ListAccountingInvoiceAttachmentsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .invoiceId("EILBDVJVNUAGVKRQ")
                .build();

        ListAccountingInvoiceAttachmentsResponse res = sdk.accountsReceivable().invoices().listAttachments()
                .request(req)
                .call();

        if (res.attachments().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [ListAccountingInvoiceAttachmentsRequest](../../models/operations/ListAccountingInvoiceAttachmentsRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[ListAccountingInvoiceAttachmentsResponse](../../models/operations/ListAccountingInvoiceAttachmentsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 401, 402, 403, 404, 409, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## listReconciled

Gets a list of invoices linked to the corresponding banking transaction

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.ListReconciledInvoicesRequest;
import io.codat.lending.models.operations.ListReconciledInvoicesResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ListReconciledInvoicesRequest req = ListReconciledInvoicesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListReconciledInvoicesResponse res = sdk.accountsReceivable().invoices().listReconciled()
                .request(req)
                .call();

        if (res.enhancedInvoicesReport().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListReconciledInvoicesRequest](../../models/operations/ListReconciledInvoicesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListReconciledInvoicesResponse](../../models/operations/ListReconciledInvoicesResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |