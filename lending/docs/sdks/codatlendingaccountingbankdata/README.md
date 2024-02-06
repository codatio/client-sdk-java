# CodatLendingAccountingBankData
(*accountingBankData()*)

## Overview

Access bank transactions from an accounting platform.

### Available Operations

* [listTransactions](#listtransactions) - List bank account transactions

## listTransactions

The *List account bank transactions* endpoint returns a list of [bank account transactions](https://docs.codat.io/lending-api#/schemas/BankTransactions) for a given company's connection.

[Bank account transactions](https://docs.codat.io/lending-api#/schemas/BankTransactions) are records of money that has moved in and out of an SMB's bank account.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=bankTransactions) for integrations that support listing bank transactions.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.ListAccountingBankAccountTransactionsRequest;
import io.codat.lending.models.operations.ListAccountingBankAccountTransactionsResponse;
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

            ListAccountingBankAccountTransactionsRequest req = ListAccountingBankAccountTransactionsRequest.builder()
                .accountId("string")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("string")
                .build();

            ListAccountingBankAccountTransactionsResponse res = sdk.accountingBankData().listTransactions()
                .request(req)
                .call();

            if (res.accountingBankTransactions().isPresent()) {
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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [io.codat.lending.models.operations.ListAccountingBankAccountTransactionsRequest](../../models/operations/ListAccountingBankAccountTransactionsRequest.md) | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |


### Response

**[Optional<? extends io.codat.lending.models.operations.ListAccountingBankAccountTransactionsResponse>](../../models/operations/ListAccountingBankAccountTransactionsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
