// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigqueryconnection_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Credential info for the Cloud SQL.
 * 
 */
public final class CloudSqlCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudSqlCredentialArgs Empty = new CloudSqlCredentialArgs();

    /**
     * The password for the credential.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password for the credential.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The username for the credential.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username for the credential.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private CloudSqlCredentialArgs() {}

    private CloudSqlCredentialArgs(CloudSqlCredentialArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudSqlCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudSqlCredentialArgs $;

        public Builder() {
            $ = new CloudSqlCredentialArgs();
        }

        public Builder(CloudSqlCredentialArgs defaults) {
            $ = new CloudSqlCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password for the credential.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for the credential.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username The username for the credential.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username for the credential.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public CloudSqlCredentialArgs build() {
            return $;
        }
    }

}
