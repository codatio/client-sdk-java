<!-- Start SDK Example Usage [usage] -->
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
import java.util.Optional;
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