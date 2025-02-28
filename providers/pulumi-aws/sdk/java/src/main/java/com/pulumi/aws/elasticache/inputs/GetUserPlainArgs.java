// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserPlainArgs Empty = new GetUserPlainArgs();

    /**
     * A string for what access a user possesses within the associated ElastiCache replication groups or clusters.
     * 
     */
    @Import(name="accessString")
    private @Nullable String accessString;

    /**
     * @return A string for what access a user possesses within the associated ElastiCache replication groups or clusters.
     * 
     */
    public Optional<String> accessString() {
        return Optional.ofNullable(this.accessString);
    }

    @Import(name="engine")
    private @Nullable String engine;

    public Optional<String> engine() {
        return Optional.ofNullable(this.engine);
    }

    @Import(name="noPasswordRequired")
    private @Nullable Boolean noPasswordRequired;

    public Optional<Boolean> noPasswordRequired() {
        return Optional.ofNullable(this.noPasswordRequired);
    }

    @Import(name="passwords")
    private @Nullable List<String> passwords;

    public Optional<List<String>> passwords() {
        return Optional.ofNullable(this.passwords);
    }

    /**
     * The identifier for the user.
     * 
     */
    @Import(name="userId", required=true)
    private String userId;

    /**
     * @return The identifier for the user.
     * 
     */
    public String userId() {
        return this.userId;
    }

    /**
     * The user name of the user.
     * 
     */
    @Import(name="userName")
    private @Nullable String userName;

    /**
     * @return The user name of the user.
     * 
     */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    private GetUserPlainArgs() {}

    private GetUserPlainArgs(GetUserPlainArgs $) {
        this.accessString = $.accessString;
        this.engine = $.engine;
        this.noPasswordRequired = $.noPasswordRequired;
        this.passwords = $.passwords;
        this.userId = $.userId;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserPlainArgs $;

        public Builder() {
            $ = new GetUserPlainArgs();
        }

        public Builder(GetUserPlainArgs defaults) {
            $ = new GetUserPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessString A string for what access a user possesses within the associated ElastiCache replication groups or clusters.
         * 
         * @return builder
         * 
         */
        public Builder accessString(@Nullable String accessString) {
            $.accessString = accessString;
            return this;
        }

        public Builder engine(@Nullable String engine) {
            $.engine = engine;
            return this;
        }

        public Builder noPasswordRequired(@Nullable Boolean noPasswordRequired) {
            $.noPasswordRequired = noPasswordRequired;
            return this;
        }

        public Builder passwords(@Nullable List<String> passwords) {
            $.passwords = passwords;
            return this;
        }

        public Builder passwords(String... passwords) {
            return passwords(List.of(passwords));
        }

        /**
         * @param userId The identifier for the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userName The user name of the user.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable String userName) {
            $.userName = userName;
            return this;
        }

        public GetUserPlainArgs build() {
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
