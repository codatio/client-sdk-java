# BankStatements
(*bankStatements()*)

## Overview

Retrieve banking data from linked bank accounts.

### Available Operations

* [endUploadSession](#enduploadsession) - End upload session
* [getUploadConfiguration](#getuploadconfiguration) - Get upload configuration
* [setUploadConfiguration](#setuploadconfiguration) - Set upload configuration
* [startUploadSession](#startuploadsession) - Start upload session

## endUploadSession

The *End upload session* endpoint finalizes a bank statement upload session, either cancelling the dataset or triggering ingestion of the data and enrichment of uploaded transactions.

A session is a one-time process where bank statements can be uploaded to Codat. The session will time out if no data is uploaded for 90 minutes.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.EndBankStatementUploadSessionRequest;
import io.codat.lending.models.operations.EndBankStatementUploadSessionResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.EndUploadSessionRequest;
import io.codat.lending.models.shared.EndUploadSessionRequestStatus;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            EndBankStatementUploadSessionRequest req = EndBankStatementUploadSessionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .datasetId("d58db2ab-edef-4881-8b6b-a7e79d33244c")
                .endUploadSessionRequest(EndUploadSessionRequest.builder()
                    .status(EndUploadSessionRequestStatus.CANCEL)
                    .build())
                .build();

            EndBankStatementUploadSessionResponse res = sdk.bankStatements().endUploadSession()
                .request(req)
                .call();

            // handle response
        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [io.codat.lending.models.operations.EndBankStatementUploadSessionRequest](../../models/operations/EndBankStatementUploadSessionRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[Optional<? extends io.codat.lending.models.operations.EndBankStatementUploadSessionResponse>](../../models/operations/EndBankStatementUploadSessionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## getUploadConfiguration

The *Get upload configuration* endpoint returns the bank statement upload configuration for the data connection.

Bank statement upload configuration allows configuration of the source of the data to be uploaded to the *Upload data* endpoint, the provider ID for a truelayer connection, and sets the account ID of the account. Data uploaded to the *Upload data* endpoint must be for the configured account.Bank statement upload configuration is used to define the source from which data is to be uploaded as well as any source specific requirements such as the provider ID for TrueLayer. 

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.GetBankStatementUploadConfigurationRequest;
import io.codat.lending.models.operations.GetBankStatementUploadConfigurationResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [io.codat.lending.models.operations.GetBankStatementUploadConfigurationRequest](../../models/operations/GetBankStatementUploadConfigurationRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[Optional<? extends io.codat.lending.models.operations.GetBankStatementUploadConfigurationResponse>](../../models/operations/GetBankStatementUploadConfigurationResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## setUploadConfiguration

The *Set upload configuration* endpoint sets the bank statement upload configuration for the data connection

Bank statement upload configuration is used to define the source from which data is to be uploaded as well as any source specific requirements such as the provider ID for TrueLayer.

If configuration is already present for the data connection a Bad Request response will be returned. If there is already a data connection for the same company with the same account ID, a Bad Request response will be returned.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.SetBankStatementUploadConfigurationRequest;
import io.codat.lending.models.operations.SetBankStatementUploadConfigurationResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.BankStatementUploadConfiguration;
import io.codat.lending.models.shared.Security;
import io.codat.lending.models.shared.Source;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            SetBankStatementUploadConfigurationRequest req = SetBankStatementUploadConfigurationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .bankStatementUploadConfiguration(BankStatementUploadConfiguration.builder()
                    .accountId("<value>")
                    .providerId("<value>")
                    .source(Source.CODAT)
                    .build())
                .build();

            SetBankStatementUploadConfigurationResponse res = sdk.bankStatements().setUploadConfiguration()
                .request(req)
                .call();

            if (res.bankStatementUploadConfiguration().isPresent()) {
                // handle response
            }
        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [io.codat.lending.models.operations.SetBankStatementUploadConfigurationRequest](../../models/operations/SetBankStatementUploadConfigurationRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[Optional<? extends io.codat.lending.models.operations.SetBankStatementUploadConfigurationResponse>](../../models/operations/SetBankStatementUploadConfigurationResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## startUploadSession

The *Start upload session* endpoint initiates a bank statement upload session for a given company.

A session is a one-time session where bank statements can be uploaded to Codat.

If a session is already in progress for a data type bad request will be returned. The session will time out if no data is uploaded for 90 minutes.
Use the *Close upload session* endpoint to complete or cancel a session. 

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.StartBankStatementUploadSessionRequest;
import io.codat.lending.models.operations.StartBankStatementUploadSessionResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.Security;
import io.codat.lending.models.shared.StartUploadSessionRequest;
import io.codat.lending.models.shared.StartUploadSessionRequestDataType;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            StartBankStatementUploadSessionRequest req = StartBankStatementUploadSessionRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .startUploadSessionRequest(StartUploadSessionRequest.builder()
                    .dataType(StartUploadSessionRequestDataType.BANKING_TRANSACTIONS)
                    .build())
                .build();

            StartBankStatementUploadSessionResponse res = sdk.bankStatements().startUploadSession()
                .request(req)
                .call();

            if (res.pullOperation().isPresent()) {
                // handle response
            }
        } catch (io.codat.lending.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [io.codat.lending.models.operations.StartBankStatementUploadSessionRequest](../../models/operations/StartBankStatementUploadSessionRequest.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[Optional<? extends io.codat.lending.models.operations.StartBankStatementUploadSessionResponse>](../../models/operations/StartBankStatementUploadSessionResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
