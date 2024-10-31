/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.sync.payables;

import io.codat.sync.payables.hooks.SDKHooks;
import io.codat.sync.payables.utils.HTTPClient;
import io.codat.sync.payables.utils.Hook.SdkInitData;
import io.codat.sync.payables.utils.Hooks;
import io.codat.sync.payables.utils.RetryConfig;
import java.lang.String;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    public HTTPClient defaultClient;
    public String serverUrl;
    public int serverIdx = 0;
    private static final String LANGUAGE = "java";
    public static final String OPENAPI_DOC_VERSION = "3.0.0";
    public static final String SDK_VERSION = "4.0.0";
    public static final String GEN_VERSION = "2.445.1";
    private static final String BASE_PACKAGE = "io.codat.sync.payables";
    public static final String USER_AGENT = 
            String.format("speakeasy-sdk/%s %s %s %s %s", 
                LANGUAGE, SDK_VERSION, GEN_VERSION, OPENAPI_DOC_VERSION, BASE_PACKAGE);

    private Hooks _hooks = createHooks();

    private static Hooks createHooks() {
        Hooks hooks = new Hooks();
        return hooks;
    }
    
    public Hooks hooks() {
        return _hooks;
    }

    public void setHooks(Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(serverUrl, defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
