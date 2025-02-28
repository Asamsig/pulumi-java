// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.GetApiSubscriptionKeyParameterName;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApiResult {
    private final String apiManagementName;
    /**
     * @return A description of the API Management API, which may include HTML formatting tags.
     * 
     */
    private final String description;
    /**
     * @return The display name of the API.
     * 
     */
    private final String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Is this the current API Revision?
     * 
     */
    private final Boolean isCurrent;
    /**
     * @return Is this API Revision online/accessible via the Gateway?
     * 
     */
    private final Boolean isOnline;
    private final String name;
    /**
     * @return The Path for this API Management API.
     * 
     */
    private final String path;
    /**
     * @return A list of protocols the operations in this API can be invoked.
     * 
     */
    private final List<String> protocols;
    private final String resourceGroupName;
    private final String revision;
    /**
     * @return Absolute URL of the backend service implementing this API.
     * 
     */
    private final String serviceUrl;
    /**
     * @return Should this API expose a SOAP frontend, rather than a HTTP frontend?
     * 
     */
    private final Boolean soapPassThrough;
    /**
     * @return A `subscription_key_parameter_names` block as documented below.
     * 
     */
    private final List<GetApiSubscriptionKeyParameterName> subscriptionKeyParameterNames;
    /**
     * @return Should this API require a subscription key?
     * 
     */
    private final Boolean subscriptionRequired;
    /**
     * @return The Version number of this API, if this API is versioned.
     * 
     */
    private final String version;
    /**
     * @return The ID of the Version Set which this API is associated with.
     * 
     */
    private final String versionSetId;

    @CustomType.Constructor
    private GetApiResult(
        @CustomType.Parameter("apiManagementName") String apiManagementName,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isCurrent") Boolean isCurrent,
        @CustomType.Parameter("isOnline") Boolean isOnline,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("protocols") List<String> protocols,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("revision") String revision,
        @CustomType.Parameter("serviceUrl") String serviceUrl,
        @CustomType.Parameter("soapPassThrough") Boolean soapPassThrough,
        @CustomType.Parameter("subscriptionKeyParameterNames") List<GetApiSubscriptionKeyParameterName> subscriptionKeyParameterNames,
        @CustomType.Parameter("subscriptionRequired") Boolean subscriptionRequired,
        @CustomType.Parameter("version") String version,
        @CustomType.Parameter("versionSetId") String versionSetId) {
        this.apiManagementName = apiManagementName;
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.isCurrent = isCurrent;
        this.isOnline = isOnline;
        this.name = name;
        this.path = path;
        this.protocols = protocols;
        this.resourceGroupName = resourceGroupName;
        this.revision = revision;
        this.serviceUrl = serviceUrl;
        this.soapPassThrough = soapPassThrough;
        this.subscriptionKeyParameterNames = subscriptionKeyParameterNames;
        this.subscriptionRequired = subscriptionRequired;
        this.version = version;
        this.versionSetId = versionSetId;
    }

    public String apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * @return A description of the API Management API, which may include HTML formatting tags.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The display name of the API.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Is this the current API Revision?
     * 
     */
    public Boolean isCurrent() {
        return this.isCurrent;
    }
    /**
     * @return Is this API Revision online/accessible via the Gateway?
     * 
     */
    public Boolean isOnline() {
        return this.isOnline;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The Path for this API Management API.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return A list of protocols the operations in this API can be invoked.
     * 
     */
    public List<String> protocols() {
        return this.protocols;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public String revision() {
        return this.revision;
    }
    /**
     * @return Absolute URL of the backend service implementing this API.
     * 
     */
    public String serviceUrl() {
        return this.serviceUrl;
    }
    /**
     * @return Should this API expose a SOAP frontend, rather than a HTTP frontend?
     * 
     */
    public Boolean soapPassThrough() {
        return this.soapPassThrough;
    }
    /**
     * @return A `subscription_key_parameter_names` block as documented below.
     * 
     */
    public List<GetApiSubscriptionKeyParameterName> subscriptionKeyParameterNames() {
        return this.subscriptionKeyParameterNames;
    }
    /**
     * @return Should this API require a subscription key?
     * 
     */
    public Boolean subscriptionRequired() {
        return this.subscriptionRequired;
    }
    /**
     * @return The Version number of this API, if this API is versioned.
     * 
     */
    public String version() {
        return this.version;
    }
    /**
     * @return The ID of the Version Set which this API is associated with.
     * 
     */
    public String versionSetId() {
        return this.versionSetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiManagementName;
        private String description;
        private String displayName;
        private String id;
        private Boolean isCurrent;
        private Boolean isOnline;
        private String name;
        private String path;
        private List<String> protocols;
        private String resourceGroupName;
        private String revision;
        private String serviceUrl;
        private Boolean soapPassThrough;
        private List<GetApiSubscriptionKeyParameterName> subscriptionKeyParameterNames;
        private Boolean subscriptionRequired;
        private String version;
        private String versionSetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiManagementName = defaults.apiManagementName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.isCurrent = defaults.isCurrent;
    	      this.isOnline = defaults.isOnline;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.protocols = defaults.protocols;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.revision = defaults.revision;
    	      this.serviceUrl = defaults.serviceUrl;
    	      this.soapPassThrough = defaults.soapPassThrough;
    	      this.subscriptionKeyParameterNames = defaults.subscriptionKeyParameterNames;
    	      this.subscriptionRequired = defaults.subscriptionRequired;
    	      this.version = defaults.version;
    	      this.versionSetId = defaults.versionSetId;
        }

        public Builder apiManagementName(String apiManagementName) {
            this.apiManagementName = Objects.requireNonNull(apiManagementName);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isCurrent(Boolean isCurrent) {
            this.isCurrent = Objects.requireNonNull(isCurrent);
            return this;
        }
        public Builder isOnline(Boolean isOnline) {
            this.isOnline = Objects.requireNonNull(isOnline);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder protocols(List<String> protocols) {
            this.protocols = Objects.requireNonNull(protocols);
            return this;
        }
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder revision(String revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public Builder serviceUrl(String serviceUrl) {
            this.serviceUrl = Objects.requireNonNull(serviceUrl);
            return this;
        }
        public Builder soapPassThrough(Boolean soapPassThrough) {
            this.soapPassThrough = Objects.requireNonNull(soapPassThrough);
            return this;
        }
        public Builder subscriptionKeyParameterNames(List<GetApiSubscriptionKeyParameterName> subscriptionKeyParameterNames) {
            this.subscriptionKeyParameterNames = Objects.requireNonNull(subscriptionKeyParameterNames);
            return this;
        }
        public Builder subscriptionKeyParameterNames(GetApiSubscriptionKeyParameterName... subscriptionKeyParameterNames) {
            return subscriptionKeyParameterNames(List.of(subscriptionKeyParameterNames));
        }
        public Builder subscriptionRequired(Boolean subscriptionRequired) {
            this.subscriptionRequired = Objects.requireNonNull(subscriptionRequired);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder versionSetId(String versionSetId) {
            this.versionSetId = Objects.requireNonNull(versionSetId);
            return this;
        }        public GetApiResult build() {
            return new GetApiResult(apiManagementName, description, displayName, id, isCurrent, isOnline, name, path, protocols, resourceGroupName, revision, serviceUrl, soapPassThrough, subscriptionKeyParameterNames, subscriptionRequired, version, versionSetId);
        }
    }
}
