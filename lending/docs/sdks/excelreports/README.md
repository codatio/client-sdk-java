# ExcelReports
(*excelReports()*)

## Overview

Download reports in Excel format.

### Available Operations

* [download](#download) - Download Excel report
* [generate](#generate) - Generate Excel report
* [getStatus](#getstatus) - Get Excel report status

## download

﻿The *Download Excel report* endpoint downloads the latest successfully generated Excel report of a specified report type for a given company. 

The downloadable Excel file is returned in the response. You can save it to your local machine.

You can [learn more](https://docs.codat.io/lending/excel/overview) about valid Excel report types.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.DownloadExcelReportRequest;
import io.codat.lending.models.operations.DownloadExcelReportResponse;
import io.codat.lending.models.shared.ExcelReportTypes;
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

            DownloadExcelReportRequest req = DownloadExcelReportRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .reportType(ExcelReportTypes.ENHANCED_FINANCIALS)
                .build();

            DownloadExcelReportResponse res = sdk.excelReports().download()
                .request(req)
                .call();

            if (res.body().isPresent()) {
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

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [DownloadExcelReportRequest](../../models/operations/DownloadExcelReportRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[DownloadExcelReportResponse](../../models/operations/DownloadExcelReportResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## generate

The *Generate Excel report* endpoint requests the production of a downloadable Excel file for a report type specified in the `reportType` query parameter.

In response, the endpoint returns the [status](https://docs.codat.io/lending-api#/schemas/ExcelStatus) detailing the current state of the report generation request.

### Report types

| reportType                                                                           | Description                                                                                                                                   |
|--------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------|
| [audit](https://docs.codat.io/lending/excel/audit-report)                            | Identifies inaccurate or out-of-date accounts, helping you to make decisions with confidence.                                                   || [audit](https://docs.codat.io/lending/excel/audit-report)                            | Identify inaccurate or out-of-date accounts, helping you to make decisions with confidence.                                                   |
| [enhancedCashFlow](https://docs.codat.io/lending/excel/enhanced-invoices-report)     | Provides a fully categorized list of bank transactions for a company, allowing lenders to accurately forecast a company's cash flow.  |
| [enhancedFinancials](https://docs.codat.io/lending/excel/enhanced-financials-report) | Supports decision-making using fully categorized financial statements to allow lenders to automate their underwriting processes.                |
| [enhancedInvoices](https://docs.codat.io/lending/excel/enhanced-invoices-report)     | Helps verify that payments have been made against historic invoices. Great for invoice finance lenders.                                       |

[Learn more](https://docs.codat.io/lending/excel/overview) about valid Excel report types.




### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.GenerateExcelReportRequest;
import io.codat.lending.models.operations.GenerateExcelReportResponse;
import io.codat.lending.models.shared.ExcelReportTypes;
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

            GenerateExcelReportRequest req = GenerateExcelReportRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .reportType(ExcelReportTypes.ENHANCED_INVOICES)
                .build();

            GenerateExcelReportResponse res = sdk.excelReports().generate()
                .request(req)
                .call();

            if (res.excelStatus().isPresent()) {
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

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GenerateExcelReportRequest](../../models/operations/GenerateExcelReportRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GenerateExcelReportResponse](../../models/operations/GenerateExcelReportResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## getStatus

﻿The *Get Excel report status* returns the status of the report mostly recently requested for Excel generation. It does not return the status of any historical report requests. 

Poll this endpoint to check the progress of the report once you have requested its generation. This will not affect the generation of the report. 

When the report generation completes successfully, the `inProgress` property will be marked as `false` and the `success` field will be marked as `true`.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.SDKError;
import io.codat.lending.models.operations.GetExcelReportGenerationStatusRequest;
import io.codat.lending.models.operations.GetExcelReportGenerationStatusResponse;
import io.codat.lending.models.shared.ExcelReportTypes;
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

            GetExcelReportGenerationStatusRequest req = GetExcelReportGenerationStatusRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .reportType(ExcelReportTypes.ENHANCED_CASH_FLOW)
                .build();

            GetExcelReportGenerationStatusResponse res = sdk.excelReports().getStatus()
                .request(req)
                .call();

            if (res.excelStatus().isPresent()) {
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
| `request`                                                                                                 | [GetExcelReportGenerationStatusRequest](../../models/operations/GetExcelReportGenerationStatusRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[GetExcelReportGenerationStatusResponse](../../models/operations/GetExcelReportGenerationStatusResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |
