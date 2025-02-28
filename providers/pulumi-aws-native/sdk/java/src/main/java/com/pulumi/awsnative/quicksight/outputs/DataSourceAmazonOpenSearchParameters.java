// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataSourceAmazonOpenSearchParameters {
    /**
     * @return &lt;p&gt;The Amazon OpenSearch Service domain.&lt;/p&gt;
     * 
     */
    private final String domain;

    @CustomType.Constructor
    private DataSourceAmazonOpenSearchParameters(@CustomType.Parameter("domain") String domain) {
        this.domain = domain;
    }

    /**
     * @return &lt;p&gt;The Amazon OpenSearch Service domain.&lt;/p&gt;
     * 
     */
    public String domain() {
        return this.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceAmazonOpenSearchParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domain;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceAmazonOpenSearchParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
        }

        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }        public DataSourceAmazonOpenSearchParameters build() {
            return new DataSourceAmazonOpenSearchParameters(domain);
        }
    }
}
