// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMulticastGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMulticastGroupArgs Empty = new GetMulticastGroupArgs();

    /**
     * Multicast group id. Returned after successful create.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Multicast group id. Returned after successful create.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetMulticastGroupArgs() {}

    private GetMulticastGroupArgs(GetMulticastGroupArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMulticastGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMulticastGroupArgs $;

        public Builder() {
            $ = new GetMulticastGroupArgs();
        }

        public Builder(GetMulticastGroupArgs defaults) {
            $ = new GetMulticastGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Multicast group id. Returned after successful create.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Multicast group id. Returned after successful create.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetMulticastGroupArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
