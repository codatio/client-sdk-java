# Customers
(*customers()*)

## Overview

Customers

### Available Operations

* [createCustomer](#createcustomer) - Create customer
* [getCustomer](#getcustomer) - Get customer
* [listCustomers](#listcustomers) - List customers
* [updateCustomer](#updatecustomer) - Update customer

## createCustomer

The *Create customer* endpoint creates a new [customer](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) for a given company's connection.

[Customers](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update customer model](https://docs.codat.io/sync-for-expenses-api#/operations/get-create-update-customers-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=customers) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.CreateCustomerRequest;
import io.codat.sync_for_expenses.models.operations.CreateCustomerResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.AccountingAddress;
import io.codat.sync_for_expenses.models.shared.AccountingAddressType;
import io.codat.sync_for_expenses.models.shared.Contact;
import io.codat.sync_for_expenses.models.shared.Customer;
import io.codat.sync_for_expenses.models.shared.CustomerStatus;
import io.codat.sync_for_expenses.models.shared.Items;
import io.codat.sync_for_expenses.models.shared.Metadata;
import io.codat.sync_for_expenses.models.shared.Phone;
import io.codat.sync_for_expenses.models.shared.PhoneNumberType;
import io.codat.sync_for_expenses.models.shared.Security;
import io.codat.sync_for_expenses.models.shared.SupplementalData;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
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
                    .contactName("string")
                    .contacts(java.util.List.of(
                        Contact.builder()
                            .status(CustomerStatus.ACTIVE)
                            .address(Items.builder()
                                .type(AccountingAddressType.BILLING)
                                .build())
                            .modifiedDate("2022-10-23T00:00:00Z")
                            .phone(java.util.List.of(
                                Phone.builder()
                                    .number("+44 25691 154789")
                                    .type(PhoneNumberType.UNKNOWN)
                                    .build()))
                            .build()))
                    .customerName("string")
                    .defaultCurrency("EUR")
                    .emailAddress("Aaliyah30@hotmail.com")
                    .id("<ID>")
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .phone("888.658.7496 x3029")
                    .registrationNumber("string")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "string")))))
                        .build())
                    .taxNumber("string")
                    .build())
                .allowSyncOnPushComplete(false)
                .timeoutInMinutes(519028)
                .build();

            CreateCustomerResponse res = sdk.customers().createCustomer()
                .request(req)
                .call();

            if (res.createCustomerResponse().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [io.codat.sync_for_expenses.models.operations.CreateCustomerRequest](../../models/operations/CreateCustomerRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.CreateCustomerResponse>](../../models/operations/CreateCustomerResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getCustomer

The *Get customer* endpoint returns a single customer for a given customerId.

[Customers](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=customers) for integrations that support getting a specific customer.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-expenses-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.GetCustomerRequest;
import io.codat.sync_for_expenses.models.operations.GetCustomerResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetCustomerRequest req = GetCustomerRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .customerId("string")
                .build();

            GetCustomerResponse res = sdk.customers().getCustomer()
                .request(req)
                .call();

            if (res.customer().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
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
| `request`                                                                                                        | [io.codat.sync_for_expenses.models.operations.GetCustomerRequest](../../models/operations/GetCustomerRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.GetCustomerResponse>](../../models/operations/GetCustomerResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listCustomers

The *List customers* endpoint returns a list of [customers](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) for a given company's connection.

[Customers](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-expenses-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.ListCustomersRequest;
import io.codat.sync_for_expenses.models.operations.ListCustomersResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            ListCustomersRequest req = ListCustomersRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("string")
                .build();

            ListCustomersResponse res = sdk.customers().listCustomers()
                .request(req)
                .call();

            if (res.customers().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [io.codat.sync_for_expenses.models.operations.ListCustomersRequest](../../models/operations/ListCustomersRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.ListCustomersResponse>](../../models/operations/ListCustomersResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## updateCustomer

The *Update customer* endpoint updates an existing [customer](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) for a given company's connection.

[Customers](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update customer model](https://docs.codat.io/sync-for-expenses-api#/operations/get-create-update-customers-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=customers) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.UpdateCustomerRequest;
import io.codat.sync_for_expenses.models.operations.UpdateCustomerResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.AccountingAddress;
import io.codat.sync_for_expenses.models.shared.AccountingAddressType;
import io.codat.sync_for_expenses.models.shared.Contact;
import io.codat.sync_for_expenses.models.shared.Customer;
import io.codat.sync_for_expenses.models.shared.CustomerStatus;
import io.codat.sync_for_expenses.models.shared.Items;
import io.codat.sync_for_expenses.models.shared.Metadata;
import io.codat.sync_for_expenses.models.shared.Phone;
import io.codat.sync_for_expenses.models.shared.PhoneNumberType;
import io.codat.sync_for_expenses.models.shared.Security;
import io.codat.sync_for_expenses.models.shared.SupplementalData;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            UpdateCustomerRequest req = UpdateCustomerRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .customerId("string")
                .customer(Customer.builder()
                    .status(CustomerStatus.ARCHIVED)
                    .addresses(java.util.List.of(
                        AccountingAddress.builder()
                            .type(AccountingAddressType.BILLING)
                            .build()))
                    .contactName("string")
                    .contacts(java.util.List.of(
                        Contact.builder()
                            .status(CustomerStatus.ACTIVE)
                            .address(Items.builder()
                                .type(AccountingAddressType.BILLING)
                                .build())
                            .modifiedDate("2022-10-23T00:00:00Z")
                            .phone(java.util.List.of(
                                Phone.builder()
                                    .number("(877) 492-8687")
                                    .type(PhoneNumberType.FAX)
                                    .build()))
                            .build()))
                    .customerName("string")
                    .defaultCurrency("EUR")
                    .emailAddress("Amiya.Gottlieb44@gmail.com")
                    .id("<ID>")
                    .metadata(Metadata.builder()
                        .isDeleted(false)
                        .build())
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .phone("823-367-9833 x044")
                    .registrationNumber("string")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .supplementalData(SupplementalData.builder()
                        .content(java.util.Map.ofEntries(
                            entry("key", java.util.Map.ofEntries(
                                entry("key", "string")))))
                        .build())
                    .taxNumber("string")
                    .build())
                .allowSyncOnPushComplete(false)
                .forceUpdate(false)
                .timeoutInMinutes(629817)
                .build();

            UpdateCustomerResponse res = sdk.customers().updateCustomer()
                .request(req)
                .call();

            if (res.updateCustomerResponse().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [io.codat.sync_for_expenses.models.operations.UpdateCustomerRequest](../../models/operations/UpdateCustomerRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[Optional<? extends io.codat.sync_for_expenses.models.operations.UpdateCustomerResponse>](../../models/operations/UpdateCustomerResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
