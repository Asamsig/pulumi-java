// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.azurenative.media.outputs.EnabledProtocolsResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NoEncryptionResponse {
    /**
     * @return Representing supported protocols
     * 
     */
    private final @Nullable EnabledProtocolsResponse enabledProtocols;

    @CustomType.Constructor
    private NoEncryptionResponse(@CustomType.Parameter("enabledProtocols") @Nullable EnabledProtocolsResponse enabledProtocols) {
        this.enabledProtocols = enabledProtocols;
    }

    /**
     * @return Representing supported protocols
     * 
     */
    public Optional<EnabledProtocolsResponse> enabledProtocols() {
        return Optional.ofNullable(this.enabledProtocols);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NoEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EnabledProtocolsResponse enabledProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(NoEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledProtocols = defaults.enabledProtocols;
        }

        public Builder enabledProtocols(@Nullable EnabledProtocolsResponse enabledProtocols) {
            this.enabledProtocols = enabledProtocols;
            return this;
        }        public NoEncryptionResponse build() {
            return new NoEncryptionResponse(enabledProtocols);
        }
    }
}
