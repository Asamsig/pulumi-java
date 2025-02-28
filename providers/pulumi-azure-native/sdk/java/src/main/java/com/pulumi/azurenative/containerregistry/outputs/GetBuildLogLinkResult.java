// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBuildLogLinkResult {
    /**
     * @return The link to logs for a azure container registry build.
     * 
     */
    private final @Nullable String logLink;

    @CustomType.Constructor
    private GetBuildLogLinkResult(@CustomType.Parameter("logLink") @Nullable String logLink) {
        this.logLink = logLink;
    }

    /**
     * @return The link to logs for a azure container registry build.
     * 
     */
    public Optional<String> logLink() {
        return Optional.ofNullable(this.logLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBuildLogLinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBuildLogLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logLink = defaults.logLink;
        }

        public Builder logLink(@Nullable String logLink) {
            this.logLink = logLink;
            return this;
        }        public GetBuildLogLinkResult build() {
            return new GetBuildLogLinkResult(logLink);
        }
    }
}
