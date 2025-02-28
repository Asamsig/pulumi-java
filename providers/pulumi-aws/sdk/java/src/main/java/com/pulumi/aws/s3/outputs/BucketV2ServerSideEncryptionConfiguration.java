// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketV2ServerSideEncryptionConfigurationRule;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BucketV2ServerSideEncryptionConfiguration {
    /**
     * @return A single object for server-side encryption by default configuration. (documented below)
     * 
     */
    private final List<BucketV2ServerSideEncryptionConfigurationRule> rules;

    @CustomType.Constructor
    private BucketV2ServerSideEncryptionConfiguration(@CustomType.Parameter("rules") List<BucketV2ServerSideEncryptionConfigurationRule> rules) {
        this.rules = rules;
    }

    /**
     * @return A single object for server-side encryption by default configuration. (documented below)
     * 
     */
    public List<BucketV2ServerSideEncryptionConfigurationRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketV2ServerSideEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BucketV2ServerSideEncryptionConfigurationRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketV2ServerSideEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(List<BucketV2ServerSideEncryptionConfigurationRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(BucketV2ServerSideEncryptionConfigurationRule... rules) {
            return rules(List.of(rules));
        }        public BucketV2ServerSideEncryptionConfiguration build() {
            return new BucketV2ServerSideEncryptionConfiguration(rules);
        }
    }
}
