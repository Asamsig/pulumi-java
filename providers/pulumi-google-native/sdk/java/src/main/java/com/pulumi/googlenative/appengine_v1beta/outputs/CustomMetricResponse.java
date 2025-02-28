// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CustomMetricResponse {
    /**
     * @return Allows filtering on the metric&#39;s fields.
     * 
     */
    private final String filter;
    /**
     * @return The name of the metric.
     * 
     */
    private final String metricName;
    /**
     * @return May be used instead of target_utilization when an instance can handle a specific amount of work/resources and the metric value is equal to the current amount of work remaining. The autoscaler will try to keep the number of instances equal to the metric value divided by single_instance_assignment.
     * 
     */
    private final Double singleInstanceAssignment;
    /**
     * @return The type of the metric. Must be a string representing a Stackdriver metric type e.g. GAGUE, DELTA_PER_SECOND, etc.
     * 
     */
    private final String targetType;
    /**
     * @return The target value for the metric.
     * 
     */
    private final Double targetUtilization;

    @CustomType.Constructor
    private CustomMetricResponse(
        @CustomType.Parameter("filter") String filter,
        @CustomType.Parameter("metricName") String metricName,
        @CustomType.Parameter("singleInstanceAssignment") Double singleInstanceAssignment,
        @CustomType.Parameter("targetType") String targetType,
        @CustomType.Parameter("targetUtilization") Double targetUtilization) {
        this.filter = filter;
        this.metricName = metricName;
        this.singleInstanceAssignment = singleInstanceAssignment;
        this.targetType = targetType;
        this.targetUtilization = targetUtilization;
    }

    /**
     * @return Allows filtering on the metric&#39;s fields.
     * 
     */
    public String filter() {
        return this.filter;
    }
    /**
     * @return The name of the metric.
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return May be used instead of target_utilization when an instance can handle a specific amount of work/resources and the metric value is equal to the current amount of work remaining. The autoscaler will try to keep the number of instances equal to the metric value divided by single_instance_assignment.
     * 
     */
    public Double singleInstanceAssignment() {
        return this.singleInstanceAssignment;
    }
    /**
     * @return The type of the metric. Must be a string representing a Stackdriver metric type e.g. GAGUE, DELTA_PER_SECOND, etc.
     * 
     */
    public String targetType() {
        return this.targetType;
    }
    /**
     * @return The target value for the metric.
     * 
     */
    public Double targetUtilization() {
        return this.targetUtilization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomMetricResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filter;
        private String metricName;
        private Double singleInstanceAssignment;
        private String targetType;
        private Double targetUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomMetricResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.metricName = defaults.metricName;
    	      this.singleInstanceAssignment = defaults.singleInstanceAssignment;
    	      this.targetType = defaults.targetType;
    	      this.targetUtilization = defaults.targetUtilization;
        }

        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder singleInstanceAssignment(Double singleInstanceAssignment) {
            this.singleInstanceAssignment = Objects.requireNonNull(singleInstanceAssignment);
            return this;
        }
        public Builder targetType(String targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }
        public Builder targetUtilization(Double targetUtilization) {
            this.targetUtilization = Objects.requireNonNull(targetUtilization);
            return this;
        }        public CustomMetricResponse build() {
            return new CustomMetricResponse(filter, metricName, singleInstanceAssignment, targetType, targetUtilization);
        }
    }
}
