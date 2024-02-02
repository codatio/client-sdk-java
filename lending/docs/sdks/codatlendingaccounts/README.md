# CodatLendingAccounts
(*banking().accounts()*)

### Available Operations

* [getBankingAccount](#getbankingaccount) - Get account
* [listBankingAccounts](#listbankingaccounts) - List accounts

## getBankingAccount

The *Get account* endpoint returns a single account for a given accountId.

[Accounts](https://docs.codat.io/lending-api#/schemas/Account) are financial accounts maintained by a bank or other financial institution.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/banking?view=tab-by-data-type&dataType=banking-accounts) for integrations that support getting a specific account.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetBankingAccountRequest;
import io.codat.lending.models.operations.GetBankingAccountResponse;
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

            GetBankingAccountRequest req = GetBankingAccountRequest.builder()
                .accountId("string")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetBankingAccountResponse res = sdk.banking().accounts().getBankingAccount()
                .request(req)
                .call();

            if (res.bankingAccount().isPresent()) {
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
| `request`                                                                                                          | [io.codat.lending.models.operations.GetBankingAccountRequest](../../models/operations/GetBankingAccountRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetBankingAccountResponse>](../../models/operations/GetBankingAccountResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listBankingAccounts

The *List accounts* endpoint returns a list of [accounts](https://docs.codat.io/lending-api#/schemas/Account) for a given company's connection.

[Accounts](https://docs.codat.io/lending-api#/schemas/Account) are financial accounts maintained by a bank or other financial institution.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.ListBankingAccountsRequest;
import io.codat.lending.models.operations.ListBankingAccountsResponse;
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

            ListBankingAccountsRequest req = ListBankingAccountsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("string")
                .build();

            ListBankingAccountsResponse res = sdk.banking().accounts().listBankingAccounts()
                .request(req)
                .call();

            if (res.bankingAccounts().isPresent()) {
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [io.codat.lending.models.operations.ListBankingAccountsRequest](../../models/operations/ListBankingAccountsRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[Optional<? extends io.codat.lending.models.operations.ListBankingAccountsResponse>](../../models/operations/ListBankingAccountsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
