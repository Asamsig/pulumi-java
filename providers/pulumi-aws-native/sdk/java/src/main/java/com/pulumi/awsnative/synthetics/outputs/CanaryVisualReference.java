// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.synthetics.outputs;

import com.pulumi.awsnative.synthetics.outputs.CanaryBaseScreenshot;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CanaryVisualReference {
    /**
     * @return Canary run id to be used as base reference for visual testing
     * 
     */
    private final String baseCanaryRunId;
    /**
     * @return List of screenshots used as base reference for visual testing
     * 
     */
    private final @Nullable List<CanaryBaseScreenshot> baseScreenshots;

    @CustomType.Constructor
    private CanaryVisualReference(
        @CustomType.Parameter("baseCanaryRunId") String baseCanaryRunId,
        @CustomType.Parameter("baseScreenshots") @Nullable List<CanaryBaseScreenshot> baseScreenshots) {
        this.baseCanaryRunId = baseCanaryRunId;
        this.baseScreenshots = baseScreenshots;
    }

    /**
     * @return Canary run id to be used as base reference for visual testing
     * 
     */
    public String baseCanaryRunId() {
        return this.baseCanaryRunId;
    }
    /**
     * @return List of screenshots used as base reference for visual testing
     * 
     */
    public List<CanaryBaseScreenshot> baseScreenshots() {
        return this.baseScreenshots == null ? List.of() : this.baseScreenshots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryVisualReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseCanaryRunId;
        private @Nullable List<CanaryBaseScreenshot> baseScreenshots;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryVisualReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseCanaryRunId = defaults.baseCanaryRunId;
    	      this.baseScreenshots = defaults.baseScreenshots;
        }

        public Builder baseCanaryRunId(String baseCanaryRunId) {
            this.baseCanaryRunId = Objects.requireNonNull(baseCanaryRunId);
            return this;
        }
        public Builder baseScreenshots(@Nullable List<CanaryBaseScreenshot> baseScreenshots) {
            this.baseScreenshots = baseScreenshots;
            return this;
        }
        public Builder baseScreenshots(CanaryBaseScreenshot... baseScreenshots) {
            return baseScreenshots(List.of(baseScreenshots));
        }        public CanaryVisualReference build() {
            return new CanaryVisualReference(baseCanaryRunId, baseScreenshots);
        }
    }
}
