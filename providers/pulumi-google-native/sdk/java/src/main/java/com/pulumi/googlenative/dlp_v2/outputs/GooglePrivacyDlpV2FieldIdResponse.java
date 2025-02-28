// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2FieldIdResponse {
    /**
     * @return Name describing the field.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GooglePrivacyDlpV2FieldIdResponse(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * @return Name describing the field.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2FieldIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2FieldIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GooglePrivacyDlpV2FieldIdResponse build() {
            return new GooglePrivacyDlpV2FieldIdResponse(name);
        }
    }
}
