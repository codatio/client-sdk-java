# CodatLendingSuppliers
(*loanWriteback().suppliers()*)

## Overview

### Available Operations

* [create](#create) - Create supplier
* [getCreateUpdateModel](#getcreateupdatemodel) - Get create/update supplier model

## create

The *Create supplier* endpoint creates a new [supplier](https://docs.codat.io/lending-api#/schemas/Supplier) for a given company's connection.

[Suppliers](https://docs.codat.io/lending-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update supplier model](https://docs.codat.io/lending-api#/operations/get-create-update-suppliers-model).


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.CreateSupplierRequest;
import io.codat.lending.models.operations.CreateSupplierResponse;
import io.codat.lending.models.shared.AccountingAddress;
import io.codat.lending.models.shared.AccountingAddressType;
import io.codat.lending.models.shared.AccountingSupplier;
import io.codat.lending.models.shared.Metadata;
import io.codat.lending.models.shared.Security;
import io.codat.lending.models.shared.SupplementalData;
import io.codat.lending.models.shared.SupplierStatus;
import java.lang.Exception;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        CreateSupplierRequest req = CreateSupplierRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .accountingSupplier(AccountingSupplier.builder()
                    .status(SupplierStatus.ACTIVE)
                    .addresses(List.of(
                        AccountingAddress.builder()
                            .type(AccountingAddressType.BILLING)
                            .city("Bakersfield")
                            .country("USA")
                            .line1("Unit 51")
                            .line2("Bakersfield Industrial Estate")
                            .region("California")
                            .build()))
                    .contactName("Kelly's Industrial Supplies")
                    .defaultCurrency("string")
                    .emailAddress("sales@kellysupplies.com")
                    .id("C520FFD4-F6F6-4FC2-A6D2-5D7088B2B14F")
                    .metadata(Metadata.builder()
                        .isDeleted(true)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .phone("07999 999999")
                    .registrationNumber("string")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(Map.ofEntries(
                            Map.entry("property1", Map.ofEntries(
                                Map.entry("property1", Optional.empty()),
                                Map.entry("property2", Optional.empty()))),
                            Map.entry("property2", Map.ofEntries(
                                Map.entry("property1", Optional.empty()),
                                Map.entry("property2", Optional.empty())))))
                        .build())
                    .supplierName("Kelly's Industrial Supplies")
                    .taxNumber("string")
                    .build())
                .build();

        CreateSupplierResponse res = sdk.loanWriteback().suppliers().create()
                .request(req)
                .call();

        if (res.accountingCreateSupplierResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateSupplierRequest](../../models/operations/CreateSupplierRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateSupplierResponse](../../models/operations/CreateSupplierResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## getCreateUpdateModel

The *Get create/update supplier model* endpoint returns the expected data for the request payload when creating and updating a [supplier](https://docs.codat.io/lending-api#/schemas/Supplier) for a given company and integration.

[Suppliers](https://docs.codat.io/lending-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetCreateUpdateSuppliersModelRequest;
import io.codat.lending.models.operations.GetCreateUpdateSuppliersModelResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetCreateUpdateSuppliersModelRequest req = GetCreateUpdateSuppliersModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

        GetCreateUpdateSuppliersModelResponse res = sdk.loanWriteback().suppliers().getCreateUpdateModel()
                .request(req)
                .call();

        if (res.pushOption().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [GetCreateUpdateSuppliersModelRequest](../../models/operations/GetCreateUpdateSuppliersModelRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[GetCreateUpdateSuppliersModelResponse](../../models/operations/GetCreateUpdateSuppliersModelResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorMessage        | 401, 402, 403, 404, 429, 500, 503 | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |