// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A private IP address bound to the availability group listener.
 * 
 */
public final class PrivateIPAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateIPAddressArgs Empty = new PrivateIPAddressArgs();

    /**
     * Private IP address bound to the availability group listener.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return Private IP address bound to the availability group listener.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * Subnet used to include private IP.
     * 
     */
    @Import(name="subnetResourceId")
    private @Nullable Output<String> subnetResourceId;

    /**
     * @return Subnet used to include private IP.
     * 
     */
    public Optional<Output<String>> subnetResourceId() {
        return Optional.ofNullable(this.subnetResourceId);
    }

    private PrivateIPAddressArgs() {}

    private PrivateIPAddressArgs(PrivateIPAddressArgs $) {
        this.ipAddress = $.ipAddress;
        this.subnetResourceId = $.subnetResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateIPAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateIPAddressArgs $;

        public Builder() {
            $ = new PrivateIPAddressArgs();
        }

        public Builder(PrivateIPAddressArgs defaults) {
            $ = new PrivateIPAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipAddress Private IP address bound to the availability group listener.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress Private IP address bound to the availability group listener.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param subnetResourceId Subnet used to include private IP.
         * 
         * @return builder
         * 
         */
        public Builder subnetResourceId(@Nullable Output<String> subnetResourceId) {
            $.subnetResourceId = subnetResourceId;
            return this;
        }

        /**
         * @param subnetResourceId Subnet used to include private IP.
         * 
         * @return builder
         * 
         */
        public Builder subnetResourceId(String subnetResourceId) {
            return subnetResourceId(Output.of(subnetResourceId));
        }

        public PrivateIPAddressArgs build() {
            return $;
        }
    }

}
