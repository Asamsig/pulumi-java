// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.auditmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssessmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssessmentPlainArgs Empty = new GetAssessmentPlainArgs();

    @Import(name="assessmentId", required=true)
    private String assessmentId;

    public String assessmentId() {
        return this.assessmentId;
    }

    private GetAssessmentPlainArgs() {}

    private GetAssessmentPlainArgs(GetAssessmentPlainArgs $) {
        this.assessmentId = $.assessmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAssessmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAssessmentPlainArgs $;

        public Builder() {
            $ = new GetAssessmentPlainArgs();
        }

        public Builder(GetAssessmentPlainArgs defaults) {
            $ = new GetAssessmentPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder assessmentId(String assessmentId) {
            $.assessmentId = assessmentId;
            return this;
        }

        public GetAssessmentPlainArgs build() {
            $.assessmentId = Objects.requireNonNull($.assessmentId, "expected parameter 'assessmentId' to be non-null");
            return $;
        }
    }

}
