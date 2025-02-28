// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gkebackup_v1.inputs.BackupConfigArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.RetentionPolicyArgs;
import com.pulumi.googlenative.gkebackup_v1.inputs.ScheduleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupPlanArgs Empty = new BackupPlanArgs();

    /**
     * Defines the configuration of Backups created via this BackupPlan.
     * 
     */
    @Import(name="backupConfig")
    private @Nullable Output<BackupConfigArgs> backupConfig;

    /**
     * @return Defines the configuration of Backups created via this BackupPlan.
     * 
     */
    public Optional<Output<BackupConfigArgs>> backupConfig() {
        return Optional.ofNullable(this.backupConfig);
    }

    /**
     * Required. The client-provided short name for the BackupPlan resource. This name must: a. be between 1 and 63 characters long (inclusive) b. consist of only lower-case ASCII letters, numbers, and dashes c. start with a lower-case letter d. end with a lower-case letter or number e. be unique within the set of BackupPlans in this location
     * 
     */
    @Import(name="backupPlanId", required=true)
    private Output<String> backupPlanId;

    /**
     * @return Required. The client-provided short name for the BackupPlan resource. This name must: a. be between 1 and 63 characters long (inclusive) b. consist of only lower-case ASCII letters, numbers, and dashes c. start with a lower-case letter d. end with a lower-case letter or number e. be unique within the set of BackupPlans in this location
     * 
     */
    public Output<String> backupPlanId() {
        return this.backupPlanId;
    }

    /**
     * Defines a schedule for automatic Backup creation via this BackupPlan.
     * 
     */
    @Import(name="backupSchedule")
    private @Nullable Output<ScheduleArgs> backupSchedule;

    /**
     * @return Defines a schedule for automatic Backup creation via this BackupPlan.
     * 
     */
    public Optional<Output<ScheduleArgs>> backupSchedule() {
        return Optional.ofNullable(this.backupSchedule);
    }

    /**
     * Immutable. The source cluster from which Backups will be created via this BackupPlan. Possible formats: 1. projects/*{@literal /}locations/*{@literal /}clusters/* 2. projects/*{@literal /}zones/*{@literal /}clusters/*
     * 
     */
    @Import(name="cluster", required=true)
    private Output<String> cluster;

    /**
     * @return Immutable. The source cluster from which Backups will be created via this BackupPlan. Possible formats: 1. projects/*{@literal /}locations/*{@literal /}clusters/* 2. projects/*{@literal /}zones/*{@literal /}clusters/*
     * 
     */
    public Output<String> cluster() {
        return this.cluster;
    }

    /**
     * This flag indicates whether this BackupPlan has been deactivated. Setting this field to True locks the BackupPlan such that no further updates will be allowed, including the deactivated field. It also prevents any new Backups from being created via this BackupPlan (including scheduled Backups). Default: False
     * 
     */
    @Import(name="deactivated")
    private @Nullable Output<Boolean> deactivated;

    /**
     * @return This flag indicates whether this BackupPlan has been deactivated. Setting this field to True locks the BackupPlan such that no further updates will be allowed, including the deactivated field. It also prevents any new Backups from being created via this BackupPlan (including scheduled Backups). Default: False
     * 
     */
    public Optional<Output<Boolean>> deactivated() {
        return Optional.ofNullable(this.deactivated);
    }

    /**
     * User specified descriptive string for this BackupPlan.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User specified descriptive string for this BackupPlan.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A set of custom labels supplied by user.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return A set of custom labels supplied by user.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * RetentionPolicy governs lifecycle of Backups created under this plan.
     * 
     */
    @Import(name="retentionPolicy")
    private @Nullable Output<RetentionPolicyArgs> retentionPolicy;

    /**
     * @return RetentionPolicy governs lifecycle of Backups created under this plan.
     * 
     */
    public Optional<Output<RetentionPolicyArgs>> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    private BackupPlanArgs() {}

    private BackupPlanArgs(BackupPlanArgs $) {
        this.backupConfig = $.backupConfig;
        this.backupPlanId = $.backupPlanId;
        this.backupSchedule = $.backupSchedule;
        this.cluster = $.cluster;
        this.deactivated = $.deactivated;
        this.description = $.description;
        this.labels = $.labels;
        this.location = $.location;
        this.project = $.project;
        this.retentionPolicy = $.retentionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPlanArgs $;

        public Builder() {
            $ = new BackupPlanArgs();
        }

        public Builder(BackupPlanArgs defaults) {
            $ = new BackupPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupConfig Defines the configuration of Backups created via this BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder backupConfig(@Nullable Output<BackupConfigArgs> backupConfig) {
            $.backupConfig = backupConfig;
            return this;
        }

        /**
         * @param backupConfig Defines the configuration of Backups created via this BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder backupConfig(BackupConfigArgs backupConfig) {
            return backupConfig(Output.of(backupConfig));
        }

        /**
         * @param backupPlanId Required. The client-provided short name for the BackupPlan resource. This name must: a. be between 1 and 63 characters long (inclusive) b. consist of only lower-case ASCII letters, numbers, and dashes c. start with a lower-case letter d. end with a lower-case letter or number e. be unique within the set of BackupPlans in this location
         * 
         * @return builder
         * 
         */
        public Builder backupPlanId(Output<String> backupPlanId) {
            $.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * @param backupPlanId Required. The client-provided short name for the BackupPlan resource. This name must: a. be between 1 and 63 characters long (inclusive) b. consist of only lower-case ASCII letters, numbers, and dashes c. start with a lower-case letter d. end with a lower-case letter or number e. be unique within the set of BackupPlans in this location
         * 
         * @return builder
         * 
         */
        public Builder backupPlanId(String backupPlanId) {
            return backupPlanId(Output.of(backupPlanId));
        }

        /**
         * @param backupSchedule Defines a schedule for automatic Backup creation via this BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder backupSchedule(@Nullable Output<ScheduleArgs> backupSchedule) {
            $.backupSchedule = backupSchedule;
            return this;
        }

        /**
         * @param backupSchedule Defines a schedule for automatic Backup creation via this BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder backupSchedule(ScheduleArgs backupSchedule) {
            return backupSchedule(Output.of(backupSchedule));
        }

        /**
         * @param cluster Immutable. The source cluster from which Backups will be created via this BackupPlan. Possible formats: 1. projects/*{@literal /}locations/*{@literal /}clusters/* 2. projects/*{@literal /}zones/*{@literal /}clusters/*
         * 
         * @return builder
         * 
         */
        public Builder cluster(Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster Immutable. The source cluster from which Backups will be created via this BackupPlan. Possible formats: 1. projects/*{@literal /}locations/*{@literal /}clusters/* 2. projects/*{@literal /}zones/*{@literal /}clusters/*
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param deactivated This flag indicates whether this BackupPlan has been deactivated. Setting this field to True locks the BackupPlan such that no further updates will be allowed, including the deactivated field. It also prevents any new Backups from being created via this BackupPlan (including scheduled Backups). Default: False
         * 
         * @return builder
         * 
         */
        public Builder deactivated(@Nullable Output<Boolean> deactivated) {
            $.deactivated = deactivated;
            return this;
        }

        /**
         * @param deactivated This flag indicates whether this BackupPlan has been deactivated. Setting this field to True locks the BackupPlan such that no further updates will be allowed, including the deactivated field. It also prevents any new Backups from being created via this BackupPlan (including scheduled Backups). Default: False
         * 
         * @return builder
         * 
         */
        public Builder deactivated(Boolean deactivated) {
            return deactivated(Output.of(deactivated));
        }

        /**
         * @param description User specified descriptive string for this BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User specified descriptive string for this BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels A set of custom labels supplied by user.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A set of custom labels supplied by user.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param retentionPolicy RetentionPolicy governs lifecycle of Backups created under this plan.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(@Nullable Output<RetentionPolicyArgs> retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * @param retentionPolicy RetentionPolicy governs lifecycle of Backups created under this plan.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(RetentionPolicyArgs retentionPolicy) {
            return retentionPolicy(Output.of(retentionPolicy));
        }

        public BackupPlanArgs build() {
            $.backupPlanId = Objects.requireNonNull($.backupPlanId, "expected parameter 'backupPlanId' to be non-null");
            $.cluster = Objects.requireNonNull($.cluster, "expected parameter 'cluster' to be non-null");
            return $;
        }
    }

}
