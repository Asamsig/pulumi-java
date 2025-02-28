// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * The DB Instance Identifier from which to take the snapshot.
     * 
     */
    @Import(name="dbInstanceIdentifier", required=true)
    private Output<String> dbInstanceIdentifier;

    /**
     * @return The DB Instance Identifier from which to take the snapshot.
     * 
     */
    public Output<String> dbInstanceIdentifier() {
        return this.dbInstanceIdentifier;
    }

    /**
     * The Identifier for the snapshot.
     * 
     */
    @Import(name="dbSnapshotIdentifier", required=true)
    private Output<String> dbSnapshotIdentifier;

    /**
     * @return The Identifier for the snapshot.
     * 
     */
    public Output<String> dbSnapshotIdentifier() {
        return this.dbSnapshotIdentifier;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SnapshotArgs() {}

    private SnapshotArgs(SnapshotArgs $) {
        this.dbInstanceIdentifier = $.dbInstanceIdentifier;
        this.dbSnapshotIdentifier = $.dbSnapshotIdentifier;
        this.tags = $.tags;
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
         * @param dbInstanceIdentifier The DB Instance Identifier from which to take the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceIdentifier(Output<String> dbInstanceIdentifier) {
            $.dbInstanceIdentifier = dbInstanceIdentifier;
            return this;
        }

        /**
         * @param dbInstanceIdentifier The DB Instance Identifier from which to take the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceIdentifier(String dbInstanceIdentifier) {
            return dbInstanceIdentifier(Output.of(dbInstanceIdentifier));
        }

        /**
         * @param dbSnapshotIdentifier The Identifier for the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dbSnapshotIdentifier(Output<String> dbSnapshotIdentifier) {
            $.dbSnapshotIdentifier = dbSnapshotIdentifier;
            return this;
        }

        /**
         * @param dbSnapshotIdentifier The Identifier for the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder dbSnapshotIdentifier(String dbSnapshotIdentifier) {
            return dbSnapshotIdentifier(Output.of(dbSnapshotIdentifier));
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SnapshotArgs build() {
            $.dbInstanceIdentifier = Objects.requireNonNull($.dbInstanceIdentifier, "expected parameter 'dbInstanceIdentifier' to be non-null");
            $.dbSnapshotIdentifier = Objects.requireNonNull($.dbSnapshotIdentifier, "expected parameter 'dbSnapshotIdentifier' to be non-null");
            return $;
        }
    }

}
