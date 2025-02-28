// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sql;

import com.pulumi.azure.sql.inputs.ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedInstanceFailoverGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceFailoverGroupArgs Empty = new ManagedInstanceFailoverGroupArgs();

    /**
     * The Azure Region where the SQL Instance Failover Group exists.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the SQL Instance Failover Group exists.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the SQL Managed Instance which will be replicated using a SQL Instance Failover Group. Changing this forces a new SQL Instance Failover Group to be created.
     * 
     */
    @Import(name="managedInstanceName", required=true)
    private Output<String> managedInstanceName;

    /**
     * @return The name of the SQL Managed Instance which will be replicated using a SQL Instance Failover Group. Changing this forces a new SQL Instance Failover Group to be created.
     * 
     */
    public Output<String> managedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The name which should be used for this SQL Instance Failover Group. Changing this forces a new SQL Instance Failover Group to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this SQL Instance Failover Group. Changing this forces a new SQL Instance Failover Group to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * ID of the SQL Managed Instance which will be replicated to.
     * 
     */
    @Import(name="partnerManagedInstanceId", required=true)
    private Output<String> partnerManagedInstanceId;

    /**
     * @return ID of the SQL Managed Instance which will be replicated to.
     * 
     */
    public Output<String> partnerManagedInstanceId() {
        return this.partnerManagedInstanceId;
    }

    /**
     * A `read_write_endpoint_failover_policy` block as defined below.
     * 
     */
    @Import(name="readWriteEndpointFailoverPolicy", required=true)
    private Output<ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs> readWriteEndpointFailoverPolicy;

    /**
     * @return A `read_write_endpoint_failover_policy` block as defined below.
     * 
     */
    public Output<ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs> readWriteEndpointFailoverPolicy() {
        return this.readWriteEndpointFailoverPolicy;
    }

    /**
     * Failover policy for the read-only endpoint. Defaults to `false`.
     * 
     */
    @Import(name="readonlyEndpointFailoverPolicyEnabled")
    private @Nullable Output<Boolean> readonlyEndpointFailoverPolicyEnabled;

    /**
     * @return Failover policy for the read-only endpoint. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> readonlyEndpointFailoverPolicyEnabled() {
        return Optional.ofNullable(this.readonlyEndpointFailoverPolicyEnabled);
    }

    /**
     * The name of the Resource Group where the SQL Instance Failover Group should exist. Changing this forces a new SQL Instance Failover Group to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the SQL Instance Failover Group should exist. Changing this forces a new SQL Instance Failover Group to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ManagedInstanceFailoverGroupArgs() {}

    private ManagedInstanceFailoverGroupArgs(ManagedInstanceFailoverGroupArgs $) {
        this.location = $.location;
        this.managedInstanceName = $.managedInstanceName;
        this.name = $.name;
        this.partnerManagedInstanceId = $.partnerManagedInstanceId;
        this.readWriteEndpointFailoverPolicy = $.readWriteEndpointFailoverPolicy;
        this.readonlyEndpointFailoverPolicyEnabled = $.readonlyEndpointFailoverPolicyEnabled;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedInstanceFailoverGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedInstanceFailoverGroupArgs $;

        public Builder() {
            $ = new ManagedInstanceFailoverGroupArgs();
        }

        public Builder(ManagedInstanceFailoverGroupArgs defaults) {
            $ = new ManagedInstanceFailoverGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Azure Region where the SQL Instance Failover Group exists.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the SQL Instance Failover Group exists.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedInstanceName The name of the SQL Managed Instance which will be replicated using a SQL Instance Failover Group. Changing this forces a new SQL Instance Failover Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceName(Output<String> managedInstanceName) {
            $.managedInstanceName = managedInstanceName;
            return this;
        }

        /**
         * @param managedInstanceName The name of the SQL Managed Instance which will be replicated using a SQL Instance Failover Group. Changing this forces a new SQL Instance Failover Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceName(String managedInstanceName) {
            return managedInstanceName(Output.of(managedInstanceName));
        }

        /**
         * @param name The name which should be used for this SQL Instance Failover Group. Changing this forces a new SQL Instance Failover Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this SQL Instance Failover Group. Changing this forces a new SQL Instance Failover Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param partnerManagedInstanceId ID of the SQL Managed Instance which will be replicated to.
         * 
         * @return builder
         * 
         */
        public Builder partnerManagedInstanceId(Output<String> partnerManagedInstanceId) {
            $.partnerManagedInstanceId = partnerManagedInstanceId;
            return this;
        }

        /**
         * @param partnerManagedInstanceId ID of the SQL Managed Instance which will be replicated to.
         * 
         * @return builder
         * 
         */
        public Builder partnerManagedInstanceId(String partnerManagedInstanceId) {
            return partnerManagedInstanceId(Output.of(partnerManagedInstanceId));
        }

        /**
         * @param readWriteEndpointFailoverPolicy A `read_write_endpoint_failover_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder readWriteEndpointFailoverPolicy(Output<ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs> readWriteEndpointFailoverPolicy) {
            $.readWriteEndpointFailoverPolicy = readWriteEndpointFailoverPolicy;
            return this;
        }

        /**
         * @param readWriteEndpointFailoverPolicy A `read_write_endpoint_failover_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder readWriteEndpointFailoverPolicy(ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs readWriteEndpointFailoverPolicy) {
            return readWriteEndpointFailoverPolicy(Output.of(readWriteEndpointFailoverPolicy));
        }

        /**
         * @param readonlyEndpointFailoverPolicyEnabled Failover policy for the read-only endpoint. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder readonlyEndpointFailoverPolicyEnabled(@Nullable Output<Boolean> readonlyEndpointFailoverPolicyEnabled) {
            $.readonlyEndpointFailoverPolicyEnabled = readonlyEndpointFailoverPolicyEnabled;
            return this;
        }

        /**
         * @param readonlyEndpointFailoverPolicyEnabled Failover policy for the read-only endpoint. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder readonlyEndpointFailoverPolicyEnabled(Boolean readonlyEndpointFailoverPolicyEnabled) {
            return readonlyEndpointFailoverPolicyEnabled(Output.of(readonlyEndpointFailoverPolicyEnabled));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the SQL Instance Failover Group should exist. Changing this forces a new SQL Instance Failover Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the SQL Instance Failover Group should exist. Changing this forces a new SQL Instance Failover Group to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ManagedInstanceFailoverGroupArgs build() {
            $.managedInstanceName = Objects.requireNonNull($.managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
            $.partnerManagedInstanceId = Objects.requireNonNull($.partnerManagedInstanceId, "expected parameter 'partnerManagedInstanceId' to be non-null");
            $.readWriteEndpointFailoverPolicy = Objects.requireNonNull($.readWriteEndpointFailoverPolicy, "expected parameter 'readWriteEndpointFailoverPolicy' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
