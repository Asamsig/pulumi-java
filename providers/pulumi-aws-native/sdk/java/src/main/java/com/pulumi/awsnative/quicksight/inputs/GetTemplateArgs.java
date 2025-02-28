// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTemplateArgs Empty = new GetTemplateArgs();

    @Import(name="awsAccountId", required=true)
    private Output<String> awsAccountId;

    public Output<String> awsAccountId() {
        return this.awsAccountId;
    }

    @Import(name="templateId", required=true)
    private Output<String> templateId;

    public Output<String> templateId() {
        return this.templateId;
    }

    private GetTemplateArgs() {}

    private GetTemplateArgs(GetTemplateArgs $) {
        this.awsAccountId = $.awsAccountId;
        this.templateId = $.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTemplateArgs $;

        public Builder() {
            $ = new GetTemplateArgs();
        }

        public Builder(GetTemplateArgs defaults) {
            $ = new GetTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder awsAccountId(Output<String> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        public Builder awsAccountId(String awsAccountId) {
            return awsAccountId(Output.of(awsAccountId));
        }

        public Builder templateId(Output<String> templateId) {
            $.templateId = templateId;
            return this;
        }

        public Builder templateId(String templateId) {
            return templateId(Output.of(templateId));
        }

        public GetTemplateArgs build() {
            $.awsAccountId = Objects.requireNonNull($.awsAccountId, "expected parameter 'awsAccountId' to be non-null");
            $.templateId = Objects.requireNonNull($.templateId, "expected parameter 'templateId' to be non-null");
            return $;
        }
    }

}
