// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class LogAnalyticsQueryPackQueryPropertiesResponseRelated {
    /**
     * @return The related categories for the function.
     * 
     */
    private final @Nullable List<String> categories;
    /**
     * @return The related resource types for the function.
     * 
     */
    private final @Nullable List<String> resourceTypes;
    /**
     * @return The related Log Analytics solutions for the function.
     * 
     */
    private final @Nullable List<String> solutions;

    @CustomType.Constructor
    private LogAnalyticsQueryPackQueryPropertiesResponseRelated(
        @CustomType.Parameter("categories") @Nullable List<String> categories,
        @CustomType.Parameter("resourceTypes") @Nullable List<String> resourceTypes,
        @CustomType.Parameter("solutions") @Nullable List<String> solutions) {
        this.categories = categories;
        this.resourceTypes = resourceTypes;
        this.solutions = solutions;
    }

    /**
     * @return The related categories for the function.
     * 
     */
    public List<String> categories() {
        return this.categories == null ? List.of() : this.categories;
    }
    /**
     * @return The related resource types for the function.
     * 
     */
    public List<String> resourceTypes() {
        return this.resourceTypes == null ? List.of() : this.resourceTypes;
    }
    /**
     * @return The related Log Analytics solutions for the function.
     * 
     */
    public List<String> solutions() {
        return this.solutions == null ? List.of() : this.solutions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAnalyticsQueryPackQueryPropertiesResponseRelated defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> categories;
        private @Nullable List<String> resourceTypes;
        private @Nullable List<String> solutions;

        public Builder() {
    	      // Empty
        }

        public Builder(LogAnalyticsQueryPackQueryPropertiesResponseRelated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.solutions = defaults.solutions;
        }

        public Builder categories(@Nullable List<String> categories) {
            this.categories = categories;
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        public Builder resourceTypes(@Nullable List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public Builder resourceTypes(String... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }
        public Builder solutions(@Nullable List<String> solutions) {
            this.solutions = solutions;
            return this;
        }
        public Builder solutions(String... solutions) {
            return solutions(List.of(solutions));
        }        public LogAnalyticsQueryPackQueryPropertiesResponseRelated build() {
            return new LogAnalyticsQueryPackQueryPropertiesResponseRelated(categories, resourceTypes, solutions);
        }
    }
}
