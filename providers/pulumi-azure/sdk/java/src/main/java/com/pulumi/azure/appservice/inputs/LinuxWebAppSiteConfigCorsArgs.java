// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinuxWebAppSiteConfigCorsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxWebAppSiteConfigCorsArgs Empty = new LinuxWebAppSiteConfigCorsArgs();

    /**
     * Specifies a list of origins that should be allowed to make cross-origin calls.
     * 
     */
    @Import(name="allowedOrigins", required=true)
    private Output<List<String>> allowedOrigins;

    /**
     * @return Specifies a list of origins that should be allowed to make cross-origin calls.
     * 
     */
    public Output<List<String>> allowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Whether CORS requests with credentials are allowed. Defaults to `false`
     * 
     */
    @Import(name="supportCredentials")
    private @Nullable Output<Boolean> supportCredentials;

    /**
     * @return Whether CORS requests with credentials are allowed. Defaults to `false`
     * 
     */
    public Optional<Output<Boolean>> supportCredentials() {
        return Optional.ofNullable(this.supportCredentials);
    }

    private LinuxWebAppSiteConfigCorsArgs() {}

    private LinuxWebAppSiteConfigCorsArgs(LinuxWebAppSiteConfigCorsArgs $) {
        this.allowedOrigins = $.allowedOrigins;
        this.supportCredentials = $.supportCredentials;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxWebAppSiteConfigCorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxWebAppSiteConfigCorsArgs $;

        public Builder() {
            $ = new LinuxWebAppSiteConfigCorsArgs();
        }

        public Builder(LinuxWebAppSiteConfigCorsArgs defaults) {
            $ = new LinuxWebAppSiteConfigCorsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedOrigins Specifies a list of origins that should be allowed to make cross-origin calls.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(Output<List<String>> allowedOrigins) {
            $.allowedOrigins = allowedOrigins;
            return this;
        }

        /**
         * @param allowedOrigins Specifies a list of origins that should be allowed to make cross-origin calls.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(List<String> allowedOrigins) {
            return allowedOrigins(Output.of(allowedOrigins));
        }

        /**
         * @param allowedOrigins Specifies a list of origins that should be allowed to make cross-origin calls.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }

        /**
         * @param supportCredentials Whether CORS requests with credentials are allowed. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder supportCredentials(@Nullable Output<Boolean> supportCredentials) {
            $.supportCredentials = supportCredentials;
            return this;
        }

        /**
         * @param supportCredentials Whether CORS requests with credentials are allowed. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder supportCredentials(Boolean supportCredentials) {
            return supportCredentials(Output.of(supportCredentials));
        }

        public LinuxWebAppSiteConfigCorsArgs build() {
            $.allowedOrigins = Objects.requireNonNull($.allowedOrigins, "expected parameter 'allowedOrigins' to be non-null");
            return $;
        }
    }

}
