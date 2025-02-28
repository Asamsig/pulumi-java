// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.memorydb.outputs;

import com.pulumi.awsnative.memorydb.enums.UserAuthenticationModePropertiesType;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthenticationModeProperties {
    /**
     * @return Passwords used for this user account. You can create up to two passwords for each user.
     * 
     */
    private final @Nullable List<String> passwords;
    /**
     * @return Type of authentication strategy for this user.
     * 
     */
    private final @Nullable UserAuthenticationModePropertiesType type;

    @CustomType.Constructor
    private AuthenticationModeProperties(
        @CustomType.Parameter("passwords") @Nullable List<String> passwords,
        @CustomType.Parameter("type") @Nullable UserAuthenticationModePropertiesType type) {
        this.passwords = passwords;
        this.type = type;
    }

    /**
     * @return Passwords used for this user account. You can create up to two passwords for each user.
     * 
     */
    public List<String> passwords() {
        return this.passwords == null ? List.of() : this.passwords;
    }
    /**
     * @return Type of authentication strategy for this user.
     * 
     */
    public Optional<UserAuthenticationModePropertiesType> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationModeProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> passwords;
        private @Nullable UserAuthenticationModePropertiesType type;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationModeProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwords = defaults.passwords;
    	      this.type = defaults.type;
        }

        public Builder passwords(@Nullable List<String> passwords) {
            this.passwords = passwords;
            return this;
        }
        public Builder passwords(String... passwords) {
            return passwords(List.of(passwords));
        }
        public Builder type(@Nullable UserAuthenticationModePropertiesType type) {
            this.type = type;
            return this;
        }        public AuthenticationModeProperties build() {
            return new AuthenticationModeProperties(passwords, type);
        }
    }
}
