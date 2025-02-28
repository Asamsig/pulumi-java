// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GameServerDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GameServerDeploymentArgs Empty = new GameServerDeploymentArgs();

    /**
     * Required. The ID of the game server deployment resource to create.
     * 
     */
    @Import(name="deploymentId", required=true)
    private Output<String> deploymentId;

    /**
     * @return Required. The ID of the game server deployment resource to create.
     * 
     */
    public Output<String> deploymentId() {
        return this.deploymentId;
    }

    /**
     * Human readable description of the game server deployment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Human readable description of the game server deployment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Used to perform consistent read-modify-write updates. If not set, a blind &#34;overwrite&#34; update happens.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Used to perform consistent read-modify-write updates. If not set, a blind &#34;overwrite&#34; update happens.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The labels associated with this game server deployment. Each label is a key-value pair.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels associated with this game server deployment. Each label is a key-value pair.
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

    /**
     * The resource name of the game server deployment, in the following form: `projects/{project}/locations/{locationId}/gameServerDeployments/{deploymentId}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-deployment`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the game server deployment, in the following form: `projects/{project}/locations/{locationId}/gameServerDeployments/{deploymentId}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-deployment`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GameServerDeploymentArgs() {}

    private GameServerDeploymentArgs(GameServerDeploymentArgs $) {
        this.deploymentId = $.deploymentId;
        this.description = $.description;
        this.etag = $.etag;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GameServerDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GameServerDeploymentArgs $;

        public Builder() {
            $ = new GameServerDeploymentArgs();
        }

        public Builder(GameServerDeploymentArgs defaults) {
            $ = new GameServerDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentId Required. The ID of the game server deployment resource to create.
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(Output<String> deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        /**
         * @param deploymentId Required. The ID of the game server deployment resource to create.
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(String deploymentId) {
            return deploymentId(Output.of(deploymentId));
        }

        /**
         * @param description Human readable description of the game server deployment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Human readable description of the game server deployment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param etag Used to perform consistent read-modify-write updates. If not set, a blind &#34;overwrite&#34; update happens.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Used to perform consistent read-modify-write updates. If not set, a blind &#34;overwrite&#34; update happens.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param labels The labels associated with this game server deployment. Each label is a key-value pair.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels associated with this game server deployment. Each label is a key-value pair.
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

        /**
         * @param name The resource name of the game server deployment, in the following form: `projects/{project}/locations/{locationId}/gameServerDeployments/{deploymentId}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-deployment`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the game server deployment, in the following form: `projects/{project}/locations/{locationId}/gameServerDeployments/{deploymentId}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-deployment`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GameServerDeploymentArgs build() {
            $.deploymentId = Objects.requireNonNull($.deploymentId, "expected parameter 'deploymentId' to be non-null");
            return $;
        }
    }

}
