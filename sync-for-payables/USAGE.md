<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import io.codat.sync_for_payables.CodatSyncPayables;
import io.codat.sync_for_payables.models.components.*;
import io.codat.sync_for_payables.models.components.CompanyRequestBody;
import io.codat.sync_for_payables.models.components.Items;
import io.codat.sync_for_payables.models.components.Security;
import io.codat.sync_for_payables.models.operations.*;
import io.codat.sync_for_payables.models.operations.CreateCompanyResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncPayables sdk = CodatSyncPayables.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    Items.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().create()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync_for_payables.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->