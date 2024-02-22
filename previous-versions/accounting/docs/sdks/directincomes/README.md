# DirectIncomes
(*directIncomes()*)

## Overview

Direct incomes

### Available Operations

* [create](#create) - Create direct income
* [downloadAttachment](#downloadattachment) - Download direct income attachment
* [get](#get) - Get direct income
* [getAttachment](#getattachment) - Get direct income attachment
* [getCreateModel](#getcreatemodel) - Get create direct income model
* [list](#list) - List direct incomes
* [listAttachments](#listattachments) - List direct income attachments
* [uploadAttachment](#uploadattachment) - Create direct income attachment

## create

The *Create direct income* endpoint creates a new [direct income](https://docs.codat.io/accounting-api#/schemas/DirectIncome) for a given company's connection.

[Direct incomes](https://docs.codat.io/accounting-api#/schemas/DirectIncome) are sales of items directly to a customer where payment is received at the point of the sale. For example, cash sales of items to a customer, referral commissions, and service fee refunds are considered direct incomes.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create direct income model](https://docs.codat.io/accounting-api#/operations/get-create-directIncomes-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=directIncomes) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AccountRef;
import io.codat.accounting.models.components.Allocation;
import io.codat.accounting.models.components.ContactRef;
import io.codat.accounting.models.components.ContactRefDataType;
import io.codat.accounting.models.components.DirectIncome;
import io.codat.accounting.models.components.DirectIncomeLineItem;
import io.codat.accounting.models.components.ItemRef;
import io.codat.accounting.models.components.Metadata;
import io.codat.accounting.models.components.PaymentAllocationItems;
import io.codat.accounting.models.components.PaymentAllocationPayment;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.components.SupplementalData;
import io.codat.accounting.models.components.TaxRateRef;
import io.codat.accounting.models.components.TrackingCategoryRef;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.CreateDirectIncomeRequest;
import io.codat.accounting.models.operations.CreateDirectIncomeResponse;
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

            CreateDirectIncomeRequest req = CreateDirectIncomeRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .directIncome(DirectIncome.builder()
                    .currency("USD")
                    .issueDate("2022-10-23T00:00:00Z")
                    .lineItems(java.util.List.of(
                            DirectIncomeLineItem.builder()
                                .quantity(4174.58d)
                                .unitAmount(2884.08d)
                                .build()))
                    .paymentAllocations(java.util.List.of(
                            PaymentAllocationItems.builder()
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
                    .contactRef(ContactRef.builder()
                        .id("<value>")
                        .dataType(ContactRefDataType.SUPPLIERS)
                        .build())
                    .currencyRate(8165.88d)
                    .id("<id>")
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .note("<value>")
                    .reference("<value>")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "<value>")))))
                        .build())
                    .build())
                .timeoutInMinutes(827563)
                .build();

            CreateDirectIncomeResponse res = sdk.directIncomes().create()
                .request(req)
                .call();

            if (res.createDirectIncomeResponse().isPresent()) {
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
| `request`                                                                                                               | [io.codat.accounting.models.operations.CreateDirectIncomeRequest](../../models/operations/CreateDirectIncomeRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[Optional<? extends io.codat.accounting.models.operations.CreateDirectIncomeResponse>](../../models/operations/CreateDirectIncomeResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## downloadAttachment

The *Download direct income attachment* endpoint downloads a specific attachment for a given `directIncomeId` and `attachmentId`.

[Direct incomes](https://docs.codat.io/accounting-api#/schemas/DirectIncome) are sales of items directly to a customer where payment is received at the point of the sale.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=directIncomes) for integrations that support downloading a direct income attachment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.DownloadDirectIncomeAttachmentRequest;
import io.codat.accounting.models.operations.DownloadDirectIncomeAttachmentResponse;
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

            DownloadDirectIncomeAttachmentRequest req = DownloadDirectIncomeAttachmentRequest.builder()
                .attachmentId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .directIncomeId("<value>")
                .build();

            DownloadDirectIncomeAttachmentResponse res = sdk.directIncomes().downloadAttachment()
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

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                       | [io.codat.accounting.models.operations.DownloadDirectIncomeAttachmentRequest](../../models/operations/DownloadDirectIncomeAttachmentRequest.md) | :heavy_check_mark:                                                                                                                              | The request object to use for the request.                                                                                                      |


### Response

**[Optional<? extends io.codat.accounting.models.operations.DownloadDirectIncomeAttachmentResponse>](../../models/operations/DownloadDirectIncomeAttachmentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## get

The *Get direct income* endpoint returns a single direct income for a given directIncomeId.

[Direct incomes](https://docs.codat.io/accounting-api#/schemas/DirectIncome) are sales of items directly to a customer where payment is received at the point of the sale.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=directIncomes) for integrations that support getting a specific direct income.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetDirectIncomeRequest;
import io.codat.accounting.models.operations.GetDirectIncomeResponse;
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

            GetDirectIncomeRequest req = GetDirectIncomeRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .directIncomeId("<value>")
                .build();

            GetDirectIncomeResponse res = sdk.directIncomes().get()
                .request(req)
                .call();

            if (res.directIncome().isPresent()) {
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

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [io.codat.accounting.models.operations.GetDirectIncomeRequest](../../models/operations/GetDirectIncomeRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetDirectIncomeResponse>](../../models/operations/GetDirectIncomeResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getAttachment

The *Get direct income attachment* endpoint returns a specific attachment for a given `directIncomeId` and `attachmentId`.

[Direct incomes](https://docs.codat.io/accounting-api#/schemas/DirectIncome) are sales of items directly to a customer where payment is received at the point of the sale.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=directIncomes) for integrations that support getting a direct income attachment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetDirectIncomeAttachmentRequest;
import io.codat.accounting.models.operations.GetDirectIncomeAttachmentResponse;
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

            GetDirectIncomeAttachmentRequest req = GetDirectIncomeAttachmentRequest.builder()
                .attachmentId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .directIncomeId("<value>")
                .timeoutInMinutes(903055)
                .build();

            GetDirectIncomeAttachmentResponse res = sdk.directIncomes().getAttachment()
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

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [io.codat.accounting.models.operations.GetDirectIncomeAttachmentRequest](../../models/operations/GetDirectIncomeAttachmentRequest.md) | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetDirectIncomeAttachmentResponse>](../../models/operations/GetDirectIncomeAttachmentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateModel

The *Get create direct income model* endpoint returns the expected data for the request payload when creating a [direct income](https://docs.codat.io/accounting-api#/schemas/DirectIncome) for a given company and integration.

[Direct incomes](https://docs.codat.io/accounting-api#/schemas/DirectIncome) are sales of items directly to a customer where payment is received at the point of the sale.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=directIncomes) for integrations that support creating a direct income.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetCreateDirectIncomesModelRequest;
import io.codat.accounting.models.operations.GetCreateDirectIncomesModelResponse;
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

            GetCreateDirectIncomesModelRequest req = GetCreateDirectIncomesModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateDirectIncomesModelResponse res = sdk.directIncomes().getCreateModel()
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

| Parameter                                                                                                                                 | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                 | [io.codat.accounting.models.operations.GetCreateDirectIncomesModelRequest](../../models/operations/GetCreateDirectIncomesModelRequest.md) | :heavy_check_mark:                                                                                                                        | The request object to use for the request.                                                                                                |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetCreateDirectIncomesModelResponse>](../../models/operations/GetCreateDirectIncomesModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List direct incomes* endpoint returns a list of [direct incomes](https://docs.codat.io/accounting-api#/schemas/DirectIncome) for a given company's connection.

[Direct incomes](https://docs.codat.io/accounting-api#/schemas/DirectIncome) are sales of items directly to a customer where payment is received at the point of the sale.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.ListDirectIncomesRequest;
import io.codat.accounting.models.operations.ListDirectIncomesResponse;
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

            ListDirectIncomesRequest req = ListDirectIncomesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListDirectIncomesResponse res = sdk.directIncomes().list()
                .request(req)
                .call();

            if (res.directIncomes().isPresent()) {
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

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [io.codat.accounting.models.operations.ListDirectIncomesRequest](../../models/operations/ListDirectIncomesRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[Optional<? extends io.codat.accounting.models.operations.ListDirectIncomesResponse>](../../models/operations/ListDirectIncomesResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listAttachments

The *List direct income attachments* endpoint returns a list of attachments available to download for given `directIncomeId`.

[Direct incomes](https://docs.codat.io/accounting-api#/schemas/DirectIncome) are sales of items directly to a customer where payment is received at the point of the sale.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=directIncomes) for integrations that support listing direct income attachments.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.ListDirectIncomeAttachmentsRequest;
import io.codat.accounting.models.operations.ListDirectIncomeAttachmentsResponse;
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

            ListDirectIncomeAttachmentsRequest req = ListDirectIncomeAttachmentsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .directIncomeId("<value>")
                .build();

            ListDirectIncomeAttachmentsResponse res = sdk.directIncomes().listAttachments()
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

| Parameter                                                                                                                                 | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                 | [io.codat.accounting.models.operations.ListDirectIncomeAttachmentsRequest](../../models/operations/ListDirectIncomeAttachmentsRequest.md) | :heavy_check_mark:                                                                                                                        | The request object to use for the request.                                                                                                |


### Response

**[Optional<? extends io.codat.accounting.models.operations.ListDirectIncomeAttachmentsResponse>](../../models/operations/ListDirectIncomeAttachmentsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## uploadAttachment

The *Upload direct income attachment* endpoint uploads an attachment and assigns it against a specific `directIncomeId`.

[Direct incomes](https://docs.codat.io/accounting-api#/schemas/DirectIncome) are sales of items directly to a customer where payment is received at the point of the sale.

**Integration-specific behaviour**

For more details on supported file types by integration see [Attachments](https://docs.codat.io/accounting-api#/schemas/Attachment).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=directIncomes) for integrations that support uploading a direct income attachment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AttachmentUpload;
import io.codat.accounting.models.components.CodatFile;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.UploadDirectIncomeAttachmentRequest;
import io.codat.accounting.models.operations.UploadDirectIncomeAttachmentResponse;
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

            UploadDirectIncomeAttachmentRequest req = UploadDirectIncomeAttachmentRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .directIncomeId("<value>")
                .attachmentUpload(AttachmentUpload.builder()
                    .file(CodatFile.builder()
                            .content("0xE3ABc1980E".getBytes())
                            .fileName("<value>")
                            .build())
                    .build())
                .build();

            UploadDirectIncomeAttachmentResponse res = sdk.directIncomes().uploadAttachment()
                .request(req)
                .call();

            // handle response
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
| `request`                                                                                                                                   | [io.codat.accounting.models.operations.UploadDirectIncomeAttachmentRequest](../../models/operations/UploadDirectIncomeAttachmentRequest.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |


### Response

**[Optional<? extends io.codat.accounting.models.operations.UploadDirectIncomeAttachmentResponse>](../../models/operations/UploadDirectIncomeAttachmentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
