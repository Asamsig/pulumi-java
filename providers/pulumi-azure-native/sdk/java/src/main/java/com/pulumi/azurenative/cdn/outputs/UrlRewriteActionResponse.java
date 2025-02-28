// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.UrlRewriteActionParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UrlRewriteActionResponse {
    /**
     * @return The name of the action for the delivery rule.
     * Expected value is &#39;UrlRewrite&#39;.
     * 
     */
    private final String name;
    /**
     * @return Defines the parameters for the action.
     * 
     */
    private final UrlRewriteActionParametersResponse parameters;

    @CustomType.Constructor
    private UrlRewriteActionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") UrlRewriteActionParametersResponse parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    /**
     * @return The name of the action for the delivery rule.
     * Expected value is &#39;UrlRewrite&#39;.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Defines the parameters for the action.
     * 
     */
    public UrlRewriteActionParametersResponse parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlRewriteActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private UrlRewriteActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlRewriteActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(UrlRewriteActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public UrlRewriteActionResponse build() {
            return new UrlRewriteActionResponse(name, parameters);
        }
    }
}
