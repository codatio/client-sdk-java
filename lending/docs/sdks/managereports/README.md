# ManageReports
(*manageReports()*)

## Overview

Endpoints to manage generation of reports

### Available Operations

* [generateReport](#generatereport) - Generate report
* [listReports](#listreports) - List reports

## generateReport

> **Available as beta release**
>
> This endpoint is part of a beta release. Please contact your account manager if you want to enable it.

Use the *Generate report* endpoint to initiate the generation of a report specified by the `reportType` parameter.

This action triggers the system to refresh and pull the necessary data from the company's data sources to ensure the report contains the most up-to-date information.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GenerateReportRequest;
import io.codat.lending.models.operations.GenerateReportResponse;
import io.codat.lending.models.shared.ReportType;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GenerateReportRequest req = GenerateReportRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .reportType(ReportType.CATEGORIZED_BANK_STATEMENT)
                .build();

        GenerateReportResponse res = sdk.manageReports().generateReport()
                .request(req)
                .call();

        if (res.reportOperation().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GenerateReportRequest](../../models/operations/GenerateReportRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GenerateReportResponse](../../models/operations/GenerateReportResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## listReports

> **Available as beta release**
>
> This endpoint is part of a beta release. Please contact your account manager if you want to enable it.

Use the *List reports* endpoint to return details about all reports generated for a company. The query parameter can be used to filter the results.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.ListReportsRequest;
import io.codat.lending.models.operations.ListReportsResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        ListReportsRequest req = ListReportsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListReportsResponse res = sdk.manageReports().listReports()
                .request(req)
                .call();

        if (res.reports().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListReportsRequest](../../models/operations/ListReportsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListReportsResponse](../../models/operations/ListReportsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |