// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMoveResourceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMoveResourceArgs Empty = new GetMoveResourceArgs();

    /**
     * The Move Collection Name.
     * 
     */
    @Import(name="moveCollectionName", required=true)
    private Output<String> moveCollectionName;

    /**
     * @return The Move Collection Name.
     * 
     */
    public Output<String> moveCollectionName() {
        return this.moveCollectionName;
    }

    /**
     * The Move Resource Name.
     * 
     */
    @Import(name="moveResourceName", required=true)
    private Output<String> moveResourceName;

    /**
     * @return The Move Resource Name.
     * 
     */
    public Output<String> moveResourceName() {
        return this.moveResourceName;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Resource Group Name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetMoveResourceArgs() {}

    private GetMoveResourceArgs(GetMoveResourceArgs $) {
        this.moveCollectionName = $.moveCollectionName;
        this.moveResourceName = $.moveResourceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMoveResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMoveResourceArgs $;

        public Builder() {
            $ = new GetMoveResourceArgs();
        }

        public Builder(GetMoveResourceArgs defaults) {
            $ = new GetMoveResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param moveCollectionName The Move Collection Name.
         * 
         * @return builder
         * 
         */
        public Builder moveCollectionName(Output<String> moveCollectionName) {
            $.moveCollectionName = moveCollectionName;
            return this;
        }

        /**
         * @param moveCollectionName The Move Collection Name.
         * 
         * @return builder
         * 
         */
        public Builder moveCollectionName(String moveCollectionName) {
            return moveCollectionName(Output.of(moveCollectionName));
        }

        /**
         * @param moveResourceName The Move Resource Name.
         * 
         * @return builder
         * 
         */
        public Builder moveResourceName(Output<String> moveResourceName) {
            $.moveResourceName = moveResourceName;
            return this;
        }

        /**
         * @param moveResourceName The Move Resource Name.
         * 
         * @return builder
         * 
         */
        public Builder moveResourceName(String moveResourceName) {
            return moveResourceName(Output.of(moveResourceName));
        }

        /**
         * @param resourceGroupName The Resource Group Name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Resource Group Name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetMoveResourceArgs build() {
            $.moveCollectionName = Objects.requireNonNull($.moveCollectionName, "expected parameter 'moveCollectionName' to be non-null");
            $.moveResourceName = Objects.requireNonNull($.moveResourceName, "expected parameter 'moveResourceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
