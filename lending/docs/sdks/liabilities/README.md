# Liabilities
(*liabilities()*)

## Overview

Debt and other liabilities.

### Available Operations

* [generateLoanSummary](#generateloansummary) - Generate loan summaries report
* [generateLoanTransactions](#generateloantransactions) - Generate loan transactions report
* [getLoanSummary](#getloansummary) - Get loan summaries
* [listLoanTransactions](#listloantransactions) - List loan transactions

## generateLoanSummary

The _Generate loan summaries_ endpoint requests the generation of the Loan Summaries report.

Learn more about Codat's liabilities feature [here](https://docs.codat.io/lending/features/liabilities-overview).

Make sure you have [synced a company](https://docs.codat.io/lending-api#/operations/refresh-company-data) recently before calling the endpoint.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.GenerateLoanSummaryRequest;
import io.codat.lending.models.operations.GenerateLoanSummaryResponse;
import io.codat.lending.models.operations.SourceType;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GenerateLoanSummaryRequest req = GenerateLoanSummaryRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .sourceType(SourceType.ACCOUNTING)
                .build();

            GenerateLoanSummaryResponse res = sdk.liabilities().generateLoanSummary()
                .request(req)
                .call();

            // handle response
        } catch (io.codat.lending.models.errors.ErrorMessage e) {
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
| `request`                                                                           | [GenerateLoanSummaryRequest](../../models/operations/GenerateLoanSummaryRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GenerateLoanSummaryResponse](../../models/operations/GenerateLoanSummaryResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## generateLoanTransactions

The _Generate loan transactions_ endpoint requests the generation of the Loan Transactions report.

Learn more about Codat's liabilities feature [here](https://docs.codat.io/lending/features/liabilities-overview).

Make sure you have [synced a company](https://docs.codat.io/lending-api#/operations/refresh-company-data) recently before calling the endpoint.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.GenerateLoanTransactionsRequest;
import io.codat.lending.models.operations.GenerateLoanTransactionsResponse;
import io.codat.lending.models.operations.QueryParamSourceType;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GenerateLoanTransactionsRequest req = GenerateLoanTransactionsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .sourceType(QueryParamSourceType.ACCOUNTING)
                .build();

            GenerateLoanTransactionsResponse res = sdk.liabilities().generateLoanTransactions()
                .request(req)
                .call();

            // handle response
        } catch (io.codat.lending.models.errors.ErrorMessage e) {
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

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GenerateLoanTransactionsRequest](../../models/operations/GenerateLoanTransactionsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GenerateLoanTransactionsResponse](../../models/operations/GenerateLoanTransactionsResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## getLoanSummary

The *Get loan summaries* endpoint returns a summary by integration type of all loans identified from a company's accounting, banking, and commerce integrations.

The endpoint returns a list of a company's [loan summaries](https://docs.codat.io/lending-api#/schemas/LoanSummary) for each valid data connection.

Make sure you have [synced a company](https://docs.codat.io/lending-api#/operations/refresh-company-data) recently before calling the endpoint.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.GetLoanSummaryQueryParamSourceType;
import io.codat.lending.models.operations.GetLoanSummaryRequest;
import io.codat.lending.models.operations.GetLoanSummaryResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetLoanSummaryRequest req = GetLoanSummaryRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .sourceType(GetLoanSummaryQueryParamSourceType.BANKING)
                .build();

            GetLoanSummaryResponse res = sdk.liabilities().getLoanSummary()
                .request(req)
                .call();

            if (res.loanSummary().isPresent()) {
                // handle response
            }
        } catch (io.codat.lending.models.errors.ErrorMessage e) {
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

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetLoanSummaryRequest](../../models/operations/GetLoanSummaryRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetLoanSummaryResponse](../../models/operations/GetLoanSummaryResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## listLoanTransactions

The *List loan transactions* endpoint returns all [loan transactions](https://docs.codat.io/lending-api#/schemas/LoanTransactions) identified from a company's accounting, banking, and commerce integrations.

This detail gives analysts a better idea of the loan obligations a company may have.

Make sure you have [synced a company](https://docs.codat.io/lending-api#/operations/refresh-company-data) recently before calling the endpoint.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.ListLoanTransactionsQueryParamSourceType;
import io.codat.lending.models.operations.ListLoanTransactionsRequest;
import io.codat.lending.models.operations.ListLoanTransactionsResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            ListLoanTransactionsRequest req = ListLoanTransactionsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .sourceType(ListLoanTransactionsQueryParamSourceType.COMMERCE)
                .build();

            ListLoanTransactionsResponse res = sdk.liabilities().listLoanTransactions()
                .request(req)
                .call();

            if (res.loanTransactions().isPresent()) {
                // handle response
            }
        } catch (io.codat.lending.models.errors.ErrorMessage e) {
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

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListLoanTransactionsRequest](../../models/operations/ListLoanTransactionsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListLoanTransactionsResponse](../../models/operations/ListLoanTransactionsResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |
