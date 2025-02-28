// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBuildServiceBuildResultLogResult {
    /**
     * @return The public download URL of this build result log
     * 
     */
    private final @Nullable String blobUrl;

    @CustomType.Constructor
    private GetBuildServiceBuildResultLogResult(@CustomType.Parameter("blobUrl") @Nullable String blobUrl) {
        this.blobUrl = blobUrl;
    }

    /**
     * @return The public download URL of this build result log
     * 
     */
    public Optional<String> blobUrl() {
        return Optional.ofNullable(this.blobUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBuildServiceBuildResultLogResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blobUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBuildServiceBuildResultLogResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobUrl = defaults.blobUrl;
        }

        public Builder blobUrl(@Nullable String blobUrl) {
            this.blobUrl = blobUrl;
            return this;
        }        public GetBuildServiceBuildResultLogResult build() {
            return new GetBuildServiceBuildResultLogResult(blobUrl);
        }
    }
}
