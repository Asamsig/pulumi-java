// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.enums.ElevationLevel;
import com.pulumi.azurenative.batch.inputs.LinuxUserConfigurationArgs;
import com.pulumi.azurenative.batch.inputs.WindowsUserConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserAccountArgs Empty = new UserAccountArgs();

    /**
     * nonAdmin - The auto user is a standard user without elevated access. admin - The auto user is a user with elevated access and operates with full Administrator permissions. The default value is nonAdmin.
     * 
     */
    @Import(name="elevationLevel")
    private @Nullable Output<ElevationLevel> elevationLevel;

    /**
     * @return nonAdmin - The auto user is a standard user without elevated access. admin - The auto user is a user with elevated access and operates with full Administrator permissions. The default value is nonAdmin.
     * 
     */
    public Optional<Output<ElevationLevel>> elevationLevel() {
        return Optional.ofNullable(this.elevationLevel);
    }

    /**
     * This property is ignored if specified on a Windows pool. If not specified, the user is created with the default options.
     * 
     */
    @Import(name="linuxUserConfiguration")
    private @Nullable Output<LinuxUserConfigurationArgs> linuxUserConfiguration;

    /**
     * @return This property is ignored if specified on a Windows pool. If not specified, the user is created with the default options.
     * 
     */
    public Optional<Output<LinuxUserConfigurationArgs>> linuxUserConfiguration() {
        return Optional.ofNullable(this.linuxUserConfiguration);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    /**
     * This property can only be specified if the user is on a Windows pool. If not specified and on a Windows pool, the user is created with the default options.
     * 
     */
    @Import(name="windowsUserConfiguration")
    private @Nullable Output<WindowsUserConfigurationArgs> windowsUserConfiguration;

    /**
     * @return This property can only be specified if the user is on a Windows pool. If not specified and on a Windows pool, the user is created with the default options.
     * 
     */
    public Optional<Output<WindowsUserConfigurationArgs>> windowsUserConfiguration() {
        return Optional.ofNullable(this.windowsUserConfiguration);
    }

    private UserAccountArgs() {}

    private UserAccountArgs(UserAccountArgs $) {
        this.elevationLevel = $.elevationLevel;
        this.linuxUserConfiguration = $.linuxUserConfiguration;
        this.name = $.name;
        this.password = $.password;
        this.windowsUserConfiguration = $.windowsUserConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserAccountArgs $;

        public Builder() {
            $ = new UserAccountArgs();
        }

        public Builder(UserAccountArgs defaults) {
            $ = new UserAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param elevationLevel nonAdmin - The auto user is a standard user without elevated access. admin - The auto user is a user with elevated access and operates with full Administrator permissions. The default value is nonAdmin.
         * 
         * @return builder
         * 
         */
        public Builder elevationLevel(@Nullable Output<ElevationLevel> elevationLevel) {
            $.elevationLevel = elevationLevel;
            return this;
        }

        /**
         * @param elevationLevel nonAdmin - The auto user is a standard user without elevated access. admin - The auto user is a user with elevated access and operates with full Administrator permissions. The default value is nonAdmin.
         * 
         * @return builder
         * 
         */
        public Builder elevationLevel(ElevationLevel elevationLevel) {
            return elevationLevel(Output.of(elevationLevel));
        }

        /**
         * @param linuxUserConfiguration This property is ignored if specified on a Windows pool. If not specified, the user is created with the default options.
         * 
         * @return builder
         * 
         */
        public Builder linuxUserConfiguration(@Nullable Output<LinuxUserConfigurationArgs> linuxUserConfiguration) {
            $.linuxUserConfiguration = linuxUserConfiguration;
            return this;
        }

        /**
         * @param linuxUserConfiguration This property is ignored if specified on a Windows pool. If not specified, the user is created with the default options.
         * 
         * @return builder
         * 
         */
        public Builder linuxUserConfiguration(LinuxUserConfigurationArgs linuxUserConfiguration) {
            return linuxUserConfiguration(Output.of(linuxUserConfiguration));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param windowsUserConfiguration This property can only be specified if the user is on a Windows pool. If not specified and on a Windows pool, the user is created with the default options.
         * 
         * @return builder
         * 
         */
        public Builder windowsUserConfiguration(@Nullable Output<WindowsUserConfigurationArgs> windowsUserConfiguration) {
            $.windowsUserConfiguration = windowsUserConfiguration;
            return this;
        }

        /**
         * @param windowsUserConfiguration This property can only be specified if the user is on a Windows pool. If not specified and on a Windows pool, the user is created with the default options.
         * 
         * @return builder
         * 
         */
        public Builder windowsUserConfiguration(WindowsUserConfigurationArgs windowsUserConfiguration) {
            return windowsUserConfiguration(Output.of(windowsUserConfiguration));
        }

        public UserAccountArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            return $;
        }
    }

}
