// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTopicMessageStoragePolicy {
    private final List<String> allowedPersistenceRegions;

    @CustomType.Constructor
    private GetTopicMessageStoragePolicy(@CustomType.Parameter("allowedPersistenceRegions") List<String> allowedPersistenceRegions) {
        this.allowedPersistenceRegions = allowedPersistenceRegions;
    }

    public List<String> allowedPersistenceRegions() {
        return this.allowedPersistenceRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicMessageStoragePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedPersistenceRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTopicMessageStoragePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedPersistenceRegions = defaults.allowedPersistenceRegions;
        }

        public Builder allowedPersistenceRegions(List<String> allowedPersistenceRegions) {
            this.allowedPersistenceRegions = Objects.requireNonNull(allowedPersistenceRegions);
            return this;
        }
        public Builder allowedPersistenceRegions(String... allowedPersistenceRegions) {
            return allowedPersistenceRegions(List.of(allowedPersistenceRegions));
        }        public GetTopicMessageStoragePolicy build() {
            return new GetTopicMessageStoragePolicy(allowedPersistenceRegions);
        }
    }
}
