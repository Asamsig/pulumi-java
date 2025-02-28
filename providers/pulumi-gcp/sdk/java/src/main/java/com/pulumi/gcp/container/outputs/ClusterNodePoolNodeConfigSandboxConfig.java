// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterNodePoolNodeConfigSandboxConfig {
    /**
     * @return Which sandbox to use for pods in the node pool.
     * Accepted values are:
     * 
     */
    private final String sandboxType;

    @CustomType.Constructor
    private ClusterNodePoolNodeConfigSandboxConfig(@CustomType.Parameter("sandboxType") String sandboxType) {
        this.sandboxType = sandboxType;
    }

    /**
     * @return Which sandbox to use for pods in the node pool.
     * Accepted values are:
     * 
     */
    public String sandboxType() {
        return this.sandboxType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigSandboxConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sandboxType;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNodeConfigSandboxConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sandboxType = defaults.sandboxType;
        }

        public Builder sandboxType(String sandboxType) {
            this.sandboxType = Objects.requireNonNull(sandboxType);
            return this;
        }        public ClusterNodePoolNodeConfigSandboxConfig build() {
            return new ClusterNodePoolNodeConfigSandboxConfig(sandboxType);
        }
    }
}
