// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.domainregistration.outputs;

import com.pulumi.azurenative.domainregistration.outputs.HostNameResponse;
import com.pulumi.azurenative.domainregistration.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainResult {
    private final @Nullable String authCode;
    /**
     * @return &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    private final @Nullable Boolean autoRenew;
    /**
     * @return Domain creation timestamp.
     * 
     */
    private final String createdTime;
    /**
     * @return Current DNS type
     * 
     */
    private final @Nullable String dnsType;
    /**
     * @return Azure DNS Zone to use
     * 
     */
    private final @Nullable String dnsZoneId;
    /**
     * @return Reasons why domain is not renewable.
     * 
     */
    private final List<String> domainNotRenewableReasons;
    /**
     * @return Domain expiration timestamp.
     * 
     */
    private final String expirationTime;
    /**
     * @return Resource Id.
     * 
     */
    private final String id;
    /**
     * @return Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * @return Timestamp when the domain was renewed last time.
     * 
     */
    private final String lastRenewedTime;
    /**
     * @return Resource Location.
     * 
     */
    private final String location;
    /**
     * @return All hostnames derived from the domain and assigned to Azure resources.
     * 
     */
    private final List<HostNameResponse> managedHostNames;
    /**
     * @return Resource Name.
     * 
     */
    private final String name;
    /**
     * @return Name servers.
     * 
     */
    private final List<String> nameServers;
    /**
     * @return &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    private final @Nullable Boolean privacy;
    /**
     * @return Domain provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * @return &lt;code&gt;true&lt;/code&gt; if Azure can assign this domain to App Service apps; otherwise, &lt;code&gt;false&lt;/code&gt;. This value will be &lt;code&gt;true&lt;/code&gt; if domain registration status is active and
     *  it is hosted on name servers Azure has programmatic access to.
     * 
     */
    private final Boolean readyForDnsRecordManagement;
    /**
     * @return Domain registration status.
     * 
     */
    private final String registrationStatus;
    /**
     * @return The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Target DNS type (would be used for migration)
     * 
     */
    private final @Nullable String targetDnsType;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDomainResult(
        @CustomType.Parameter("authCode") @Nullable String authCode,
        @CustomType.Parameter("autoRenew") @Nullable Boolean autoRenew,
        @CustomType.Parameter("createdTime") String createdTime,
        @CustomType.Parameter("dnsType") @Nullable String dnsType,
        @CustomType.Parameter("dnsZoneId") @Nullable String dnsZoneId,
        @CustomType.Parameter("domainNotRenewableReasons") List<String> domainNotRenewableReasons,
        @CustomType.Parameter("expirationTime") String expirationTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("lastRenewedTime") String lastRenewedTime,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("managedHostNames") List<HostNameResponse> managedHostNames,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nameServers") List<String> nameServers,
        @CustomType.Parameter("privacy") @Nullable Boolean privacy,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("readyForDnsRecordManagement") Boolean readyForDnsRecordManagement,
        @CustomType.Parameter("registrationStatus") String registrationStatus,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("targetDnsType") @Nullable String targetDnsType,
        @CustomType.Parameter("type") String type) {
        this.authCode = authCode;
        this.autoRenew = autoRenew;
        this.createdTime = createdTime;
        this.dnsType = dnsType;
        this.dnsZoneId = dnsZoneId;
        this.domainNotRenewableReasons = domainNotRenewableReasons;
        this.expirationTime = expirationTime;
        this.id = id;
        this.kind = kind;
        this.lastRenewedTime = lastRenewedTime;
        this.location = location;
        this.managedHostNames = managedHostNames;
        this.name = name;
        this.nameServers = nameServers;
        this.privacy = privacy;
        this.provisioningState = provisioningState;
        this.readyForDnsRecordManagement = readyForDnsRecordManagement;
        this.registrationStatus = registrationStatus;
        this.systemData = systemData;
        this.tags = tags;
        this.targetDnsType = targetDnsType;
        this.type = type;
    }

    public Optional<String> authCode() {
        return Optional.ofNullable(this.authCode);
    }
    /**
     * @return &lt;code&gt;true&lt;/code&gt; if the domain should be automatically renewed; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Optional<Boolean> autoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }
    /**
     * @return Domain creation timestamp.
     * 
     */
    public String createdTime() {
        return this.createdTime;
    }
    /**
     * @return Current DNS type
     * 
     */
    public Optional<String> dnsType() {
        return Optional.ofNullable(this.dnsType);
    }
    /**
     * @return Azure DNS Zone to use
     * 
     */
    public Optional<String> dnsZoneId() {
        return Optional.ofNullable(this.dnsZoneId);
    }
    /**
     * @return Reasons why domain is not renewable.
     * 
     */
    public List<String> domainNotRenewableReasons() {
        return this.domainNotRenewableReasons;
    }
    /**
     * @return Domain expiration timestamp.
     * 
     */
    public String expirationTime() {
        return this.expirationTime;
    }
    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Timestamp when the domain was renewed last time.
     * 
     */
    public String lastRenewedTime() {
        return this.lastRenewedTime;
    }
    /**
     * @return Resource Location.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return All hostnames derived from the domain and assigned to Azure resources.
     * 
     */
    public List<HostNameResponse> managedHostNames() {
        return this.managedHostNames;
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Name servers.
     * 
     */
    public List<String> nameServers() {
        return this.nameServers;
    }
    /**
     * @return &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this domain; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Optional<Boolean> privacy() {
        return Optional.ofNullable(this.privacy);
    }
    /**
     * @return Domain provisioning state.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return &lt;code&gt;true&lt;/code&gt; if Azure can assign this domain to App Service apps; otherwise, &lt;code&gt;false&lt;/code&gt;. This value will be &lt;code&gt;true&lt;/code&gt; if domain registration status is active and
     *  it is hosted on name servers Azure has programmatic access to.
     * 
     */
    public Boolean readyForDnsRecordManagement() {
        return this.readyForDnsRecordManagement;
    }
    /**
     * @return Domain registration status.
     * 
     */
    public String registrationStatus() {
        return this.registrationStatus;
    }
    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Target DNS type (would be used for migration)
     * 
     */
    public Optional<String> targetDnsType() {
        return Optional.ofNullable(this.targetDnsType);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authCode;
        private @Nullable Boolean autoRenew;
        private String createdTime;
        private @Nullable String dnsType;
        private @Nullable String dnsZoneId;
        private List<String> domainNotRenewableReasons;
        private String expirationTime;
        private String id;
        private @Nullable String kind;
        private String lastRenewedTime;
        private String location;
        private List<HostNameResponse> managedHostNames;
        private String name;
        private List<String> nameServers;
        private @Nullable Boolean privacy;
        private String provisioningState;
        private Boolean readyForDnsRecordManagement;
        private String registrationStatus;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable String targetDnsType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authCode = defaults.authCode;
    	      this.autoRenew = defaults.autoRenew;
    	      this.createdTime = defaults.createdTime;
    	      this.dnsType = defaults.dnsType;
    	      this.dnsZoneId = defaults.dnsZoneId;
    	      this.domainNotRenewableReasons = defaults.domainNotRenewableReasons;
    	      this.expirationTime = defaults.expirationTime;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastRenewedTime = defaults.lastRenewedTime;
    	      this.location = defaults.location;
    	      this.managedHostNames = defaults.managedHostNames;
    	      this.name = defaults.name;
    	      this.nameServers = defaults.nameServers;
    	      this.privacy = defaults.privacy;
    	      this.provisioningState = defaults.provisioningState;
    	      this.readyForDnsRecordManagement = defaults.readyForDnsRecordManagement;
    	      this.registrationStatus = defaults.registrationStatus;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.targetDnsType = defaults.targetDnsType;
    	      this.type = defaults.type;
        }

        public Builder authCode(@Nullable String authCode) {
            this.authCode = authCode;
            return this;
        }
        public Builder autoRenew(@Nullable Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }
        public Builder dnsType(@Nullable String dnsType) {
            this.dnsType = dnsType;
            return this;
        }
        public Builder dnsZoneId(@Nullable String dnsZoneId) {
            this.dnsZoneId = dnsZoneId;
            return this;
        }
        public Builder domainNotRenewableReasons(List<String> domainNotRenewableReasons) {
            this.domainNotRenewableReasons = Objects.requireNonNull(domainNotRenewableReasons);
            return this;
        }
        public Builder domainNotRenewableReasons(String... domainNotRenewableReasons) {
            return domainNotRenewableReasons(List.of(domainNotRenewableReasons));
        }
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder lastRenewedTime(String lastRenewedTime) {
            this.lastRenewedTime = Objects.requireNonNull(lastRenewedTime);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder managedHostNames(List<HostNameResponse> managedHostNames) {
            this.managedHostNames = Objects.requireNonNull(managedHostNames);
            return this;
        }
        public Builder managedHostNames(HostNameResponse... managedHostNames) {
            return managedHostNames(List.of(managedHostNames));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nameServers(List<String> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }
        public Builder nameServers(String... nameServers) {
            return nameServers(List.of(nameServers));
        }
        public Builder privacy(@Nullable Boolean privacy) {
            this.privacy = privacy;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder readyForDnsRecordManagement(Boolean readyForDnsRecordManagement) {
            this.readyForDnsRecordManagement = Objects.requireNonNull(readyForDnsRecordManagement);
            return this;
        }
        public Builder registrationStatus(String registrationStatus) {
            this.registrationStatus = Objects.requireNonNull(registrationStatus);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder targetDnsType(@Nullable String targetDnsType) {
            this.targetDnsType = targetDnsType;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDomainResult build() {
            return new GetDomainResult(authCode, autoRenew, createdTime, dnsType, dnsZoneId, domainNotRenewableReasons, expirationTime, id, kind, lastRenewedTime, location, managedHostNames, name, nameServers, privacy, provisioningState, readyForDnsRecordManagement, registrationStatus, systemData, tags, targetDnsType, type);
        }
    }
}
