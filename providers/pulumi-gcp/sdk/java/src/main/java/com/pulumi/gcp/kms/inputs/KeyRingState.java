// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyRingState extends com.pulumi.resources.ResourceArgs {

    public static final KeyRingState Empty = new KeyRingState();

    /**
     * The location for the KeyRing.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location for the KeyRing.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name for the KeyRing.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name for the KeyRing.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private KeyRingState() {}

    private KeyRingState(KeyRingState $) {
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyRingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyRingState $;

        public Builder() {
            $ = new KeyRingState();
        }

        public Builder(KeyRingState defaults) {
            $ = new KeyRingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The location for the KeyRing.
         * A full list of valid locations can be found by running `gcloud kms locations list`.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location for the KeyRing.
         * A full list of valid locations can be found by running `gcloud kms locations list`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name for the KeyRing.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name for the KeyRing.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public KeyRingState build() {
            return $;
        }
    }

}
