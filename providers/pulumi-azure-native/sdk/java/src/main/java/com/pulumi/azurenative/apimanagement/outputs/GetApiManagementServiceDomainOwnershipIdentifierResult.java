// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApiManagementServiceDomainOwnershipIdentifierResult {
    /**
     * @return The domain ownership identifier value.
     * 
     */
    private final String domainOwnershipIdentifier;

    @CustomType.Constructor
    private GetApiManagementServiceDomainOwnershipIdentifierResult(@CustomType.Parameter("domainOwnershipIdentifier") String domainOwnershipIdentifier) {
        this.domainOwnershipIdentifier = domainOwnershipIdentifier;
    }

    /**
     * @return The domain ownership identifier value.
     * 
     */
    public String domainOwnershipIdentifier() {
        return this.domainOwnershipIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiManagementServiceDomainOwnershipIdentifierResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainOwnershipIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiManagementServiceDomainOwnershipIdentifierResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainOwnershipIdentifier = defaults.domainOwnershipIdentifier;
        }

        public Builder domainOwnershipIdentifier(String domainOwnershipIdentifier) {
            this.domainOwnershipIdentifier = Objects.requireNonNull(domainOwnershipIdentifier);
            return this;
        }        public GetApiManagementServiceDomainOwnershipIdentifierResult build() {
            return new GetApiManagementServiceDomainOwnershipIdentifierResult(domainOwnershipIdentifier);
        }
    }
}
