// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail;

import com.pulumi.awsnative.lightsail.inputs.DatabaseRelationalDatabaseParameterArgs;
import com.pulumi.awsnative.lightsail.inputs.DatabaseTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    /**
     * The Availability Zone in which to create your new database. Use the us-east-2a case-sensitive format.
     * 
     */
    @Import(name="availabilityZone")
    private @Nullable Output<String> availabilityZone;

    /**
     * @return The Availability Zone in which to create your new database. Use the us-east-2a case-sensitive format.
     * 
     */
    public Optional<Output<String>> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    /**
     * When true, enables automated backup retention for your database. Updates are applied during the next maintenance window because this can result in an outage.
     * 
     */
    @Import(name="backupRetention")
    private @Nullable Output<Boolean> backupRetention;

    /**
     * @return When true, enables automated backup retention for your database. Updates are applied during the next maintenance window because this can result in an outage.
     * 
     */
    public Optional<Output<Boolean>> backupRetention() {
        return Optional.ofNullable(this.backupRetention);
    }

    /**
     * Indicates the certificate that needs to be associated with the database.
     * 
     */
    @Import(name="caCertificateIdentifier")
    private @Nullable Output<String> caCertificateIdentifier;

    /**
     * @return Indicates the certificate that needs to be associated with the database.
     * 
     */
    public Optional<Output<String>> caCertificateIdentifier() {
        return Optional.ofNullable(this.caCertificateIdentifier);
    }

    /**
     * The name of the database to create when the Lightsail database resource is created. For MySQL, if this parameter isn&#39;t specified, no database is created in the database resource. For PostgreSQL, if this parameter isn&#39;t specified, a database named postgres is created in the database resource.
     * 
     */
    @Import(name="masterDatabaseName", required=true)
    private Output<String> masterDatabaseName;

    /**
     * @return The name of the database to create when the Lightsail database resource is created. For MySQL, if this parameter isn&#39;t specified, no database is created in the database resource. For PostgreSQL, if this parameter isn&#39;t specified, a database named postgres is created in the database resource.
     * 
     */
    public Output<String> masterDatabaseName() {
        return this.masterDatabaseName;
    }

    /**
     * The password for the master user. The password can include any printable ASCII character except &#34;/&#34;, &#34;&#34;&#34;, or &#34;@&#34;. It cannot contain spaces.
     * 
     */
    @Import(name="masterUserPassword")
    private @Nullable Output<String> masterUserPassword;

    /**
     * @return The password for the master user. The password can include any printable ASCII character except &#34;/&#34;, &#34;&#34;&#34;, or &#34;@&#34;. It cannot contain spaces.
     * 
     */
    public Optional<Output<String>> masterUserPassword() {
        return Optional.ofNullable(this.masterUserPassword);
    }

    /**
     * The name for the master user.
     * 
     */
    @Import(name="masterUsername", required=true)
    private Output<String> masterUsername;

    /**
     * @return The name for the master user.
     * 
     */
    public Output<String> masterUsername() {
        return this.masterUsername;
    }

    /**
     * The daily time range during which automated backups are created for your new database if automated backups are enabled.
     * 
     */
    @Import(name="preferredBackupWindow")
    private @Nullable Output<String> preferredBackupWindow;

    /**
     * @return The daily time range during which automated backups are created for your new database if automated backups are enabled.
     * 
     */
    public Optional<Output<String>> preferredBackupWindow() {
        return Optional.ofNullable(this.preferredBackupWindow);
    }

    /**
     * The weekly time range during which system maintenance can occur on your new database.
     * 
     */
    @Import(name="preferredMaintenanceWindow")
    private @Nullable Output<String> preferredMaintenanceWindow;

    /**
     * @return The weekly time range during which system maintenance can occur on your new database.
     * 
     */
    public Optional<Output<String>> preferredMaintenanceWindow() {
        return Optional.ofNullable(this.preferredMaintenanceWindow);
    }

    /**
     * Specifies the accessibility options for your new database. A value of true specifies a database that is available to resources outside of your Lightsail account. A value of false specifies a database that is available only to your Lightsail resources in the same region as your database.
     * 
     */
    @Import(name="publiclyAccessible")
    private @Nullable Output<Boolean> publiclyAccessible;

    /**
     * @return Specifies the accessibility options for your new database. A value of true specifies a database that is available to resources outside of your Lightsail account. A value of false specifies a database that is available only to your Lightsail resources in the same region as your database.
     * 
     */
    public Optional<Output<Boolean>> publiclyAccessible() {
        return Optional.ofNullable(this.publiclyAccessible);
    }

    /**
     * The blueprint ID for your new database. A blueprint describes the major engine version of a database.
     * 
     */
    @Import(name="relationalDatabaseBlueprintId", required=true)
    private Output<String> relationalDatabaseBlueprintId;

    /**
     * @return The blueprint ID for your new database. A blueprint describes the major engine version of a database.
     * 
     */
    public Output<String> relationalDatabaseBlueprintId() {
        return this.relationalDatabaseBlueprintId;
    }

    /**
     * The bundle ID for your new database. A bundle describes the performance specifications for your database.
     * 
     */
    @Import(name="relationalDatabaseBundleId", required=true)
    private Output<String> relationalDatabaseBundleId;

    /**
     * @return The bundle ID for your new database. A bundle describes the performance specifications for your database.
     * 
     */
    public Output<String> relationalDatabaseBundleId() {
        return this.relationalDatabaseBundleId;
    }

    /**
     * The name to use for your new Lightsail database resource.
     * 
     */
    @Import(name="relationalDatabaseName", required=true)
    private Output<String> relationalDatabaseName;

    /**
     * @return The name to use for your new Lightsail database resource.
     * 
     */
    public Output<String> relationalDatabaseName() {
        return this.relationalDatabaseName;
    }

    /**
     * Update one or more parameters of the relational database.
     * 
     */
    @Import(name="relationalDatabaseParameters")
    private @Nullable Output<List<DatabaseRelationalDatabaseParameterArgs>> relationalDatabaseParameters;

    /**
     * @return Update one or more parameters of the relational database.
     * 
     */
    public Optional<Output<List<DatabaseRelationalDatabaseParameterArgs>>> relationalDatabaseParameters() {
        return Optional.ofNullable(this.relationalDatabaseParameters);
    }

    /**
     * When true, the master user password is changed to a new strong password generated by Lightsail. Use the get relational database master user password operation to get the new password.
     * 
     */
    @Import(name="rotateMasterUserPassword")
    private @Nullable Output<Boolean> rotateMasterUserPassword;

    /**
     * @return When true, the master user password is changed to a new strong password generated by Lightsail. Use the get relational database master user password operation to get the new password.
     * 
     */
    public Optional<Output<Boolean>> rotateMasterUserPassword() {
        return Optional.ofNullable(this.rotateMasterUserPassword);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<DatabaseTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<DatabaseTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DatabaseArgs() {}

    private DatabaseArgs(DatabaseArgs $) {
        this.availabilityZone = $.availabilityZone;
        this.backupRetention = $.backupRetention;
        this.caCertificateIdentifier = $.caCertificateIdentifier;
        this.masterDatabaseName = $.masterDatabaseName;
        this.masterUserPassword = $.masterUserPassword;
        this.masterUsername = $.masterUsername;
        this.preferredBackupWindow = $.preferredBackupWindow;
        this.preferredMaintenanceWindow = $.preferredMaintenanceWindow;
        this.publiclyAccessible = $.publiclyAccessible;
        this.relationalDatabaseBlueprintId = $.relationalDatabaseBlueprintId;
        this.relationalDatabaseBundleId = $.relationalDatabaseBundleId;
        this.relationalDatabaseName = $.relationalDatabaseName;
        this.relationalDatabaseParameters = $.relationalDatabaseParameters;
        this.rotateMasterUserPassword = $.rotateMasterUserPassword;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseArgs $;

        public Builder() {
            $ = new DatabaseArgs();
        }

        public Builder(DatabaseArgs defaults) {
            $ = new DatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityZone The Availability Zone in which to create your new database. Use the us-east-2a case-sensitive format.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * @param availabilityZone The Availability Zone in which to create your new database. Use the us-east-2a case-sensitive format.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        /**
         * @param backupRetention When true, enables automated backup retention for your database. Updates are applied during the next maintenance window because this can result in an outage.
         * 
         * @return builder
         * 
         */
        public Builder backupRetention(@Nullable Output<Boolean> backupRetention) {
            $.backupRetention = backupRetention;
            return this;
        }

        /**
         * @param backupRetention When true, enables automated backup retention for your database. Updates are applied during the next maintenance window because this can result in an outage.
         * 
         * @return builder
         * 
         */
        public Builder backupRetention(Boolean backupRetention) {
            return backupRetention(Output.of(backupRetention));
        }

        /**
         * @param caCertificateIdentifier Indicates the certificate that needs to be associated with the database.
         * 
         * @return builder
         * 
         */
        public Builder caCertificateIdentifier(@Nullable Output<String> caCertificateIdentifier) {
            $.caCertificateIdentifier = caCertificateIdentifier;
            return this;
        }

        /**
         * @param caCertificateIdentifier Indicates the certificate that needs to be associated with the database.
         * 
         * @return builder
         * 
         */
        public Builder caCertificateIdentifier(String caCertificateIdentifier) {
            return caCertificateIdentifier(Output.of(caCertificateIdentifier));
        }

        /**
         * @param masterDatabaseName The name of the database to create when the Lightsail database resource is created. For MySQL, if this parameter isn&#39;t specified, no database is created in the database resource. For PostgreSQL, if this parameter isn&#39;t specified, a database named postgres is created in the database resource.
         * 
         * @return builder
         * 
         */
        public Builder masterDatabaseName(Output<String> masterDatabaseName) {
            $.masterDatabaseName = masterDatabaseName;
            return this;
        }

        /**
         * @param masterDatabaseName The name of the database to create when the Lightsail database resource is created. For MySQL, if this parameter isn&#39;t specified, no database is created in the database resource. For PostgreSQL, if this parameter isn&#39;t specified, a database named postgres is created in the database resource.
         * 
         * @return builder
         * 
         */
        public Builder masterDatabaseName(String masterDatabaseName) {
            return masterDatabaseName(Output.of(masterDatabaseName));
        }

        /**
         * @param masterUserPassword The password for the master user. The password can include any printable ASCII character except &#34;/&#34;, &#34;&#34;&#34;, or &#34;@&#34;. It cannot contain spaces.
         * 
         * @return builder
         * 
         */
        public Builder masterUserPassword(@Nullable Output<String> masterUserPassword) {
            $.masterUserPassword = masterUserPassword;
            return this;
        }

        /**
         * @param masterUserPassword The password for the master user. The password can include any printable ASCII character except &#34;/&#34;, &#34;&#34;&#34;, or &#34;@&#34;. It cannot contain spaces.
         * 
         * @return builder
         * 
         */
        public Builder masterUserPassword(String masterUserPassword) {
            return masterUserPassword(Output.of(masterUserPassword));
        }

        /**
         * @param masterUsername The name for the master user.
         * 
         * @return builder
         * 
         */
        public Builder masterUsername(Output<String> masterUsername) {
            $.masterUsername = masterUsername;
            return this;
        }

        /**
         * @param masterUsername The name for the master user.
         * 
         * @return builder
         * 
         */
        public Builder masterUsername(String masterUsername) {
            return masterUsername(Output.of(masterUsername));
        }

        /**
         * @param preferredBackupWindow The daily time range during which automated backups are created for your new database if automated backups are enabled.
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupWindow(@Nullable Output<String> preferredBackupWindow) {
            $.preferredBackupWindow = preferredBackupWindow;
            return this;
        }

        /**
         * @param preferredBackupWindow The daily time range during which automated backups are created for your new database if automated backups are enabled.
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupWindow(String preferredBackupWindow) {
            return preferredBackupWindow(Output.of(preferredBackupWindow));
        }

        /**
         * @param preferredMaintenanceWindow The weekly time range during which system maintenance can occur on your new database.
         * 
         * @return builder
         * 
         */
        public Builder preferredMaintenanceWindow(@Nullable Output<String> preferredMaintenanceWindow) {
            $.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        /**
         * @param preferredMaintenanceWindow The weekly time range during which system maintenance can occur on your new database.
         * 
         * @return builder
         * 
         */
        public Builder preferredMaintenanceWindow(String preferredMaintenanceWindow) {
            return preferredMaintenanceWindow(Output.of(preferredMaintenanceWindow));
        }

        /**
         * @param publiclyAccessible Specifies the accessibility options for your new database. A value of true specifies a database that is available to resources outside of your Lightsail account. A value of false specifies a database that is available only to your Lightsail resources in the same region as your database.
         * 
         * @return builder
         * 
         */
        public Builder publiclyAccessible(@Nullable Output<Boolean> publiclyAccessible) {
            $.publiclyAccessible = publiclyAccessible;
            return this;
        }

        /**
         * @param publiclyAccessible Specifies the accessibility options for your new database. A value of true specifies a database that is available to resources outside of your Lightsail account. A value of false specifies a database that is available only to your Lightsail resources in the same region as your database.
         * 
         * @return builder
         * 
         */
        public Builder publiclyAccessible(Boolean publiclyAccessible) {
            return publiclyAccessible(Output.of(publiclyAccessible));
        }

        /**
         * @param relationalDatabaseBlueprintId The blueprint ID for your new database. A blueprint describes the major engine version of a database.
         * 
         * @return builder
         * 
         */
        public Builder relationalDatabaseBlueprintId(Output<String> relationalDatabaseBlueprintId) {
            $.relationalDatabaseBlueprintId = relationalDatabaseBlueprintId;
            return this;
        }

        /**
         * @param relationalDatabaseBlueprintId The blueprint ID for your new database. A blueprint describes the major engine version of a database.
         * 
         * @return builder
         * 
         */
        public Builder relationalDatabaseBlueprintId(String relationalDatabaseBlueprintId) {
            return relationalDatabaseBlueprintId(Output.of(relationalDatabaseBlueprintId));
        }

        /**
         * @param relationalDatabaseBundleId The bundle ID for your new database. A bundle describes the performance specifications for your database.
         * 
         * @return builder
         * 
         */
        public Builder relationalDatabaseBundleId(Output<String> relationalDatabaseBundleId) {
            $.relationalDatabaseBundleId = relationalDatabaseBundleId;
            return this;
        }

        /**
         * @param relationalDatabaseBundleId The bundle ID for your new database. A bundle describes the performance specifications for your database.
         * 
         * @return builder
         * 
         */
        public Builder relationalDatabaseBundleId(String relationalDatabaseBundleId) {
            return relationalDatabaseBundleId(Output.of(relationalDatabaseBundleId));
        }

        /**
         * @param relationalDatabaseName The name to use for your new Lightsail database resource.
         * 
         * @return builder
         * 
         */
        public Builder relationalDatabaseName(Output<String> relationalDatabaseName) {
            $.relationalDatabaseName = relationalDatabaseName;
            return this;
        }

        /**
         * @param relationalDatabaseName The name to use for your new Lightsail database resource.
         * 
         * @return builder
         * 
         */
        public Builder relationalDatabaseName(String relationalDatabaseName) {
            return relationalDatabaseName(Output.of(relationalDatabaseName));
        }

        /**
         * @param relationalDatabaseParameters Update one or more parameters of the relational database.
         * 
         * @return builder
         * 
         */
        public Builder relationalDatabaseParameters(@Nullable Output<List<DatabaseRelationalDatabaseParameterArgs>> relationalDatabaseParameters) {
            $.relationalDatabaseParameters = relationalDatabaseParameters;
            return this;
        }

        /**
         * @param relationalDatabaseParameters Update one or more parameters of the relational database.
         * 
         * @return builder
         * 
         */
        public Builder relationalDatabaseParameters(List<DatabaseRelationalDatabaseParameterArgs> relationalDatabaseParameters) {
            return relationalDatabaseParameters(Output.of(relationalDatabaseParameters));
        }

        /**
         * @param relationalDatabaseParameters Update one or more parameters of the relational database.
         * 
         * @return builder
         * 
         */
        public Builder relationalDatabaseParameters(DatabaseRelationalDatabaseParameterArgs... relationalDatabaseParameters) {
            return relationalDatabaseParameters(List.of(relationalDatabaseParameters));
        }

        /**
         * @param rotateMasterUserPassword When true, the master user password is changed to a new strong password generated by Lightsail. Use the get relational database master user password operation to get the new password.
         * 
         * @return builder
         * 
         */
        public Builder rotateMasterUserPassword(@Nullable Output<Boolean> rotateMasterUserPassword) {
            $.rotateMasterUserPassword = rotateMasterUserPassword;
            return this;
        }

        /**
         * @param rotateMasterUserPassword When true, the master user password is changed to a new strong password generated by Lightsail. Use the get relational database master user password operation to get the new password.
         * 
         * @return builder
         * 
         */
        public Builder rotateMasterUserPassword(Boolean rotateMasterUserPassword) {
            return rotateMasterUserPassword(Output.of(rotateMasterUserPassword));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<DatabaseTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<DatabaseTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(DatabaseTagArgs... tags) {
            return tags(List.of(tags));
        }

        public DatabaseArgs build() {
            $.masterDatabaseName = Objects.requireNonNull($.masterDatabaseName, "expected parameter 'masterDatabaseName' to be non-null");
            $.masterUsername = Objects.requireNonNull($.masterUsername, "expected parameter 'masterUsername' to be non-null");
            $.relationalDatabaseBlueprintId = Objects.requireNonNull($.relationalDatabaseBlueprintId, "expected parameter 'relationalDatabaseBlueprintId' to be non-null");
            $.relationalDatabaseBundleId = Objects.requireNonNull($.relationalDatabaseBundleId, "expected parameter 'relationalDatabaseBundleId' to be non-null");
            $.relationalDatabaseName = Objects.requireNonNull($.relationalDatabaseName, "expected parameter 'relationalDatabaseName' to be non-null");
            return $;
        }
    }

}
