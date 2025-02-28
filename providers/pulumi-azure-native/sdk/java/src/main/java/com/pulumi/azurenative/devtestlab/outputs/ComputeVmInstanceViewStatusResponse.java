// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ComputeVmInstanceViewStatusResponse {
    /**
     * @return Gets the status Code.
     * 
     */
    private final @Nullable String code;
    /**
     * @return Gets the short localizable label for the status.
     * 
     */
    private final @Nullable String displayStatus;
    /**
     * @return Gets the message associated with the status.
     * 
     */
    private final @Nullable String message;

    @CustomType.Constructor
    private ComputeVmInstanceViewStatusResponse(
        @CustomType.Parameter("code") @Nullable String code,
        @CustomType.Parameter("displayStatus") @Nullable String displayStatus,
        @CustomType.Parameter("message") @Nullable String message) {
        this.code = code;
        this.displayStatus = displayStatus;
        this.message = message;
    }

    /**
     * @return Gets the status Code.
     * 
     */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }
    /**
     * @return Gets the short localizable label for the status.
     * 
     */
    public Optional<String> displayStatus() {
        return Optional.ofNullable(this.displayStatus);
    }
    /**
     * @return Gets the message associated with the status.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeVmInstanceViewStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String displayStatus;
        private @Nullable String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeVmInstanceViewStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.displayStatus = defaults.displayStatus;
    	      this.message = defaults.message;
        }

        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }
        public Builder displayStatus(@Nullable String displayStatus) {
            this.displayStatus = displayStatus;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }        public ComputeVmInstanceViewStatusResponse build() {
            return new ComputeVmInstanceViewStatusResponse(code, displayStatus, message);
        }
    }
}
