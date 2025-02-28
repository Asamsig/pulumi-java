// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReferenceInputMssqlArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReferenceInputMssqlArgs Empty = new ReferenceInputMssqlArgs();

    /**
     * The MS SQL database name where the reference data exists.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The MS SQL database name where the reference data exists.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * The query used to retrieve incremental changes in the reference data from the MS SQL database. Cannot be set when `refresh_type` is `Static`.
     * 
     */
    @Import(name="deltaSnapshotQuery")
    private @Nullable Output<String> deltaSnapshotQuery;

    /**
     * @return The query used to retrieve incremental changes in the reference data from the MS SQL database. Cannot be set when `refresh_type` is `Static`.
     * 
     */
    public Optional<Output<String>> deltaSnapshotQuery() {
        return Optional.ofNullable(this.deltaSnapshotQuery);
    }

    /**
     * The query used to retrieve the reference data from the MS SQL database.
     * 
     */
    @Import(name="fullSnapshotQuery", required=true)
    private Output<String> fullSnapshotQuery;

    /**
     * @return The query used to retrieve the reference data from the MS SQL database.
     * 
     */
    public Output<String> fullSnapshotQuery() {
        return this.fullSnapshotQuery;
    }

    /**
     * The name of the Reference Input MS SQL data. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Reference Input MS SQL data. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The username to connect to the MS SQL database.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The username to connect to the MS SQL database.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The frequency in `hh:mm:ss` with which the reference data should be retrieved from the MS SQL database e.g. `00:20:00` for every 20 minutes. Must be set when `refresh_type` is `RefreshPeriodicallyWithFull` or `RefreshPeriodicallyWithDelta`.
     * 
     */
    @Import(name="refreshIntervalDuration")
    private @Nullable Output<String> refreshIntervalDuration;

    /**
     * @return The frequency in `hh:mm:ss` with which the reference data should be retrieved from the MS SQL database e.g. `00:20:00` for every 20 minutes. Must be set when `refresh_type` is `RefreshPeriodicallyWithFull` or `RefreshPeriodicallyWithDelta`.
     * 
     */
    public Optional<Output<String>> refreshIntervalDuration() {
        return Optional.ofNullable(this.refreshIntervalDuration);
    }

    /**
     * Defines whether and how the reference data should be refreshed. Accepted values are `Static`, `RefreshPeriodicallyWithFull` and `RefreshPeriodicallyWithDelta`.
     * 
     */
    @Import(name="refreshType", required=true)
    private Output<String> refreshType;

    /**
     * @return Defines whether and how the reference data should be refreshed. Accepted values are `Static`, `RefreshPeriodicallyWithFull` and `RefreshPeriodicallyWithDelta`.
     * 
     */
    public Output<String> refreshType() {
        return this.refreshType;
    }

    /**
     * The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The fully qualified domain name of the MS SQL server.
     * 
     */
    @Import(name="server", required=true)
    private Output<String> server;

    /**
     * @return The fully qualified domain name of the MS SQL server.
     * 
     */
    public Output<String> server() {
        return this.server;
    }

    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="streamAnalyticsJobName", required=true)
    private Output<String> streamAnalyticsJobName;

    /**
     * @return The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> streamAnalyticsJobName() {
        return this.streamAnalyticsJobName;
    }

    /**
     * The username to connect to the MS SQL database.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The username to connect to the MS SQL database.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private ReferenceInputMssqlArgs() {}

    private ReferenceInputMssqlArgs(ReferenceInputMssqlArgs $) {
        this.database = $.database;
        this.deltaSnapshotQuery = $.deltaSnapshotQuery;
        this.fullSnapshotQuery = $.fullSnapshotQuery;
        this.name = $.name;
        this.password = $.password;
        this.refreshIntervalDuration = $.refreshIntervalDuration;
        this.refreshType = $.refreshType;
        this.resourceGroupName = $.resourceGroupName;
        this.server = $.server;
        this.streamAnalyticsJobName = $.streamAnalyticsJobName;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReferenceInputMssqlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReferenceInputMssqlArgs $;

        public Builder() {
            $ = new ReferenceInputMssqlArgs();
        }

        public Builder(ReferenceInputMssqlArgs defaults) {
            $ = new ReferenceInputMssqlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database The MS SQL database name where the reference data exists.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The MS SQL database name where the reference data exists.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param deltaSnapshotQuery The query used to retrieve incremental changes in the reference data from the MS SQL database. Cannot be set when `refresh_type` is `Static`.
         * 
         * @return builder
         * 
         */
        public Builder deltaSnapshotQuery(@Nullable Output<String> deltaSnapshotQuery) {
            $.deltaSnapshotQuery = deltaSnapshotQuery;
            return this;
        }

        /**
         * @param deltaSnapshotQuery The query used to retrieve incremental changes in the reference data from the MS SQL database. Cannot be set when `refresh_type` is `Static`.
         * 
         * @return builder
         * 
         */
        public Builder deltaSnapshotQuery(String deltaSnapshotQuery) {
            return deltaSnapshotQuery(Output.of(deltaSnapshotQuery));
        }

        /**
         * @param fullSnapshotQuery The query used to retrieve the reference data from the MS SQL database.
         * 
         * @return builder
         * 
         */
        public Builder fullSnapshotQuery(Output<String> fullSnapshotQuery) {
            $.fullSnapshotQuery = fullSnapshotQuery;
            return this;
        }

        /**
         * @param fullSnapshotQuery The query used to retrieve the reference data from the MS SQL database.
         * 
         * @return builder
         * 
         */
        public Builder fullSnapshotQuery(String fullSnapshotQuery) {
            return fullSnapshotQuery(Output.of(fullSnapshotQuery));
        }

        /**
         * @param name The name of the Reference Input MS SQL data. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Reference Input MS SQL data. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password The username to connect to the MS SQL database.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The username to connect to the MS SQL database.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param refreshIntervalDuration The frequency in `hh:mm:ss` with which the reference data should be retrieved from the MS SQL database e.g. `00:20:00` for every 20 minutes. Must be set when `refresh_type` is `RefreshPeriodicallyWithFull` or `RefreshPeriodicallyWithDelta`.
         * 
         * @return builder
         * 
         */
        public Builder refreshIntervalDuration(@Nullable Output<String> refreshIntervalDuration) {
            $.refreshIntervalDuration = refreshIntervalDuration;
            return this;
        }

        /**
         * @param refreshIntervalDuration The frequency in `hh:mm:ss` with which the reference data should be retrieved from the MS SQL database e.g. `00:20:00` for every 20 minutes. Must be set when `refresh_type` is `RefreshPeriodicallyWithFull` or `RefreshPeriodicallyWithDelta`.
         * 
         * @return builder
         * 
         */
        public Builder refreshIntervalDuration(String refreshIntervalDuration) {
            return refreshIntervalDuration(Output.of(refreshIntervalDuration));
        }

        /**
         * @param refreshType Defines whether and how the reference data should be refreshed. Accepted values are `Static`, `RefreshPeriodicallyWithFull` and `RefreshPeriodicallyWithDelta`.
         * 
         * @return builder
         * 
         */
        public Builder refreshType(Output<String> refreshType) {
            $.refreshType = refreshType;
            return this;
        }

        /**
         * @param refreshType Defines whether and how the reference data should be refreshed. Accepted values are `Static`, `RefreshPeriodicallyWithFull` and `RefreshPeriodicallyWithDelta`.
         * 
         * @return builder
         * 
         */
        public Builder refreshType(String refreshType) {
            return refreshType(Output.of(refreshType));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param server The fully qualified domain name of the MS SQL server.
         * 
         * @return builder
         * 
         */
        public Builder server(Output<String> server) {
            $.server = server;
            return this;
        }

        /**
         * @param server The fully qualified domain name of the MS SQL server.
         * 
         * @return builder
         * 
         */
        public Builder server(String server) {
            return server(Output.of(server));
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(Output<String> streamAnalyticsJobName) {
            $.streamAnalyticsJobName = streamAnalyticsJobName;
            return this;
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(String streamAnalyticsJobName) {
            return streamAnalyticsJobName(Output.of(streamAnalyticsJobName));
        }

        /**
         * @param username The username to connect to the MS SQL database.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username to connect to the MS SQL database.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ReferenceInputMssqlArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.fullSnapshotQuery = Objects.requireNonNull($.fullSnapshotQuery, "expected parameter 'fullSnapshotQuery' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.refreshType = Objects.requireNonNull($.refreshType, "expected parameter 'refreshType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.server = Objects.requireNonNull($.server, "expected parameter 'server' to be non-null");
            $.streamAnalyticsJobName = Objects.requireNonNull($.streamAnalyticsJobName, "expected parameter 'streamAnalyticsJobName' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
