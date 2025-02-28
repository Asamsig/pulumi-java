// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.enums.ContainerType;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOnlineDeploymentLogsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOnlineDeploymentLogsPlainArgs Empty = new GetOnlineDeploymentLogsPlainArgs();

    /**
     * The type of container to retrieve logs from.
     * 
     */
    @Import(name="containerType")
    private @Nullable Either<String,ContainerType> containerType;

    /**
     * @return The type of container to retrieve logs from.
     * 
     */
    public Optional<Either<String,ContainerType>> containerType() {
        return Optional.ofNullable(this.containerType);
    }

    /**
     * The name and identifier for the endpoint.
     * 
     */
    @Import(name="deploymentName", required=true)
    private String deploymentName;

    /**
     * @return The name and identifier for the endpoint.
     * 
     */
    public String deploymentName() {
        return this.deploymentName;
    }

    /**
     * Inference endpoint name.
     * 
     */
    @Import(name="endpointName", required=true)
    private String endpointName;

    /**
     * @return Inference endpoint name.
     * 
     */
    public String endpointName() {
        return this.endpointName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The maximum number of lines to tail.
     * 
     */
    @Import(name="tail")
    private @Nullable Integer tail;

    /**
     * @return The maximum number of lines to tail.
     * 
     */
    public Optional<Integer> tail() {
        return Optional.ofNullable(this.tail);
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return Name of Azure Machine Learning workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetOnlineDeploymentLogsPlainArgs() {}

    private GetOnlineDeploymentLogsPlainArgs(GetOnlineDeploymentLogsPlainArgs $) {
        this.containerType = $.containerType;
        this.deploymentName = $.deploymentName;
        this.endpointName = $.endpointName;
        this.resourceGroupName = $.resourceGroupName;
        this.tail = $.tail;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOnlineDeploymentLogsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOnlineDeploymentLogsPlainArgs $;

        public Builder() {
            $ = new GetOnlineDeploymentLogsPlainArgs();
        }

        public Builder(GetOnlineDeploymentLogsPlainArgs defaults) {
            $ = new GetOnlineDeploymentLogsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerType The type of container to retrieve logs from.
         * 
         * @return builder
         * 
         */
        public Builder containerType(@Nullable Either<String,ContainerType> containerType) {
            $.containerType = containerType;
            return this;
        }

        /**
         * @param containerType The type of container to retrieve logs from.
         * 
         * @return builder
         * 
         */
        public Builder containerType(String containerType) {
            return containerType(Either.ofLeft(containerType));
        }

        /**
         * @param containerType The type of container to retrieve logs from.
         * 
         * @return builder
         * 
         */
        public Builder containerType(ContainerType containerType) {
            return containerType(Either.ofRight(containerType));
        }

        /**
         * @param deploymentName The name and identifier for the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder deploymentName(String deploymentName) {
            $.deploymentName = deploymentName;
            return this;
        }

        /**
         * @param endpointName Inference endpoint name.
         * 
         * @return builder
         * 
         */
        public Builder endpointName(String endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param tail The maximum number of lines to tail.
         * 
         * @return builder
         * 
         */
        public Builder tail(@Nullable Integer tail) {
            $.tail = tail;
            return this;
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetOnlineDeploymentLogsPlainArgs build() {
            $.deploymentName = Objects.requireNonNull($.deploymentName, "expected parameter 'deploymentName' to be non-null");
            $.endpointName = Objects.requireNonNull($.endpointName, "expected parameter 'endpointName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
