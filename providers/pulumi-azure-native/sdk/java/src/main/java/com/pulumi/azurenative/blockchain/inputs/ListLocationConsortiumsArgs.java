// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blockchain.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListLocationConsortiumsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListLocationConsortiumsArgs Empty = new ListLocationConsortiumsArgs();

    /**
     * Location Name.
     * 
     */
    @Import(name="locationName", required=true)
    private Output<String> locationName;

    /**
     * @return Location Name.
     * 
     */
    public Output<String> locationName() {
        return this.locationName;
    }

    private ListLocationConsortiumsArgs() {}

    private ListLocationConsortiumsArgs(ListLocationConsortiumsArgs $) {
        this.locationName = $.locationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListLocationConsortiumsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListLocationConsortiumsArgs $;

        public Builder() {
            $ = new ListLocationConsortiumsArgs();
        }

        public Builder(ListLocationConsortiumsArgs defaults) {
            $ = new ListLocationConsortiumsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param locationName Location Name.
         * 
         * @return builder
         * 
         */
        public Builder locationName(Output<String> locationName) {
            $.locationName = locationName;
            return this;
        }

        /**
         * @param locationName Location Name.
         * 
         * @return builder
         * 
         */
        public Builder locationName(String locationName) {
            return locationName(Output.of(locationName));
        }

        public ListLocationConsortiumsArgs build() {
            $.locationName = Objects.requireNonNull($.locationName, "expected parameter 'locationName' to be non-null");
            return $;
        }
    }

}
