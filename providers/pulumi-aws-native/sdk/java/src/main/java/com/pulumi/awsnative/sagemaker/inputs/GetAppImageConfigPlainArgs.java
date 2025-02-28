// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAppImageConfigPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppImageConfigPlainArgs Empty = new GetAppImageConfigPlainArgs();

    /**
     * The Name of the AppImageConfig.
     * 
     */
    @Import(name="appImageConfigName", required=true)
    private String appImageConfigName;

    /**
     * @return The Name of the AppImageConfig.
     * 
     */
    public String appImageConfigName() {
        return this.appImageConfigName;
    }

    private GetAppImageConfigPlainArgs() {}

    private GetAppImageConfigPlainArgs(GetAppImageConfigPlainArgs $) {
        this.appImageConfigName = $.appImageConfigName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppImageConfigPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppImageConfigPlainArgs $;

        public Builder() {
            $ = new GetAppImageConfigPlainArgs();
        }

        public Builder(GetAppImageConfigPlainArgs defaults) {
            $ = new GetAppImageConfigPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appImageConfigName The Name of the AppImageConfig.
         * 
         * @return builder
         * 
         */
        public Builder appImageConfigName(String appImageConfigName) {
            $.appImageConfigName = appImageConfigName;
            return this;
        }

        public GetAppImageConfigPlainArgs build() {
            $.appImageConfigName = Objects.requireNonNull($.appImageConfigName, "expected parameter 'appImageConfigName' to be non-null");
            return $;
        }
    }

}
