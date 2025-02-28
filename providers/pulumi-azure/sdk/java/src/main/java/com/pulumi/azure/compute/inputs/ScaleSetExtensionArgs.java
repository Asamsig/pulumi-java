// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScaleSetExtensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScaleSetExtensionArgs Empty = new ScaleSetExtensionArgs();

    /**
     * Specifies whether or not to use the latest minor version available.
     * 
     */
    @Import(name="autoUpgradeMinorVersion")
    private @Nullable Output<Boolean> autoUpgradeMinorVersion;

    /**
     * @return Specifies whether or not to use the latest minor version available.
     * 
     */
    public Optional<Output<Boolean>> autoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }

    /**
     * Specifies the name of the extension.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the extension.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The protected_settings passed to the extension, like settings, these are specified as a JSON object in a string.
     * 
     */
    @Import(name="protectedSettings")
    private @Nullable Output<String> protectedSettings;

    /**
     * @return The protected_settings passed to the extension, like settings, these are specified as a JSON object in a string.
     * 
     */
    public Optional<Output<String>> protectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }

    /**
     * Specifies a dependency array of extensions required to be executed before, the array stores the name of each extension.
     * 
     */
    @Import(name="provisionAfterExtensions")
    private @Nullable Output<List<String>> provisionAfterExtensions;

    /**
     * @return Specifies a dependency array of extensions required to be executed before, the array stores the name of each extension.
     * 
     */
    public Optional<Output<List<String>>> provisionAfterExtensions() {
        return Optional.ofNullable(this.provisionAfterExtensions);
    }

    /**
     * The publisher of the extension, available publishers can be found by using the Azure CLI.
     * 
     */
    @Import(name="publisher", required=true)
    private Output<String> publisher;

    /**
     * @return The publisher of the extension, available publishers can be found by using the Azure CLI.
     * 
     */
    public Output<String> publisher() {
        return this.publisher;
    }

    /**
     * The settings passed to the extension, these are specified as a JSON object in a string.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<String> settings;

    /**
     * @return The settings passed to the extension, these are specified as a JSON object in a string.
     * 
     */
    public Optional<Output<String>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * The type of extension, available types for a publisher can be found using the Azure CLI.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of extension, available types for a publisher can be found using the Azure CLI.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Specifies the version of the extension to use, available versions can be found using the Azure CLI.
     * 
     */
    @Import(name="typeHandlerVersion", required=true)
    private Output<String> typeHandlerVersion;

    /**
     * @return Specifies the version of the extension to use, available versions can be found using the Azure CLI.
     * 
     */
    public Output<String> typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    private ScaleSetExtensionArgs() {}

    private ScaleSetExtensionArgs(ScaleSetExtensionArgs $) {
        this.autoUpgradeMinorVersion = $.autoUpgradeMinorVersion;
        this.name = $.name;
        this.protectedSettings = $.protectedSettings;
        this.provisionAfterExtensions = $.provisionAfterExtensions;
        this.publisher = $.publisher;
        this.settings = $.settings;
        this.type = $.type;
        this.typeHandlerVersion = $.typeHandlerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScaleSetExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScaleSetExtensionArgs $;

        public Builder() {
            $ = new ScaleSetExtensionArgs();
        }

        public Builder(ScaleSetExtensionArgs defaults) {
            $ = new ScaleSetExtensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoUpgradeMinorVersion Specifies whether or not to use the latest minor version available.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeMinorVersion(@Nullable Output<Boolean> autoUpgradeMinorVersion) {
            $.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        /**
         * @param autoUpgradeMinorVersion Specifies whether or not to use the latest minor version available.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
            return autoUpgradeMinorVersion(Output.of(autoUpgradeMinorVersion));
        }

        /**
         * @param name Specifies the name of the extension.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the extension.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protectedSettings The protected_settings passed to the extension, like settings, these are specified as a JSON object in a string.
         * 
         * @return builder
         * 
         */
        public Builder protectedSettings(@Nullable Output<String> protectedSettings) {
            $.protectedSettings = protectedSettings;
            return this;
        }

        /**
         * @param protectedSettings The protected_settings passed to the extension, like settings, these are specified as a JSON object in a string.
         * 
         * @return builder
         * 
         */
        public Builder protectedSettings(String protectedSettings) {
            return protectedSettings(Output.of(protectedSettings));
        }

        /**
         * @param provisionAfterExtensions Specifies a dependency array of extensions required to be executed before, the array stores the name of each extension.
         * 
         * @return builder
         * 
         */
        public Builder provisionAfterExtensions(@Nullable Output<List<String>> provisionAfterExtensions) {
            $.provisionAfterExtensions = provisionAfterExtensions;
            return this;
        }

        /**
         * @param provisionAfterExtensions Specifies a dependency array of extensions required to be executed before, the array stores the name of each extension.
         * 
         * @return builder
         * 
         */
        public Builder provisionAfterExtensions(List<String> provisionAfterExtensions) {
            return provisionAfterExtensions(Output.of(provisionAfterExtensions));
        }

        /**
         * @param provisionAfterExtensions Specifies a dependency array of extensions required to be executed before, the array stores the name of each extension.
         * 
         * @return builder
         * 
         */
        public Builder provisionAfterExtensions(String... provisionAfterExtensions) {
            return provisionAfterExtensions(List.of(provisionAfterExtensions));
        }

        /**
         * @param publisher The publisher of the extension, available publishers can be found by using the Azure CLI.
         * 
         * @return builder
         * 
         */
        public Builder publisher(Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher The publisher of the extension, available publishers can be found by using the Azure CLI.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        /**
         * @param settings The settings passed to the extension, these are specified as a JSON object in a string.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<String> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings The settings passed to the extension, these are specified as a JSON object in a string.
         * 
         * @return builder
         * 
         */
        public Builder settings(String settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param type The type of extension, available types for a publisher can be found using the Azure CLI.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of extension, available types for a publisher can be found using the Azure CLI.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param typeHandlerVersion Specifies the version of the extension to use, available versions can be found using the Azure CLI.
         * 
         * @return builder
         * 
         */
        public Builder typeHandlerVersion(Output<String> typeHandlerVersion) {
            $.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        /**
         * @param typeHandlerVersion Specifies the version of the extension to use, available versions can be found using the Azure CLI.
         * 
         * @return builder
         * 
         */
        public Builder typeHandlerVersion(String typeHandlerVersion) {
            return typeHandlerVersion(Output.of(typeHandlerVersion));
        }

        public ScaleSetExtensionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.publisher = Objects.requireNonNull($.publisher, "expected parameter 'publisher' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.typeHandlerVersion = Objects.requireNonNull($.typeHandlerVersion, "expected parameter 'typeHandlerVersion' to be non-null");
            return $;
        }
    }

}
