# Platform

<!-- Start Codat Library Description -->
Manage the building blocks of Codat, including companies, connections, and more.
<!-- End Codat Library Description -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Gradle

```groovy
implementation 'io.codat.platform:openapi:0.1.1'
```
<!-- End SDK Installation [installation] -->

## Example Usage
<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.CreateApiKeyResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.CreateApiKey;
import io.codat.platform.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            CreateApiKey req = CreateApiKey.builder()
                .name("azure-invoice-finance-processor")
                .build();

            CreateApiKeyResponse res = sdk.settings().createApiKey()
                .request(req)
                .call();

            if (res.apiKeyDetails().isPresent()) {
                // handle response
            }

        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [settings()](docs/sdks/settings/README.md)

* [createApiKey](docs/sdks/settings/README.md#createapikey) - Create API key
* [deleteApiKey](docs/sdks/settings/README.md#deleteapikey) - Delete API key
* [getProfile](docs/sdks/settings/README.md#getprofile) - Get profile
* [getSyncSettings](docs/sdks/settings/README.md#getsyncsettings) - Get sync settings
* [listApiKeys](docs/sdks/settings/README.md#listapikeys) - List API keys
* [updateProfile](docs/sdks/settings/README.md#updateprofile) - Update profile
* [updateSyncSettings](docs/sdks/settings/README.md#updatesyncsettings) - Update all sync settings

### [companies()](docs/sdks/companies/README.md)

* [create](docs/sdks/companies/README.md#create) - Create company
* [delete](docs/sdks/companies/README.md#delete) - Delete a company
* [get](docs/sdks/companies/README.md#get) - Get company
* [list](docs/sdks/companies/README.md#list) - List companies
* [update](docs/sdks/companies/README.md#update) - Update company

### [connections()](docs/sdks/connections/README.md)

* [create](docs/sdks/connections/README.md#create) - Create connection
* [delete](docs/sdks/connections/README.md#delete) - Delete connection
* [get](docs/sdks/connections/README.md#get) - Get connection
* [list](docs/sdks/connections/README.md#list) - List connections
* [unlink](docs/sdks/connections/README.md#unlink) - Unlink connection
* [updateAuthorization](docs/sdks/connections/README.md#updateauthorization) - Update authorization

### [customDataType()](docs/sdks/customdatatype/README.md)

* [configure](docs/sdks/customdatatype/README.md#configure) - Configure custom data type
* [getConfiguration](docs/sdks/customdatatype/README.md#getconfiguration) - Get custom data configuration
* [list](docs/sdks/customdatatype/README.md#list) - List custom data type records
* [refresh](docs/sdks/customdatatype/README.md#refresh) - Refresh custom data type

### [pushData()](docs/sdks/pushdata/README.md)

* [getModelOptions](docs/sdks/pushdata/README.md#getmodeloptions) - Get push options
* [getOperation](docs/sdks/pushdata/README.md#getoperation) - Get push operation
* [listOperations](docs/sdks/pushdata/README.md#listoperations) - List push operations

### [refreshData()](docs/sdks/refreshdata/README.md)

* [all](docs/sdks/refreshdata/README.md#all) - Refresh all data
* [byDataType](docs/sdks/refreshdata/README.md#bydatatype) - Refresh data type
* [get](docs/sdks/refreshdata/README.md#get) - Get data status
* [getPullOperation](docs/sdks/refreshdata/README.md#getpulloperation) - Get pull operation
* [listPullOperations](docs/sdks/refreshdata/README.md#listpulloperations) - List pull operations

### [groups()](docs/sdks/groups/README.md)

* [addCompany](docs/sdks/groups/README.md#addcompany) - Add company
* [create](docs/sdks/groups/README.md#create) - Create group
* [list](docs/sdks/groups/README.md#list) - List groups
* [removeCompany](docs/sdks/groups/README.md#removecompany) - Remove company

### [integrations()](docs/sdks/integrations/README.md)

* [get](docs/sdks/integrations/README.md#get) - Get integration
* [getBranding](docs/sdks/integrations/README.md#getbranding) - Get branding
* [list](docs/sdks/integrations/README.md#list) - List integrations

### [supplementalData()](docs/sdks/supplementaldata/README.md)

* [configure](docs/sdks/supplementaldata/README.md#configure) - Configure
* [getConfiguration](docs/sdks/supplementaldata/README.md#getconfiguration) - Get configuration

### [webhooks()](docs/sdks/webhooks/README.md)

* [create](docs/sdks/webhooks/README.md#create) - Create webhook
* [get](docs/sdks/webhooks/README.md#get) - Get webhook
* [list](docs/sdks/webhooks/README.md#list) - List webhooks
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or raise an error.  If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Exception type.

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

### Example

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.CreateApiKeyResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.CreateApiKey;
import io.codat.platform.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            CreateApiKey req = CreateApiKey.builder()
                .name("azure-invoice-finance-processor")
                .build();

            CreateApiKeyResponse res = sdk.settings().createApiKey()
                .request(req)
                .call();

            if (res.apiKeyDetails().isPresent()) {
                // handle response
            }

        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://api.codat.io` | None |

#### Example

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.CreateApiKeyResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.CreateApiKey;
import io.codat.platform.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .serverIndex(0)
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            CreateApiKey req = CreateApiKey.builder()
                .name("azure-invoice-finance-processor")
                .build();

            CreateApiKeyResponse res = sdk.settings().createApiKey()
                .request(req)
                .call();

            if (res.apiKeyDetails().isPresent()) {
                // handle response
            }

        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.CreateApiKeyResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.CreateApiKey;
import io.codat.platform.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .serverURL("https://api.codat.io")
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            CreateApiKey req = CreateApiKey.builder()
                .name("azure-invoice-finance-processor")
                .build();

            CreateApiKeyResponse res = sdk.settings().createApiKey()
                .request(req)
                .call();

            if (res.apiKeyDetails().isPresent()) {
                // handle response
            }

        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name         | Type         | Scheme       |
| ------------ | ------------ | ------------ |
| `authHeader` | apiKey       | API key      |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.CreateApiKeyResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.CreateApiKey;
import io.codat.platform.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("<YOUR_API_KEY_HERE>")
                    .build())
                .build();

            CreateApiKey req = CreateApiKey.builder()
                .name("azure-invoice-finance-processor")
                .build();

            CreateApiKeyResponse res = sdk.settings().createApiKey()
                .request(req)
                .call();

            if (res.apiKeyDetails().isPresent()) {
                // handle response
            }

        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->


<!-- Start Codat Support Notes -->
### Support

If you encounter any challenges while utilizing our SDKs, please don't hesitate to reach out for assistance. 
You can raise any issues by contacting your dedicated Codat representative or reaching out to our [support team](mailto:support@codat.io).
We're here to help ensure a smooth experience for you.
<!-- End Codat Support Notes -->
### Library generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
