# Reports
(*reports()*)

## Overview

Reports

### Available Operations

* [getAgedCreditorsReport](#getagedcreditorsreport) - Aged creditors report
* [getAgedDebtorsReport](#getageddebtorsreport) - Aged debtors report
* [getBalanceSheet](#getbalancesheet) - Get balance sheet
* [getCashFlowStatement](#getcashflowstatement) - Get cash flow statement
* [getProfitAndLoss](#getprofitandloss) - Get profit and loss
* [isAgedCreditorsReportAvailable](#isagedcreditorsreportavailable) - Aged creditors report available
* [isAgedDebtorReportAvailable](#isageddebtorreportavailable) - Aged debtors report available

## getAgedCreditorsReport

Returns aged creditors report for company that shows the total balance owed by a business to its suppliers over time.

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetAgedCreditorsReportRequest;
import io.codat.accounting.models.operations.GetAgedCreditorsReportResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetAgedCreditorsReportRequest req = GetAgedCreditorsReportRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .numberOfPeriods(12)
                .periodLengthDays(30)
                .reportDate(LocalDate.parse("2022-12-31"))
                .build();

            GetAgedCreditorsReportResponse res = sdk.reports().getAgedCreditorsReport()
                .request(req)
                .call();

            if (res.agedCreditorReport().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [io.codat.accounting.models.operations.GetAgedCreditorsReportRequest](../../models/operations/GetAgedCreditorsReportRequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetAgedCreditorsReportResponse>](../../models/operations/GetAgedCreditorsReportResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getAgedDebtorsReport

Returns aged debtors report for company that shows the total outstanding balance due from customers to the business over time.

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetAgedDebtorsReportRequest;
import io.codat.accounting.models.operations.GetAgedDebtorsReportResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetAgedDebtorsReportRequest req = GetAgedDebtorsReportRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .numberOfPeriods(12)
                .periodLengthDays(30)
                .reportDate(LocalDate.parse("2022-12-31"))
                .build();

            GetAgedDebtorsReportResponse res = sdk.reports().getAgedDebtorsReport()
                .request(req)
                .call();

            if (res.agedDebtorReport().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [io.codat.accounting.models.operations.GetAgedDebtorsReportRequest](../../models/operations/GetAgedDebtorsReportRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetAgedDebtorsReportResponse>](../../models/operations/GetAgedDebtorsReportResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getBalanceSheet

Gets the latest balance sheet for a company.

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetBalanceSheetRequest;
import io.codat.accounting.models.operations.GetBalanceSheetResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetBalanceSheetRequest req = GetBalanceSheetRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .periodLength(4)
                .periodsToCompare(20)
                .startMonth("2022-10-23T00:00:00Z")
                .build();

            GetBalanceSheetResponse res = sdk.reports().getBalanceSheet()
                .request(req)
                .call();

            if (res.balanceSheet().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [io.codat.accounting.models.operations.GetBalanceSheetRequest](../../models/operations/GetBalanceSheetRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetBalanceSheetResponse>](../../models/operations/GetBalanceSheetResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCashFlowStatement

Gets the latest cash flow statement for a company.

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetCashFlowStatementRequest;
import io.codat.accounting.models.operations.GetCashFlowStatementResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetCashFlowStatementRequest req = GetCashFlowStatementRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .periodLength(4)
                .periodsToCompare(20)
                .startMonth("2022-10-23T00:00:00Z")
                .build();

            GetCashFlowStatementResponse res = sdk.reports().getCashFlowStatement()
                .request(req)
                .call();

            if (res.cashFlowStatement().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [io.codat.accounting.models.operations.GetCashFlowStatementRequest](../../models/operations/GetCashFlowStatementRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetCashFlowStatementResponse>](../../models/operations/GetCashFlowStatementResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getProfitAndLoss

Gets the latest profit and loss for a company.

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetProfitAndLossRequest;
import io.codat.accounting.models.operations.GetProfitAndLossResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetProfitAndLossRequest req = GetProfitAndLossRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .periodLength(4)
                .periodsToCompare(20)
                .startMonth("2022-10-23T00:00:00Z")
                .build();

            GetProfitAndLossResponse res = sdk.reports().getProfitAndLoss()
                .request(req)
                .call();

            if (res.profitAndLossReport().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [io.codat.accounting.models.operations.GetProfitAndLossRequest](../../models/operations/GetProfitAndLossRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetProfitAndLossResponse>](../../models/operations/GetProfitAndLossResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## isAgedCreditorsReportAvailable

Indicates whether the aged creditor report is available for the company.

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.IsAgedCreditorsReportAvailableRequest;
import io.codat.accounting.models.operations.IsAgedCreditorsReportAvailableResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            IsAgedCreditorsReportAvailableRequest req = IsAgedCreditorsReportAvailableRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            IsAgedCreditorsReportAvailableResponse res = sdk.reports().isAgedCreditorsReportAvailable()
                .request(req)
                .call();

            if (res.boolean_().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                       | [io.codat.accounting.models.operations.IsAgedCreditorsReportAvailableRequest](../../models/operations/IsAgedCreditorsReportAvailableRequest.md) | :heavy_check_mark:                                                                                                                              | The request object to use for the request.                                                                                                      |


### Response

**[Optional<? extends io.codat.accounting.models.operations.IsAgedCreditorsReportAvailableResponse>](../../models/operations/IsAgedCreditorsReportAvailableResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## isAgedDebtorReportAvailable

Indicates whether the aged debtor report is available for the company.

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.IsAgedDebtorReportAvailableRequest;
import io.codat.accounting.models.operations.IsAgedDebtorReportAvailableResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            IsAgedDebtorReportAvailableRequest req = IsAgedDebtorReportAvailableRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            IsAgedDebtorReportAvailableResponse res = sdk.reports().isAgedDebtorReportAvailable()
                .request(req)
                .call();

            if (res.boolean_().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                 | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                 | [io.codat.accounting.models.operations.IsAgedDebtorReportAvailableRequest](../../models/operations/IsAgedDebtorReportAvailableRequest.md) | :heavy_check_mark:                                                                                                                        | The request object to use for the request.                                                                                                |


### Response

**[Optional<? extends io.codat.accounting.models.operations.IsAgedDebtorReportAvailableResponse>](../../models/operations/IsAgedDebtorReportAvailableResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
