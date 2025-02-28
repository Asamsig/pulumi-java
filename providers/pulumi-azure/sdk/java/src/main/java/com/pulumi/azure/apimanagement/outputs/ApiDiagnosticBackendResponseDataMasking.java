// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.ApiDiagnosticBackendResponseDataMaskingHeader;
import com.pulumi.azure.apimanagement.outputs.ApiDiagnosticBackendResponseDataMaskingQueryParam;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ApiDiagnosticBackendResponseDataMasking {
    /**
     * @return A `headers` block as defined below.
     * 
     */
    private final @Nullable List<ApiDiagnosticBackendResponseDataMaskingHeader> headers;
    /**
     * @return A `query_params` block as defined below.
     * 
     */
    private final @Nullable List<ApiDiagnosticBackendResponseDataMaskingQueryParam> queryParams;

    @CustomType.Constructor
    private ApiDiagnosticBackendResponseDataMasking(
        @CustomType.Parameter("headers") @Nullable List<ApiDiagnosticBackendResponseDataMaskingHeader> headers,
        @CustomType.Parameter("queryParams") @Nullable List<ApiDiagnosticBackendResponseDataMaskingQueryParam> queryParams) {
        this.headers = headers;
        this.queryParams = queryParams;
    }

    /**
     * @return A `headers` block as defined below.
     * 
     */
    public List<ApiDiagnosticBackendResponseDataMaskingHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return A `query_params` block as defined below.
     * 
     */
    public List<ApiDiagnosticBackendResponseDataMaskingQueryParam> queryParams() {
        return this.queryParams == null ? List.of() : this.queryParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDiagnosticBackendResponseDataMasking defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApiDiagnosticBackendResponseDataMaskingHeader> headers;
        private @Nullable List<ApiDiagnosticBackendResponseDataMaskingQueryParam> queryParams;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiDiagnosticBackendResponseDataMasking defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.queryParams = defaults.queryParams;
        }

        public Builder headers(@Nullable List<ApiDiagnosticBackendResponseDataMaskingHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(ApiDiagnosticBackendResponseDataMaskingHeader... headers) {
            return headers(List.of(headers));
        }
        public Builder queryParams(@Nullable List<ApiDiagnosticBackendResponseDataMaskingQueryParam> queryParams) {
            this.queryParams = queryParams;
            return this;
        }
        public Builder queryParams(ApiDiagnosticBackendResponseDataMaskingQueryParam... queryParams) {
            return queryParams(List.of(queryParams));
        }        public ApiDiagnosticBackendResponseDataMasking build() {
            return new ApiDiagnosticBackendResponseDataMasking(headers, queryParams);
        }
    }
}
