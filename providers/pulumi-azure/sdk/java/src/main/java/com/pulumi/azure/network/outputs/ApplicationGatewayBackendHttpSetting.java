// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.ApplicationGatewayBackendHttpSettingAuthenticationCertificate;
import com.pulumi.azure.network.outputs.ApplicationGatewayBackendHttpSettingConnectionDraining;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayBackendHttpSetting {
    /**
     * @return The name of the affinity cookie.
     * 
     */
    private final @Nullable String affinityCookieName;
    /**
     * @return One or more `authentication_certificate` blocks.
     * 
     */
    private final @Nullable List<ApplicationGatewayBackendHttpSettingAuthenticationCertificate> authenticationCertificates;
    /**
     * @return A `connection_draining` block as defined below.
     * 
     */
    private final @Nullable ApplicationGatewayBackendHttpSettingConnectionDraining connectionDraining;
    /**
     * @return Is Cookie-Based Affinity enabled? Possible values are `Enabled` and `Disabled`.
     * 
     */
    private final String cookieBasedAffinity;
    /**
     * @return Host header to be sent to the backend servers. Cannot be set if `pick_host_name_from_backend_address` is set to `true`.
     * 
     */
    private final @Nullable String hostName;
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private final @Nullable String id;
    /**
     * @return The name of the Backend HTTP Settings Collection.
     * 
     */
    private final String name;
    /**
     * @return The Path which should be used as a prefix for all HTTP requests.
     * 
     */
    private final @Nullable String path;
    /**
     * @return Whether host header should be picked from the host name of the backend server. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean pickHostNameFromBackendAddress;
    /**
     * @return The port which should be used for this Backend HTTP Settings Collection.
     * 
     */
    private final Integer port;
    /**
     * @return The ID of the associated Probe.
     * 
     */
    private final @Nullable String probeId;
    /**
     * @return The name of an associated HTTP Probe.
     * 
     */
    private final @Nullable String probeName;
    /**
     * @return The Protocol which should be used. Possible values are `Http` and `Https`.
     * 
     */
    private final String protocol;
    /**
     * @return The request timeout in seconds, which must be between 1 and 86400 seconds.
     * 
     */
    private final @Nullable Integer requestTimeout;
    /**
     * @return A list of `trusted_root_certificate` names.
     * 
     */
    private final @Nullable List<String> trustedRootCertificateNames;

    @CustomType.Constructor
    private ApplicationGatewayBackendHttpSetting(
        @CustomType.Parameter("affinityCookieName") @Nullable String affinityCookieName,
        @CustomType.Parameter("authenticationCertificates") @Nullable List<ApplicationGatewayBackendHttpSettingAuthenticationCertificate> authenticationCertificates,
        @CustomType.Parameter("connectionDraining") @Nullable ApplicationGatewayBackendHttpSettingConnectionDraining connectionDraining,
        @CustomType.Parameter("cookieBasedAffinity") String cookieBasedAffinity,
        @CustomType.Parameter("hostName") @Nullable String hostName,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("pickHostNameFromBackendAddress") @Nullable Boolean pickHostNameFromBackendAddress,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("probeId") @Nullable String probeId,
        @CustomType.Parameter("probeName") @Nullable String probeName,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("requestTimeout") @Nullable Integer requestTimeout,
        @CustomType.Parameter("trustedRootCertificateNames") @Nullable List<String> trustedRootCertificateNames) {
        this.affinityCookieName = affinityCookieName;
        this.authenticationCertificates = authenticationCertificates;
        this.connectionDraining = connectionDraining;
        this.cookieBasedAffinity = cookieBasedAffinity;
        this.hostName = hostName;
        this.id = id;
        this.name = name;
        this.path = path;
        this.pickHostNameFromBackendAddress = pickHostNameFromBackendAddress;
        this.port = port;
        this.probeId = probeId;
        this.probeName = probeName;
        this.protocol = protocol;
        this.requestTimeout = requestTimeout;
        this.trustedRootCertificateNames = trustedRootCertificateNames;
    }

    /**
     * @return The name of the affinity cookie.
     * 
     */
    public Optional<String> affinityCookieName() {
        return Optional.ofNullable(this.affinityCookieName);
    }
    /**
     * @return One or more `authentication_certificate` blocks.
     * 
     */
    public List<ApplicationGatewayBackendHttpSettingAuthenticationCertificate> authenticationCertificates() {
        return this.authenticationCertificates == null ? List.of() : this.authenticationCertificates;
    }
    /**
     * @return A `connection_draining` block as defined below.
     * 
     */
    public Optional<ApplicationGatewayBackendHttpSettingConnectionDraining> connectionDraining() {
        return Optional.ofNullable(this.connectionDraining);
    }
    /**
     * @return Is Cookie-Based Affinity enabled? Possible values are `Enabled` and `Disabled`.
     * 
     */
    public String cookieBasedAffinity() {
        return this.cookieBasedAffinity;
    }
    /**
     * @return Host header to be sent to the backend servers. Cannot be set if `pick_host_name_from_backend_address` is set to `true`.
     * 
     */
    public Optional<String> hostName() {
        return Optional.ofNullable(this.hostName);
    }
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name of the Backend HTTP Settings Collection.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Path which should be used as a prefix for all HTTP requests.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Whether host header should be picked from the host name of the backend server. Defaults to `false`.
     * 
     */
    public Optional<Boolean> pickHostNameFromBackendAddress() {
        return Optional.ofNullable(this.pickHostNameFromBackendAddress);
    }
    /**
     * @return The port which should be used for this Backend HTTP Settings Collection.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The ID of the associated Probe.
     * 
     */
    public Optional<String> probeId() {
        return Optional.ofNullable(this.probeId);
    }
    /**
     * @return The name of an associated HTTP Probe.
     * 
     */
    public Optional<String> probeName() {
        return Optional.ofNullable(this.probeName);
    }
    /**
     * @return The Protocol which should be used. Possible values are `Http` and `Https`.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The request timeout in seconds, which must be between 1 and 86400 seconds.
     * 
     */
    public Optional<Integer> requestTimeout() {
        return Optional.ofNullable(this.requestTimeout);
    }
    /**
     * @return A list of `trusted_root_certificate` names.
     * 
     */
    public List<String> trustedRootCertificateNames() {
        return this.trustedRootCertificateNames == null ? List.of() : this.trustedRootCertificateNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayBackendHttpSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String affinityCookieName;
        private @Nullable List<ApplicationGatewayBackendHttpSettingAuthenticationCertificate> authenticationCertificates;
        private @Nullable ApplicationGatewayBackendHttpSettingConnectionDraining connectionDraining;
        private String cookieBasedAffinity;
        private @Nullable String hostName;
        private @Nullable String id;
        private String name;
        private @Nullable String path;
        private @Nullable Boolean pickHostNameFromBackendAddress;
        private Integer port;
        private @Nullable String probeId;
        private @Nullable String probeName;
        private String protocol;
        private @Nullable Integer requestTimeout;
        private @Nullable List<String> trustedRootCertificateNames;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayBackendHttpSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityCookieName = defaults.affinityCookieName;
    	      this.authenticationCertificates = defaults.authenticationCertificates;
    	      this.connectionDraining = defaults.connectionDraining;
    	      this.cookieBasedAffinity = defaults.cookieBasedAffinity;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.pickHostNameFromBackendAddress = defaults.pickHostNameFromBackendAddress;
    	      this.port = defaults.port;
    	      this.probeId = defaults.probeId;
    	      this.probeName = defaults.probeName;
    	      this.protocol = defaults.protocol;
    	      this.requestTimeout = defaults.requestTimeout;
    	      this.trustedRootCertificateNames = defaults.trustedRootCertificateNames;
        }

        public Builder affinityCookieName(@Nullable String affinityCookieName) {
            this.affinityCookieName = affinityCookieName;
            return this;
        }
        public Builder authenticationCertificates(@Nullable List<ApplicationGatewayBackendHttpSettingAuthenticationCertificate> authenticationCertificates) {
            this.authenticationCertificates = authenticationCertificates;
            return this;
        }
        public Builder authenticationCertificates(ApplicationGatewayBackendHttpSettingAuthenticationCertificate... authenticationCertificates) {
            return authenticationCertificates(List.of(authenticationCertificates));
        }
        public Builder connectionDraining(@Nullable ApplicationGatewayBackendHttpSettingConnectionDraining connectionDraining) {
            this.connectionDraining = connectionDraining;
            return this;
        }
        public Builder cookieBasedAffinity(String cookieBasedAffinity) {
            this.cookieBasedAffinity = Objects.requireNonNull(cookieBasedAffinity);
            return this;
        }
        public Builder hostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder pickHostNameFromBackendAddress(@Nullable Boolean pickHostNameFromBackendAddress) {
            this.pickHostNameFromBackendAddress = pickHostNameFromBackendAddress;
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder probeId(@Nullable String probeId) {
            this.probeId = probeId;
            return this;
        }
        public Builder probeName(@Nullable String probeName) {
            this.probeName = probeName;
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder requestTimeout(@Nullable Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public Builder trustedRootCertificateNames(@Nullable List<String> trustedRootCertificateNames) {
            this.trustedRootCertificateNames = trustedRootCertificateNames;
            return this;
        }
        public Builder trustedRootCertificateNames(String... trustedRootCertificateNames) {
            return trustedRootCertificateNames(List.of(trustedRootCertificateNames));
        }        public ApplicationGatewayBackendHttpSetting build() {
            return new ApplicationGatewayBackendHttpSetting(affinityCookieName, authenticationCertificates, connectionDraining, cookieBasedAffinity, hostName, id, name, path, pickHostNameFromBackendAddress, port, probeId, probeName, protocol, requestTimeout, trustedRootCertificateNames);
        }
    }
}
