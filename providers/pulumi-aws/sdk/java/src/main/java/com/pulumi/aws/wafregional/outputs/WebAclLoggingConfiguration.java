// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.outputs;

import com.pulumi.aws.wafregional.outputs.WebAclLoggingConfigurationRedactedFields;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclLoggingConfiguration {
    /**
     * @return Amazon Resource Name (ARN) of Kinesis Firehose Delivery Stream
     * 
     */
    private final String logDestination;
    /**
     * @return Configuration block containing parts of the request that you want redacted from the logs. Detailed below.
     * 
     */
    private final @Nullable WebAclLoggingConfigurationRedactedFields redactedFields;

    @CustomType.Constructor
    private WebAclLoggingConfiguration(
        @CustomType.Parameter("logDestination") String logDestination,
        @CustomType.Parameter("redactedFields") @Nullable WebAclLoggingConfigurationRedactedFields redactedFields) {
        this.logDestination = logDestination;
        this.redactedFields = redactedFields;
    }

    /**
     * @return Amazon Resource Name (ARN) of Kinesis Firehose Delivery Stream
     * 
     */
    public String logDestination() {
        return this.logDestination;
    }
    /**
     * @return Configuration block containing parts of the request that you want redacted from the logs. Detailed below.
     * 
     */
    public Optional<WebAclLoggingConfigurationRedactedFields> redactedFields() {
        return Optional.ofNullable(this.redactedFields);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logDestination;
        private @Nullable WebAclLoggingConfigurationRedactedFields redactedFields;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestination = defaults.logDestination;
    	      this.redactedFields = defaults.redactedFields;
        }

        public Builder logDestination(String logDestination) {
            this.logDestination = Objects.requireNonNull(logDestination);
            return this;
        }
        public Builder redactedFields(@Nullable WebAclLoggingConfigurationRedactedFields redactedFields) {
            this.redactedFields = redactedFields;
            return this;
        }        public WebAclLoggingConfiguration build() {
            return new WebAclLoggingConfiguration(logDestination, redactedFields);
        }
    }
}
