<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import io.codat.platform.CodatPlatform;
import io.codat.platform.models.errors.ErrorMessage;
import io.codat.platform.models.operations.CreateApiKeyResponse;
import io.codat.platform.models.shared.CreateApiKey;
import io.codat.platform.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorMessage, Exception {

        CodatPlatform sdk = CodatPlatform.builder()
                .security(Security.builder()
                    .authHeader("Basic BASE_64_ENCODED(API_KEY)")
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
    }
}
```
<!-- End SDK Example Usage [usage] -->