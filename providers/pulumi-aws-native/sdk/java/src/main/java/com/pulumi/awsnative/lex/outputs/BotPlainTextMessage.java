// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BotPlainTextMessage {
    /**
     * @return The message to send to the user.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private BotPlainTextMessage(@CustomType.Parameter("value") String value) {
        this.value = value;
    }

    /**
     * @return The message to send to the user.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotPlainTextMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(BotPlainTextMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public BotPlainTextMessage build() {
            return new BotPlainTextMessage(value);
        }
    }
}
