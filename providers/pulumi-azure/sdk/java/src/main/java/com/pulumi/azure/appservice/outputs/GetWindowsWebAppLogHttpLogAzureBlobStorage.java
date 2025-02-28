// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWindowsWebAppLogHttpLogAzureBlobStorage {
    /**
     * @return The retention period in days.
     * 
     */
    private final Integer retentionInDays;
    /**
     * @return The SAS url to the Azure Blob container.
     * 
     */
    private final String sasUrl;

    @CustomType.Constructor
    private GetWindowsWebAppLogHttpLogAzureBlobStorage(
        @CustomType.Parameter("retentionInDays") Integer retentionInDays,
        @CustomType.Parameter("sasUrl") String sasUrl) {
        this.retentionInDays = retentionInDays;
        this.sasUrl = sasUrl;
    }

    /**
     * @return The retention period in days.
     * 
     */
    public Integer retentionInDays() {
        return this.retentionInDays;
    }
    /**
     * @return The SAS url to the Azure Blob container.
     * 
     */
    public String sasUrl() {
        return this.sasUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsWebAppLogHttpLogAzureBlobStorage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer retentionInDays;
        private String sasUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWindowsWebAppLogHttpLogAzureBlobStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.sasUrl = defaults.sasUrl;
        }

        public Builder retentionInDays(Integer retentionInDays) {
            this.retentionInDays = Objects.requireNonNull(retentionInDays);
            return this;
        }
        public Builder sasUrl(String sasUrl) {
            this.sasUrl = Objects.requireNonNull(sasUrl);
            return this;
        }        public GetWindowsWebAppLogHttpLogAzureBlobStorage build() {
            return new GetWindowsWebAppLogHttpLogAzureBlobStorage(retentionInDays, sasUrl);
        }
    }
}
