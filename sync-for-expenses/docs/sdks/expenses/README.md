# Expenses
(*expenses()*)

## Overview

Create expense transactions.

### Available Operations

* [create](#create) - Create expense transaction
* [update](#update) - Update expense transactions

## create

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

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.ContactRef;
import io.codat.sync.expenses.models.components.CreateExpenseRequest;
import io.codat.sync.expenses.models.components.ExpenseTransaction;
import io.codat.sync.expenses.models.components.ExpenseTransactionBankAccountReference;
import io.codat.sync.expenses.models.components.ExpenseTransactionLine;
import io.codat.sync.expenses.models.components.ExpenseTransactionType;
import io.codat.sync.expenses.models.components.InvoiceTo;
import io.codat.sync.expenses.models.components.InvoiceToDataType;
import io.codat.sync.expenses.models.components.RecordRef;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.components.TrackingRef;
import io.codat.sync.expenses.models.components.TrackingRefDataType;
import io.codat.sync.expenses.models.components.Type;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.CreateExpenseTransactionRequest;
import io.codat.sync.expenses.models.operations.CreateExpenseTransactionResponse;
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

            CreateExpenseTransactionRequest req = CreateExpenseTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .createExpenseRequest(CreateExpenseRequest.builder()
                    .items(java.util.List.of(
                        ExpenseTransaction.builder()
                            .currency("GBP")
                            .id("4d7c6929-7770-412b-91bb-44d3bc71d111")
                            .issueDate("2022-10-23T00:00:00Z")
                            .type(ExpenseTransactionType.PAYMENT)
                            .merchantName("Amazon UK")
                            .notes("APPLE.COM/BILL - 09001077498 - Card Ending: 4590")
                            .build()))
                    .build())
                .build();

            CreateExpenseTransactionResponse res = sdk.expenses().create()
                .request(req)
                .call();

            if (res.createExpenseResponse().isPresent()) {
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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [io.codat.sync.expenses.models.operations.CreateExpenseTransactionRequest](../../models/operations/CreateExpenseTransactionRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.CreateExpenseTransactionResponse>](../../models/operations/CreateExpenseTransactionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## update

The *Update expense* endpoint updates an existing [expense transaction](https://docs.codat.io/sync-for-expenses-api#/schemas/ExpenseTransaction) in the accounting platform for a given company's connection. 

[Expense transactions](https://docs.codat.io/sync-for-expenses-api#/schemas/ExpenseTransaction) represent transactions made with a company debit or credit card. 


**Integration-specific behaviour**

At the moment you can update expenses only for Xero ([Payment](https://docs.codat.io/expenses/sync-process/expense-transactions#transaction-types) transaction type only).

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.ContactRef;
import io.codat.sync.expenses.models.components.ExpenseTransactionLine;
import io.codat.sync.expenses.models.components.InvoiceTo;
import io.codat.sync.expenses.models.components.InvoiceToDataType;
import io.codat.sync.expenses.models.components.RecordRef;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.components.TrackingRef;
import io.codat.sync.expenses.models.components.TrackingRefDataType;
import io.codat.sync.expenses.models.components.Type;
import io.codat.sync.expenses.models.components.UpdateExpenseRequest;
import io.codat.sync.expenses.models.components.UpdateExpenseRequestBankAccountReference;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.UpdateExpenseTransactionRequest;
import io.codat.sync.expenses.models.operations.UpdateExpenseTransactionResponse;
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

            UpdateExpenseTransactionRequest req = UpdateExpenseTransactionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .transactionId("336694d8-2dca-4cb5-a28d-3ccb83e55eee")
                .updateExpenseRequest(UpdateExpenseRequest.builder()
                    .issueDate("2022-06-28T00:00:00.000Z")
                    .type("<value>")
                    .bankAccountRef(UpdateExpenseRequestBankAccountReference.builder()
                        .id("787dfb37-5707-4dc0-8a86-8d74e4cc78ea")
                        .build())
                    .contactRef(ContactRef.builder()
                        .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                        .type(Type.SUPPLIER)
                        .build())
                    .currency("GBP")
                    .currencyRate(new BigDecimal("8574.78"))
                    .lines(java.util.List.of(
                        ExpenseTransactionLine.builder()
                            .accountRef(RecordRef.builder()
                                    .id("40e3e57c-2322-4898-966c-ca41adfd23fd")
                                    .build())
                            .netAmount(new BigDecimal("110.42"))
                            .taxAmount(new BigDecimal("14.43"))
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
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [io.codat.sync.expenses.models.operations.UpdateExpenseTransactionRequest](../../models/operations/UpdateExpenseTransactionRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.UpdateExpenseTransactionResponse>](../../models/operations/UpdateExpenseTransactionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
