// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.gkebackup_v1.outputs.RestoreConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRestorePlanResult {
    /**
     * @return Immutable. The BackupPlan from which Backups may be used as the source for Restores created via this RestorePlan. Format: projects/*{@literal /}locations/*{@literal /}backupPlans/*.
     * 
     */
    private final String backupPlan;
    /**
     * @return Immutable. The target cluster into which Restores created via this RestorePlan will restore data. NOTE: the cluster&#39;s region must be the same as the RestorePlan. Possible formats: 1. projects/*{@literal /}locations/*{@literal /}clusters/* 2. projects/*{@literal /}zones/*{@literal /}clusters/*
     * 
     */
    private final String cluster;
    /**
     * @return The timestamp when this RestorePlan resource was created - can be converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
     * 
     */
    private final String createTime;
    /**
     * @return User specified descriptive string for this RestorePlan.
     * 
     */
    private final String description;
    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a restore from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform restore updates in order to avoid race conditions: An `etag` is returned in the response to `GetRestorePlan`, and systems are expected to put that etag in the request to `UpdateRestorePlan` to ensure that their change will be applied to the same version.
     * 
     */
    private final String etag;
    /**
     * @return A set of custom labels supplied by user.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The full name of the RestorePlan resource. Format: projects/*{@literal /}locations/*{@literal /}restorePlans/*
     * 
     */
    private final String name;
    /**
     * @return Configuration of Restores created via this RestorePlan.
     * 
     */
    private final RestoreConfigResponse restoreConfig;
    /**
     * @return Server generated global unique identifier of [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
     * 
     */
    private final String uid;
    /**
     * @return The timestamp when this RestorePlan resource was last updated - can be converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetRestorePlanResult(
        @CustomType.Parameter("backupPlan") String backupPlan,
        @CustomType.Parameter("cluster") String cluster,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("restoreConfig") RestoreConfigResponse restoreConfig,
        @CustomType.Parameter("uid") String uid,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.backupPlan = backupPlan;
        this.cluster = cluster;
        this.createTime = createTime;
        this.description = description;
        this.etag = etag;
        this.labels = labels;
        this.name = name;
        this.restoreConfig = restoreConfig;
        this.uid = uid;
        this.updateTime = updateTime;
    }

    /**
     * @return Immutable. The BackupPlan from which Backups may be used as the source for Restores created via this RestorePlan. Format: projects/*{@literal /}locations/*{@literal /}backupPlans/*.
     * 
     */
    public String backupPlan() {
        return this.backupPlan;
    }
    /**
     * @return Immutable. The target cluster into which Restores created via this RestorePlan will restore data. NOTE: the cluster&#39;s region must be the same as the RestorePlan. Possible formats: 1. projects/*{@literal /}locations/*{@literal /}clusters/* 2. projects/*{@literal /}zones/*{@literal /}clusters/*
     * 
     */
    public String cluster() {
        return this.cluster;
    }
    /**
     * @return The timestamp when this RestorePlan resource was created - can be converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return User specified descriptive string for this RestorePlan.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a restore from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform restore updates in order to avoid race conditions: An `etag` is returned in the response to `GetRestorePlan`, and systems are expected to put that etag in the request to `UpdateRestorePlan` to ensure that their change will be applied to the same version.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return A set of custom labels supplied by user.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The full name of the RestorePlan resource. Format: projects/*{@literal /}locations/*{@literal /}restorePlans/*
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Configuration of Restores created via this RestorePlan.
     * 
     */
    public RestoreConfigResponse restoreConfig() {
        return this.restoreConfig;
    }
    /**
     * @return Server generated global unique identifier of [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
     * 
     */
    public String uid() {
        return this.uid;
    }
    /**
     * @return The timestamp when this RestorePlan resource was last updated - can be converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRestorePlanResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupPlan;
        private String cluster;
        private String createTime;
        private String description;
        private String etag;
        private Map<String,String> labels;
        private String name;
        private RestoreConfigResponse restoreConfig;
        private String uid;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRestorePlanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPlan = defaults.backupPlan;
    	      this.cluster = defaults.cluster;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.restoreConfig = defaults.restoreConfig;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder backupPlan(String backupPlan) {
            this.backupPlan = Objects.requireNonNull(backupPlan);
            return this;
        }
        public Builder cluster(String cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder restoreConfig(RestoreConfigResponse restoreConfig) {
            this.restoreConfig = Objects.requireNonNull(restoreConfig);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetRestorePlanResult build() {
            return new GetRestorePlanResult(backupPlan, cluster, createTime, description, etag, labels, name, restoreConfig, uid, updateTime);
        }
    }
}
