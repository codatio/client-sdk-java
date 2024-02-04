# Expenses
(*expenses()*)

## Overview

Create expense datasets and upload receipts.

### Available Operations

* [createExpenseTransaction](#createexpensetransaction) - Create expense transaction
* [updateExpenseTransaction](#updateexpensetransaction) - Update expense-transactions
* [uploadExpenseAttachment](#uploadexpenseattachment) - Upload attachment

## createExpenseTransaction

The *Create expense* endpoint creates an [expense transaction](https://docs.codat.io/sync-for-expenses-api#/schemas/ExpenseTransaction) in the accounting platform for a given company's connection. 

[Expense transactions](https://docs.codat.io/sync-for-expenses-api#/schemas/ExpenseTransaction) represent transactions made with a company debit or credit card. 


**Integration-specific behaviour**

Some accounting platforms support the option of pushing transactions to a draft state. This can be done by setting the postAsDraft property on the transaction to true. For platforms without this feature, the postAsDraft property should be ignored or set to false.

| Integration | Draft State | Details                                                                                                      |  
|-------------|-------------|--------------------------------------------------------------------------------------------------------------|
| Dynamics 365 Business Central | Yes   | Setting postAsDraft to true will push the transactions to a drafted state rather than posting directly to the ledger. For transactions in a draft state, they can then be approved and posted within the accounting platform. |
| Quickbooks Online | No | -  |
| Xero | No | - |
| NetSuite | No | - |

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.CreateExpenseTransactionRequest;
import io.codat.sync_for_expenses.models.operations.CreateExpenseTransactionResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.BankAccountReference;
import io.codat.sync_for_expenses.models.shared.ContactRef;
import io.codat.sync_for_expenses.models.shared.CreateExpenseRequest;
import io.codat.sync_for_expenses.models.shared.ExpenseTransaction;
import io.codat.sync_for_expenses.models.shared.ExpenseTransactionLine;
import io.codat.sync_for_expenses.models.shared.ExpenseTransactionType;
import io.codat.sync_for_expenses.models.shared.InvoiceTo;
import io.codat.sync_for_expenses.models.shared.InvoiceToDataType;
import io.codat.sync_for_expenses.models.shared.RecordRef;
import io.codat.sync_for_expenses.models.shared.Security;
import io.codat.sync_for_expenses.models.shared.TrackingRef;
import io.codat.sync_for_expenses.models.shared.TrackingRefDataType;
import io.codat.sync_for_expenses.models.shared.Type;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CreateExpenseTransactionRequest req = CreateExpenseTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .createExpenseRequest(CreateExpenseRequest.builder()
                    .items(java.util.List.of(
                        ExpenseTransaction.builder()
                            .currency("GBP")
                            .id("4d7c6929-7770-412b-91bb-44d3bc71d111")
                            .issueDate("2022-10-23T00:00:00Z")
                            .type(ExpenseTransactionType.PAYMENT)
                            .bankAccountRef(BankAccountReference.builder()
                                .id("787dfb37-5707-4dc0-8a86-8d74e4cc78ea")
                                .build())
                            .contactRef(ContactRef.builder()
                                .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                                .type(Type.SUPPLIER)
                                .build())
                            .lines(java.util.List.of(
                                ExpenseTransactionLine.builder()
                                    .accountRef(RecordRef.builder()
                                            .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                                            .build())
                                    .netAmount(110.42d)
                                    .taxAmount(14.43d)
                                    .invoiceTo(InvoiceTo.builder()
                                        .dataType(InvoiceToDataType.CUSTOMERS)
                                        .id("80000002-1674552702")
                                        .build())
                                    .taxRateRef(RecordRef.builder()
                                        .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                                        .build())
                                    .trackingRefs(java.util.List.of(
                                        TrackingRef.builder()
                                            .dataType(TrackingRefDataType.TRACKING_CATEGORIES)
                                            .id("e9a1b63d-9ff0-40e7-8038-016354b987e6")
                                            .build()))
                                    .build()))
                            .merchantName("Amazon UK")
                            .notes("APPLE.COM/BILL - 09001077498 - Card Ending: 4590")
                            .build()))
                    .build())
                .build();

            CreateExpenseTransactionResponse res = sdk.expenses().createExpenseTransaction()
                .request(req)
                .call();

            if (res.createExpenseResponse().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [io.codat.sync_for_expenses.models.operations.CreateExpenseTransactionRequest](../../models/operations/CreateExpenseTransactionRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.CreateExpenseTransactionResponse>](../../models/operations/CreateExpenseTransactionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## updateExpenseTransaction

The *Update expense* endpoint updates an existing [expense transaction](https://docs.codat.io/sync-for-expenses-api#/schemas/ExpenseTransaction) in the accounting platform for a given company's connection. 

[Expense transactions](https://docs.codat.io/sync-for-expenses-api#/schemas/ExpenseTransaction) represent transactions made with a company debit or credit card. 


**Integration-specific behaviour**

At the moment you can update expenses only for Xero ([Payment](https://docs.codat.io/expenses/sync-process/expense-transactions#transaction-types) transaction type only).

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.UpdateExpenseTransactionRequest;
import io.codat.sync_for_expenses.models.operations.UpdateExpenseTransactionResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.ContactRef;
import io.codat.sync_for_expenses.models.shared.ExpenseTransactionLine;
import io.codat.sync_for_expenses.models.shared.InvoiceTo;
import io.codat.sync_for_expenses.models.shared.InvoiceToDataType;
import io.codat.sync_for_expenses.models.shared.RecordRef;
import io.codat.sync_for_expenses.models.shared.Security;
import io.codat.sync_for_expenses.models.shared.TrackingRef;
import io.codat.sync_for_expenses.models.shared.TrackingRefDataType;
import io.codat.sync_for_expenses.models.shared.Type;
import io.codat.sync_for_expenses.models.shared.UpdateExpenseRequest;
import io.codat.sync_for_expenses.models.shared.UpdateExpenseRequestBankAccountReference;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            UpdateExpenseTransactionRequest req = UpdateExpenseTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .transactionId("336694d8-2dca-4cb5-a28d-3ccb83e55eee")
                .updateExpenseRequest(UpdateExpenseRequest.builder()
                    .issueDate("2022-06-28T00:00:00.000Z")
                    .type("string")
                    .bankAccountRef(UpdateExpenseRequestBankAccountReference.builder()
                        .id("787dfb37-5707-4dc0-8a86-8d74e4cc78ea")
                        .build())
                    .contactRef(ContactRef.builder()
                        .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                        .type(Type.SUPPLIER)
                        .build())
                    .currency("GBP")
                    .currencyRate(8574.78d)
                    .lines(java.util.List.of(
                        ExpenseTransactionLine.builder()
                            .accountRef(RecordRef.builder()
                                    .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                                    .build())
                            .netAmount(110.42d)
                            .taxAmount(14.43d)
                            .invoiceTo(InvoiceTo.builder()
                                .dataType(InvoiceToDataType.CUSTOMERS)
                                .id("80000002-1674552702")
                                .build())
                            .taxRateRef(RecordRef.builder()
                                .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                                .build())
                            .trackingRefs(java.util.List.of(
                                TrackingRef.builder()
                                    .dataType(TrackingRefDataType.TRACKING_CATEGORIES)
                                    .id("e9a1b63d-9ff0-40e7-8038-016354b987e6")
                                    .build()))
                            .build()))
                    .merchantName("Amazon UK")
                    .notes("APPLE.COM/BILL - 09001077498 - Card Ending: 4590")
                    .build())
                .build();

            UpdateExpenseTransactionResponse res = sdk.expenses().updateExpenseTransaction()
                .request(req)
                .call();

            if (res.updateExpenseResponse().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [io.codat.sync_for_expenses.models.operations.UpdateExpenseTransactionRequest](../../models/operations/UpdateExpenseTransactionRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.UpdateExpenseTransactionResponse>](../../models/operations/UpdateExpenseTransactionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## uploadExpenseAttachment

The *Upload attachment* endpoint uploads an attachment in the accounting software against the given transactionId. 

[Expense transactions](https://docs.codat.io/sync-for-expenses-api#/schemas/ExpenseTransaction) represent transactions made with a company debit or credit card. 

**Integration-specific behaviour**

Each accounting software supports different file formats and sizes.

| Integration | File Size | File Extension                                                                                                      |  
|-------------|-------------|--------------------------------------------------------------------------------------------------------------|
| Xero | 4MB  | 7Z, BMP, CSV, DOC, DOCX, EML, GIF, JPEG, JPG, KEYNOTE, MSG, NUMBERS, ODF, ODS, ODT, PAGES, PDF, PNG, PPT, PPTX, RAR, RTF, TIF, TIFF, TXT, XLS, XLSX, ZIP |
| QuickBooks Online | 100MB | AI, CSV, DOC, DOCX, EPS, GIF, JPEG, JPG, ODS, PAGES, PDF, PNG, RTF, TIF, TXT, XLS, XLSX, XML  |
| NetSuite | 100MB | BMP, CSV, XLS, XLSX, JSON, PDF, PJPG, PJPEG, PNG, TXT, SVG, TIF, TIFF, DOC, DOCX, ZIP |
| Dynamics 365 Business Central | 350 MB | Dynamics do not explicitly outline which file types are supported but they do state <a className="external" href="https://learn.microsoft.com/en-gb/dynamics365/business-central/ui-how-add-link-to-record#to-attach-a-file-to-a-purchase-invoice" target="_blank">here</a> that "You can attach any type of file, such as text, image, or video files". |

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.UploadExpenseAttachmentRequest;
import io.codat.sync_for_expenses.models.operations.UploadExpenseAttachmentResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.AttachmentUpload;
import io.codat.sync_for_expenses.models.shared.CodatFile;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            UploadExpenseAttachmentRequest req = UploadExpenseAttachmentRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .syncId("6fb40d5e-b13e-11ed-afa1-0242ac120002")
                .transactionId("336694d8-2dca-4cb5-a28d-3ccb83e55eee")
                .attachmentUpload(AttachmentUpload.builder()
                    .file(CodatFile.builder()
                            .content("0xE3ABc1980E".getBytes())
                            .fileName("string")
                            .build())
                    .build())
                .build();

            UploadExpenseAttachmentResponse res = sdk.expenses().uploadExpenseAttachment()
                .request(req)
                .call();

            if (res.attachment().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [io.codat.sync_for_expenses.models.operations.UploadExpenseAttachmentRequest](../../models/operations/UploadExpenseAttachmentRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.UploadExpenseAttachmentResponse>](../../models/operations/UploadExpenseAttachmentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
