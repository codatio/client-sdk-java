# TaxRates
(*taxRates()*)

## Overview

Access standardized Tax rates from linked accounting software.

### Available Operations

* [get](#get) - Get tax rate
* [list](#list) - List all tax rates

## get

The *Get tax rate* endpoint returns a single tax rate for a given taxRateId.

[Tax rates](https://docs.codat.io/accounting-api#/schemas/TaxRate) are a set of taxes and associated rates within the SMB's accounting software.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=taxRates) for integrations that support getting a specific tax rate.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.GetTaxRateRequest;
import io.codat.accounting.models.operations.GetTaxRateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetTaxRateRequest req = GetTaxRateRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .taxRateId("<value>")
                .build();

            GetTaxRateResponse res = sdk.taxRates().get()
                .request(req)
                .call();

            if (res.taxRate().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.ErrorMessage e) {
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

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetTaxRateRequest](../../models/operations/GetTaxRateRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetTaxRateResponse](../../models/operations/GetTaxRateResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 401,402,403,404,409,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## list

The *List tax rates* endpoint returns a list of [tax rates](https://docs.codat.io/accounting-api#/schemas/TaxRate) for a given company's connection.

[Tax rates](https://docs.codat.io/accounting-api#/schemas/TaxRate) are a set of taxes and associated rates within the SMB's accounting software.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.ListTaxRatesRequest;
import io.codat.accounting.models.operations.ListTaxRatesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListTaxRatesRequest req = ListTaxRatesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            ListTaxRatesResponse res = sdk.taxRates().list()
                .request(req)
                .call();

            if (res.taxRates().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.ErrorMessage e) {
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

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListTaxRatesRequest](../../models/operations/ListTaxRatesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListTaxRatesResponse](../../models/operations/ListTaxRatesResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/ErrorMessage          | 400,401,402,403,404,409,429,500,503 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |
