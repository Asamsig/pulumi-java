// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainAutoTuneOptionMaintenanceScheduleDuration {
    /**
     * @return Unit of time specifying the duration of an Auto-Tune maintenance window.
     * 
     */
    private final String unit;
    /**
     * @return An integer specifying the value of the duration of an Auto-Tune maintenance window.
     * 
     */
    private final Integer value;

    @CustomType.Constructor
    private GetDomainAutoTuneOptionMaintenanceScheduleDuration(
        @CustomType.Parameter("unit") String unit,
        @CustomType.Parameter("value") Integer value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * @return Unit of time specifying the duration of an Auto-Tune maintenance window.
     * 
     */
    public String unit() {
        return this.unit;
    }
    /**
     * @return An integer specifying the value of the duration of an Auto-Tune maintenance window.
     * 
     */
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainAutoTuneOptionMaintenanceScheduleDuration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String unit;
        private Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainAutoTuneOptionMaintenanceScheduleDuration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder unit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetDomainAutoTuneOptionMaintenanceScheduleDuration build() {
            return new GetDomainAutoTuneOptionMaintenanceScheduleDuration(unit, value);
        }
    }
}
