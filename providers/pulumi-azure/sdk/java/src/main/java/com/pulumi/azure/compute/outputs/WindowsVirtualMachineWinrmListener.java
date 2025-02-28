// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsVirtualMachineWinrmListener {
    /**
     * @return The Secret URL of a Key Vault Certificate, which must be specified when `protocol` is set to `Https`.
     * 
     */
    private final @Nullable String certificateUrl;
    private final String protocol;

    @CustomType.Constructor
    private WindowsVirtualMachineWinrmListener(
        @CustomType.Parameter("certificateUrl") @Nullable String certificateUrl,
        @CustomType.Parameter("protocol") String protocol) {
        this.certificateUrl = certificateUrl;
        this.protocol = protocol;
    }

    /**
     * @return The Secret URL of a Key Vault Certificate, which must be specified when `protocol` is set to `Https`.
     * 
     */
    public Optional<String> certificateUrl() {
        return Optional.ofNullable(this.certificateUrl);
    }
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsVirtualMachineWinrmListener defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateUrl;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsVirtualMachineWinrmListener defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateUrl = defaults.certificateUrl;
    	      this.protocol = defaults.protocol;
        }

        public Builder certificateUrl(@Nullable String certificateUrl) {
            this.certificateUrl = certificateUrl;
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }        public WindowsVirtualMachineWinrmListener build() {
            return new WindowsVirtualMachineWinrmListener(certificateUrl, protocol);
        }
    }
}
