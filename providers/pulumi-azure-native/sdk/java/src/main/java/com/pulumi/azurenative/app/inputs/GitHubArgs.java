// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.inputs;

import com.pulumi.azurenative.app.inputs.ClientRegistrationArgs;
import com.pulumi.azurenative.app.inputs.LoginScopesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of the GitHub provider.
 * 
 */
public final class GitHubArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitHubArgs Empty = new GitHubArgs();

    /**
     * &lt;code&gt;false&lt;/code&gt; if the GitHub provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the GitHub provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The configuration settings of the login flow.
     * 
     */
    @Import(name="login")
    private @Nullable Output<LoginScopesArgs> login;

    /**
     * @return The configuration settings of the login flow.
     * 
     */
    public Optional<Output<LoginScopesArgs>> login() {
        return Optional.ofNullable(this.login);
    }

    /**
     * The configuration settings of the app registration for the GitHub provider.
     * 
     */
    @Import(name="registration")
    private @Nullable Output<ClientRegistrationArgs> registration;

    /**
     * @return The configuration settings of the app registration for the GitHub provider.
     * 
     */
    public Optional<Output<ClientRegistrationArgs>> registration() {
        return Optional.ofNullable(this.registration);
    }

    private GitHubArgs() {}

    private GitHubArgs(GitHubArgs $) {
        this.enabled = $.enabled;
        this.login = $.login;
        this.registration = $.registration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitHubArgs $;

        public Builder() {
            $ = new GitHubArgs();
        }

        public Builder(GitHubArgs defaults) {
            $ = new GitHubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled &lt;code&gt;false&lt;/code&gt; if the GitHub provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled &lt;code&gt;false&lt;/code&gt; if the GitHub provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param login The configuration settings of the login flow.
         * 
         * @return builder
         * 
         */
        public Builder login(@Nullable Output<LoginScopesArgs> login) {
            $.login = login;
            return this;
        }

        /**
         * @param login The configuration settings of the login flow.
         * 
         * @return builder
         * 
         */
        public Builder login(LoginScopesArgs login) {
            return login(Output.of(login));
        }

        /**
         * @param registration The configuration settings of the app registration for the GitHub provider.
         * 
         * @return builder
         * 
         */
        public Builder registration(@Nullable Output<ClientRegistrationArgs> registration) {
            $.registration = registration;
            return this;
        }

        /**
         * @param registration The configuration settings of the app registration for the GitHub provider.
         * 
         * @return builder
         * 
         */
        public Builder registration(ClientRegistrationArgs registration) {
            return registration(Output.of(registration));
        }

        public GitHubArgs build() {
            return $;
        }
    }

}
