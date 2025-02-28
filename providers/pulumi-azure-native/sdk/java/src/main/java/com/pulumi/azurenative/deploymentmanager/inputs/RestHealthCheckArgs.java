// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.azurenative.deploymentmanager.inputs.RestRequestArgs;
import com.pulumi.azurenative.deploymentmanager.inputs.RestResponseArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A REST based health check
 * 
 */
public final class RestHealthCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestHealthCheckArgs Empty = new RestHealthCheckArgs();

    /**
     * A unique name for this check.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A unique name for this check.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The request to the health provider.
     * 
     */
    @Import(name="request", required=true)
    private Output<RestRequestArgs> request;

    /**
     * @return The request to the health provider.
     * 
     */
    public Output<RestRequestArgs> request() {
        return this.request;
    }

    /**
     * The expected response from the health provider. If no expected response is provided, the default is to expect the received response to have an HTTP status code of 200 OK.
     * 
     */
    @Import(name="response")
    private @Nullable Output<RestResponseArgs> response;

    /**
     * @return The expected response from the health provider. If no expected response is provided, the default is to expect the received response to have an HTTP status code of 200 OK.
     * 
     */
    public Optional<Output<RestResponseArgs>> response() {
        return Optional.ofNullable(this.response);
    }

    private RestHealthCheckArgs() {}

    private RestHealthCheckArgs(RestHealthCheckArgs $) {
        this.name = $.name;
        this.request = $.request;
        this.response = $.response;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestHealthCheckArgs $;

        public Builder() {
            $ = new RestHealthCheckArgs();
        }

        public Builder(RestHealthCheckArgs defaults) {
            $ = new RestHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name A unique name for this check.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name for this check.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param request The request to the health provider.
         * 
         * @return builder
         * 
         */
        public Builder request(Output<RestRequestArgs> request) {
            $.request = request;
            return this;
        }

        /**
         * @param request The request to the health provider.
         * 
         * @return builder
         * 
         */
        public Builder request(RestRequestArgs request) {
            return request(Output.of(request));
        }

        /**
         * @param response The expected response from the health provider. If no expected response is provided, the default is to expect the received response to have an HTTP status code of 200 OK.
         * 
         * @return builder
         * 
         */
        public Builder response(@Nullable Output<RestResponseArgs> response) {
            $.response = response;
            return this;
        }

        /**
         * @param response The expected response from the health provider. If no expected response is provided, the default is to expect the received response to have an HTTP status code of 200 OK.
         * 
         * @return builder
         * 
         */
        public Builder response(RestResponseArgs response) {
            return response(Output.of(response));
        }

        public RestHealthCheckArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.request = Objects.requireNonNull($.request, "expected parameter 'request' to be non-null");
            return $;
        }
    }

}
