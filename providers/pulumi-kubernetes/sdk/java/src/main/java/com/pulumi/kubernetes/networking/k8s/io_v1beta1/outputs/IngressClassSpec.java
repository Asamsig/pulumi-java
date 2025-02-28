// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.k8s.io_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.TypedLocalObjectReference;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressClassSpec {
    /**
     * @return Controller refers to the name of the controller that should handle this class. This allows for different &#34;flavors&#34; that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. &#34;acme.io/ingress-controller&#34;. This field is immutable.
     * 
     */
    private final @Nullable String controller;
    /**
     * @return Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
     * 
     */
    private final @Nullable TypedLocalObjectReference parameters;

    @CustomType.Constructor
    private IngressClassSpec(
        @CustomType.Parameter("controller") @Nullable String controller,
        @CustomType.Parameter("parameters") @Nullable TypedLocalObjectReference parameters) {
        this.controller = controller;
        this.parameters = parameters;
    }

    /**
     * @return Controller refers to the name of the controller that should handle this class. This allows for different &#34;flavors&#34; that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. &#34;acme.io/ingress-controller&#34;. This field is immutable.
     * 
     */
    public Optional<String> controller() {
        return Optional.ofNullable(this.controller);
    }
    /**
     * @return Parameters is a link to a custom resource containing additional configuration for the controller. This is optional if the controller does not require extra parameters.
     * 
     */
    public Optional<TypedLocalObjectReference> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressClassSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String controller;
        private @Nullable TypedLocalObjectReference parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressClassSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controller = defaults.controller;
    	      this.parameters = defaults.parameters;
        }

        public Builder controller(@Nullable String controller) {
            this.controller = controller;
            return this;
        }
        public Builder parameters(@Nullable TypedLocalObjectReference parameters) {
            this.parameters = parameters;
            return this;
        }        public IngressClassSpec build() {
            return new IngressClassSpec(controller, parameters);
        }
    }
}
