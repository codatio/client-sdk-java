# Reports
(*accountsReceivable().reports()*)

### Available Operations

* [getAccountingAgedCreditorsReport](#getaccountingagedcreditorsreport) - Aged creditors report
* [getAccountingAgedDebtorsReport](#getaccountingageddebtorsreport) - Aged debtors report
* [isAgedCreditorsReportAvailable](#isagedcreditorsreportavailable) - Aged creditors report available
* [isAgedDebtorsReportAvailable](#isageddebtorsreportavailable) - Aged debtors report available

## getAccountingAgedCreditorsReport

Returns aged creditors report for company that shows the total balance owed by a business to its suppliers over time.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetAccountingAgedCreditorsReportRequest;
import io.codat.lending.models.operations.GetAccountingAgedCreditorsReportResponse;
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

            GetAccountingAgedCreditorsReportRequest req = GetAccountingAgedCreditorsReportRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .numberOfPeriods(12)
                .periodLengthDays(30)
                .reportDate(LocalDate.parse("2022-12-31"))
                .build();

            GetAccountingAgedCreditorsReportResponse res = sdk.accountsReceivable().reports().getAccountingAgedCreditorsReport()
                .request(req)
                .call();

            if (res.accountingAgedCreditorReport().isPresent()) {
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [io.codat.lending.models.operations.GetAccountingAgedCreditorsReportRequest](../../models/operations/GetAccountingAgedCreditorsReportRequest.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetAccountingAgedCreditorsReportResponse>](../../models/operations/GetAccountingAgedCreditorsReportResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getAccountingAgedDebtorsReport

Returns aged debtors report for company that shows the total outstanding balance due from customers to the business over time.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetAccountingAgedDebtorsReportRequest;
import io.codat.lending.models.operations.GetAccountingAgedDebtorsReportResponse;
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

            GetAccountingAgedDebtorsReportRequest req = GetAccountingAgedDebtorsReportRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .numberOfPeriods(12)
                .periodLengthDays(30)
                .reportDate(LocalDate.parse("2022-12-31"))
                .build();

            GetAccountingAgedDebtorsReportResponse res = sdk.accountsReceivable().reports().getAccountingAgedDebtorsReport()
                .request(req)
                .call();

            if (res.accountingAgedDebtorReport().isPresent()) {
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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [io.codat.lending.models.operations.GetAccountingAgedDebtorsReportRequest](../../models/operations/GetAccountingAgedDebtorsReportRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetAccountingAgedDebtorsReportResponse>](../../models/operations/GetAccountingAgedDebtorsReportResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## isAgedCreditorsReportAvailable

Indicates whether the aged creditor report is available for the company.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.IsAgedCreditorsReportAvailableRequest;
import io.codat.lending.models.operations.IsAgedCreditorsReportAvailableResponse;
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

            IsAgedCreditorsReportAvailableRequest req = IsAgedCreditorsReportAvailableRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            IsAgedCreditorsReportAvailableResponse res = sdk.accountsReceivable().reports().isAgedCreditorsReportAvailable()
                .request(req)
                .call();

            if (res.boolean_().isPresent()) {
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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [io.codat.lending.models.operations.IsAgedCreditorsReportAvailableRequest](../../models/operations/IsAgedCreditorsReportAvailableRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[Optional<? extends io.codat.lending.models.operations.IsAgedCreditorsReportAvailableResponse>](../../models/operations/IsAgedCreditorsReportAvailableResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## isAgedDebtorsReportAvailable

Indicates whether the aged debtors report is available for the company.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.IsAgedDebtorsReportAvailableRequest;
import io.codat.lending.models.operations.IsAgedDebtorsReportAvailableResponse;
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

            IsAgedDebtorsReportAvailableRequest req = IsAgedDebtorsReportAvailableRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            IsAgedDebtorsReportAvailableResponse res = sdk.accountsReceivable().reports().isAgedDebtorsReportAvailable()
                .request(req)
                .call();

            if (res.boolean_().isPresent()) {
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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [io.codat.lending.models.operations.IsAgedDebtorsReportAvailableRequest](../../models/operations/IsAgedDebtorsReportAvailableRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[Optional<? extends io.codat.lending.models.operations.IsAgedDebtorsReportAvailableResponse>](../../models/operations/IsAgedDebtorsReportAvailableResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
