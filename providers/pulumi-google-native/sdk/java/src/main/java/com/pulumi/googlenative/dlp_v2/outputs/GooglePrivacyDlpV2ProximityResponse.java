// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2ProximityResponse {
    /**
     * @return Number of characters after the finding to consider.
     * 
     */
    private final Integer windowAfter;
    /**
     * @return Number of characters before the finding to consider.
     * 
     */
    private final Integer windowBefore;

    @CustomType.Constructor
    private GooglePrivacyDlpV2ProximityResponse(
        @CustomType.Parameter("windowAfter") Integer windowAfter,
        @CustomType.Parameter("windowBefore") Integer windowBefore) {
        this.windowAfter = windowAfter;
        this.windowBefore = windowBefore;
    }

    /**
     * @return Number of characters after the finding to consider.
     * 
     */
    public Integer windowAfter() {
        return this.windowAfter;
    }
    /**
     * @return Number of characters before the finding to consider.
     * 
     */
    public Integer windowBefore() {
        return this.windowBefore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ProximityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer windowAfter;
        private Integer windowBefore;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ProximityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.windowAfter = defaults.windowAfter;
    	      this.windowBefore = defaults.windowBefore;
        }

        public Builder windowAfter(Integer windowAfter) {
            this.windowAfter = Objects.requireNonNull(windowAfter);
            return this;
        }
        public Builder windowBefore(Integer windowBefore) {
            this.windowBefore = Objects.requireNonNull(windowBefore);
            return this;
        }        public GooglePrivacyDlpV2ProximityResponse build() {
            return new GooglePrivacyDlpV2ProximityResponse(windowAfter, windowBefore);
        }
    }
}
