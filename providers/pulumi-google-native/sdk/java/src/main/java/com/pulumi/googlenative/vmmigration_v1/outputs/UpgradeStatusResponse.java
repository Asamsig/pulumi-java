// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.vmmigration_v1.outputs.StatusResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UpgradeStatusResponse {
    /**
     * @return Provides details on the state of the upgrade operation in case of an error.
     * 
     */
    private final StatusResponse error;
    /**
     * @return The version from which we upgraded.
     * 
     */
    private final String previousVersion;
    /**
     * @return The time the operation was started.
     * 
     */
    private final String startTime;
    /**
     * @return The state of the upgradeAppliance operation.
     * 
     */
    private final String state;
    /**
     * @return The version to upgrade to.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private UpgradeStatusResponse(
        @CustomType.Parameter("error") StatusResponse error,
        @CustomType.Parameter("previousVersion") String previousVersion,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("version") String version) {
        this.error = error;
        this.previousVersion = previousVersion;
        this.startTime = startTime;
        this.state = state;
        this.version = version;
    }

    /**
     * @return Provides details on the state of the upgrade operation in case of an error.
     * 
     */
    public StatusResponse error() {
        return this.error;
    }
    /**
     * @return The version from which we upgraded.
     * 
     */
    public String previousVersion() {
        return this.previousVersion;
    }
    /**
     * @return The time the operation was started.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return The state of the upgradeAppliance operation.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The version to upgrade to.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatusResponse error;
        private String previousVersion;
        private String startTime;
        private String state;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.previousVersion = defaults.previousVersion;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.version = defaults.version;
        }

        public Builder error(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder previousVersion(String previousVersion) {
            this.previousVersion = Objects.requireNonNull(previousVersion);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public UpgradeStatusResponse build() {
            return new UpgradeStatusResponse(error, previousVersion, startTime, state, version);
        }
    }
}
