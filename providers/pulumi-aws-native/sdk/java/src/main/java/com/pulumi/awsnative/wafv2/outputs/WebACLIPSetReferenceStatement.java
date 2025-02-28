// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.outputs.WebACLIPSetForwardedIPConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebACLIPSetReferenceStatement {
    private final String arn;
    private final @Nullable WebACLIPSetForwardedIPConfiguration iPSetForwardedIPConfig;

    @CustomType.Constructor
    private WebACLIPSetReferenceStatement(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("iPSetForwardedIPConfig") @Nullable WebACLIPSetForwardedIPConfiguration iPSetForwardedIPConfig) {
        this.arn = arn;
        this.iPSetForwardedIPConfig = iPSetForwardedIPConfig;
    }

    public String arn() {
        return this.arn;
    }
    public Optional<WebACLIPSetForwardedIPConfiguration> iPSetForwardedIPConfig() {
        return Optional.ofNullable(this.iPSetForwardedIPConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLIPSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable WebACLIPSetForwardedIPConfiguration iPSetForwardedIPConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLIPSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.iPSetForwardedIPConfig = defaults.iPSetForwardedIPConfig;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder iPSetForwardedIPConfig(@Nullable WebACLIPSetForwardedIPConfiguration iPSetForwardedIPConfig) {
            this.iPSetForwardedIPConfig = iPSetForwardedIPConfig;
            return this;
        }        public WebACLIPSetReferenceStatement build() {
            return new WebACLIPSetReferenceStatement(arn, iPSetForwardedIPConfig);
        }
    }
}
