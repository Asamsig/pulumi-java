// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.azurenative.servicefabricmesh.inputs.ApplicationScopedVolumeArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.ContainerLabelArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.DiagnosticsRefArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.EndpointPropertiesArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.EnvironmentVariableArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.ImageRegistryCredentialArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.ReliableCollectionsRefArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.ResourceRequirementsArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.SettingArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.VolumeReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a container and its runtime properties.
 * 
 */
public final class ContainerCodePackagePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerCodePackagePropertiesArgs Empty = new ContainerCodePackagePropertiesArgs();

    /**
     * Command array to execute within the container in exec form.
     * 
     */
    @Import(name="commands")
    private @Nullable Output<List<String>> commands;

    /**
     * @return Command array to execute within the container in exec form.
     * 
     */
    public Optional<Output<List<String>>> commands() {
        return Optional.ofNullable(this.commands);
    }

    /**
     * Reference to sinks in DiagnosticsDescription.
     * 
     */
    @Import(name="diagnostics")
    private @Nullable Output<DiagnosticsRefArgs> diagnostics;

    /**
     * @return Reference to sinks in DiagnosticsDescription.
     * 
     */
    public Optional<Output<DiagnosticsRefArgs>> diagnostics() {
        return Optional.ofNullable(this.diagnostics);
    }

    /**
     * The endpoints exposed by this container.
     * 
     */
    @Import(name="endpoints")
    private @Nullable Output<List<EndpointPropertiesArgs>> endpoints;

    /**
     * @return The endpoints exposed by this container.
     * 
     */
    public Optional<Output<List<EndpointPropertiesArgs>>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    /**
     * Override for the default entry point in the container.
     * 
     */
    @Import(name="entrypoint")
    private @Nullable Output<String> entrypoint;

    /**
     * @return Override for the default entry point in the container.
     * 
     */
    public Optional<Output<String>> entrypoint() {
        return Optional.ofNullable(this.entrypoint);
    }

    /**
     * The environment variables to set in this container
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<List<EnvironmentVariableArgs>> environmentVariables;

    /**
     * @return The environment variables to set in this container
     * 
     */
    public Optional<Output<List<EnvironmentVariableArgs>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * The Container image to use.
     * 
     */
    @Import(name="image", required=true)
    private Output<String> image;

    /**
     * @return The Container image to use.
     * 
     */
    public Output<String> image() {
        return this.image;
    }

    /**
     * Image registry credential.
     * 
     */
    @Import(name="imageRegistryCredential")
    private @Nullable Output<ImageRegistryCredentialArgs> imageRegistryCredential;

    /**
     * @return Image registry credential.
     * 
     */
    public Optional<Output<ImageRegistryCredentialArgs>> imageRegistryCredential() {
        return Optional.ofNullable(this.imageRegistryCredential);
    }

    /**
     * The labels to set in this container.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<ContainerLabelArgs>> labels;

    /**
     * @return The labels to set in this container.
     * 
     */
    public Optional<Output<List<ContainerLabelArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the code package.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the code package.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A list of ReliableCollection resources used by this particular code package. Please refer to ReliableCollectionsRef for more details.
     * 
     */
    @Import(name="reliableCollectionsRefs")
    private @Nullable Output<List<ReliableCollectionsRefArgs>> reliableCollectionsRefs;

    /**
     * @return A list of ReliableCollection resources used by this particular code package. Please refer to ReliableCollectionsRef for more details.
     * 
     */
    public Optional<Output<List<ReliableCollectionsRefArgs>>> reliableCollectionsRefs() {
        return Optional.ofNullable(this.reliableCollectionsRefs);
    }

    /**
     * The resources required by this container.
     * 
     */
    @Import(name="resources", required=true)
    private Output<ResourceRequirementsArgs> resources;

    /**
     * @return The resources required by this container.
     * 
     */
    public Output<ResourceRequirementsArgs> resources() {
        return this.resources;
    }

    /**
     * The settings to set in this container. The setting file path can be fetched from environment variable &#34;Fabric_SettingPath&#34;. The path for Windows container is &#34;C:\\secrets&#34;. The path for Linux container is &#34;/var/secrets&#34;.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<List<SettingArgs>> settings;

    /**
     * @return The settings to set in this container. The setting file path can be fetched from environment variable &#34;Fabric_SettingPath&#34;. The path for Windows container is &#34;C:\\secrets&#34;. The path for Linux container is &#34;/var/secrets&#34;.
     * 
     */
    public Optional<Output<List<SettingArgs>>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * Volumes to be attached to the container. The lifetime of these volumes is independent of the application&#39;s lifetime.
     * 
     */
    @Import(name="volumeRefs")
    private @Nullable Output<List<VolumeReferenceArgs>> volumeRefs;

    /**
     * @return Volumes to be attached to the container. The lifetime of these volumes is independent of the application&#39;s lifetime.
     * 
     */
    public Optional<Output<List<VolumeReferenceArgs>>> volumeRefs() {
        return Optional.ofNullable(this.volumeRefs);
    }

    /**
     * Volumes to be attached to the container. The lifetime of these volumes is scoped to the application&#39;s lifetime.
     * 
     */
    @Import(name="volumes")
    private @Nullable Output<List<ApplicationScopedVolumeArgs>> volumes;

    /**
     * @return Volumes to be attached to the container. The lifetime of these volumes is scoped to the application&#39;s lifetime.
     * 
     */
    public Optional<Output<List<ApplicationScopedVolumeArgs>>> volumes() {
        return Optional.ofNullable(this.volumes);
    }

    private ContainerCodePackagePropertiesArgs() {}

    private ContainerCodePackagePropertiesArgs(ContainerCodePackagePropertiesArgs $) {
        this.commands = $.commands;
        this.diagnostics = $.diagnostics;
        this.endpoints = $.endpoints;
        this.entrypoint = $.entrypoint;
        this.environmentVariables = $.environmentVariables;
        this.image = $.image;
        this.imageRegistryCredential = $.imageRegistryCredential;
        this.labels = $.labels;
        this.name = $.name;
        this.reliableCollectionsRefs = $.reliableCollectionsRefs;
        this.resources = $.resources;
        this.settings = $.settings;
        this.volumeRefs = $.volumeRefs;
        this.volumes = $.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerCodePackagePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerCodePackagePropertiesArgs $;

        public Builder() {
            $ = new ContainerCodePackagePropertiesArgs();
        }

        public Builder(ContainerCodePackagePropertiesArgs defaults) {
            $ = new ContainerCodePackagePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commands Command array to execute within the container in exec form.
         * 
         * @return builder
         * 
         */
        public Builder commands(@Nullable Output<List<String>> commands) {
            $.commands = commands;
            return this;
        }

        /**
         * @param commands Command array to execute within the container in exec form.
         * 
         * @return builder
         * 
         */
        public Builder commands(List<String> commands) {
            return commands(Output.of(commands));
        }

        /**
         * @param commands Command array to execute within the container in exec form.
         * 
         * @return builder
         * 
         */
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }

        /**
         * @param diagnostics Reference to sinks in DiagnosticsDescription.
         * 
         * @return builder
         * 
         */
        public Builder diagnostics(@Nullable Output<DiagnosticsRefArgs> diagnostics) {
            $.diagnostics = diagnostics;
            return this;
        }

        /**
         * @param diagnostics Reference to sinks in DiagnosticsDescription.
         * 
         * @return builder
         * 
         */
        public Builder diagnostics(DiagnosticsRefArgs diagnostics) {
            return diagnostics(Output.of(diagnostics));
        }

        /**
         * @param endpoints The endpoints exposed by this container.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(@Nullable Output<List<EndpointPropertiesArgs>> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints The endpoints exposed by this container.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(List<EndpointPropertiesArgs> endpoints) {
            return endpoints(Output.of(endpoints));
        }

        /**
         * @param endpoints The endpoints exposed by this container.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(EndpointPropertiesArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }

        /**
         * @param entrypoint Override for the default entry point in the container.
         * 
         * @return builder
         * 
         */
        public Builder entrypoint(@Nullable Output<String> entrypoint) {
            $.entrypoint = entrypoint;
            return this;
        }

        /**
         * @param entrypoint Override for the default entry point in the container.
         * 
         * @return builder
         * 
         */
        public Builder entrypoint(String entrypoint) {
            return entrypoint(Output.of(entrypoint));
        }

        /**
         * @param environmentVariables The environment variables to set in this container
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(@Nullable Output<List<EnvironmentVariableArgs>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * @param environmentVariables The environment variables to set in this container
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(List<EnvironmentVariableArgs> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        /**
         * @param environmentVariables The environment variables to set in this container
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(EnvironmentVariableArgs... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }

        /**
         * @param image The Container image to use.
         * 
         * @return builder
         * 
         */
        public Builder image(Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image The Container image to use.
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param imageRegistryCredential Image registry credential.
         * 
         * @return builder
         * 
         */
        public Builder imageRegistryCredential(@Nullable Output<ImageRegistryCredentialArgs> imageRegistryCredential) {
            $.imageRegistryCredential = imageRegistryCredential;
            return this;
        }

        /**
         * @param imageRegistryCredential Image registry credential.
         * 
         * @return builder
         * 
         */
        public Builder imageRegistryCredential(ImageRegistryCredentialArgs imageRegistryCredential) {
            return imageRegistryCredential(Output.of(imageRegistryCredential));
        }

        /**
         * @param labels The labels to set in this container.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<ContainerLabelArgs>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels to set in this container.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<ContainerLabelArgs> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels The labels to set in this container.
         * 
         * @return builder
         * 
         */
        public Builder labels(ContainerLabelArgs... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param name The name of the code package.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the code package.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param reliableCollectionsRefs A list of ReliableCollection resources used by this particular code package. Please refer to ReliableCollectionsRef for more details.
         * 
         * @return builder
         * 
         */
        public Builder reliableCollectionsRefs(@Nullable Output<List<ReliableCollectionsRefArgs>> reliableCollectionsRefs) {
            $.reliableCollectionsRefs = reliableCollectionsRefs;
            return this;
        }

        /**
         * @param reliableCollectionsRefs A list of ReliableCollection resources used by this particular code package. Please refer to ReliableCollectionsRef for more details.
         * 
         * @return builder
         * 
         */
        public Builder reliableCollectionsRefs(List<ReliableCollectionsRefArgs> reliableCollectionsRefs) {
            return reliableCollectionsRefs(Output.of(reliableCollectionsRefs));
        }

        /**
         * @param reliableCollectionsRefs A list of ReliableCollection resources used by this particular code package. Please refer to ReliableCollectionsRef for more details.
         * 
         * @return builder
         * 
         */
        public Builder reliableCollectionsRefs(ReliableCollectionsRefArgs... reliableCollectionsRefs) {
            return reliableCollectionsRefs(List.of(reliableCollectionsRefs));
        }

        /**
         * @param resources The resources required by this container.
         * 
         * @return builder
         * 
         */
        public Builder resources(Output<ResourceRequirementsArgs> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources The resources required by this container.
         * 
         * @return builder
         * 
         */
        public Builder resources(ResourceRequirementsArgs resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param settings The settings to set in this container. The setting file path can be fetched from environment variable &#34;Fabric_SettingPath&#34;. The path for Windows container is &#34;C:\\secrets&#34;. The path for Linux container is &#34;/var/secrets&#34;.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<List<SettingArgs>> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings The settings to set in this container. The setting file path can be fetched from environment variable &#34;Fabric_SettingPath&#34;. The path for Windows container is &#34;C:\\secrets&#34;. The path for Linux container is &#34;/var/secrets&#34;.
         * 
         * @return builder
         * 
         */
        public Builder settings(List<SettingArgs> settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param settings The settings to set in this container. The setting file path can be fetched from environment variable &#34;Fabric_SettingPath&#34;. The path for Windows container is &#34;C:\\secrets&#34;. The path for Linux container is &#34;/var/secrets&#34;.
         * 
         * @return builder
         * 
         */
        public Builder settings(SettingArgs... settings) {
            return settings(List.of(settings));
        }

        /**
         * @param volumeRefs Volumes to be attached to the container. The lifetime of these volumes is independent of the application&#39;s lifetime.
         * 
         * @return builder
         * 
         */
        public Builder volumeRefs(@Nullable Output<List<VolumeReferenceArgs>> volumeRefs) {
            $.volumeRefs = volumeRefs;
            return this;
        }

        /**
         * @param volumeRefs Volumes to be attached to the container. The lifetime of these volumes is independent of the application&#39;s lifetime.
         * 
         * @return builder
         * 
         */
        public Builder volumeRefs(List<VolumeReferenceArgs> volumeRefs) {
            return volumeRefs(Output.of(volumeRefs));
        }

        /**
         * @param volumeRefs Volumes to be attached to the container. The lifetime of these volumes is independent of the application&#39;s lifetime.
         * 
         * @return builder
         * 
         */
        public Builder volumeRefs(VolumeReferenceArgs... volumeRefs) {
            return volumeRefs(List.of(volumeRefs));
        }

        /**
         * @param volumes Volumes to be attached to the container. The lifetime of these volumes is scoped to the application&#39;s lifetime.
         * 
         * @return builder
         * 
         */
        public Builder volumes(@Nullable Output<List<ApplicationScopedVolumeArgs>> volumes) {
            $.volumes = volumes;
            return this;
        }

        /**
         * @param volumes Volumes to be attached to the container. The lifetime of these volumes is scoped to the application&#39;s lifetime.
         * 
         * @return builder
         * 
         */
        public Builder volumes(List<ApplicationScopedVolumeArgs> volumes) {
            return volumes(Output.of(volumes));
        }

        /**
         * @param volumes Volumes to be attached to the container. The lifetime of these volumes is scoped to the application&#39;s lifetime.
         * 
         * @return builder
         * 
         */
        public Builder volumes(ApplicationScopedVolumeArgs... volumes) {
            return volumes(List.of(volumes));
        }

        public ContainerCodePackagePropertiesArgs build() {
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resources = Objects.requireNonNull($.resources, "expected parameter 'resources' to be non-null");
            return $;
        }
    }

}
