// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Username and password for basic login authentication.
 * 
 */
public final class BasicLoginInformationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BasicLoginInformationArgs Empty = new BasicLoginInformationArgs();

    /**
     * Login password.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Login password.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Login username.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Login username.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private BasicLoginInformationArgs() {}

    private BasicLoginInformationArgs(BasicLoginInformationArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasicLoginInformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicLoginInformationArgs $;

        public Builder() {
            $ = new BasicLoginInformationArgs();
        }

        public Builder(BasicLoginInformationArgs defaults) {
            $ = new BasicLoginInformationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password Login password.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Login password.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username Login username.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Login username.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public BasicLoginInformationArgs build() {
            return $;
        }
    }

}
