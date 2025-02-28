// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.emr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStudioSessionMappingResult {
    /**
     * @return The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. Session policies refine Studio user permissions without the need to use multiple IAM user roles.
     * 
     */
    private final @Nullable String sessionPolicyArn;

    @CustomType.Constructor
    private GetStudioSessionMappingResult(@CustomType.Parameter("sessionPolicyArn") @Nullable String sessionPolicyArn) {
        this.sessionPolicyArn = sessionPolicyArn;
    }

    /**
     * @return The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. Session policies refine Studio user permissions without the need to use multiple IAM user roles.
     * 
     */
    public Optional<String> sessionPolicyArn() {
        return Optional.ofNullable(this.sessionPolicyArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStudioSessionMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sessionPolicyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStudioSessionMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sessionPolicyArn = defaults.sessionPolicyArn;
        }

        public Builder sessionPolicyArn(@Nullable String sessionPolicyArn) {
            this.sessionPolicyArn = sessionPolicyArn;
            return this;
        }        public GetStudioSessionMappingResult build() {
            return new GetStudioSessionMappingResult(sessionPolicyArn);
        }
    }
}
