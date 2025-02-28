// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datamigration_v1.outputs.DumpFlagResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DumpFlagsResponse {
    /**
     * @return The flags for the initial dump.
     * 
     */
    private final List<DumpFlagResponse> dumpFlags;

    @CustomType.Constructor
    private DumpFlagsResponse(@CustomType.Parameter("dumpFlags") List<DumpFlagResponse> dumpFlags) {
        this.dumpFlags = dumpFlags;
    }

    /**
     * @return The flags for the initial dump.
     * 
     */
    public List<DumpFlagResponse> dumpFlags() {
        return this.dumpFlags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DumpFlagsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DumpFlagResponse> dumpFlags;

        public Builder() {
    	      // Empty
        }

        public Builder(DumpFlagsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dumpFlags = defaults.dumpFlags;
        }

        public Builder dumpFlags(List<DumpFlagResponse> dumpFlags) {
            this.dumpFlags = Objects.requireNonNull(dumpFlags);
            return this;
        }
        public Builder dumpFlags(DumpFlagResponse... dumpFlags) {
            return dumpFlags(List.of(dumpFlags));
        }        public DumpFlagsResponse build() {
            return new DumpFlagsResponse(dumpFlags);
        }
    }
}
