# CompanyInfo
(*companyInfo()*)

## Overview

View company profile from the source platform.

### Available Operations

* [getAccountingProfile](#getaccountingprofile) - Get company accounting profile

## getAccountingProfile

Gets the latest basic info for a company.

### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.GetAccountingProfileRequest;
import io.codat.sync.payroll.models.operations.GetAccountingProfileResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetAccountingProfileRequest req = GetAccountingProfileRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetAccountingProfileResponse res = sdk.companyInfo().getAccountingProfile()
                .request(req)
                .call();

            if (res.companyInfo().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.ErrorMessage e) {
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
| `request`                                                                             | [GetAccountingProfileRequest](../../models/operations/GetAccountingProfileRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAccountingProfileResponse](../../models/operations/GetAccountingProfileResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 401,402,403,404,409,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |
