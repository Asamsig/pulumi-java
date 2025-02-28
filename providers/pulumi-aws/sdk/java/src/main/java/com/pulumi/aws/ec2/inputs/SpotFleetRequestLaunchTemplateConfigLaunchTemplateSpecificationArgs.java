// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs Empty = new SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs();

    /**
     * The ID of the launch template. Conflicts with `name`.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the launch template. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the launch template. Conflicts with `id`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the launch template. Conflicts with `id`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Template version. Unlike the autoscaling equivalent, does not support `$Latest` or `$Default`, so use the launch_template resource&#39;s attribute, e.g., `&#34;${aws_launch_template.foo.latest_version}&#34;`. It will use the default version if omitted.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Template version. Unlike the autoscaling equivalent, does not support `$Latest` or `$Default`, so use the launch_template resource&#39;s attribute, e.g., `&#34;${aws_launch_template.foo.latest_version}&#34;`. It will use the default version if omitted.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs() {}

    private SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs(SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs $;

        public Builder() {
            $ = new SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs();
        }

        public Builder(SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs defaults) {
            $ = new SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the launch template. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the launch template. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the launch template. Conflicts with `id`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the launch template. Conflicts with `id`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param version Template version. Unlike the autoscaling equivalent, does not support `$Latest` or `$Default`, so use the launch_template resource&#39;s attribute, e.g., `&#34;${aws_launch_template.foo.latest_version}&#34;`. It will use the default version if omitted.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Template version. Unlike the autoscaling equivalent, does not support `$Latest` or `$Default`, so use the launch_template resource&#39;s attribute, e.g., `&#34;${aws_launch_template.foo.latest_version}&#34;`. It will use the default version if omitted.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationArgs build() {
            return $;
        }
    }

}
