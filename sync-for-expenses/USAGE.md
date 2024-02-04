<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import io.codat.sync_for_expenses.CodatSyncExpenses;
import io.codat.sync_for_expenses.models.operations.*;
import io.codat.sync_for_expenses.models.operations.CreateCompanyResponse;
import io.codat.sync_for_expenses.models.shared.*;
import io.codat.sync_for_expenses.models.shared.CompanyRequestBody;
import io.codat.sync_for_expenses.models.shared.GroupItems;
import io.codat.sync_for_expenses.models.shared.Security;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncExpenses sdk = CodatSyncExpenses.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                    .build())
                .build();

            CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .groups(java.util.List.of(
                    GroupItems.builder()
                        .id("60d2fa12-8a04-11ee-b9d1-0242ac120002")
                        .build()))
                .build();

            CreateCompanyResponse res = sdk.companies().createCompany()
                .request(req)
                .call();

            if (res.company().isPresent()) {
                // handle response
            }

        } catch (io.codat.sync_for_expenses.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->