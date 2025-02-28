// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RepoResponse {
    /**
     * @return Array of branches.
     * 
     */
    private final @Nullable List<String> branches;
    /**
     * @return The name of the repository.
     * 
     */
    private final @Nullable String fullName;
    /**
     * @return The url to access the repository.
     * 
     */
    private final @Nullable String url;

    @CustomType.Constructor
    private RepoResponse(
        @CustomType.Parameter("branches") @Nullable List<String> branches,
        @CustomType.Parameter("fullName") @Nullable String fullName,
        @CustomType.Parameter("url") @Nullable String url) {
        this.branches = branches;
        this.fullName = fullName;
        this.url = url;
    }

    /**
     * @return Array of branches.
     * 
     */
    public List<String> branches() {
        return this.branches == null ? List.of() : this.branches;
    }
    /**
     * @return The name of the repository.
     * 
     */
    public Optional<String> fullName() {
        return Optional.ofNullable(this.fullName);
    }
    /**
     * @return The url to access the repository.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> branches;
        private @Nullable String fullName;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(RepoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branches = defaults.branches;
    	      this.fullName = defaults.fullName;
    	      this.url = defaults.url;
        }

        public Builder branches(@Nullable List<String> branches) {
            this.branches = branches;
            return this;
        }
        public Builder branches(String... branches) {
            return branches(List.of(branches));
        }
        public Builder fullName(@Nullable String fullName) {
            this.fullName = fullName;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }        public RepoResponse build() {
            return new RepoResponse(branches, fullName, url);
        }
    }
}
