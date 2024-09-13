# CreditNotes
(*creditNotes()*)

## Overview

Access standardized Credit notes from linked accounting software.

### Available Operations

* [create](#create) - Create credit note
* [get](#get) - Get credit note
* [getCreateUpdateModel](#getcreateupdatemodel) - Get create/update credit note model
* [list](#list) - List credit notes
* [update](#update) - Update credit note

## create

The *Create credit note* endpoint creates a new [credit note](https://docs.codat.io/accounting-api#/schemas/CreditNote) for a given company's connection.

[Credit notes](https://docs.codat.io/accounting-api#/schemas/CreditNote) are issued to a customer to indicate debt, typically with reference to a previously issued invoice and/or purchase.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update credit note model](https://docs.codat.io/accounting-api#/operations/get-create-update-creditNotes-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=creditNotes) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.Allocation;
import io.codat.accounting.models.components.CreditNote;
import io.codat.accounting.models.components.CreditNoteStatus;
import io.codat.accounting.models.components.PaymentAllocationItems;
import io.codat.accounting.models.components.PaymentAllocationPayment;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.CreateCreditNoteRequest;
import io.codat.accounting.models.operations.CreateCreditNoteResponse;
import java.lang.Exception;
import java.math.BigDecimal;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateCreditNoteRequest req = CreateCreditNoteRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .creditNote(CreditNote.builder()
                    .discountPercentage(new BigDecimal("4865.89"))
                    .remainingCredit(new BigDecimal("4893.82"))
                    .status(CreditNoteStatus.PAID)
                    .subTotal(new BigDecimal("8592.13"))
                    .totalAmount(new BigDecimal("4174.58"))
                    .totalDiscount(new BigDecimal("2884.08"))
                    .totalTaxAmount(new BigDecimal("1343.65"))
                    .allocatedOnDate("2022-10-23T00:00:00Z")
                    .currency("EUR")
                    .issueDate("2022-10-23T00:00:00Z")
                    .lineItems(List.of(
                    ))
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .paymentAllocations(List.of(
                        PaymentAllocationItems.builder()
                            .allocation(Allocation.builder()
                                .allocatedOnDate("2022-10-23T00:00:00Z")
                                .currency("GBP")
                                .build())
                            .payment(PaymentAllocationPayment.builder()
                                .currency("EUR")
                                .paidOnDate("2022-10-23T00:00:00Z")
                                .build())
                            .build()))
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .build())
                .build();

            CreateCreditNoteResponse res = sdk.creditNotes().create()
                .request(req)
                .call();

            if (res.createCreditNoteResponse().isPresent()) {
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
| `request`                                                                     | [CreateCreditNoteRequest](../../models/operations/CreateCreditNoteRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateCreditNoteResponse](../../models/operations/CreateCreditNoteResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## get

The *Get credit note* endpoint returns a single credit note for a given creditNoteId.

[Credit notes](https://docs.codat.io/accounting-api#/schemas/CreditNote) are issued to a customer to indicate debt, typically with reference to a previously issued invoice and/or purchase.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=creditNotes) for integrations that support getting a specific credit note.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.GetCreditNoteRequest;
import io.codat.accounting.models.operations.GetCreditNoteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetCreditNoteRequest req = GetCreditNoteRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .creditNoteId("<value>")
                .build();

            GetCreditNoteResponse res = sdk.creditNotes().get()
                .request(req)
                .call();

            if (res.creditNote().isPresent()) {
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

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetCreditNoteRequest](../../models/operations/GetCreditNoteRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetCreditNoteResponse](../../models/operations/GetCreditNoteResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 401,402,403,404,409,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## getCreateUpdateModel

﻿The *Get create/update credit note model* endpoint returns the expected data for the request payload when creating and updating a [credit note](https://docs.codat.io/accounting-api#/schemas/CreditNote) for a given company and integration.

[Credit notes](https://docs.codat.io/accounting-api#/schemas/CreditNote) are issued to a customer to indicate debt, typically with reference to a previously issued invoice and/or purchase.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=creditNotes) for integrations that support creating and updating a credit note.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.GetCreateUpdateCreditNotesModelRequest;
import io.codat.accounting.models.operations.GetCreateUpdateCreditNotesModelResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetCreateUpdateCreditNotesModelRequest req = GetCreateUpdateCreditNotesModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateUpdateCreditNotesModelResponse res = sdk.creditNotes().getCreateUpdateModel()
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

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [GetCreateUpdateCreditNotesModelRequest](../../models/operations/GetCreateUpdateCreditNotesModelRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[GetCreateUpdateCreditNotesModelResponse](../../models/operations/GetCreateUpdateCreditNotesModelResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## list

The *List credit notes* endpoint returns a list of [credit notes](https://docs.codat.io/accounting-api#/schemas/CreditNote) for a given company's connection.

[Credit notes](https://docs.codat.io/accounting-api#/schemas/CreditNote) are issued to a customer to indicate debt, typically with reference to a previously issued invoice and/or purchase.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/codat-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.ListCreditNotesRequest;
import io.codat.accounting.models.operations.ListCreditNotesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListCreditNotesRequest req = ListCreditNotesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            ListCreditNotesResponse res = sdk.creditNotes().list()
                .request(req)
                .call();

            if (res.creditNotes().isPresent()) {
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

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListCreditNotesRequest](../../models/operations/ListCreditNotesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListCreditNotesResponse](../../models/operations/ListCreditNotesResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/ErrorMessage          | 400,401,402,403,404,409,429,500,503 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |


## update

The *Update credit note* endpoint updates an existing [credit note](https://docs.codat.io/accounting-api#/schemas/CreditNote) for a given company's connection.

[Credit notes](https://docs.codat.io/accounting-api#/schemas/CreditNote) are issued to a customer to indicate debt, typically with reference to a previously issued invoice and/or purchase.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create/update credit note model](https://docs.codat.io/accounting-api#/operations/get-create-update-creditNotes-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=creditNotes) for integrations that support creating an account.


### Example Usage

```java
package hello.world;

import io.codat.accounting.CodatAccounting;
import io.codat.accounting.models.components.Allocation;
import io.codat.accounting.models.components.CreditNote;
import io.codat.accounting.models.components.CreditNoteStatus;
import io.codat.accounting.models.components.PaymentAllocationItems;
import io.codat.accounting.models.components.PaymentAllocationPayment;
import io.codat.accounting.models.errors.SDKError;
import io.codat.accounting.models.operations.UpdateCreditNoteRequest;
import io.codat.accounting.models.operations.UpdateCreditNoteResponse;
import java.lang.Exception;
import java.math.BigDecimal;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatAccounting sdk = CodatAccounting.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            UpdateCreditNoteRequest req = UpdateCreditNoteRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .creditNoteId("<value>")
                .creditNote(CreditNote.builder()
                    .discountPercentage(new BigDecimal("8574.78"))
                    .remainingCredit(new BigDecimal("245.55"))
                    .status(CreditNoteStatus.PAID)
                    .subTotal(new BigDecimal("156.52"))
                    .totalAmount(new BigDecimal("3446.2"))
                    .totalDiscount(new BigDecimal("7084.55"))
                    .totalTaxAmount(new BigDecimal("9914.64"))
                    .allocatedOnDate("2022-10-23T00:00:00Z")
                    .currency("USD")
                    .issueDate("2022-10-23T00:00:00Z")
                    .lineItems(List.of(
                    ))
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .paymentAllocations(List.of(
                        PaymentAllocationItems.builder()
                            .allocation(Allocation.builder()
                                .allocatedOnDate("2022-10-23T00:00:00Z")
                                .currency("USD")
                                .build())
                            .payment(PaymentAllocationPayment.builder()
                                .currency("GBP")
                                .paidOnDate("2022-10-23T00:00:00Z")
                                .build())
                            .build()))
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .build())
                .build();

            UpdateCreditNoteResponse res = sdk.creditNotes().update()
                .request(req)
                .call();

            if (res.updateCreditNoteResponse().isPresent()) {
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
| `request`                                                                     | [UpdateCreditNoteRequest](../../models/operations/UpdateCreditNoteRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateCreditNoteResponse](../../models/operations/UpdateCreditNoteResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |
