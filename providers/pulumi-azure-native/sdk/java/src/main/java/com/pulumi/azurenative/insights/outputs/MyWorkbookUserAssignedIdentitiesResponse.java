// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MyWorkbookUserAssignedIdentitiesResponse {
    /**
     * @return The principal ID of resource identity.
     * 
     */
    private final String principalId;
    /**
     * @return The tenant ID of resource.
     * 
     */
    private final String tenantId;

    @CustomType.Constructor
    private MyWorkbookUserAssignedIdentitiesResponse(
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId) {
        this.principalId = principalId;
        this.tenantId = tenantId;
    }

    /**
     * @return The principal ID of resource identity.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The tenant ID of resource.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MyWorkbookUserAssignedIdentitiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(MyWorkbookUserAssignedIdentitiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }        public MyWorkbookUserAssignedIdentitiesResponse build() {
            return new MyWorkbookUserAssignedIdentitiesResponse(principalId, tenantId);
        }
    }
}
