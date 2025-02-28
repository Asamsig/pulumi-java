// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.azurenative.sqlvirtualmachine.enums.SqlWorkloadType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set workload type to optimize storage for SQL Server.
 * 
 */
public final class SqlWorkloadTypeUpdateSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlWorkloadTypeUpdateSettingsArgs Empty = new SqlWorkloadTypeUpdateSettingsArgs();

    /**
     * SQL Server workload type.
     * 
     */
    @Import(name="sqlWorkloadType")
    private @Nullable Output<Either<String,SqlWorkloadType>> sqlWorkloadType;

    /**
     * @return SQL Server workload type.
     * 
     */
    public Optional<Output<Either<String,SqlWorkloadType>>> sqlWorkloadType() {
        return Optional.ofNullable(this.sqlWorkloadType);
    }

    private SqlWorkloadTypeUpdateSettingsArgs() {}

    private SqlWorkloadTypeUpdateSettingsArgs(SqlWorkloadTypeUpdateSettingsArgs $) {
        this.sqlWorkloadType = $.sqlWorkloadType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlWorkloadTypeUpdateSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlWorkloadTypeUpdateSettingsArgs $;

        public Builder() {
            $ = new SqlWorkloadTypeUpdateSettingsArgs();
        }

        public Builder(SqlWorkloadTypeUpdateSettingsArgs defaults) {
            $ = new SqlWorkloadTypeUpdateSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sqlWorkloadType SQL Server workload type.
         * 
         * @return builder
         * 
         */
        public Builder sqlWorkloadType(@Nullable Output<Either<String,SqlWorkloadType>> sqlWorkloadType) {
            $.sqlWorkloadType = sqlWorkloadType;
            return this;
        }

        /**
         * @param sqlWorkloadType SQL Server workload type.
         * 
         * @return builder
         * 
         */
        public Builder sqlWorkloadType(Either<String,SqlWorkloadType> sqlWorkloadType) {
            return sqlWorkloadType(Output.of(sqlWorkloadType));
        }

        /**
         * @param sqlWorkloadType SQL Server workload type.
         * 
         * @return builder
         * 
         */
        public Builder sqlWorkloadType(String sqlWorkloadType) {
            return sqlWorkloadType(Either.ofLeft(sqlWorkloadType));
        }

        /**
         * @param sqlWorkloadType SQL Server workload type.
         * 
         * @return builder
         * 
         */
        public Builder sqlWorkloadType(SqlWorkloadType sqlWorkloadType) {
            return sqlWorkloadType(Either.ofRight(sqlWorkloadType));
        }

        public SqlWorkloadTypeUpdateSettingsArgs build() {
            return $;
        }
    }

}
