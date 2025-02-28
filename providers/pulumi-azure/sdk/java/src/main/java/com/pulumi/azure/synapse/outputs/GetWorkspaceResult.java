// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse.outputs;

import com.pulumi.azure.synapse.outputs.GetWorkspaceIdentity;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetWorkspaceResult {
    /**
     * @return A list of Connectivity endpoints for this Synapse Workspace.
     * 
     */
    private final Map<String,String> connectivityEndpoints;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return An `identity` block as defined below, which contains the Managed Service Identity information for this Synapse Workspace.
     * 
     */
    private final List<GetWorkspaceIdentity> identities;
    /**
     * @return The Azure location where the Synapse Workspace exists.
     * 
     */
    private final String location;
    private final String name;
    private final String resourceGroupName;
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetWorkspaceResult(
        @CustomType.Parameter("connectivityEndpoints") Map<String,String> connectivityEndpoints,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identities") List<GetWorkspaceIdentity> identities,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.connectivityEndpoints = connectivityEndpoints;
        this.id = id;
        this.identities = identities;
        this.location = location;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.tags = tags;
    }

    /**
     * @return A list of Connectivity endpoints for this Synapse Workspace.
     * 
     */
    public Map<String,String> connectivityEndpoints() {
        return this.connectivityEndpoints;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return An `identity` block as defined below, which contains the Managed Service Identity information for this Synapse Workspace.
     * 
     */
    public List<GetWorkspaceIdentity> identities() {
        return this.identities;
    }
    /**
     * @return The Azure location where the Synapse Workspace exists.
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
     * @return A mapping of tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> connectivityEndpoints;
        private String id;
        private List<GetWorkspaceIdentity> identities;
        private String location;
        private String name;
        private String resourceGroupName;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectivityEndpoints = defaults.connectivityEndpoints;
    	      this.id = defaults.id;
    	      this.identities = defaults.identities;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder connectivityEndpoints(Map<String,String> connectivityEndpoints) {
            this.connectivityEndpoints = Objects.requireNonNull(connectivityEndpoints);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identities(List<GetWorkspaceIdentity> identities) {
            this.identities = Objects.requireNonNull(identities);
            return this;
        }
        public Builder identities(GetWorkspaceIdentity... identities) {
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
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetWorkspaceResult build() {
            return new GetWorkspaceResult(connectivityEndpoints, id, identities, location, name, resourceGroupName, tags);
        }
    }
}
