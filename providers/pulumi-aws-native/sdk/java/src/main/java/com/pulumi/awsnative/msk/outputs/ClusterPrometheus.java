// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.msk.outputs;

import com.pulumi.awsnative.msk.outputs.ClusterJmxExporter;
import com.pulumi.awsnative.msk.outputs.ClusterNodeExporter;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterPrometheus {
    private final @Nullable ClusterJmxExporter jmxExporter;
    private final @Nullable ClusterNodeExporter nodeExporter;

    @CustomType.Constructor
    private ClusterPrometheus(
        @CustomType.Parameter("jmxExporter") @Nullable ClusterJmxExporter jmxExporter,
        @CustomType.Parameter("nodeExporter") @Nullable ClusterNodeExporter nodeExporter) {
        this.jmxExporter = jmxExporter;
        this.nodeExporter = nodeExporter;
    }

    public Optional<ClusterJmxExporter> jmxExporter() {
        return Optional.ofNullable(this.jmxExporter);
    }
    public Optional<ClusterNodeExporter> nodeExporter() {
        return Optional.ofNullable(this.nodeExporter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterPrometheus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterJmxExporter jmxExporter;
        private @Nullable ClusterNodeExporter nodeExporter;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterPrometheus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jmxExporter = defaults.jmxExporter;
    	      this.nodeExporter = defaults.nodeExporter;
        }

        public Builder jmxExporter(@Nullable ClusterJmxExporter jmxExporter) {
            this.jmxExporter = jmxExporter;
            return this;
        }
        public Builder nodeExporter(@Nullable ClusterNodeExporter nodeExporter) {
            this.nodeExporter = nodeExporter;
            return this;
        }        public ClusterPrometheus build() {
            return new ClusterPrometheus(jmxExporter, nodeExporter);
        }
    }
}
