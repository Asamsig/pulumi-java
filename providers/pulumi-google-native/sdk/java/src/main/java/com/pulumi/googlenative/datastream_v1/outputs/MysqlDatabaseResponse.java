// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datastream_v1.outputs.MysqlTableResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MysqlDatabaseResponse {
    /**
     * @return Database name.
     * 
     */
    private final String database;
    /**
     * @return Tables in the database.
     * 
     */
    private final List<MysqlTableResponse> mysqlTables;

    @CustomType.Constructor
    private MysqlDatabaseResponse(
        @CustomType.Parameter("database") String database,
        @CustomType.Parameter("mysqlTables") List<MysqlTableResponse> mysqlTables) {
        this.database = database;
        this.mysqlTables = mysqlTables;
    }

    /**
     * @return Database name.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return Tables in the database.
     * 
     */
    public List<MysqlTableResponse> mysqlTables() {
        return this.mysqlTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlDatabaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private List<MysqlTableResponse> mysqlTables;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlDatabaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.mysqlTables = defaults.mysqlTables;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder mysqlTables(List<MysqlTableResponse> mysqlTables) {
            this.mysqlTables = Objects.requireNonNull(mysqlTables);
            return this;
        }
        public Builder mysqlTables(MysqlTableResponse... mysqlTables) {
            return mysqlTables(List.of(mysqlTables));
        }        public MysqlDatabaseResponse build() {
            return new MysqlDatabaseResponse(database, mysqlTables);
        }
    }
}
