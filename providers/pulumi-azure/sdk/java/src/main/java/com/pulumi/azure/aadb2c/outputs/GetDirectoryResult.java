// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.aadb2c.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDirectoryResult {
    /**
     * @return The type of billing for the AAD B2C tenant. Possible values include: `MAU` or `Auths`.
     * 
     */
    private final String billingType;
    /**
     * @return Location in which the B2C tenant is hosted and data resides. See [official docs](https://aka.ms/B2CDataResidenc) for more information.
     * 
     */
    private final String dataResidencyLocation;
    private final String domainName;
    /**
     * @return The date from which the billing type took effect. May not be populated until after the first billing cycle.
     * 
     */
    private final String effectiveStartDate;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String resourceGroupName;
    /**
     * @return Billing SKU for the B2C tenant. See [official docs](https://aka.ms/b2cBilling) for more information.
     * 
     */
    private final String skuName;
    /**
     * @return A mapping of tags assigned to the AAD B2C Directory.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The Tenant ID for the AAD B2C tenant.
     * 
     */
    private final String tenantId;

    @CustomType.Constructor
    private GetDirectoryResult(
        @CustomType.Parameter("billingType") String billingType,
        @CustomType.Parameter("dataResidencyLocation") String dataResidencyLocation,
        @CustomType.Parameter("domainName") String domainName,
        @CustomType.Parameter("effectiveStartDate") String effectiveStartDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("skuName") String skuName,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("tenantId") String tenantId) {
        this.billingType = billingType;
        this.dataResidencyLocation = dataResidencyLocation;
        this.domainName = domainName;
        this.effectiveStartDate = effectiveStartDate;
        this.id = id;
        this.resourceGroupName = resourceGroupName;
        this.skuName = skuName;
        this.tags = tags;
        this.tenantId = tenantId;
    }

    /**
     * @return The type of billing for the AAD B2C tenant. Possible values include: `MAU` or `Auths`.
     * 
     */
    public String billingType() {
        return this.billingType;
    }
    /**
     * @return Location in which the B2C tenant is hosted and data resides. See [official docs](https://aka.ms/B2CDataResidenc) for more information.
     * 
     */
    public String dataResidencyLocation() {
        return this.dataResidencyLocation;
    }
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return The date from which the billing type took effect. May not be populated until after the first billing cycle.
     * 
     */
    public String effectiveStartDate() {
        return this.effectiveStartDate;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return Billing SKU for the B2C tenant. See [official docs](https://aka.ms/b2cBilling) for more information.
     * 
     */
    public String skuName() {
        return this.skuName;
    }
    /**
     * @return A mapping of tags assigned to the AAD B2C Directory.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The Tenant ID for the AAD B2C tenant.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingType;
        private String dataResidencyLocation;
        private String domainName;
        private String effectiveStartDate;
        private String id;
        private String resourceGroupName;
        private String skuName;
        private Map<String,String> tags;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDirectoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingType = defaults.billingType;
    	      this.dataResidencyLocation = defaults.dataResidencyLocation;
    	      this.domainName = defaults.domainName;
    	      this.effectiveStartDate = defaults.effectiveStartDate;
    	      this.id = defaults.id;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skuName = defaults.skuName;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder billingType(String billingType) {
            this.billingType = Objects.requireNonNull(billingType);
            return this;
        }
        public Builder dataResidencyLocation(String dataResidencyLocation) {
            this.dataResidencyLocation = Objects.requireNonNull(dataResidencyLocation);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder effectiveStartDate(String effectiveStartDate) {
            this.effectiveStartDate = Objects.requireNonNull(effectiveStartDate);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder skuName(String skuName) {
            this.skuName = Objects.requireNonNull(skuName);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }        public GetDirectoryResult build() {
            return new GetDirectoryResult(billingType, dataResidencyLocation, domainName, effectiveStartDate, id, resourceGroupName, skuName, tags, tenantId);
        }
    }
}
