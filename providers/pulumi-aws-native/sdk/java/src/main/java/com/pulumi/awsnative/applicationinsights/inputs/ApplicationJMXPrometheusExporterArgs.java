// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The JMX Prometheus Exporter settings.
 * 
 */
public final class ApplicationJMXPrometheusExporterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationJMXPrometheusExporterArgs Empty = new ApplicationJMXPrometheusExporterArgs();

    /**
     * Java agent host port
     * 
     */
    @Import(name="hostPort")
    private @Nullable Output<String> hostPort;

    /**
     * @return Java agent host port
     * 
     */
    public Optional<Output<String>> hostPort() {
        return Optional.ofNullable(this.hostPort);
    }

    /**
     * JMX service URL.
     * 
     */
    @Import(name="jMXURL")
    private @Nullable Output<String> jMXURL;

    /**
     * @return JMX service URL.
     * 
     */
    public Optional<Output<String>> jMXURL() {
        return Optional.ofNullable(this.jMXURL);
    }

    /**
     * Prometheus exporter port.
     * 
     */
    @Import(name="prometheusPort")
    private @Nullable Output<String> prometheusPort;

    /**
     * @return Prometheus exporter port.
     * 
     */
    public Optional<Output<String>> prometheusPort() {
        return Optional.ofNullable(this.prometheusPort);
    }

    private ApplicationJMXPrometheusExporterArgs() {}

    private ApplicationJMXPrometheusExporterArgs(ApplicationJMXPrometheusExporterArgs $) {
        this.hostPort = $.hostPort;
        this.jMXURL = $.jMXURL;
        this.prometheusPort = $.prometheusPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationJMXPrometheusExporterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationJMXPrometheusExporterArgs $;

        public Builder() {
            $ = new ApplicationJMXPrometheusExporterArgs();
        }

        public Builder(ApplicationJMXPrometheusExporterArgs defaults) {
            $ = new ApplicationJMXPrometheusExporterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostPort Java agent host port
         * 
         * @return builder
         * 
         */
        public Builder hostPort(@Nullable Output<String> hostPort) {
            $.hostPort = hostPort;
            return this;
        }

        /**
         * @param hostPort Java agent host port
         * 
         * @return builder
         * 
         */
        public Builder hostPort(String hostPort) {
            return hostPort(Output.of(hostPort));
        }

        /**
         * @param jMXURL JMX service URL.
         * 
         * @return builder
         * 
         */
        public Builder jMXURL(@Nullable Output<String> jMXURL) {
            $.jMXURL = jMXURL;
            return this;
        }

        /**
         * @param jMXURL JMX service URL.
         * 
         * @return builder
         * 
         */
        public Builder jMXURL(String jMXURL) {
            return jMXURL(Output.of(jMXURL));
        }

        /**
         * @param prometheusPort Prometheus exporter port.
         * 
         * @return builder
         * 
         */
        public Builder prometheusPort(@Nullable Output<String> prometheusPort) {
            $.prometheusPort = prometheusPort;
            return this;
        }

        /**
         * @param prometheusPort Prometheus exporter port.
         * 
         * @return builder
         * 
         */
        public Builder prometheusPort(String prometheusPort) {
            return prometheusPort(Output.of(prometheusPort));
        }

        public ApplicationJMXPrometheusExporterArgs build() {
            return $;
        }
    }

}
