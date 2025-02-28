// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An artifact that can be deployed in some runtime.
 * 
 */
public final class DeployableArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeployableArgs Empty = new DeployableArgs();

    /**
     * Resource URI for the artifact being deployed.
     * 
     */
    @Import(name="resourceUri")
    private @Nullable Output<List<String>> resourceUri;

    /**
     * @return Resource URI for the artifact being deployed.
     * 
     */
    public Optional<Output<List<String>>> resourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }

    private DeployableArgs() {}

    private DeployableArgs(DeployableArgs $) {
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeployableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeployableArgs $;

        public Builder() {
            $ = new DeployableArgs();
        }

        public Builder(DeployableArgs defaults) {
            $ = new DeployableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceUri Resource URI for the artifact being deployed.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(@Nullable Output<List<String>> resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        /**
         * @param resourceUri Resource URI for the artifact being deployed.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(List<String> resourceUri) {
            return resourceUri(Output.of(resourceUri));
        }

        /**
         * @param resourceUri Resource URI for the artifact being deployed.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(String... resourceUri) {
            return resourceUri(List.of(resourceUri));
        }

        public DeployableArgs build() {
            return $;
        }
    }

}
