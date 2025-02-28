// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dns_v1beta2.outputs.DnsKeySpecResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ManagedZoneDnsSecConfigResponse {
    /**
     * @return Specifies parameters for generating initial DnsKeys for this ManagedZone. Can only be changed while the state is OFF.
     * 
     */
    private final List<DnsKeySpecResponse> defaultKeySpecs;
    private final String kind;
    /**
     * @return Specifies the mechanism for authenticated denial-of-existence responses. Can only be changed while the state is OFF.
     * 
     */
    private final String nonExistence;
    /**
     * @return Specifies whether DNSSEC is enabled, and what mode it is in.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private ManagedZoneDnsSecConfigResponse(
        @CustomType.Parameter("defaultKeySpecs") List<DnsKeySpecResponse> defaultKeySpecs,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("nonExistence") String nonExistence,
        @CustomType.Parameter("state") String state) {
        this.defaultKeySpecs = defaultKeySpecs;
        this.kind = kind;
        this.nonExistence = nonExistence;
        this.state = state;
    }

    /**
     * @return Specifies parameters for generating initial DnsKeys for this ManagedZone. Can only be changed while the state is OFF.
     * 
     */
    public List<DnsKeySpecResponse> defaultKeySpecs() {
        return this.defaultKeySpecs;
    }
    public String kind() {
        return this.kind;
    }
    /**
     * @return Specifies the mechanism for authenticated denial-of-existence responses. Can only be changed while the state is OFF.
     * 
     */
    public String nonExistence() {
        return this.nonExistence;
    }
    /**
     * @return Specifies whether DNSSEC is enabled, and what mode it is in.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneDnsSecConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DnsKeySpecResponse> defaultKeySpecs;
        private String kind;
        private String nonExistence;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneDnsSecConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultKeySpecs = defaults.defaultKeySpecs;
    	      this.kind = defaults.kind;
    	      this.nonExistence = defaults.nonExistence;
    	      this.state = defaults.state;
        }

        public Builder defaultKeySpecs(List<DnsKeySpecResponse> defaultKeySpecs) {
            this.defaultKeySpecs = Objects.requireNonNull(defaultKeySpecs);
            return this;
        }
        public Builder defaultKeySpecs(DnsKeySpecResponse... defaultKeySpecs) {
            return defaultKeySpecs(List.of(defaultKeySpecs));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder nonExistence(String nonExistence) {
            this.nonExistence = Objects.requireNonNull(nonExistence);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public ManagedZoneDnsSecConfigResponse build() {
            return new ManagedZoneDnsSecConfigResponse(defaultKeySpecs, kind, nonExistence, state);
        }
    }
}
