// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigtableadmin_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigtableadmin_v2.enums.InstanceType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The clusters to be created within the instance, mapped by desired cluster ID, e.g., just `mycluster` rather than `projects/myproject/instances/myinstance/clusters/mycluster`. Fields marked `OutputOnly` must be left blank.
     * 
     */
    @Import(name="clusters", required=true)
    private Output<Map<String,String>> clusters;

    /**
     * @return The clusters to be created within the instance, mapped by desired cluster ID, e.g., just `mycluster` rather than `projects/myproject/instances/myinstance/clusters/mycluster`. Fields marked `OutputOnly` must be left blank.
     * 
     */
    public Output<Map<String,String>> clusters() {
        return this.clusters;
    }

    /**
     * The descriptive name for this instance as it appears in UIs. Can be changed at any time, but should be kept globally unique to avoid confusion.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The descriptive name for this instance as it appears in UIs. Can be changed at any time, but should be kept globally unique to avoid confusion.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The ID to be used when referring to the new instance within its project, e.g., just `myinstance` rather than `projects/myproject/instances/myinstance`.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The ID to be used when referring to the new instance within its project, e.g., just `myinstance` rather than `projects/myproject/instances/myinstance`.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer&#39;s organizational needs and deployment strategies. They can be used to filter resources and aggregate metrics. * Label keys must be between 1 and 63 characters long and must conform to the regular expression: `\p{Ll}\p{Lo}{0,62}`. * Label values must be between 0 and 63 characters long and must conform to the regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`. * No more than 64 labels can be associated with a given resource. * Keys and values must both be under 128 bytes.
     * 
     */
    @Import(name="labels", required=true)
    private Output<Map<String,String>> labels;

    /**
     * @return Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer&#39;s organizational needs and deployment strategies. They can be used to filter resources and aggregate metrics. * Label keys must be between 1 and 63 characters long and must conform to the regular expression: `\p{Ll}\p{Lo}{0,62}`. * Label values must be between 0 and 63 characters long and must conform to the regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`. * No more than 64 labels can be associated with a given resource. * Keys and values must both be under 128 bytes.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }

    /**
     * The unique name of the instance. Values are of the form `projects/{project}/instances/a-z+[a-z0-9]`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique name of the instance. Values are of the form `projects/{project}/instances/a-z+[a-z0-9]`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The unique name of the project in which to create the new instance. Values are of the form `projects/{project}`.
     * 
     */
    @Import(name="parent", required=true)
    private Output<String> parent;

    /**
     * @return The unique name of the project in which to create the new instance. Values are of the form `projects/{project}`.
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The type of the instance. Defaults to `PRODUCTION`.
     * 
     */
    @Import(name="type", required=true)
    private Output<InstanceType> type;

    /**
     * @return The type of the instance. Defaults to `PRODUCTION`.
     * 
     */
    public Output<InstanceType> type() {
        return this.type;
    }

    private InstanceArgs() {}

    private InstanceArgs(InstanceArgs $) {
        this.clusters = $.clusters;
        this.displayName = $.displayName;
        this.instanceId = $.instanceId;
        this.labels = $.labels;
        this.name = $.name;
        this.parent = $.parent;
        this.project = $.project;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceArgs $;

        public Builder() {
            $ = new InstanceArgs();
        }

        public Builder(InstanceArgs defaults) {
            $ = new InstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusters The clusters to be created within the instance, mapped by desired cluster ID, e.g., just `mycluster` rather than `projects/myproject/instances/myinstance/clusters/mycluster`. Fields marked `OutputOnly` must be left blank.
         * 
         * @return builder
         * 
         */
        public Builder clusters(Output<Map<String,String>> clusters) {
            $.clusters = clusters;
            return this;
        }

        /**
         * @param clusters The clusters to be created within the instance, mapped by desired cluster ID, e.g., just `mycluster` rather than `projects/myproject/instances/myinstance/clusters/mycluster`. Fields marked `OutputOnly` must be left blank.
         * 
         * @return builder
         * 
         */
        public Builder clusters(Map<String,String> clusters) {
            return clusters(Output.of(clusters));
        }

        /**
         * @param displayName The descriptive name for this instance as it appears in UIs. Can be changed at any time, but should be kept globally unique to avoid confusion.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The descriptive name for this instance as it appears in UIs. Can be changed at any time, but should be kept globally unique to avoid confusion.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param instanceId The ID to be used when referring to the new instance within its project, e.g., just `myinstance` rather than `projects/myproject/instances/myinstance`.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID to be used when referring to the new instance within its project, e.g., just `myinstance` rather than `projects/myproject/instances/myinstance`.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param labels Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer&#39;s organizational needs and deployment strategies. They can be used to filter resources and aggregate metrics. * Label keys must be between 1 and 63 characters long and must conform to the regular expression: `\p{Ll}\p{Lo}{0,62}`. * Label values must be between 0 and 63 characters long and must conform to the regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`. * No more than 64 labels can be associated with a given resource. * Keys and values must both be under 128 bytes.
         * 
         * @return builder
         * 
         */
        public Builder labels(Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer&#39;s organizational needs and deployment strategies. They can be used to filter resources and aggregate metrics. * Label keys must be between 1 and 63 characters long and must conform to the regular expression: `\p{Ll}\p{Lo}{0,62}`. * Label values must be between 0 and 63 characters long and must conform to the regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`. * No more than 64 labels can be associated with a given resource. * Keys and values must both be under 128 bytes.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The unique name of the instance. Values are of the form `projects/{project}/instances/a-z+[a-z0-9]`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the instance. Values are of the form `projects/{project}/instances/a-z+[a-z0-9]`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parent The unique name of the project in which to create the new instance. Values are of the form `projects/{project}`.
         * 
         * @return builder
         * 
         */
        public Builder parent(Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The unique name of the project in which to create the new instance. Values are of the form `projects/{project}`.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param type The type of the instance. Defaults to `PRODUCTION`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<InstanceType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the instance. Defaults to `PRODUCTION`.
         * 
         * @return builder
         * 
         */
        public Builder type(InstanceType type) {
            return type(Output.of(type));
        }

        public InstanceArgs build() {
            $.clusters = Objects.requireNonNull($.clusters, "expected parameter 'clusters' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.parent = Objects.requireNonNull($.parent, "expected parameter 'parent' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
