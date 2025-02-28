// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datamigration_v1.inputs.CloudSqlSettingsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies required connection parameters, and, optionally, the parameters required to create a Cloud SQL destination database instance.
 * 
 */
public final class CloudSqlConnectionProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudSqlConnectionProfileArgs Empty = new CloudSqlConnectionProfileArgs();

    /**
     * Immutable. Metadata used to create the destination Cloud SQL database.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<CloudSqlSettingsArgs> settings;

    /**
     * @return Immutable. Metadata used to create the destination Cloud SQL database.
     * 
     */
    public Optional<Output<CloudSqlSettingsArgs>> settings() {
        return Optional.ofNullable(this.settings);
    }

    private CloudSqlConnectionProfileArgs() {}

    private CloudSqlConnectionProfileArgs(CloudSqlConnectionProfileArgs $) {
        this.settings = $.settings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudSqlConnectionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudSqlConnectionProfileArgs $;

        public Builder() {
            $ = new CloudSqlConnectionProfileArgs();
        }

        public Builder(CloudSqlConnectionProfileArgs defaults) {
            $ = new CloudSqlConnectionProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param settings Immutable. Metadata used to create the destination Cloud SQL database.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<CloudSqlSettingsArgs> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings Immutable. Metadata used to create the destination Cloud SQL database.
         * 
         * @return builder
         * 
         */
        public Builder settings(CloudSqlSettingsArgs settings) {
            return settings(Output.of(settings));
        }

        public CloudSqlConnectionProfileArgs build() {
            return $;
        }
    }

}
