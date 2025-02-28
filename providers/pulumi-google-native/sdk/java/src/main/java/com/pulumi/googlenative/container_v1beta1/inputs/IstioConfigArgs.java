// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.enums.IstioConfigAuth;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration options for Istio addon.
 * 
 */
public final class IstioConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final IstioConfigArgs Empty = new IstioConfigArgs();

    /**
     * The specified Istio auth mode, either none, or mutual TLS.
     * 
     */
    @Import(name="auth")
    private @Nullable Output<IstioConfigAuth> auth;

    /**
     * @return The specified Istio auth mode, either none, or mutual TLS.
     * 
     */
    public Optional<Output<IstioConfigAuth>> auth() {
        return Optional.ofNullable(this.auth);
    }

    /**
     * Whether Istio is enabled for this cluster.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Whether Istio is enabled for this cluster.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    private IstioConfigArgs() {}

    private IstioConfigArgs(IstioConfigArgs $) {
        this.auth = $.auth;
        this.disabled = $.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IstioConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IstioConfigArgs $;

        public Builder() {
            $ = new IstioConfigArgs();
        }

        public Builder(IstioConfigArgs defaults) {
            $ = new IstioConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auth The specified Istio auth mode, either none, or mutual TLS.
         * 
         * @return builder
         * 
         */
        public Builder auth(@Nullable Output<IstioConfigAuth> auth) {
            $.auth = auth;
            return this;
        }

        /**
         * @param auth The specified Istio auth mode, either none, or mutual TLS.
         * 
         * @return builder
         * 
         */
        public Builder auth(IstioConfigAuth auth) {
            return auth(Output.of(auth));
        }

        /**
         * @param disabled Whether Istio is enabled for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Whether Istio is enabled for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public IstioConfigArgs build() {
            return $;
        }
    }

}
