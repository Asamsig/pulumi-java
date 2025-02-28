// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Docker image that is used to create a container and start a VM instance for the version that you deploy. Only applicable for instances running in the App Engine flexible environment.
 * 
 */
public final class ContainerInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerInfoArgs Empty = new ContainerInfoArgs();

    /**
     * URI to the hosted container image in Google Container Registry. The URI must be fully qualified and include a tag or digest. Examples: &#34;gcr.io/my-project/image:tag&#34; or &#34;gcr.io/my-project/image@digest&#34;
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return URI to the hosted container image in Google Container Registry. The URI must be fully qualified and include a tag or digest. Examples: &#34;gcr.io/my-project/image:tag&#34; or &#34;gcr.io/my-project/image@digest&#34;
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    private ContainerInfoArgs() {}

    private ContainerInfoArgs(ContainerInfoArgs $) {
        this.image = $.image;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerInfoArgs $;

        public Builder() {
            $ = new ContainerInfoArgs();
        }

        public Builder(ContainerInfoArgs defaults) {
            $ = new ContainerInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param image URI to the hosted container image in Google Container Registry. The URI must be fully qualified and include a tag or digest. Examples: &#34;gcr.io/my-project/image:tag&#34; or &#34;gcr.io/my-project/image@digest&#34;
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image URI to the hosted container image in Google Container Registry. The URI must be fully qualified and include a tag or digest. Examples: &#34;gcr.io/my-project/image:tag&#34; or &#34;gcr.io/my-project/image@digest&#34;
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        public ContainerInfoArgs build() {
            return $;
        }
    }

}
