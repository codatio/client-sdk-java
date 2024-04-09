# Reimbursements
(*reimbursements()*)

## Overview

Create reimbursable expense transactions.

### Available Operations

* [createReimbursableExpenseTransaction](#createreimbursableexpensetransaction) - Create reimbursable expense transaction
* [updateReimbursableExpenseTransaction](#updatereimbursableexpensetransaction) - Update reimbursable expense transaction

## createReimbursableExpenseTransaction

Use the *Create reimbursable expense* endpoint to create a [reimbursement request](https://docs.codat.io/sync-for-expenses-api#/schemas/Reimburseable-Expense-Transactions) in the accounting platform for a given company's connection. 

Employee reimbursement requests are reflected in the accounting system in the form of Bills against an employee, who is a supplier.

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.BankAccountReference;
import io.codat.sync.expenses.models.components.ContactRef;
import io.codat.sync.expenses.models.components.CreateReimbursableExpenseRequest;
import io.codat.sync.expenses.models.components.InvoiceTo;
import io.codat.sync.expenses.models.components.InvoiceToDataType;
import io.codat.sync.expenses.models.components.RecordRef;
import io.codat.sync.expenses.models.components.ReimbursableExpenseTransaction;
import io.codat.sync.expenses.models.components.ReimbursableExpenseTransactionLine;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.components.TrackingRef;
import io.codat.sync.expenses.models.components.TrackingRefDataType;
import io.codat.sync.expenses.models.components.Type;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionRequest;
import io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateReimbursableExpenseTransactionRequest req = CreateReimbursableExpenseTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .createReimbursableExpenseRequest(CreateReimbursableExpenseRequest.builder()
                    .items(java.util.List.of(
                        java.util.List.of(
                            ReimbursableExpenseTransaction.builder()
                                .currency("GBP")
                                .dueDate("<value>")
                                .id("4d7c6929-7770-412b-91bb-44d3bc71d111")
                                .issueDate("2022-10-23T00:00:00Z")
                                .notes("APPLE.COM/BILL - 09001077498 - Card Ending: 4590")
                                .build())))
                    .build())
                .build();

            CreateReimbursableExpenseTransactionResponse res = sdk.reimbursements().createReimbursableExpenseTransaction()
                .request(req)
                .call();

            if (res.createReimbursableExpenseResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionRequest](../../models/operations/CreateReimbursableExpenseTransactionRequest.md) | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.CreateReimbursableExpenseTransactionResponse>](../../models/operations/CreateReimbursableExpenseTransactionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateReimbursableExpenseTransaction

The *Update reimbursable expense* endpoint updates an existing [reimbursable expense transaction](https://docs.codat.io/sync-for-expenses-api#/operations/create-reimbursable-expense-transaction) in the accounting platform for a given company's connection. 

Employee reimbursement requests are reflected in the accounting system in the form of Bills against an employee, who is a supplier.

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.BankAccountReference;
import io.codat.sync.expenses.models.components.ContactRef;
import io.codat.sync.expenses.models.components.CreateReimbursableExpenseRequest;
import io.codat.sync.expenses.models.components.InvoiceTo;
import io.codat.sync.expenses.models.components.InvoiceToDataType;
import io.codat.sync.expenses.models.components.RecordRef;
import io.codat.sync.expenses.models.components.ReimbursableExpenseTransaction;
import io.codat.sync.expenses.models.components.ReimbursableExpenseTransactionLine;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.components.TrackingRef;
import io.codat.sync.expenses.models.components.TrackingRefDataType;
import io.codat.sync.expenses.models.components.Type;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionRequest;
import io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            UpdateReimbursableExpenseTransactionRequest req = UpdateReimbursableExpenseTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .transactionId("336694d8-2dca-4cb5-a28d-3ccb83e55eee")
                .createReimbursableExpenseRequest(CreateReimbursableExpenseRequest.builder()
                    .items(java.util.List.of(
                        java.util.List.of(
                            ReimbursableExpenseTransaction.builder()
                                .currency("GBP")
                                .dueDate("<value>")
                                .id("4d7c6929-7770-412b-91bb-44d3bc71d111")
                                .issueDate("2022-10-23T00:00:00Z")
                                .notes("APPLE.COM/BILL - 09001077498 - Card Ending: 4590")
                                .build())))
                    .build())
                .build();

            UpdateReimbursableExpenseTransactionResponse res = sdk.reimbursements().updateReimbursableExpenseTransaction()
                .request(req)
                .call();

            if (res.createReimbursableExpenseResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionRequest](../../models/operations/UpdateReimbursableExpenseTransactionRequest.md) | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.UpdateReimbursableExpenseTransactionResponse>](../../models/operations/UpdateReimbursableExpenseTransactionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
