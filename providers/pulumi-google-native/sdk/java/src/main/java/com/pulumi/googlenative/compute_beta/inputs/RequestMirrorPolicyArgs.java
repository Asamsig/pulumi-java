// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A policy that specifies how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service. The load balancer doesn&#39;t wait for responses from the shadow service. Before sending traffic to the shadow service, the host or authority header is suffixed with -shadow.
 * 
 */
public final class RequestMirrorPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RequestMirrorPolicyArgs Empty = new RequestMirrorPolicyArgs();

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    @Import(name="backendService")
    private @Nullable Output<String> backendService;

    /**
     * @return The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    public Optional<Output<String>> backendService() {
        return Optional.ofNullable(this.backendService);
    }

    private RequestMirrorPolicyArgs() {}

    private RequestMirrorPolicyArgs(RequestMirrorPolicyArgs $) {
        this.backendService = $.backendService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RequestMirrorPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RequestMirrorPolicyArgs $;

        public Builder() {
            $ = new RequestMirrorPolicyArgs();
        }

        public Builder(RequestMirrorPolicyArgs defaults) {
            $ = new RequestMirrorPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendService The full or partial URL to the BackendService resource being mirrored to.
         * 
         * @return builder
         * 
         */
        public Builder backendService(@Nullable Output<String> backendService) {
            $.backendService = backendService;
            return this;
        }

        /**
         * @param backendService The full or partial URL to the BackendService resource being mirrored to.
         * 
         * @return builder
         * 
         */
        public Builder backendService(String backendService) {
            return backendService(Output.of(backendService));
        }

        public RequestMirrorPolicyArgs build() {
            return $;
        }
    }

}
