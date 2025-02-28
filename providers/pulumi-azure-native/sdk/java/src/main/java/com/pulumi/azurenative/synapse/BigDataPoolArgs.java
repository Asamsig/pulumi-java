// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.synapse.enums.NodeSize;
import com.pulumi.azurenative.synapse.enums.NodeSizeFamily;
import com.pulumi.azurenative.synapse.inputs.AutoPausePropertiesArgs;
import com.pulumi.azurenative.synapse.inputs.AutoScalePropertiesArgs;
import com.pulumi.azurenative.synapse.inputs.DynamicExecutorAllocationArgs;
import com.pulumi.azurenative.synapse.inputs.LibraryInfoArgs;
import com.pulumi.azurenative.synapse.inputs.LibraryRequirementsArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BigDataPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final BigDataPoolArgs Empty = new BigDataPoolArgs();

    /**
     * Auto-pausing properties
     * 
     */
    @Import(name="autoPause")
    private @Nullable Output<AutoPausePropertiesArgs> autoPause;

    /**
     * @return Auto-pausing properties
     * 
     */
    public Optional<Output<AutoPausePropertiesArgs>> autoPause() {
        return Optional.ofNullable(this.autoPause);
    }

    /**
     * Auto-scaling properties
     * 
     */
    @Import(name="autoScale")
    private @Nullable Output<AutoScalePropertiesArgs> autoScale;

    /**
     * @return Auto-scaling properties
     * 
     */
    public Optional<Output<AutoScalePropertiesArgs>> autoScale() {
        return Optional.ofNullable(this.autoScale);
    }

    /**
     * Big Data pool name
     * 
     */
    @Import(name="bigDataPoolName")
    private @Nullable Output<String> bigDataPoolName;

    /**
     * @return Big Data pool name
     * 
     */
    public Optional<Output<String>> bigDataPoolName() {
        return Optional.ofNullable(this.bigDataPoolName);
    }

    /**
     * The cache size
     * 
     */
    @Import(name="cacheSize")
    private @Nullable Output<Integer> cacheSize;

    /**
     * @return The cache size
     * 
     */
    public Optional<Output<Integer>> cacheSize() {
        return Optional.ofNullable(this.cacheSize);
    }

    /**
     * The time when the Big Data pool was created.
     * 
     */
    @Import(name="creationDate")
    private @Nullable Output<String> creationDate;

    /**
     * @return The time when the Big Data pool was created.
     * 
     */
    public Optional<Output<String>> creationDate() {
        return Optional.ofNullable(this.creationDate);
    }

    /**
     * List of custom libraries/packages associated with the spark pool.
     * 
     */
    @Import(name="customLibraries")
    private @Nullable Output<List<LibraryInfoArgs>> customLibraries;

    /**
     * @return List of custom libraries/packages associated with the spark pool.
     * 
     */
    public Optional<Output<List<LibraryInfoArgs>>> customLibraries() {
        return Optional.ofNullable(this.customLibraries);
    }

    /**
     * The default folder where Spark logs will be written.
     * 
     */
    @Import(name="defaultSparkLogFolder")
    private @Nullable Output<String> defaultSparkLogFolder;

    /**
     * @return The default folder where Spark logs will be written.
     * 
     */
    public Optional<Output<String>> defaultSparkLogFolder() {
        return Optional.ofNullable(this.defaultSparkLogFolder);
    }

    /**
     * Dynamic Executor Allocation
     * 
     */
    @Import(name="dynamicExecutorAllocation")
    private @Nullable Output<DynamicExecutorAllocationArgs> dynamicExecutorAllocation;

    /**
     * @return Dynamic Executor Allocation
     * 
     */
    public Optional<Output<DynamicExecutorAllocationArgs>> dynamicExecutorAllocation() {
        return Optional.ofNullable(this.dynamicExecutorAllocation);
    }

    /**
     * Whether to stop any running jobs in the Big Data pool
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return Whether to stop any running jobs in the Big Data pool
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * Whether compute isolation is required or not.
     * 
     */
    @Import(name="isComputeIsolationEnabled")
    private @Nullable Output<Boolean> isComputeIsolationEnabled;

    /**
     * @return Whether compute isolation is required or not.
     * 
     */
    public Optional<Output<Boolean>> isComputeIsolationEnabled() {
        return Optional.ofNullable(this.isComputeIsolationEnabled);
    }

    /**
     * Library version requirements
     * 
     */
    @Import(name="libraryRequirements")
    private @Nullable Output<LibraryRequirementsArgs> libraryRequirements;

    /**
     * @return Library version requirements
     * 
     */
    public Optional<Output<LibraryRequirementsArgs>> libraryRequirements() {
        return Optional.ofNullable(this.libraryRequirements);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The number of nodes in the Big Data pool.
     * 
     */
    @Import(name="nodeCount")
    private @Nullable Output<Integer> nodeCount;

    /**
     * @return The number of nodes in the Big Data pool.
     * 
     */
    public Optional<Output<Integer>> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }

    /**
     * The level of compute power that each node in the Big Data pool has.
     * 
     */
    @Import(name="nodeSize")
    private @Nullable Output<Either<String,NodeSize>> nodeSize;

    /**
     * @return The level of compute power that each node in the Big Data pool has.
     * 
     */
    public Optional<Output<Either<String,NodeSize>>> nodeSize() {
        return Optional.ofNullable(this.nodeSize);
    }

    /**
     * The kind of nodes that the Big Data pool provides.
     * 
     */
    @Import(name="nodeSizeFamily")
    private @Nullable Output<Either<String,NodeSizeFamily>> nodeSizeFamily;

    /**
     * @return The kind of nodes that the Big Data pool provides.
     * 
     */
    public Optional<Output<Either<String,NodeSizeFamily>>> nodeSizeFamily() {
        return Optional.ofNullable(this.nodeSizeFamily);
    }

    /**
     * The state of the Big Data pool.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<String> provisioningState;

    /**
     * @return The state of the Big Data pool.
     * 
     */
    public Optional<Output<String>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Whether session level packages enabled.
     * 
     */
    @Import(name="sessionLevelPackagesEnabled")
    private @Nullable Output<Boolean> sessionLevelPackagesEnabled;

    /**
     * @return Whether session level packages enabled.
     * 
     */
    public Optional<Output<Boolean>> sessionLevelPackagesEnabled() {
        return Optional.ofNullable(this.sessionLevelPackagesEnabled);
    }

    /**
     * Spark configuration file to specify additional properties
     * 
     */
    @Import(name="sparkConfigProperties")
    private @Nullable Output<LibraryRequirementsArgs> sparkConfigProperties;

    /**
     * @return Spark configuration file to specify additional properties
     * 
     */
    public Optional<Output<LibraryRequirementsArgs>> sparkConfigProperties() {
        return Optional.ofNullable(this.sparkConfigProperties);
    }

    /**
     * The Spark events folder
     * 
     */
    @Import(name="sparkEventsFolder")
    private @Nullable Output<String> sparkEventsFolder;

    /**
     * @return The Spark events folder
     * 
     */
    public Optional<Output<String>> sparkEventsFolder() {
        return Optional.ofNullable(this.sparkEventsFolder);
    }

    /**
     * The Apache Spark version.
     * 
     */
    @Import(name="sparkVersion")
    private @Nullable Output<String> sparkVersion;

    /**
     * @return The Apache Spark version.
     * 
     */
    public Optional<Output<String>> sparkVersion() {
        return Optional.ofNullable(this.sparkVersion);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The name of the workspace
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the workspace
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private BigDataPoolArgs() {}

    private BigDataPoolArgs(BigDataPoolArgs $) {
        this.autoPause = $.autoPause;
        this.autoScale = $.autoScale;
        this.bigDataPoolName = $.bigDataPoolName;
        this.cacheSize = $.cacheSize;
        this.creationDate = $.creationDate;
        this.customLibraries = $.customLibraries;
        this.defaultSparkLogFolder = $.defaultSparkLogFolder;
        this.dynamicExecutorAllocation = $.dynamicExecutorAllocation;
        this.force = $.force;
        this.isComputeIsolationEnabled = $.isComputeIsolationEnabled;
        this.libraryRequirements = $.libraryRequirements;
        this.location = $.location;
        this.nodeCount = $.nodeCount;
        this.nodeSize = $.nodeSize;
        this.nodeSizeFamily = $.nodeSizeFamily;
        this.provisioningState = $.provisioningState;
        this.resourceGroupName = $.resourceGroupName;
        this.sessionLevelPackagesEnabled = $.sessionLevelPackagesEnabled;
        this.sparkConfigProperties = $.sparkConfigProperties;
        this.sparkEventsFolder = $.sparkEventsFolder;
        this.sparkVersion = $.sparkVersion;
        this.tags = $.tags;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BigDataPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BigDataPoolArgs $;

        public Builder() {
            $ = new BigDataPoolArgs();
        }

        public Builder(BigDataPoolArgs defaults) {
            $ = new BigDataPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoPause Auto-pausing properties
         * 
         * @return builder
         * 
         */
        public Builder autoPause(@Nullable Output<AutoPausePropertiesArgs> autoPause) {
            $.autoPause = autoPause;
            return this;
        }

        /**
         * @param autoPause Auto-pausing properties
         * 
         * @return builder
         * 
         */
        public Builder autoPause(AutoPausePropertiesArgs autoPause) {
            return autoPause(Output.of(autoPause));
        }

        /**
         * @param autoScale Auto-scaling properties
         * 
         * @return builder
         * 
         */
        public Builder autoScale(@Nullable Output<AutoScalePropertiesArgs> autoScale) {
            $.autoScale = autoScale;
            return this;
        }

        /**
         * @param autoScale Auto-scaling properties
         * 
         * @return builder
         * 
         */
        public Builder autoScale(AutoScalePropertiesArgs autoScale) {
            return autoScale(Output.of(autoScale));
        }

        /**
         * @param bigDataPoolName Big Data pool name
         * 
         * @return builder
         * 
         */
        public Builder bigDataPoolName(@Nullable Output<String> bigDataPoolName) {
            $.bigDataPoolName = bigDataPoolName;
            return this;
        }

        /**
         * @param bigDataPoolName Big Data pool name
         * 
         * @return builder
         * 
         */
        public Builder bigDataPoolName(String bigDataPoolName) {
            return bigDataPoolName(Output.of(bigDataPoolName));
        }

        /**
         * @param cacheSize The cache size
         * 
         * @return builder
         * 
         */
        public Builder cacheSize(@Nullable Output<Integer> cacheSize) {
            $.cacheSize = cacheSize;
            return this;
        }

        /**
         * @param cacheSize The cache size
         * 
         * @return builder
         * 
         */
        public Builder cacheSize(Integer cacheSize) {
            return cacheSize(Output.of(cacheSize));
        }

        /**
         * @param creationDate The time when the Big Data pool was created.
         * 
         * @return builder
         * 
         */
        public Builder creationDate(@Nullable Output<String> creationDate) {
            $.creationDate = creationDate;
            return this;
        }

        /**
         * @param creationDate The time when the Big Data pool was created.
         * 
         * @return builder
         * 
         */
        public Builder creationDate(String creationDate) {
            return creationDate(Output.of(creationDate));
        }

        /**
         * @param customLibraries List of custom libraries/packages associated with the spark pool.
         * 
         * @return builder
         * 
         */
        public Builder customLibraries(@Nullable Output<List<LibraryInfoArgs>> customLibraries) {
            $.customLibraries = customLibraries;
            return this;
        }

        /**
         * @param customLibraries List of custom libraries/packages associated with the spark pool.
         * 
         * @return builder
         * 
         */
        public Builder customLibraries(List<LibraryInfoArgs> customLibraries) {
            return customLibraries(Output.of(customLibraries));
        }

        /**
         * @param customLibraries List of custom libraries/packages associated with the spark pool.
         * 
         * @return builder
         * 
         */
        public Builder customLibraries(LibraryInfoArgs... customLibraries) {
            return customLibraries(List.of(customLibraries));
        }

        /**
         * @param defaultSparkLogFolder The default folder where Spark logs will be written.
         * 
         * @return builder
         * 
         */
        public Builder defaultSparkLogFolder(@Nullable Output<String> defaultSparkLogFolder) {
            $.defaultSparkLogFolder = defaultSparkLogFolder;
            return this;
        }

        /**
         * @param defaultSparkLogFolder The default folder where Spark logs will be written.
         * 
         * @return builder
         * 
         */
        public Builder defaultSparkLogFolder(String defaultSparkLogFolder) {
            return defaultSparkLogFolder(Output.of(defaultSparkLogFolder));
        }

        /**
         * @param dynamicExecutorAllocation Dynamic Executor Allocation
         * 
         * @return builder
         * 
         */
        public Builder dynamicExecutorAllocation(@Nullable Output<DynamicExecutorAllocationArgs> dynamicExecutorAllocation) {
            $.dynamicExecutorAllocation = dynamicExecutorAllocation;
            return this;
        }

        /**
         * @param dynamicExecutorAllocation Dynamic Executor Allocation
         * 
         * @return builder
         * 
         */
        public Builder dynamicExecutorAllocation(DynamicExecutorAllocationArgs dynamicExecutorAllocation) {
            return dynamicExecutorAllocation(Output.of(dynamicExecutorAllocation));
        }

        /**
         * @param force Whether to stop any running jobs in the Big Data pool
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force Whether to stop any running jobs in the Big Data pool
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param isComputeIsolationEnabled Whether compute isolation is required or not.
         * 
         * @return builder
         * 
         */
        public Builder isComputeIsolationEnabled(@Nullable Output<Boolean> isComputeIsolationEnabled) {
            $.isComputeIsolationEnabled = isComputeIsolationEnabled;
            return this;
        }

        /**
         * @param isComputeIsolationEnabled Whether compute isolation is required or not.
         * 
         * @return builder
         * 
         */
        public Builder isComputeIsolationEnabled(Boolean isComputeIsolationEnabled) {
            return isComputeIsolationEnabled(Output.of(isComputeIsolationEnabled));
        }

        /**
         * @param libraryRequirements Library version requirements
         * 
         * @return builder
         * 
         */
        public Builder libraryRequirements(@Nullable Output<LibraryRequirementsArgs> libraryRequirements) {
            $.libraryRequirements = libraryRequirements;
            return this;
        }

        /**
         * @param libraryRequirements Library version requirements
         * 
         * @return builder
         * 
         */
        public Builder libraryRequirements(LibraryRequirementsArgs libraryRequirements) {
            return libraryRequirements(Output.of(libraryRequirements));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param nodeCount The number of nodes in the Big Data pool.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        /**
         * @param nodeCount The number of nodes in the Big Data pool.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Integer nodeCount) {
            return nodeCount(Output.of(nodeCount));
        }

        /**
         * @param nodeSize The level of compute power that each node in the Big Data pool has.
         * 
         * @return builder
         * 
         */
        public Builder nodeSize(@Nullable Output<Either<String,NodeSize>> nodeSize) {
            $.nodeSize = nodeSize;
            return this;
        }

        /**
         * @param nodeSize The level of compute power that each node in the Big Data pool has.
         * 
         * @return builder
         * 
         */
        public Builder nodeSize(Either<String,NodeSize> nodeSize) {
            return nodeSize(Output.of(nodeSize));
        }

        /**
         * @param nodeSize The level of compute power that each node in the Big Data pool has.
         * 
         * @return builder
         * 
         */
        public Builder nodeSize(String nodeSize) {
            return nodeSize(Either.ofLeft(nodeSize));
        }

        /**
         * @param nodeSize The level of compute power that each node in the Big Data pool has.
         * 
         * @return builder
         * 
         */
        public Builder nodeSize(NodeSize nodeSize) {
            return nodeSize(Either.ofRight(nodeSize));
        }

        /**
         * @param nodeSizeFamily The kind of nodes that the Big Data pool provides.
         * 
         * @return builder
         * 
         */
        public Builder nodeSizeFamily(@Nullable Output<Either<String,NodeSizeFamily>> nodeSizeFamily) {
            $.nodeSizeFamily = nodeSizeFamily;
            return this;
        }

        /**
         * @param nodeSizeFamily The kind of nodes that the Big Data pool provides.
         * 
         * @return builder
         * 
         */
        public Builder nodeSizeFamily(Either<String,NodeSizeFamily> nodeSizeFamily) {
            return nodeSizeFamily(Output.of(nodeSizeFamily));
        }

        /**
         * @param nodeSizeFamily The kind of nodes that the Big Data pool provides.
         * 
         * @return builder
         * 
         */
        public Builder nodeSizeFamily(String nodeSizeFamily) {
            return nodeSizeFamily(Either.ofLeft(nodeSizeFamily));
        }

        /**
         * @param nodeSizeFamily The kind of nodes that the Big Data pool provides.
         * 
         * @return builder
         * 
         */
        public Builder nodeSizeFamily(NodeSizeFamily nodeSizeFamily) {
            return nodeSizeFamily(Either.ofRight(nodeSizeFamily));
        }

        /**
         * @param provisioningState The state of the Big Data pool.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param provisioningState The state of the Big Data pool.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sessionLevelPackagesEnabled Whether session level packages enabled.
         * 
         * @return builder
         * 
         */
        public Builder sessionLevelPackagesEnabled(@Nullable Output<Boolean> sessionLevelPackagesEnabled) {
            $.sessionLevelPackagesEnabled = sessionLevelPackagesEnabled;
            return this;
        }

        /**
         * @param sessionLevelPackagesEnabled Whether session level packages enabled.
         * 
         * @return builder
         * 
         */
        public Builder sessionLevelPackagesEnabled(Boolean sessionLevelPackagesEnabled) {
            return sessionLevelPackagesEnabled(Output.of(sessionLevelPackagesEnabled));
        }

        /**
         * @param sparkConfigProperties Spark configuration file to specify additional properties
         * 
         * @return builder
         * 
         */
        public Builder sparkConfigProperties(@Nullable Output<LibraryRequirementsArgs> sparkConfigProperties) {
            $.sparkConfigProperties = sparkConfigProperties;
            return this;
        }

        /**
         * @param sparkConfigProperties Spark configuration file to specify additional properties
         * 
         * @return builder
         * 
         */
        public Builder sparkConfigProperties(LibraryRequirementsArgs sparkConfigProperties) {
            return sparkConfigProperties(Output.of(sparkConfigProperties));
        }

        /**
         * @param sparkEventsFolder The Spark events folder
         * 
         * @return builder
         * 
         */
        public Builder sparkEventsFolder(@Nullable Output<String> sparkEventsFolder) {
            $.sparkEventsFolder = sparkEventsFolder;
            return this;
        }

        /**
         * @param sparkEventsFolder The Spark events folder
         * 
         * @return builder
         * 
         */
        public Builder sparkEventsFolder(String sparkEventsFolder) {
            return sparkEventsFolder(Output.of(sparkEventsFolder));
        }

        /**
         * @param sparkVersion The Apache Spark version.
         * 
         * @return builder
         * 
         */
        public Builder sparkVersion(@Nullable Output<String> sparkVersion) {
            $.sparkVersion = sparkVersion;
            return this;
        }

        /**
         * @param sparkVersion The Apache Spark version.
         * 
         * @return builder
         * 
         */
        public Builder sparkVersion(String sparkVersion) {
            return sparkVersion(Output.of(sparkVersion));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param workspaceName The name of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public BigDataPoolArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
