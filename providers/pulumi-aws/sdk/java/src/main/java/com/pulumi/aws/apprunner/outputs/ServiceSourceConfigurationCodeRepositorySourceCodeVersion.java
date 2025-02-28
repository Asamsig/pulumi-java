// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServiceSourceConfigurationCodeRepositorySourceCodeVersion {
    /**
     * @return The type of version identifier. For a git-based repository, branches represent versions. Valid values: `BRANCH`.
     * 
     */
    private final String type;
    /**
     * @return A source code version. For a git-based repository, a branch name maps to a specific version. App Runner uses the most recent commit to the branch.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ServiceSourceConfigurationCodeRepositorySourceCodeVersion(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * @return The type of version identifier. For a git-based repository, branches represent versions. Valid values: `BRANCH`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return A source code version. For a git-based repository, a branch name maps to a specific version. App Runner uses the most recent commit to the branch.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationCodeRepositorySourceCodeVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfigurationCodeRepositorySourceCodeVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ServiceSourceConfigurationCodeRepositorySourceCodeVersion build() {
            return new ServiceSourceConfigurationCodeRepositorySourceCodeVersion(type, value);
        }
    }
}
