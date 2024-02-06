# PaymentMethods
(*sales().paymentMethods()*)

### Available Operations

* [get](#get) - Get payment method
* [list](#list) - List payment methods

## get

The *Get payment method* endpoint returns a single payment method for a given paymentMethodId.

[Payment methods](https://docs.codat.io/lending-api#/schemas/PaymentMethod) represent the payment method(s) used to make payments.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/commerce?view=tab-by-data-type&dataType=commerce-paymentMethods) for integrations that support getting a specific payment method.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetCommercePaymentMethodRequest;
import io.codat.lending.models.operations.GetCommercePaymentMethodResponse;
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

            GetCommercePaymentMethodRequest req = GetCommercePaymentMethodRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .paymentMethodId("string")
                .build();

            GetCommercePaymentMethodResponse res = sdk.sales().paymentMethods().get()
                .request(req)
                .call();

            if (res.commercePaymentMethod().isPresent()) {
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
| `request`                                                                                                                        | [io.codat.lending.models.operations.GetCommercePaymentMethodRequest](../../models/operations/GetCommercePaymentMethodRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetCommercePaymentMethodResponse>](../../models/operations/GetCommercePaymentMethodResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List payment methods* endpoint returns a list of [payment methods](https://docs.codat.io/lending-api#/schemas/PaymentMethod) for a given company's connection.

[Payment methods](https://docs.codat.io/lending-api#/schemas/PaymentMethod) represent the payment method(s) used to make payments.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.ListCommercePaymentMethodsRequest;
import io.codat.lending.models.operations.ListCommercePaymentMethodsResponse;
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

            ListCommercePaymentMethodsRequest req = ListCommercePaymentMethodsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("string")
                .build();

            ListCommercePaymentMethodsResponse res = sdk.sales().paymentMethods().list()
                .request(req)
                .call();

            if (res.commercePaymentMethods().isPresent()) {
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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [io.codat.lending.models.operations.ListCommercePaymentMethodsRequest](../../models/operations/ListCommercePaymentMethodsRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[Optional<? extends io.codat.lending.models.operations.ListCommercePaymentMethodsResponse>](../../models/operations/ListCommercePaymentMethodsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
