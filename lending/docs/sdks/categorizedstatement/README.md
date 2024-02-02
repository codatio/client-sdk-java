# CategorizedStatement
(*banking().categorizedStatement()*)

### Available Operations

* [getCategorizedBankStatement](#getcategorizedbankstatement) - Get categorized bank statement

## getCategorizedBankStatement

﻿> **Categorization engine**
>
> The categorization engine uses machine learning and has been fully trained against Plaid and TrueLayer banking data sources. It is not fully trained against the Basiq banking data source.

The _Get categorized bank statement_ endpoint provides a fully categorized list of banking transactions for a company. Accounts and transaction data are obtained from the company's banking data sources.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetCategorizedBankStatementRequest;
import io.codat.lending.models.operations.GetCategorizedBankStatementResponse;
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

            GetCategorizedBankStatementRequest req = GetCategorizedBankStatementRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .page(1)
                .pageSize(100)
                .query("string")
                .build();

            GetCategorizedBankStatementResponse res = sdk.banking().categorizedStatement().getCategorizedBankStatement()
                .request(req)
                .call();

            if (res.enhancedCashFlowTransactions().isPresent()) {
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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [io.codat.lending.models.operations.GetCategorizedBankStatementRequest](../../models/operations/GetCategorizedBankStatementRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetCategorizedBankStatementResponse>](../../models/operations/GetCategorizedBankStatementResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
