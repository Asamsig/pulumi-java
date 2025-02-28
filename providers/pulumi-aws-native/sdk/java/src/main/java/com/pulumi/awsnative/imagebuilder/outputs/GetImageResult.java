// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImageResult {
    /**
     * @return The Amazon Resource Name (ARN) of the image.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return The AMI ID of the EC2 AMI in current region.
     * 
     */
    private final @Nullable String imageId;
    /**
     * @return URI for containers created in current Region with default ECR image tag
     * 
     */
    private final @Nullable String imageUri;
    /**
     * @return The name of the image.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private GetImageResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("imageId") @Nullable String imageId,
        @CustomType.Parameter("imageUri") @Nullable String imageUri,
        @CustomType.Parameter("name") @Nullable String name) {
        this.arn = arn;
        this.imageId = imageId;
        this.imageUri = imageUri;
        this.name = name;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the image.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The AMI ID of the EC2 AMI in current region.
     * 
     */
    public Optional<String> imageId() {
        return Optional.ofNullable(this.imageId);
    }
    /**
     * @return URI for containers created in current Region with default ECR image tag
     * 
     */
    public Optional<String> imageUri() {
        return Optional.ofNullable(this.imageUri);
    }
    /**
     * @return The name of the image.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String imageId;
        private @Nullable String imageUri;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.imageId = defaults.imageId;
    	      this.imageUri = defaults.imageUri;
    	      this.name = defaults.name;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder imageId(@Nullable String imageId) {
            this.imageId = imageId;
            return this;
        }
        public Builder imageUri(@Nullable String imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public GetImageResult build() {
            return new GetImageResult(arn, imageId, imageUri, name);
        }
    }
}
