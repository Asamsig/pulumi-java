// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVolumePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumePlainArgs Empty = new GetVolumePlainArgs();

    /**
     * The name of the NetApp account
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the NetApp account
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the capacity pool
     * 
     */
    @Import(name="poolName", required=true)
    private String poolName;

    /**
     * @return The name of the capacity pool
     * 
     */
    public String poolName() {
        return this.poolName;
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

    /**
     * The name of the volume
     * 
     */
    @Import(name="volumeName", required=true)
    private String volumeName;

    /**
     * @return The name of the volume
     * 
     */
    public String volumeName() {
        return this.volumeName;
    }

    private GetVolumePlainArgs() {}

    private GetVolumePlainArgs(GetVolumePlainArgs $) {
        this.accountName = $.accountName;
        this.poolName = $.poolName;
        this.resourceGroupName = $.resourceGroupName;
        this.volumeName = $.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumePlainArgs $;

        public Builder() {
            $ = new GetVolumePlainArgs();
        }

        public Builder(GetVolumePlainArgs defaults) {
            $ = new GetVolumePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the NetApp account
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param poolName The name of the capacity pool
         * 
         * @return builder
         * 
         */
        public Builder poolName(String poolName) {
            $.poolName = poolName;
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

        /**
         * @param volumeName The name of the volume
         * 
         * @return builder
         * 
         */
        public Builder volumeName(String volumeName) {
            $.volumeName = volumeName;
            return this;
        }

        public GetVolumePlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.poolName = Objects.requireNonNull($.poolName, "expected parameter 'poolName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.volumeName = Objects.requireNonNull($.volumeName, "expected parameter 'volumeName' to be non-null");
            return $;
        }
    }

}
