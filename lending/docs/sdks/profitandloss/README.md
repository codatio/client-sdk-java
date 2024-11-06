# ProfitAndLoss
(*financialStatements().profitAndLoss()*)

## Overview

### Available Operations

* [get](#get) - Get profit and loss
* [getCategorizedAccounts](#getcategorizedaccounts) - Get categorized profit and loss statement

## get

Gets the latest profit and loss for a company.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetAccountingProfitAndLossRequest;
import io.codat.lending.models.operations.GetAccountingProfitAndLossResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetAccountingProfitAndLossRequest req = GetAccountingProfitAndLossRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .periodLength(4)
                .periodsToCompare(20)
                .startMonth("2022-10-23T00:00:00Z")
                .build();

        GetAccountingProfitAndLossResponse res = sdk.financialStatements().profitAndLoss().get()
                .request(req)
                .call();

        if (res.accountingProfitAndLossReport().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetAccountingProfitAndLossRequest](../../models/operations/GetAccountingProfitAndLossRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetAccountingProfitAndLossResponse](../../models/operations/GetAccountingProfitAndLossResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 401, 402, 403, 404, 409, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## getCategorizedAccounts

The *Get categorized profit and loss statement* endpoint returns a list of categorized accounts that appear on a company’s Profit and Loss statement. It also includes a balance as of the financial statement date.

Codat suggests a category for each account automatically, but you can [change it](https://docs.codat.io/lending/features/financial-statements-overview#recategorizing-accounts) to a more suitable one.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCategorizedProfitAndLossStatementRequest;
import io.codat.lending.models.operations.GetCategorizedProfitAndLossStatementResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetCategorizedProfitAndLossStatementRequest req = GetCategorizedProfitAndLossStatementRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .reportDate("29-09-2020")
                .build();

        GetCategorizedProfitAndLossStatementResponse res = sdk.financialStatements().profitAndLoss().getCategorizedAccounts()
                .request(req)
                .call();

        if (res.enhancedFinancialReport().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [GetCategorizedProfitAndLossStatementRequest](../../models/operations/GetCategorizedProfitAndLossStatementRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[GetCategorizedProfitAndLossStatementResponse](../../models/operations/GetCategorizedProfitAndLossStatementResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |