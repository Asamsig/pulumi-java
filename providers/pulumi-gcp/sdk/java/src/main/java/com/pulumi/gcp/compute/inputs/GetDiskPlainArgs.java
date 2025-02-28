// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDiskPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiskPlainArgs Empty = new GetDiskPlainArgs();

    /**
     * The name of a specific disk.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of a specific disk.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A reference to the zone where the disk resides.
     * 
     */
    @Import(name="zone")
    private @Nullable String zone;

    /**
     * @return A reference to the zone where the disk resides.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GetDiskPlainArgs() {}

    private GetDiskPlainArgs(GetDiskPlainArgs $) {
        this.name = $.name;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiskPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiskPlainArgs $;

        public Builder() {
            $ = new GetDiskPlainArgs();
        }

        public Builder(GetDiskPlainArgs defaults) {
            $ = new GetDiskPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of a specific disk.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param zone A reference to the zone where the disk resides.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable String zone) {
            $.zone = zone;
            return this;
        }

        public GetDiskPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
