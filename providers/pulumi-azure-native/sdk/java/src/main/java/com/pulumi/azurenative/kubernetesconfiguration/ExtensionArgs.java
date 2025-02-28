// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration;

import com.pulumi.azurenative.kubernetesconfiguration.inputs.ConfigurationIdentityArgs;
import com.pulumi.azurenative.kubernetesconfiguration.inputs.ExtensionStatusArgs;
import com.pulumi.azurenative.kubernetesconfiguration.inputs.ScopeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExtensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExtensionArgs Empty = new ExtensionArgs();

    /**
     * Flag to note if this instance participates in auto upgrade of minor version, or not.
     * 
     */
    @Import(name="autoUpgradeMinorVersion")
    private @Nullable Output<Boolean> autoUpgradeMinorVersion;

    /**
     * @return Flag to note if this instance participates in auto upgrade of minor version, or not.
     * 
     */
    public Optional<Output<Boolean>> autoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }

    /**
     * The name of the kubernetes cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the kubernetes cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
     * 
     */
    @Import(name="clusterResourceName", required=true)
    private Output<String> clusterResourceName;

    /**
     * @return The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
     * 
     */
    public Output<String> clusterResourceName() {
        return this.clusterResourceName;
    }

    /**
     * The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
     * 
     */
    @Import(name="clusterRp", required=true)
    private Output<String> clusterRp;

    /**
     * @return The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
     * 
     */
    public Output<String> clusterRp() {
        return this.clusterRp;
    }

    /**
     * Configuration settings that are sensitive, as name-value pairs for configuring this instance of the extension.
     * 
     */
    @Import(name="configurationProtectedSettings")
    private @Nullable Output<Map<String,String>> configurationProtectedSettings;

    /**
     * @return Configuration settings that are sensitive, as name-value pairs for configuring this instance of the extension.
     * 
     */
    public Optional<Output<Map<String,String>>> configurationProtectedSettings() {
        return Optional.ofNullable(this.configurationProtectedSettings);
    }

    /**
     * Configuration settings, as name-value pairs for configuring this instance of the extension.
     * 
     */
    @Import(name="configurationSettings")
    private @Nullable Output<Map<String,String>> configurationSettings;

    /**
     * @return Configuration settings, as name-value pairs for configuring this instance of the extension.
     * 
     */
    public Optional<Output<Map<String,String>>> configurationSettings() {
        return Optional.ofNullable(this.configurationSettings);
    }

    /**
     * Name of an instance of the Extension.
     * 
     */
    @Import(name="extensionInstanceName")
    private @Nullable Output<String> extensionInstanceName;

    /**
     * @return Name of an instance of the Extension.
     * 
     */
    public Optional<Output<String>> extensionInstanceName() {
        return Optional.ofNullable(this.extensionInstanceName);
    }

    /**
     * Type of the Extension, of which this resource is an instance of.  It must be one of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     * 
     */
    @Import(name="extensionType")
    private @Nullable Output<String> extensionType;

    /**
     * @return Type of the Extension, of which this resource is an instance of.  It must be one of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
     * 
     */
    public Optional<Output<String>> extensionType() {
        return Optional.ofNullable(this.extensionType);
    }

    /**
     * The identity of the configuration.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ConfigurationIdentityArgs> identity;

    /**
     * @return The identity of the configuration.
     * 
     */
    public Optional<Output<ConfigurationIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * ReleaseTrain this extension instance participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if autoUpgradeMinorVersion is &#39;true&#39;.
     * 
     */
    @Import(name="releaseTrain")
    private @Nullable Output<String> releaseTrain;

    /**
     * @return ReleaseTrain this extension instance participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if autoUpgradeMinorVersion is &#39;true&#39;.
     * 
     */
    public Optional<Output<String>> releaseTrain() {
        return Optional.ofNullable(this.releaseTrain);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Scope at which the extension instance is installed.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<ScopeArgs> scope;

    /**
     * @return Scope at which the extension instance is installed.
     * 
     */
    public Optional<Output<ScopeArgs>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * Status from this instance of the extension.
     * 
     */
    @Import(name="statuses")
    private @Nullable Output<List<ExtensionStatusArgs>> statuses;

    /**
     * @return Status from this instance of the extension.
     * 
     */
    public Optional<Output<List<ExtensionStatusArgs>>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    /**
     * Version of the extension for this extension instance, if it is &#39;pinned&#39; to a specific version. autoUpgradeMinorVersion must be &#39;false&#39;.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Version of the extension for this extension instance, if it is &#39;pinned&#39; to a specific version. autoUpgradeMinorVersion must be &#39;false&#39;.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ExtensionArgs() {}

    private ExtensionArgs(ExtensionArgs $) {
        this.autoUpgradeMinorVersion = $.autoUpgradeMinorVersion;
        this.clusterName = $.clusterName;
        this.clusterResourceName = $.clusterResourceName;
        this.clusterRp = $.clusterRp;
        this.configurationProtectedSettings = $.configurationProtectedSettings;
        this.configurationSettings = $.configurationSettings;
        this.extensionInstanceName = $.extensionInstanceName;
        this.extensionType = $.extensionType;
        this.identity = $.identity;
        this.releaseTrain = $.releaseTrain;
        this.resourceGroupName = $.resourceGroupName;
        this.scope = $.scope;
        this.statuses = $.statuses;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtensionArgs $;

        public Builder() {
            $ = new ExtensionArgs();
        }

        public Builder(ExtensionArgs defaults) {
            $ = new ExtensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoUpgradeMinorVersion Flag to note if this instance participates in auto upgrade of minor version, or not.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeMinorVersion(@Nullable Output<Boolean> autoUpgradeMinorVersion) {
            $.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        /**
         * @param autoUpgradeMinorVersion Flag to note if this instance participates in auto upgrade of minor version, or not.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
            return autoUpgradeMinorVersion(Output.of(autoUpgradeMinorVersion));
        }

        /**
         * @param clusterName The name of the kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
         * 
         * @return builder
         * 
         */
        public Builder clusterResourceName(Output<String> clusterResourceName) {
            $.clusterResourceName = clusterResourceName;
            return this;
        }

        /**
         * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
         * 
         * @return builder
         * 
         */
        public Builder clusterResourceName(String clusterResourceName) {
            return clusterResourceName(Output.of(clusterResourceName));
        }

        /**
         * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
         * 
         * @return builder
         * 
         */
        public Builder clusterRp(Output<String> clusterRp) {
            $.clusterRp = clusterRp;
            return this;
        }

        /**
         * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
         * 
         * @return builder
         * 
         */
        public Builder clusterRp(String clusterRp) {
            return clusterRp(Output.of(clusterRp));
        }

        /**
         * @param configurationProtectedSettings Configuration settings that are sensitive, as name-value pairs for configuring this instance of the extension.
         * 
         * @return builder
         * 
         */
        public Builder configurationProtectedSettings(@Nullable Output<Map<String,String>> configurationProtectedSettings) {
            $.configurationProtectedSettings = configurationProtectedSettings;
            return this;
        }

        /**
         * @param configurationProtectedSettings Configuration settings that are sensitive, as name-value pairs for configuring this instance of the extension.
         * 
         * @return builder
         * 
         */
        public Builder configurationProtectedSettings(Map<String,String> configurationProtectedSettings) {
            return configurationProtectedSettings(Output.of(configurationProtectedSettings));
        }

        /**
         * @param configurationSettings Configuration settings, as name-value pairs for configuring this instance of the extension.
         * 
         * @return builder
         * 
         */
        public Builder configurationSettings(@Nullable Output<Map<String,String>> configurationSettings) {
            $.configurationSettings = configurationSettings;
            return this;
        }

        /**
         * @param configurationSettings Configuration settings, as name-value pairs for configuring this instance of the extension.
         * 
         * @return builder
         * 
         */
        public Builder configurationSettings(Map<String,String> configurationSettings) {
            return configurationSettings(Output.of(configurationSettings));
        }

        /**
         * @param extensionInstanceName Name of an instance of the Extension.
         * 
         * @return builder
         * 
         */
        public Builder extensionInstanceName(@Nullable Output<String> extensionInstanceName) {
            $.extensionInstanceName = extensionInstanceName;
            return this;
        }

        /**
         * @param extensionInstanceName Name of an instance of the Extension.
         * 
         * @return builder
         * 
         */
        public Builder extensionInstanceName(String extensionInstanceName) {
            return extensionInstanceName(Output.of(extensionInstanceName));
        }

        /**
         * @param extensionType Type of the Extension, of which this resource is an instance of.  It must be one of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
         * 
         * @return builder
         * 
         */
        public Builder extensionType(@Nullable Output<String> extensionType) {
            $.extensionType = extensionType;
            return this;
        }

        /**
         * @param extensionType Type of the Extension, of which this resource is an instance of.  It must be one of the Extension Types registered with Microsoft.KubernetesConfiguration by the Extension publisher.
         * 
         * @return builder
         * 
         */
        public Builder extensionType(String extensionType) {
            return extensionType(Output.of(extensionType));
        }

        /**
         * @param identity The identity of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ConfigurationIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity The identity of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder identity(ConfigurationIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param releaseTrain ReleaseTrain this extension instance participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if autoUpgradeMinorVersion is &#39;true&#39;.
         * 
         * @return builder
         * 
         */
        public Builder releaseTrain(@Nullable Output<String> releaseTrain) {
            $.releaseTrain = releaseTrain;
            return this;
        }

        /**
         * @param releaseTrain ReleaseTrain this extension instance participates in for auto-upgrade (e.g. Stable, Preview, etc.) - only if autoUpgradeMinorVersion is &#39;true&#39;.
         * 
         * @return builder
         * 
         */
        public Builder releaseTrain(String releaseTrain) {
            return releaseTrain(Output.of(releaseTrain));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scope Scope at which the extension instance is installed.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<ScopeArgs> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Scope at which the extension instance is installed.
         * 
         * @return builder
         * 
         */
        public Builder scope(ScopeArgs scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param statuses Status from this instance of the extension.
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable Output<List<ExtensionStatusArgs>> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses Status from this instance of the extension.
         * 
         * @return builder
         * 
         */
        public Builder statuses(List<ExtensionStatusArgs> statuses) {
            return statuses(Output.of(statuses));
        }

        /**
         * @param statuses Status from this instance of the extension.
         * 
         * @return builder
         * 
         */
        public Builder statuses(ExtensionStatusArgs... statuses) {
            return statuses(List.of(statuses));
        }

        /**
         * @param version Version of the extension for this extension instance, if it is &#39;pinned&#39; to a specific version. autoUpgradeMinorVersion must be &#39;false&#39;.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version of the extension for this extension instance, if it is &#39;pinned&#39; to a specific version. autoUpgradeMinorVersion must be &#39;false&#39;.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ExtensionArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.clusterResourceName = Objects.requireNonNull($.clusterResourceName, "expected parameter 'clusterResourceName' to be non-null");
            $.clusterRp = Objects.requireNonNull($.clusterRp, "expected parameter 'clusterRp' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
