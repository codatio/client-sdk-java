# AccountTransactions
(*transactions().accountTransactions()*)

### Available Operations

* [getAccountingAccountTransaction](#getaccountingaccounttransaction) - Get account transaction
* [listAccountingAccountTransactions](#listaccountingaccounttransactions) - List account transactions

## getAccountingAccountTransaction

The *Get account transaction* endpoint returns a single account transaction for a given accountTransactionId.

[Account transactions](https://docs.codat.io/lending-api#/schemas/AccountTransaction) represent bank activity within an accounting platform. All transactions that go through a bank account are recorded as account transactions.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=accountTransactions) for integrations that support getting a specific account transaction.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetAccountingAccountTransactionRequest;
import io.codat.lending.models.operations.GetAccountingAccountTransactionResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetAccountingAccountTransactionRequest req = GetAccountingAccountTransactionRequest.builder()
                .accountTransactionId("string")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetAccountingAccountTransactionResponse res = sdk.transactions().accountTransactions().getAccountingAccountTransaction()
                .request(req)
                .call();

            if (res.accountingAccountTransaction().isPresent()) {
                // handle response
            }

        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [io.codat.lending.models.operations.GetAccountingAccountTransactionRequest](../../models/operations/GetAccountingAccountTransactionRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetAccountingAccountTransactionResponse>](../../models/operations/GetAccountingAccountTransactionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listAccountingAccountTransactions

The *List account transactions* endpoint returns a list of [account transactions](https://docs.codat.io/lending-api#/schemas/AccountTransaction) for a given company's connection.

[Account transactions](https://docs.codat.io/lending-api#/schemas/AccountTransaction) represent bank activity within an accounting platform. All transactions that go through a bank account are recorded as account transactions.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.ListAccountingAccountTransactionsRequest;
import io.codat.lending.models.operations.ListAccountingAccountTransactionsResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            ListAccountingAccountTransactionsRequest req = ListAccountingAccountTransactionsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("string")
                .build();

            ListAccountingAccountTransactionsResponse res = sdk.transactions().accountTransactions().listAccountingAccountTransactions()
                .request(req)
                .call();

            if (res.accountingAccountTransactions().isPresent()) {
                // handle response
            }

        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [io.codat.lending.models.operations.ListAccountingAccountTransactionsRequest](../../models/operations/ListAccountingAccountTransactionsRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[Optional<? extends io.codat.lending.models.operations.ListAccountingAccountTransactionsResponse>](../../models/operations/ListAccountingAccountTransactionsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
