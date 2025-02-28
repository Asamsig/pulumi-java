// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Logging Category
 * 
 */
public final class LoggingCategoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingCategoryArgs Empty = new LoggingCategoryArgs();

    /**
     * The name of the logging category.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the logging category.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private LoggingCategoryArgs() {}

    private LoggingCategoryArgs(LoggingCategoryArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingCategoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingCategoryArgs $;

        public Builder() {
            $ = new LoggingCategoryArgs();
        }

        public Builder(LoggingCategoryArgs defaults) {
            $ = new LoggingCategoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the logging category.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the logging category.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public LoggingCategoryArgs build() {
            return $;
        }
    }

}
