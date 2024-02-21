# BalanceSheet
(*financialStatements().balanceSheet()*)

### Available Operations

* [get](#get) - Get balance sheet
* [getCategorizedAccounts](#getcategorizedaccounts) - Get categorized balance sheet statement

## get

Gets the latest balance sheet for a company.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetAccountingBalanceSheetRequest;
import io.codat.lending.models.operations.GetAccountingBalanceSheetResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetAccountingBalanceSheetRequest req = GetAccountingBalanceSheetRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .periodLength(4)
                .periodsToCompare(20)
                .startMonth("2022-10-23T00:00:00Z")
                .build();

            GetAccountingBalanceSheetResponse res = sdk.financialStatements().balanceSheet().get()
                .request(req)
                .call();

            if (res.accountingBalanceSheet().isPresent()) {
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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [io.codat.lending.models.operations.GetAccountingBalanceSheetRequest](../../models/operations/GetAccountingBalanceSheetRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetAccountingBalanceSheetResponse>](../../models/operations/GetAccountingBalanceSheetResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCategorizedAccounts

The *Get categorized balance sheet statement* endpoint returns a list of categorized accounts that appear on a company’s Balance Sheet along with a balance per financial statement date.

Codat suggests a category for each account automatically, but you can [change it](https://docs.codat.io/lending/enhanced-financials/overview#categorize-accounts) to a more suitable one.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetCategorizedBalanceSheetStatementRequest;
import io.codat.lending.models.operations.GetCategorizedBalanceSheetStatementResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetCategorizedBalanceSheetStatementRequest req = GetCategorizedBalanceSheetStatementRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .reportDate("29-09-2020")
                .numberOfPeriods(258121L)
                .build();

            GetCategorizedBalanceSheetStatementResponse res = sdk.financialStatements().balanceSheet().getCategorizedAccounts()
                .request(req)
                .call();

            if (res.enhancedFinancialReport().isPresent()) {
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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [io.codat.lending.models.operations.GetCategorizedBalanceSheetStatementRequest](../../models/operations/GetCategorizedBalanceSheetStatementRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetCategorizedBalanceSheetStatementResponse>](../../models/operations/GetCategorizedBalanceSheetStatementResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
