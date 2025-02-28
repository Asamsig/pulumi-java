// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAdministrativeUnitResult {
    /**
     * @return The description of the administrative unit.
     * 
     */
    private final String description;
    /**
     * @return The display name of the administrative unit.
     * 
     */
    private final String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of object IDs of members who are present in this administrative unit.
     * 
     */
    private final List<String> members;
    /**
     * @return The object ID of the administrative unit.
     * 
     */
    private final String objectId;
    /**
     * @return Whether the administrative unit _and_ its members are hidden or publicly viewable in the directory. One of: `Hiddenmembership` or `Public`.
     * 
     */
    private final String visibility;

    @CustomType.Constructor
    private GetAdministrativeUnitResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("members") List<String> members,
        @CustomType.Parameter("objectId") String objectId,
        @CustomType.Parameter("visibility") String visibility) {
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.members = members;
        this.objectId = objectId;
        this.visibility = visibility;
    }

    /**
     * @return The description of the administrative unit.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The display name of the administrative unit.
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
     * @return A list of object IDs of members who are present in this administrative unit.
     * 
     */
    public List<String> members() {
        return this.members;
    }
    /**
     * @return The object ID of the administrative unit.
     * 
     */
    public String objectId() {
        return this.objectId;
    }
    /**
     * @return Whether the administrative unit _and_ its members are hidden or publicly viewable in the directory. One of: `Hiddenmembership` or `Public`.
     * 
     */
    public String visibility() {
        return this.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdministrativeUnitResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private String id;
        private List<String> members;
        private String objectId;
        private String visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAdministrativeUnitResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.members = defaults.members;
    	      this.objectId = defaults.objectId;
    	      this.visibility = defaults.visibility;
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
        public Builder members(List<String> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder objectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public Builder visibility(String visibility) {
            this.visibility = Objects.requireNonNull(visibility);
            return this;
        }        public GetAdministrativeUnitResult build() {
            return new GetAdministrativeUnitResult(description, displayName, id, members, objectId, visibility);
        }
    }
}
