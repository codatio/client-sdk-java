# Customers
(*customers()*)

## Overview

Customers

### Available Operations

* [create](#create) - Create customer
* [get](#get) - Get customer
* [list](#list) - List customers
* [update](#update) - Update customer

## create

The *Create customer* endpoint creates a new [customer](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) for a given company's connection.

[Customers](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update customer model](https://docs.codat.io/sync-for-expenses-api#/operations/get-create-update-customers-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=customers) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.AccountingAddress;
import io.codat.sync.expenses.models.components.AccountingAddressType;
import io.codat.sync.expenses.models.components.Contact;
import io.codat.sync.expenses.models.components.Customer;
import io.codat.sync.expenses.models.components.CustomerStatus;
import io.codat.sync.expenses.models.components.Items;
import io.codat.sync.expenses.models.components.Metadata;
import io.codat.sync.expenses.models.components.Phone;
import io.codat.sync.expenses.models.components.PhoneNumberType;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.components.SupplementalData;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.CreateCustomerRequest;
import io.codat.sync.expenses.models.operations.CreateCustomerResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateCustomerRequest req = CreateCustomerRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .customer(Customer.builder()
                    .status(CustomerStatus.ACTIVE)
                    .addresses(java.util.List.of(
                        AccountingAddress.builder()
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
                .allowSyncOnPushComplete(false)
                .timeoutInMinutes(752438)
                .build();

            CreateCustomerResponse res = sdk.customers().create()
                .request(req)
                .call();

            if (res.createCustomerResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [io.codat.sync.expenses.models.operations.CreateCustomerRequest](../../models/operations/CreateCustomerRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.CreateCustomerResponse>](../../models/operations/CreateCustomerResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## get

The *Get customer* endpoint returns a single customer for a given customerId.

[Customers](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=customers) for integrations that support getting a specific customer.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-expenses-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.GetCustomerRequest;
import io.codat.sync.expenses.models.operations.GetCustomerResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
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
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
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
| `request`                                                                                                    | [io.codat.sync.expenses.models.operations.GetCustomerRequest](../../models/operations/GetCustomerRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.GetCustomerResponse>](../../models/operations/GetCustomerResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

The *List customers* endpoint returns a list of [customers](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) for a given company's connection.

[Customers](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-expenses-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.ListCustomersRequest;
import io.codat.sync.expenses.models.operations.ListCustomersResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
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
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [io.codat.sync.expenses.models.operations.ListCustomersRequest](../../models/operations/ListCustomersRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.ListCustomersResponse>](../../models/operations/ListCustomersResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## update

The *Update customer* endpoint updates an existing [customer](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) for a given company's connection.

[Customers](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update customer model](https://docs.codat.io/sync-for-expenses-api#/operations/get-create-update-customers-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=customers) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.*;
import io.codat.sync.expenses.models.components.AccountingAddress;
import io.codat.sync.expenses.models.components.AccountingAddressType;
import io.codat.sync.expenses.models.components.Contact;
import io.codat.sync.expenses.models.components.Customer;
import io.codat.sync.expenses.models.components.CustomerStatus;
import io.codat.sync.expenses.models.components.Items;
import io.codat.sync.expenses.models.components.Metadata;
import io.codat.sync.expenses.models.components.Phone;
import io.codat.sync.expenses.models.components.PhoneNumberType;
import io.codat.sync.expenses.models.components.Security;
import io.codat.sync.expenses.models.components.SupplementalData;
import io.codat.sync.expenses.models.operations.*;
import io.codat.sync.expenses.models.operations.UpdateCustomerRequest;
import io.codat.sync.expenses.models.operations.UpdateCustomerResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            UpdateCustomerRequest req = UpdateCustomerRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .customerId("<value>")
                .customer(Customer.builder()
                    .status(CustomerStatus.ARCHIVED)
                    .addresses(java.util.List.of(
                        AccountingAddress.builder()
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
                .allowSyncOnPushComplete(false)
                .forceUpdate(false)
                .timeoutInMinutes(644713)
                .build();

            UpdateCustomerResponse res = sdk.customers().update()
                .request(req)
                .call();

            if (res.updateCustomerResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [io.codat.sync.expenses.models.operations.UpdateCustomerRequest](../../models/operations/UpdateCustomerRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends io.codat.sync.expenses.models.operations.UpdateCustomerResponse>](../../models/operations/UpdateCustomerResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
