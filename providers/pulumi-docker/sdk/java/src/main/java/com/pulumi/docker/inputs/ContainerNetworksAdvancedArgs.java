// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerNetworksAdvancedArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerNetworksAdvancedArgs Empty = new ContainerNetworksAdvancedArgs();

    /**
     * The network aliases of the container in the specific network.
     * 
     */
    @Import(name="aliases")
    private @Nullable Output<List<String>> aliases;

    /**
     * @return The network aliases of the container in the specific network.
     * 
     */
    public Optional<Output<List<String>>> aliases() {
        return Optional.ofNullable(this.aliases);
    }

    /**
     * The IPV4 address of the container in the specific network.
     * 
     */
    @Import(name="ipv4Address")
    private @Nullable Output<String> ipv4Address;

    /**
     * @return The IPV4 address of the container in the specific network.
     * 
     */
    public Optional<Output<String>> ipv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }

    /**
     * The IPV6 address of the container in the specific network.
     * 
     */
    @Import(name="ipv6Address")
    private @Nullable Output<String> ipv6Address;

    /**
     * @return The IPV6 address of the container in the specific network.
     * 
     */
    public Optional<Output<String>> ipv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }

    /**
     * The name of the network.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the network.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private ContainerNetworksAdvancedArgs() {}

    private ContainerNetworksAdvancedArgs(ContainerNetworksAdvancedArgs $) {
        this.aliases = $.aliases;
        this.ipv4Address = $.ipv4Address;
        this.ipv6Address = $.ipv6Address;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerNetworksAdvancedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerNetworksAdvancedArgs $;

        public Builder() {
            $ = new ContainerNetworksAdvancedArgs();
        }

        public Builder(ContainerNetworksAdvancedArgs defaults) {
            $ = new ContainerNetworksAdvancedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliases The network aliases of the container in the specific network.
         * 
         * @return builder
         * 
         */
        public Builder aliases(@Nullable Output<List<String>> aliases) {
            $.aliases = aliases;
            return this;
        }

        /**
         * @param aliases The network aliases of the container in the specific network.
         * 
         * @return builder
         * 
         */
        public Builder aliases(List<String> aliases) {
            return aliases(Output.of(aliases));
        }

        /**
         * @param aliases The network aliases of the container in the specific network.
         * 
         * @return builder
         * 
         */
        public Builder aliases(String... aliases) {
            return aliases(List.of(aliases));
        }

        /**
         * @param ipv4Address The IPV4 address of the container in the specific network.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(@Nullable Output<String> ipv4Address) {
            $.ipv4Address = ipv4Address;
            return this;
        }

        /**
         * @param ipv4Address The IPV4 address of the container in the specific network.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(String ipv4Address) {
            return ipv4Address(Output.of(ipv4Address));
        }

        /**
         * @param ipv6Address The IPV6 address of the container in the specific network.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(@Nullable Output<String> ipv6Address) {
            $.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * @param ipv6Address The IPV6 address of the container in the specific network.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(String ipv6Address) {
            return ipv6Address(Output.of(ipv6Address));
        }

        /**
         * @param name The name of the network.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the network.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ContainerNetworksAdvancedArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
