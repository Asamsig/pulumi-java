// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class PullTargetResponse {
    @CustomType.Constructor
    private PullTargetResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PullTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(PullTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public PullTargetResponse build() {
            return new PullTargetResponse();
        }
    }
}
