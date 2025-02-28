// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGlobalUserOperationStatusPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalUserOperationStatusPlainArgs Empty = new GetGlobalUserOperationStatusPlainArgs();

    /**
     * The operation url of long running operation
     * 
     */
    @Import(name="operationUrl", required=true)
    private String operationUrl;

    /**
     * @return The operation url of long running operation
     * 
     */
    public String operationUrl() {
        return this.operationUrl;
    }

    /**
     * The name of the user.
     * 
     */
    @Import(name="userName", required=true)
    private String userName;

    /**
     * @return The name of the user.
     * 
     */
    public String userName() {
        return this.userName;
    }

    private GetGlobalUserOperationStatusPlainArgs() {}

    private GetGlobalUserOperationStatusPlainArgs(GetGlobalUserOperationStatusPlainArgs $) {
        this.operationUrl = $.operationUrl;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalUserOperationStatusPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalUserOperationStatusPlainArgs $;

        public Builder() {
            $ = new GetGlobalUserOperationStatusPlainArgs();
        }

        public Builder(GetGlobalUserOperationStatusPlainArgs defaults) {
            $ = new GetGlobalUserOperationStatusPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operationUrl The operation url of long running operation
         * 
         * @return builder
         * 
         */
        public Builder operationUrl(String operationUrl) {
            $.operationUrl = operationUrl;
            return this;
        }

        /**
         * @param userName The name of the user.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            $.userName = userName;
            return this;
        }

        public GetGlobalUserOperationStatusPlainArgs build() {
            $.operationUrl = Objects.requireNonNull($.operationUrl, "expected parameter 'operationUrl' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
