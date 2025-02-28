// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.apimanagement.enums.AppType;
import com.pulumi.azurenative.apimanagement.enums.Confirmation;
import com.pulumi.azurenative.apimanagement.enums.UserState;
import com.pulumi.azurenative.apimanagement.inputs.UserIdentityContractArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * Determines the type of application which send the create user request. Default is legacy portal.
     * 
     */
    @Import(name="appType")
    private @Nullable Output<Either<String,AppType>> appType;

    /**
     * @return Determines the type of application which send the create user request. Default is legacy portal.
     * 
     */
    public Optional<Output<Either<String,AppType>>> appType() {
        return Optional.ofNullable(this.appType);
    }

    /**
     * Determines the type of confirmation e-mail that will be sent to the newly created user.
     * 
     */
    @Import(name="confirmation")
    private @Nullable Output<Either<String,Confirmation>> confirmation;

    /**
     * @return Determines the type of confirmation e-mail that will be sent to the newly created user.
     * 
     */
    public Optional<Output<Either<String,Confirmation>>> confirmation() {
        return Optional.ofNullable(this.confirmation);
    }

    /**
     * Email address. Must not be empty and must be unique within the service instance.
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return Email address. Must not be empty and must be unique within the service instance.
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    /**
     * First name.
     * 
     */
    @Import(name="firstName", required=true)
    private Output<String> firstName;

    /**
     * @return First name.
     * 
     */
    public Output<String> firstName() {
        return this.firstName;
    }

    /**
     * Collection of user identities.
     * 
     */
    @Import(name="identities")
    private @Nullable Output<List<UserIdentityContractArgs>> identities;

    /**
     * @return Collection of user identities.
     * 
     */
    public Optional<Output<List<UserIdentityContractArgs>>> identities() {
        return Optional.ofNullable(this.identities);
    }

    /**
     * Last name.
     * 
     */
    @Import(name="lastName", required=true)
    private Output<String> lastName;

    /**
     * @return Last name.
     * 
     */
    public Output<String> lastName() {
        return this.lastName;
    }

    /**
     * Optional note about a user set by the administrator.
     * 
     */
    @Import(name="note")
    private @Nullable Output<String> note;

    /**
     * @return Optional note about a user set by the administrator.
     * 
     */
    public Optional<Output<String>> note() {
        return Optional.ofNullable(this.note);
    }

    /**
     * Send an Email notification to the User.
     * 
     */
    @Import(name="notify")
    private @Nullable Output<Boolean> notify;

    /**
     * @return Send an Email notification to the User.
     * 
     */
    public Optional<Output<Boolean>> notify_() {
        return Optional.ofNullable(this.notify);
    }

    /**
     * User Password. If no value is provided, a default password is generated.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return User Password. If no value is provided, a default password is generated.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active.
     * 
     */
    @Import(name="state")
    private @Nullable Output<Either<String,UserState>> state;

    /**
     * @return Account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active.
     * 
     */
    public Optional<Output<Either<String,UserState>>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * User identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return User identifier. Must be unique in the current API Management service instance.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private UserArgs() {}

    private UserArgs(UserArgs $) {
        this.appType = $.appType;
        this.confirmation = $.confirmation;
        this.email = $.email;
        this.firstName = $.firstName;
        this.identities = $.identities;
        this.lastName = $.lastName;
        this.note = $.note;
        this.notify = $.notify;
        this.password = $.password;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.state = $.state;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserArgs $;

        public Builder() {
            $ = new UserArgs();
        }

        public Builder(UserArgs defaults) {
            $ = new UserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appType Determines the type of application which send the create user request. Default is legacy portal.
         * 
         * @return builder
         * 
         */
        public Builder appType(@Nullable Output<Either<String,AppType>> appType) {
            $.appType = appType;
            return this;
        }

        /**
         * @param appType Determines the type of application which send the create user request. Default is legacy portal.
         * 
         * @return builder
         * 
         */
        public Builder appType(Either<String,AppType> appType) {
            return appType(Output.of(appType));
        }

        /**
         * @param appType Determines the type of application which send the create user request. Default is legacy portal.
         * 
         * @return builder
         * 
         */
        public Builder appType(String appType) {
            return appType(Either.ofLeft(appType));
        }

        /**
         * @param appType Determines the type of application which send the create user request. Default is legacy portal.
         * 
         * @return builder
         * 
         */
        public Builder appType(AppType appType) {
            return appType(Either.ofRight(appType));
        }

        /**
         * @param confirmation Determines the type of confirmation e-mail that will be sent to the newly created user.
         * 
         * @return builder
         * 
         */
        public Builder confirmation(@Nullable Output<Either<String,Confirmation>> confirmation) {
            $.confirmation = confirmation;
            return this;
        }

        /**
         * @param confirmation Determines the type of confirmation e-mail that will be sent to the newly created user.
         * 
         * @return builder
         * 
         */
        public Builder confirmation(Either<String,Confirmation> confirmation) {
            return confirmation(Output.of(confirmation));
        }

        /**
         * @param confirmation Determines the type of confirmation e-mail that will be sent to the newly created user.
         * 
         * @return builder
         * 
         */
        public Builder confirmation(String confirmation) {
            return confirmation(Either.ofLeft(confirmation));
        }

        /**
         * @param confirmation Determines the type of confirmation e-mail that will be sent to the newly created user.
         * 
         * @return builder
         * 
         */
        public Builder confirmation(Confirmation confirmation) {
            return confirmation(Either.ofRight(confirmation));
        }

        /**
         * @param email Email address. Must not be empty and must be unique within the service instance.
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Email address. Must not be empty and must be unique within the service instance.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param firstName First name.
         * 
         * @return builder
         * 
         */
        public Builder firstName(Output<String> firstName) {
            $.firstName = firstName;
            return this;
        }

        /**
         * @param firstName First name.
         * 
         * @return builder
         * 
         */
        public Builder firstName(String firstName) {
            return firstName(Output.of(firstName));
        }

        /**
         * @param identities Collection of user identities.
         * 
         * @return builder
         * 
         */
        public Builder identities(@Nullable Output<List<UserIdentityContractArgs>> identities) {
            $.identities = identities;
            return this;
        }

        /**
         * @param identities Collection of user identities.
         * 
         * @return builder
         * 
         */
        public Builder identities(List<UserIdentityContractArgs> identities) {
            return identities(Output.of(identities));
        }

        /**
         * @param identities Collection of user identities.
         * 
         * @return builder
         * 
         */
        public Builder identities(UserIdentityContractArgs... identities) {
            return identities(List.of(identities));
        }

        /**
         * @param lastName Last name.
         * 
         * @return builder
         * 
         */
        public Builder lastName(Output<String> lastName) {
            $.lastName = lastName;
            return this;
        }

        /**
         * @param lastName Last name.
         * 
         * @return builder
         * 
         */
        public Builder lastName(String lastName) {
            return lastName(Output.of(lastName));
        }

        /**
         * @param note Optional note about a user set by the administrator.
         * 
         * @return builder
         * 
         */
        public Builder note(@Nullable Output<String> note) {
            $.note = note;
            return this;
        }

        /**
         * @param note Optional note about a user set by the administrator.
         * 
         * @return builder
         * 
         */
        public Builder note(String note) {
            return note(Output.of(note));
        }

        /**
         * @param notify Send an Email notification to the User.
         * 
         * @return builder
         * 
         */
        public Builder notify_(@Nullable Output<Boolean> notify) {
            $.notify = notify;
            return this;
        }

        /**
         * @param notify Send an Email notification to the User.
         * 
         * @return builder
         * 
         */
        public Builder notify_(Boolean notify) {
            return notify_(Output.of(notify));
        }

        /**
         * @param password User Password. If no value is provided, a default password is generated.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password User Password. If no value is provided, a default password is generated.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param state Account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<Either<String,UserState>> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active.
         * 
         * @return builder
         * 
         */
        public Builder state(Either<String,UserState> state) {
            return state(Output.of(state));
        }

        /**
         * @param state Account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Either.ofLeft(state));
        }

        /**
         * @param state Account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active.
         * 
         * @return builder
         * 
         */
        public Builder state(UserState state) {
            return state(Either.ofRight(state));
        }

        /**
         * @param userId User identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId User identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UserArgs build() {
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            $.firstName = Objects.requireNonNull($.firstName, "expected parameter 'firstName' to be non-null");
            $.lastName = Objects.requireNonNull($.lastName, "expected parameter 'lastName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.state = Codegen.stringProp("state").left(UserState.class).output().arg($.state).def("active").getNullable();
            return $;
        }
    }

}
