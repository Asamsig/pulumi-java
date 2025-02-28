// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Reference to an Attached Data Network resource.
 * 
 */
public final class AttachedDataNetworkResourceIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttachedDataNetworkResourceIdArgs Empty = new AttachedDataNetworkResourceIdArgs();

    /**
     * Attached Data Network resource ID.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Attached Data Network resource ID.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private AttachedDataNetworkResourceIdArgs() {}

    private AttachedDataNetworkResourceIdArgs(AttachedDataNetworkResourceIdArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttachedDataNetworkResourceIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttachedDataNetworkResourceIdArgs $;

        public Builder() {
            $ = new AttachedDataNetworkResourceIdArgs();
        }

        public Builder(AttachedDataNetworkResourceIdArgs defaults) {
            $ = new AttachedDataNetworkResourceIdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Attached Data Network resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Attached Data Network resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public AttachedDataNetworkResourceIdArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
