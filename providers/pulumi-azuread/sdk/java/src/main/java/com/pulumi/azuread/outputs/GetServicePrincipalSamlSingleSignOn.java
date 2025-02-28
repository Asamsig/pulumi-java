// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServicePrincipalSamlSingleSignOn {
    /**
     * @return The relative URI the service provider would redirect to after completion of the single sign-on flow.
     * 
     */
    private final String relayState;

    @CustomType.Constructor
    private GetServicePrincipalSamlSingleSignOn(@CustomType.Parameter("relayState") String relayState) {
        this.relayState = relayState;
    }

    /**
     * @return The relative URI the service provider would redirect to after completion of the single sign-on flow.
     * 
     */
    public String relayState() {
        return this.relayState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServicePrincipalSamlSingleSignOn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String relayState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServicePrincipalSamlSingleSignOn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.relayState = defaults.relayState;
        }

        public Builder relayState(String relayState) {
            this.relayState = Objects.requireNonNull(relayState);
            return this;
        }        public GetServicePrincipalSamlSingleSignOn build() {
            return new GetServicePrincipalSamlSingleSignOn(relayState);
        }
    }
}
