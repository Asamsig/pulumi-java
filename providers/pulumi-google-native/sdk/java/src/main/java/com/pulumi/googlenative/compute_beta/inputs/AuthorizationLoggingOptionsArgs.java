// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.AuthorizationLoggingOptionsPermissionType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class AuthorizationLoggingOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorizationLoggingOptionsArgs Empty = new AuthorizationLoggingOptionsArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="permissionType")
    private @Nullable Output<AuthorizationLoggingOptionsPermissionType> permissionType;

    /**
     * @return This is deprecated and has no effect. Do not use.
     * 
     */
    public Optional<Output<AuthorizationLoggingOptionsPermissionType>> permissionType() {
        return Optional.ofNullable(this.permissionType);
    }

    private AuthorizationLoggingOptionsArgs() {}

    private AuthorizationLoggingOptionsArgs(AuthorizationLoggingOptionsArgs $) {
        this.permissionType = $.permissionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorizationLoggingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorizationLoggingOptionsArgs $;

        public Builder() {
            $ = new AuthorizationLoggingOptionsArgs();
        }

        public Builder(AuthorizationLoggingOptionsArgs defaults) {
            $ = new AuthorizationLoggingOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param permissionType This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder permissionType(@Nullable Output<AuthorizationLoggingOptionsPermissionType> permissionType) {
            $.permissionType = permissionType;
            return this;
        }

        /**
         * @param permissionType This is deprecated and has no effect. Do not use.
         * 
         * @return builder
         * 
         */
        public Builder permissionType(AuthorizationLoggingOptionsPermissionType permissionType) {
            return permissionType(Output.of(permissionType));
        }

        public AuthorizationLoggingOptionsArgs build() {
            return $;
        }
    }

}
