// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.certificateregistration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAppServiceCertificateOrderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppServiceCertificateOrderArgs Empty = new GetAppServiceCertificateOrderArgs();

    /**
     * Name of the certificate order..
     * 
     */
    @Import(name="certificateOrderName", required=true)
    private Output<String> certificateOrderName;

    /**
     * @return Name of the certificate order..
     * 
     */
    public Output<String> certificateOrderName() {
        return this.certificateOrderName;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAppServiceCertificateOrderArgs() {}

    private GetAppServiceCertificateOrderArgs(GetAppServiceCertificateOrderArgs $) {
        this.certificateOrderName = $.certificateOrderName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppServiceCertificateOrderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppServiceCertificateOrderArgs $;

        public Builder() {
            $ = new GetAppServiceCertificateOrderArgs();
        }

        public Builder(GetAppServiceCertificateOrderArgs defaults) {
            $ = new GetAppServiceCertificateOrderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateOrderName Name of the certificate order..
         * 
         * @return builder
         * 
         */
        public Builder certificateOrderName(Output<String> certificateOrderName) {
            $.certificateOrderName = certificateOrderName;
            return this;
        }

        /**
         * @param certificateOrderName Name of the certificate order..
         * 
         * @return builder
         * 
         */
        public Builder certificateOrderName(String certificateOrderName) {
            return certificateOrderName(Output.of(certificateOrderName));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetAppServiceCertificateOrderArgs build() {
            $.certificateOrderName = Objects.requireNonNull($.certificateOrderName, "expected parameter 'certificateOrderName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
