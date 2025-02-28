// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionCorsPolicy;
import com.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy;
import com.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy;
import com.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionRetryPolicy;
import com.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionTimeout;
import com.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionUrlRewrite;
import com.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionWeightedBackendService;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class URLMapPathMatcherDefaultRouteAction {
    /**
     * @return The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherDefaultRouteActionCorsPolicy corsPolicy;
    /**
     * @return The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy;
    /**
     * @return Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy;
    /**
     * @return Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherDefaultRouteActionRetryPolicy retryPolicy;
    /**
     * @return Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherDefaultRouteActionTimeout timeout;
    /**
     * @return The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherDefaultRouteActionUrlRewrite urlRewrite;
    /**
     * @return A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<URLMapPathMatcherDefaultRouteActionWeightedBackendService> weightedBackendServices;

    @CustomType.Constructor
    private URLMapPathMatcherDefaultRouteAction(
        @CustomType.Parameter("corsPolicy") @Nullable URLMapPathMatcherDefaultRouteActionCorsPolicy corsPolicy,
        @CustomType.Parameter("faultInjectionPolicy") @Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy,
        @CustomType.Parameter("requestMirrorPolicy") @Nullable URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy,
        @CustomType.Parameter("retryPolicy") @Nullable URLMapPathMatcherDefaultRouteActionRetryPolicy retryPolicy,
        @CustomType.Parameter("timeout") @Nullable URLMapPathMatcherDefaultRouteActionTimeout timeout,
        @CustomType.Parameter("urlRewrite") @Nullable URLMapPathMatcherDefaultRouteActionUrlRewrite urlRewrite,
        @CustomType.Parameter("weightedBackendServices") @Nullable List<URLMapPathMatcherDefaultRouteActionWeightedBackendService> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    /**
     * @return The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherDefaultRouteActionCorsPolicy> corsPolicy() {
        return Optional.ofNullable(this.corsPolicy);
    }
    /**
     * @return The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy> faultInjectionPolicy() {
        return Optional.ofNullable(this.faultInjectionPolicy);
    }
    /**
     * @return Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy> requestMirrorPolicy() {
        return Optional.ofNullable(this.requestMirrorPolicy);
    }
    /**
     * @return Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherDefaultRouteActionRetryPolicy> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    /**
     * @return Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherDefaultRouteActionTimeout> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherDefaultRouteActionUrlRewrite> urlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
    }
    /**
     * @return A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    public List<URLMapPathMatcherDefaultRouteActionWeightedBackendService> weightedBackendServices() {
        return this.weightedBackendServices == null ? List.of() : this.weightedBackendServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultRouteAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable URLMapPathMatcherDefaultRouteActionCorsPolicy corsPolicy;
        private @Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy;
        private @Nullable URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy;
        private @Nullable URLMapPathMatcherDefaultRouteActionRetryPolicy retryPolicy;
        private @Nullable URLMapPathMatcherDefaultRouteActionTimeout timeout;
        private @Nullable URLMapPathMatcherDefaultRouteActionUrlRewrite urlRewrite;
        private @Nullable List<URLMapPathMatcherDefaultRouteActionWeightedBackendService> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultRouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder corsPolicy(@Nullable URLMapPathMatcherDefaultRouteActionCorsPolicy corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }
        public Builder faultInjectionPolicy(@Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }
        public Builder requestMirrorPolicy(@Nullable URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable URLMapPathMatcherDefaultRouteActionRetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder timeout(@Nullable URLMapPathMatcherDefaultRouteActionTimeout timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder urlRewrite(@Nullable URLMapPathMatcherDefaultRouteActionUrlRewrite urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }
        public Builder weightedBackendServices(@Nullable List<URLMapPathMatcherDefaultRouteActionWeightedBackendService> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }
        public Builder weightedBackendServices(URLMapPathMatcherDefaultRouteActionWeightedBackendService... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }        public URLMapPathMatcherDefaultRouteAction build() {
            return new URLMapPathMatcherDefaultRouteAction(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}
