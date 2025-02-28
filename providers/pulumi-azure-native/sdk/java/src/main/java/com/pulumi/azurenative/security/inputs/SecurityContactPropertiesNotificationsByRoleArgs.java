// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.enums.Roles;
import com.pulumi.azurenative.security.enums.State;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines whether to send email notifications from Microsoft Defender for Cloud to persons with specific RBAC roles on the subscription.
 * 
 */
public final class SecurityContactPropertiesNotificationsByRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityContactPropertiesNotificationsByRoleArgs Empty = new SecurityContactPropertiesNotificationsByRoleArgs();

    /**
     * Defines which RBAC roles will get email notifications from Microsoft Defender for Cloud. List of allowed RBAC roles:
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<Either<String,Roles>>> roles;

    /**
     * @return Defines which RBAC roles will get email notifications from Microsoft Defender for Cloud. List of allowed RBAC roles:
     * 
     */
    public Optional<Output<List<Either<String,Roles>>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * Defines whether to send email notifications from AMicrosoft Defender for Cloud to persons with specific RBAC roles on the subscription.
     * 
     */
    @Import(name="state")
    private @Nullable Output<Either<String,State>> state;

    /**
     * @return Defines whether to send email notifications from AMicrosoft Defender for Cloud to persons with specific RBAC roles on the subscription.
     * 
     */
    public Optional<Output<Either<String,State>>> state() {
        return Optional.ofNullable(this.state);
    }

    private SecurityContactPropertiesNotificationsByRoleArgs() {}

    private SecurityContactPropertiesNotificationsByRoleArgs(SecurityContactPropertiesNotificationsByRoleArgs $) {
        this.roles = $.roles;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityContactPropertiesNotificationsByRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityContactPropertiesNotificationsByRoleArgs $;

        public Builder() {
            $ = new SecurityContactPropertiesNotificationsByRoleArgs();
        }

        public Builder(SecurityContactPropertiesNotificationsByRoleArgs defaults) {
            $ = new SecurityContactPropertiesNotificationsByRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param roles Defines which RBAC roles will get email notifications from Microsoft Defender for Cloud. List of allowed RBAC roles:
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<Either<String,Roles>>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles Defines which RBAC roles will get email notifications from Microsoft Defender for Cloud. List of allowed RBAC roles:
         * 
         * @return builder
         * 
         */
        public Builder roles(List<Either<String,Roles>> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles Defines which RBAC roles will get email notifications from Microsoft Defender for Cloud. List of allowed RBAC roles:
         * 
         * @return builder
         * 
         */
        public Builder roles(Either<String,Roles>... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param state Defines whether to send email notifications from AMicrosoft Defender for Cloud to persons with specific RBAC roles on the subscription.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<Either<String,State>> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Defines whether to send email notifications from AMicrosoft Defender for Cloud to persons with specific RBAC roles on the subscription.
         * 
         * @return builder
         * 
         */
        public Builder state(Either<String,State> state) {
            return state(Output.of(state));
        }

        /**
         * @param state Defines whether to send email notifications from AMicrosoft Defender for Cloud to persons with specific RBAC roles on the subscription.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Either.ofLeft(state));
        }

        /**
         * @param state Defines whether to send email notifications from AMicrosoft Defender for Cloud to persons with specific RBAC roles on the subscription.
         * 
         * @return builder
         * 
         */
        public Builder state(State state) {
            return state(Either.ofRight(state));
        }

        public SecurityContactPropertiesNotificationsByRoleArgs build() {
            return $;
        }
    }

}
