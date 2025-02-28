// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMultiRegionAccessPointPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMultiRegionAccessPointPlainArgs Empty = new GetMultiRegionAccessPointPlainArgs();

    /**
     * The name you want to assign to this Multi Region Access Point.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name you want to assign to this Multi Region Access Point.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetMultiRegionAccessPointPlainArgs() {}

    private GetMultiRegionAccessPointPlainArgs(GetMultiRegionAccessPointPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMultiRegionAccessPointPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMultiRegionAccessPointPlainArgs $;

        public Builder() {
            $ = new GetMultiRegionAccessPointPlainArgs();
        }

        public Builder(GetMultiRegionAccessPointPlainArgs defaults) {
            $ = new GetMultiRegionAccessPointPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name you want to assign to this Multi Region Access Point.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetMultiRegionAccessPointPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
