// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.azurenative.eventgrid.enums.EventSubscriptionIdentityType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The identity information with the event subscription.
 * 
 */
public final class EventSubscriptionIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionIdentityArgs Empty = new EventSubscriptionIdentityArgs();

    /**
     * The type of managed identity used. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user-assigned identities. The type &#39;None&#39; will remove any identity.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,EventSubscriptionIdentityType>> type;

    /**
     * @return The type of managed identity used. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user-assigned identities. The type &#39;None&#39; will remove any identity.
     * 
     */
    public Optional<Output<Either<String,EventSubscriptionIdentityType>>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The user identity associated with the resource.
     * 
     */
    @Import(name="userAssignedIdentity")
    private @Nullable Output<String> userAssignedIdentity;

    /**
     * @return The user identity associated with the resource.
     * 
     */
    public Optional<Output<String>> userAssignedIdentity() {
        return Optional.ofNullable(this.userAssignedIdentity);
    }

    private EventSubscriptionIdentityArgs() {}

    private EventSubscriptionIdentityArgs(EventSubscriptionIdentityArgs $) {
        this.type = $.type;
        this.userAssignedIdentity = $.userAssignedIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSubscriptionIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSubscriptionIdentityArgs $;

        public Builder() {
            $ = new EventSubscriptionIdentityArgs();
        }

        public Builder(EventSubscriptionIdentityArgs defaults) {
            $ = new EventSubscriptionIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of managed identity used. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user-assigned identities. The type &#39;None&#39; will remove any identity.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,EventSubscriptionIdentityType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of managed identity used. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user-assigned identities. The type &#39;None&#39; will remove any identity.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,EventSubscriptionIdentityType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The type of managed identity used. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user-assigned identities. The type &#39;None&#39; will remove any identity.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The type of managed identity used. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user-assigned identities. The type &#39;None&#39; will remove any identity.
         * 
         * @return builder
         * 
         */
        public Builder type(EventSubscriptionIdentityType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param userAssignedIdentity The user identity associated with the resource.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentity(@Nullable Output<String> userAssignedIdentity) {
            $.userAssignedIdentity = userAssignedIdentity;
            return this;
        }

        /**
         * @param userAssignedIdentity The user identity associated with the resource.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentity(String userAssignedIdentity) {
            return userAssignedIdentity(Output.of(userAssignedIdentity));
        }

        public EventSubscriptionIdentityArgs build() {
            return $;
        }
    }

}
