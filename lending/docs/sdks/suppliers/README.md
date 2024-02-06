# Suppliers
(*accountsPayable().suppliers()*)

### Available Operations

* [downloadAttachment](#downloadattachment) - Download supplier attachment
* [get](#get) - Get supplier
* [getAttachment](#getattachment) - Get supplier attachment
* [list](#list) - List suppliers
* [listAttachments](#listattachments) - List supplier attachments

## downloadAttachment

The *Download supplier attachment* endpoint downloads a specific attachment for a given `supplierId` and `attachmentId`.

[Suppliers](https://docs.codat.io/lending-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=suppliers) for integrations that support downloading a supplier attachment.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.DownloadAccountingSupplierAttachmentRequest;
import io.codat.lending.models.operations.DownloadAccountingSupplierAttachmentResponse;
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

            DownloadAccountingSupplierAttachmentRequest req = DownloadAccountingSupplierAttachmentRequest.builder()
                .attachmentId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .supplierId("string")
                .build();

            DownloadAccountingSupplierAttachmentResponse res = sdk.accountsPayable().suppliers().downloadAttachment()
                .request(req)
                .call();

            if (res.data().isPresent()) {
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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [io.codat.lending.models.operations.DownloadAccountingSupplierAttachmentRequest](../../models/operations/DownloadAccountingSupplierAttachmentRequest.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


### Response

**[Optional<? extends io.codat.lending.models.operations.DownloadAccountingSupplierAttachmentResponse>](../../models/operations/DownloadAccountingSupplierAttachmentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## get

The *Get supplier* endpoint returns a single supplier for a given supplierId.

[Suppliers](https://docs.codat.io/lending-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=suppliers) for integrations that support getting a specific supplier.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetAccountingSupplierRequest;
import io.codat.lending.models.operations.GetAccountingSupplierResponse;
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

            GetAccountingSupplierRequest req = GetAccountingSupplierRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .supplierId("string")
                .build();

            GetAccountingSupplierResponse res = sdk.accountsPayable().suppliers().get()
                .request(req)
                .call();

            if (res.accountingSupplier().isPresent()) {
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
| `request`                                                                                                                  | [io.codat.lending.models.operations.GetAccountingSupplierRequest](../../models/operations/GetAccountingSupplierRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetAccountingSupplierResponse>](../../models/operations/GetAccountingSupplierResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getAttachment

The *Get supplier attachment* endpoint returns a specific attachment for a given `supplierId` and `attachmentId`.

[Suppliers](https://docs.codat.io/lending-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=suppliers) for integrations that support getting a supplier attachment.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetAccountingSupplierAttachmentRequest;
import io.codat.lending.models.operations.GetAccountingSupplierAttachmentResponse;
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

            GetAccountingSupplierAttachmentRequest req = GetAccountingSupplierAttachmentRequest.builder()
                .attachmentId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .supplierId("string")
                .build();

            GetAccountingSupplierAttachmentResponse res = sdk.accountsPayable().suppliers().getAttachment()
                .request(req)
                .call();

            if (res.accountingAttachment().isPresent()) {
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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [io.codat.lending.models.operations.GetAccountingSupplierAttachmentRequest](../../models/operations/GetAccountingSupplierAttachmentRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetAccountingSupplierAttachmentResponse>](../../models/operations/GetAccountingSupplierAttachmentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List suppliers* endpoint returns a list of [suppliers](https://docs.codat.io/lending-api#/schemas/Supplier) for a given company's connection.

[Suppliers](https://docs.codat.io/lending-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/lending-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.ListAccountingSuppliersRequest;
import io.codat.lending.models.operations.ListAccountingSuppliersResponse;
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

            ListAccountingSuppliersRequest req = ListAccountingSuppliersRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("string")
                .build();

            ListAccountingSuppliersResponse res = sdk.accountsPayable().suppliers().list()
                .request(req)
                .call();

            if (res.accountingSuppliers().isPresent()) {
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
| `request`                                                                                                                      | [io.codat.lending.models.operations.ListAccountingSuppliersRequest](../../models/operations/ListAccountingSuppliersRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends io.codat.lending.models.operations.ListAccountingSuppliersResponse>](../../models/operations/ListAccountingSuppliersResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listAttachments

The *List supplier attachments* endpoint returns a list of attachments available to download for given `supplierId`.

[Suppliers](https://docs.codat.io/lending-api#/schemas/Supplier) are people or organizations that provide something, such as a product or service.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=suppliers) for integrations that support listing supplier attachments.


### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.ListAccountingSupplierAttachmentsRequest;
import io.codat.lending.models.operations.ListAccountingSupplierAttachmentsResponse;
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

            ListAccountingSupplierAttachmentsRequest req = ListAccountingSupplierAttachmentsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .supplierId("string")
                .build();

            ListAccountingSupplierAttachmentsResponse res = sdk.accountsPayable().suppliers().listAttachments()
                .request(req)
                .call();

            if (res.attachments().isPresent()) {
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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [io.codat.lending.models.operations.ListAccountingSupplierAttachmentsRequest](../../models/operations/ListAccountingSupplierAttachmentsRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[Optional<? extends io.codat.lending.models.operations.ListAccountingSupplierAttachmentsResponse>](../../models/operations/ListAccountingSupplierAttachmentsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
