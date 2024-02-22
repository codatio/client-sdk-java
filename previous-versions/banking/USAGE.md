<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import io.codat.banking.CodatBanking;
import io.codat.banking.models.components.*;
import io.codat.banking.models.components.Security;
import io.codat.banking.models.operations.*;
import io.codat.banking.models.operations.ListAccountBalancesRequest;
import io.codat.banking.models.operations.ListAccountBalancesResponse;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            CodatBanking sdk = CodatBanking.builder()
                .authHeader("Basic BASE_64_ENCODED(API_KEY)")
                .build();

            ListAccountBalancesRequest req = ListAccountBalancesRequest.builder()
                .companyId("8a210b68-6988-11ed-a1eb-0242ac120002")
                .connectionId("2e9d2c44-f675-40ba-8049-353bfcb5e171")
                .orderBy("-modifiedDate")
                .page(1)
                .pageSize(100)
                .query("<value>")
                .build();

            ListAccountBalancesResponse res = sdk.accountBalances().list()
                .request(req)
                .call();

            if (res.accountBalances().isPresent()) {
                // handle response
            }
        } catch (io.codat.banking.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->