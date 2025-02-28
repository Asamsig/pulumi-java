// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPacketCoreControlPlanePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPacketCoreControlPlanePlainArgs Empty = new GetPacketCoreControlPlanePlainArgs();

    /**
     * The name of the packet core control plane.
     * 
     */
    @Import(name="packetCoreControlPlaneName", required=true)
    private String packetCoreControlPlaneName;

    /**
     * @return The name of the packet core control plane.
     * 
     */
    public String packetCoreControlPlaneName() {
        return this.packetCoreControlPlaneName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPacketCoreControlPlanePlainArgs() {}

    private GetPacketCoreControlPlanePlainArgs(GetPacketCoreControlPlanePlainArgs $) {
        this.packetCoreControlPlaneName = $.packetCoreControlPlaneName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPacketCoreControlPlanePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPacketCoreControlPlanePlainArgs $;

        public Builder() {
            $ = new GetPacketCoreControlPlanePlainArgs();
        }

        public Builder(GetPacketCoreControlPlanePlainArgs defaults) {
            $ = new GetPacketCoreControlPlanePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param packetCoreControlPlaneName The name of the packet core control plane.
         * 
         * @return builder
         * 
         */
        public Builder packetCoreControlPlaneName(String packetCoreControlPlaneName) {
            $.packetCoreControlPlaneName = packetCoreControlPlaneName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPacketCoreControlPlanePlainArgs build() {
            $.packetCoreControlPlaneName = Objects.requireNonNull($.packetCoreControlPlaneName, "expected parameter 'packetCoreControlPlaneName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
