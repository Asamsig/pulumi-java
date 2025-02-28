// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DeploymentNoteResponse {
    /**
     * @return Resource URI for the artifact being deployed.
     * 
     */
    private final List<String> resourceUri;

    @CustomType.Constructor
    private DeploymentNoteResponse(@CustomType.Parameter("resourceUri") List<String> resourceUri) {
        this.resourceUri = resourceUri;
    }

    /**
     * @return Resource URI for the artifact being deployed.
     * 
     */
    public List<String> resourceUri() {
        return this.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder resourceUri(List<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public Builder resourceUri(String... resourceUri) {
            return resourceUri(List.of(resourceUri));
        }        public DeploymentNoteResponse build() {
            return new DeploymentNoteResponse(resourceUri);
        }
    }
}
