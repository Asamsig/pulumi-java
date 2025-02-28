// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datamigration_v1.enums.CloudSqlSettingsActivationPolicy;
import com.pulumi.googlenative.datamigration_v1.enums.CloudSqlSettingsDataDiskType;
import com.pulumi.googlenative.datamigration_v1.enums.CloudSqlSettingsDatabaseVersion;
import com.pulumi.googlenative.datamigration_v1.inputs.SqlIpConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for creating a Cloud SQL database instance.
 * 
 */
public final class CloudSqlSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudSqlSettingsArgs Empty = new CloudSqlSettingsArgs();

    /**
     * The activation policy specifies when the instance is activated; it is applicable only when the instance state is &#39;RUNNABLE&#39;. Valid values: &#39;ALWAYS&#39;: The instance is on, and remains so even in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    @Import(name="activationPolicy")
    private @Nullable Output<CloudSqlSettingsActivationPolicy> activationPolicy;

    /**
     * @return The activation policy specifies when the instance is activated; it is applicable only when the instance state is &#39;RUNNABLE&#39;. Valid values: &#39;ALWAYS&#39;: The instance is on, and remains so even in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    public Optional<Output<CloudSqlSettingsActivationPolicy>> activationPolicy() {
        return Optional.ofNullable(this.activationPolicy);
    }

    /**
     * [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30 seconds. If the available storage falls below a threshold size, Cloud SQL automatically adds additional storage capacity. If the available storage repeatedly falls below the threshold size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
     * 
     */
    @Import(name="autoStorageIncrease")
    private @Nullable Output<Boolean> autoStorageIncrease;

    /**
     * @return [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30 seconds. If the available storage falls below a threshold size, Cloud SQL automatically adds additional storage capacity. If the available storage repeatedly falls below the threshold size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
     * 
     */
    public Optional<Output<Boolean>> autoStorageIncrease() {
        return Optional.ofNullable(this.autoStorageIncrease);
    }

    /**
     * The KMS key name used for the csql instance.
     * 
     */
    @Import(name="cmekKeyName")
    private @Nullable Output<String> cmekKeyName;

    /**
     * @return The KMS key name used for the csql instance.
     * 
     */
    public Optional<Output<String>> cmekKeyName() {
        return Optional.ofNullable(this.cmekKeyName);
    }

    /**
     * The Cloud SQL default instance level collation.
     * 
     */
    @Import(name="collation")
    private @Nullable Output<String> collation;

    /**
     * @return The Cloud SQL default instance level collation.
     * 
     */
    public Optional<Output<String>> collation() {
        return Optional.ofNullable(this.collation);
    }

    /**
     * The storage capacity available to the database, in GB. The minimum (and default) size is 10GB.
     * 
     */
    @Import(name="dataDiskSizeGb")
    private @Nullable Output<String> dataDiskSizeGb;

    /**
     * @return The storage capacity available to the database, in GB. The minimum (and default) size is 10GB.
     * 
     */
    public Optional<Output<String>> dataDiskSizeGb() {
        return Optional.ofNullable(this.dataDiskSizeGb);
    }

    /**
     * The type of storage: `PD_SSD` (default) or `PD_HDD`.
     * 
     */
    @Import(name="dataDiskType")
    private @Nullable Output<CloudSqlSettingsDataDiskType> dataDiskType;

    /**
     * @return The type of storage: `PD_SSD` (default) or `PD_HDD`.
     * 
     */
    public Optional<Output<CloudSqlSettingsDataDiskType>> dataDiskType() {
        return Optional.ofNullable(this.dataDiskType);
    }

    /**
     * The database flags passed to the Cloud SQL instance at startup. An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Import(name="databaseFlags")
    private @Nullable Output<Map<String,String>> databaseFlags;

    /**
     * @return The database flags passed to the Cloud SQL instance at startup. An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    public Optional<Output<Map<String,String>>> databaseFlags() {
        return Optional.ofNullable(this.databaseFlags);
    }

    /**
     * The database engine type and version.
     * 
     */
    @Import(name="databaseVersion")
    private @Nullable Output<CloudSqlSettingsDatabaseVersion> databaseVersion;

    /**
     * @return The database engine type and version.
     * 
     */
    public Optional<Output<CloudSqlSettingsDatabaseVersion>> databaseVersion() {
        return Optional.ofNullable(this.databaseVersion);
    }

    /**
     * The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled.
     * 
     */
    @Import(name="ipConfig")
    private @Nullable Output<SqlIpConfigArgs> ipConfig;

    /**
     * @return The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled.
     * 
     */
    public Optional<Output<SqlIpConfigArgs>> ipConfig() {
        return Optional.ofNullable(this.ipConfig);
    }

    /**
     * Input only. Initial root password.
     * 
     */
    @Import(name="rootPassword")
    private @Nullable Output<String> rootPassword;

    /**
     * @return Input only. Initial root password.
     * 
     */
    public Optional<Output<String>> rootPassword() {
        return Optional.ofNullable(this.rootPassword);
    }

    /**
     * The Database Migration Service source connection profile ID, in the format: `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
     * 
     */
    @Import(name="sourceId")
    private @Nullable Output<String> sourceId;

    /**
     * @return The Database Migration Service source connection profile ID, in the format: `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
     * 
     */
    public Optional<Output<String>> sourceId() {
        return Optional.ofNullable(this.sourceId);
    }

    /**
     * The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
     * 
     */
    @Import(name="storageAutoResizeLimit")
    private @Nullable Output<String> storageAutoResizeLimit;

    /**
     * @return The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
     * 
     */
    public Optional<Output<String>> storageAutoResizeLimit() {
        return Optional.ofNullable(this.storageAutoResizeLimit);
    }

    /**
     * The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances) or `db-custom-1-3840` (PostgreSQL instances). For more information, see [Cloud SQL Instance Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances) or `db-custom-1-3840` (PostgreSQL instances). For more information, see [Cloud SQL Instance Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    /**
     * The resource labels for a Cloud SQL instance to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;18kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
     * 
     */
    @Import(name="userLabels")
    private @Nullable Output<Map<String,String>> userLabels;

    /**
     * @return The resource labels for a Cloud SQL instance to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;18kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
     * 
     */
    public Optional<Output<Map<String,String>>> userLabels() {
        return Optional.ofNullable(this.userLabels);
    }

    /**
     * The Google Cloud Platform zone where your Cloud SQL datdabse instance is located.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The Google Cloud Platform zone where your Cloud SQL datdabse instance is located.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private CloudSqlSettingsArgs() {}

    private CloudSqlSettingsArgs(CloudSqlSettingsArgs $) {
        this.activationPolicy = $.activationPolicy;
        this.autoStorageIncrease = $.autoStorageIncrease;
        this.cmekKeyName = $.cmekKeyName;
        this.collation = $.collation;
        this.dataDiskSizeGb = $.dataDiskSizeGb;
        this.dataDiskType = $.dataDiskType;
        this.databaseFlags = $.databaseFlags;
        this.databaseVersion = $.databaseVersion;
        this.ipConfig = $.ipConfig;
        this.rootPassword = $.rootPassword;
        this.sourceId = $.sourceId;
        this.storageAutoResizeLimit = $.storageAutoResizeLimit;
        this.tier = $.tier;
        this.userLabels = $.userLabels;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudSqlSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudSqlSettingsArgs $;

        public Builder() {
            $ = new CloudSqlSettingsArgs();
        }

        public Builder(CloudSqlSettingsArgs defaults) {
            $ = new CloudSqlSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activationPolicy The activation policy specifies when the instance is activated; it is applicable only when the instance state is &#39;RUNNABLE&#39;. Valid values: &#39;ALWAYS&#39;: The instance is on, and remains so even in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
         * 
         * @return builder
         * 
         */
        public Builder activationPolicy(@Nullable Output<CloudSqlSettingsActivationPolicy> activationPolicy) {
            $.activationPolicy = activationPolicy;
            return this;
        }

        /**
         * @param activationPolicy The activation policy specifies when the instance is activated; it is applicable only when the instance state is &#39;RUNNABLE&#39;. Valid values: &#39;ALWAYS&#39;: The instance is on, and remains so even in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
         * 
         * @return builder
         * 
         */
        public Builder activationPolicy(CloudSqlSettingsActivationPolicy activationPolicy) {
            return activationPolicy(Output.of(activationPolicy));
        }

        /**
         * @param autoStorageIncrease [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30 seconds. If the available storage falls below a threshold size, Cloud SQL automatically adds additional storage capacity. If the available storage repeatedly falls below the threshold size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
         * 
         * @return builder
         * 
         */
        public Builder autoStorageIncrease(@Nullable Output<Boolean> autoStorageIncrease) {
            $.autoStorageIncrease = autoStorageIncrease;
            return this;
        }

        /**
         * @param autoStorageIncrease [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30 seconds. If the available storage falls below a threshold size, Cloud SQL automatically adds additional storage capacity. If the available storage repeatedly falls below the threshold size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
         * 
         * @return builder
         * 
         */
        public Builder autoStorageIncrease(Boolean autoStorageIncrease) {
            return autoStorageIncrease(Output.of(autoStorageIncrease));
        }

        /**
         * @param cmekKeyName The KMS key name used for the csql instance.
         * 
         * @return builder
         * 
         */
        public Builder cmekKeyName(@Nullable Output<String> cmekKeyName) {
            $.cmekKeyName = cmekKeyName;
            return this;
        }

        /**
         * @param cmekKeyName The KMS key name used for the csql instance.
         * 
         * @return builder
         * 
         */
        public Builder cmekKeyName(String cmekKeyName) {
            return cmekKeyName(Output.of(cmekKeyName));
        }

        /**
         * @param collation The Cloud SQL default instance level collation.
         * 
         * @return builder
         * 
         */
        public Builder collation(@Nullable Output<String> collation) {
            $.collation = collation;
            return this;
        }

        /**
         * @param collation The Cloud SQL default instance level collation.
         * 
         * @return builder
         * 
         */
        public Builder collation(String collation) {
            return collation(Output.of(collation));
        }

        /**
         * @param dataDiskSizeGb The storage capacity available to the database, in GB. The minimum (and default) size is 10GB.
         * 
         * @return builder
         * 
         */
        public Builder dataDiskSizeGb(@Nullable Output<String> dataDiskSizeGb) {
            $.dataDiskSizeGb = dataDiskSizeGb;
            return this;
        }

        /**
         * @param dataDiskSizeGb The storage capacity available to the database, in GB. The minimum (and default) size is 10GB.
         * 
         * @return builder
         * 
         */
        public Builder dataDiskSizeGb(String dataDiskSizeGb) {
            return dataDiskSizeGb(Output.of(dataDiskSizeGb));
        }

        /**
         * @param dataDiskType The type of storage: `PD_SSD` (default) or `PD_HDD`.
         * 
         * @return builder
         * 
         */
        public Builder dataDiskType(@Nullable Output<CloudSqlSettingsDataDiskType> dataDiskType) {
            $.dataDiskType = dataDiskType;
            return this;
        }

        /**
         * @param dataDiskType The type of storage: `PD_SSD` (default) or `PD_HDD`.
         * 
         * @return builder
         * 
         */
        public Builder dataDiskType(CloudSqlSettingsDataDiskType dataDiskType) {
            return dataDiskType(Output.of(dataDiskType));
        }

        /**
         * @param databaseFlags The database flags passed to the Cloud SQL instance at startup. An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
         * 
         * @return builder
         * 
         */
        public Builder databaseFlags(@Nullable Output<Map<String,String>> databaseFlags) {
            $.databaseFlags = databaseFlags;
            return this;
        }

        /**
         * @param databaseFlags The database flags passed to the Cloud SQL instance at startup. An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
         * 
         * @return builder
         * 
         */
        public Builder databaseFlags(Map<String,String> databaseFlags) {
            return databaseFlags(Output.of(databaseFlags));
        }

        /**
         * @param databaseVersion The database engine type and version.
         * 
         * @return builder
         * 
         */
        public Builder databaseVersion(@Nullable Output<CloudSqlSettingsDatabaseVersion> databaseVersion) {
            $.databaseVersion = databaseVersion;
            return this;
        }

        /**
         * @param databaseVersion The database engine type and version.
         * 
         * @return builder
         * 
         */
        public Builder databaseVersion(CloudSqlSettingsDatabaseVersion databaseVersion) {
            return databaseVersion(Output.of(databaseVersion));
        }

        /**
         * @param ipConfig The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled.
         * 
         * @return builder
         * 
         */
        public Builder ipConfig(@Nullable Output<SqlIpConfigArgs> ipConfig) {
            $.ipConfig = ipConfig;
            return this;
        }

        /**
         * @param ipConfig The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled.
         * 
         * @return builder
         * 
         */
        public Builder ipConfig(SqlIpConfigArgs ipConfig) {
            return ipConfig(Output.of(ipConfig));
        }

        /**
         * @param rootPassword Input only. Initial root password.
         * 
         * @return builder
         * 
         */
        public Builder rootPassword(@Nullable Output<String> rootPassword) {
            $.rootPassword = rootPassword;
            return this;
        }

        /**
         * @param rootPassword Input only. Initial root password.
         * 
         * @return builder
         * 
         */
        public Builder rootPassword(String rootPassword) {
            return rootPassword(Output.of(rootPassword));
        }

        /**
         * @param sourceId The Database Migration Service source connection profile ID, in the format: `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
         * 
         * @return builder
         * 
         */
        public Builder sourceId(@Nullable Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        /**
         * @param sourceId The Database Migration Service source connection profile ID, in the format: `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
         * 
         * @return builder
         * 
         */
        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        /**
         * @param storageAutoResizeLimit The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
         * 
         * @return builder
         * 
         */
        public Builder storageAutoResizeLimit(@Nullable Output<String> storageAutoResizeLimit) {
            $.storageAutoResizeLimit = storageAutoResizeLimit;
            return this;
        }

        /**
         * @param storageAutoResizeLimit The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
         * 
         * @return builder
         * 
         */
        public Builder storageAutoResizeLimit(String storageAutoResizeLimit) {
            return storageAutoResizeLimit(Output.of(storageAutoResizeLimit));
        }

        /**
         * @param tier The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances) or `db-custom-1-3840` (PostgreSQL instances). For more information, see [Cloud SQL Instance Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances) or `db-custom-1-3840` (PostgreSQL instances). For more information, see [Cloud SQL Instance Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        /**
         * @param userLabels The resource labels for a Cloud SQL instance to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;18kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
         * 
         * @return builder
         * 
         */
        public Builder userLabels(@Nullable Output<Map<String,String>> userLabels) {
            $.userLabels = userLabels;
            return this;
        }

        /**
         * @param userLabels The resource labels for a Cloud SQL instance to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;18kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
         * 
         * @return builder
         * 
         */
        public Builder userLabels(Map<String,String> userLabels) {
            return userLabels(Output.of(userLabels));
        }

        /**
         * @param zone The Google Cloud Platform zone where your Cloud SQL datdabse instance is located.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The Google Cloud Platform zone where your Cloud SQL datdabse instance is located.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public CloudSqlSettingsArgs build() {
            return $;
        }
    }

}
