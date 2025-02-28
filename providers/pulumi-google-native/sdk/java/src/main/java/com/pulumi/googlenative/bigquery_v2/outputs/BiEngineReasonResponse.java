// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BiEngineReasonResponse {
    /**
     * @return High-level BI Engine reason for partial or disabled acceleration.
     * 
     */
    private final String code;
    /**
     * @return Free form human-readable reason for partial or disabled acceleration.
     * 
     */
    private final String message;

    @CustomType.Constructor
    private BiEngineReasonResponse(
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("message") String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @return High-level BI Engine reason for partial or disabled acceleration.
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return Free form human-readable reason for partial or disabled acceleration.
     * 
     */
    public String message() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BiEngineReasonResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(BiEngineReasonResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public BiEngineReasonResponse build() {
            return new BiEngineReasonResponse(code, message);
        }
    }
}
