# Configuration
(*configuration()*)

## Overview

Configure bank feeds for a company.

### Available Operations

* [get](#get) - Get configuration
* [set](#set) - Set configuration

## get

﻿The *Get configuration* endpoint returns the current configuration for a given company ID.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.GetConfigurationRequest;
import io.codat.bank_feeds.models.operations.GetConfigurationResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetConfigurationRequest req = GetConfigurationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .build();

            GetConfigurationResponse res = sdk.configuration().get()
                .request(req)
                .call();

            if (res.configuration().isPresent()) {
                // handle response
            }
        } catch (io.codat.bank_feeds.models.errors.SDKError e) {
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
| `request`                                                                                                           | [io.codat.bank_feeds.models.operations.GetConfigurationRequest](../../models/operations/GetConfigurationRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.GetConfigurationResponse>](../../models/operations/GetConfigurationResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |

## set

﻿Use *Set configuration* endpoint to configure a given company ID.

### Example Usage

```java
package hello.world;

import io.codat.bank_feeds.CodatBankFeeds;
import io.codat.bank_feeds.models.components.*;
import io.codat.bank_feeds.models.components.BankAccountOption;
import io.codat.bank_feeds.models.components.Configuration;
import io.codat.bank_feeds.models.components.ConfigurationContactRef;
import io.codat.bank_feeds.models.components.ConfigurationCustomer;
import io.codat.bank_feeds.models.components.ConfigurationSchedule;
import io.codat.bank_feeds.models.components.ConfigurationSupplier;
import io.codat.bank_feeds.models.components.Security;
import io.codat.bank_feeds.models.components.SyncAsBankFeeds;
import io.codat.bank_feeds.models.components.SyncAsExpenses;
import io.codat.bank_feeds.models.components.SyncConfiguration;
import io.codat.bank_feeds.models.operations.*;
import io.codat.bank_feeds.models.operations.SetConfigurationRequest;
import io.codat.bank_feeds.models.operations.SetConfigurationResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatBankFeeds sdk = CodatBankFeeds.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            SetConfigurationRequest req = SetConfigurationRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .configuration(Configuration.builder()
                    .accountingSoftwareCompanyName("<value>")
                    .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                    .configuration(SyncConfiguration.builder()
                        .syncAsBankFeeds(SyncAsBankFeeds.builder()
                            .bankAccountOptions(java.util.List.of(
                                BankAccountOption.builder()
                                    .build()))
                            .enableSync(false)
                            .selectedBankAccountId("<value>")
                            .build())
                        .syncAsExpenses(SyncAsExpenses.builder()
                            .bankAccountOptions(java.util.List.of(
                                BankAccountOption.builder()
                                    .build()))
                            .customer(ConfigurationCustomer.builder()
                                .customerOptions(java.util.List.of(
                                    ConfigurationContactRef.builder()
                                        .build()))
                                .selectedCustomerId("<value>")
                                .build())
                            .enableSync(false)
                            .selectedBankAccountId("<value>")
                            .supplier(ConfigurationSupplier.builder()
                                .selectedSupplierId("<value>")
                                .supplierOptions(java.util.List.of(
                                    ConfigurationContactRef.builder()
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .configured(false)
                    .enabled(false)
                    .schedule(ConfigurationSchedule.builder()
                        .frequencyOptions(java.util.List.of(
                            "<value>"))
                        .selectedFrequency("<value>")
                        .startDate("<value>")
                        .syncHourUtc(255863L)
                        .timeZoneIanaId("<value>")
                        .build())
                    .build())
                .build();

            SetConfigurationResponse res = sdk.configuration().set()
                .request(req)
                .call();

            if (res.configuration().isPresent()) {
                // handle response
            }
        } catch (io.codat.bank_feeds.models.errors.SDKError e) {
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
| `request`                                                                                                           | [io.codat.bank_feeds.models.operations.SetConfigurationRequest](../../models/operations/SetConfigurationRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[Optional<? extends io.codat.bank_feeds.models.operations.SetConfigurationResponse>](../../models/operations/SetConfigurationResponse.md)**
### Errors

| Error Object          | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| models/errorsSDKError | 4xx-5xx               | */*                   |
