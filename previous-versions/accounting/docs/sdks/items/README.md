# Items
(*items()*)

## Overview

Items

### Available Operations

* [create](#create) - Create item
* [get](#get) - Get item
* [getCreateModel](#getcreatemodel) - Get create item model
* [list](#list) - List items

## create

The *Create item* endpoint creates a new [item](https://docs.codat.io/accounting-api#/schemas/Item) for a given company's connection.

[Items](https://docs.codat.io/accounting-api#/schemas/Item) allow your customers to save and track details of the products and services that they buy and sell.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create item model](https://docs.codat.io/accounting-api#/operations/get-create-items-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=items) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AccountRef;
import io.codat.accounting.models.components.BillItem;
import io.codat.accounting.models.components.InvoiceItem;
import io.codat.accounting.models.components.Item;
import io.codat.accounting.models.components.ItemStatus;
import io.codat.accounting.models.components.ItemType;
import io.codat.accounting.models.components.Metadata;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.components.SupplementalData;
import io.codat.accounting.models.components.TaxRateRef;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.CreateItemRequest;
import io.codat.accounting.models.operations.CreateItemResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateItemRequest req = CreateItemRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .item(Item.builder()
                    .isBillItem(false)
                    .isInvoiceItem(false)
                    .itemStatus(ItemStatus.ACTIVE)
                    .type(ItemType.INVENTORY)
                    .billItem(BillItem.builder()
                        .accountRef(AccountRef.builder()
                            .id("<id>")
                            .name("<value>")
                            .build())
                        .description("Proactive systematic Graphical User Interface")
                        .taxRateRef(TaxRateRef.builder()
                            .effectiveTaxRate(2884.08d)
                            .id("<id>")
                            .name("<value>")
                            .build())
                        .unitPrice(1343.65d)
                        .build())
                    .code("<value>")
                    .id("<id>")
                    .invoiceItem(InvoiceItem.builder()
                        .accountRef(AccountRef.builder()
                            .id("<id>")
                            .name("<value>")
                            .build())
                        .description("Seamless actuating workforce")
                        .taxRateRef(TaxRateRef.builder()
                            .effectiveTaxRate(7964.74d)
                            .id("<id>")
                            .name("<value>")
                            .build())
                        .unitPrice(3768.44d)
                        .build())
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .name("<value>")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "<value>")))))
                        .build())
                    .build())
                .timeoutInMinutes(86)
                .build();

            CreateItemResponse res = sdk.items().create()
                .request(req)
                .call();

            if (res.createItemResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [io.codat.accounting.models.operations.CreateItemRequest](../../models/operations/CreateItemRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[Optional<? extends io.codat.accounting.models.operations.CreateItemResponse>](../../models/operations/CreateItemResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## get

The *Get item* endpoint returns a single item for a given itemId.

[Items](https://docs.codat.io/accounting-api#/schemas/Item) allow your customers to save and track details of the products and services that they buy and sell.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=items) for integrations that support getting a specific item.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetItemRequest;
import io.codat.accounting.models.operations.GetItemResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetItemRequest req = GetItemRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .itemId("<value>")
                .build();

            GetItemResponse res = sdk.items().get()
                .request(req)
                .call();

            if (res.item().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [io.codat.accounting.models.operations.GetItemRequest](../../models/operations/GetItemRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetItemResponse>](../../models/operations/GetItemResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateModel

The *Get create item model* endpoint returns the expected data for the request payload when creating an [item](https://docs.codat.io/accounting-api#/schemas/Item) for a given company and integration.

[Items](https://docs.codat.io/accounting-api#/schemas/Item) allow your customers to save and track details of the products and services that they buy and sell.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=items) for integrations that support creating an item.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetCreateItemsModelRequest;
import io.codat.accounting.models.operations.GetCreateItemsModelResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetCreateItemsModelRequest req = GetCreateItemsModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateItemsModelResponse res = sdk.items().getCreateModel()
                .request(req)
                .call();

            if (res.pushOption().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [io.codat.accounting.models.operations.GetCreateItemsModelRequest](../../models/operations/GetCreateItemsModelRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetCreateItemsModelResponse>](../../models/operations/GetCreateItemsModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List items* endpoint returns a list of [items](https://docs.codat.io/accounting-api#/schemas/Item) for a given company's connection.

[Items](https://docs.codat.io/accounting-api#/schemas/Item) allow your customers to save and track details of the products and services that they buy and sell.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.ListItemsRequest;
import io.codat.accounting.models.operations.ListItemsResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListItemsRequest req = ListItemsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListItemsResponse res = sdk.items().list()
                .request(req)
                .call();

            if (res.items().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [io.codat.accounting.models.operations.ListItemsRequest](../../models/operations/ListItemsRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |


### Response

**[Optional<? extends io.codat.accounting.models.operations.ListItemsResponse>](../../models/operations/ListItemsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
