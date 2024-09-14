# Journals
(*journals()*)

## Overview

Get, create, and update Journals.

### Available Operations

* [create](#create) - Create journal
* [get](#get) - Get journal
* [getCreateModel](#getcreatemodel) - Get create journal model
* [list](#list) - List journals

## create

The *Create journal* endpoint creates a new [journal](https://docs.codat.io/sync-for-payroll-api#/schemas/Journal) for a given company's connection.

[Journals](https://docs.codat.io/sync-for-payroll-api#/schemas/Journal) are used to record all the financial transactions of a company.

**Integration-specific behaviour**

Required data may vary by integration. To see what data to post, first call [Get create journal model](https://docs.codat.io/sync-for-payroll-api#/operations/get-create-journals-model).

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=journals) for integrations that support creating a journal.


### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.components.JournalPrototype;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.CreateJournalRequest;
import io.codat.sync.payroll.models.operations.CreateJournalResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CreateJournalRequest req = CreateJournalRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .journalPrototype(JournalPrototype.builder()
                    .createdOn("2022-10-23T00:00:00Z")
                    .build())
                .build();

            CreateJournalResponse res = sdk.journals().create()
                .request(req)
                .call();

            if (res.createJournalResponse().isPresent()) {
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

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateJournalRequest](../../models/operations/CreateJournalRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateJournalResponse](../../models/operations/CreateJournalResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## get

The *Get journal* endpoint returns a single journal for a given `journalId`.

[Journals](https://docs.codat.io/sync-for-payroll-api#/schemas/Journal) are used to record all the financial transactions of a company.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=journals) for integrations that support getting a specific journal.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-payroll-api#/operations/refresh-company-data).


### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.GetJournalRequest;
import io.codat.sync.payroll.models.operations.GetJournalResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetJournalRequest req = GetJournalRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .journalId("<value>")
                .build();

            GetJournalResponse res = sdk.journals().get()
                .request(req)
                .call();

            if (res.journal().isPresent()) {
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

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetJournalRequest](../../models/operations/GetJournalRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetJournalResponse](../../models/operations/GetJournalResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 401,402,403,404,409,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |


## getCreateModel

The *Get create journal model* endpoint returns the expected data for the request payload when creating a [journal](https://docs.codat.io/sync-for-payroll-api#/schemas/Journal) for a given company and integration.

[Journals](https://docs.codat.io/sync-for-payroll-api#/schemas/Journal) are used to record all the financial transactions of a company.

**Integration-specific behaviour**

See the *response examples* for integration-specific indicative models.

Check out our [coverage explorer](https://knowledge.codat.io/supported-features/accounting?view=tab-by-data-type&dataType=journals) for integrations that support creating a journal.


### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.GetCreateJournalModelRequest;
import io.codat.sync.payroll.models.operations.GetCreateJournalModelResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetCreateJournalModelRequest req = GetCreateJournalModelRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

            GetCreateJournalModelResponse res = sdk.journals().getCreateModel()
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

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetCreateJournalModelRequest](../../models/operations/GetCreateJournalModelRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetCreateJournalModelResponse](../../models/operations/GetCreateJournalModelResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## list

The *List journals* endpoint returns a list of [journals](https://docs.codat.io/sync-for-payroll-api#/schemas/Journal) for a given company's connection.

[Journals](https://docs.codat.io/sync-for-payroll-api#/schemas/Journal) are used to record all the financial transactions of a company.

Before using this endpoint, you must have [retrieved data for the company](https://docs.codat.io/sync-for-payroll-api#/operations/refresh-company-data).
    

### Example Usage

```java
package hello.world;

import io.codat.sync.payroll.CodatSyncPayroll;
import io.codat.sync.payroll.models.errors.SDKError;
import io.codat.sync.payroll.models.operations.ListJournalsRequest;
import io.codat.sync.payroll.models.operations.ListJournalsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatSyncPayroll sdk = CodatSyncPayroll.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListJournalsRequest req = ListJournalsRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            ListJournalsResponse res = sdk.journals().list()
                .request(req)
                .call();

            if (res.journals().isPresent()) {
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

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListJournalsRequest](../../models/operations/ListJournalsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListJournalsResponse](../../models/operations/ListJournalsResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/ErrorMessage          | 400,401,402,403,404,409,429,500,503 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |
