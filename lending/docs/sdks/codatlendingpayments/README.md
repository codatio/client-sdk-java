# CodatLendingPayments
(*loanWriteback().payments()*)

### Available Operations

* [create](#create) - Create payment
* [getCreateModel](#getcreatemodel) - Get create payment model

## create

The *Create payment* endpoint creates a new [payment](https://docs.codat.io/lending-api#/schemas/Payment) for a given company's connection.

[Payments](https://docs.codat.io/lending-api#/schemas/Payment) represent an allocation of money within any customer accounts receivable account.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create payment model](https://docs.codat.io/lending-api#/operations/get-create-payments-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=payments) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.CreatePaymentRequest;
import io.codat.lending.models.operations.CreatePaymentResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.AccountRef;
import io.codat.lending.models.shared.AccountingCustomerRef;
import io.codat.lending.models.shared.AccountingPayment;
import io.codat.lending.models.shared.Metadata;
import io.codat.lending.models.shared.PaymentLine;
import io.codat.lending.models.shared.PaymentLineLink;
import io.codat.lending.models.shared.PaymentLinkType;
import io.codat.lending.models.shared.PaymentMethodRef;
import io.codat.lending.models.shared.Security;
import io.codat.lending.models.shared.SupplementalData;
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

            CreatePaymentRequest req = CreatePaymentRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .accountingPayment(AccountingPayment.builder()
                    .date("2022-10-23T00:00:00Z")
                    .accountRef(AccountRef.builder()
                        .id("<id>")
                        .name("<value>")
                        .build())
                    .currency("USD")
                    .currencyRate(6384.24d)
                    .customerRef(AccountingCustomerRef.builder()
                        .id("<value>")
                        .companyName("Johnson, Green and Collier")
                        .build())
                    .id("<id>")
                    .lines(java.util.List.of(
                        PaymentLine.builder()
                            .amount(9967.06d)
                            .allocatedOnDate("2022-10-23T00:00:00Z")
                            .build()))
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .note("<value>")
                    .paymentMethodRef(PaymentMethodRef.builder()
                        .id("<value>")
                        .name("<value>")
                        .build())
                    .reference("<value>")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "<value>")))))
                        .build())
                    .totalAmount(9510.62d)
                    .build())
                .allowSyncOnPushComplete(false)
                .timeoutInMinutes(891510)
                .build();

            CreatePaymentResponse res = sdk.loanWriteback().payments().create()
                .request(req)
                .call();

            if (res.accountingCreatePaymentResponse().isPresent()) {
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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [io.codat.lending.models.operations.CreatePaymentRequest](../../models/operations/CreatePaymentRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Optional<? extends io.codat.lending.models.operations.CreatePaymentResponse>](../../models/operations/CreatePaymentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateModel

The *Get create payment model* endpoint returns the expected data for the request payload when creating a [payment](https://docs.codat.io/lending-api#/schemas/Payment) for a given company and integration.

[Payments](https://docs.codat.io/lending-api#/schemas/Payment) represent an allocation of money within any customer accounts receivable account.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=payments) for integrations that support creating a payment.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetCreatePaymentModelRequest;
import io.codat.lending.models.operations.GetCreatePaymentModelResponse;
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

            GetCreatePaymentModelRequest req = GetCreatePaymentModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreatePaymentModelResponse res = sdk.loanWriteback().payments().getCreateModel()
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [io.codat.lending.models.operations.GetCreatePaymentModelRequest](../../models/operations/GetCreatePaymentModelRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetCreatePaymentModelResponse>](../../models/operations/GetCreatePaymentModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
