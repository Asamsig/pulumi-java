// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.ClusterIAMBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterIAMBindingState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterIAMBindingState Empty = new ClusterIAMBindingState();

    /**
     * The name or relative resource id of the cluster to manage IAM policies for.
     * 
     */
    @Import(name="cluster")
    private @Nullable Output<String> cluster;

    /**
     * @return The name or relative resource id of the cluster to manage IAM policies for.
     * 
     */
    public Optional<Output<String>> cluster() {
        return Optional.ofNullable(this.cluster);
    }

    @Import(name="condition")
    private @Nullable Output<ClusterIAMBindingConditionArgs> condition;

    public Optional<Output<ClusterIAMBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * (Computed) The etag of the clusters&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the clusters&#39;s IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="members")
    private @Nullable Output<List<String>> members;

    public Optional<Output<List<String>>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * The project in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.dataproc.ClusterIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.dataproc.ClusterIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private ClusterIAMBindingState() {}

    private ClusterIAMBindingState(ClusterIAMBindingState $) {
        this.cluster = $.cluster;
        this.condition = $.condition;
        this.etag = $.etag;
        this.members = $.members;
        this.project = $.project;
        this.region = $.region;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterIAMBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterIAMBindingState $;

        public Builder() {
            $ = new ClusterIAMBindingState();
        }

        public Builder(ClusterIAMBindingState defaults) {
            $ = new ClusterIAMBindingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cluster The name or relative resource id of the cluster to manage IAM policies for.
         * 
         * @return builder
         * 
         */
        public Builder cluster(@Nullable Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster The name or relative resource id of the cluster to manage IAM policies for.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        public Builder condition(@Nullable Output<ClusterIAMBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(ClusterIAMBindingConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param etag (Computed) The etag of the clusters&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the clusters&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder members(@Nullable Output<List<String>> members) {
            $.members = members;
            return this;
        }

        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        public Builder members(String... members) {
            return members(List.of(members));
        }

        /**
         * @param project The project in which the cluster belongs. If it
         * is not provided, the provider will use a default.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project in which the cluster belongs. If it
         * is not provided, the provider will use a default.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The region in which the cluster belongs. If it
         * is not provided, the provider will use a default.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region in which the cluster belongs. If it
         * is not provided, the provider will use a default.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.dataproc.ClusterIAMBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.dataproc.ClusterIAMBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public ClusterIAMBindingState build() {
            return $;
        }
    }

}
