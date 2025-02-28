// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.azure.keyvault.outputs.CertifiateCertificatePolicyLifetimeActionAction;
import com.pulumi.azure.keyvault.outputs.CertifiateCertificatePolicyLifetimeActionTrigger;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class CertifiateCertificatePolicyLifetimeAction {
    /**
     * @return A `action` block as defined below.
     * 
     */
    private final CertifiateCertificatePolicyLifetimeActionAction action;
    /**
     * @return A `trigger` block as defined below.
     * 
     */
    private final CertifiateCertificatePolicyLifetimeActionTrigger trigger;

    @CustomType.Constructor
    private CertifiateCertificatePolicyLifetimeAction(
        @CustomType.Parameter("action") CertifiateCertificatePolicyLifetimeActionAction action,
        @CustomType.Parameter("trigger") CertifiateCertificatePolicyLifetimeActionTrigger trigger) {
        this.action = action;
        this.trigger = trigger;
    }

    /**
     * @return A `action` block as defined below.
     * 
     */
    public CertifiateCertificatePolicyLifetimeActionAction action() {
        return this.action;
    }
    /**
     * @return A `trigger` block as defined below.
     * 
     */
    public CertifiateCertificatePolicyLifetimeActionTrigger trigger() {
        return this.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertifiateCertificatePolicyLifetimeAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertifiateCertificatePolicyLifetimeActionAction action;
        private CertifiateCertificatePolicyLifetimeActionTrigger trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(CertifiateCertificatePolicyLifetimeAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.trigger = defaults.trigger;
        }

        public Builder action(CertifiateCertificatePolicyLifetimeActionAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder trigger(CertifiateCertificatePolicyLifetimeActionTrigger trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }        public CertifiateCertificatePolicyLifetimeAction build() {
            return new CertifiateCertificatePolicyLifetimeAction(action, trigger);
        }
    }
}
