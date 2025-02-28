// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.SnapshotSnapshotEncryptionKeyArgs;
import com.pulumi.gcp.compute.inputs.SnapshotSourceDiskEncryptionKeyArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Labels to apply to this Snapshot.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this Snapshot.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
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

    /**
     * The customer-supplied encryption key of the snapshot. Required if the
     * source snapshot is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * 
     */
    @Import(name="snapshotEncryptionKey")
    private @Nullable Output<SnapshotSnapshotEncryptionKeyArgs> snapshotEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the snapshot. Required if the
     * source snapshot is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SnapshotSnapshotEncryptionKeyArgs>> snapshotEncryptionKey() {
        return Optional.ofNullable(this.snapshotEncryptionKey);
    }

    /**
     * A reference to the disk used to create this snapshot.
     * 
     */
    @Import(name="sourceDisk", required=true)
    private Output<String> sourceDisk;

    /**
     * @return A reference to the disk used to create this snapshot.
     * 
     */
    public Output<String> sourceDisk() {
        return this.sourceDisk;
    }

    /**
     * The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    @Import(name="sourceDiskEncryptionKey")
    private @Nullable Output<SnapshotSourceDiskEncryptionKeyArgs> sourceDiskEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SnapshotSourceDiskEncryptionKeyArgs>> sourceDiskEncryptionKey() {
        return Optional.ofNullable(this.sourceDiskEncryptionKey);
    }

    /**
     * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    @Import(name="storageLocations")
    private @Nullable Output<List<String>> storageLocations;

    /**
     * @return Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    public Optional<Output<List<String>>> storageLocations() {
        return Optional.ofNullable(this.storageLocations);
    }

    /**
     * A reference to the zone where the disk is hosted.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return A reference to the zone where the disk is hosted.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private SnapshotArgs() {}

    private SnapshotArgs(SnapshotArgs $) {
        this.description = $.description;
        this.labels = $.labels;
        this.name = $.name;
        this.project = $.project;
        this.snapshotEncryptionKey = $.snapshotEncryptionKey;
        this.sourceDisk = $.sourceDisk;
        this.sourceDiskEncryptionKey = $.sourceDiskEncryptionKey;
        this.storageLocations = $.storageLocations;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotArgs $;

        public Builder() {
            $ = new SnapshotArgs();
        }

        public Builder(SnapshotArgs defaults) {
            $ = new SnapshotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels Labels to apply to this Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels to apply to this Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
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

        /**
         * @param snapshotEncryptionKey The customer-supplied encryption key of the snapshot. Required if the
         * source snapshot is protected by a customer-supplied encryption key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder snapshotEncryptionKey(@Nullable Output<SnapshotSnapshotEncryptionKeyArgs> snapshotEncryptionKey) {
            $.snapshotEncryptionKey = snapshotEncryptionKey;
            return this;
        }

        /**
         * @param snapshotEncryptionKey The customer-supplied encryption key of the snapshot. Required if the
         * source snapshot is protected by a customer-supplied encryption key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder snapshotEncryptionKey(SnapshotSnapshotEncryptionKeyArgs snapshotEncryptionKey) {
            return snapshotEncryptionKey(Output.of(snapshotEncryptionKey));
        }

        /**
         * @param sourceDisk A reference to the disk used to create this snapshot.
         * 
         * @return builder
         * 
         */
        public Builder sourceDisk(Output<String> sourceDisk) {
            $.sourceDisk = sourceDisk;
            return this;
        }

        /**
         * @param sourceDisk A reference to the disk used to create this snapshot.
         * 
         * @return builder
         * 
         */
        public Builder sourceDisk(String sourceDisk) {
            return sourceDisk(Output.of(sourceDisk));
        }

        /**
         * @param sourceDiskEncryptionKey The customer-supplied encryption key of the source snapshot. Required
         * if the source snapshot is protected by a customer-supplied encryption
         * key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sourceDiskEncryptionKey(@Nullable Output<SnapshotSourceDiskEncryptionKeyArgs> sourceDiskEncryptionKey) {
            $.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
            return this;
        }

        /**
         * @param sourceDiskEncryptionKey The customer-supplied encryption key of the source snapshot. Required
         * if the source snapshot is protected by a customer-supplied encryption
         * key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sourceDiskEncryptionKey(SnapshotSourceDiskEncryptionKeyArgs sourceDiskEncryptionKey) {
            return sourceDiskEncryptionKey(Output.of(sourceDiskEncryptionKey));
        }

        /**
         * @param storageLocations Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(@Nullable Output<List<String>> storageLocations) {
            $.storageLocations = storageLocations;
            return this;
        }

        /**
         * @param storageLocations Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(List<String> storageLocations) {
            return storageLocations(Output.of(storageLocations));
        }

        /**
         * @param storageLocations Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(String... storageLocations) {
            return storageLocations(List.of(storageLocations));
        }

        /**
         * @param zone A reference to the zone where the disk is hosted.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone A reference to the zone where the disk is hosted.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public SnapshotArgs build() {
            $.sourceDisk = Objects.requireNonNull($.sourceDisk, "expected parameter 'sourceDisk' to be non-null");
            return $;
        }
    }

}
