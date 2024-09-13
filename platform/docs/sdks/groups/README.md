# Groups
(*groups()*)

## Overview

Define and manage sets of companies based on a chosen characteristic.

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
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.models.operations.AddCompanyToGroupRequest;
import io.codat.platform.models.operations.AddCompanyToGroupResponse;
import io.codat.platform.models.shared.CompanyGroupAssignment;
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [AddCompanyToGroupRequest](../../models/operations/AddCompanyToGroupRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[AddCompanyToGroupResponse](../../models/operations/AddCompanyToGroupResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


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
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.models.operations.CreateGroupResponse;
import io.codat.platform.models.shared.GroupPrototype;
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

            GroupPrototype req = GroupPrototype.builder()
                .name("Invoice finance team")
                .build();

            CreateGroupResponse res = sdk.groups().create()
                .request(req)
                .call();

            if (res.group().isPresent()) {
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

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [GroupPrototype](../../models/shared/GroupPrototype.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[CreateGroupResponse](../../models/operations/CreateGroupResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,409,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## list

Use the *List group* endpoint to return a list of all groups that currently exist for your client.

[Groups](https://docs.codat.io/platform-api#/schemas/Group) define a set of companies that are organized based on a chosen characteristic and can be managed in the same way.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.models.operations.ListGroupsResponse;
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

            ListGroupsResponse res = sdk.groups().list()
                .call();

            if (res.groups().isPresent()) {
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

### Response

**[ListGroupsResponse](../../models/operations/ListGroupsResponse.md)**

### Errors

| Error Object               | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/ErrorMessage | 401,402,403,429,500,503    | application/json           |
| models/errors/SDKError     | 4xx-5xx                    | \*\/*                      |


## removeCompany

﻿Use the *Remove company* endpoint to remove a company from a group.

[Groups](https://docs.codat.io/platform-api#/schemas/Group) define a set of companies that are organized based on a chosen characteristic and can be managed in the same way.

### Example Usage

```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.SDKError;
import io.codat.platform.models.operations.RemoveCompanyFromGroupRequest;
import io.codat.platform.models.operations.RemoveCompanyFromGroupResponse;
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

            RemoveCompanyFromGroupRequest req = RemoveCompanyFromGroupRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .groupId("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                .build();

            RemoveCompanyFromGroupResponse res = sdk.groups().removeCompany()
                .request(req)
                .call();

            // handle response
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

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [RemoveCompanyFromGroupRequest](../../models/operations/RemoveCompanyFromGroupRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[RemoveCompanyFromGroupResponse](../../models/operations/RemoveCompanyFromGroupResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorMessage  | 401,402,403,404,429,500,503 | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |
