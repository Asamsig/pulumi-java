// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.redis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCachePatchSchedule {
    /**
     * @return the Weekday name for the patch item
     * 
     */
    private final String dayOfWeek;
    /**
     * @return The ISO 8601 timespan which specifies the amount of time the Redis Cache can be updated.
     * 
     */
    private final String maintenanceWindow;
    /**
     * @return The Start Hour for maintenance in UTC
     * 
     */
    private final Integer startHourUtc;

    @CustomType.Constructor
    private GetCachePatchSchedule(
        @CustomType.Parameter("dayOfWeek") String dayOfWeek,
        @CustomType.Parameter("maintenanceWindow") String maintenanceWindow,
        @CustomType.Parameter("startHourUtc") Integer startHourUtc) {
        this.dayOfWeek = dayOfWeek;
        this.maintenanceWindow = maintenanceWindow;
        this.startHourUtc = startHourUtc;
    }

    /**
     * @return the Weekday name for the patch item
     * 
     */
    public String dayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * @return The ISO 8601 timespan which specifies the amount of time the Redis Cache can be updated.
     * 
     */
    public String maintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * @return The Start Hour for maintenance in UTC
     * 
     */
    public Integer startHourUtc() {
        return this.startHourUtc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePatchSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dayOfWeek;
        private String maintenanceWindow;
        private Integer startHourUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCachePatchSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.startHourUtc = defaults.startHourUtc;
        }

        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }
        public Builder maintenanceWindow(String maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }
        public Builder startHourUtc(Integer startHourUtc) {
            this.startHourUtc = Objects.requireNonNull(startHourUtc);
            return this;
        }        public GetCachePatchSchedule build() {
            return new GetCachePatchSchedule(dayOfWeek, maintenanceWindow, startHourUtc);
        }
    }
}
