<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import io.codat.sync.commerce.CodatSyncCommerce;
import io.codat.sync.commerce.models.components.*;
import io.codat.sync.commerce.models.components.Locale;
import io.codat.sync.commerce.models.components.Security;
import io.codat.sync.commerce.models.operations.*;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowRequest;
import io.codat.sync.commerce.models.operations.GetConfigTextSyncFlowResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatSyncCommerce sdk = CodatSyncCommerce.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            GetConfigTextSyncFlowRequest req = GetConfigTextSyncFlowRequest.builder()
                .locale(Locale.EN_US)
                .build();

            GetConfigTextSyncFlowResponse res = sdk.syncFlowSettings().getConfigTextSyncFlow()
                .request(req)
                .call();

            if (res.localizationInfo().isPresent()) {
                // handle response
            }
        } catch (io.codat.sync.commerce.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->