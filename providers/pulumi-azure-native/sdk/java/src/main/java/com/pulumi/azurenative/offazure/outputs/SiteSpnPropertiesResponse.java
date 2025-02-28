// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.offazure.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SiteSpnPropertiesResponse {
    /**
     * @return AAD Authority URL which was used to request the token for the service principal.
     * 
     */
    private final @Nullable String aadAuthority;
    /**
     * @return Application/client Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    private final @Nullable String applicationId;
    /**
     * @return Intended audience for the service principal.
     * 
     */
    private final @Nullable String audience;
    /**
     * @return Object Id of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    private final @Nullable String objectId;
    /**
     * @return Raw certificate data for building certificate expiry flows.
     * 
     */
    private final @Nullable String rawCertData;
    /**
     * @return Tenant Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    private final @Nullable String tenantId;

    @CustomType.Constructor
    private SiteSpnPropertiesResponse(
        @CustomType.Parameter("aadAuthority") @Nullable String aadAuthority,
        @CustomType.Parameter("applicationId") @Nullable String applicationId,
        @CustomType.Parameter("audience") @Nullable String audience,
        @CustomType.Parameter("objectId") @Nullable String objectId,
        @CustomType.Parameter("rawCertData") @Nullable String rawCertData,
        @CustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.aadAuthority = aadAuthority;
        this.applicationId = applicationId;
        this.audience = audience;
        this.objectId = objectId;
        this.rawCertData = rawCertData;
        this.tenantId = tenantId;
    }

    /**
     * @return AAD Authority URL which was used to request the token for the service principal.
     * 
     */
    public Optional<String> aadAuthority() {
        return Optional.ofNullable(this.aadAuthority);
    }
    /**
     * @return Application/client Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }
    /**
     * @return Intended audience for the service principal.
     * 
     */
    public Optional<String> audience() {
        return Optional.ofNullable(this.audience);
    }
    /**
     * @return Object Id of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * @return Raw certificate data for building certificate expiry flows.
     * 
     */
    public Optional<String> rawCertData() {
        return Optional.ofNullable(this.rawCertData);
    }
    /**
     * @return Tenant Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteSpnPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aadAuthority;
        private @Nullable String applicationId;
        private @Nullable String audience;
        private @Nullable String objectId;
        private @Nullable String rawCertData;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteSpnPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAuthority = defaults.aadAuthority;
    	      this.applicationId = defaults.applicationId;
    	      this.audience = defaults.audience;
    	      this.objectId = defaults.objectId;
    	      this.rawCertData = defaults.rawCertData;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder aadAuthority(@Nullable String aadAuthority) {
            this.aadAuthority = aadAuthority;
            return this;
        }
        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder audience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        public Builder rawCertData(@Nullable String rawCertData) {
            this.rawCertData = rawCertData;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }        public SiteSpnPropertiesResponse build() {
            return new SiteSpnPropertiesResponse(aadAuthority, applicationId, audience, objectId, rawCertData, tenantId);
        }
    }
}
