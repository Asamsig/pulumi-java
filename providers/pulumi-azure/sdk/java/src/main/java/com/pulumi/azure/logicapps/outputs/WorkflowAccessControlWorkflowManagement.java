// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WorkflowAccessControlWorkflowManagement {
    /**
     * @return A list of the allowed caller IP address ranges.
     * 
     */
    private final List<String> allowedCallerIpAddressRanges;

    @CustomType.Constructor
    private WorkflowAccessControlWorkflowManagement(@CustomType.Parameter("allowedCallerIpAddressRanges") List<String> allowedCallerIpAddressRanges) {
        this.allowedCallerIpAddressRanges = allowedCallerIpAddressRanges;
    }

    /**
     * @return A list of the allowed caller IP address ranges.
     * 
     */
    public List<String> allowedCallerIpAddressRanges() {
        return this.allowedCallerIpAddressRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowAccessControlWorkflowManagement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedCallerIpAddressRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowAccessControlWorkflowManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCallerIpAddressRanges = defaults.allowedCallerIpAddressRanges;
        }

        public Builder allowedCallerIpAddressRanges(List<String> allowedCallerIpAddressRanges) {
            this.allowedCallerIpAddressRanges = Objects.requireNonNull(allowedCallerIpAddressRanges);
            return this;
        }
        public Builder allowedCallerIpAddressRanges(String... allowedCallerIpAddressRanges) {
            return allowedCallerIpAddressRanges(List.of(allowedCallerIpAddressRanges));
        }        public WorkflowAccessControlWorkflowManagement build() {
            return new WorkflowAccessControlWorkflowManagement(allowedCallerIpAddressRanges);
        }
    }
}
