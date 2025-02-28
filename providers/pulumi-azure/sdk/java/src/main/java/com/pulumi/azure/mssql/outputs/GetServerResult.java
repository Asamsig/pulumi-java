// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.outputs;

import com.pulumi.azure.mssql.outputs.GetServerIdentity;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServerResult {
    /**
     * @return The server&#39;s administrator login name.
     * 
     */
    private final String administratorLogin;
    /**
     * @return The fully qualified domain name of the Azure SQL Server.
     * 
     */
    private final String fullyQualifiedDomainName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A `identity` block as defined below.
     * 
     */
    private final List<GetServerIdentity> identities;
    /**
     * @return The Azure Region where the Microsoft SQL Server exists.
     * 
     */
    private final String location;
    private final String name;
    private final String resourceGroupName;
    /**
     * @return A list of dropped restorable database IDs on the server.
     * 
     */
    private final List<String> restorableDroppedDatabaseIds;
    /**
     * @return A mapping of tags assigned to this Microsoft SQL Server.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return This servers MS SQL version.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetServerResult(
        @CustomType.Parameter("administratorLogin") String administratorLogin,
        @CustomType.Parameter("fullyQualifiedDomainName") String fullyQualifiedDomainName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identities") List<GetServerIdentity> identities,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("restorableDroppedDatabaseIds") List<String> restorableDroppedDatabaseIds,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("version") String version) {
        this.administratorLogin = administratorLogin;
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
        this.id = id;
        this.identities = identities;
        this.location = location;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.restorableDroppedDatabaseIds = restorableDroppedDatabaseIds;
        this.tags = tags;
        this.version = version;
    }

    /**
     * @return The server&#39;s administrator login name.
     * 
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }
    /**
     * @return The fully qualified domain name of the Azure SQL Server.
     * 
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A `identity` block as defined below.
     * 
     */
    public List<GetServerIdentity> identities() {
        return this.identities;
    }
    /**
     * @return The Azure Region where the Microsoft SQL Server exists.
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
     * @return A list of dropped restorable database IDs on the server.
     * 
     */
    public List<String> restorableDroppedDatabaseIds() {
        return this.restorableDroppedDatabaseIds;
    }
    /**
     * @return A mapping of tags assigned to this Microsoft SQL Server.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return This servers MS SQL version.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String administratorLogin;
        private String fullyQualifiedDomainName;
        private String id;
        private List<GetServerIdentity> identities;
        private String location;
        private String name;
        private String resourceGroupName;
        private List<String> restorableDroppedDatabaseIds;
        private Map<String,String> tags;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.fullyQualifiedDomainName = defaults.fullyQualifiedDomainName;
    	      this.id = defaults.id;
    	      this.identities = defaults.identities;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorableDroppedDatabaseIds = defaults.restorableDroppedDatabaseIds;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder administratorLogin(String administratorLogin) {
            this.administratorLogin = Objects.requireNonNull(administratorLogin);
            return this;
        }
        public Builder fullyQualifiedDomainName(String fullyQualifiedDomainName) {
            this.fullyQualifiedDomainName = Objects.requireNonNull(fullyQualifiedDomainName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identities(List<GetServerIdentity> identities) {
            this.identities = Objects.requireNonNull(identities);
            return this;
        }
        public Builder identities(GetServerIdentity... identities) {
            return identities(List.of(identities));
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
        public Builder restorableDroppedDatabaseIds(List<String> restorableDroppedDatabaseIds) {
            this.restorableDroppedDatabaseIds = Objects.requireNonNull(restorableDroppedDatabaseIds);
            return this;
        }
        public Builder restorableDroppedDatabaseIds(String... restorableDroppedDatabaseIds) {
            return restorableDroppedDatabaseIds(List.of(restorableDroppedDatabaseIds));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetServerResult build() {
            return new GetServerResult(administratorLogin, fullyQualifiedDomainName, id, identities, location, name, resourceGroupName, restorableDroppedDatabaseIds, tags, version);
        }
    }
}
