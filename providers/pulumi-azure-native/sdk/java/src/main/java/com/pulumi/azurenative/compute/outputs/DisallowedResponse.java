// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DisallowedResponse {
    /**
     * @return A list of disk types.
     * 
     */
    private final @Nullable List<String> diskTypes;

    @CustomType.Constructor
    private DisallowedResponse(@CustomType.Parameter("diskTypes") @Nullable List<String> diskTypes) {
        this.diskTypes = diskTypes;
    }

    /**
     * @return A list of disk types.
     * 
     */
    public List<String> diskTypes() {
        return this.diskTypes == null ? List.of() : this.diskTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DisallowedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> diskTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(DisallowedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskTypes = defaults.diskTypes;
        }

        public Builder diskTypes(@Nullable List<String> diskTypes) {
            this.diskTypes = diskTypes;
            return this;
        }
        public Builder diskTypes(String... diskTypes) {
            return diskTypes(List.of(diskTypes));
        }        public DisallowedResponse build() {
            return new DisallowedResponse(diskTypes);
        }
    }
}
