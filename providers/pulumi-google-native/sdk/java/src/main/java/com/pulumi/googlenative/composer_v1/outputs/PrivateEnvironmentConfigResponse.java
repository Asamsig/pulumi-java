// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.composer_v1.outputs.PrivateClusterConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PrivateEnvironmentConfigResponse {
    /**
     * @return Optional. When specified, the environment will use Private Service Connect instead of VPC peerings to connect to Cloud SQL in the Tenant Project, and the PSC endpoint in the Customer Project will use an IP address from this subnetwork.
     * 
     */
    private final String cloudComposerConnectionSubnetwork;
    /**
     * @return Optional. The CIDR block from which IP range for Cloud Composer Network in tenant project will be reserved. Needs to be disjoint from private_cluster_config.master_ipv4_cidr_block and cloud_sql_ipv4_cidr_block. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    private final String cloudComposerNetworkIpv4CidrBlock;
    /**
     * @return The IP range reserved for the tenant project&#39;s Cloud Composer network. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    private final String cloudComposerNetworkIpv4ReservedRange;
    /**
     * @return Optional. The CIDR block from which IP range in tenant project will be reserved for Cloud SQL. Needs to be disjoint from `web_server_ipv4_cidr_block`.
     * 
     */
    private final String cloudSqlIpv4CidrBlock;
    /**
     * @return Optional. If `true`, a Private IP Cloud Composer environment is created. If this field is set to true, `IPAllocationPolicy.use_ip_aliases` must be set to true for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    private final Boolean enablePrivateEnvironment;
    /**
     * @return Optional. Configuration for the private GKE cluster for a Private IP Cloud Composer environment.
     * 
     */
    private final PrivateClusterConfigResponse privateClusterConfig;
    /**
     * @return Optional. The CIDR block from which IP range for web server will be reserved. Needs to be disjoint from `private_cluster_config.master_ipv4_cidr_block` and `cloud_sql_ipv4_cidr_block`. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    private final String webServerIpv4CidrBlock;
    /**
     * @return The IP range reserved for the tenant project&#39;s App Engine VMs. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    private final String webServerIpv4ReservedRange;

    @CustomType.Constructor
    private PrivateEnvironmentConfigResponse(
        @CustomType.Parameter("cloudComposerConnectionSubnetwork") String cloudComposerConnectionSubnetwork,
        @CustomType.Parameter("cloudComposerNetworkIpv4CidrBlock") String cloudComposerNetworkIpv4CidrBlock,
        @CustomType.Parameter("cloudComposerNetworkIpv4ReservedRange") String cloudComposerNetworkIpv4ReservedRange,
        @CustomType.Parameter("cloudSqlIpv4CidrBlock") String cloudSqlIpv4CidrBlock,
        @CustomType.Parameter("enablePrivateEnvironment") Boolean enablePrivateEnvironment,
        @CustomType.Parameter("privateClusterConfig") PrivateClusterConfigResponse privateClusterConfig,
        @CustomType.Parameter("webServerIpv4CidrBlock") String webServerIpv4CidrBlock,
        @CustomType.Parameter("webServerIpv4ReservedRange") String webServerIpv4ReservedRange) {
        this.cloudComposerConnectionSubnetwork = cloudComposerConnectionSubnetwork;
        this.cloudComposerNetworkIpv4CidrBlock = cloudComposerNetworkIpv4CidrBlock;
        this.cloudComposerNetworkIpv4ReservedRange = cloudComposerNetworkIpv4ReservedRange;
        this.cloudSqlIpv4CidrBlock = cloudSqlIpv4CidrBlock;
        this.enablePrivateEnvironment = enablePrivateEnvironment;
        this.privateClusterConfig = privateClusterConfig;
        this.webServerIpv4CidrBlock = webServerIpv4CidrBlock;
        this.webServerIpv4ReservedRange = webServerIpv4ReservedRange;
    }

    /**
     * @return Optional. When specified, the environment will use Private Service Connect instead of VPC peerings to connect to Cloud SQL in the Tenant Project, and the PSC endpoint in the Customer Project will use an IP address from this subnetwork.
     * 
     */
    public String cloudComposerConnectionSubnetwork() {
        return this.cloudComposerConnectionSubnetwork;
    }
    /**
     * @return Optional. The CIDR block from which IP range for Cloud Composer Network in tenant project will be reserved. Needs to be disjoint from private_cluster_config.master_ipv4_cidr_block and cloud_sql_ipv4_cidr_block. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    public String cloudComposerNetworkIpv4CidrBlock() {
        return this.cloudComposerNetworkIpv4CidrBlock;
    }
    /**
     * @return The IP range reserved for the tenant project&#39;s Cloud Composer network. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    public String cloudComposerNetworkIpv4ReservedRange() {
        return this.cloudComposerNetworkIpv4ReservedRange;
    }
    /**
     * @return Optional. The CIDR block from which IP range in tenant project will be reserved for Cloud SQL. Needs to be disjoint from `web_server_ipv4_cidr_block`.
     * 
     */
    public String cloudSqlIpv4CidrBlock() {
        return this.cloudSqlIpv4CidrBlock;
    }
    /**
     * @return Optional. If `true`, a Private IP Cloud Composer environment is created. If this field is set to true, `IPAllocationPolicy.use_ip_aliases` must be set to true for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public Boolean enablePrivateEnvironment() {
        return this.enablePrivateEnvironment;
    }
    /**
     * @return Optional. Configuration for the private GKE cluster for a Private IP Cloud Composer environment.
     * 
     */
    public PrivateClusterConfigResponse privateClusterConfig() {
        return this.privateClusterConfig;
    }
    /**
     * @return Optional. The CIDR block from which IP range for web server will be reserved. Needs to be disjoint from `private_cluster_config.master_ipv4_cidr_block` and `cloud_sql_ipv4_cidr_block`. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public String webServerIpv4CidrBlock() {
        return this.webServerIpv4CidrBlock;
    }
    /**
     * @return The IP range reserved for the tenant project&#39;s App Engine VMs. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public String webServerIpv4ReservedRange() {
        return this.webServerIpv4ReservedRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEnvironmentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudComposerConnectionSubnetwork;
        private String cloudComposerNetworkIpv4CidrBlock;
        private String cloudComposerNetworkIpv4ReservedRange;
        private String cloudSqlIpv4CidrBlock;
        private Boolean enablePrivateEnvironment;
        private PrivateClusterConfigResponse privateClusterConfig;
        private String webServerIpv4CidrBlock;
        private String webServerIpv4ReservedRange;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEnvironmentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudComposerConnectionSubnetwork = defaults.cloudComposerConnectionSubnetwork;
    	      this.cloudComposerNetworkIpv4CidrBlock = defaults.cloudComposerNetworkIpv4CidrBlock;
    	      this.cloudComposerNetworkIpv4ReservedRange = defaults.cloudComposerNetworkIpv4ReservedRange;
    	      this.cloudSqlIpv4CidrBlock = defaults.cloudSqlIpv4CidrBlock;
    	      this.enablePrivateEnvironment = defaults.enablePrivateEnvironment;
    	      this.privateClusterConfig = defaults.privateClusterConfig;
    	      this.webServerIpv4CidrBlock = defaults.webServerIpv4CidrBlock;
    	      this.webServerIpv4ReservedRange = defaults.webServerIpv4ReservedRange;
        }

        public Builder cloudComposerConnectionSubnetwork(String cloudComposerConnectionSubnetwork) {
            this.cloudComposerConnectionSubnetwork = Objects.requireNonNull(cloudComposerConnectionSubnetwork);
            return this;
        }
        public Builder cloudComposerNetworkIpv4CidrBlock(String cloudComposerNetworkIpv4CidrBlock) {
            this.cloudComposerNetworkIpv4CidrBlock = Objects.requireNonNull(cloudComposerNetworkIpv4CidrBlock);
            return this;
        }
        public Builder cloudComposerNetworkIpv4ReservedRange(String cloudComposerNetworkIpv4ReservedRange) {
            this.cloudComposerNetworkIpv4ReservedRange = Objects.requireNonNull(cloudComposerNetworkIpv4ReservedRange);
            return this;
        }
        public Builder cloudSqlIpv4CidrBlock(String cloudSqlIpv4CidrBlock) {
            this.cloudSqlIpv4CidrBlock = Objects.requireNonNull(cloudSqlIpv4CidrBlock);
            return this;
        }
        public Builder enablePrivateEnvironment(Boolean enablePrivateEnvironment) {
            this.enablePrivateEnvironment = Objects.requireNonNull(enablePrivateEnvironment);
            return this;
        }
        public Builder privateClusterConfig(PrivateClusterConfigResponse privateClusterConfig) {
            this.privateClusterConfig = Objects.requireNonNull(privateClusterConfig);
            return this;
        }
        public Builder webServerIpv4CidrBlock(String webServerIpv4CidrBlock) {
            this.webServerIpv4CidrBlock = Objects.requireNonNull(webServerIpv4CidrBlock);
            return this;
        }
        public Builder webServerIpv4ReservedRange(String webServerIpv4ReservedRange) {
            this.webServerIpv4ReservedRange = Objects.requireNonNull(webServerIpv4ReservedRange);
            return this;
        }        public PrivateEnvironmentConfigResponse build() {
            return new PrivateEnvironmentConfigResponse(cloudComposerConnectionSubnetwork, cloudComposerNetworkIpv4CidrBlock, cloudComposerNetworkIpv4ReservedRange, cloudSqlIpv4CidrBlock, enablePrivateEnvironment, privateClusterConfig, webServerIpv4CidrBlock, webServerIpv4ReservedRange);
        }
    }
}
