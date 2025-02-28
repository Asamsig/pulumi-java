// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.awsnative.datasync.enums.LocationHDFSQopConfigurationDataTransferProtection;
import com.pulumi.awsnative.datasync.enums.LocationHDFSQopConfigurationRpcProtection;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration information for RPC Protection and Data Transfer Protection. These parameters can be set to AUTHENTICATION, INTEGRITY, or PRIVACY. The default value is PRIVACY.
 * 
 */
public final class LocationHDFSQopConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocationHDFSQopConfigurationArgs Empty = new LocationHDFSQopConfigurationArgs();

    /**
     * Configuration for Data Transfer Protection.
     * 
     */
    @Import(name="dataTransferProtection")
    private @Nullable Output<LocationHDFSQopConfigurationDataTransferProtection> dataTransferProtection;

    /**
     * @return Configuration for Data Transfer Protection.
     * 
     */
    public Optional<Output<LocationHDFSQopConfigurationDataTransferProtection>> dataTransferProtection() {
        return Optional.ofNullable(this.dataTransferProtection);
    }

    /**
     * Configuration for RPC Protection.
     * 
     */
    @Import(name="rpcProtection")
    private @Nullable Output<LocationHDFSQopConfigurationRpcProtection> rpcProtection;

    /**
     * @return Configuration for RPC Protection.
     * 
     */
    public Optional<Output<LocationHDFSQopConfigurationRpcProtection>> rpcProtection() {
        return Optional.ofNullable(this.rpcProtection);
    }

    private LocationHDFSQopConfigurationArgs() {}

    private LocationHDFSQopConfigurationArgs(LocationHDFSQopConfigurationArgs $) {
        this.dataTransferProtection = $.dataTransferProtection;
        this.rpcProtection = $.rpcProtection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationHDFSQopConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationHDFSQopConfigurationArgs $;

        public Builder() {
            $ = new LocationHDFSQopConfigurationArgs();
        }

        public Builder(LocationHDFSQopConfigurationArgs defaults) {
            $ = new LocationHDFSQopConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataTransferProtection Configuration for Data Transfer Protection.
         * 
         * @return builder
         * 
         */
        public Builder dataTransferProtection(@Nullable Output<LocationHDFSQopConfigurationDataTransferProtection> dataTransferProtection) {
            $.dataTransferProtection = dataTransferProtection;
            return this;
        }

        /**
         * @param dataTransferProtection Configuration for Data Transfer Protection.
         * 
         * @return builder
         * 
         */
        public Builder dataTransferProtection(LocationHDFSQopConfigurationDataTransferProtection dataTransferProtection) {
            return dataTransferProtection(Output.of(dataTransferProtection));
        }

        /**
         * @param rpcProtection Configuration for RPC Protection.
         * 
         * @return builder
         * 
         */
        public Builder rpcProtection(@Nullable Output<LocationHDFSQopConfigurationRpcProtection> rpcProtection) {
            $.rpcProtection = rpcProtection;
            return this;
        }

        /**
         * @param rpcProtection Configuration for RPC Protection.
         * 
         * @return builder
         * 
         */
        public Builder rpcProtection(LocationHDFSQopConfigurationRpcProtection rpcProtection) {
            return rpcProtection(Output.of(rpcProtection));
        }

        public LocationHDFSQopConfigurationArgs build() {
            return $;
        }
    }

}
