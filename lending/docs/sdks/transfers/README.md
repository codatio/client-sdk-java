# Transfers
(*loanWriteback().transfers()*)

### Available Operations

* [createTransfer](#createtransfer) - Create transfer
* [getCreateTransfersModel](#getcreatetransfersmodel) - Get create transfer model

## createTransfer

The *Create transfer* endpoint creates a new [transfer](https://docs.codat.io/lending-api#/schemas/Transfer) for a given company's connection.

[Transfers](https://docs.codat.io/lending-api#/schemas/Transfer) record the movement of money between two bank accounts, or between a bank account and a nominal account.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create transfer model](https://docs.codat.io/lending-api#/operations/get-create-transfers-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=transfers) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.CreateTransferRequest;
import io.codat.lending.models.operations.CreateTransferResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.AccountRef;
import io.codat.lending.models.shared.AccountingTransfer;
import io.codat.lending.models.shared.ContactRef;
import io.codat.lending.models.shared.ContactRefDataType;
import io.codat.lending.models.shared.Metadata;
import io.codat.lending.models.shared.RecordRef;
import io.codat.lending.models.shared.Security;
import io.codat.lending.models.shared.SupplementalData;
import io.codat.lending.models.shared.TrackingCategoryRef;
import io.codat.lending.models.shared.TransferAccount;
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

            CreateTransferRequest req = CreateTransferRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .accountingTransfer(AccountingTransfer.builder()
                    .contactRef(ContactRef.builder()
                        .id("string")
                        .dataType(ContactRefDataType.CUSTOMERS)
                        .build())
                    .date("2022-10-23T00:00:00Z")
                    .depositedRecordRefs(java.util.List.of(
                        RecordRef.builder()
                            .dataType("accountTransaction")
                            .build()))
                    .description("Synchronised full-range emulation")
                    .from(TransferAccount.builder()
                        .accountRef(AccountRef.builder()
                            .id("<ID>")
                            .name("string")
                            .build())
                        .amount(1343.65d)
                        .currency("EUR")
                        .build())
                    .id("<ID>")
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "string")))))
                        .build())
                    .to(TransferAccount.builder()
                        .accountRef(AccountRef.builder()
                            .id("<ID>")
                            .name("string")
                            .build())
                        .amount(7964.74d)
                        .currency("USD")
                        .build())
                    .trackingCategoryRefs(java.util.List.of(
                        TrackingCategoryRef.builder()
                            .id("string")
                            .build()))
                    .build())
                .allowSyncOnPushComplete(false)
                .timeoutInMinutes(951062)
                .build();

            CreateTransferResponse res = sdk.loanWriteback().transfers().createTransfer()
                .request(req)
                .call();

            if (res.accountingCreateTransferResponse().isPresent()) {
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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [io.codat.lending.models.operations.CreateTransferRequest](../../models/operations/CreateTransferRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[Optional<? extends io.codat.lending.models.operations.CreateTransferResponse>](../../models/operations/CreateTransferResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateTransfersModel

The *Get create transfer model* endpoint returns the expected data for the request payload when creating a [transfer](https://docs.codat.io/lending-api#/schemas/Transfer) for a given company and integration.

[Transfers](https://docs.codat.io/lending-api#/schemas/Transfer) record the movement of money between two bank accounts, or between a bank account and a nominal account.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=transfers) for integrations that support creating a transfer.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetCreateTransfersModelRequest;
import io.codat.lending.models.operations.GetCreateTransfersModelResponse;
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

            GetCreateTransfersModelRequest req = GetCreateTransfersModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateTransfersModelResponse res = sdk.loanWriteback().transfers().getCreateTransfersModel()
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [io.codat.lending.models.operations.GetCreateTransfersModelRequest](../../models/operations/GetCreateTransfersModelRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetCreateTransfersModelResponse>](../../models/operations/GetCreateTransfersModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
