// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientConfigResult {
    /**
     * @return Azure Client ID (Application Object ID).
     * 
     */
    private final String clientId;
    /**
     * @return Azure Object ID of the current user or service principal.
     * 
     */
    private final String objectId;
    /**
     * @return Azure Subscription ID
     * 
     */
    private final String subscriptionId;
    /**
     * @return Azure Tenant ID
     * 
     */
    private final String tenantId;

    @CustomType.Constructor
    private GetClientConfigResult(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("objectId") String objectId,
        @CustomType.Parameter("subscriptionId") String subscriptionId,
        @CustomType.Parameter("tenantId") String tenantId) {
        this.clientId = clientId;
        this.objectId = objectId;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
    }

    /**
     * @return Azure Client ID (Application Object ID).
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return Azure Object ID of the current user or service principal.
     * 
     */
    public String objectId() {
        return this.objectId;
    }
    /**
     * @return Azure Subscription ID
     * 
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * @return Azure Tenant ID
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String objectId;
        private String subscriptionId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClientConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.objectId = defaults.objectId;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder objectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }        public GetClientConfigResult build() {
            return new GetClientConfigResult(clientId, objectId, subscriptionId, tenantId);
        }
    }
}
