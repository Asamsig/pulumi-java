// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.azurenative.automation.enums.ResourceIdentityType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identity for the resource.
 * 
 */
public final class IdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityArgs Empty = new IdentityArgs();

    /**
     * The identity type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<ResourceIdentityType> type;

    /**
     * @return The identity type.
     * 
     */
    public Optional<Output<ResourceIdentityType>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * 
     */
    @Import(name="userAssignedIdentities")
    private @Nullable Output<Map<String,Object>> userAssignedIdentities;

    /**
     * @return The list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
     * 
     */
    public Optional<Output<Map<String,Object>>> userAssignedIdentities() {
        return Optional.ofNullable(this.userAssignedIdentities);
    }

    private IdentityArgs() {}

    private IdentityArgs(IdentityArgs $) {
        this.type = $.type;
        this.userAssignedIdentities = $.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityArgs $;

        public Builder() {
            $ = new IdentityArgs();
        }

        public Builder(IdentityArgs defaults) {
            $ = new IdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The identity type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<ResourceIdentityType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The identity type.
         * 
         * @return builder
         * 
         */
        public Builder type(ResourceIdentityType type) {
            return type(Output.of(type));
        }

        /**
         * @param userAssignedIdentities The list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(@Nullable Output<Map<String,Object>> userAssignedIdentities) {
            $.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        /**
         * @param userAssignedIdentities The list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}&#39;.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(Map<String,Object> userAssignedIdentities) {
            return userAssignedIdentities(Output.of(userAssignedIdentities));
        }

        public IdentityArgs build() {
            return $;
        }
    }

}
