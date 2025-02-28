// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccessReviewScheduleDefinitionByIdPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessReviewScheduleDefinitionByIdPlainArgs Empty = new GetAccessReviewScheduleDefinitionByIdPlainArgs();

    /**
     * The id of the access review schedule definition.
     * 
     */
    @Import(name="scheduleDefinitionId", required=true)
    private String scheduleDefinitionId;

    /**
     * @return The id of the access review schedule definition.
     * 
     */
    public String scheduleDefinitionId() {
        return this.scheduleDefinitionId;
    }

    private GetAccessReviewScheduleDefinitionByIdPlainArgs() {}

    private GetAccessReviewScheduleDefinitionByIdPlainArgs(GetAccessReviewScheduleDefinitionByIdPlainArgs $) {
        this.scheduleDefinitionId = $.scheduleDefinitionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessReviewScheduleDefinitionByIdPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessReviewScheduleDefinitionByIdPlainArgs $;

        public Builder() {
            $ = new GetAccessReviewScheduleDefinitionByIdPlainArgs();
        }

        public Builder(GetAccessReviewScheduleDefinitionByIdPlainArgs defaults) {
            $ = new GetAccessReviewScheduleDefinitionByIdPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scheduleDefinitionId The id of the access review schedule definition.
         * 
         * @return builder
         * 
         */
        public Builder scheduleDefinitionId(String scheduleDefinitionId) {
            $.scheduleDefinitionId = scheduleDefinitionId;
            return this;
        }

        public GetAccessReviewScheduleDefinitionByIdPlainArgs build() {
            $.scheduleDefinitionId = Objects.requireNonNull($.scheduleDefinitionId, "expected parameter 'scheduleDefinitionId' to be non-null");
            return $;
        }
    }

}
