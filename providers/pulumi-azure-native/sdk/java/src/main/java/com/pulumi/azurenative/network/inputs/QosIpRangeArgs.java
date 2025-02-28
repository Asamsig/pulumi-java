// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Qos Traffic Profiler IP Range properties.
 * 
 */
public final class QosIpRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final QosIpRangeArgs Empty = new QosIpRangeArgs();

    /**
     * End IP Address.
     * 
     */
    @Import(name="endIP")
    private @Nullable Output<String> endIP;

    /**
     * @return End IP Address.
     * 
     */
    public Optional<Output<String>> endIP() {
        return Optional.ofNullable(this.endIP);
    }

    /**
     * Start IP Address.
     * 
     */
    @Import(name="startIP")
    private @Nullable Output<String> startIP;

    /**
     * @return Start IP Address.
     * 
     */
    public Optional<Output<String>> startIP() {
        return Optional.ofNullable(this.startIP);
    }

    private QosIpRangeArgs() {}

    private QosIpRangeArgs(QosIpRangeArgs $) {
        this.endIP = $.endIP;
        this.startIP = $.startIP;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QosIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QosIpRangeArgs $;

        public Builder() {
            $ = new QosIpRangeArgs();
        }

        public Builder(QosIpRangeArgs defaults) {
            $ = new QosIpRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endIP End IP Address.
         * 
         * @return builder
         * 
         */
        public Builder endIP(@Nullable Output<String> endIP) {
            $.endIP = endIP;
            return this;
        }

        /**
         * @param endIP End IP Address.
         * 
         * @return builder
         * 
         */
        public Builder endIP(String endIP) {
            return endIP(Output.of(endIP));
        }

        /**
         * @param startIP Start IP Address.
         * 
         * @return builder
         * 
         */
        public Builder startIP(@Nullable Output<String> startIP) {
            $.startIP = startIP;
            return this;
        }

        /**
         * @param startIP Start IP Address.
         * 
         * @return builder
         * 
         */
        public Builder startIP(String startIP) {
            return startIP(Output.of(startIP));
        }

        public QosIpRangeArgs build() {
            return $;
        }
    }

}
