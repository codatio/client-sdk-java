# CategorizedStatement
(*banking().categorizedStatement()*)

## Overview

### Available Operations

* [get](#get) - Get categorized bank statement

## get

﻿> **Categorization engine**
>
> The categorization engine uses machine learning and has been fully trained against Plaid and TrueLayer banking data sources. It is not fully trained against the Basiq banking data source.

The _Get categorized bank statement_ endpoint provides a fully categorized list of banking transactions for a company. Accounts and transaction data are obtained from the company's banking data sources.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCategorizedBankStatementRequest;
import io.codat.lending.models.operations.GetCategorizedBankStatementResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetCategorizedBankStatementRequest req = GetCategorizedBankStatementRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        GetCategorizedBankStatementResponse res = sdk.banking().categorizedStatement().get()
                .request(req)
                .call();

        if (res.enhancedCashFlowTransactions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [GetCategorizedBankStatementRequest](../../models/operations/GetCategorizedBankStatementRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[GetCategorizedBankStatementResponse](../../models/operations/GetCategorizedBankStatementResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |