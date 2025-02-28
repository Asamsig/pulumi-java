// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.WebACLIPSetForwardedIPConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebACLIPSetReferenceStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebACLIPSetReferenceStatementArgs Empty = new WebACLIPSetReferenceStatementArgs();

    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    @Import(name="iPSetForwardedIPConfig")
    private @Nullable Output<WebACLIPSetForwardedIPConfigurationArgs> iPSetForwardedIPConfig;

    public Optional<Output<WebACLIPSetForwardedIPConfigurationArgs>> iPSetForwardedIPConfig() {
        return Optional.ofNullable(this.iPSetForwardedIPConfig);
    }

    private WebACLIPSetReferenceStatementArgs() {}

    private WebACLIPSetReferenceStatementArgs(WebACLIPSetReferenceStatementArgs $) {
        this.arn = $.arn;
        this.iPSetForwardedIPConfig = $.iPSetForwardedIPConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLIPSetReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLIPSetReferenceStatementArgs $;

        public Builder() {
            $ = new WebACLIPSetReferenceStatementArgs();
        }

        public Builder(WebACLIPSetReferenceStatementArgs defaults) {
            $ = new WebACLIPSetReferenceStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder iPSetForwardedIPConfig(@Nullable Output<WebACLIPSetForwardedIPConfigurationArgs> iPSetForwardedIPConfig) {
            $.iPSetForwardedIPConfig = iPSetForwardedIPConfig;
            return this;
        }

        public Builder iPSetForwardedIPConfig(WebACLIPSetForwardedIPConfigurationArgs iPSetForwardedIPConfig) {
            return iPSetForwardedIPConfig(Output.of(iPSetForwardedIPConfig));
        }

        public WebACLIPSetReferenceStatementArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
