# Reports
(*accountsReceivable().reports()*)

## Overview

### Available Operations

* [getAgedCreditors](#getagedcreditors) - Aged creditors report
* [getAgedDebtors](#getageddebtors) - Aged debtors report
* [isAgedCreditorsAvailable](#isagedcreditorsavailable) - Aged creditors report available
* [isAgedDebtorsAvailable](#isageddebtorsavailable) - Aged debtors report available

## getAgedCreditors

Returns aged creditors report for company that shows the total balance owed by a business to its suppliers over time.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.GetAccountingAgedCreditorsReportRequest;
import io.codat.lending.models.operations.GetAccountingAgedCreditorsReportResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetAccountingAgedCreditorsReportRequest req = GetAccountingAgedCreditorsReportRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .numberOfPeriods(12)
                .periodLengthDays(30)
                .reportDate(LocalDate.parse("2022-12-31"))
                .build();

            GetAccountingAgedCreditorsReportResponse res = sdk.accountsReceivable().reports().getAgedCreditors()
                .request(req)
                .call();

            if (res.accountingAgedCreditorReport().isPresent()) {
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [GetAccountingAgedCreditorsReportRequest](../../models/operations/GetAccountingAgedCreditorsReportRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[GetAccountingAgedCreditorsReportResponse](../../models/operations/GetAccountingAgedCreditorsReportResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getAgedDebtors

Returns aged debtors report for company that shows the total outstanding balance due from customers to the business over time.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.GetAccountingAgedDebtorsReportRequest;
import io.codat.lending.models.operations.GetAccountingAgedDebtorsReportResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetAccountingAgedDebtorsReportRequest req = GetAccountingAgedDebtorsReportRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .numberOfPeriods(12)
                .periodLengthDays(30)
                .reportDate(LocalDate.parse("2022-12-31"))
                .build();

            GetAccountingAgedDebtorsReportResponse res = sdk.accountsReceivable().reports().getAgedDebtors()
                .request(req)
                .call();

            if (res.accountingAgedDebtorReport().isPresent()) {
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

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [GetAccountingAgedDebtorsReportRequest](../../models/operations/GetAccountingAgedDebtorsReportRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[GetAccountingAgedDebtorsReportResponse](../../models/operations/GetAccountingAgedDebtorsReportResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## isAgedCreditorsAvailable

Indicates whether the aged creditor report is available for the company.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.IsAgedCreditorsReportAvailableRequest;
import io.codat.lending.models.operations.IsAgedCreditorsReportAvailableResponse;
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

            IsAgedCreditorsReportAvailableRequest req = IsAgedCreditorsReportAvailableRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            IsAgedCreditorsReportAvailableResponse res = sdk.accountsReceivable().reports().isAgedCreditorsAvailable()
                .request(req)
                .call();

            if (res.boolean_().isPresent()) {
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

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [IsAgedCreditorsReportAvailableRequest](../../models/operations/IsAgedCreditorsReportAvailableRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[IsAgedCreditorsReportAvailableResponse](../../models/operations/IsAgedCreditorsReportAvailableResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## isAgedDebtorsAvailable

Indicates whether the aged debtors report is available for the company.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.IsAgedDebtorsReportAvailableRequest;
import io.codat.lending.models.operations.IsAgedDebtorsReportAvailableResponse;
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

            IsAgedDebtorsReportAvailableRequest req = IsAgedDebtorsReportAvailableRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            IsAgedDebtorsReportAvailableResponse res = sdk.accountsReceivable().reports().isAgedDebtorsAvailable()
                .request(req)
                .call();

            if (res.boolean_().isPresent()) {
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

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [IsAgedDebtorsReportAvailableRequest](../../models/operations/IsAgedDebtorsReportAvailableRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[IsAgedDebtorsReportAvailableResponse](../../models/operations/IsAgedDebtorsReportAvailableResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |
