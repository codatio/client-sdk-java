# Metrics
(*sales().metrics()*)

## Overview

### Available Operations

* [getCustomerRetention](#getcustomerretention) - Get customer retention metrics
* [getLifetimeValue](#getlifetimevalue) - Get lifetime value metrics
* [getRevenue](#getrevenue) - Get commerce revenue metrics

## getCustomerRetention

The *Get customer retention metrics* endpoint returns customer retention insights for a specific company's commerce connection over one or more periods of time.

This detail helps you assess a merchant's health and advise them on performance improvement strategies. It also provides you with key insights you need to assess the credit risk of a company. 

#### Customer retention metrics

- __Existing customers__: the number of unique customers that have placed an order(s) in the specified period and any previous period. 
- __New customers__: the number of unique customers that have placed an order(s) in the specified period and none in any previous period.
- __Total customers__: the total number of existing and new customers within the specified period.
- __Retention rate__: the ratio of existing customers within the specified period compared to the total customers at the end of the previous period represented as a percentage.
- __Repeat rate__: the ratio of existing customers to total customers over the specified period represented as a percentage.

[Learn more](https://docs.codat.io/lending/features/sales-overview#metrics) about the formulas used to calculate customer retention metrics.

#### Response structure

The Customer retention report's dimensions and measures are:

| Index                       | Dimensions                 |
|-----------------------------|----------------------------|
| `index` = 0                 | Period                     |
| `index` = 1                 | Customer retention metrics |

| Index                | Measures    |
|----------------------|------------|
| `index` = 0          | Count      |
| `index` = 1          | Percentage |

The report data then combines multiple reporting dimensions and measures and outputs the value of each combination.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCommerceCustomerRetentionMetricsRequest;
import io.codat.lending.models.operations.GetCommerceCustomerRetentionMetricsResponse;
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

        GetCommerceCustomerRetentionMetricsRequest req = GetCommerceCustomerRetentionMetricsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .numberOfPeriods(431272L)
                .periodLength(497588L)
                .periodUnit(PeriodUnit.DAY)
                .reportDate("29-09-2020")
                .build();

        GetCommerceCustomerRetentionMetricsResponse res = sdk.sales().metrics().getCustomerRetention()
                .request(req)
                .call();

        if (res.commerceReport().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [GetCommerceCustomerRetentionMetricsRequest](../../models/operations/GetCommerceCustomerRetentionMetricsRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[GetCommerceCustomerRetentionMetricsResponse](../../models/operations/GetCommerceCustomerRetentionMetricsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## getLifetimeValue

The *Get lifetime value metrics* endpoint returns the average revenue that a specific company will generate throughout its lifespan over one or more periods of time.

This detail helps you assess a merchant's health and advise them on performance improvement strategies. It also provides you with key insights you need to assess the credit risk of a company.

[Learn more](https://docs.codat.io/lending/features/sales-overview#metrics) about the formulas used to calculate the lifetime value metrics.

#### Response structure

The Lifetime value report's dimensions and measures are:

| Index         | Dimensions             |
|---------------|------------------------|
| `index` = 0   | Period                 |
| `index` = 1   | Lifetime value metrics |

| Index             | Measures |
|-------------------|---------|
|   `index` = 1     | Value   |

The report data then combines multiple reporting dimensions and measures and outputs the value of each combination.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCommerceLifetimeValueMetricsRequest;
import io.codat.lending.models.operations.GetCommerceLifetimeValueMetricsResponse;
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

        GetCommerceLifetimeValueMetricsRequest req = GetCommerceLifetimeValueMetricsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .numberOfPeriods(500610L)
                .periodLength(900865L)
                .periodUnit(PeriodUnit.YEAR)
                .reportDate("29-09-2020")
                .build();

        GetCommerceLifetimeValueMetricsResponse res = sdk.sales().metrics().getLifetimeValue()
                .request(req)
                .call();

        if (res.commerceReport().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [GetCommerceLifetimeValueMetricsRequest](../../models/operations/GetCommerceLifetimeValueMetricsRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[GetCommerceLifetimeValueMetricsResponse](../../models/operations/GetCommerceLifetimeValueMetricsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## getRevenue

The *Get revenue report* endpoint returns the revenue and revenue growth for a specific company connection over one or more periods of time.

This detail helps you assess a merchant's health and advise them on performance improvement strategies. It also provides you with key insights you need to assess the credit risk of a company. 

[Learn more](https://docs.codat.io/lending/features/sales-overview#metrics) about the formulas used to calculate the revenue metrics.

#### Response structure

The Revenue report's dimensions and measures are:

| Index         | Dimensions |
|---------------|------------|
|   `index` = 0 | Period     |
|   `index` = 1 | Revenue    |

| Index         | Measures                                                                                                                 |
|---------------|--------------------------------------------------------------------------------------------------------------------------|
| `index` = 0   | Value                                                                                                                    |
| `index` = 1   | Percentage change, defined as the change between the current and previous periods' values and expressed as a percentage. |

The report data then combines multiple reporting dimensions and measures and outputs the value of each combination.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCommerceRevenueMetricsRequest;
import io.codat.lending.models.operations.GetCommerceRevenueMetricsResponse;
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

        GetCommerceRevenueMetricsRequest req = GetCommerceRevenueMetricsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .numberOfPeriods(120092L)
                .periodLength(307462L)
                .periodUnit(PeriodUnit.YEAR)
                .reportDate("29-09-2020")
                .build();

        GetCommerceRevenueMetricsResponse res = sdk.sales().metrics().getRevenue()
                .request(req)
                .call();

        if (res.commerceReport().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetCommerceRevenueMetricsRequest](../../models/operations/GetCommerceRevenueMetricsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetCommerceRevenueMetricsResponse](../../models/operations/GetCommerceRevenueMetricsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |