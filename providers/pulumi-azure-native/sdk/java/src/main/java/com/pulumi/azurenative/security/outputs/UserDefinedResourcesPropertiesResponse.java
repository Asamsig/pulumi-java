// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class UserDefinedResourcesPropertiesResponse {
    /**
     * @return Azure Resource Graph query which represents the security solution&#39;s user defined resources. Required to start with &#34;where type != &#34;Microsoft.Devices/IotHubs&#34;&#34;
     * 
     */
    private final String query;
    /**
     * @return List of Azure subscription ids on which the user defined resources query should be executed.
     * 
     */
    private final List<String> querySubscriptions;

    @CustomType.Constructor
    private UserDefinedResourcesPropertiesResponse(
        @CustomType.Parameter("query") String query,
        @CustomType.Parameter("querySubscriptions") List<String> querySubscriptions) {
        this.query = query;
        this.querySubscriptions = querySubscriptions;
    }

    /**
     * @return Azure Resource Graph query which represents the security solution&#39;s user defined resources. Required to start with &#34;where type != &#34;Microsoft.Devices/IotHubs&#34;&#34;
     * 
     */
    public String query() {
        return this.query;
    }
    /**
     * @return List of Azure subscription ids on which the user defined resources query should be executed.
     * 
     */
    public List<String> querySubscriptions() {
        return this.querySubscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserDefinedResourcesPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String query;
        private List<String> querySubscriptions;

        public Builder() {
    	      // Empty
        }

        public Builder(UserDefinedResourcesPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.querySubscriptions = defaults.querySubscriptions;
        }

        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder querySubscriptions(List<String> querySubscriptions) {
            this.querySubscriptions = Objects.requireNonNull(querySubscriptions);
            return this;
        }
        public Builder querySubscriptions(String... querySubscriptions) {
            return querySubscriptions(List.of(querySubscriptions));
        }        public UserDefinedResourcesPropertiesResponse build() {
            return new UserDefinedResourcesPropertiesResponse(query, querySubscriptions);
        }
    }
}
