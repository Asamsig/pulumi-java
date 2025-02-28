// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.apigateway.outputs.ApiConfigOpenapiDocumentDocument;
import java.util.Objects;

@CustomType
public final class ApiConfigOpenapiDocument {
    /**
     * @return The OpenAPI Specification document file.
     * Structure is documented below.
     * 
     */
    private final ApiConfigOpenapiDocumentDocument document;

    @CustomType.Constructor
    private ApiConfigOpenapiDocument(@CustomType.Parameter("document") ApiConfigOpenapiDocumentDocument document) {
        this.document = document;
    }

    /**
     * @return The OpenAPI Specification document file.
     * Structure is documented below.
     * 
     */
    public ApiConfigOpenapiDocumentDocument document() {
        return this.document;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigOpenapiDocument defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiConfigOpenapiDocumentDocument document;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigOpenapiDocument defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.document = defaults.document;
        }

        public Builder document(ApiConfigOpenapiDocumentDocument document) {
            this.document = Objects.requireNonNull(document);
            return this;
        }        public ApiConfigOpenapiDocument build() {
            return new ApiConfigOpenapiDocument(document);
        }
    }
}
