# FileUpload
(*fileUpload()*)

## Overview

Endpoints to manage uploaded files.

### Available Operations

* [downloadFiles](#downloadfiles) - Download all files for a company
* [listFiles](#listfiles) - List all files uploaded by a company
* [uploadFiles](#uploadfiles) - Upload files for a company

## downloadFiles

The *Download files* endpoint downloads all files that have  been uploaded by to SMB to Codat. A `date` may be specified to download any files uploaded on the date provided.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.DownloadFilesRequest;
import io.codat.lending.models.operations.DownloadFilesResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            DownloadFilesRequest req = DownloadFilesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .date("2022-10-23T00:00:00Z")
                .build();

            DownloadFilesResponse res = sdk.fileUpload().downloadFiles()
                .request(req)
                .call();

            if (res.data().isPresent()) {
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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [io.codat.lending.models.operations.DownloadFilesRequest](../../models/operations/DownloadFilesRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Optional<? extends io.codat.lending.models.operations.DownloadFilesResponse>](../../models/operations/DownloadFilesResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## listFiles

﻿The *List files* endpoint returns a list of all files uploaded to Codat by the SMB. 

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.ListFilesRequest;
import io.codat.lending.models.operations.ListFilesResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            ListFilesRequest req = ListFilesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            ListFilesResponse res = sdk.fileUpload().listFiles()
                .request(req)
                .call();

            if (res.files().isPresent()) {
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [io.codat.lending.models.operations.ListFilesRequest](../../models/operations/ListFilesRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[Optional<? extends io.codat.lending.models.operations.ListFilesResponse>](../../models/operations/ListFilesResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## uploadFiles

The *Upload files* endpoint uploads multiple files provided by the SMB to Codat. This may include personal identity documents, pitch decks, contracts, or files with accounting and banking data.

Uploaded files must meet the following requirements:

- Up to 20 files can be uploaded at a time.
- PDF, XLS, XLSX, XLSB, CSV, DOC, DOCX, PPT, PPTX, JPEG, JPG, and PNG files can be uploaded.
- Each file can be up to 10MB in size.

### Example Usage

```java
package hello.world;

import io.codat.lending.CodatLending;
import io.codat.lending.models.operations.*;
import io.codat.lending.models.operations.UploadFilesRequest;
import io.codat.lending.models.operations.UploadFilesResponse;
import io.codat.lending.models.shared.*;
import io.codat.lending.models.shared.CodatFile;
import io.codat.lending.models.shared.FileUpload;
import io.codat.lending.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatLending sdk = CodatLending.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            UploadFilesRequest req = UploadFilesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .fileUpload(FileUpload.builder()
                    .file(CodatFile.builder()
                            .content("0x87cbca97eC".getBytes())
                            .fileName("string")
                            .build())
                    .build())
                .build();

            UploadFilesResponse res = sdk.fileUpload().uploadFiles()
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

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [io.codat.lending.models.operations.UploadFilesRequest](../../models/operations/UploadFilesRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[Optional<? extends io.codat.lending.models.operations.UploadFilesResponse>](../../models/operations/UploadFilesResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
