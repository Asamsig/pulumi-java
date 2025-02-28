// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2betaRuleFilterActionResponse {
    /**
     * @return A filter to apply on the matching condition results. Supported features: * filter must be set. * Filter syntax is identical to SearchRequest.filter. See more details at the Retail Search [user guide](/retail/search/docs/filter-and-order#filter). * To filter products with product ID &#34;product_1&#34; or &#34;product_2&#34;, and color &#34;Red&#34; or &#34;Blue&#34;: *(id: ANY(&#34;product_1&#34;, &#34;product_2&#34;)) * *AND * *(colorFamilies: ANY(&#34;Red&#34;, &#34;Blue&#34;)) *
     * 
     */
    private final String filter;

    @CustomType.Constructor
    private GoogleCloudRetailV2betaRuleFilterActionResponse(@CustomType.Parameter("filter") String filter) {
        this.filter = filter;
    }

    /**
     * @return A filter to apply on the matching condition results. Supported features: * filter must be set. * Filter syntax is identical to SearchRequest.filter. See more details at the Retail Search [user guide](/retail/search/docs/filter-and-order#filter). * To filter products with product ID &#34;product_1&#34; or &#34;product_2&#34;, and color &#34;Red&#34; or &#34;Blue&#34;: *(id: ANY(&#34;product_1&#34;, &#34;product_2&#34;)) * *AND * *(colorFamilies: ANY(&#34;Red&#34;, &#34;Blue&#34;)) *
     * 
     */
    public String filter() {
        return this.filter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRuleFilterActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filter;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRuleFilterActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
        }

        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }        public GoogleCloudRetailV2betaRuleFilterActionResponse build() {
            return new GoogleCloudRetailV2betaRuleFilterActionResponse(filter);
        }
    }
}
