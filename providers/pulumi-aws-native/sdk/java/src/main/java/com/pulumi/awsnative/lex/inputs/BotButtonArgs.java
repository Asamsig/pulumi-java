// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A button to use on a response card used to gather slot values from a user.
 * 
 */
public final class BotButtonArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotButtonArgs Empty = new BotButtonArgs();

    /**
     * The text that appears on the button.
     * 
     */
    @Import(name="text", required=true)
    private Output<String> text;

    /**
     * @return The text that appears on the button.
     * 
     */
    public Output<String> text() {
        return this.text;
    }

    /**
     * The value returned to Amazon Lex when the user chooses this button.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value returned to Amazon Lex when the user chooses this button.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private BotButtonArgs() {}

    private BotButtonArgs(BotButtonArgs $) {
        this.text = $.text;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotButtonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotButtonArgs $;

        public Builder() {
            $ = new BotButtonArgs();
        }

        public Builder(BotButtonArgs defaults) {
            $ = new BotButtonArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param text The text that appears on the button.
         * 
         * @return builder
         * 
         */
        public Builder text(Output<String> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text The text that appears on the button.
         * 
         * @return builder
         * 
         */
        public Builder text(String text) {
            return text(Output.of(text));
        }

        /**
         * @param value The value returned to Amazon Lex when the user chooses this button.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value returned to Amazon Lex when the user chooses this button.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public BotButtonArgs build() {
            $.text = Objects.requireNonNull($.text, "expected parameter 'text' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
