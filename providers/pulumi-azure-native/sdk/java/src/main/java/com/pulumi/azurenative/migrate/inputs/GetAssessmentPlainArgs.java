// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssessmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssessmentPlainArgs Empty = new GetAssessmentPlainArgs();

    /**
     * Unique name of an assessment within a project.
     * 
     */
    @Import(name="assessmentName", required=true)
    private String assessmentName;

    /**
     * @return Unique name of an assessment within a project.
     * 
     */
    public String assessmentName() {
        return this.assessmentName;
    }

    /**
     * Unique name of a group within a project.
     * 
     */
    @Import(name="groupName", required=true)
    private String groupName;

    /**
     * @return Unique name of a group within a project.
     * 
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="projectName", required=true)
    private String projectName;

    /**
     * @return Name of the Azure Migrate project.
     * 
     */
    public String projectName() {
        return this.projectName;
    }

    /**
     * Name of the Azure Resource Group that project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the Azure Resource Group that project is part of.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAssessmentPlainArgs() {}

    private GetAssessmentPlainArgs(GetAssessmentPlainArgs $) {
        this.assessmentName = $.assessmentName;
        this.groupName = $.groupName;
        this.projectName = $.projectName;
        this.resourceGroupName = $.resourceGroupName;
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

        /**
         * @param assessmentName Unique name of an assessment within a project.
         * 
         * @return builder
         * 
         */
        public Builder assessmentName(String assessmentName) {
            $.assessmentName = assessmentName;
            return this;
        }

        /**
         * @param groupName Unique name of a group within a project.
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            $.groupName = groupName;
            return this;
        }

        /**
         * @param projectName Name of the Azure Migrate project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group that project is part of.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetAssessmentPlainArgs build() {
            $.assessmentName = Objects.requireNonNull($.assessmentName, "expected parameter 'assessmentName' to be non-null");
            $.groupName = Objects.requireNonNull($.groupName, "expected parameter 'groupName' to be non-null");
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
