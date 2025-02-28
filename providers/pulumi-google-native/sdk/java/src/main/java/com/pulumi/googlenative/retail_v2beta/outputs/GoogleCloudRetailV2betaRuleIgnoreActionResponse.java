// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2betaRuleIgnoreActionResponse {
    /**
     * @return Terms to ignore in the search query.
     * 
     */
    private final List<String> ignoreTerms;

    @CustomType.Constructor
    private GoogleCloudRetailV2betaRuleIgnoreActionResponse(@CustomType.Parameter("ignoreTerms") List<String> ignoreTerms) {
        this.ignoreTerms = ignoreTerms;
    }

    /**
     * @return Terms to ignore in the search query.
     * 
     */
    public List<String> ignoreTerms() {
        return this.ignoreTerms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRuleIgnoreActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> ignoreTerms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRuleIgnoreActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreTerms = defaults.ignoreTerms;
        }

        public Builder ignoreTerms(List<String> ignoreTerms) {
            this.ignoreTerms = Objects.requireNonNull(ignoreTerms);
            return this;
        }
        public Builder ignoreTerms(String... ignoreTerms) {
            return ignoreTerms(List.of(ignoreTerms));
        }        public GoogleCloudRetailV2betaRuleIgnoreActionResponse build() {
            return new GoogleCloudRetailV2betaRuleIgnoreActionResponse(ignoreTerms);
        }
    }
}
