# Customers
(*customers()*)

## Overview

Get, create, and update customers.

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

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.Contact;
import io.codat.sync.expenses.models.components.Customer;
import io.codat.sync.expenses.models.components.CustomerStatus;
import io.codat.sync.expenses.models.components.PhoneNumberItems;
import io.codat.sync.expenses.models.components.PhoneNumberType;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.CreateCustomerRequest;
import io.codat.sync.expenses.models.operations.CreateCustomerResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CreateCustomerRequest req = CreateCustomerRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .customer(Customer.builder()
                    .status(CustomerStatus.ACTIVE)
                    .contacts(List.of(
                        Contact.builder()
                            .status(CustomerStatus.ACTIVE)
                            .modifiedDate("2022-10-23T00:00:00Z")
                            .phone(List.of(
                                PhoneNumberItems.builder()
                                    .type(PhoneNumberType.PRIMARY)
                                    .number("+44 25691 154789")
                                    .build()))
                            .build()))
                    .defaultCurrency("EUR")
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .build())
                .build();

        CreateCustomerResponse res = sdk.customers().create()
                .request(req)
                .call();

        if (res.createCustomerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateCustomerRequest](../../models/operations/CreateCustomerRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateCustomerResponse](../../models/operations/CreateCustomerResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## get

The *Get customer* endpoint returns a single customer for a given customerId.

[Customers](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-expenses-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.GetCustomerRequest;
import io.codat.sync.expenses.models.operations.GetCustomerResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        GetCustomerRequest req = GetCustomerRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .customerId("7110701885")
                .build();

        GetCustomerResponse res = sdk.customers().get()
                .request(req)
                .call();

        if (res.customer().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetCustomerRequest](../../models/operations/GetCustomerRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetCustomerResponse](../../models/operations/GetCustomerResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 401, 402, 403, 404, 409, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## list

The *List customers* endpoint returns a list of [customers](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) for a given company's connection.

[Customers](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-expenses-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.ListCustomersRequest;
import io.codat.sync.expenses.models.operations.ListCustomersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        ListCustomersRequest req = ListCustomersRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

        ListCustomersResponse res = sdk.customers().list()
                .request(req)
                .call();

        if (res.customers().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListCustomersRequest](../../models/operations/ListCustomersRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListCustomersResponse](../../models/operations/ListCustomersResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/ErrorMessage                  | 400, 401, 402, 403, 404, 409, 429, 500, 503 | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |

## update

The *Update customer* endpoint updates an existing [customer](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) for a given company's connection.

[Customers](https://docs.codat.io/sync-for-expenses-api#/schemas/Customer) are people or organizations that buy goods or services from the SMB.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update customer model](https://docs.codat.io/sync-for-expenses-api#/operations/get-create-update-customers-model).

### Example Usage

```java
package hello.world;

import io.codat.sync.expenses.CodatSyncExpenses;
import io.codat.sync.expenses.models.components.Contact;
import io.codat.sync.expenses.models.components.Customer;
import io.codat.sync.expenses.models.components.CustomerStatus;
import io.codat.sync.expenses.models.components.PhoneNumberItems;
import io.codat.sync.expenses.models.components.PhoneNumberType;
import io.codat.sync.expenses.models.errors.ErrorMessage;
import io.codat.sync.expenses.models.operations.UpdateCustomerRequest;
import io.codat.sync.expenses.models.operations.UpdateCustomerResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        UpdateCustomerRequest req = UpdateCustomerRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .customerId("EILBDVJVNUAGVKRQ")
                .customer(Customer.builder()
                    .status(CustomerStatus.ACTIVE)
                    .contacts(List.of(
                        Contact.builder()
                            .status(CustomerStatus.ACTIVE)
                            .modifiedDate("2022-10-23T00:00:00Z")
                            .phone(List.of(
                                PhoneNumberItems.builder()
                                    .type(PhoneNumberType.FAX)
                                    .number("(877) 492-8687")
                                    .build()))
                            .build()))
                    .defaultCurrency("EUR")
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .build())
                .build();

        UpdateCustomerResponse res = sdk.customers().update()
                .request(req)
                .call();

        if (res.updateCustomerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateCustomerRequest](../../models/operations/UpdateCustomerRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateCustomerResponse](../../models/operations/UpdateCustomerResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |