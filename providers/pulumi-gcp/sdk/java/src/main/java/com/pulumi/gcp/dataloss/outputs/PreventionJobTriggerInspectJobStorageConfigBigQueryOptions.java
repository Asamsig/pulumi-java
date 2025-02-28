// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference;
import java.util.Objects;

@CustomType
public final class PreventionJobTriggerInspectJobStorageConfigBigQueryOptions {
    /**
     * @return Set of files to scan.
     * Structure is documented below.
     * 
     */
    private final PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference tableReference;

    @CustomType.Constructor
    private PreventionJobTriggerInspectJobStorageConfigBigQueryOptions(@CustomType.Parameter("tableReference") PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference tableReference) {
        this.tableReference = tableReference;
    }

    /**
     * @return Set of files to scan.
     * Structure is documented below.
     * 
     */
    public PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference tableReference() {
        return this.tableReference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference tableReference;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableReference = defaults.tableReference;
        }

        public Builder tableReference(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference tableReference) {
            this.tableReference = Objects.requireNonNull(tableReference);
            return this;
        }        public PreventionJobTriggerInspectJobStorageConfigBigQueryOptions build() {
            return new PreventionJobTriggerInspectJobStorageConfigBigQueryOptions(tableReference);
        }
    }
}
