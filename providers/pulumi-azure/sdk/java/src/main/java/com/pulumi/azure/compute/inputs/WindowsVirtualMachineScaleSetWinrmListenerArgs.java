// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsVirtualMachineScaleSetWinrmListenerArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsVirtualMachineScaleSetWinrmListenerArgs Empty = new WindowsVirtualMachineScaleSetWinrmListenerArgs();

    /**
     * The Secret URL of a Key Vault Certificate, which must be specified when `protocol` is set to `Https`.
     * 
     */
    @Import(name="certificateUrl")
    private @Nullable Output<String> certificateUrl;

    /**
     * @return The Secret URL of a Key Vault Certificate, which must be specified when `protocol` is set to `Https`.
     * 
     */
    public Optional<Output<String>> certificateUrl() {
        return Optional.ofNullable(this.certificateUrl);
    }

    /**
     * The Protocol of the WinRM Listener. Possible values are `Http` and `Https`.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The Protocol of the WinRM Listener. Possible values are `Http` and `Https`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    private WindowsVirtualMachineScaleSetWinrmListenerArgs() {}

    private WindowsVirtualMachineScaleSetWinrmListenerArgs(WindowsVirtualMachineScaleSetWinrmListenerArgs $) {
        this.certificateUrl = $.certificateUrl;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsVirtualMachineScaleSetWinrmListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsVirtualMachineScaleSetWinrmListenerArgs $;

        public Builder() {
            $ = new WindowsVirtualMachineScaleSetWinrmListenerArgs();
        }

        public Builder(WindowsVirtualMachineScaleSetWinrmListenerArgs defaults) {
            $ = new WindowsVirtualMachineScaleSetWinrmListenerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateUrl The Secret URL of a Key Vault Certificate, which must be specified when `protocol` is set to `Https`.
         * 
         * @return builder
         * 
         */
        public Builder certificateUrl(@Nullable Output<String> certificateUrl) {
            $.certificateUrl = certificateUrl;
            return this;
        }

        /**
         * @param certificateUrl The Secret URL of a Key Vault Certificate, which must be specified when `protocol` is set to `Https`.
         * 
         * @return builder
         * 
         */
        public Builder certificateUrl(String certificateUrl) {
            return certificateUrl(Output.of(certificateUrl));
        }

        /**
         * @param protocol The Protocol of the WinRM Listener. Possible values are `Http` and `Https`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The Protocol of the WinRM Listener. Possible values are `Http` and `Https`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public WindowsVirtualMachineScaleSetWinrmListenerArgs build() {
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
