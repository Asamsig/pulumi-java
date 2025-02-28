// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVolumeContainerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumeContainerPlainArgs Empty = new GetVolumeContainerPlainArgs();

    /**
     * The device name
     * 
     */
    @Import(name="deviceName", required=true)
    private String deviceName;

    /**
     * @return The device name
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }

    /**
     * The manager name
     * 
     */
    @Import(name="managerName", required=true)
    private String managerName;

    /**
     * @return The manager name
     * 
     */
    public String managerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the volume container.
     * 
     */
    @Import(name="volumeContainerName", required=true)
    private String volumeContainerName;

    /**
     * @return The name of the volume container.
     * 
     */
    public String volumeContainerName() {
        return this.volumeContainerName;
    }

    private GetVolumeContainerPlainArgs() {}

    private GetVolumeContainerPlainArgs(GetVolumeContainerPlainArgs $) {
        this.deviceName = $.deviceName;
        this.managerName = $.managerName;
        this.resourceGroupName = $.resourceGroupName;
        this.volumeContainerName = $.volumeContainerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeContainerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeContainerPlainArgs $;

        public Builder() {
            $ = new GetVolumeContainerPlainArgs();
        }

        public Builder(GetVolumeContainerPlainArgs defaults) {
            $ = new GetVolumeContainerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceName The device name
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param managerName The manager name
         * 
         * @return builder
         * 
         */
        public Builder managerName(String managerName) {
            $.managerName = managerName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param volumeContainerName The name of the volume container.
         * 
         * @return builder
         * 
         */
        public Builder volumeContainerName(String volumeContainerName) {
            $.volumeContainerName = volumeContainerName;
            return this;
        }

        public GetVolumeContainerPlainArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            $.managerName = Objects.requireNonNull($.managerName, "expected parameter 'managerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.volumeContainerName = Objects.requireNonNull($.volumeContainerName, "expected parameter 'volumeContainerName' to be non-null");
            return $;
        }
    }

}
