// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudLinkArgs Empty = new CloudLinkArgs();

    /**
     * Name of the cloud link resource
     * 
     */
    @Import(name="cloudLinkName")
    private @Nullable Output<String> cloudLinkName;

    /**
     * @return Name of the cloud link resource
     * 
     */
    public Optional<Output<String>> cloudLinkName() {
        return Optional.ofNullable(this.cloudLinkName);
    }

    /**
     * Identifier of the other private cloud participating in the link.
     * 
     */
    @Import(name="linkedCloud")
    private @Nullable Output<String> linkedCloud;

    /**
     * @return Identifier of the other private cloud participating in the link.
     * 
     */
    public Optional<Output<String>> linkedCloud() {
        return Optional.ofNullable(this.linkedCloud);
    }

    /**
     * The name of the private cloud.
     * 
     */
    @Import(name="privateCloudName", required=true)
    private Output<String> privateCloudName;

    /**
     * @return The name of the private cloud.
     * 
     */
    public Output<String> privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private CloudLinkArgs() {}

    private CloudLinkArgs(CloudLinkArgs $) {
        this.cloudLinkName = $.cloudLinkName;
        this.linkedCloud = $.linkedCloud;
        this.privateCloudName = $.privateCloudName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudLinkArgs $;

        public Builder() {
            $ = new CloudLinkArgs();
        }

        public Builder(CloudLinkArgs defaults) {
            $ = new CloudLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudLinkName Name of the cloud link resource
         * 
         * @return builder
         * 
         */
        public Builder cloudLinkName(@Nullable Output<String> cloudLinkName) {
            $.cloudLinkName = cloudLinkName;
            return this;
        }

        /**
         * @param cloudLinkName Name of the cloud link resource
         * 
         * @return builder
         * 
         */
        public Builder cloudLinkName(String cloudLinkName) {
            return cloudLinkName(Output.of(cloudLinkName));
        }

        /**
         * @param linkedCloud Identifier of the other private cloud participating in the link.
         * 
         * @return builder
         * 
         */
        public Builder linkedCloud(@Nullable Output<String> linkedCloud) {
            $.linkedCloud = linkedCloud;
            return this;
        }

        /**
         * @param linkedCloud Identifier of the other private cloud participating in the link.
         * 
         * @return builder
         * 
         */
        public Builder linkedCloud(String linkedCloud) {
            return linkedCloud(Output.of(linkedCloud));
        }

        /**
         * @param privateCloudName The name of the private cloud.
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(Output<String> privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
        }

        /**
         * @param privateCloudName The name of the private cloud.
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(String privateCloudName) {
            return privateCloudName(Output.of(privateCloudName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public CloudLinkArgs build() {
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
