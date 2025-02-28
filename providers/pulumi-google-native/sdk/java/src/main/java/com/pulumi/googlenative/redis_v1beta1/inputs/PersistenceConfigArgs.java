// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.redis_v1beta1.enums.PersistenceConfigPersistenceMode;
import com.pulumi.googlenative.redis_v1beta1.enums.PersistenceConfigRdbSnapshotPeriod;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration of the persistence functionality.
 * 
 */
public final class PersistenceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PersistenceConfigArgs Empty = new PersistenceConfigArgs();

    /**
     * Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used.
     * 
     */
    @Import(name="persistenceMode")
    private @Nullable Output<PersistenceConfigPersistenceMode> persistenceMode;

    /**
     * @return Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used.
     * 
     */
    public Optional<Output<PersistenceConfigPersistenceMode>> persistenceMode() {
        return Optional.ofNullable(this.persistenceMode);
    }

    /**
     * Optional. Period between RDB snapshots. Snapshots will be attempted every period starting from the provided snapshot start time. For example, a start time of 01/01/2033 06:45 and SIX_HOURS snapshot period will do nothing until 01/01/2033, and then trigger snapshots every day at 06:45, 12:45, 18:45, and 00:45 the next day, and so on. If not provided, TWENTY_FOUR_HOURS will be used as default.
     * 
     */
    @Import(name="rdbSnapshotPeriod")
    private @Nullable Output<PersistenceConfigRdbSnapshotPeriod> rdbSnapshotPeriod;

    /**
     * @return Optional. Period between RDB snapshots. Snapshots will be attempted every period starting from the provided snapshot start time. For example, a start time of 01/01/2033 06:45 and SIX_HOURS snapshot period will do nothing until 01/01/2033, and then trigger snapshots every day at 06:45, 12:45, 18:45, and 00:45 the next day, and so on. If not provided, TWENTY_FOUR_HOURS will be used as default.
     * 
     */
    public Optional<Output<PersistenceConfigRdbSnapshotPeriod>> rdbSnapshotPeriod() {
        return Optional.ofNullable(this.rdbSnapshotPeriod);
    }

    /**
     * Optional. Date and time that the first snapshot was/will be attempted, and to which future snapshots will be aligned. If not provided, the current time will be used.
     * 
     */
    @Import(name="rdbSnapshotStartTime")
    private @Nullable Output<String> rdbSnapshotStartTime;

    /**
     * @return Optional. Date and time that the first snapshot was/will be attempted, and to which future snapshots will be aligned. If not provided, the current time will be used.
     * 
     */
    public Optional<Output<String>> rdbSnapshotStartTime() {
        return Optional.ofNullable(this.rdbSnapshotStartTime);
    }

    private PersistenceConfigArgs() {}

    private PersistenceConfigArgs(PersistenceConfigArgs $) {
        this.persistenceMode = $.persistenceMode;
        this.rdbSnapshotPeriod = $.rdbSnapshotPeriod;
        this.rdbSnapshotStartTime = $.rdbSnapshotStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PersistenceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PersistenceConfigArgs $;

        public Builder() {
            $ = new PersistenceConfigArgs();
        }

        public Builder(PersistenceConfigArgs defaults) {
            $ = new PersistenceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param persistenceMode Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used.
         * 
         * @return builder
         * 
         */
        public Builder persistenceMode(@Nullable Output<PersistenceConfigPersistenceMode> persistenceMode) {
            $.persistenceMode = persistenceMode;
            return this;
        }

        /**
         * @param persistenceMode Optional. Controls whether Persistence features are enabled. If not provided, the existing value will be used.
         * 
         * @return builder
         * 
         */
        public Builder persistenceMode(PersistenceConfigPersistenceMode persistenceMode) {
            return persistenceMode(Output.of(persistenceMode));
        }

        /**
         * @param rdbSnapshotPeriod Optional. Period between RDB snapshots. Snapshots will be attempted every period starting from the provided snapshot start time. For example, a start time of 01/01/2033 06:45 and SIX_HOURS snapshot period will do nothing until 01/01/2033, and then trigger snapshots every day at 06:45, 12:45, 18:45, and 00:45 the next day, and so on. If not provided, TWENTY_FOUR_HOURS will be used as default.
         * 
         * @return builder
         * 
         */
        public Builder rdbSnapshotPeriod(@Nullable Output<PersistenceConfigRdbSnapshotPeriod> rdbSnapshotPeriod) {
            $.rdbSnapshotPeriod = rdbSnapshotPeriod;
            return this;
        }

        /**
         * @param rdbSnapshotPeriod Optional. Period between RDB snapshots. Snapshots will be attempted every period starting from the provided snapshot start time. For example, a start time of 01/01/2033 06:45 and SIX_HOURS snapshot period will do nothing until 01/01/2033, and then trigger snapshots every day at 06:45, 12:45, 18:45, and 00:45 the next day, and so on. If not provided, TWENTY_FOUR_HOURS will be used as default.
         * 
         * @return builder
         * 
         */
        public Builder rdbSnapshotPeriod(PersistenceConfigRdbSnapshotPeriod rdbSnapshotPeriod) {
            return rdbSnapshotPeriod(Output.of(rdbSnapshotPeriod));
        }

        /**
         * @param rdbSnapshotStartTime Optional. Date and time that the first snapshot was/will be attempted, and to which future snapshots will be aligned. If not provided, the current time will be used.
         * 
         * @return builder
         * 
         */
        public Builder rdbSnapshotStartTime(@Nullable Output<String> rdbSnapshotStartTime) {
            $.rdbSnapshotStartTime = rdbSnapshotStartTime;
            return this;
        }

        /**
         * @param rdbSnapshotStartTime Optional. Date and time that the first snapshot was/will be attempted, and to which future snapshots will be aligned. If not provided, the current time will be used.
         * 
         * @return builder
         * 
         */
        public Builder rdbSnapshotStartTime(String rdbSnapshotStartTime) {
            return rdbSnapshotStartTime(Output.of(rdbSnapshotStartTime));
        }

        public PersistenceConfigArgs build() {
            return $;
        }
    }

}
