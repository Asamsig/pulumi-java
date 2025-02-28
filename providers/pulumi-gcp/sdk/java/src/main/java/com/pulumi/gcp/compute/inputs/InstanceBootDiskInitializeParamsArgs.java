// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceBootDiskInitializeParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceBootDiskInitializeParamsArgs Empty = new InstanceBootDiskInitializeParamsArgs();

    /**
     * The image from which to initialize this disk. This can be
     * one of: the image&#39;s `self_link`, `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`. If referred by family, the
     * images names must include the family name. If they don&#39;t, use the
     * [gcp.compute.Image data source](https://www.terraform.io/docs/providers/google/d/compute_image.html).
     * For instance, the image `centos-6-v20180104` includes its family name `centos-6`.
     * These images can be referred by family name here.
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return The image from which to initialize this disk. This can be
     * one of: the image&#39;s `self_link`, `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`. If referred by family, the
     * images names must include the family name. If they don&#39;t, use the
     * [gcp.compute.Image data source](https://www.terraform.io/docs/providers/google/d/compute_image.html).
     * For instance, the image `centos-6-v20180104` includes its family name `centos-6`.
     * These images can be referred by family name here.
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * A map of key/value label pairs to assign to the instance.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return A map of key/value label pairs to assign to the instance.
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The size of the image in gigabytes. If not specified, it
     * will inherit the size of its base image.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return The size of the image in gigabytes. If not specified, it
     * will inherit the size of its base image.
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of reservation from which this instance can consume resources.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private InstanceBootDiskInitializeParamsArgs() {}

    private InstanceBootDiskInitializeParamsArgs(InstanceBootDiskInitializeParamsArgs $) {
        this.image = $.image;
        this.labels = $.labels;
        this.size = $.size;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceBootDiskInitializeParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceBootDiskInitializeParamsArgs $;

        public Builder() {
            $ = new InstanceBootDiskInitializeParamsArgs();
        }

        public Builder(InstanceBootDiskInitializeParamsArgs defaults) {
            $ = new InstanceBootDiskInitializeParamsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param image The image from which to initialize this disk. This can be
         * one of: the image&#39;s `self_link`, `projects/{project}/global/images/{image}`,
         * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
         * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
         * `{project}/{image}`, `{family}`, or `{image}`. If referred by family, the
         * images names must include the family name. If they don&#39;t, use the
         * [gcp.compute.Image data source](https://www.terraform.io/docs/providers/google/d/compute_image.html).
         * For instance, the image `centos-6-v20180104` includes its family name `centos-6`.
         * These images can be referred by family name here.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image The image from which to initialize this disk. This can be
         * one of: the image&#39;s `self_link`, `projects/{project}/global/images/{image}`,
         * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
         * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
         * `{project}/{image}`, `{family}`, or `{image}`. If referred by family, the
         * images names must include the family name. If they don&#39;t, use the
         * [gcp.compute.Image data source](https://www.terraform.io/docs/providers/google/d/compute_image.html).
         * For instance, the image `centos-6-v20180104` includes its family name `centos-6`.
         * These images can be referred by family name here.
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param labels A map of key/value label pairs to assign to the instance.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A map of key/value label pairs to assign to the instance.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param size The size of the image in gigabytes. If not specified, it
         * will inherit the size of its base image.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the image in gigabytes. If not specified, it
         * will inherit the size of its base image.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param type The type of reservation from which this instance can consume resources.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of reservation from which this instance can consume resources.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public InstanceBootDiskInitializeParamsArgs build() {
            return $;
        }
    }

}
