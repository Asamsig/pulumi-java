// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BotSampleValue {
    /**
     * @return The value that can be used for a slot type.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private BotSampleValue(@CustomType.Parameter("value") String value) {
        this.value = value;
    }

    /**
     * @return The value that can be used for a slot type.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSampleValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSampleValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public BotSampleValue build() {
            return new BotSampleValue(value);
        }
    }
}
