// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogicAppReceiverResponse {
    /**
     * @return The callback url where http request sent to.
     * 
     */
    private final String callbackUrl;
    /**
     * @return The name of the logic app receiver. Names must be unique across all receivers within an action group.
     * 
     */
    private final String name;
    /**
     * @return The azure resource id of the logic app receiver.
     * 
     */
    private final String resourceId;
    /**
     * @return Indicates whether to use common alert schema.
     * 
     */
    private final @Nullable Boolean useCommonAlertSchema;

    @CustomType.Constructor
    private LogicAppReceiverResponse(
        @CustomType.Parameter("callbackUrl") String callbackUrl,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceId") String resourceId,
        @CustomType.Parameter("useCommonAlertSchema") @Nullable Boolean useCommonAlertSchema) {
        this.callbackUrl = callbackUrl;
        this.name = name;
        this.resourceId = resourceId;
        this.useCommonAlertSchema = useCommonAlertSchema;
    }

    /**
     * @return The callback url where http request sent to.
     * 
     */
    public String callbackUrl() {
        return this.callbackUrl;
    }
    /**
     * @return The name of the logic app receiver. Names must be unique across all receivers within an action group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The azure resource id of the logic app receiver.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }
    /**
     * @return Indicates whether to use common alert schema.
     * 
     */
    public Optional<Boolean> useCommonAlertSchema() {
        return Optional.ofNullable(this.useCommonAlertSchema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogicAppReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String callbackUrl;
        private String name;
        private String resourceId;
        private @Nullable Boolean useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(LogicAppReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackUrl = defaults.callbackUrl;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = Objects.requireNonNull(callbackUrl);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder useCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }        public LogicAppReceiverResponse build() {
            return new LogicAppReceiverResponse(callbackUrl, name, resourceId, useCommonAlertSchema);
        }
    }
}
