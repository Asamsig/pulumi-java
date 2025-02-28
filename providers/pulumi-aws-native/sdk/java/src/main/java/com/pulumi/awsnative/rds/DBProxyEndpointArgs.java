// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.rds;

import com.pulumi.awsnative.rds.enums.DBProxyEndpointTargetRole;
import com.pulumi.awsnative.rds.inputs.DBProxyEndpointTagFormatArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DBProxyEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final DBProxyEndpointArgs Empty = new DBProxyEndpointArgs();

    /**
     * The identifier for the DB proxy endpoint. This name must be unique for all DB proxy endpoints owned by your AWS account in the specified AWS Region.
     * 
     */
    @Import(name="dBProxyEndpointName")
    private @Nullable Output<String> dBProxyEndpointName;

    /**
     * @return The identifier for the DB proxy endpoint. This name must be unique for all DB proxy endpoints owned by your AWS account in the specified AWS Region.
     * 
     */
    public Optional<Output<String>> dBProxyEndpointName() {
        return Optional.ofNullable(this.dBProxyEndpointName);
    }

    /**
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region.
     * 
     */
    @Import(name="dBProxyName", required=true)
    private Output<String> dBProxyName;

    /**
     * @return The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region.
     * 
     */
    public Output<String> dBProxyName() {
        return this.dBProxyName;
    }

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the DB proxy endpoint.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<DBProxyEndpointTagFormatArgs>> tags;

    /**
     * @return An optional set of key-value pairs to associate arbitrary data of your choosing with the DB proxy endpoint.
     * 
     */
    public Optional<Output<List<DBProxyEndpointTagFormatArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     * 
     */
    @Import(name="targetRole")
    private @Nullable Output<DBProxyEndpointTargetRole> targetRole;

    /**
     * @return A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     * 
     */
    public Optional<Output<DBProxyEndpointTargetRole>> targetRole() {
        return Optional.ofNullable(this.targetRole);
    }

    /**
     * VPC security group IDs to associate with the new DB proxy endpoint.
     * 
     */
    @Import(name="vpcSecurityGroupIds")
    private @Nullable Output<List<String>> vpcSecurityGroupIds;

    /**
     * @return VPC security group IDs to associate with the new DB proxy endpoint.
     * 
     */
    public Optional<Output<List<String>>> vpcSecurityGroupIds() {
        return Optional.ofNullable(this.vpcSecurityGroupIds);
    }

    /**
     * VPC subnet IDs to associate with the new DB proxy endpoint.
     * 
     */
    @Import(name="vpcSubnetIds", required=true)
    private Output<List<String>> vpcSubnetIds;

    /**
     * @return VPC subnet IDs to associate with the new DB proxy endpoint.
     * 
     */
    public Output<List<String>> vpcSubnetIds() {
        return this.vpcSubnetIds;
    }

    private DBProxyEndpointArgs() {}

    private DBProxyEndpointArgs(DBProxyEndpointArgs $) {
        this.dBProxyEndpointName = $.dBProxyEndpointName;
        this.dBProxyName = $.dBProxyName;
        this.tags = $.tags;
        this.targetRole = $.targetRole;
        this.vpcSecurityGroupIds = $.vpcSecurityGroupIds;
        this.vpcSubnetIds = $.vpcSubnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DBProxyEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DBProxyEndpointArgs $;

        public Builder() {
            $ = new DBProxyEndpointArgs();
        }

        public Builder(DBProxyEndpointArgs defaults) {
            $ = new DBProxyEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dBProxyEndpointName The identifier for the DB proxy endpoint. This name must be unique for all DB proxy endpoints owned by your AWS account in the specified AWS Region.
         * 
         * @return builder
         * 
         */
        public Builder dBProxyEndpointName(@Nullable Output<String> dBProxyEndpointName) {
            $.dBProxyEndpointName = dBProxyEndpointName;
            return this;
        }

        /**
         * @param dBProxyEndpointName The identifier for the DB proxy endpoint. This name must be unique for all DB proxy endpoints owned by your AWS account in the specified AWS Region.
         * 
         * @return builder
         * 
         */
        public Builder dBProxyEndpointName(String dBProxyEndpointName) {
            return dBProxyEndpointName(Output.of(dBProxyEndpointName));
        }

        /**
         * @param dBProxyName The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region.
         * 
         * @return builder
         * 
         */
        public Builder dBProxyName(Output<String> dBProxyName) {
            $.dBProxyName = dBProxyName;
            return this;
        }

        /**
         * @param dBProxyName The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region.
         * 
         * @return builder
         * 
         */
        public Builder dBProxyName(String dBProxyName) {
            return dBProxyName(Output.of(dBProxyName));
        }

        /**
         * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing with the DB proxy endpoint.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<DBProxyEndpointTagFormatArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing with the DB proxy endpoint.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<DBProxyEndpointTagFormatArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing with the DB proxy endpoint.
         * 
         * @return builder
         * 
         */
        public Builder tags(DBProxyEndpointTagFormatArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param targetRole A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
         * 
         * @return builder
         * 
         */
        public Builder targetRole(@Nullable Output<DBProxyEndpointTargetRole> targetRole) {
            $.targetRole = targetRole;
            return this;
        }

        /**
         * @param targetRole A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
         * 
         * @return builder
         * 
         */
        public Builder targetRole(DBProxyEndpointTargetRole targetRole) {
            return targetRole(Output.of(targetRole));
        }

        /**
         * @param vpcSecurityGroupIds VPC security group IDs to associate with the new DB proxy endpoint.
         * 
         * @return builder
         * 
         */
        public Builder vpcSecurityGroupIds(@Nullable Output<List<String>> vpcSecurityGroupIds) {
            $.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        /**
         * @param vpcSecurityGroupIds VPC security group IDs to associate with the new DB proxy endpoint.
         * 
         * @return builder
         * 
         */
        public Builder vpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(Output.of(vpcSecurityGroupIds));
        }

        /**
         * @param vpcSecurityGroupIds VPC security group IDs to associate with the new DB proxy endpoint.
         * 
         * @return builder
         * 
         */
        public Builder vpcSecurityGroupIds(String... vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(List.of(vpcSecurityGroupIds));
        }

        /**
         * @param vpcSubnetIds VPC subnet IDs to associate with the new DB proxy endpoint.
         * 
         * @return builder
         * 
         */
        public Builder vpcSubnetIds(Output<List<String>> vpcSubnetIds) {
            $.vpcSubnetIds = vpcSubnetIds;
            return this;
        }

        /**
         * @param vpcSubnetIds VPC subnet IDs to associate with the new DB proxy endpoint.
         * 
         * @return builder
         * 
         */
        public Builder vpcSubnetIds(List<String> vpcSubnetIds) {
            return vpcSubnetIds(Output.of(vpcSubnetIds));
        }

        /**
         * @param vpcSubnetIds VPC subnet IDs to associate with the new DB proxy endpoint.
         * 
         * @return builder
         * 
         */
        public Builder vpcSubnetIds(String... vpcSubnetIds) {
            return vpcSubnetIds(List.of(vpcSubnetIds));
        }

        public DBProxyEndpointArgs build() {
            $.dBProxyName = Objects.requireNonNull($.dBProxyName, "expected parameter 'dBProxyName' to be non-null");
            $.vpcSubnetIds = Objects.requireNonNull($.vpcSubnetIds, "expected parameter 'vpcSubnetIds' to be non-null");
            return $;
        }
    }

}
