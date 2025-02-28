// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerExternalAdministratorResponse {
    /**
     * @return Type of the sever administrator.
     * 
     */
    private final @Nullable String administratorType;
    /**
     * @return Azure Active Directory only Authentication enabled.
     * 
     */
    private final @Nullable Boolean azureADOnlyAuthentication;
    /**
     * @return Login name of the server administrator.
     * 
     */
    private final @Nullable String login;
    /**
     * @return Principal Type of the sever administrator.
     * 
     */
    private final @Nullable String principalType;
    /**
     * @return SID (object ID) of the server administrator.
     * 
     */
    private final @Nullable String sid;
    /**
     * @return Tenant ID of the administrator.
     * 
     */
    private final @Nullable String tenantId;

    @CustomType.Constructor
    private ServerExternalAdministratorResponse(
        @CustomType.Parameter("administratorType") @Nullable String administratorType,
        @CustomType.Parameter("azureADOnlyAuthentication") @Nullable Boolean azureADOnlyAuthentication,
        @CustomType.Parameter("login") @Nullable String login,
        @CustomType.Parameter("principalType") @Nullable String principalType,
        @CustomType.Parameter("sid") @Nullable String sid,
        @CustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.administratorType = administratorType;
        this.azureADOnlyAuthentication = azureADOnlyAuthentication;
        this.login = login;
        this.principalType = principalType;
        this.sid = sid;
        this.tenantId = tenantId;
    }

    /**
     * @return Type of the sever administrator.
     * 
     */
    public Optional<String> administratorType() {
        return Optional.ofNullable(this.administratorType);
    }
    /**
     * @return Azure Active Directory only Authentication enabled.
     * 
     */
    public Optional<Boolean> azureADOnlyAuthentication() {
        return Optional.ofNullable(this.azureADOnlyAuthentication);
    }
    /**
     * @return Login name of the server administrator.
     * 
     */
    public Optional<String> login() {
        return Optional.ofNullable(this.login);
    }
    /**
     * @return Principal Type of the sever administrator.
     * 
     */
    public Optional<String> principalType() {
        return Optional.ofNullable(this.principalType);
    }
    /**
     * @return SID (object ID) of the server administrator.
     * 
     */
    public Optional<String> sid() {
        return Optional.ofNullable(this.sid);
    }
    /**
     * @return Tenant ID of the administrator.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerExternalAdministratorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String administratorType;
        private @Nullable Boolean azureADOnlyAuthentication;
        private @Nullable String login;
        private @Nullable String principalType;
        private @Nullable String sid;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerExternalAdministratorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.azureADOnlyAuthentication = defaults.azureADOnlyAuthentication;
    	      this.login = defaults.login;
    	      this.principalType = defaults.principalType;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder administratorType(@Nullable String administratorType) {
            this.administratorType = administratorType;
            return this;
        }
        public Builder azureADOnlyAuthentication(@Nullable Boolean azureADOnlyAuthentication) {
            this.azureADOnlyAuthentication = azureADOnlyAuthentication;
            return this;
        }
        public Builder login(@Nullable String login) {
            this.login = login;
            return this;
        }
        public Builder principalType(@Nullable String principalType) {
            this.principalType = principalType;
            return this;
        }
        public Builder sid(@Nullable String sid) {
            this.sid = sid;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }        public ServerExternalAdministratorResponse build() {
            return new ServerExternalAdministratorResponse(administratorType, azureADOnlyAuthentication, login, principalType, sid, tenantId);
        }
    }
}
