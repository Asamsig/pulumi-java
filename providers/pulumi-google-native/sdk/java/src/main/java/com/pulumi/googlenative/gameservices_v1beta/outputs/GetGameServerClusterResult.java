// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.gameservices_v1beta.outputs.GameServerClusterConnectionInfoResponse;
import com.pulumi.googlenative.gameservices_v1beta.outputs.KubernetesClusterStateResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetGameServerClusterResult {
    /**
     * @return The state of the Kubernetes cluster in preview. This will be available if view is set to FULL in the relevant list/get/preview request.
     * 
     */
    private final KubernetesClusterStateResponse clusterState;
    /**
     * @return The game server cluster connection information. This information is used to manage game server clusters.
     * 
     */
    private final GameServerClusterConnectionInfoResponse connectionInfo;
    /**
     * @return The creation time.
     * 
     */
    private final String createTime;
    /**
     * @return Human readable description of the cluster.
     * 
     */
    private final String description;
    /**
     * @return Used to perform consistent read-modify-write updates. If not set, a blind &#34;overwrite&#34; update happens.
     * 
     */
    private final String etag;
    /**
     * @return The labels associated with this game server cluster. Each label is a key-value pair.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The resource name of the game server cluster, in the following form: `projects/{project}/locations/{locationId}/realms/{realmId}/gameServerClusters/{gameServerClusterId}`. For example, `projects/my-project/locations/global/realms/zanzibar/gameServerClusters/my-gke-cluster`.
     * 
     */
    private final String name;
    /**
     * @return The last-modified time.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetGameServerClusterResult(
        @CustomType.Parameter("clusterState") KubernetesClusterStateResponse clusterState,
        @CustomType.Parameter("connectionInfo") GameServerClusterConnectionInfoResponse connectionInfo,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.clusterState = clusterState;
        this.connectionInfo = connectionInfo;
        this.createTime = createTime;
        this.description = description;
        this.etag = etag;
        this.labels = labels;
        this.name = name;
        this.updateTime = updateTime;
    }

    /**
     * @return The state of the Kubernetes cluster in preview. This will be available if view is set to FULL in the relevant list/get/preview request.
     * 
     */
    public KubernetesClusterStateResponse clusterState() {
        return this.clusterState;
    }
    /**
     * @return The game server cluster connection information. This information is used to manage game server clusters.
     * 
     */
    public GameServerClusterConnectionInfoResponse connectionInfo() {
        return this.connectionInfo;
    }
    /**
     * @return The creation time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Human readable description of the cluster.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Used to perform consistent read-modify-write updates. If not set, a blind &#34;overwrite&#34; update happens.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The labels associated with this game server cluster. Each label is a key-value pair.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The resource name of the game server cluster, in the following form: `projects/{project}/locations/{locationId}/realms/{realmId}/gameServerClusters/{gameServerClusterId}`. For example, `projects/my-project/locations/global/realms/zanzibar/gameServerClusters/my-gke-cluster`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The last-modified time.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGameServerClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterStateResponse clusterState;
        private GameServerClusterConnectionInfoResponse connectionInfo;
        private String createTime;
        private String description;
        private String etag;
        private Map<String,String> labels;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGameServerClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterState = defaults.clusterState;
    	      this.connectionInfo = defaults.connectionInfo;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder clusterState(KubernetesClusterStateResponse clusterState) {
            this.clusterState = Objects.requireNonNull(clusterState);
            return this;
        }
        public Builder connectionInfo(GameServerClusterConnectionInfoResponse connectionInfo) {
            this.connectionInfo = Objects.requireNonNull(connectionInfo);
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
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetGameServerClusterResult build() {
            return new GetGameServerClusterResult(clusterState, connectionInfo, createTime, description, etag, labels, name, updateTime);
        }
    }
}
