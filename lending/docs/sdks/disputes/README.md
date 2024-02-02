# Disputes
(*sales().disputes()*)

### Available Operations

* [getCommerceDispute](#getcommercedispute) - Get dispute
* [listCommerceDisputes](#listcommercedisputes) - List disputes

## getCommerceDispute

The *Get dispute* endpoint returns a single dispute for a given disputeId.

[Disputes](https://docs.codat.io/lending-api#/schemas/Dispute) are created when a customer is unsatisfied with their purchase or believe they have been charged incorrectly.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/commerce?view=tab-by-data-type&dataType=commerce-disputes) for integrations that support getting a specific dispute.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetCommerceDisputeRequest;
import io.codat.lending.models.operations.GetCommerceDisputeResponse;
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

            GetCommerceDisputeRequest req = GetCommerceDisputeRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .disputeId("string")
                .build();

            GetCommerceDisputeResponse res = sdk.sales().disputes().getCommerceDispute()
                .request(req)
                .call();

            if (res.commerceDispute().isPresent()) {
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
| `request`                                                                                                            | [io.codat.lending.models.operations.GetCommerceDisputeRequest](../../models/operations/GetCommerceDisputeRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetCommerceDisputeResponse>](../../models/operations/GetCommerceDisputeResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listCommerceDisputes

The *List disputes* endpoint returns a list of [disputes](https://docs.codat.io/lending-api#/schemas/Dispute) for a given company's connection.

[Disputes](https://docs.codat.io/lending-api#/schemas/Dispute) are created when a customer is unsatisfied with their purchase or believe they have been charged incorrectly.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.ListCommerceDisputesRequest;
import io.codat.lending.models.operations.ListCommerceDisputesResponse;
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

            ListCommerceDisputesRequest req = ListCommerceDisputesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("string")
                .build();

            ListCommerceDisputesResponse res = sdk.sales().disputes().listCommerceDisputes()
                .request(req)
                .call();

            if (res.commerceDisputes().isPresent()) {
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
| `request`                                                                                                                | [io.codat.lending.models.operations.ListCommerceDisputesRequest](../../models/operations/ListCommerceDisputesRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Optional<? extends io.codat.lending.models.operations.ListCommerceDisputesResponse>](../../models/operations/ListCommerceDisputesResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
