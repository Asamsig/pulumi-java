// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AdBreakResponse {
    /**
     * @return Start time in seconds for the ad break, relative to the output file timeline. The default is `0s`.
     * 
     */
    private final String startTimeOffset;

    @CustomType.Constructor
    private AdBreakResponse(@CustomType.Parameter("startTimeOffset") String startTimeOffset) {
        this.startTimeOffset = startTimeOffset;
    }

    /**
     * @return Start time in seconds for the ad break, relative to the output file timeline. The default is `0s`.
     * 
     */
    public String startTimeOffset() {
        return this.startTimeOffset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdBreakResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String startTimeOffset;

        public Builder() {
    	      // Empty
        }

        public Builder(AdBreakResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTimeOffset = defaults.startTimeOffset;
        }

        public Builder startTimeOffset(String startTimeOffset) {
            this.startTimeOffset = Objects.requireNonNull(startTimeOffset);
            return this;
        }        public AdBreakResponse build() {
            return new AdBreakResponse(startTimeOffset);
        }
    }
}
