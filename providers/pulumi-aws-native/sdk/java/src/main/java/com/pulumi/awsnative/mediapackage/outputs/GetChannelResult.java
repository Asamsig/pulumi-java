// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.outputs;

import com.pulumi.awsnative.mediapackage.outputs.ChannelHlsIngest;
import com.pulumi.awsnative.mediapackage.outputs.ChannelLogConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetChannelResult {
    /**
     * @return The Amazon Resource Name (ARN) assigned to the Channel.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return A short text description of the Channel.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The configuration parameters for egress access logging.
     * 
     */
    private final @Nullable ChannelLogConfiguration egressAccessLogs;
    /**
     * @return A short text description of the Channel.
     * 
     */
    private final @Nullable ChannelHlsIngest hlsIngest;
    /**
     * @return The configuration parameters for egress access logging.
     * 
     */
    private final @Nullable ChannelLogConfiguration ingressAccessLogs;

    @CustomType.Constructor
    private GetChannelResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("egressAccessLogs") @Nullable ChannelLogConfiguration egressAccessLogs,
        @CustomType.Parameter("hlsIngest") @Nullable ChannelHlsIngest hlsIngest,
        @CustomType.Parameter("ingressAccessLogs") @Nullable ChannelLogConfiguration ingressAccessLogs) {
        this.arn = arn;
        this.description = description;
        this.egressAccessLogs = egressAccessLogs;
        this.hlsIngest = hlsIngest;
        this.ingressAccessLogs = ingressAccessLogs;
    }

    /**
     * @return The Amazon Resource Name (ARN) assigned to the Channel.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return A short text description of the Channel.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The configuration parameters for egress access logging.
     * 
     */
    public Optional<ChannelLogConfiguration> egressAccessLogs() {
        return Optional.ofNullable(this.egressAccessLogs);
    }
    /**
     * @return A short text description of the Channel.
     * 
     */
    public Optional<ChannelHlsIngest> hlsIngest() {
        return Optional.ofNullable(this.hlsIngest);
    }
    /**
     * @return The configuration parameters for egress access logging.
     * 
     */
    public Optional<ChannelLogConfiguration> ingressAccessLogs() {
        return Optional.ofNullable(this.ingressAccessLogs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChannelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable ChannelLogConfiguration egressAccessLogs;
        private @Nullable ChannelHlsIngest hlsIngest;
        private @Nullable ChannelLogConfiguration ingressAccessLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.egressAccessLogs = defaults.egressAccessLogs;
    	      this.hlsIngest = defaults.hlsIngest;
    	      this.ingressAccessLogs = defaults.ingressAccessLogs;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder egressAccessLogs(@Nullable ChannelLogConfiguration egressAccessLogs) {
            this.egressAccessLogs = egressAccessLogs;
            return this;
        }
        public Builder hlsIngest(@Nullable ChannelHlsIngest hlsIngest) {
            this.hlsIngest = hlsIngest;
            return this;
        }
        public Builder ingressAccessLogs(@Nullable ChannelLogConfiguration ingressAccessLogs) {
            this.ingressAccessLogs = ingressAccessLogs;
            return this;
        }        public GetChannelResult build() {
            return new GetChannelResult(arn, description, egressAccessLogs, hlsIngest, ingressAccessLogs);
        }
    }
}
