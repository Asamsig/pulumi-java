// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub AdmCredential.
 * 
 */
public final class AdmCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdmCredentialArgs Empty = new AdmCredentialArgs();

    /**
     * The URL of the authorization token.
     * 
     */
    @Import(name="authTokenUrl")
    private @Nullable Output<String> authTokenUrl;

    /**
     * @return The URL of the authorization token.
     * 
     */
    public Optional<Output<String>> authTokenUrl() {
        return Optional.ofNullable(this.authTokenUrl);
    }

    /**
     * The client identifier.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The client identifier.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The credential secret access key.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return The credential secret access key.
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    private AdmCredentialArgs() {}

    private AdmCredentialArgs(AdmCredentialArgs $) {
        this.authTokenUrl = $.authTokenUrl;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdmCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdmCredentialArgs $;

        public Builder() {
            $ = new AdmCredentialArgs();
        }

        public Builder(AdmCredentialArgs defaults) {
            $ = new AdmCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authTokenUrl The URL of the authorization token.
         * 
         * @return builder
         * 
         */
        public Builder authTokenUrl(@Nullable Output<String> authTokenUrl) {
            $.authTokenUrl = authTokenUrl;
            return this;
        }

        /**
         * @param authTokenUrl The URL of the authorization token.
         * 
         * @return builder
         * 
         */
        public Builder authTokenUrl(String authTokenUrl) {
            return authTokenUrl(Output.of(authTokenUrl));
        }

        /**
         * @param clientId The client identifier.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The client identifier.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The credential secret access key.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The credential secret access key.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public AdmCredentialArgs build() {
            return $;
        }
    }

}
