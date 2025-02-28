// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.msk.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterJmxExporterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterJmxExporterArgs Empty = new ClusterJmxExporterArgs();

    @Import(name="enabledInBroker", required=true)
    private Output<Boolean> enabledInBroker;

    public Output<Boolean> enabledInBroker() {
        return this.enabledInBroker;
    }

    private ClusterJmxExporterArgs() {}

    private ClusterJmxExporterArgs(ClusterJmxExporterArgs $) {
        this.enabledInBroker = $.enabledInBroker;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterJmxExporterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterJmxExporterArgs $;

        public Builder() {
            $ = new ClusterJmxExporterArgs();
        }

        public Builder(ClusterJmxExporterArgs defaults) {
            $ = new ClusterJmxExporterArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabledInBroker(Output<Boolean> enabledInBroker) {
            $.enabledInBroker = enabledInBroker;
            return this;
        }

        public Builder enabledInBroker(Boolean enabledInBroker) {
            return enabledInBroker(Output.of(enabledInBroker));
        }

        public ClusterJmxExporterArgs build() {
            $.enabledInBroker = Objects.requireNonNull($.enabledInBroker, "expected parameter 'enabledInBroker' to be non-null");
            return $;
        }
    }

}
