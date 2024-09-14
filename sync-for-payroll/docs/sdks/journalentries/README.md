# JournalEntries
(*journalEntries()*)

## Overview

Get, create, and update Journal entries.

### Available Operations

* [create](#create) - Create journal entry
* [delete](#delete) - Delete journal entry
* [get](#get) - Get journal entry
* [getCreateModel](#getcreatemodel) - Get create journal entry model
* [list](#list) - List journal entries

## create

The *Create journal entry* endpoint creates a new [journal entry](https://docs.codat.io/sync-for-payroll-api#/schemas/JournalEntry) for a given company's connection.

[Journal entries](https://docs.codat.io/sync-for-payroll-api#/schemas/JournalEntry) are  made in a company's general ledger, or accounts, when transactions are approved.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create journal entry model](https://docs.codat.io/sync-for-payroll-api#/operations/get-create-journalEntries-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=journalEntries) for integrations that support creating a journal entry.


### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.components.JournalEntry;
import io.codat.sync.payroll.models.components.JournalEntryRecordRef;
import io.codat.sync.payroll.models.components.JournalEntryRecordRefDataType;
import io.codat.sync.payroll.models.components.JournalLine;
import io.codat.sync.payroll.models.components.Tracking;
import io.codat.sync.payroll.models.components.TrackingRecordRef;
import io.codat.sync.payroll.models.components.TrackingRecordRefDataType;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.CreateJournalEntryRequest;
import io.codat.sync.payroll.models.operations.CreateJournalEntryResponse;
import java.lang.Exception;
import java.math.BigDecimal;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateJournalEntryRequest req = CreateJournalEntryRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .journalEntry(JournalEntry.builder()
                    .createdOn("2022-10-23T00:00:00Z")
                    .journalLines(List.of(
                        JournalLine.builder()
                            .netAmount(new BigDecimal("6384.24"))
                            .tracking(Tracking.builder()
                                .recordRefs(List.of(
                                    TrackingRecordRef.builder()
                                        .dataType(TrackingRecordRefDataType.TRACKING_CATEGORIES)
                                        .build()))
                                .build())
                            .build()))
                    .modifiedDate("2022-10-23T00:00:00Z")
                    .postedOn("2022-10-23T00:00:00Z")
                    .recordRef(JournalEntryRecordRef.builder()
                        .dataType(JournalEntryRecordRefDataType.TRANSFERS)
                        .build())
                    .sourceModifiedDate("2022-10-23T00:00:00Z")
                    .updatedOn("2022-10-23T00:00:00Z")
                    .build())
                .build();

            CreateJournalEntryResponse res = sdk.journalEntries().create()
                .request(req)
                .call();

            if (res.createJournalEntryResponse().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.ErrorMessage e) {
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
| `request`                                                                         | [CreateJournalEntryRequest](../../models/operations/CreateJournalEntryRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateJournalEntryResponse](../../models/operations/CreateJournalEntryResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## delete

﻿> **Use with caution**
>
>Because journal entries underpin every transaction in an accounting software, deleting a journal entry can affect every transaction for a given company.
> 
> **Before you proceed, make sure you understand the implications of deleting journal entries from an accounting perspective.**

The *Delete journal entry* endpoint allows you to delete a specified journal entry from an accounting software.

[Journal entries](https://docs.codat.io/sync-for-payroll-api#/schemas/JournalEntry) are made in a company's general ledger, or accounts, when transactions are approved.

### Process
1. Pass the `{journalEntryId}` to the *Delete journal entry* endpoint and store the `pushOperationKey` returned.
2. Check the status of the delete by checking the status of push operation either via
   1. [Push operation webhook](https://docs.codat.io/introduction/webhooks/core-rules-types#push-operation-status-has-changed) (advised),
   2. [Push operation status endpoint](https://docs.codat.io/sync-for-payroll-api#/operations/get-push-operation). 
   
   A `Success` status indicates that the journal entry object was deleted from the accounting software.
3. (Optional) Check that the journal entry was deleted from the accounting software.

### Effect on related objects

Be aware that deleting a journal entry from an accounting software might cause related objects to be modified. For example, if you delete the journal entry for a paid invoice in QuickBooks Online, the invoice is deleted but the payment against that invoice is not. The payment is converted to a payment on account.

## Integration specifics
Integrations that support soft delete do not permanently delete the object in the accounting software.

| Integration | Soft Deleted | 
|-------------|--------------|
| QuickBooks Online | Yes    |       


### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.DeleteJournalEntryRequest;
import io.codat.sync.payroll.models.operations.DeleteJournalEntryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            DeleteJournalEntryRequest req = DeleteJournalEntryRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .journalEntryId("<value>")
                .build();

            DeleteJournalEntryResponse res = sdk.journalEntries().delete()
                .request(req)
                .call();

            if (res.pushOperation().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.ErrorMessage e) {
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
| `request`                                                                         | [DeleteJournalEntryRequest](../../models/operations/DeleteJournalEntryRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[DeleteJournalEntryResponse](../../models/operations/DeleteJournalEntryResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## get

The *Get journal entry* endpoint returns a single journal entry for a given `journalEntryId`.

[Journal entries](https://docs.codat.io/sync-for-payroll-api#/schemas/JournalEntry) are  made in a company's general ledger, or accounts, when transactions are approved.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=journalEntries) for integrations that support getting a specific journal entry.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-payroll-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.GetJournalEntryRequest;
import io.codat.sync.payroll.models.operations.GetJournalEntryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetJournalEntryRequest req = GetJournalEntryRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .journalEntryId("<value>")
                .build();

            GetJournalEntryResponse res = sdk.journalEntries().get()
                .request(req)
                .call();

            if (res.journalEntry().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.ErrorMessage e) {
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
| `request`                                                                   | [GetJournalEntryRequest](../../models/operations/GetJournalEntryRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetJournalEntryResponse](../../models/operations/GetJournalEntryResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 401,402,403,404,409,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## getCreateModel

﻿The *Get create journal entry model* endpoint returns the expected data for the request payload when creating a [journal entry](https://docs.codat.io/sync-for-payroll-api#/schemas/JournalEntry) for a given company and integration.

[Journal entries](https://docs.codat.io/sync-for-payroll-api#/schemas/JournalEntry) are  made in a company's general ledger, or accounts, when transactions are approved.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=journalEntries) for integrations that support creating a journal entry.


### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.GetCreateJournalEntryModelRequest;
import io.codat.sync.payroll.models.operations.GetCreateJournalEntryModelResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetCreateJournalEntryModelRequest req = GetCreateJournalEntryModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateJournalEntryModelResponse res = sdk.journalEntries().getCreateModel()
                .request(req)
                .call();

            if (res.pushOption().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.ErrorMessage e) {
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
| `request`                                                                                         | [GetCreateJournalEntryModelRequest](../../models/operations/GetCreateJournalEntryModelRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetCreateJournalEntryModelResponse](../../models/operations/GetCreateJournalEntryModelResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## list

The *List journal entries* endpoint returns a list of [journal entries](https://docs.codat.io/sync-for-payroll-api#/schemas/JournalEntry) for a given company's connection.

[Journal entries](https://docs.codat.io/sync-for-payroll-api#/schemas/JournalEntry) are  made in a company's general ledger, or accounts, when transactions are approved.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-payroll-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.ListJournalEntriesRequest;
import io.codat.sync.payroll.models.operations.ListJournalEntriesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListJournalEntriesRequest req = ListJournalEntriesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            ListJournalEntriesResponse res = sdk.journalEntries().list()
                .request(req)
                .call();

            if (res.journalEntries().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.payroll.models.errors.ErrorMessage e) {
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
| `request`                                                                         | [ListJournalEntriesRequest](../../models/operations/ListJournalEntriesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListJournalEntriesResponse](../../models/operations/ListJournalEntriesResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/ErrorMessage          | 400,401,402,403,404,409,429,500,503 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |
