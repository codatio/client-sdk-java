# CodatLendingReports
(*sales().reports()*)

## Overview

### Available Operations

* [getOrders](#getorders) - Get orders report
* [getRefunds](#getrefunds) - Get refunds report

## getOrders

The *Get orders report* endpoint returns the number of orders, total value, and average order value for a specific company's commerce connection over one or more periods of time.

This detail helps you assess a merchant's health and advise them on performance improvement strategies. It also provides you with key insights you need to assess the credit risk of a company. 

[Learn more](https://docs.codat.io/lending/features/sales-overview#metrics) about the formulas used to calculate the order metrics.

#### Response structure

The Orders report's dimensions and measures are:

| Index         | Dimensions     |
|---------------|----------------|
|   `index` = 0 | Period         |
|   `index` = 1 | Order metrics  |

| Index         | Measures   |
|---------------|------------|
| `index` = 0   | Count      |
| `index` = 1   | Value      |

The report data then combines multiple reporting dimensions and measures and outputs the value of each combination.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCommerceOrdersReportRequest;
import io.codat.lending.models.operations.GetCommerceOrdersReportResponse;
import io.codat.lending.models.shared.PeriodUnit;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetCommerceOrdersReportRequest req = GetCommerceOrdersReportRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .numberOfPeriods(393849L)
                .periodLength(491586L)
                .periodUnit(PeriodUnit.YEAR)
                .reportDate("29-09-2020")
                .build();

        GetCommerceOrdersReportResponse res = sdk.sales().reports().getOrders()
                .request(req)
                .call();

        if (res.commerceReport().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetCommerceOrdersReportRequest](../../models/operations/GetCommerceOrdersReportRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetCommerceOrdersReportResponse](../../models/operations/GetCommerceOrdersReportResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## getRefunds

The *Get refunds report* endpoint returns the number and total value of refunds and the refund rate for a specific company's commerce connection over one or more periods of time.

This detail helps you assess a merchant's health and advise them on performance improvement strategies. It also provides you with key insights you need to assess the credit risk of a company. 

[Learn more](https://docs.codat.io/lending/features/sales-overview#metrics) about the formulas used to calculate the refunds metrics.

#### Response structure

The Refunds report's dimensions and measures are:

| Index          | Dimensions     |
|----------------|----------------|
| `index` = 0    | Period         |
| `index` = 1    | Refund metrics |

| Index          | Measures    |
|----------------|------------|
| `index` = 0    | Count      |
| `index` = 1    | Value      |
| `index` = 2    | Percentage |

The report data then combines multiple reporting dimensions and measures and outputs the value of each combination.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCommerceRefundsReportRequest;
import io.codat.lending.models.operations.GetCommerceRefundsReportResponse;
import io.codat.lending.models.shared.PeriodUnit;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetCommerceRefundsReportRequest req = GetCommerceRefundsReportRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .numberOfPeriods(810912L)
                .periodLength(277786L)
                .periodUnit(PeriodUnit.MONTH)
                .reportDate("29-09-2020")
                .build();

        GetCommerceRefundsReportResponse res = sdk.sales().reports().getRefunds()
                .request(req)
                .call();

        if (res.commerceReport().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetCommerceRefundsReportRequest](../../models/operations/GetCommerceRefundsReportRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetCommerceRefundsReportResponse](../../models/operations/GetCommerceRefundsReportResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |