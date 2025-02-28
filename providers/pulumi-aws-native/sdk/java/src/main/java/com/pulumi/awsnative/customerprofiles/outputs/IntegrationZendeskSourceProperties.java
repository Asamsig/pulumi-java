// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.customerprofiles.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IntegrationZendeskSourceProperties {
    private final String object;

    @CustomType.Constructor
    private IntegrationZendeskSourceProperties(@CustomType.Parameter("object") String object) {
        this.object = object;
    }

    public String object() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationZendeskSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationZendeskSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }        public IntegrationZendeskSourceProperties build() {
            return new IntegrationZendeskSourceProperties(object);
        }
    }
}
