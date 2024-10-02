<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import io.codat.sync.payables.CodatSyncPayables;
import io.codat.sync.payables.models.components.CompanyRequestBody;
import io.codat.sync.payables.models.errors.ErrorMessage;
import io.codat.sync.payables.models.operations.CreateCompanyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatSyncPayables sdk = CodatSyncPayables.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
            .build();

        CompanyRequestBody req = CompanyRequestBody.builder()
                .name("Bank of Dave")
                .description("Requested early access to the new financing scheme.")
                .build();

        CreateCompanyResponse res = sdk.companies().create()
                .request(req)
                .call();

        if (res.company().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->