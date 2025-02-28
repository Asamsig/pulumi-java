// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3objectlambda.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPointPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessPointPlainArgs Empty = new GetAccessPointPlainArgs();

    /**
     * The name you want to assign to this Object lambda Access Point.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name you want to assign to this Object lambda Access Point.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetAccessPointPlainArgs() {}

    private GetAccessPointPlainArgs(GetAccessPointPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessPointPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessPointPlainArgs $;

        public Builder() {
            $ = new GetAccessPointPlainArgs();
        }

        public Builder(GetAccessPointPlainArgs defaults) {
            $ = new GetAccessPointPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name you want to assign to this Object lambda Access Point.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetAccessPointPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
