// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGalleryImagePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGalleryImagePlainArgs Empty = new GetGalleryImagePlainArgs();

    /**
     * The name of the gallery image definition to be retrieved.
     * 
     */
    @Import(name="galleryImageName", required=true)
    private String galleryImageName;

    /**
     * @return The name of the gallery image definition to be retrieved.
     * 
     */
    public String galleryImageName() {
        return this.galleryImageName;
    }

    /**
     * The name of the Shared Image Gallery from which the Image Definitions are to be retrieved.
     * 
     */
    @Import(name="galleryName", required=true)
    private String galleryName;

    /**
     * @return The name of the Shared Image Gallery from which the Image Definitions are to be retrieved.
     * 
     */
    public String galleryName() {
        return this.galleryName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetGalleryImagePlainArgs() {}

    private GetGalleryImagePlainArgs(GetGalleryImagePlainArgs $) {
        this.galleryImageName = $.galleryImageName;
        this.galleryName = $.galleryName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGalleryImagePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGalleryImagePlainArgs $;

        public Builder() {
            $ = new GetGalleryImagePlainArgs();
        }

        public Builder(GetGalleryImagePlainArgs defaults) {
            $ = new GetGalleryImagePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param galleryImageName The name of the gallery image definition to be retrieved.
         * 
         * @return builder
         * 
         */
        public Builder galleryImageName(String galleryImageName) {
            $.galleryImageName = galleryImageName;
            return this;
        }

        /**
         * @param galleryName The name of the Shared Image Gallery from which the Image Definitions are to be retrieved.
         * 
         * @return builder
         * 
         */
        public Builder galleryName(String galleryName) {
            $.galleryName = galleryName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetGalleryImagePlainArgs build() {
            $.galleryImageName = Objects.requireNonNull($.galleryImageName, "expected parameter 'galleryImageName' to be non-null");
            $.galleryName = Objects.requireNonNull($.galleryName, "expected parameter 'galleryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
