// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mariadb.outputs;

import com.pulumi.azure.mariadb.outputs.GetMariaDbServerStorageProfile;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMariaDbServerResult {
    /**
     * @return The Administrator Login for the MariaDB Server.
     * 
     */
    private final String administratorLogin;
    /**
     * @return The FQDN of the MariaDB Server.
     * 
     */
    private final String fqdn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The Azure location where the resource exists.
     * 
     */
    private final String location;
    private final String name;
    private final String resourceGroupName;
    /**
     * @return The SKU Name for this MariaDB Server.
     * 
     */
    private final String skuName;
    /**
     * @return The SSL being enforced on connections.
     * 
     */
    private final String sslEnforcement;
    /**
     * @return A `storage_profile` block as defined below.
     * 
     */
    private final List<GetMariaDbServerStorageProfile> storageProfiles;
    /**
     * @return A mapping of tags assigned to the resource.
     * ---
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The version of MariaDB being used.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetMariaDbServerResult(
        @CustomType.Parameter("administratorLogin") String administratorLogin,
        @CustomType.Parameter("fqdn") String fqdn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("skuName") String skuName,
        @CustomType.Parameter("sslEnforcement") String sslEnforcement,
        @CustomType.Parameter("storageProfiles") List<GetMariaDbServerStorageProfile> storageProfiles,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("version") String version) {
        this.administratorLogin = administratorLogin;
        this.fqdn = fqdn;
        this.id = id;
        this.location = location;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.skuName = skuName;
        this.sslEnforcement = sslEnforcement;
        this.storageProfiles = storageProfiles;
        this.tags = tags;
        this.version = version;
    }

    /**
     * @return The Administrator Login for the MariaDB Server.
     * 
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }
    /**
     * @return The FQDN of the MariaDB Server.
     * 
     */
    public String fqdn() {
        return this.fqdn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure location where the resource exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The SKU Name for this MariaDB Server.
     * 
     */
    public String skuName() {
        return this.skuName;
    }
    /**
     * @return The SSL being enforced on connections.
     * 
     */
    public String sslEnforcement() {
        return this.sslEnforcement;
    }
    /**
     * @return A `storage_profile` block as defined below.
     * 
     */
    public List<GetMariaDbServerStorageProfile> storageProfiles() {
        return this.storageProfiles;
    }
    /**
     * @return A mapping of tags assigned to the resource.
     * ---
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The version of MariaDB being used.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMariaDbServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String administratorLogin;
        private String fqdn;
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;
        private String skuName;
        private String sslEnforcement;
        private List<GetMariaDbServerStorageProfile> storageProfiles;
        private Map<String,String> tags;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMariaDbServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.fqdn = defaults.fqdn;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skuName = defaults.skuName;
    	      this.sslEnforcement = defaults.sslEnforcement;
    	      this.storageProfiles = defaults.storageProfiles;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder administratorLogin(String administratorLogin) {
            this.administratorLogin = Objects.requireNonNull(administratorLogin);
            return this;
        }
        public Builder fqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder skuName(String skuName) {
            this.skuName = Objects.requireNonNull(skuName);
            return this;
        }
        public Builder sslEnforcement(String sslEnforcement) {
            this.sslEnforcement = Objects.requireNonNull(sslEnforcement);
            return this;
        }
        public Builder storageProfiles(List<GetMariaDbServerStorageProfile> storageProfiles) {
            this.storageProfiles = Objects.requireNonNull(storageProfiles);
            return this;
        }
        public Builder storageProfiles(GetMariaDbServerStorageProfile... storageProfiles) {
            return storageProfiles(List.of(storageProfiles));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetMariaDbServerResult build() {
            return new GetMariaDbServerResult(administratorLogin, fqdn, id, location, name, resourceGroupName, skuName, sslEnforcement, storageProfiles, tags, version);
        }
    }
}
