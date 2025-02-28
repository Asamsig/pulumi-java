// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.compute.inputs.GalleryImageVersionPublishingProfileArgs;
import com.pulumi.azurenative.compute.inputs.GalleryImageVersionStorageProfileArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GalleryImageVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GalleryImageVersionArgs Empty = new GalleryImageVersionArgs();

    /**
     * The name of the gallery image definition in which the Image Version is to be created.
     * 
     */
    @Import(name="galleryImageName", required=true)
    private Output<String> galleryImageName;

    /**
     * @return The name of the gallery image definition in which the Image Version is to be created.
     * 
     */
    public Output<String> galleryImageName() {
        return this.galleryImageName;
    }

    /**
     * The name of the gallery image version to be created. Needs to follow semantic version name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;
     * 
     */
    @Import(name="galleryImageVersionName")
    private @Nullable Output<String> galleryImageVersionName;

    /**
     * @return The name of the gallery image version to be created. Needs to follow semantic version name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;
     * 
     */
    public Optional<Output<String>> galleryImageVersionName() {
        return Optional.ofNullable(this.galleryImageVersionName);
    }

    /**
     * The name of the Shared Image Gallery in which the Image Definition resides.
     * 
     */
    @Import(name="galleryName", required=true)
    private Output<String> galleryName;

    /**
     * @return The name of the Shared Image Gallery in which the Image Definition resides.
     * 
     */
    public Output<String> galleryName() {
        return this.galleryName;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The publishing profile of a gallery image Version.
     * 
     */
    @Import(name="publishingProfile")
    private @Nullable Output<GalleryImageVersionPublishingProfileArgs> publishingProfile;

    /**
     * @return The publishing profile of a gallery image Version.
     * 
     */
    public Optional<Output<GalleryImageVersionPublishingProfileArgs>> publishingProfile() {
        return Optional.ofNullable(this.publishingProfile);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * This is the storage profile of a Gallery Image Version.
     * 
     */
    @Import(name="storageProfile", required=true)
    private Output<GalleryImageVersionStorageProfileArgs> storageProfile;

    /**
     * @return This is the storage profile of a Gallery Image Version.
     * 
     */
    public Output<GalleryImageVersionStorageProfileArgs> storageProfile() {
        return this.storageProfile;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GalleryImageVersionArgs() {}

    private GalleryImageVersionArgs(GalleryImageVersionArgs $) {
        this.galleryImageName = $.galleryImageName;
        this.galleryImageVersionName = $.galleryImageVersionName;
        this.galleryName = $.galleryName;
        this.location = $.location;
        this.publishingProfile = $.publishingProfile;
        this.resourceGroupName = $.resourceGroupName;
        this.storageProfile = $.storageProfile;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GalleryImageVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GalleryImageVersionArgs $;

        public Builder() {
            $ = new GalleryImageVersionArgs();
        }

        public Builder(GalleryImageVersionArgs defaults) {
            $ = new GalleryImageVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param galleryImageName The name of the gallery image definition in which the Image Version is to be created.
         * 
         * @return builder
         * 
         */
        public Builder galleryImageName(Output<String> galleryImageName) {
            $.galleryImageName = galleryImageName;
            return this;
        }

        /**
         * @param galleryImageName The name of the gallery image definition in which the Image Version is to be created.
         * 
         * @return builder
         * 
         */
        public Builder galleryImageName(String galleryImageName) {
            return galleryImageName(Output.of(galleryImageName));
        }

        /**
         * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic version name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;
         * 
         * @return builder
         * 
         */
        public Builder galleryImageVersionName(@Nullable Output<String> galleryImageVersionName) {
            $.galleryImageVersionName = galleryImageVersionName;
            return this;
        }

        /**
         * @param galleryImageVersionName The name of the gallery image version to be created. Needs to follow semantic version name pattern: The allowed characters are digit and period. Digits must be within the range of a 32-bit integer. Format: &lt;MajorVersion&gt;.&lt;MinorVersion&gt;.&lt;Patch&gt;
         * 
         * @return builder
         * 
         */
        public Builder galleryImageVersionName(String galleryImageVersionName) {
            return galleryImageVersionName(Output.of(galleryImageVersionName));
        }

        /**
         * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
         * 
         * @return builder
         * 
         */
        public Builder galleryName(Output<String> galleryName) {
            $.galleryName = galleryName;
            return this;
        }

        /**
         * @param galleryName The name of the Shared Image Gallery in which the Image Definition resides.
         * 
         * @return builder
         * 
         */
        public Builder galleryName(String galleryName) {
            return galleryName(Output.of(galleryName));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param publishingProfile The publishing profile of a gallery image Version.
         * 
         * @return builder
         * 
         */
        public Builder publishingProfile(@Nullable Output<GalleryImageVersionPublishingProfileArgs> publishingProfile) {
            $.publishingProfile = publishingProfile;
            return this;
        }

        /**
         * @param publishingProfile The publishing profile of a gallery image Version.
         * 
         * @return builder
         * 
         */
        public Builder publishingProfile(GalleryImageVersionPublishingProfileArgs publishingProfile) {
            return publishingProfile(Output.of(publishingProfile));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageProfile This is the storage profile of a Gallery Image Version.
         * 
         * @return builder
         * 
         */
        public Builder storageProfile(Output<GalleryImageVersionStorageProfileArgs> storageProfile) {
            $.storageProfile = storageProfile;
            return this;
        }

        /**
         * @param storageProfile This is the storage profile of a Gallery Image Version.
         * 
         * @return builder
         * 
         */
        public Builder storageProfile(GalleryImageVersionStorageProfileArgs storageProfile) {
            return storageProfile(Output.of(storageProfile));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GalleryImageVersionArgs build() {
            $.galleryImageName = Objects.requireNonNull($.galleryImageName, "expected parameter 'galleryImageName' to be non-null");
            $.galleryName = Objects.requireNonNull($.galleryName, "expected parameter 'galleryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.storageProfile = Objects.requireNonNull($.storageProfile, "expected parameter 'storageProfile' to be non-null");
            return $;
        }
    }

}
