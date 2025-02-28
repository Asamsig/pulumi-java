// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAlertRuleTemplateSecurityIncidentTemplate {
    /**
     * @return The description of this Sentinel Scheduled Alert Rule Template.
     * 
     */
    private final String description;
    /**
     * @return The Microsoft Security Service from where the alert will be generated.
     * 
     */
    private final String productFilter;

    @CustomType.Constructor
    private GetAlertRuleTemplateSecurityIncidentTemplate(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("productFilter") String productFilter) {
        this.description = description;
        this.productFilter = productFilter;
    }

    /**
     * @return The description of this Sentinel Scheduled Alert Rule Template.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The Microsoft Security Service from where the alert will be generated.
     * 
     */
    public String productFilter() {
        return this.productFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertRuleTemplateSecurityIncidentTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String productFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlertRuleTemplateSecurityIncidentTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.productFilter = defaults.productFilter;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder productFilter(String productFilter) {
            this.productFilter = Objects.requireNonNull(productFilter);
            return this;
        }        public GetAlertRuleTemplateSecurityIncidentTemplate build() {
            return new GetAlertRuleTemplateSecurityIncidentTemplate(description, productFilter);
        }
    }
}
