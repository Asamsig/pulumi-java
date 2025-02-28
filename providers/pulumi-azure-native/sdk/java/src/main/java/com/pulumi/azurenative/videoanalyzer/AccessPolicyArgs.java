// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer;

import com.pulumi.azurenative.videoanalyzer.enums.AccessPolicyRole;
import com.pulumi.azurenative.videoanalyzer.inputs.JwtAuthenticationArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPolicyArgs Empty = new AccessPolicyArgs();

    /**
     * The name of the access policy to create or update.
     * 
     */
    @Import(name="accessPolicyName")
    private @Nullable Output<String> accessPolicyName;

    /**
     * @return The name of the access policy to create or update.
     * 
     */
    public Optional<Output<String>> accessPolicyName() {
        return Optional.ofNullable(this.accessPolicyName);
    }

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The Azure Video Analyzer account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Authentication method to be used when validating client API access.
     * 
     */
    @Import(name="authentication")
    private @Nullable Output<JwtAuthenticationArgs> authentication;

    /**
     * @return Authentication method to be used when validating client API access.
     * 
     */
    public Optional<Output<JwtAuthenticationArgs>> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Defines the access level granted by this policy.
     * 
     */
    @Import(name="role")
    private @Nullable Output<Either<String,AccessPolicyRole>> role;

    /**
     * @return Defines the access level granted by this policy.
     * 
     */
    public Optional<Output<Either<String,AccessPolicyRole>>> role() {
        return Optional.ofNullable(this.role);
    }

    private AccessPolicyArgs() {}

    private AccessPolicyArgs(AccessPolicyArgs $) {
        this.accessPolicyName = $.accessPolicyName;
        this.accountName = $.accountName;
        this.authentication = $.authentication;
        this.resourceGroupName = $.resourceGroupName;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyArgs $;

        public Builder() {
            $ = new AccessPolicyArgs();
        }

        public Builder(AccessPolicyArgs defaults) {
            $ = new AccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicyName The name of the access policy to create or update.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyName(@Nullable Output<String> accessPolicyName) {
            $.accessPolicyName = accessPolicyName;
            return this;
        }

        /**
         * @param accessPolicyName The name of the access policy to create or update.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyName(String accessPolicyName) {
            return accessPolicyName(Output.of(accessPolicyName));
        }

        /**
         * @param accountName The Azure Video Analyzer account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The Azure Video Analyzer account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param authentication Authentication method to be used when validating client API access.
         * 
         * @return builder
         * 
         */
        public Builder authentication(@Nullable Output<JwtAuthenticationArgs> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication Authentication method to be used when validating client API access.
         * 
         * @return builder
         * 
         */
        public Builder authentication(JwtAuthenticationArgs authentication) {
            return authentication(Output.of(authentication));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param role Defines the access level granted by this policy.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<Either<String,AccessPolicyRole>> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Defines the access level granted by this policy.
         * 
         * @return builder
         * 
         */
        public Builder role(Either<String,AccessPolicyRole> role) {
            return role(Output.of(role));
        }

        /**
         * @param role Defines the access level granted by this policy.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Either.ofLeft(role));
        }

        /**
         * @param role Defines the access level granted by this policy.
         * 
         * @return builder
         * 
         */
        public Builder role(AccessPolicyRole role) {
            return role(Either.ofRight(role));
        }

        public AccessPolicyArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
