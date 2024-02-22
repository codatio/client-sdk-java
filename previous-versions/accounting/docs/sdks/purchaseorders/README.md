# PurchaseOrders
(*purchaseOrders()*)

## Overview

Purchase orders

### Available Operations

* [create](#create) - Create purchase order
* [downloadAttachment](#downloadattachment) - Download purchase order attachment
* [downloadPurchaseOrderPdf](#downloadpurchaseorderpdf) - Download purchase order as PDF
* [get](#get) - Get purchase order
* [getAttachment](#getattachment) - Get purchase order attachment
* [getCreateUpdateModel](#getcreateupdatemodel) - Get create/update purchase order model
* [list](#list) - List purchase orders
* [listAttachments](#listattachments) - List purchase order attachments
* [update](#update) - Update purchase order

## create

The *Create purchase order* endpoint creates a new [purchase order](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) for a given company's connection.

[Purchase orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update purchase order model](https://docs.codat.io/accounting-api#/operations/get-create-update-purchaseOrders-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=purchaseOrders) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AccountRef;
import io.codat.accounting.models.components.AccountingAddressType;
import io.codat.accounting.models.components.ItemRef;
import io.codat.accounting.models.components.Items;
import io.codat.accounting.models.components.Metadata;
import io.codat.accounting.models.components.PurchaseOrder;
import io.codat.accounting.models.components.PurchaseOrderLineItem;
import io.codat.accounting.models.components.PurchaseOrderStatus;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.components.ShipTo;
import io.codat.accounting.models.components.ShipToContact;
import io.codat.accounting.models.components.SupplierRef;
import io.codat.accounting.models.components.TaxRateRef;
import io.codat.accounting.models.components.TrackingCategoryRef;
import io.codat.accounting.models.components.User;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.CreatePurchaseOrderRequest;
import io.codat.accounting.models.operations.CreatePurchaseOrderResponse;
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

            CreatePurchaseOrderRequest req = CreatePurchaseOrderRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .purchaseOrder(PurchaseOrder.builder()
                    .createdBy(User.builder()
                        .email("Jena.Nienow28@yahoo.com")
                        .firstName("Bria")
                        .lastName("Schaefer")
                        .build())
                    .currency("GBP")
                    .currencyRate(9967.06d)
                    .deliveryDate("2022-10-23T00:00:00Z")
                    .expectedDeliveryDate("2022-10-23T00:00:00Z")
                    .id("<id>")
                    .issueDate("2022-10-23T00:00:00Z")
                    .lineItems(java.util.List.of(
                        PurchaseOrderLineItem.builder()
                            .build()))
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .note("<value>")
                    .paymentDueDate("2022-10-23T00:00:00Z")
                    .purchaseOrderNumber("<value>")
                    .shipTo(ShipTo.builder()
                        .address(Items.builder()
                            .type(AccountingAddressType.BILLING)
                            .city("West Astridcester")
                            .country("Serbia")
                            .line1("<value>")
                            .line2("<value>")
                            .postalCode("85587-4963")
                            .region("<value>")
                            .build())
                        .contact(ShipToContact.builder()
                            .email("Destiny51@gmail.com")
                            .name("<value>")
                            .phone("327.283.8140")
                            .build())
                        .build())
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .status(PurchaseOrderStatus.UNKNOWN)
                    .subTotal(3577.62d)
                    .supplierRef(SupplierRef.builder()
                        .id("<value>")
                        .supplierName("<value>")
                        .build())
                    .totalAmount(6519.85d)
                    .totalDiscount(1325.85d)
                    .totalTaxAmount(3392.36d)
                    .build())
                .timeoutInMinutes(863306)
                .build();

            CreatePurchaseOrderResponse res = sdk.purchaseOrders().create()
                .request(req)
                .call();

            if (res.createPurchaseOrderResponse().isPresent()) {
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
| `request`                                                                                                                 | [io.codat.accounting.models.operations.CreatePurchaseOrderRequest](../../models/operations/CreatePurchaseOrderRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[Optional<? extends io.codat.accounting.models.operations.CreatePurchaseOrderResponse>](../../models/operations/CreatePurchaseOrderResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## downloadAttachment

The *Download purchase order attachment* endpoint downloads a specific attachment for a given `purchaseOrderId` and `attachmentId`.

[Purchase Orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=purchaseOrders) for integrations that support downloading a purchase order attachment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.DownloadPurchaseOrderAttachmentRequest;
import io.codat.accounting.models.operations.DownloadPurchaseOrderAttachmentResponse;
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

            DownloadPurchaseOrderAttachmentRequest req = DownloadPurchaseOrderAttachmentRequest.builder()
                .attachmentId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .purchaseOrderId("<value>")
                .build();

            DownloadPurchaseOrderAttachmentResponse res = sdk.purchaseOrders().downloadAttachment()
                .request(req)
                .call();

            if (res.data().isPresent()) {
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

| Parameter                                                                                                                                         | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                         | [io.codat.accounting.models.operations.DownloadPurchaseOrderAttachmentRequest](../../models/operations/DownloadPurchaseOrderAttachmentRequest.md) | :heavy_check_mark:                                                                                                                                | The request object to use for the request.                                                                                                        |


### Response

**[Optional<? extends io.codat.accounting.models.operations.DownloadPurchaseOrderAttachmentResponse>](../../models/operations/DownloadPurchaseOrderAttachmentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## downloadPurchaseOrderPdf

The *Download purchase order as PDF* endpoint downloads the purchase order as a PDF for a given `purchaseOrderId`.

[Purchase Orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=purchaseOrders) for integrations that support getting a purchase order as PDF.

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.DownloadPurchaseOrderPdfRequest;
import io.codat.accounting.models.operations.DownloadPurchaseOrderPdfResponse;
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

            DownloadPurchaseOrderPdfRequest req = DownloadPurchaseOrderPdfRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .purchaseOrderId("<value>")
                .build();

            DownloadPurchaseOrderPdfResponse res = sdk.purchaseOrders().downloadPurchaseOrderPdf()
                .request(req)
                .call();

            if (res.data().isPresent()) {
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

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [io.codat.accounting.models.operations.DownloadPurchaseOrderPdfRequest](../../models/operations/DownloadPurchaseOrderPdfRequest.md) | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |


### Response

**[Optional<? extends io.codat.accounting.models.operations.DownloadPurchaseOrderPdfResponse>](../../models/operations/DownloadPurchaseOrderPdfResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## get

The *Get purchase order* endpoint returns a single purchase order for a given purchaseOrderId.

[Purchase orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=purchaseOrders) for integrations that support getting a specific purchase order.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetPurchaseOrderRequest;
import io.codat.accounting.models.operations.GetPurchaseOrderResponse;
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

            GetPurchaseOrderRequest req = GetPurchaseOrderRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .purchaseOrderId("<value>")
                .build();

            GetPurchaseOrderResponse res = sdk.purchaseOrders().get()
                .request(req)
                .call();

            if (res.purchaseOrder().isPresent()) {
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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [io.codat.accounting.models.operations.GetPurchaseOrderRequest](../../models/operations/GetPurchaseOrderRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetPurchaseOrderResponse>](../../models/operations/GetPurchaseOrderResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getAttachment

The *Get purchase order attachment* endpoint returns a specific attachment for a given `purchaseOrderId` and `attachmentId`.

[Purchase Orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=purchaseOrders) for integrations that support getting a purchase order attachment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetPurchaseOrderAttachmentRequest;
import io.codat.accounting.models.operations.GetPurchaseOrderAttachmentResponse;
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

            GetPurchaseOrderAttachmentRequest req = GetPurchaseOrderAttachmentRequest.builder()
                .attachmentId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .purchaseOrderId("<value>")
                .build();

            GetPurchaseOrderAttachmentResponse res = sdk.purchaseOrders().getAttachment()
                .request(req)
                .call();

            if (res.attachment().isPresent()) {
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

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [io.codat.accounting.models.operations.GetPurchaseOrderAttachmentRequest](../../models/operations/GetPurchaseOrderAttachmentRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetPurchaseOrderAttachmentResponse>](../../models/operations/GetPurchaseOrderAttachmentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateUpdateModel

The *Get create/update purchase order model* endpoint returns the expected data for the request payload when creating and updating a [purchase order](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) for a given company and integration.

[Purchase orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=purchaseOrders) for integrations that support creating and updating a purchase order.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetCreateUpdatePurchaseOrdersModelRequest;
import io.codat.accounting.models.operations.GetCreateUpdatePurchaseOrdersModelResponse;
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

            GetCreateUpdatePurchaseOrdersModelRequest req = GetCreateUpdatePurchaseOrdersModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateUpdatePurchaseOrdersModelResponse res = sdk.purchaseOrders().getCreateUpdateModel()
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

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                               | [io.codat.accounting.models.operations.GetCreateUpdatePurchaseOrdersModelRequest](../../models/operations/GetCreateUpdatePurchaseOrdersModelRequest.md) | :heavy_check_mark:                                                                                                                                      | The request object to use for the request.                                                                                                              |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetCreateUpdatePurchaseOrdersModelResponse>](../../models/operations/GetCreateUpdatePurchaseOrdersModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List purchase orders* endpoint returns a list of [purchase orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) for a given company's connection.

[Purchase orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.ListPurchaseOrdersRequest;
import io.codat.accounting.models.operations.ListPurchaseOrdersResponse;
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

            ListPurchaseOrdersRequest req = ListPurchaseOrdersRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListPurchaseOrdersResponse res = sdk.purchaseOrders().list()
                .request(req)
                .call();

            if (res.purchaseOrders().isPresent()) {
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

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [io.codat.accounting.models.operations.ListPurchaseOrdersRequest](../../models/operations/ListPurchaseOrdersRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[Optional<? extends io.codat.accounting.models.operations.ListPurchaseOrdersResponse>](../../models/operations/ListPurchaseOrdersResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listAttachments

The *List purchase order attachments* endpoint returns a list of attachments available to download for a given `purchaseOrderId`.

[Purchase Orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=purchaseOrders) for integrations that support listing purchase order attachments.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.ListPurchaseOrderAttachmentsRequest;
import io.codat.accounting.models.operations.ListPurchaseOrderAttachmentsResponse;
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

            ListPurchaseOrderAttachmentsRequest req = ListPurchaseOrderAttachmentsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .purchaseOrderId("<value>")
                .build();

            ListPurchaseOrderAttachmentsResponse res = sdk.purchaseOrders().listAttachments()
                .request(req)
                .call();

            if (res.attachmentsDataset().isPresent()) {
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

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [io.codat.accounting.models.operations.ListPurchaseOrderAttachmentsRequest](../../models/operations/ListPurchaseOrderAttachmentsRequest.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |


### Response

**[Optional<? extends io.codat.accounting.models.operations.ListPurchaseOrderAttachmentsResponse>](../../models/operations/ListPurchaseOrderAttachmentsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## update

The *Update purchase order* endpoint updates an existing [purchase order](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) for a given company's connection.

[Purchase orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update purchase order model](https://docs.codat.io/accounting-api#/operations/get-create-update-purchaseOrders-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=purchaseOrders) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AccountRef;
import io.codat.accounting.models.components.AccountingAddressType;
import io.codat.accounting.models.components.ItemRef;
import io.codat.accounting.models.components.Items;
import io.codat.accounting.models.components.Metadata;
import io.codat.accounting.models.components.PurchaseOrder;
import io.codat.accounting.models.components.PurchaseOrderLineItem;
import io.codat.accounting.models.components.PurchaseOrderStatus;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.components.ShipTo;
import io.codat.accounting.models.components.ShipToContact;
import io.codat.accounting.models.components.SupplierRef;
import io.codat.accounting.models.components.TaxRateRef;
import io.codat.accounting.models.components.TrackingCategoryRef;
import io.codat.accounting.models.components.User;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.UpdatePurchaseOrderRequest;
import io.codat.accounting.models.operations.UpdatePurchaseOrderResponse;
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

            UpdatePurchaseOrderRequest req = UpdatePurchaseOrderRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .purchaseOrderId("<value>")
                .purchaseOrder(PurchaseOrder.builder()
                    .createdBy(User.builder()
                        .email("Alberto34@hotmail.com")
                        .firstName("Mellie")
                        .lastName("Zboncak")
                        .build())
                    .currency("GBP")
                    .currencyRate(6276.9d)
                    .deliveryDate("2022-10-23T00:00:00Z")
                    .expectedDeliveryDate("2022-10-23T00:00:00Z")
                    .id("<id>")
                    .issueDate("2022-10-23T00:00:00Z")
                    .lineItems(java.util.List.of(
                        PurchaseOrderLineItem.builder()
                            .build()))
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .note("<value>")
                    .paymentDueDate("2022-10-23T00:00:00Z")
                    .purchaseOrderNumber("<value>")
                    .shipTo(ShipTo.builder()
                        .address(Items.builder()
                            .type(AccountingAddressType.UNKNOWN)
                            .city("Fort Jesus")
                            .country("Jordan")
                            .line1("<value>")
                            .line2("<value>")
                            .postalCode("37231")
                            .region("<value>")
                            .build())
                        .contact(ShipToContact.builder()
                            .email("Patience.Ziemann30@yahoo.com")
                            .name("<value>")
                            .phone("547-769-4503")
                            .build())
                        .build())
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .status(PurchaseOrderStatus.DRAFT)
                    .subTotal(8108.77d)
                    .supplierRef(SupplierRef.builder()
                        .id("<value>")
                        .supplierName("<value>")
                        .build())
                    .totalAmount(6376.96d)
                    .totalDiscount(4391.52d)
                    .totalTaxAmount(820.48d)
                    .build())
                .forceUpdate(false)
                .timeoutInMinutes(501135)
                .build();

            UpdatePurchaseOrderResponse res = sdk.purchaseOrders().update()
                .request(req)
                .call();

            if (res.updatePurchaseOrderResponse().isPresent()) {
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
| `request`                                                                                                                 | [io.codat.accounting.models.operations.UpdatePurchaseOrderRequest](../../models/operations/UpdatePurchaseOrderRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[Optional<? extends io.codat.accounting.models.operations.UpdatePurchaseOrderResponse>](../../models/operations/UpdatePurchaseOrderResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
