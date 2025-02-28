// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMultiRegionAccessPointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMultiRegionAccessPointArgs Empty = new GetMultiRegionAccessPointArgs();

    /**
     * The name you want to assign to this Multi Region Access Point.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name you want to assign to this Multi Region Access Point.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetMultiRegionAccessPointArgs() {}

    private GetMultiRegionAccessPointArgs(GetMultiRegionAccessPointArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMultiRegionAccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMultiRegionAccessPointArgs $;

        public Builder() {
            $ = new GetMultiRegionAccessPointArgs();
        }

        public Builder(GetMultiRegionAccessPointArgs defaults) {
            $ = new GetMultiRegionAccessPointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name you want to assign to this Multi Region Access Point.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name you want to assign to this Multi Region Access Point.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetMultiRegionAccessPointArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
