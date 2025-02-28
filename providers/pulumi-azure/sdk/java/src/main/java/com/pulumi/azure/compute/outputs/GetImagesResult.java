// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.GetImagesImage;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetImagesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return One or more `images` blocks as defined below:
     * 
     */
    private final List<GetImagesImage> images;
    private final String resourceGroupName;
    private final @Nullable Map<String,String> tagsFilter;

    @CustomType.Constructor
    private GetImagesResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("images") List<GetImagesImage> images,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("tagsFilter") @Nullable Map<String,String> tagsFilter) {
        this.id = id;
        this.images = images;
        this.resourceGroupName = resourceGroupName;
        this.tagsFilter = tagsFilter;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return One or more `images` blocks as defined below:
     * 
     */
    public List<GetImagesImage> images() {
        return this.images;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public Map<String,String> tagsFilter() {
        return this.tagsFilter == null ? Map.of() : this.tagsFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<GetImagesImage> images;
        private String resourceGroupName;
        private @Nullable Map<String,String> tagsFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImagesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.images = defaults.images;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tagsFilter = defaults.tagsFilter;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder images(List<GetImagesImage> images) {
            this.images = Objects.requireNonNull(images);
            return this;
        }
        public Builder images(GetImagesImage... images) {
            return images(List.of(images));
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder tagsFilter(@Nullable Map<String,String> tagsFilter) {
            this.tagsFilter = tagsFilter;
            return this;
        }        public GetImagesResult build() {
            return new GetImagesResult(id, images, resourceGroupName, tagsFilter);
        }
    }
}
