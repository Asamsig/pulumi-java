// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResponseHeadersPolicySecurityHeadersConfigFrameOption {
    /**
     * @return The value of the X-Frame-Options HTTP response header. Valid values: `DENY` | `SAMEORIGIN`
     * 
     */
    private final String frameOption;
    /**
     * @return A Boolean value that determines whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    private final Boolean override;

    @CustomType.Constructor
    private GetResponseHeadersPolicySecurityHeadersConfigFrameOption(
        @CustomType.Parameter("frameOption") String frameOption,
        @CustomType.Parameter("override") Boolean override) {
        this.frameOption = frameOption;
        this.override = override;
    }

    /**
     * @return The value of the X-Frame-Options HTTP response header. Valid values: `DENY` | `SAMEORIGIN`
     * 
     */
    public String frameOption() {
        return this.frameOption;
    }
    /**
     * @return A Boolean value that determines whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    public Boolean override() {
        return this.override;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicySecurityHeadersConfigFrameOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String frameOption;
        private Boolean override;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicySecurityHeadersConfigFrameOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frameOption = defaults.frameOption;
    	      this.override = defaults.override;
        }

        public Builder frameOption(String frameOption) {
            this.frameOption = Objects.requireNonNull(frameOption);
            return this;
        }
        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }        public GetResponseHeadersPolicySecurityHeadersConfigFrameOption build() {
            return new GetResponseHeadersPolicySecurityHeadersConfigFrameOption(frameOption, override);
        }
    }
}
