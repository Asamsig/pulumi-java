// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NetworkTagsResponse {
    /**
     * @return List of network tags.
     * 
     */
    private final List<String> tags;

    @CustomType.Constructor
    private NetworkTagsResponse(@CustomType.Parameter("tags") List<String> tags) {
        this.tags = tags;
    }

    /**
     * @return List of network tags.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkTagsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkTagsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
        }

        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }        public NetworkTagsResponse build() {
            return new NetworkTagsResponse(tags);
        }
    }
}
