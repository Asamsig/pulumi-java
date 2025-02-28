// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement_v1.inputs.AuthRequirementArgs;
import com.pulumi.googlenative.servicemanagement_v1.inputs.OAuthRequirementsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Authentication rules for the service. By default, if a method has any authentication requirements, every request must include a valid credential matching one of the requirements. It&#39;s an error to include more than one kind of credential in a single request. If a method doesn&#39;t have any auth requirements, request credentials will be ignored.
 * 
 */
public final class AuthenticationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticationRuleArgs Empty = new AuthenticationRuleArgs();

    /**
     * If true, the service accepts API keys without any other credential. This flag only applies to HTTP and gRPC requests.
     * 
     */
    @Import(name="allowWithoutCredential")
    private @Nullable Output<Boolean> allowWithoutCredential;

    /**
     * @return If true, the service accepts API keys without any other credential. This flag only applies to HTTP and gRPC requests.
     * 
     */
    public Optional<Output<Boolean>> allowWithoutCredential() {
        return Optional.ofNullable(this.allowWithoutCredential);
    }

    /**
     * The requirements for OAuth credentials.
     * 
     */
    @Import(name="oauth")
    private @Nullable Output<OAuthRequirementsArgs> oauth;

    /**
     * @return The requirements for OAuth credentials.
     * 
     */
    public Optional<Output<OAuthRequirementsArgs>> oauth() {
        return Optional.ofNullable(this.oauth);
    }

    /**
     * Requirements for additional authentication providers.
     * 
     */
    @Import(name="requirements")
    private @Nullable Output<List<AuthRequirementArgs>> requirements;

    /**
     * @return Requirements for additional authentication providers.
     * 
     */
    public Optional<Output<List<AuthRequirementArgs>>> requirements() {
        return Optional.ofNullable(this.requirements);
    }

    /**
     * Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<String> selector;

    /**
     * @return Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    public Optional<Output<String>> selector() {
        return Optional.ofNullable(this.selector);
    }

    private AuthenticationRuleArgs() {}

    private AuthenticationRuleArgs(AuthenticationRuleArgs $) {
        this.allowWithoutCredential = $.allowWithoutCredential;
        this.oauth = $.oauth;
        this.requirements = $.requirements;
        this.selector = $.selector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationRuleArgs $;

        public Builder() {
            $ = new AuthenticationRuleArgs();
        }

        public Builder(AuthenticationRuleArgs defaults) {
            $ = new AuthenticationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowWithoutCredential If true, the service accepts API keys without any other credential. This flag only applies to HTTP and gRPC requests.
         * 
         * @return builder
         * 
         */
        public Builder allowWithoutCredential(@Nullable Output<Boolean> allowWithoutCredential) {
            $.allowWithoutCredential = allowWithoutCredential;
            return this;
        }

        /**
         * @param allowWithoutCredential If true, the service accepts API keys without any other credential. This flag only applies to HTTP and gRPC requests.
         * 
         * @return builder
         * 
         */
        public Builder allowWithoutCredential(Boolean allowWithoutCredential) {
            return allowWithoutCredential(Output.of(allowWithoutCredential));
        }

        /**
         * @param oauth The requirements for OAuth credentials.
         * 
         * @return builder
         * 
         */
        public Builder oauth(@Nullable Output<OAuthRequirementsArgs> oauth) {
            $.oauth = oauth;
            return this;
        }

        /**
         * @param oauth The requirements for OAuth credentials.
         * 
         * @return builder
         * 
         */
        public Builder oauth(OAuthRequirementsArgs oauth) {
            return oauth(Output.of(oauth));
        }

        /**
         * @param requirements Requirements for additional authentication providers.
         * 
         * @return builder
         * 
         */
        public Builder requirements(@Nullable Output<List<AuthRequirementArgs>> requirements) {
            $.requirements = requirements;
            return this;
        }

        /**
         * @param requirements Requirements for additional authentication providers.
         * 
         * @return builder
         * 
         */
        public Builder requirements(List<AuthRequirementArgs> requirements) {
            return requirements(Output.of(requirements));
        }

        /**
         * @param requirements Requirements for additional authentication providers.
         * 
         * @return builder
         * 
         */
        public Builder requirements(AuthRequirementArgs... requirements) {
            return requirements(List.of(requirements));
        }

        /**
         * @param selector Selects the methods to which this rule applies. Refer to selector for syntax details.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<String> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector Selects the methods to which this rule applies. Refer to selector for syntax details.
         * 
         * @return builder
         * 
         */
        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        public AuthenticationRuleArgs build() {
            return $;
        }
    }

}
