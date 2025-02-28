// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class X12ValidationOverrideResponse {
    /**
     * @return The value indicating whether to allow leading and trailing spaces and zeroes.
     * 
     */
    private final Boolean allowLeadingAndTrailingSpacesAndZeroes;
    /**
     * @return The message id on which the validation settings has to be applied.
     * 
     */
    private final String messageId;
    /**
     * @return The trailing separator policy.
     * 
     */
    private final String trailingSeparatorPolicy;
    /**
     * @return The value indicating whether to trim leading and trailing spaces and zeroes.
     * 
     */
    private final Boolean trimLeadingAndTrailingSpacesAndZeroes;
    /**
     * @return The value indicating whether to validate character Set.
     * 
     */
    private final Boolean validateCharacterSet;
    /**
     * @return The value indicating whether to validate EDI types.
     * 
     */
    private final Boolean validateEDITypes;
    /**
     * @return The value indicating whether to validate XSD types.
     * 
     */
    private final Boolean validateXSDTypes;

    @CustomType.Constructor
    private X12ValidationOverrideResponse(
        @CustomType.Parameter("allowLeadingAndTrailingSpacesAndZeroes") Boolean allowLeadingAndTrailingSpacesAndZeroes,
        @CustomType.Parameter("messageId") String messageId,
        @CustomType.Parameter("trailingSeparatorPolicy") String trailingSeparatorPolicy,
        @CustomType.Parameter("trimLeadingAndTrailingSpacesAndZeroes") Boolean trimLeadingAndTrailingSpacesAndZeroes,
        @CustomType.Parameter("validateCharacterSet") Boolean validateCharacterSet,
        @CustomType.Parameter("validateEDITypes") Boolean validateEDITypes,
        @CustomType.Parameter("validateXSDTypes") Boolean validateXSDTypes) {
        this.allowLeadingAndTrailingSpacesAndZeroes = allowLeadingAndTrailingSpacesAndZeroes;
        this.messageId = messageId;
        this.trailingSeparatorPolicy = trailingSeparatorPolicy;
        this.trimLeadingAndTrailingSpacesAndZeroes = trimLeadingAndTrailingSpacesAndZeroes;
        this.validateCharacterSet = validateCharacterSet;
        this.validateEDITypes = validateEDITypes;
        this.validateXSDTypes = validateXSDTypes;
    }

    /**
     * @return The value indicating whether to allow leading and trailing spaces and zeroes.
     * 
     */
    public Boolean allowLeadingAndTrailingSpacesAndZeroes() {
        return this.allowLeadingAndTrailingSpacesAndZeroes;
    }
    /**
     * @return The message id on which the validation settings has to be applied.
     * 
     */
    public String messageId() {
        return this.messageId;
    }
    /**
     * @return The trailing separator policy.
     * 
     */
    public String trailingSeparatorPolicy() {
        return this.trailingSeparatorPolicy;
    }
    /**
     * @return The value indicating whether to trim leading and trailing spaces and zeroes.
     * 
     */
    public Boolean trimLeadingAndTrailingSpacesAndZeroes() {
        return this.trimLeadingAndTrailingSpacesAndZeroes;
    }
    /**
     * @return The value indicating whether to validate character Set.
     * 
     */
    public Boolean validateCharacterSet() {
        return this.validateCharacterSet;
    }
    /**
     * @return The value indicating whether to validate EDI types.
     * 
     */
    public Boolean validateEDITypes() {
        return this.validateEDITypes;
    }
    /**
     * @return The value indicating whether to validate XSD types.
     * 
     */
    public Boolean validateXSDTypes() {
        return this.validateXSDTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12ValidationOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowLeadingAndTrailingSpacesAndZeroes;
        private String messageId;
        private String trailingSeparatorPolicy;
        private Boolean trimLeadingAndTrailingSpacesAndZeroes;
        private Boolean validateCharacterSet;
        private Boolean validateEDITypes;
        private Boolean validateXSDTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(X12ValidationOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLeadingAndTrailingSpacesAndZeroes = defaults.allowLeadingAndTrailingSpacesAndZeroes;
    	      this.messageId = defaults.messageId;
    	      this.trailingSeparatorPolicy = defaults.trailingSeparatorPolicy;
    	      this.trimLeadingAndTrailingSpacesAndZeroes = defaults.trimLeadingAndTrailingSpacesAndZeroes;
    	      this.validateCharacterSet = defaults.validateCharacterSet;
    	      this.validateEDITypes = defaults.validateEDITypes;
    	      this.validateXSDTypes = defaults.validateXSDTypes;
        }

        public Builder allowLeadingAndTrailingSpacesAndZeroes(Boolean allowLeadingAndTrailingSpacesAndZeroes) {
            this.allowLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(allowLeadingAndTrailingSpacesAndZeroes);
            return this;
        }
        public Builder messageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }
        public Builder trailingSeparatorPolicy(String trailingSeparatorPolicy) {
            this.trailingSeparatorPolicy = Objects.requireNonNull(trailingSeparatorPolicy);
            return this;
        }
        public Builder trimLeadingAndTrailingSpacesAndZeroes(Boolean trimLeadingAndTrailingSpacesAndZeroes) {
            this.trimLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(trimLeadingAndTrailingSpacesAndZeroes);
            return this;
        }
        public Builder validateCharacterSet(Boolean validateCharacterSet) {
            this.validateCharacterSet = Objects.requireNonNull(validateCharacterSet);
            return this;
        }
        public Builder validateEDITypes(Boolean validateEDITypes) {
            this.validateEDITypes = Objects.requireNonNull(validateEDITypes);
            return this;
        }
        public Builder validateXSDTypes(Boolean validateXSDTypes) {
            this.validateXSDTypes = Objects.requireNonNull(validateXSDTypes);
            return this;
        }        public X12ValidationOverrideResponse build() {
            return new X12ValidationOverrideResponse(allowLeadingAndTrailingSpacesAndZeroes, messageId, trailingSeparatorPolicy, trimLeadingAndTrailingSpacesAndZeroes, validateCharacterSet, validateEDITypes, validateXSDTypes);
        }
    }
}
