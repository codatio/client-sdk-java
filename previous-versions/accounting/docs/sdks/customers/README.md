# Customers
(*customers()*)

## Overview

Customers

### Available Operations

* [create](#create) - Create customer
* [downloadAttachment](#downloadattachment) - Download customer attachment
* [get](#get) - Get customer
* [getAttachment](#getattachment) - Get customer attachment
* [getCreateUpdateModel](#getcreateupdatemodel) - Get create/update customer model
* [list](#list) - List customers
* [listAttachments](#listattachments) - List customer attachments
* [update](#update) - Update customer

## create

The *Create customer* endpoint creates a new [customer](https://docs.codat.io/accounting-api#/schemas/Customer) for a given company's connection.

[Customers](https://docs.codat.io/accounting-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update customer model](https://docs.codat.io/accounting-api#/operations/get-create-update-customers-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=customers) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AccountingAddressType;
import io.codat.accounting.models.components.Contact;
import io.codat.accounting.models.components.Customer;
import io.codat.accounting.models.components.CustomerStatus;
import io.codat.accounting.models.components.Items;
import io.codat.accounting.models.components.Metadata;
import io.codat.accounting.models.components.PhoneNumberItems;
import io.codat.accounting.models.components.PhoneNumberType;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.components.SupplementalData;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.CreateCustomerRequest;
import io.codat.accounting.models.operations.CreateCustomerResponse;
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

            CreateCustomerRequest req = CreateCustomerRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .customer(Customer.builder()
                    .status(CustomerStatus.ACTIVE)
                    .addresses(java.util.List.of(
                        Items.builder()
                            .type(AccountingAddressType.BILLING)
                            .build()))
                    .contactName("<value>")
                    .contacts(java.util.List.of(
                        Contact.builder()
                            .status(CustomerStatus.UNKNOWN)
                            .modifiedDate("2022-10-23T00:00:00Z")
                            .build()))
                    .customerName("<value>")
                    .defaultCurrency("GBP")
                    .emailAddress("Annie.Zieme95@hotmail.com")
                    .id("<id>")
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .phone("513-277-8855")
                    .registrationNumber("<value>")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "<value>")))))
                        .build())
                    .taxNumber("<value>")
                    .build())
                .timeoutInMinutes(752438)
                .build();

            CreateCustomerResponse res = sdk.customers().create()
                .request(req)
                .call();

            if (res.createCustomerResponse().isPresent()) {
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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [io.codat.accounting.models.operations.CreateCustomerRequest](../../models/operations/CreateCustomerRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[Optional<? extends io.codat.accounting.models.operations.CreateCustomerResponse>](../../models/operations/CreateCustomerResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## downloadAttachment

The *Download customer attachment* endpoint downloads a specific attachment for a given `customerId` and `attachmentId`.

[Customers](https://docs.codat.io/accounting-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=customers) for integrations that support downloading a customer attachment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.DownloadCustomerAttachmentRequest;
import io.codat.accounting.models.operations.DownloadCustomerAttachmentResponse;
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

            DownloadCustomerAttachmentRequest req = DownloadCustomerAttachmentRequest.builder()
                .attachmentId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .customerId("<value>")
                .build();

            DownloadCustomerAttachmentResponse res = sdk.customers().downloadAttachment()
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

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [io.codat.accounting.models.operations.DownloadCustomerAttachmentRequest](../../models/operations/DownloadCustomerAttachmentRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[Optional<? extends io.codat.accounting.models.operations.DownloadCustomerAttachmentResponse>](../../models/operations/DownloadCustomerAttachmentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## get

The *Get customer* endpoint returns a single customer for a given customerId.

[Customers](https://docs.codat.io/accounting-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=customers) for integrations that support getting a specific customer.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetCustomerRequest;
import io.codat.accounting.models.operations.GetCustomerResponse;
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

            GetCustomerRequest req = GetCustomerRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .customerId("<value>")
                .build();

            GetCustomerResponse res = sdk.customers().get()
                .request(req)
                .call();

            if (res.customer().isPresent()) {
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

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [io.codat.accounting.models.operations.GetCustomerRequest](../../models/operations/GetCustomerRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetCustomerResponse>](../../models/operations/GetCustomerResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getAttachment

The *Get customer attachment* endpoint returns a specific attachment for a given `customerId` and `attachmentId`.

[Customers](https://docs.codat.io/accounting-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=customers) for integrations that support getting a customer attachment.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetCustomerAttachmentRequest;
import io.codat.accounting.models.operations.GetCustomerAttachmentResponse;
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

            GetCustomerAttachmentRequest req = GetCustomerAttachmentRequest.builder()
                .attachmentId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .customerId("<value>")
                .build();

            GetCustomerAttachmentResponse res = sdk.customers().getAttachment()
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

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [io.codat.accounting.models.operations.GetCustomerAttachmentRequest](../../models/operations/GetCustomerAttachmentRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetCustomerAttachmentResponse>](../../models/operations/GetCustomerAttachmentResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCreateUpdateModel

﻿The *Get create/update customer model* endpoint returns the expected data for the request payload when creating and updating a [customer](https://docs.codat.io/accounting-api#/schemas/Customer) for a given company and integration.

[Customers](https://docs.codat.io/accounting-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=customers) for integrations that support creating and updating a customer.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.GetCreateUpdateCustomersModelRequest;
import io.codat.accounting.models.operations.GetCreateUpdateCustomersModelResponse;
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

            GetCreateUpdateCustomersModelRequest req = GetCreateUpdateCustomersModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateUpdateCustomersModelResponse res = sdk.customers().getCreateUpdateModel()
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

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [io.codat.accounting.models.operations.GetCreateUpdateCustomersModelRequest](../../models/operations/GetCreateUpdateCustomersModelRequest.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |


### Response

**[Optional<? extends io.codat.accounting.models.operations.GetCreateUpdateCustomersModelResponse>](../../models/operations/GetCreateUpdateCustomersModelResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List customers* endpoint returns a list of [customers](https://docs.codat.io/accounting-api#/schemas/Customer) for a given company's connection.

[Customers](https://docs.codat.io/accounting-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.ListCustomersRequest;
import io.codat.accounting.models.operations.ListCustomersResponse;
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

            ListCustomersRequest req = ListCustomersRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListCustomersResponse res = sdk.customers().list()
                .request(req)
                .call();

            if (res.customers().isPresent()) {
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [io.codat.accounting.models.operations.ListCustomersRequest](../../models/operations/ListCustomersRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends io.codat.accounting.models.operations.ListCustomersResponse>](../../models/operations/ListCustomersResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listAttachments

The *List customer attachments* endpoint returns a list of attachments avialable to download for given `customerId`.

[Customers](https://docs.codat.io/accounting-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=customers) for integrations that support listing customer attachments.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.ListCustomerAttachmentsRequest;
import io.codat.accounting.models.operations.ListCustomerAttachmentsResponse;
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

            ListCustomerAttachmentsRequest req = ListCustomerAttachmentsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .customerId("<value>")
                .build();

            ListCustomerAttachmentsResponse res = sdk.customers().listAttachments()
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

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [io.codat.accounting.models.operations.ListCustomerAttachmentsRequest](../../models/operations/ListCustomerAttachmentsRequest.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |


### Response

**[Optional<? extends io.codat.accounting.models.operations.ListCustomerAttachmentsResponse>](../../models/operations/ListCustomerAttachmentsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## update

The *Update customer* endpoint updates an existing [customer](https://docs.codat.io/accounting-api#/schemas/Customer) for a given company's connection.

[Customers](https://docs.codat.io/accounting-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update customer model](https://docs.codat.io/accounting-api#/operations/get-create-update-customers-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=customers) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.*;
import io.codat.accounting.models.components.AccountingAddressType;
import io.codat.accounting.models.components.Contact;
import io.codat.accounting.models.components.Customer;
import io.codat.accounting.models.components.CustomerStatus;
import io.codat.accounting.models.components.Items;
import io.codat.accounting.models.components.Metadata;
import io.codat.accounting.models.components.PhoneNumberItems;
import io.codat.accounting.models.components.PhoneNumberType;
import io.codat.accounting.models.components.Security;
import io.codat.accounting.models.components.SupplementalData;
import io.codat.accounting.models.operations.*;
import io.codat.accounting.models.operations.UpdateCustomerRequest;
import io.codat.accounting.models.operations.UpdateCustomerResponse;
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

            UpdateCustomerRequest req = UpdateCustomerRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .customerId("<value>")
                .customer(Customer.builder()
                    .status(CustomerStatus.ARCHIVED)
                    .addresses(java.util.List.of(
                        Items.builder()
                            .type(AccountingAddressType.BILLING)
                            .build()))
                    .contactName("<value>")
                    .contacts(java.util.List.of(
                        Contact.builder()
                            .status(CustomerStatus.ARCHIVED)
                            .modifiedDate("2022-10-23T00:00:00Z")
                            .build()))
                    .customerName("<value>")
                    .defaultCurrency("EUR")
                    .emailAddress("Lizzie.Paucek@gmail.com")
                    .id("<id>")
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .phone("1-228-543-3723")
                    .registrationNumber("<value>")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "<value>")))))
                        .build())
                    .taxNumber("<value>")
                    .build())
                .forceUpdate(false)
                .timeoutInMinutes(644713)
                .build();

            UpdateCustomerResponse res = sdk.customers().update()
                .request(req)
                .call();

            if (res.updateCustomerResponse().isPresent()) {
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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [io.codat.accounting.models.operations.UpdateCustomerRequest](../../models/operations/UpdateCustomerRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[Optional<? extends io.codat.accounting.models.operations.UpdateCustomerResponse>](../../models/operations/UpdateCustomerResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
