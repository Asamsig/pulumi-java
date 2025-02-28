// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames {
    /**
     * @return The criteria for determining a SAN&#39;s match.
     * 
     */
    private final VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch match;

    @CustomType.Constructor
    private VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames(@CustomType.Parameter("match") VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch match) {
        this.match = match;
    }

    /**
     * @return The criteria for determining a SAN&#39;s match.
     * 
     */
    public VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch match() {
        return this.match;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch match;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
        }

        public Builder match(VirtualNodeSpecListenerTlsValidationSubjectAlternativeNamesMatch match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }        public VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames build() {
            return new VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames(match);
        }
    }
}
