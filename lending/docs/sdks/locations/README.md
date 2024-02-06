# Locations
(*sales().locations()*)

### Available Operations

* [get](#get) - Get location
* [list](#list) - List locations

## get

The *Get location* endpoint returns a single location for a given locationId.

[Locations](https://docs.codat.io/lending-api#/schemas/Location) hold information on the geographic location at which stocks of [products](https://docs.codat.io/lending-api#/schemas/Product) may be held or where [orders](https://docs.codat.io/lending-api#/schemas/Order) were placed.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/commerce?view=tab-by-data-type&dataType=commerce-locations) for integrations that support getting a specific location.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetCommerceLocationRequest;
import io.codat.lending.models.operations.GetCommerceLocationResponse;
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

            GetCommerceLocationRequest req = GetCommerceLocationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .locationId("string")
                .build();

            GetCommerceLocationResponse res = sdk.sales().locations().get()
                .request(req)
                .call();

            if (res.commerceLocation().isPresent()) {
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [io.codat.lending.models.operations.GetCommerceLocationRequest](../../models/operations/GetCommerceLocationRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetCommerceLocationResponse>](../../models/operations/GetCommerceLocationResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List locations* endpoint returns a list of [locations](https://docs.codat.io/lending-api#/schemas/Location) for a given company's connection.

[Locations](https://docs.codat.io/lending-api#/schemas/Location) hold information on the geographic location at which stocks of [products](https://docs.codat.io/lending-api#/schemas/Product) may be held or where [orders](https://docs.codat.io/lending-api#/schemas/Order) were placed.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.ListCommerceLocationsRequest;
import io.codat.lending.models.operations.ListCommerceLocationsResponse;
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

            ListCommerceLocationsRequest req = ListCommerceLocationsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            ListCommerceLocationsResponse res = sdk.sales().locations().list()
                .request(req)
                .call();

            if (res.commerceLocations().isPresent()) {
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [io.codat.lending.models.operations.ListCommerceLocationsRequest](../../models/operations/ListCommerceLocationsRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends io.codat.lending.models.operations.ListCommerceLocationsResponse>](../../models/operations/ListCommerceLocationsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
