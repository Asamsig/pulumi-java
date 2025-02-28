// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs.CSINodeDriver;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CSINodeSpec {
    /**
     * @return drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
     * 
     */
    private final List<CSINodeDriver> drivers;

    @CustomType.Constructor
    private CSINodeSpec(@CustomType.Parameter("drivers") List<CSINodeDriver> drivers) {
        this.drivers = drivers;
    }

    /**
     * @return drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
     * 
     */
    public List<CSINodeDriver> drivers() {
        return this.drivers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSINodeSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CSINodeDriver> drivers;

        public Builder() {
    	      // Empty
        }

        public Builder(CSINodeSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drivers = defaults.drivers;
        }

        public Builder drivers(List<CSINodeDriver> drivers) {
            this.drivers = Objects.requireNonNull(drivers);
            return this;
        }
        public Builder drivers(CSINodeDriver... drivers) {
            return drivers(List.of(drivers));
        }        public CSINodeSpec build() {
            return new CSINodeSpec(drivers);
        }
    }
}
