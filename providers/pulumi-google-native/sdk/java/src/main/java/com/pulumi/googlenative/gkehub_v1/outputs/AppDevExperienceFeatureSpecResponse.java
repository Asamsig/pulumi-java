// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class AppDevExperienceFeatureSpecResponse {
    @CustomType.Constructor
    private AppDevExperienceFeatureSpecResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppDevExperienceFeatureSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(AppDevExperienceFeatureSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public AppDevExperienceFeatureSpecResponse build() {
            return new AppDevExperienceFeatureSpecResponse();
        }
    }
}
