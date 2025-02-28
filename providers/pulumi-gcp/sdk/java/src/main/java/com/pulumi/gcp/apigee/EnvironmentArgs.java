// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Optional. API Proxy type supported by the environment. The type can be set when creating
     * the Environment and cannot be changed.
     * Possible values are `API_PROXY_TYPE_UNSPECIFIED`, `PROGRAMMABLE`, and `CONFIGURABLE`.
     * 
     */
    @Import(name="apiProxyType")
    private @Nullable Output<String> apiProxyType;

    /**
     * @return Optional. API Proxy type supported by the environment. The type can be set when creating
     * the Environment and cannot be changed.
     * Possible values are `API_PROXY_TYPE_UNSPECIFIED`, `PROGRAMMABLE`, and `CONFIGURABLE`.
     * 
     */
    public Optional<Output<String>> apiProxyType() {
        return Optional.ofNullable(this.apiProxyType);
    }

    /**
     * Optional. Deployment type supported by the environment. The deployment type can be
     * set when creating the environment and cannot be changed. When you enable archive
     * deployment, you will be prevented from performing a subset of actions within the
     * environment, including:
     * Managing the deployment of API proxy or shared flow revisions;
     * Creating, updating, or deleting resource files;
     * Creating, updating, or deleting target servers.
     * Possible values are `DEPLOYMENT_TYPE_UNSPECIFIED`, `PROXY`, and `ARCHIVE`.
     * 
     */
    @Import(name="deploymentType")
    private @Nullable Output<String> deploymentType;

    /**
     * @return Optional. Deployment type supported by the environment. The deployment type can be
     * set when creating the environment and cannot be changed. When you enable archive
     * deployment, you will be prevented from performing a subset of actions within the
     * environment, including:
     * Managing the deployment of API proxy or shared flow revisions;
     * Creating, updating, or deleting resource files;
     * Creating, updating, or deleting target servers.
     * Possible values are `DEPLOYMENT_TYPE_UNSPECIFIED`, `PROXY`, and `ARCHIVE`.
     * 
     */
    public Optional<Output<String>> deploymentType() {
        return Optional.ofNullable(this.deploymentType);
    }

    /**
     * Description of the environment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the environment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Display name of the environment.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Display name of the environment.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The resource ID of the environment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource ID of the environment.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Apigee Organization associated with the Apigee environment,
     * in the format `organizations/{{org_name}}`.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return The Apigee Organization associated with the Apigee environment,
     * in the format `organizations/{{org_name}}`.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }

    private EnvironmentArgs() {}

    private EnvironmentArgs(EnvironmentArgs $) {
        this.apiProxyType = $.apiProxyType;
        this.deploymentType = $.deploymentType;
        this.description = $.description;
        this.displayName = $.displayName;
        this.name = $.name;
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentArgs $;

        public Builder() {
            $ = new EnvironmentArgs();
        }

        public Builder(EnvironmentArgs defaults) {
            $ = new EnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiProxyType Optional. API Proxy type supported by the environment. The type can be set when creating
         * the Environment and cannot be changed.
         * Possible values are `API_PROXY_TYPE_UNSPECIFIED`, `PROGRAMMABLE`, and `CONFIGURABLE`.
         * 
         * @return builder
         * 
         */
        public Builder apiProxyType(@Nullable Output<String> apiProxyType) {
            $.apiProxyType = apiProxyType;
            return this;
        }

        /**
         * @param apiProxyType Optional. API Proxy type supported by the environment. The type can be set when creating
         * the Environment and cannot be changed.
         * Possible values are `API_PROXY_TYPE_UNSPECIFIED`, `PROGRAMMABLE`, and `CONFIGURABLE`.
         * 
         * @return builder
         * 
         */
        public Builder apiProxyType(String apiProxyType) {
            return apiProxyType(Output.of(apiProxyType));
        }

        /**
         * @param deploymentType Optional. Deployment type supported by the environment. The deployment type can be
         * set when creating the environment and cannot be changed. When you enable archive
         * deployment, you will be prevented from performing a subset of actions within the
         * environment, including:
         * Managing the deployment of API proxy or shared flow revisions;
         * Creating, updating, or deleting resource files;
         * Creating, updating, or deleting target servers.
         * Possible values are `DEPLOYMENT_TYPE_UNSPECIFIED`, `PROXY`, and `ARCHIVE`.
         * 
         * @return builder
         * 
         */
        public Builder deploymentType(@Nullable Output<String> deploymentType) {
            $.deploymentType = deploymentType;
            return this;
        }

        /**
         * @param deploymentType Optional. Deployment type supported by the environment. The deployment type can be
         * set when creating the environment and cannot be changed. When you enable archive
         * deployment, you will be prevented from performing a subset of actions within the
         * environment, including:
         * Managing the deployment of API proxy or shared flow revisions;
         * Creating, updating, or deleting resource files;
         * Creating, updating, or deleting target servers.
         * Possible values are `DEPLOYMENT_TYPE_UNSPECIFIED`, `PROXY`, and `ARCHIVE`.
         * 
         * @return builder
         * 
         */
        public Builder deploymentType(String deploymentType) {
            return deploymentType(Output.of(deploymentType));
        }

        /**
         * @param description Description of the environment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the environment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Display name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param name The resource ID of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource ID of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId The Apigee Organization associated with the Apigee environment,
         * in the format `organizations/{{org_name}}`.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId The Apigee Organization associated with the Apigee environment,
         * in the format `organizations/{{org_name}}`.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public EnvironmentArgs build() {
            $.orgId = Objects.requireNonNull($.orgId, "expected parameter 'orgId' to be non-null");
            return $;
        }
    }

}
