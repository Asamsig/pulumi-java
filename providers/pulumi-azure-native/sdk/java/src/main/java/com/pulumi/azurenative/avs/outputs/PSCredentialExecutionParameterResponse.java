// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PSCredentialExecutionParameterResponse {
    /**
     * @return The parameter name
     * 
     */
    private final String name;
    /**
     * @return password for login
     * 
     */
    private final @Nullable String password;
    /**
     * @return The type of execution parameter
     * Expected value is &#39;Credential&#39;.
     * 
     */
    private final String type;
    /**
     * @return username for login
     * 
     */
    private final @Nullable String username;

    @CustomType.Constructor
    private PSCredentialExecutionParameterResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("username") @Nullable String username) {
        this.name = name;
        this.password = password;
        this.type = type;
        this.username = username;
    }

    /**
     * @return The parameter name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return password for login
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return The type of execution parameter
     * Expected value is &#39;Credential&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return username for login
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PSCredentialExecutionParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String password;
        private String type;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(PSCredentialExecutionParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public PSCredentialExecutionParameterResponse build() {
            return new PSCredentialExecutionParameterResponse(name, password, type, username);
        }
    }
}
