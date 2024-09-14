# AccountBalances
(*accountBalances()*)

## Overview

Balances for a bank account including end-of-day batch balance or running balances per transaction.

### Available Operations

* [list](#list) - List account balances

## list

The *List account balances* endpoint returns a list of [account balances](https://docs.codat.io/banking-api#/schemas/AccountBalance) for a given company's connection.

[Account balances](https://docs.codat.io/banking-api#/schemas/AccountBalance) are balances for a bank account, including end-of-day batch balance or running balances per transaction.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.banking.CodatBanking;
import io.codat.banking.models.errors.SDKError;
import io.codat.banking.models.operations.ListAccountBalancesRequest;
import io.codat.banking.models.operations.ListAccountBalancesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatBanking sdk = CodatBanking.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListAccountBalancesRequest req = ListAccountBalancesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            ListAccountBalancesResponse res = sdk.accountBalances().list()
                .request(req)
                .call();

            if (res.accountBalances().isPresent()) {
                // handle response
            }
        } catch (io.codat.banking.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListAccountBalancesRequest](../../models/operations/ListAccountBalancesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListAccountBalancesResponse](../../models/operations/ListAccountBalancesResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/ErrorMessage          | 400,401,402,403,404,409,429,500,503 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |
