# DataIntegrity
(*dataIntegrity()*)

## Overview

Match mutable accounting data with immutable banking data to increase confidence in financial data.

### Available Operations

* [details](#details) - List data integrity details
* [status](#status) - Get data integrity status
* [summaries](#summaries) - Get data integrity summaries

## details

The *List data integrity details* endpoint returns the match result record by record for a given data type, filtered based on a query string in the same way as summary results.

The [details](https://docs.codat.io/lending-api#/schemas/DataIntegrityDetails) are paginated and support ordering, following the same conventions as our other data endpoints.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.ListDataIntegrityDetailsRequest;
import io.codat.lending.models.operations.ListDataIntegrityDetailsResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.DataIntegrityDataType;
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

            ListDataIntegrityDetailsRequest req = ListDataIntegrityDetailsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .dataType(DataIntegrityDataType.BANKING_ACCOUNTS)
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("string")
                .build();

            ListDataIntegrityDetailsResponse res = sdk.dataIntegrity().details()
                .request(req)
                .call();

            if (res.dataIntegrityDetails().isPresent()) {
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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [io.codat.lending.models.operations.ListDataIntegrityDetailsRequest](../../models/operations/ListDataIntegrityDetailsRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[Optional<? extends io.codat.lending.models.operations.ListDataIntegrityDetailsResponse>](../../models/operations/ListDataIntegrityDetailsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## status

The *Get data integrity status* endpoint returns the [status](https://docs.codat.io/lending-api#/schemas/DataIntegrityStatus) for the company’s match results between the data type provided in the URL and other data types that Data Integrity uses to support matching.
This endpoint helps you understand whether match data is available and, if so, how to usefully query it.

The response tells you:

- Whether match results are available.
- When the results were generated, and their status.
- The connection IDs, amounts, and dates involved to support useful querying.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetDataIntegrityStatusRequest;
import io.codat.lending.models.operations.GetDataIntegrityStatusResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.DataIntegrityDataType;
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

            GetDataIntegrityStatusRequest req = GetDataIntegrityStatusRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .dataType(DataIntegrityDataType.BANKING_ACCOUNTS)
                .build();

            GetDataIntegrityStatusResponse res = sdk.dataIntegrity().status()
                .request(req)
                .call();

            if (res.dataIntegrityStatuses().isPresent()) {
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [io.codat.lending.models.operations.GetDataIntegrityStatusRequest](../../models/operations/GetDataIntegrityStatusRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetDataIntegrityStatusResponse>](../../models/operations/GetDataIntegrityStatusResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## summaries

The *Get data integrity summary* endpoint returns a [summary](https://docs.codat.io/lending-api#/schemas/DataIntegritySummary) of match results for a given data type filtered by a query string in the [Codat query language](https://docs.codat.io/using-the-api/querying). 

For example, if you wanted to see summary match results only for transactions after 1 December 2020, you could include a query parameter of `query=date>2020-12-01`.

The endpoint response includes only the summary results, not transactions. To view match data for transactions, use the [List data integrity details](https://docs.codat.io/lending-api#/operations/list-data-type-data-integrity-details) endpoint.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetDataIntegritySummariesRequest;
import io.codat.lending.models.operations.GetDataIntegritySummariesResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.DataIntegrityDataType;
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

            GetDataIntegritySummariesRequest req = GetDataIntegritySummariesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .dataType(DataIntegrityDataType.BANKING_ACCOUNTS)
                .query("string")
                .build();

            GetDataIntegritySummariesResponse res = sdk.dataIntegrity().summaries()
                .request(req)
                .call();

            if (res.dataIntegritySummaries().isPresent()) {
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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [io.codat.lending.models.operations.GetDataIntegritySummariesRequest](../../models/operations/GetDataIntegritySummariesRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetDataIntegritySummariesResponse>](../../models/operations/GetDataIntegritySummariesResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
