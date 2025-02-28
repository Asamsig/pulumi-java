// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IPAMIpamOperatingRegion {
    /**
     * @return The name of the region.
     * 
     */
    private final String regionName;

    @CustomType.Constructor
    private IPAMIpamOperatingRegion(@CustomType.Parameter("regionName") String regionName) {
        this.regionName = regionName;
    }

    /**
     * @return The name of the region.
     * 
     */
    public String regionName() {
        return this.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAMIpamOperatingRegion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String regionName;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAMIpamOperatingRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionName = defaults.regionName;
        }

        public Builder regionName(String regionName) {
            this.regionName = Objects.requireNonNull(regionName);
            return this;
        }        public IPAMIpamOperatingRegion build() {
            return new IPAMIpamOperatingRegion(regionName);
        }
    }
}
