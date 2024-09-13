# PushData
(*pushData()*)

## Overview

Initiate and monitor Create, Update, and Delete operations.

### Available Operations

* [getModelOptions](#getmodeloptions) - Get push options
* [getOperation](#getoperation) - Get push operation
* [listOperations](#listoperations) - List push operations

## getModelOptions

This is the generic documentation for creation and updating of data. See the equivalent endpoint for a given data type for more specific information. 

Before pushing data into accounting software, it is often necessary to collect some details from the user as to how they would like the data to be inserted. This includes names and amounts on transactional entities, but also factors such as categorisation of entities, which is often handled differently between different accounting software. A good example of this is specifying where on the balance sheet/profit and loss reports the user would like a newly-created nominal account to appear.

Codat tries not to limit users to pushing to a very limited number of standard categories, so we have implemented "options" endpoints, which allow us to expose to our clients the fields which are required to be pushed for a specific linked company, and the options which may be selected for each field.


> **Supported Integrations**
> 
> Check out our [coverage explorer](https://knowledge.codat.io/) for integrations that support push (POST/PUT methods).

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.models.operations.GetCreateUpdateModelOptionsByDataTypeRequest;
import io.codat.platform.models.operations.GetCreateUpdateModelOptionsByDataTypeResponse;
import io.codat.platform.models.shared.SchemaDataType;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetCreateUpdateModelOptionsByDataTypeRequest req = GetCreateUpdateModelOptionsByDataTypeRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .dataType(SchemaDataType.INVOICES)
                .build();

            GetCreateUpdateModelOptionsByDataTypeResponse res = sdk.pushData().getModelOptions()
                .request(req)
                .call();

            if (res.pushOption().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
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

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [GetCreateUpdateModelOptionsByDataTypeRequest](../../models/operations/GetCreateUpdateModelOptionsByDataTypeRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |

### Response

**[GetCreateUpdateModelOptionsByDataTypeResponse](../../models/operations/GetCreateUpdateModelOptionsByDataTypeResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getOperation

Retrieve push operation.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.models.operations.GetPushOperationRequest;
import io.codat.platform.models.operations.GetPushOperationResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetPushOperationRequest req = GetPushOperationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .pushOperationKey("59acd79e-29d3-4138-91d3-91d4641bf7ed")
                .build();

            GetPushOperationResponse res = sdk.pushData().getOperation()
                .request(req)
                .call();

            if (res.pushOperation().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
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
| `request`                                                                     | [GetPushOperationRequest](../../models/operations/GetPushOperationRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetPushOperationResponse](../../models/operations/GetPushOperationResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## listOperations

List push operation records.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.models.operations.GetCompanyPushHistoryRequest;
import io.codat.platform.models.operations.GetCompanyPushHistoryResponse;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            GetCompanyPushHistoryRequest req = GetCompanyPushHistoryRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("id=e3334455-1aed-4e71-ab43-6bccf12092ee")
                .build();

            GetCompanyPushHistoryResponse res = sdk.pushData().listOperations()
                .request(req)
                .call();

            if (res.pushOperations().isPresent()) {
                // handle response
            }
        } catch (io.codat.platform.models.errors.ErrorMessage e) {
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
| `request`                                                                               | [GetCompanyPushHistoryRequest](../../models/operations/GetCompanyPushHistoryRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetCompanyPushHistoryResponse](../../models/operations/GetCompanyPushHistoryResponse.md)**

### Errors

| Error Object                    | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/ErrorMessage      | 400,401,402,403,404,429,500,503 | application/json                |
| models/errors/SDKError          | 4xx-5xx                         | \*\/*                           |
