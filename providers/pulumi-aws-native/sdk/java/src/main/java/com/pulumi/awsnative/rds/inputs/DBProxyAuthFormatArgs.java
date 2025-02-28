// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.rds.inputs;

import com.pulumi.awsnative.rds.enums.DBProxyAuthFormatAuthScheme;
import com.pulumi.awsnative.rds.enums.DBProxyAuthFormatIAMAuth;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DBProxyAuthFormatArgs extends com.pulumi.resources.ResourceArgs {

    public static final DBProxyAuthFormatArgs Empty = new DBProxyAuthFormatArgs();

    /**
     * The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * 
     */
    @Import(name="authScheme")
    private @Nullable Output<DBProxyAuthFormatAuthScheme> authScheme;

    /**
     * @return The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * 
     */
    public Optional<Output<DBProxyAuthFormatAuthScheme>> authScheme() {
        return Optional.ofNullable(this.authScheme);
    }

    /**
     * A user-specified description about the authentication used by a proxy to log in as a specific database user.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A user-specified description about the authentication used by a proxy to log in as a specific database user.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy.
     * 
     */
    @Import(name="iAMAuth")
    private @Nullable Output<DBProxyAuthFormatIAMAuth> iAMAuth;

    /**
     * @return Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy.
     * 
     */
    public Optional<Output<DBProxyAuthFormatIAMAuth>> iAMAuth() {
        return Optional.ofNullable(this.iAMAuth);
    }

    /**
     * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     * 
     */
    @Import(name="secretArn")
    private @Nullable Output<String> secretArn;

    /**
     * @return The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     * 
     */
    public Optional<Output<String>> secretArn() {
        return Optional.ofNullable(this.secretArn);
    }

    /**
     * The name of the database user to which the proxy connects.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return The name of the database user to which the proxy connects.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private DBProxyAuthFormatArgs() {}

    private DBProxyAuthFormatArgs(DBProxyAuthFormatArgs $) {
        this.authScheme = $.authScheme;
        this.description = $.description;
        this.iAMAuth = $.iAMAuth;
        this.secretArn = $.secretArn;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DBProxyAuthFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DBProxyAuthFormatArgs $;

        public Builder() {
            $ = new DBProxyAuthFormatArgs();
        }

        public Builder(DBProxyAuthFormatArgs defaults) {
            $ = new DBProxyAuthFormatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authScheme The type of authentication that the proxy uses for connections from the proxy to the underlying database.
         * 
         * @return builder
         * 
         */
        public Builder authScheme(@Nullable Output<DBProxyAuthFormatAuthScheme> authScheme) {
            $.authScheme = authScheme;
            return this;
        }

        /**
         * @param authScheme The type of authentication that the proxy uses for connections from the proxy to the underlying database.
         * 
         * @return builder
         * 
         */
        public Builder authScheme(DBProxyAuthFormatAuthScheme authScheme) {
            return authScheme(Output.of(authScheme));
        }

        /**
         * @param description A user-specified description about the authentication used by a proxy to log in as a specific database user.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A user-specified description about the authentication used by a proxy to log in as a specific database user.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param iAMAuth Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy.
         * 
         * @return builder
         * 
         */
        public Builder iAMAuth(@Nullable Output<DBProxyAuthFormatIAMAuth> iAMAuth) {
            $.iAMAuth = iAMAuth;
            return this;
        }

        /**
         * @param iAMAuth Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy.
         * 
         * @return builder
         * 
         */
        public Builder iAMAuth(DBProxyAuthFormatIAMAuth iAMAuth) {
            return iAMAuth(Output.of(iAMAuth));
        }

        /**
         * @param secretArn The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
         * 
         * @return builder
         * 
         */
        public Builder secretArn(@Nullable Output<String> secretArn) {
            $.secretArn = secretArn;
            return this;
        }

        /**
         * @param secretArn The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
         * 
         * @return builder
         * 
         */
        public Builder secretArn(String secretArn) {
            return secretArn(Output.of(secretArn));
        }

        /**
         * @param userName The name of the database user to which the proxy connects.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The name of the database user to which the proxy connects.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public DBProxyAuthFormatArgs build() {
            return $;
        }
    }

}
