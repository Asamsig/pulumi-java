// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration;

import com.pulumi.azurenative.datamigration.inputs.ProjectFilePropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileArgs Empty = new FileArgs();

    /**
     * Name of the File
     * 
     */
    @Import(name="fileName")
    private @Nullable Output<String> fileName;

    /**
     * @return Name of the File
     * 
     */
    public Optional<Output<String>> fileName() {
        return Optional.ofNullable(this.fileName);
    }

    /**
     * Name of the resource group
     * 
     */
    @Import(name="groupName", required=true)
    private Output<String> groupName;

    /**
     * @return Name of the resource group
     * 
     */
    public Output<String> groupName() {
        return this.groupName;
    }

    /**
     * Name of the project
     * 
     */
    @Import(name="projectName", required=true)
    private Output<String> projectName;

    /**
     * @return Name of the project
     * 
     */
    public Output<String> projectName() {
        return this.projectName;
    }

    /**
     * Custom file properties
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ProjectFilePropertiesArgs> properties;

    /**
     * @return Custom file properties
     * 
     */
    public Optional<Output<ProjectFilePropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Name of the service
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return Name of the service
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private FileArgs() {}

    private FileArgs(FileArgs $) {
        this.fileName = $.fileName;
        this.groupName = $.groupName;
        this.projectName = $.projectName;
        this.properties = $.properties;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileArgs $;

        public Builder() {
            $ = new FileArgs();
        }

        public Builder(FileArgs defaults) {
            $ = new FileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileName Name of the File
         * 
         * @return builder
         * 
         */
        public Builder fileName(@Nullable Output<String> fileName) {
            $.fileName = fileName;
            return this;
        }

        /**
         * @param fileName Name of the File
         * 
         * @return builder
         * 
         */
        public Builder fileName(String fileName) {
            return fileName(Output.of(fileName));
        }

        /**
         * @param groupName Name of the resource group
         * 
         * @return builder
         * 
         */
        public Builder groupName(Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        /**
         * @param groupName Name of the resource group
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        /**
         * @param projectName Name of the project
         * 
         * @return builder
         * 
         */
        public Builder projectName(Output<String> projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param projectName Name of the project
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            return projectName(Output.of(projectName));
        }

        /**
         * @param properties Custom file properties
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<ProjectFilePropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Custom file properties
         * 
         * @return builder
         * 
         */
        public Builder properties(ProjectFilePropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param serviceName Name of the service
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Name of the service
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public FileArgs build() {
            $.groupName = Objects.requireNonNull($.groupName, "expected parameter 'groupName' to be non-null");
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
