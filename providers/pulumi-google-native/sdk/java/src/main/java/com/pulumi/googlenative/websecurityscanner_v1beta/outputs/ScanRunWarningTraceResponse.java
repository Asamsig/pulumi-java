// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScanRunWarningTraceResponse {
    /**
     * @return Indicates the warning code.
     * 
     */
    private final String code;

    @CustomType.Constructor
    private ScanRunWarningTraceResponse(@CustomType.Parameter("code") String code) {
        this.code = code;
    }

    /**
     * @return Indicates the warning code.
     * 
     */
    public String code() {
        return this.code;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScanRunWarningTraceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;

        public Builder() {
    	      // Empty
        }

        public Builder(ScanRunWarningTraceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }        public ScanRunWarningTraceResponse build() {
            return new ScanRunWarningTraceResponse(code);
        }
    }
}
