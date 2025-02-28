// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResponseHeadersPolicyCustomHeadersConfigItem {
    /**
     * @return The HTTP response header name.
     * 
     */
    private final String header;
    /**
     * @return A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    private final Boolean override;
    /**
     * @return The value for the HTTP response header.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ResponseHeadersPolicyCustomHeadersConfigItem(
        @CustomType.Parameter("header") String header,
        @CustomType.Parameter("override") Boolean override,
        @CustomType.Parameter("value") String value) {
        this.header = header;
        this.override = override;
        this.value = value;
    }

    /**
     * @return The HTTP response header name.
     * 
     */
    public String header() {
        return this.header;
    }
    /**
     * @return A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    public Boolean override() {
        return this.override;
    }
    /**
     * @return The value for the HTTP response header.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyCustomHeadersConfigItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String header;
        private Boolean override;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyCustomHeadersConfigItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.override = defaults.override;
    	      this.value = defaults.value;
        }

        public Builder header(String header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }
        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ResponseHeadersPolicyCustomHeadersConfigItem build() {
            return new ResponseHeadersPolicyCustomHeadersConfigItem(header, override, value);
        }
    }
}
