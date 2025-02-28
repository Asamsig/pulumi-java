// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLoadBalancerTlsCertificatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerTlsCertificatePlainArgs Empty = new GetLoadBalancerTlsCertificatePlainArgs();

    /**
     * The SSL/TLS certificate name.
     * 
     */
    @Import(name="certificateName", required=true)
    private String certificateName;

    /**
     * @return The SSL/TLS certificate name.
     * 
     */
    public String certificateName() {
        return this.certificateName;
    }

    /**
     * The name of your load balancer.
     * 
     */
    @Import(name="loadBalancerName", required=true)
    private String loadBalancerName;

    /**
     * @return The name of your load balancer.
     * 
     */
    public String loadBalancerName() {
        return this.loadBalancerName;
    }

    private GetLoadBalancerTlsCertificatePlainArgs() {}

    private GetLoadBalancerTlsCertificatePlainArgs(GetLoadBalancerTlsCertificatePlainArgs $) {
        this.certificateName = $.certificateName;
        this.loadBalancerName = $.loadBalancerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadBalancerTlsCertificatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerTlsCertificatePlainArgs $;

        public Builder() {
            $ = new GetLoadBalancerTlsCertificatePlainArgs();
        }

        public Builder(GetLoadBalancerTlsCertificatePlainArgs defaults) {
            $ = new GetLoadBalancerTlsCertificatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateName The SSL/TLS certificate name.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        /**
         * @param loadBalancerName The name of your load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(String loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        public GetLoadBalancerTlsCertificatePlainArgs build() {
            $.certificateName = Objects.requireNonNull($.certificateName, "expected parameter 'certificateName' to be non-null");
            $.loadBalancerName = Objects.requireNonNull($.loadBalancerName, "expected parameter 'loadBalancerName' to be non-null");
            return $;
        }
    }

}
