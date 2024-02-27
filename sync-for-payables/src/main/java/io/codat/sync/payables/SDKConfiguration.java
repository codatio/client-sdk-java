/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.codat.sync.payables;

import io.codat.sync.payables.utils.HTTPClient;
import io.codat.sync.payables.utils.RetryConfig;
import io.codat.sync.payables.models.components.Security;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    public HTTPClient defaultClient;
	  public String serverUrl;
    public int serverIdx = 0;
  	public String language = "java";
  	public String openapiDocVersion = "3.0.0";
  	public String sdkVersion = "0.2.0";
  	public String genVersion = "2.272.7";
  	public String userAgent = "speakeasy-sdk/java 0.2.0 2.272.7 3.0.0 io.codat.sync.payables";
  	
  	
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
