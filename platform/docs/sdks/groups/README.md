# Groups
(*groups()*)

## Overview

Create groups and link them to your Codat companies.

### Available Operations

* [addCompany](#addcompany) - Add company
* [create](#create) - Create group
* [list](#list) - List groups
* [removeCompany](#removecompany) - Remove company

## addCompany

﻿Use the *Add company* endpoint to assign a company to a group. A company can belong to multiple groups, but can only be added to one group at a time.

[Groups](https://docs.codat.io/platform-api#/schemas/Group) define a set of companies that are organized based on a chosen characteristic and can be managed in the same way.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.AddCompanyToGroupRequest;
import io.codat.platform.models.operations.AddCompanyToGroupResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.CompanyGroupAssignment;
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

            AddCompanyToGroupRequest req = AddCompanyToGroupRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .companyGroupAssignment(CompanyGroupAssignment.builder()
                    .groupId("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                    .build())
                .build();

            AddCompanyToGroupResponse res = sdk.groups().addCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
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

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [io.codat.platform.models.operations.AddCompanyToGroupRequest](../../models/operations/AddCompanyToGroupRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[Optional<? extends io.codat.platform.models.operations.AddCompanyToGroupResponse>](../../models/operations/AddCompanyToGroupResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## create

﻿Use the *Create group* endpoint to generate a new group that you can assign your companies to.

[Groups](https://docs.codat.io/platform-api#/schemas/Group) define a set of companies that are organized based on a chosen characteristic and can be managed in the same way.

### Tips and traps

* The maximum length for the group name is 50 characters.
* It's possible to create up to 20 groups per client.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.CreateGroupResponse;
import io.codat.platform.models.shared.*;
import io.codat.platform.models.shared.GroupPrototype;
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

            GroupPrototype req = GroupPrototype.builder()
                .name("Invoice finance team")
                .build();

            CreateGroupResponse res = sdk.groups().create()
                .request(req)
                .call();

            if (res.group().isPresent()) {
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

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [io.codat.platform.models.shared.GroupPrototype](../../models/shared/GroupPrototype.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |


### Response

**[Optional<? extends io.codat.platform.models.operations.CreateGroupResponse>](../../models/operations/CreateGroupResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## list

Use the *List group* endpoint to return a list of all groups that currently exist for your client.

[Groups](https://docs.codat.io/platform-api#/schemas/Group) define a set of companies that are organized based on a chosen characteristic and can be managed in the same way.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.ListGroupsResponse;
import io.codat.platform.models.shared.*;
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

            ListGroupsResponse res = sdk.groups().list()
                .call();

            if (res.groups().isPresent()) {
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


### Response

**[Optional<? extends io.codat.platform.models.operations.ListGroupsResponse>](../../models/operations/ListGroupsResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## removeCompany

﻿Use the *Remove company* endpoint to remove a company from a group.

[Groups](https://docs.codat.io/platform-api#/schemas/Group) define a set of companies that are organized based on a chosen characteristic and can be managed in the same way.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.operations.*;
import io.codat.platform.models.operations.RemoveCompanyFromGroupRequest;
import io.codat.platform.models.operations.RemoveCompanyFromGroupResponse;
import io.codat.platform.models.shared.*;
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

            RemoveCompanyFromGroupRequest req = RemoveCompanyFromGroupRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .groupId("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                .build();

            RemoveCompanyFromGroupResponse res = sdk.groups().removeCompany()
                .request(req)
                .call();

            // handle response

        } catch (io.codat.platform.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [io.codat.platform.models.operations.RemoveCompanyFromGroupRequest](../../models/operations/RemoveCompanyFromGroupRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[Optional<? extends io.codat.platform.models.operations.RemoveCompanyFromGroupResponse>](../../models/operations/RemoveCompanyFromGroupResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
