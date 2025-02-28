// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.UrlSigningActionParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UrlSigningActionResponse {
    /**
     * @return The name of the action for the delivery rule.
     * Expected value is &#39;UrlSigning&#39;.
     * 
     */
    private final String name;
    /**
     * @return Defines the parameters for the action.
     * 
     */
    private final UrlSigningActionParametersResponse parameters;

    @CustomType.Constructor
    private UrlSigningActionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") UrlSigningActionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * @return The name of the action for the delivery rule.
     * Expected value is &#39;UrlSigning&#39;.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Defines the parameters for the action.
     * 
     */
    public UrlSigningActionParametersResponse parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private UrlSigningActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(UrlSigningActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public UrlSigningActionResponse build() {
            return new UrlSigningActionResponse(name, parameters);
        }
    }
}
