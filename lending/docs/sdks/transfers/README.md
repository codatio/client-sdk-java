# Transfers
(*loanWriteback().transfers()*)

## Overview

### Available Operations

* [create](#create) - Create transfer
* [getCreateModel](#getcreatemodel) - Get create transfer model

## create

The *Create transfer* endpoint creates a new [transfer](https://docs.codat.io/lending-api#/schemas/Transfer) for a given company's connection.

[Transfers](https://docs.codat.io/lending-api#/schemas/Transfer) record the movement of money between two bank accounts, or between a bank account and a nominal account.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create transfer model](https://docs.codat.io/lending-api#/operations/get-create-transfers-model).

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.CreateTransferRequest;
import io.codat.lending.models.operations.CreateTransferResponse;
import io.codat.lending.models.shared.AccountingRecordRef;
import io.codat.lending.models.shared.AccountingTransfer;
import io.codat.lending.models.shared.AccountingTransferStatus;
import io.codat.lending.models.shared.ContactRef;
import io.codat.lending.models.shared.ContactRefDataType;
import io.codat.lending.models.shared.Metadata;
import io.codat.lending.models.shared.Security;
import io.codat.lending.models.shared.TrackingCategoryRef;
import io.codat.lending.models.shared.TransferAccount;
import java.lang.Exception;
import java.math.BigDecimal;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

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
                        .id("80000028-167239230944")
                        .dataType(ContactRefDataType.CUSTOMERS)
                        .build())
                    .date("2023-01-26T11:51:18.104Z")
                    .depositedRecordRefs(List.of(
                        AccountingRecordRef.builder()
                            .dataType("invoice")
                            .build()))
                    .description("test transfers push 20230126 12.08")
                    .from(TransferAccount.builder()
                        .accountRef(AccountingRecordRef.builder()
                            .dataType("bankAccounts")
                            .id("80000028-1671794219")
                            .build())
                        .amount(new BigDecimal("12"))
                        .currency("USD")
                        .build())
                    .metadata(Metadata.builder()
                        .isDeleted(true)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .status(AccountingTransferStatus.UNKNOWN)
                    .to(TransferAccount.builder()
                        .accountRef(AccountingRecordRef.builder()
                            .dataType("bankAccounts")
                            .id("80000004-1671793811")
                            .build())
                        .amount(new BigDecimal("12"))
                        .currency("EUR")
                        .build())
                    .trackingCategoryRefs(List.of(
                        TrackingCategoryRef.builder()
                            .id("80000001-1674553252")
                            .name("Class 1")
                            .build()))
                    .build())
                .build();

        CreateTransferResponse res = sdk.loanWriteback().transfers().create()
                .request(req)
                .call();

        if (res.accountingCreateTransferResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateTransferRequest](../../models/operations/CreateTransferRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateTransferResponse](../../models/operations/CreateTransferResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## getCreateModel

The *Get create transfer model* endpoint returns the expected data for the request payload when creating a [transfer](https://docs.codat.io/lending-api#/schemas/Transfer) for a given company and integration.

[Transfers](https://docs.codat.io/lending-api#/schemas/Transfer) record the movement of money between two bank accounts, or between a bank account and a nominal account.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCreateTransfersModelRequest;
import io.codat.lending.models.operations.GetCreateTransfersModelResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetCreateTransfersModelRequest req = GetCreateTransfersModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

        GetCreateTransfersModelResponse res = sdk.loanWriteback().transfers().getCreateModel()
                .request(req)
                .call();

        if (res.pushOption().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetCreateTransfersModelRequest](../../models/operations/GetCreateTransfersModelRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetCreateTransfersModelResponse](../../models/operations/GetCreateTransfersModelResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |