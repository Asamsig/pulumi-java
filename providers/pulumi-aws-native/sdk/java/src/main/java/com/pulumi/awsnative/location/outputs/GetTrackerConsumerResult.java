// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.location.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetTrackerConsumerResult {
    @CustomType.Constructor
    private GetTrackerConsumerResult() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrackerConsumerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GetTrackerConsumerResult defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GetTrackerConsumerResult build() {
            return new GetTrackerConsumerResult();
        }
    }
}
