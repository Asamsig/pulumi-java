// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MitigationActionPublishFindingToSnsParams {
    /**
     * @return The ARN of the topic to which you want to publish the findings.
     * 
     */
    private final String topicArn;

    @CustomType.Constructor
    private MitigationActionPublishFindingToSnsParams(@CustomType.Parameter("topicArn") String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * @return The ARN of the topic to which you want to publish the findings.
     * 
     */
    public String topicArn() {
        return this.topicArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionPublishFindingToSnsParams defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionPublishFindingToSnsParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topicArn = defaults.topicArn;
        }

        public Builder topicArn(String topicArn) {
            this.topicArn = Objects.requireNonNull(topicArn);
            return this;
        }        public MitigationActionPublishFindingToSnsParams build() {
            return new MitigationActionPublishFindingToSnsParams(topicArn);
        }
    }
}
