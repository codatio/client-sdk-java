# AccountBalances
(*banking().accountBalances()*)

## Overview

### Available Operations

* [list](#list) - List account balances

## list

The *List account balances* endpoint returns a list of [account balances](https://docs.codat.io/lending-api#/schemas/AccountBalance) for a given company's connection.

[Account balances](https://docs.codat.io/lending-api#/schemas/AccountBalance) are balances for a bank account, including end-of-day batch balance or running balances per transaction.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.ListBankingAccountBalancesRequest;
import io.codat.lending.models.operations.ListBankingAccountBalancesResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ListBankingAccountBalancesRequest req = ListBankingAccountBalancesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListBankingAccountBalancesResponse res = sdk.banking().accountBalances().list()
                .request(req)
                .call();

        if (res.bankingAccountBalances().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListBankingAccountBalancesRequest](../../models/operations/ListBankingAccountBalancesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListBankingAccountBalancesResponse](../../models/operations/ListBankingAccountBalancesResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/ErrorMessage                  | 400, 401, 402, 403, 404, 409, 429, 500, 503 | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |