// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.outputs;

import com.pulumi.azurenative.batch.outputs.AutoScaleSettingsResponse;
import com.pulumi.azurenative.batch.outputs.FixedScaleSettingsResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleSettingsResponse {
    /**
     * @return This property and fixedScale are mutually exclusive and one of the properties must be specified.
     * 
     */
    private final @Nullable AutoScaleSettingsResponse autoScale;
    /**
     * @return This property and autoScale are mutually exclusive and one of the properties must be specified.
     * 
     */
    private final @Nullable FixedScaleSettingsResponse fixedScale;

    @CustomType.Constructor
    private ScaleSettingsResponse(
        @CustomType.Parameter("autoScale") @Nullable AutoScaleSettingsResponse autoScale,
        @CustomType.Parameter("fixedScale") @Nullable FixedScaleSettingsResponse fixedScale) {
        this.autoScale = autoScale;
        this.fixedScale = fixedScale;
    }

    /**
     * @return This property and fixedScale are mutually exclusive and one of the properties must be specified.
     * 
     */
    public Optional<AutoScaleSettingsResponse> autoScale() {
        return Optional.ofNullable(this.autoScale);
    }
    /**
     * @return This property and autoScale are mutually exclusive and one of the properties must be specified.
     * 
     */
    public Optional<FixedScaleSettingsResponse> fixedScale() {
        return Optional.ofNullable(this.fixedScale);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoScaleSettingsResponse autoScale;
        private @Nullable FixedScaleSettingsResponse fixedScale;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScale = defaults.autoScale;
    	      this.fixedScale = defaults.fixedScale;
        }

        public Builder autoScale(@Nullable AutoScaleSettingsResponse autoScale) {
            this.autoScale = autoScale;
            return this;
        }
        public Builder fixedScale(@Nullable FixedScaleSettingsResponse fixedScale) {
            this.fixedScale = fixedScale;
            return this;
        }        public ScaleSettingsResponse build() {
            return new ScaleSettingsResponse(autoScale, fixedScale);
        }
    }
}
