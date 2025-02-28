// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisPortRange;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInsightsAnalysisAnalysisPacketHeader {
    private final @Nullable List<String> destinationAddresses;
    private final @Nullable List<NetworkInsightsAnalysisPortRange> destinationPortRanges;
    private final @Nullable String protocol;
    private final @Nullable List<String> sourceAddresses;
    private final @Nullable List<NetworkInsightsAnalysisPortRange> sourcePortRanges;

    @CustomType.Constructor
    private NetworkInsightsAnalysisAnalysisPacketHeader(
        @CustomType.Parameter("destinationAddresses") @Nullable List<String> destinationAddresses,
        @CustomType.Parameter("destinationPortRanges") @Nullable List<NetworkInsightsAnalysisPortRange> destinationPortRanges,
        @CustomType.Parameter("protocol") @Nullable String protocol,
        @CustomType.Parameter("sourceAddresses") @Nullable List<String> sourceAddresses,
        @CustomType.Parameter("sourcePortRanges") @Nullable List<NetworkInsightsAnalysisPortRange> sourcePortRanges) {
        this.destinationAddresses = destinationAddresses;
        this.destinationPortRanges = destinationPortRanges;
        this.protocol = protocol;
        this.sourceAddresses = sourceAddresses;
        this.sourcePortRanges = sourcePortRanges;
    }

    public List<String> destinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }
    public List<NetworkInsightsAnalysisPortRange> destinationPortRanges() {
        return this.destinationPortRanges == null ? List.of() : this.destinationPortRanges;
    }
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    public List<String> sourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }
    public List<NetworkInsightsAnalysisPortRange> sourcePortRanges() {
        return this.sourcePortRanges == null ? List.of() : this.sourcePortRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisAnalysisPacketHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<NetworkInsightsAnalysisPortRange> destinationPortRanges;
        private @Nullable String protocol;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<NetworkInsightsAnalysisPortRange> sourcePortRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisAnalysisPacketHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.protocol = defaults.protocol;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
        }

        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }
        public Builder destinationPortRanges(@Nullable List<NetworkInsightsAnalysisPortRange> destinationPortRanges) {
            this.destinationPortRanges = destinationPortRanges;
            return this;
        }
        public Builder destinationPortRanges(NetworkInsightsAnalysisPortRange... destinationPortRanges) {
            return destinationPortRanges(List.of(destinationPortRanges));
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }
        public Builder sourcePortRanges(@Nullable List<NetworkInsightsAnalysisPortRange> sourcePortRanges) {
            this.sourcePortRanges = sourcePortRanges;
            return this;
        }
        public Builder sourcePortRanges(NetworkInsightsAnalysisPortRange... sourcePortRanges) {
            return sourcePortRanges(List.of(sourcePortRanges));
        }        public NetworkInsightsAnalysisAnalysisPacketHeader build() {
            return new NetworkInsightsAnalysisAnalysisPacketHeader(destinationAddresses, destinationPortRanges, protocol, sourceAddresses, sourcePortRanges);
        }
    }
}
