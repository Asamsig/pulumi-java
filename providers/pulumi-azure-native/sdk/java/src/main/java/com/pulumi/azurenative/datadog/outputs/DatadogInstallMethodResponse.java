// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatadogInstallMethodResponse {
    /**
     * @return The installer version.
     * 
     */
    private final @Nullable String installerVersion;
    /**
     * @return The tool.
     * 
     */
    private final @Nullable String tool;
    /**
     * @return The tool version.
     * 
     */
    private final @Nullable String toolVersion;

    @CustomType.Constructor
    private DatadogInstallMethodResponse(
        @CustomType.Parameter("installerVersion") @Nullable String installerVersion,
        @CustomType.Parameter("tool") @Nullable String tool,
        @CustomType.Parameter("toolVersion") @Nullable String toolVersion) {
        this.installerVersion = installerVersion;
        this.tool = tool;
        this.toolVersion = toolVersion;
    }

    /**
     * @return The installer version.
     * 
     */
    public Optional<String> installerVersion() {
        return Optional.ofNullable(this.installerVersion);
    }
    /**
     * @return The tool.
     * 
     */
    public Optional<String> tool() {
        return Optional.ofNullable(this.tool);
    }
    /**
     * @return The tool version.
     * 
     */
    public Optional<String> toolVersion() {
        return Optional.ofNullable(this.toolVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatadogInstallMethodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String installerVersion;
        private @Nullable String tool;
        private @Nullable String toolVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DatadogInstallMethodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.installerVersion = defaults.installerVersion;
    	      this.tool = defaults.tool;
    	      this.toolVersion = defaults.toolVersion;
        }

        public Builder installerVersion(@Nullable String installerVersion) {
            this.installerVersion = installerVersion;
            return this;
        }
        public Builder tool(@Nullable String tool) {
            this.tool = tool;
            return this;
        }
        public Builder toolVersion(@Nullable String toolVersion) {
            this.toolVersion = toolVersion;
            return this;
        }        public DatadogInstallMethodResponse build() {
            return new DatadogInstallMethodResponse(installerVersion, tool, toolVersion);
        }
    }
}
