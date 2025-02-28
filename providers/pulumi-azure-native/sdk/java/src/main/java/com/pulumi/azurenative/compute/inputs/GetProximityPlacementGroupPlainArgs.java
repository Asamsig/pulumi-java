// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProximityPlacementGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProximityPlacementGroupPlainArgs Empty = new GetProximityPlacementGroupPlainArgs();

    /**
     * includeColocationStatus=true enables fetching the colocation status of all the resources in the proximity placement group.
     * 
     */
    @Import(name="includeColocationStatus")
    private @Nullable String includeColocationStatus;

    /**
     * @return includeColocationStatus=true enables fetching the colocation status of all the resources in the proximity placement group.
     * 
     */
    public Optional<String> includeColocationStatus() {
        return Optional.ofNullable(this.includeColocationStatus);
    }

    /**
     * The name of the proximity placement group.
     * 
     */
    @Import(name="proximityPlacementGroupName", required=true)
    private String proximityPlacementGroupName;

    /**
     * @return The name of the proximity placement group.
     * 
     */
    public String proximityPlacementGroupName() {
        return this.proximityPlacementGroupName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetProximityPlacementGroupPlainArgs() {}

    private GetProximityPlacementGroupPlainArgs(GetProximityPlacementGroupPlainArgs $) {
        this.includeColocationStatus = $.includeColocationStatus;
        this.proximityPlacementGroupName = $.proximityPlacementGroupName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProximityPlacementGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProximityPlacementGroupPlainArgs $;

        public Builder() {
            $ = new GetProximityPlacementGroupPlainArgs();
        }

        public Builder(GetProximityPlacementGroupPlainArgs defaults) {
            $ = new GetProximityPlacementGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param includeColocationStatus includeColocationStatus=true enables fetching the colocation status of all the resources in the proximity placement group.
         * 
         * @return builder
         * 
         */
        public Builder includeColocationStatus(@Nullable String includeColocationStatus) {
            $.includeColocationStatus = includeColocationStatus;
            return this;
        }

        /**
         * @param proximityPlacementGroupName The name of the proximity placement group.
         * 
         * @return builder
         * 
         */
        public Builder proximityPlacementGroupName(String proximityPlacementGroupName) {
            $.proximityPlacementGroupName = proximityPlacementGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetProximityPlacementGroupPlainArgs build() {
            $.proximityPlacementGroupName = Objects.requireNonNull($.proximityPlacementGroupName, "expected parameter 'proximityPlacementGroupName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
