/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.platform;

import io.codat.platform.utils.Hook.SdkInitData;
import io.codat.platform.utils.HTTPClient;
import io.codat.platform.utils.RetryConfig;
import io.codat.platform.models.shared.Security;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    public HTTPClient defaultClient;
      public String serverUrl;
    public int serverIdx = 0;
    public String language = "java";
    public String openapiDocVersion = "3.0.0";
    public String sdkVersion = "0.4.0";
    public String genVersion = "2.314.0";
    public String userAgent = "speakeasy-sdk/java 0.4.0 2.314.0 3.0.0 io.codat.platform";

    private io.codat.platform.utils.Hooks _hooks = new io.codat.platform.utils.Hooks();

    public io.codat.platform.utils.Hooks hooks() {
        return _hooks;
    }

    public void setHooks(io.codat.platform.utils.Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        io.codat.platform.hooks.SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(serverUrl, defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
