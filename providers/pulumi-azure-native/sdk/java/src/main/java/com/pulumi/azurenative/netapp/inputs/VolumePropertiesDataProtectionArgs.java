// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.inputs;

import com.pulumi.azurenative.netapp.inputs.ReplicationObjectArgs;
import com.pulumi.azurenative.netapp.inputs.VolumeBackupPropertiesArgs;
import com.pulumi.azurenative.netapp.inputs.VolumeSnapshotPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DataProtection type volumes include an object containing details of the replication
 * 
 */
public final class VolumePropertiesDataProtectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumePropertiesDataProtectionArgs Empty = new VolumePropertiesDataProtectionArgs();

    /**
     * Backup Properties
     * 
     */
    @Import(name="backup")
    private @Nullable Output<VolumeBackupPropertiesArgs> backup;

    /**
     * @return Backup Properties
     * 
     */
    public Optional<Output<VolumeBackupPropertiesArgs>> backup() {
        return Optional.ofNullable(this.backup);
    }

    /**
     * Replication properties
     * 
     */
    @Import(name="replication")
    private @Nullable Output<ReplicationObjectArgs> replication;

    /**
     * @return Replication properties
     * 
     */
    public Optional<Output<ReplicationObjectArgs>> replication() {
        return Optional.ofNullable(this.replication);
    }

    /**
     * Snapshot properties.
     * 
     */
    @Import(name="snapshot")
    private @Nullable Output<VolumeSnapshotPropertiesArgs> snapshot;

    /**
     * @return Snapshot properties.
     * 
     */
    public Optional<Output<VolumeSnapshotPropertiesArgs>> snapshot() {
        return Optional.ofNullable(this.snapshot);
    }

    private VolumePropertiesDataProtectionArgs() {}

    private VolumePropertiesDataProtectionArgs(VolumePropertiesDataProtectionArgs $) {
        this.backup = $.backup;
        this.replication = $.replication;
        this.snapshot = $.snapshot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumePropertiesDataProtectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumePropertiesDataProtectionArgs $;

        public Builder() {
            $ = new VolumePropertiesDataProtectionArgs();
        }

        public Builder(VolumePropertiesDataProtectionArgs defaults) {
            $ = new VolumePropertiesDataProtectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backup Backup Properties
         * 
         * @return builder
         * 
         */
        public Builder backup(@Nullable Output<VolumeBackupPropertiesArgs> backup) {
            $.backup = backup;
            return this;
        }

        /**
         * @param backup Backup Properties
         * 
         * @return builder
         * 
         */
        public Builder backup(VolumeBackupPropertiesArgs backup) {
            return backup(Output.of(backup));
        }

        /**
         * @param replication Replication properties
         * 
         * @return builder
         * 
         */
        public Builder replication(@Nullable Output<ReplicationObjectArgs> replication) {
            $.replication = replication;
            return this;
        }

        /**
         * @param replication Replication properties
         * 
         * @return builder
         * 
         */
        public Builder replication(ReplicationObjectArgs replication) {
            return replication(Output.of(replication));
        }

        /**
         * @param snapshot Snapshot properties.
         * 
         * @return builder
         * 
         */
        public Builder snapshot(@Nullable Output<VolumeSnapshotPropertiesArgs> snapshot) {
            $.snapshot = snapshot;
            return this;
        }

        /**
         * @param snapshot Snapshot properties.
         * 
         * @return builder
         * 
         */
        public Builder snapshot(VolumeSnapshotPropertiesArgs snapshot) {
            return snapshot(Output.of(snapshot));
        }

        public VolumePropertiesDataProtectionArgs build() {
            return $;
        }
    }

}
