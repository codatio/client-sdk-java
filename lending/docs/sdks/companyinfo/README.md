# CompanyInfo
(*companyInfo()*)

## Overview

View company information fetched from the source platform.

### Available Operations

* [getAccountingProfile](#getaccountingprofile) - Get company accounting profile
* [getCommerceProfile](#getcommerceprofile) - Get company commerce profile

## getAccountingProfile

Gets the latest basic info for a company.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetAccountingProfileRequest;
import io.codat.lending.models.operations.GetAccountingProfileResponse;
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

            GetAccountingProfileRequest req = GetAccountingProfileRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetAccountingProfileResponse res = sdk.companyInfo().getAccountingProfile()
                .request(req)
                .call();

            if (res.accountingCompanyInfo().isPresent()) {
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [io.codat.lending.models.operations.GetAccountingProfileRequest](../../models/operations/GetAccountingProfileRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetAccountingProfileResponse>](../../models/operations/GetAccountingProfileResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCommerceProfile

Retrieve information about the company, as seen in the commerce
platform.

This may include information like addresses, tax registration details and
social media or website information."

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetCommerceProfileRequest;
import io.codat.lending.models.operations.GetCommerceProfileResponse;
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

            GetCommerceProfileRequest req = GetCommerceProfileRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCommerceProfileResponse res = sdk.companyInfo().getCommerceProfile()
                .request(req)
                .call();

            if (res.commerceCompanyInfo().isPresent()) {
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [io.codat.lending.models.operations.GetCommerceProfileRequest](../../models/operations/GetCommerceProfileRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetCommerceProfileResponse>](../../models/operations/GetCommerceProfileResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
