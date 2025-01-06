# BankStatements
(*bankStatements()*)

## Overview

Retrieve banking data from linked bank accounts.

### Available Operations

* [endUploadSession](#enduploadsession) - End upload session
* [getUploadConfiguration](#getuploadconfiguration) - Get upload configuration
* [setUploadConfiguration](#setuploadconfiguration) - Set upload configuration
* [startUploadSession](#startuploadsession) - Start upload session
* [uploadBankStatementData](#uploadbankstatementdata) - Upload data

## endUploadSession

Use the *End upload session* endpoint to finalize a bank statement upload session. Include a `status` in the request body to indicate if you want to cancel the processing of the dataset or trigger the ingestion and enrichment of the data.

A session is a one-time process that enables you to upload bank statements to Codat. It will time out after 90 minutes if no data is uploaded.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.EndBankStatementUploadSessionRequest;
import io.codat.lending.models.operations.EndBankStatementUploadSessionResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        EndBankStatementUploadSessionRequest req = EndBankStatementUploadSessionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .datasetId("d58db2ab-edef-4881-8b6b-a7e79d33244c")
                .build();

        EndBankStatementUploadSessionResponse res = sdk.bankStatements().endUploadSession()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [EndBankStatementUploadSessionRequest](../../models/operations/EndBankStatementUploadSessionRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[EndBankStatementUploadSessionResponse](../../models/operations/EndBankStatementUploadSessionResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## getUploadConfiguration

Use the *Get upload configuration* endpoint to view the existing bank statement upload configuration for the specified data connection.

With this configuration, you set the source of the data you plan to upload, the ID of the account in third-party banking platform, and a provider ID, if required. This lets us determine the expected format of the data and any source-specific requirements.

When you use the [*Upload data*](https://docs.codat.io/lending-api#/operations/upload-bank-statement-data) endpoint next, you must upload the data for the account you configured. 

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.GetBankStatementUploadConfigurationRequest;
import io.codat.lending.models.operations.GetBankStatementUploadConfigurationResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        GetBankStatementUploadConfigurationRequest req = GetBankStatementUploadConfigurationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

        GetBankStatementUploadConfigurationResponse res = sdk.bankStatements().getUploadConfiguration()
                .request(req)
                .call();

        if (res.bankStatementUploadConfiguration().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [GetBankStatementUploadConfigurationRequest](../../models/operations/GetBankStatementUploadConfigurationRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[GetBankStatementUploadConfigurationResponse](../../models/operations/GetBankStatementUploadConfigurationResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## setUploadConfiguration

Use the *Set upload configuration* endpoint to create bank statement upload configuration for the specified data connection. 

With this configuration, you set the source of the data you plan to upload, the ID of the account in third-party banking platform, and a provider ID, if required. This lets us determine the expected format of the data and any source-specific requirements.

Each data connection can only have one configuration for each company and external account ID combination. You will receive a Bad Request response if you try to set it again. 

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.SetBankStatementUploadConfigurationRequest;
import io.codat.lending.models.operations.SetBankStatementUploadConfigurationResponse;
import io.codat.lending.models.shared.BankStatementUploadConfiguration;
import io.codat.lending.models.shared.Security;
import io.codat.lending.models.shared.Source;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        SetBankStatementUploadConfigurationRequest req = SetBankStatementUploadConfigurationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .bankStatementUploadConfiguration(BankStatementUploadConfiguration.builder()
                    .accountId("abc123-ABC")
                    .source(Source.CODAT)
                    .build())
                .build();

        SetBankStatementUploadConfigurationResponse res = sdk.bankStatements().setUploadConfiguration()
                .request(req)
                .call();

        if (res.bankStatementUploadConfiguration().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [SetBankStatementUploadConfigurationRequest](../../models/operations/SetBankStatementUploadConfigurationRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[SetBankStatementUploadConfigurationResponse](../../models/operations/SetBankStatementUploadConfigurationResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## startUploadSession

Use the *Start upload session* endpoint to initiate a bank statement upload session for a given company.

A session is a one-time process that enables you to upload bank statements to Codat. It will time out after 90 minutes if no data is uploaded. 

You can only have one active session per data type at a time. You can complete or cancel a session using the [*End upload session*](https://docs.codat.io/lending-api#/operations/end-bank-statement-upload-session) endpoint.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.StartBankStatementUploadSessionRequest;
import io.codat.lending.models.operations.StartBankStatementUploadSessionResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        StartBankStatementUploadSessionRequest req = StartBankStatementUploadSessionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .build();

        StartBankStatementUploadSessionResponse res = sdk.bankStatements().startUploadSession()
                .request(req)
                .call();

        if (res.pullOperation().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [StartBankStatementUploadSessionRequest](../../models/operations/StartBankStatementUploadSessionRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[StartBankStatementUploadSessionResponse](../../models/operations/StartBankStatementUploadSessionResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## uploadBankStatementData

During an active session, use the **Upload data* endpoint to uploads a page of bank accounts or bank transactions data to the session.

Make sure you created configuration for the account using the [*Set upload configuration*](https://docs.codat.io/lending-api#/operations/set-bank-statement-upload-configuration) endpoint before attempting an upload. 

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.errors.ErrorMessage;
import io.codat.lending.models.operations.UploadBankStatementDataRequest;
import io.codat.lending.models.operations.UploadBankStatementDataRequestBody;
import io.codat.lending.models.operations.UploadBankStatementDataResponse;
import io.codat.lending.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
            .build();

        UploadBankStatementDataRequest req = UploadBankStatementDataRequest.builder()
                .requestBody(UploadBankStatementDataRequestBody.of(Map.ofEntries(\n    Map.entry("currency", "Lek"),\n    Map.entry("id", "<id>"),\n    Map.entry("identifiers", Map.ofEntries(\n    Map.entry("type", "Investment"))),\n    Map.entry("modifiedDate", "2022-10-23T00:00:00Z"),\n    Map.entry("name", "<value>"),\n    Map.entry("sourceModifiedDate", "2022-10-23T00:00:00Z"),\n    Map.entry("type", "Credit"))))
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .datasetId("15fc5ae4-359b-4dee-ba7c-3a22596ededc")
                .build();

        UploadBankStatementDataResponse res = sdk.bankStatements().uploadBankStatementData()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UploadBankStatementDataRequest](../../models/operations/UploadBankStatementDataRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UploadBankStatementDataResponse](../../models/operations/UploadBankStatementDataResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ErrorMessage             | 400, 401, 402, 403, 404, 429, 500, 503 | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |