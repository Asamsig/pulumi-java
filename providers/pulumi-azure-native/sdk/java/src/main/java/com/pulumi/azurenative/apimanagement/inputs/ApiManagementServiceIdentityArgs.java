// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.enums.ApimIdentityType;
import com.pulumi.azurenative.apimanagement.inputs.UserIdentityPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identity properties of the Api Management service resource.
 * 
 */
public final class ApiManagementServiceIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiManagementServiceIdentityArgs Empty = new ApiManagementServiceIdentityArgs();

    /**
     * The type of identity used for the resource. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user assigned identities. The type &#39;None&#39; will remove any identities from the service.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ApimIdentityType>> type;

    /**
     * @return The type of identity used for the resource. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user assigned identities. The type &#39;None&#39; will remove any identities from the service.
     * 
     */
    public Output<Either<String,ApimIdentityType>> type() {
        return this.type;
    }

    /**
     * The list of user identities associated with the resource. The user identity
     * dictionary key references will be ARM resource ids in the form:
     * &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/
     *     providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * 
     */
    @Import(name="userAssignedIdentities")
    private @Nullable Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities;

    /**
     * @return The list of user identities associated with the resource. The user identity
     * dictionary key references will be ARM resource ids in the form:
     * &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/
     *     providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * 
     */
    public Optional<Output<Map<String,UserIdentityPropertiesArgs>>> userAssignedIdentities() {
        return Optional.ofNullable(this.userAssignedIdentities);
    }

    private ApiManagementServiceIdentityArgs() {}

    private ApiManagementServiceIdentityArgs(ApiManagementServiceIdentityArgs $) {
        this.type = $.type;
        this.userAssignedIdentities = $.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiManagementServiceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiManagementServiceIdentityArgs $;

        public Builder() {
            $ = new ApiManagementServiceIdentityArgs();
        }

        public Builder(ApiManagementServiceIdentityArgs defaults) {
            $ = new ApiManagementServiceIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of identity used for the resource. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user assigned identities. The type &#39;None&#39; will remove any identities from the service.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<Either<String,ApimIdentityType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of identity used for the resource. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user assigned identities. The type &#39;None&#39; will remove any identities from the service.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ApimIdentityType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The type of identity used for the resource. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user assigned identities. The type &#39;None&#39; will remove any identities from the service.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The type of identity used for the resource. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user assigned identities. The type &#39;None&#39; will remove any identities from the service.
         * 
         * @return builder
         * 
         */
        public Builder type(ApimIdentityType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param userAssignedIdentities The list of user identities associated with the resource. The user identity
         * dictionary key references will be ARM resource ids in the form:
         * &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/
         *     providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(@Nullable Output<Map<String,UserIdentityPropertiesArgs>> userAssignedIdentities) {
            $.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        /**
         * @param userAssignedIdentities The list of user identities associated with the resource. The user identity
         * dictionary key references will be ARM resource ids in the form:
         * &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/
         *     providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(Map<String,UserIdentityPropertiesArgs> userAssignedIdentities) {
            return userAssignedIdentities(Output.of(userAssignedIdentities));
        }

        public ApiManagementServiceIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
