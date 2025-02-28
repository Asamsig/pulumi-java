// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.acmpca;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PermissionArgs Empty = new PermissionArgs();

    /**
     * The actions that the specified AWS service principal can use. Actions IssueCertificate, GetCertificate and ListPermissions must be provided.
     * 
     */
    @Import(name="actions", required=true)
    private Output<List<String>> actions;

    /**
     * @return The actions that the specified AWS service principal can use. Actions IssueCertificate, GetCertificate and ListPermissions must be provided.
     * 
     */
    public Output<List<String>> actions() {
        return this.actions;
    }

    /**
     * The Amazon Resource Name (ARN) of the Private Certificate Authority that grants the permission.
     * 
     */
    @Import(name="certificateAuthorityArn", required=true)
    private Output<String> certificateAuthorityArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Private Certificate Authority that grants the permission.
     * 
     */
    public Output<String> certificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * The AWS service or identity that receives the permission. At this time, the only valid principal is acm.amazonaws.com.
     * 
     */
    @Import(name="principal", required=true)
    private Output<String> principal;

    /**
     * @return The AWS service or identity that receives the permission. At this time, the only valid principal is acm.amazonaws.com.
     * 
     */
    public Output<String> principal() {
        return this.principal;
    }

    /**
     * The ID of the calling account.
     * 
     */
    @Import(name="sourceAccount")
    private @Nullable Output<String> sourceAccount;

    /**
     * @return The ID of the calling account.
     * 
     */
    public Optional<Output<String>> sourceAccount() {
        return Optional.ofNullable(this.sourceAccount);
    }

    private PermissionArgs() {}

    private PermissionArgs(PermissionArgs $) {
        this.actions = $.actions;
        this.certificateAuthorityArn = $.certificateAuthorityArn;
        this.principal = $.principal;
        this.sourceAccount = $.sourceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PermissionArgs $;

        public Builder() {
            $ = new PermissionArgs();
        }

        public Builder(PermissionArgs defaults) {
            $ = new PermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions The actions that the specified AWS service principal can use. Actions IssueCertificate, GetCertificate and ListPermissions must be provided.
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<List<String>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions The actions that the specified AWS service principal can use. Actions IssueCertificate, GetCertificate and ListPermissions must be provided.
         * 
         * @return builder
         * 
         */
        public Builder actions(List<String> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions The actions that the specified AWS service principal can use. Actions IssueCertificate, GetCertificate and ListPermissions must be provided.
         * 
         * @return builder
         * 
         */
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        /**
         * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the Private Certificate Authority that grants the permission.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityArn(Output<String> certificateAuthorityArn) {
            $.certificateAuthorityArn = certificateAuthorityArn;
            return this;
        }

        /**
         * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the Private Certificate Authority that grants the permission.
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityArn(String certificateAuthorityArn) {
            return certificateAuthorityArn(Output.of(certificateAuthorityArn));
        }

        /**
         * @param principal The AWS service or identity that receives the permission. At this time, the only valid principal is acm.amazonaws.com.
         * 
         * @return builder
         * 
         */
        public Builder principal(Output<String> principal) {
            $.principal = principal;
            return this;
        }

        /**
         * @param principal The AWS service or identity that receives the permission. At this time, the only valid principal is acm.amazonaws.com.
         * 
         * @return builder
         * 
         */
        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        /**
         * @param sourceAccount The ID of the calling account.
         * 
         * @return builder
         * 
         */
        public Builder sourceAccount(@Nullable Output<String> sourceAccount) {
            $.sourceAccount = sourceAccount;
            return this;
        }

        /**
         * @param sourceAccount The ID of the calling account.
         * 
         * @return builder
         * 
         */
        public Builder sourceAccount(String sourceAccount) {
            return sourceAccount(Output.of(sourceAccount));
        }

        public PermissionArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            $.certificateAuthorityArn = Objects.requireNonNull($.certificateAuthorityArn, "expected parameter 'certificateAuthorityArn' to be non-null");
            $.principal = Objects.requireNonNull($.principal, "expected parameter 'principal' to be non-null");
            return $;
        }
    }

}
