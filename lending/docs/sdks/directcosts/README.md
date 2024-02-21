# DirectCosts
(*loanWriteback().directCosts()*)

### Available Operations

* [create](#create) - Create direct cost
* [getCreateModel](#getcreatemodel) - Get create direct cost model

## create

The *Create direct cost* endpoint creates a new [direct cost](https://docs.codat.io/lending-api#/schemas/DirectCost) for a given company's connection.

[Direct costs](https://docs.codat.io/lending-api#/schemas/DirectCost) are the expenses associated with a business' operations. For example, purchases of raw materials that are paid off at the point of the purchase and service fees are considered direct costs.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create direct cost model](https://docs.codat.io/lending-api#/operations/get-create-directCosts-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=directCosts) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.CreateDirectCostRequest;
import io.codat.lending.models.operations.CreateDirectCostResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.AccountRef;
import io.codat.lending.models.shared.AccountingPaymentAllocation;
import io.codat.lending.models.shared.Allocation;
import io.codat.lending.models.shared.ContactReference;
import io.codat.lending.models.shared.DirectCostLineItem;
import io.codat.lending.models.shared.DirectCostPrototype;
import io.codat.lending.models.shared.DirectCostPrototypeDataType;
import io.codat.lending.models.shared.PaymentAllocationPayment;
import io.codat.lending.models.shared.PropertieItemRef;
import io.codat.lending.models.shared.RecordRef;
import io.codat.lending.models.shared.Security;
import io.codat.lending.models.shared.SupplementalData;
import io.codat.lending.models.shared.TaxRateRef;
import io.codat.lending.models.shared.Tracking;
import io.codat.lending.models.shared.TrackingCategoryRef;
import io.codat.lending.models.shared.TrackingRecordRef;
import io.codat.lending.models.shared.TrackingRecordRefDataType;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CreateDirectCostRequest req = CreateDirectCostRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .allowSyncOnPushComplete(false)
                .directCostPrototype(DirectCostPrototype.builder()
                    .currency("USD")
                    .issueDate("2022-10-23T00:00:00Z")
                    .lineItems(java.util.List.of(
                            DirectCostLineItem.builder()
                                .quantity(4174.58d)
                                .unitAmount(2884.08d)
                                .build()))
                    .paymentAllocations(java.util.List.of(
                            AccountingPaymentAllocation.builder()
                                .allocation(Allocation.builder()
                                        .allocatedOnDate("2022-10-23T00:00:00Z")
                                        .currency("USD")
                                        .currencyRate(9510.62d)
                                        .totalAmount(8915.1d)
                                        .build())
                                .payment(PaymentAllocationPayment.builder()
                                        .accountRef(AccountRef.builder()
                                            .id("<id>")
                                            .name("<value>")
                                            .build())
                                        .currency("GBP")
                                        .currencyRate(4552.22d)
                                        .id("<id>")
                                        .note("<value>")
                                        .paidOnDate("2022-10-23T00:00:00Z")
                                        .reference("<value>")
                                        .totalAmount(3015.1d)
                                        .build())
                                .build()))
                    .subTotal(899.64d)
                    .taxAmount(7150.4d)
                    .totalAmount(7926.2d)
                    .contactRef(ContactReference.builder()
                        .id("<value>")
                        .dataType(DirectCostPrototypeDataType.SUPPLIERS)
                        .build())
                    .currencyRate(8165.88d)
                    .note("<value>")
                    .reference("<value>")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "<value>")))))
                        .build())
                    .build())
                .timeoutInMinutes(551929)
                .build();

            CreateDirectCostResponse res = sdk.loanWriteback().directCosts().create()
                .request(req)
                .call();

            if (res.accountingCreateDirectCostResponse().isPresent()) {
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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [io.codat.lending.models.operations.CreateDirectCostRequest](../../models/operations/CreateDirectCostRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Optional<? extends io.codat.lending.models.operations.CreateDirectCostResponse>](../../models/operations/CreateDirectCostResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateModel

The *Get create direct cost model* endpoint returns the expected data for the request payload when creating a [direct cost](https://docs.codat.io/lending-api#/schemas/DirectCost) for a given company and integration.

[Direct costs](https://docs.codat.io/lending-api#/schemas/DirectCost) are purchases of items that are paid off at the point of the purchase.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=directCosts) for integrations that support creating a direct cost.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetCreateDirectCostsModelRequest;
import io.codat.lending.models.operations.GetCreateDirectCostsModelResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetCreateDirectCostsModelRequest req = GetCreateDirectCostsModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateDirectCostsModelResponse res = sdk.loanWriteback().directCosts().getCreateModel()
                .request(req)
                .call();

            if (res.pushOption().isPresent()) {
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
| `request`                                                                                                                          | [io.codat.lending.models.operations.GetCreateDirectCostsModelRequest](../../models/operations/GetCreateDirectCostsModelRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetCreateDirectCostsModelResponse>](../../models/operations/GetCreateDirectCostsModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
