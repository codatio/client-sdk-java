# PurchaseOrders
(*purchaseOrders()*)

## Overview

Access standardized Purchase orders from linked accounting software.

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
import io.codat.accounting.models.components.PurchaseOrder;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.CreatePurchaseOrderRequest;
import io.codat.accounting.models.operations.CreatePurchaseOrderResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreatePurchaseOrderRequest req = CreatePurchaseOrderRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .purchaseOrder(PurchaseOrder.builder()
                    .currency("USD")
                    .deliveryDate("2022-10-23T00:00:00Z")
                    .expectedDeliveryDate("2022-10-23T00:00:00Z")
                    .issueDate("2022-10-23T00:00:00Z")
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .paymentDueDate("2022-10-23T00:00:00Z")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .build())
                .build();

            CreatePurchaseOrderResponse res = sdk.purchaseOrders().create()
                .request(req)
                .call();

            if (res.createPurchaseOrderResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreatePurchaseOrderRequest](../../models/operations/CreatePurchaseOrderRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreatePurchaseOrderResponse](../../models/operations/CreatePurchaseOrderResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## downloadAttachment

The *Download purchase order attachment* endpoint downloads a specific attachment for a given `purchaseOrderId` and `attachmentId`.

[Purchase Orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=purchaseOrders) for integrations that support downloading a purchase order attachment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.DownloadPurchaseOrderAttachmentRequest;
import io.codat.accounting.models.operations.DownloadPurchaseOrderAttachmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
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
        } catch (io.codat.accounting.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [DownloadPurchaseOrderAttachmentRequest](../../models/operations/DownloadPurchaseOrderAttachmentRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[DownloadPurchaseOrderAttachmentResponse](../../models/operations/DownloadPurchaseOrderAttachmentResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## downloadPurchaseOrderPdf

The *Download purchase order as PDF* endpoint downloads the purchase order as a PDF for a given `purchaseOrderId`.

[Purchase Orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=purchaseOrders) for integrations that support getting a purchase order as PDF.

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.DownloadPurchaseOrderPdfRequest;
import io.codat.accounting.models.operations.DownloadPurchaseOrderPdfResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
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
        } catch (io.codat.accounting.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [DownloadPurchaseOrderPdfRequest](../../models/operations/DownloadPurchaseOrderPdfRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[DownloadPurchaseOrderPdfResponse](../../models/operations/DownloadPurchaseOrderPdfResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## get

The *Get purchase order* endpoint returns a single purchase order for a given purchaseOrderId.

[Purchase orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=purchaseOrders) for integrations that support getting a specific purchase order.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.GetPurchaseOrderRequest;
import io.codat.accounting.models.operations.GetPurchaseOrderResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
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
        } catch (io.codat.accounting.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetPurchaseOrderRequest](../../models/operations/GetPurchaseOrderRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetPurchaseOrderResponse](../../models/operations/GetPurchaseOrderResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 401,402,403,404,409,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## getAttachment

The *Get purchase order attachment* endpoint returns a specific attachment for a given `purchaseOrderId` and `attachmentId`.

[Purchase Orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=purchaseOrders) for integrations that support getting a purchase order attachment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.GetPurchaseOrderAttachmentRequest;
import io.codat.accounting.models.operations.GetPurchaseOrderAttachmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
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
        } catch (io.codat.accounting.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetPurchaseOrderAttachmentRequest](../../models/operations/GetPurchaseOrderAttachmentRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetPurchaseOrderAttachmentResponse](../../models/operations/GetPurchaseOrderAttachmentResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


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
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.GetCreateUpdatePurchaseOrdersModelRequest;
import io.codat.accounting.models.operations.GetCreateUpdatePurchaseOrdersModelResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
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
        } catch (io.codat.accounting.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [GetCreateUpdatePurchaseOrdersModelRequest](../../models/operations/GetCreateUpdatePurchaseOrdersModelRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[GetCreateUpdatePurchaseOrdersModelResponse](../../models/operations/GetCreateUpdatePurchaseOrdersModelResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## list

The *List purchase orders* endpoint returns a list of [purchase orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) for a given company's connection.

[Purchase orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.ListPurchaseOrdersRequest;
import io.codat.accounting.models.operations.ListPurchaseOrdersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListPurchaseOrdersRequest req = ListPurchaseOrdersRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            ListPurchaseOrdersResponse res = sdk.purchaseOrders().list()
                .request(req)
                .call();

            if (res.purchaseOrders().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListPurchaseOrdersRequest](../../models/operations/ListPurchaseOrdersRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListPurchaseOrdersResponse](../../models/operations/ListPurchaseOrdersResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/ErrorMessage          | 400,401,402,403,404,409,429,500,503 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |


## listAttachments

The *List purchase order attachments* endpoint returns a list of attachments available to download for a given `purchaseOrderId`.

[Purchase Orders](https://docs.codat.io/accounting-api#/schemas/PurchaseOrder) represent a business's intent to purchase goods or services from a supplier.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=purchaseOrders) for integrations that support listing purchase order attachments.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.ListPurchaseOrderAttachmentsRequest;
import io.codat.accounting.models.operations.ListPurchaseOrderAttachmentsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
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
        } catch (io.codat.accounting.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ListPurchaseOrderAttachmentsRequest](../../models/operations/ListPurchaseOrderAttachmentsRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[ListPurchaseOrderAttachmentsResponse](../../models/operations/ListPurchaseOrderAttachmentsResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


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
import io.codat.accounting.models.components.PurchaseOrder;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.UpdatePurchaseOrderRequest;
import io.codat.accounting.models.operations.UpdatePurchaseOrderResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            UpdatePurchaseOrderRequest req = UpdatePurchaseOrderRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .purchaseOrderId("<value>")
                .purchaseOrder(PurchaseOrder.builder()
                    .currency("GBP")
                    .deliveryDate("2022-10-23T00:00:00Z")
                    .expectedDeliveryDate("2022-10-23T00:00:00Z")
                    .issueDate("2022-10-23T00:00:00Z")
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .paymentDueDate("2022-10-23T00:00:00Z")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .build())
                .build();

            UpdatePurchaseOrderResponse res = sdk.purchaseOrders().update()
                .request(req)
                .call();

            if (res.updatePurchaseOrderResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.accounting.models.errors.ErrorMessage e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdatePurchaseOrderRequest](../../models/operations/UpdatePurchaseOrderRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdatePurchaseOrderResponse](../../models/operations/UpdatePurchaseOrderResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |
