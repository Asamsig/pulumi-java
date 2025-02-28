// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLiveTokenResult {
    /**
     * @return JWT token for accessing live metrics stream data.
     * 
     */
    private final String liveToken;

    @CustomType.Constructor
    private GetLiveTokenResult(@CustomType.Parameter("liveToken") String liveToken) {
        this.liveToken = liveToken;
    }

    /**
     * @return JWT token for accessing live metrics stream data.
     * 
     */
    public String liveToken() {
        return this.liveToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLiveTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String liveToken;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLiveTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.liveToken = defaults.liveToken;
        }

        public Builder liveToken(String liveToken) {
            this.liveToken = Objects.requireNonNull(liveToken);
            return this;
        }        public GetLiveTokenResult build() {
            return new GetLiveTokenResult(liveToken);
        }
    }
}
