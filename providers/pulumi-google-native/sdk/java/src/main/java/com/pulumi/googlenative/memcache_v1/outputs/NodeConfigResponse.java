// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.memcache_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class NodeConfigResponse {
    /**
     * @return Number of cpus per Memcached node.
     * 
     */
    private final Integer cpuCount;
    /**
     * @return Memory size in MiB for each Memcached node.
     * 
     */
    private final Integer memorySizeMb;

    @CustomType.Constructor
    private NodeConfigResponse(
        @CustomType.Parameter("cpuCount") Integer cpuCount,
        @CustomType.Parameter("memorySizeMb") Integer memorySizeMb) {
        this.cpuCount = cpuCount;
        this.memorySizeMb = memorySizeMb;
    }

    /**
     * @return Number of cpus per Memcached node.
     * 
     */
    public Integer cpuCount() {
        return this.cpuCount;
    }
    /**
     * @return Memory size in MiB for each Memcached node.
     * 
     */
    public Integer memorySizeMb() {
        return this.memorySizeMb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cpuCount;
        private Integer memorySizeMb;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCount = defaults.cpuCount;
    	      this.memorySizeMb = defaults.memorySizeMb;
        }

        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = Objects.requireNonNull(cpuCount);
            return this;
        }
        public Builder memorySizeMb(Integer memorySizeMb) {
            this.memorySizeMb = Objects.requireNonNull(memorySizeMb);
            return this;
        }        public NodeConfigResponse build() {
            return new NodeConfigResponse(cpuCount, memorySizeMb);
        }
    }
}
