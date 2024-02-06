# BankAccounts
(*loanWriteback().bankAccounts()*)

### Available Operations

* [create](#create) - Create bank account
* [getCreateUpdateModel](#getcreateupdatemodel) - Get create/update bank account model

## create

The *Create bank account* endpoint creates a new [bank account](https://docs.codat.io/lending-api#/schemas/BankAccount) for a given company's connection.

[Bank accounts](https://docs.codat.io/lending-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update bank account model](https://docs.codat.io/lending-api#/operations/get-create-update-bankAccounts-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=bankAccounts) for integrations that support creating an account.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.CreateBankAccountRequest;
import io.codat.lending.models.operations.CreateBankAccountResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.AccountingBankAccount;
import io.codat.lending.models.shared.AccountingBankAccountType;
import io.codat.lending.models.shared.Metadata;
import io.codat.lending.models.shared.Security;
import io.codat.lending.models.shared.SupplementalData;
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

            CreateBankAccountRequest req = CreateBankAccountRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .accountingBankAccount(AccountingBankAccount.builder()
                    .accountName("string")
                    .accountNumber("string")
                    .accountType(AccountingBankAccountType.CREDIT)
                    .availableBalance(4893.82d)
                    .balance(6384.24d)
                    .currency("EUR")
                    .iBan("IE8210U901078857930905")
                    .id("<ID>")
                    .institution("string")
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .nominalCode("string")
                    .overdraftLimit(2075.65d)
                    .sortCode("string")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "string")))))
                        .build())
                    .build())
                .allowSyncOnPushComplete(false)
                .timeoutInMinutes(714115)
                .build();

            CreateBankAccountResponse res = sdk.loanWriteback().bankAccounts().create()
                .request(req)
                .call();

            if (res.accountingCreateBankAccountResponse().isPresent()) {
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [io.codat.lending.models.operations.CreateBankAccountRequest](../../models/operations/CreateBankAccountRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends io.codat.lending.models.operations.CreateBankAccountResponse>](../../models/operations/CreateBankAccountResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateUpdateModel

The *Get create/update bank account model* endpoint returns the expected data for the request payload when creating and updating a [bank account](https://docs.codat.io/lending-api#/schemas/BankAccount) for a given company and integration.

[Bank accounts](https://docs.codat.io/lending-api#/schemas/BankAccount) are financial accounts maintained by a bank or other financial institution.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=bankAccounts) for integrations that support creating and updating a bank account.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetCreateUpdateBankAccountsModelRequest;
import io.codat.lending.models.operations.GetCreateUpdateBankAccountsModelResponse;
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

            GetCreateUpdateBankAccountsModelRequest req = GetCreateUpdateBankAccountsModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateUpdateBankAccountsModelResponse res = sdk.loanWriteback().bankAccounts().getCreateUpdateModel()
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [io.codat.lending.models.operations.GetCreateUpdateBankAccountsModelRequest](../../models/operations/GetCreateUpdateBankAccountsModelRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetCreateUpdateBankAccountsModelResponse>](../../models/operations/GetCreateUpdateBankAccountsModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
