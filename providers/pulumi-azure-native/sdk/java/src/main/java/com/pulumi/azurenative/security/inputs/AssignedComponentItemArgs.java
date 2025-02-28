// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * describe the properties of a security assessment object reference (by key)
 * 
 */
public final class AssignedComponentItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssignedComponentItemArgs Empty = new AssignedComponentItemArgs();

    /**
     * unique key to a security assessment object
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return unique key to a security assessment object
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    private AssignedComponentItemArgs() {}

    private AssignedComponentItemArgs(AssignedComponentItemArgs $) {
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssignedComponentItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssignedComponentItemArgs $;

        public Builder() {
            $ = new AssignedComponentItemArgs();
        }

        public Builder(AssignedComponentItemArgs defaults) {
            $ = new AssignedComponentItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key unique key to a security assessment object
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key unique key to a security assessment object
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public AssignedComponentItemArgs build() {
            return $;
        }
    }

}
