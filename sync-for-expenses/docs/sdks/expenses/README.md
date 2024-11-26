# Expenses
(*expenses()*)

## Overview

Create and update transactions that represent your customers' spend.

### Available Operations

* [create](#create) - Create expense transaction
* [update](#update) - Update expense transactions

## create

The *Create expense* endpoint creates an [expense transaction](https://docs.codat.io/sync-for-expenses-api#/schemas/ExpenseTransaction) in the accounting software for a given company's connection. 

[Expense transactions](https://docs.codat.io/sync-for-expenses-api#/schemas/ExpenseTransaction) represent transactions made with a company debit or credit card. 

### Supported Integrations

| Integration                   | Supported |
|-------------------------------|-----------|
| Dynamics 365 Business Central | Yes       |
| FreeAgent                     | Yes       |
| QuickBooks Desktop            | Yes       |
| QuickBooks Online             | Yes       |
| Oracle NetSuite               | Yes       |
| Xero                          | Yes       |

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.BankAccountReference;
import io.codat.sync.expenses.models.components.ExpenseContactRef;
import io.codat.sync.expenses.models.components.ExpenseTransaction;
import io.codat.sync.expenses.models.components.ExpenseTransactionLine;
import io.codat.sync.expenses.models.components.ExpenseTransactionType;
import io.codat.sync.expenses.models.components.InvoiceTo;
import io.codat.sync.expenses.models.components.InvoiceToType;
import io.codat.sync.expenses.models.components.RecordRef;
import io.codat.sync.expenses.models.components.TrackingRef;
import io.codat.sync.expenses.models.components.TrackingRefDataType;
import io.codat.sync.expenses.models.components.Type;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.CreateExpenseTransactionRequest;
import io.codat.sync.expenses.models.operations.CreateExpenseTransactionResponse;
import java.lang.Exception;
import java.math.BigDecimal;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CreateExpenseTransactionRequest req = CreateExpenseTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .requestBody(List.of(
                    ExpenseTransaction.builder()
                        .currency("GBP")
                        .id("4d7c6929-7770-412b-91bb-44d3bc71d111")
                        .issueDate("2022-10-23T00:00:00Z")
                        .type(ExpenseTransactionType.PAYMENT)
                        .bankAccountRef(BankAccountReference.builder()
                            .id("97")
                            .build())
                        .contactRef(ExpenseContactRef.builder()
                            .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                            .type(Type.SUPPLIER)
                            .build())
                        .currencyRate(new BigDecimal("1"))
                        .lines(List.of(
                            ExpenseTransactionLine.builder()
                                .netAmount(new BigDecimal("100"))
                                .accountRef(RecordRef.builder()
                                    .id("35")
                                    .build())
                                .invoiceTo(InvoiceTo.builder()
                                    .id("504")
                                    .type(InvoiceToType.CUSTOMER)
                                    .build())
                                .taxAmount(new BigDecimal("20"))
                                .taxRateRef(RecordRef.builder()
                                    .id("23_Bills")
                                    .build())
                                .trackingRefs(List.of(
                                    TrackingRef.builder()
                                        .id("DEPARTMENT_3")
                                        .build(),
                                    TrackingRef.builder()
                                        .dataType(TrackingRefDataType.TRACKING_CATEGORIES)
                                        .build()))
                                .build()))
                        .merchantName("Amazon UK")
                        .notes("amazon purchase")
                        .build()))
                .build();

        CreateExpenseTransactionResponse res = sdk.expenses().create()
                .request(req)
                .call();

        if (res.createExpenseResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CreateExpenseTransactionRequest](../../models/operations/CreateExpenseTransactionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateExpenseTransactionResponse](../../models/operations/CreateExpenseTransactionResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## update

The *Update expense* endpoint updates an existing [expense transaction](https://docs.codat.io/sync-for-expenses-api#/schemas/UpdateExpenseRequest) in the accounting software for a given company's connection. 

[Expense transactions](https://docs.codat.io/sync-for-expenses-api#/schemas/UpdateExpenseRequest) represent transactions made with a company debit or credit card. 

### Supported Integrations
The following integrations are supported for the [Payment](https://docs.codat.io/expenses/sync-process/expense-transactions#transaction-types) transaction `type` only: 
| Integration           | Supported |
|-----------------------|-----------|
| FreeAgent             | Yes       |
| QuickBooks Online     | Yes       |
| Oracle NetSuite       | Yes       |
| Xero                  | Yes       |

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.ExpenseContactRef;
import io.codat.sync.expenses.models.components.ExpenseTransactionLine;
import io.codat.sync.expenses.models.components.InvoiceTo;
import io.codat.sync.expenses.models.components.InvoiceToType;
import io.codat.sync.expenses.models.components.ItemRef;
import io.codat.sync.expenses.models.components.RecordRef;
import io.codat.sync.expenses.models.components.TrackingRef;
import io.codat.sync.expenses.models.components.TrackingRefDataType;
import io.codat.sync.expenses.models.components.Type;
import io.codat.sync.expenses.models.components.UpdateExpenseRequest;
import io.codat.sync.expenses.models.components.UpdateExpenseRequestBankAccountReference;
import io.codat.sync.expenses.models.components.UpdateExpenseRequestType;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.UpdateExpenseTransactionRequest;
import io.codat.sync.expenses.models.operations.UpdateExpenseTransactionResponse;
import java.lang.Exception;
import java.math.BigDecimal;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        UpdateExpenseTransactionRequest req = UpdateExpenseTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .transactionId("336694d8-2dca-4cb5-a28d-3ccb83e55eee")
                .updateExpenseRequest(UpdateExpenseRequest.builder()
                    .currency("GBP")
                    .issueDate("2022-06-28T00:00:00.000Z")
                    .type(UpdateExpenseRequestType.PAYMENT)
                    .bankAccountRef(UpdateExpenseRequestBankAccountReference.builder()
                        .id("787dfb37-5707-4dc0-8a86-8d74e4cc78ea")
                        .build())
                    .contactRef(ExpenseContactRef.builder()
                        .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                        .type(Type.SUPPLIER)
                        .build())
                    .lines(List.of(
                        ExpenseTransactionLine.builder()
                            .netAmount(new BigDecimal("100"))
                            .accountRef(RecordRef.builder()
                                .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                                .build())
                            .invoiceTo(InvoiceTo.builder()
                                .id("80000002-1674552702")
                                .type(InvoiceToType.CUSTOMER)
                                .build())
                            .itemRef(ItemRef.builder()
                                .id("80000002-1675158984")
                                .build())
                            .taxAmount(new BigDecimal("20"))
                            .taxRateRef(RecordRef.builder()
                                .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                                .build())
                            .trackingRefs(List.of(
                                TrackingRef.builder()
                                    .dataType(TrackingRefDataType.TRACKING_CATEGORIES)
                                    .id("e9a1b63d-9ff0-40e7-8038-016354b987e6")
                                    .build()))
                            .build()))
                    .merchantName("Amazon UK")
                    .notes("APPLE.COM/BILL - 09001077498 - Card Ending: 4590")
                    .build())
                .build();

        UpdateExpenseTransactionResponse res = sdk.expenses().update()
                .request(req)
                .call();

        if (res.updateExpenseResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateExpenseTransactionRequest](../../models/operations/UpdateExpenseTransactionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateExpenseTransactionResponse](../../models/operations/UpdateExpenseTransactionResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/ErrorMessage                  | 400, 401, 402, 403, 404, 422, 429, 500, 503 | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |