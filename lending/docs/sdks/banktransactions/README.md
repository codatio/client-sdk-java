# BankTransactions
(*loanWriteback().bankTransactions()*)

### Available Operations

* [createBankTransactions](#createbanktransactions) - Create bank account transactions
* [getCreateBankTransactionsModel](#getcreatebanktransactionsmodel) - Get create bank account transactions model

## createBankTransactions

The *Create bank account transactions* endpoint creates new [bank account transactions](https://docs.codat.io/lending-api#/schemas/BankTransactions) for a given company's connection.

[Bank account transactions](https://docs.codat.io/lending-api#/schemas/BankTransactions) are records of money that has moved in and out of an SMB's bank account.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create bank transaction model](https://docs.codat.io/lending-api#/operations/get-create-bankTransactions-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=bankTransactions) for integrations that support creating a bank account transactions.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.CreateBankTransactionsRequest;
import io.codat.lending.models.operations.CreateBankTransactionsResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.AccountingCreateBankTransactions;
import io.codat.lending.models.shared.CreateBankAccountTransaction;
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

            CreateBankTransactionsRequest req = CreateBankTransactionsRequest.builder()
                .accountId("string")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .accountingCreateBankTransactions(AccountingCreateBankTransactions.builder()
                    .accountId("7110701885")
                    .transactions(java.util.List.of(
                        CreateBankAccountTransaction.builder()
                            .date("2022-10-23T00:00:00Z")
                            .build()))
                    .build())
                .allowSyncOnPushComplete(false)
                .timeoutInMinutes(638424)
                .build();

            CreateBankTransactionsResponse res = sdk.loanWriteback().bankTransactions().createBankTransactions()
                .request(req)
                .call();

            if (res.accountingCreateBankTransactionsResponse().isPresent()) {
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [io.codat.lending.models.operations.CreateBankTransactionsRequest](../../models/operations/CreateBankTransactionsRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[Optional<? extends io.codat.lending.models.operations.CreateBankTransactionsResponse>](../../models/operations/CreateBankTransactionsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateBankTransactionsModel

The *Get create bank account transactions model* endpoint returns the expected data for the request payload when creating [bank account transactions](https://docs.codat.io/lending-api#/schemas/BankTransactions) for a given company and integration.

[Bank account transactions](https://docs.codat.io/lending-api#/schemas/BankTransactions) are records of money that has moved in and out of an SMB's bank account.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=bankTransactions) for integrations that support creating an bank transaction.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetCreateBankTransactionsModelRequest;
import io.codat.lending.models.operations.GetCreateBankTransactionsModelResponse;
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

            GetCreateBankTransactionsModelRequest req = GetCreateBankTransactionsModelRequest.builder()
                .accountId("string")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateBankTransactionsModelResponse res = sdk.loanWriteback().bankTransactions().getCreateBankTransactionsModel()
                .request(req)
                .call();

            if (res.pushOption().isPresent()) {
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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [io.codat.lending.models.operations.GetCreateBankTransactionsModelRequest](../../models/operations/GetCreateBankTransactionsModelRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetCreateBankTransactionsModelResponse>](../../models/operations/GetCreateBankTransactionsModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
