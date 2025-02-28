// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.inputs;

import com.pulumi.azurenative.hybridnetwork.inputs.NetworkFunctionUserConfigurationOsProfileArgs;
import com.pulumi.azurenative.hybridnetwork.inputs.NetworkInterfaceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The network function user configuration.
 * 
 */
public final class NetworkFunctionUserConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkFunctionUserConfigurationArgs Empty = new NetworkFunctionUserConfigurationArgs();

    /**
     * The network interface configuration.
     * 
     */
    @Import(name="networkInterfaces")
    private @Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces;

    /**
     * @return The network interface configuration.
     * 
     */
    public Optional<Output<List<NetworkInterfaceArgs>>> networkInterfaces() {
        return Optional.ofNullable(this.networkInterfaces);
    }

    /**
     * Specifies the operating system settings for the role instance.
     * 
     */
    @Import(name="osProfile")
    private @Nullable Output<NetworkFunctionUserConfigurationOsProfileArgs> osProfile;

    /**
     * @return Specifies the operating system settings for the role instance.
     * 
     */
    public Optional<Output<NetworkFunctionUserConfigurationOsProfileArgs>> osProfile() {
        return Optional.ofNullable(this.osProfile);
    }

    /**
     * The name of the network function role.
     * 
     */
    @Import(name="roleName")
    private @Nullable Output<String> roleName;

    /**
     * @return The name of the network function role.
     * 
     */
    public Optional<Output<String>> roleName() {
        return Optional.ofNullable(this.roleName);
    }

    /**
     * The user data parameters from the customer.
     * 
     */
    @Import(name="userDataParameters")
    private @Nullable Output<Object> userDataParameters;

    /**
     * @return The user data parameters from the customer.
     * 
     */
    public Optional<Output<Object>> userDataParameters() {
        return Optional.ofNullable(this.userDataParameters);
    }

    private NetworkFunctionUserConfigurationArgs() {}

    private NetworkFunctionUserConfigurationArgs(NetworkFunctionUserConfigurationArgs $) {
        this.networkInterfaces = $.networkInterfaces;
        this.osProfile = $.osProfile;
        this.roleName = $.roleName;
        this.userDataParameters = $.userDataParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkFunctionUserConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkFunctionUserConfigurationArgs $;

        public Builder() {
            $ = new NetworkFunctionUserConfigurationArgs();
        }

        public Builder(NetworkFunctionUserConfigurationArgs defaults) {
            $ = new NetworkFunctionUserConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkInterfaces The network interface configuration.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(@Nullable Output<List<NetworkInterfaceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        /**
         * @param networkInterfaces The network interface configuration.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(List<NetworkInterfaceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        /**
         * @param networkInterfaces The network interface configuration.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaces(NetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        /**
         * @param osProfile Specifies the operating system settings for the role instance.
         * 
         * @return builder
         * 
         */
        public Builder osProfile(@Nullable Output<NetworkFunctionUserConfigurationOsProfileArgs> osProfile) {
            $.osProfile = osProfile;
            return this;
        }

        /**
         * @param osProfile Specifies the operating system settings for the role instance.
         * 
         * @return builder
         * 
         */
        public Builder osProfile(NetworkFunctionUserConfigurationOsProfileArgs osProfile) {
            return osProfile(Output.of(osProfile));
        }

        /**
         * @param roleName The name of the network function role.
         * 
         * @return builder
         * 
         */
        public Builder roleName(@Nullable Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName The name of the network function role.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        /**
         * @param userDataParameters The user data parameters from the customer.
         * 
         * @return builder
         * 
         */
        public Builder userDataParameters(@Nullable Output<Object> userDataParameters) {
            $.userDataParameters = userDataParameters;
            return this;
        }

        /**
         * @param userDataParameters The user data parameters from the customer.
         * 
         * @return builder
         * 
         */
        public Builder userDataParameters(Object userDataParameters) {
            return userDataParameters(Output.of(userDataParameters));
        }

        public NetworkFunctionUserConfigurationArgs build() {
            return $;
        }
    }

}
