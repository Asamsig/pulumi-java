// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IncidentOwnerInfoResponse {
    /**
     * @return The name of the user the incident is assigned to.
     * 
     */
    private final @Nullable String assignedTo;
    /**
     * @return The email of the user the incident is assigned to.
     * 
     */
    private final @Nullable String email;
    /**
     * @return The object id of the user the incident is assigned to.
     * 
     */
    private final @Nullable String objectId;
    /**
     * @return The user principal name of the user the incident is assigned to.
     * 
     */
    private final @Nullable String userPrincipalName;

    @CustomType.Constructor
    private IncidentOwnerInfoResponse(
        @CustomType.Parameter("assignedTo") @Nullable String assignedTo,
        @CustomType.Parameter("email") @Nullable String email,
        @CustomType.Parameter("objectId") @Nullable String objectId,
        @CustomType.Parameter("userPrincipalName") @Nullable String userPrincipalName) {
        this.assignedTo = assignedTo;
        this.email = email;
        this.objectId = objectId;
        this.userPrincipalName = userPrincipalName;
    }

    /**
     * @return The name of the user the incident is assigned to.
     * 
     */
    public Optional<String> assignedTo() {
        return Optional.ofNullable(this.assignedTo);
    }
    /**
     * @return The email of the user the incident is assigned to.
     * 
     */
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }
    /**
     * @return The object id of the user the incident is assigned to.
     * 
     */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * @return The user principal name of the user the incident is assigned to.
     * 
     */
    public Optional<String> userPrincipalName() {
        return Optional.ofNullable(this.userPrincipalName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentOwnerInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String assignedTo;
        private @Nullable String email;
        private @Nullable String objectId;
        private @Nullable String userPrincipalName;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentOwnerInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignedTo = defaults.assignedTo;
    	      this.email = defaults.email;
    	      this.objectId = defaults.objectId;
    	      this.userPrincipalName = defaults.userPrincipalName;
        }

        public Builder assignedTo(@Nullable String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        public Builder userPrincipalName(@Nullable String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }        public IncidentOwnerInfoResponse build() {
            return new IncidentOwnerInfoResponse(assignedTo, email, objectId, userPrincipalName);
        }
    }
}
