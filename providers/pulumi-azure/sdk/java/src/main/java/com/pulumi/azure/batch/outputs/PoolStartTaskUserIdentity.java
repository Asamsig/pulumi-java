// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.azure.batch.outputs.PoolStartTaskUserIdentityAutoUser;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PoolStartTaskUserIdentity {
    /**
     * @return A `auto_user` block that describes the user identity under which the start task runs.
     * 
     */
    private final @Nullable PoolStartTaskUserIdentityAutoUser autoUser;
    /**
     * @return The username to be used by the Batch pool start task.
     * 
     */
    private final @Nullable String userName;

    @CustomType.Constructor
    private PoolStartTaskUserIdentity(
        @CustomType.Parameter("autoUser") @Nullable PoolStartTaskUserIdentityAutoUser autoUser,
        @CustomType.Parameter("userName") @Nullable String userName) {
        this.autoUser = autoUser;
        this.userName = userName;
    }

    /**
     * @return A `auto_user` block that describes the user identity under which the start task runs.
     * 
     */
    public Optional<PoolStartTaskUserIdentityAutoUser> autoUser() {
        return Optional.ofNullable(this.autoUser);
    }
    /**
     * @return The username to be used by the Batch pool start task.
     * 
     */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoolStartTaskUserIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PoolStartTaskUserIdentityAutoUser autoUser;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(PoolStartTaskUserIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUser = defaults.autoUser;
    	      this.userName = defaults.userName;
        }

        public Builder autoUser(@Nullable PoolStartTaskUserIdentityAutoUser autoUser) {
            this.autoUser = autoUser;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }        public PoolStartTaskUserIdentity build() {
            return new PoolStartTaskUserIdentity(autoUser, userName);
        }
    }
}
