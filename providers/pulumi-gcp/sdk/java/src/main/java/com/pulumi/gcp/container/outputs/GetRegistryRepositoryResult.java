// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegistryRepositoryResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String project;
    private final @Nullable String region;
    private final String repositoryUrl;

    @CustomType.Constructor
    private GetRegistryRepositoryResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("repositoryUrl") String repositoryUrl) {
        this.id = id;
        this.project = project;
        this.region = region;
        this.repositoryUrl = repositoryUrl;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String project() {
        return this.project;
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public String repositoryUrl() {
        return this.repositoryUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryRepositoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String project;
        private @Nullable String region;
        private String repositoryUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryRepositoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.repositoryUrl = defaults.repositoryUrl;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }        public GetRegistryRepositoryResult build() {
            return new GetRegistryRepositoryResult(id, project, region, repositoryUrl);
        }
    }
}
