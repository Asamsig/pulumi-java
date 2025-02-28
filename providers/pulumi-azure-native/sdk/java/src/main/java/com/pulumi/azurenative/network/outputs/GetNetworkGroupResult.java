// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.GroupMembersItemResponse;
import com.pulumi.azurenative.network.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkGroupResult {
    /**
     * @return Network group conditional filter.
     * 
     */
    private final @Nullable String conditionalMembership;
    /**
     * @return A description of the network group.
     * 
     */
    private final @Nullable String description;
    /**
     * @return A friendly name for the network group.
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return Group members of network group.
     * 
     */
    private final @Nullable List<GroupMembersItemResponse> groupMembers;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Group member type.
     * 
     */
    private final @Nullable String memberType;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The provisioning state of the scope assignment resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return The system metadata related to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetNetworkGroupResult(
        @CustomType.Parameter("conditionalMembership") @Nullable String conditionalMembership,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("groupMembers") @Nullable List<GroupMembersItemResponse> groupMembers,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("memberType") @Nullable String memberType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.conditionalMembership = conditionalMembership;
        this.description = description;
        this.displayName = displayName;
        this.etag = etag;
        this.groupMembers = groupMembers;
        this.id = id;
        this.memberType = memberType;
        this.name = name;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return Network group conditional filter.
     * 
     */
    public Optional<String> conditionalMembership() {
        return Optional.ofNullable(this.conditionalMembership);
    }
    /**
     * @return A description of the network group.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return A friendly name for the network group.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Group members of network group.
     * 
     */
    public List<GroupMembersItemResponse> groupMembers() {
        return this.groupMembers == null ? List.of() : this.groupMembers;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Group member type.
     * 
     */
    public Optional<String> memberType() {
        return Optional.ofNullable(this.memberType);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The provisioning state of the scope assignment resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The system metadata related to this resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
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

    public static Builder builder(GetNetworkGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String conditionalMembership;
        private @Nullable String description;
        private @Nullable String displayName;
        private String etag;
        private @Nullable List<GroupMembersItemResponse> groupMembers;
        private String id;
        private @Nullable String memberType;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionalMembership = defaults.conditionalMembership;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.groupMembers = defaults.groupMembers;
    	      this.id = defaults.id;
    	      this.memberType = defaults.memberType;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder conditionalMembership(@Nullable String conditionalMembership) {
            this.conditionalMembership = conditionalMembership;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder groupMembers(@Nullable List<GroupMembersItemResponse> groupMembers) {
            this.groupMembers = groupMembers;
            return this;
        }
        public Builder groupMembers(GroupMembersItemResponse... groupMembers) {
            return groupMembers(List.of(groupMembers));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder memberType(@Nullable String memberType) {
            this.memberType = memberType;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetNetworkGroupResult build() {
            return new GetNetworkGroupResult(conditionalMembership, description, displayName, etag, groupMembers, id, memberType, name, provisioningState, systemData, type);
        }
    }
}
