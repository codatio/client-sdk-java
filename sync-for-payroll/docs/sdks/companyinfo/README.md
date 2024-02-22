# CompanyInfo
(*companyInfo()*)

## Overview

View company information fetched from the source platform.

### Available Operations

* [getAccountingProfile](#getaccountingprofile) - Get company accounting profile

## getAccountingProfile

Gets the latest basic info for a company.

### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.components.*;
import io.codat.sync.payroll.models.components.Security;
import io.codat.sync.payroll.models.operations.*;
import io.codat.sync.payroll.models.operations.GetAccountingProfileRequest;
import io.codat.sync.payroll.models.operations.GetAccountingProfileResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
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
        } catch (io.codat.sync.payroll.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [io.codat.sync.payroll.models.operations.GetAccountingProfileRequest](../../models/operations/GetAccountingProfileRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[Optional<? extends io.codat.sync.payroll.models.operations.GetAccountingProfileResponse>](../../models/operations/GetAccountingProfileResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
