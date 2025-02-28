// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networkservices_v1beta1.enums.GatewayType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Required. Short name of the Gateway resource to be created.
     * 
     */
    @Import(name="gatewayId", required=true)
    private Output<String> gatewayId;

    /**
     * @return Required. Short name of the Gateway resource to be created.
     * 
     */
    public Output<String> gatewayId() {
        return this.gatewayId;
    }

    /**
     * Optional. Set of label tags associated with the Gateway resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Set of label tags associated with the Gateway resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the Gateway resource. It matches pattern `projects/*{@literal /}locations/global/gateways/`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Gateway resource. It matches pattern `projects/*{@literal /}locations/global/gateways/`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One or more ports that the Gateway must receive traffic on. The proxy binds to the ports specified. Gateway listen on 0.0.0.0 on the ports specified below.
     * 
     */
    @Import(name="ports", required=true)
    private Output<List<Integer>> ports;

    /**
     * @return One or more ports that the Gateway must receive traffic on. The proxy binds to the ports specified. Gateway listen on 0.0.0.0 on the ports specified below.
     * 
     */
    public Output<List<Integer>> ports() {
        return this.ports;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Immutable. Scope determines how configuration across multiple Gateway instances are merged. The configuration for multiple Gateway instances with the same scope will be merged as presented as a single coniguration to the proxy/load balancer. Max length 64 characters. Scope should start with a letter and can only have letters, numbers, hyphens.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return Immutable. Scope determines how configuration across multiple Gateway instances are merged. The configuration for multiple Gateway instances with the same scope will be merged as presented as a single coniguration to the proxy/load balancer. Max length 64 characters. Scope should start with a letter and can only have letters, numbers, hyphens.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     * Optional. A fully-qualified ServerTLSPolicy URL reference. Specifies how TLS traffic is terminated. If empty, TLS termination is disabled.
     * 
     */
    @Import(name="serverTlsPolicy")
    private @Nullable Output<String> serverTlsPolicy;

    /**
     * @return Optional. A fully-qualified ServerTLSPolicy URL reference. Specifies how TLS traffic is terminated. If empty, TLS termination is disabled.
     * 
     */
    public Optional<Output<String>> serverTlsPolicy() {
        return Optional.ofNullable(this.serverTlsPolicy);
    }

    /**
     * Immutable. The type of the customer managed gateway.
     * 
     */
    @Import(name="type")
    private @Nullable Output<GatewayType> type;

    /**
     * @return Immutable. The type of the customer managed gateway.
     * 
     */
    public Optional<Output<GatewayType>> type() {
        return Optional.ofNullable(this.type);
    }

    private GatewayArgs() {}

    private GatewayArgs(GatewayArgs $) {
        this.description = $.description;
        this.gatewayId = $.gatewayId;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.ports = $.ports;
        this.project = $.project;
        this.scope = $.scope;
        this.serverTlsPolicy = $.serverTlsPolicy;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayArgs $;

        public Builder() {
            $ = new GatewayArgs();
        }

        public Builder(GatewayArgs defaults) {
            $ = new GatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. A free-text description of the resource. Max length 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. A free-text description of the resource. Max length 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param gatewayId Required. Short name of the Gateway resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(Output<String> gatewayId) {
            $.gatewayId = gatewayId;
            return this;
        }

        /**
         * @param gatewayId Required. Short name of the Gateway resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(String gatewayId) {
            return gatewayId(Output.of(gatewayId));
        }

        /**
         * @param labels Optional. Set of label tags associated with the Gateway resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. Set of label tags associated with the Gateway resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Name of the Gateway resource. It matches pattern `projects/*{@literal /}locations/global/gateways/`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Gateway resource. It matches pattern `projects/*{@literal /}locations/global/gateways/`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ports One or more ports that the Gateway must receive traffic on. The proxy binds to the ports specified. Gateway listen on 0.0.0.0 on the ports specified below.
         * 
         * @return builder
         * 
         */
        public Builder ports(Output<List<Integer>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports One or more ports that the Gateway must receive traffic on. The proxy binds to the ports specified. Gateway listen on 0.0.0.0 on the ports specified below.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<Integer> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports One or more ports that the Gateway must receive traffic on. The proxy binds to the ports specified. Gateway listen on 0.0.0.0 on the ports specified below.
         * 
         * @return builder
         * 
         */
        public Builder ports(Integer... ports) {
            return ports(List.of(ports));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param scope Immutable. Scope determines how configuration across multiple Gateway instances are merged. The configuration for multiple Gateway instances with the same scope will be merged as presented as a single coniguration to the proxy/load balancer. Max length 64 characters. Scope should start with a letter and can only have letters, numbers, hyphens.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Immutable. Scope determines how configuration across multiple Gateway instances are merged. The configuration for multiple Gateway instances with the same scope will be merged as presented as a single coniguration to the proxy/load balancer. Max length 64 characters. Scope should start with a letter and can only have letters, numbers, hyphens.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param serverTlsPolicy Optional. A fully-qualified ServerTLSPolicy URL reference. Specifies how TLS traffic is terminated. If empty, TLS termination is disabled.
         * 
         * @return builder
         * 
         */
        public Builder serverTlsPolicy(@Nullable Output<String> serverTlsPolicy) {
            $.serverTlsPolicy = serverTlsPolicy;
            return this;
        }

        /**
         * @param serverTlsPolicy Optional. A fully-qualified ServerTLSPolicy URL reference. Specifies how TLS traffic is terminated. If empty, TLS termination is disabled.
         * 
         * @return builder
         * 
         */
        public Builder serverTlsPolicy(String serverTlsPolicy) {
            return serverTlsPolicy(Output.of(serverTlsPolicy));
        }

        /**
         * @param type Immutable. The type of the customer managed gateway.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<GatewayType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Immutable. The type of the customer managed gateway.
         * 
         * @return builder
         * 
         */
        public Builder type(GatewayType type) {
            return type(Output.of(type));
        }

        public GatewayArgs build() {
            $.gatewayId = Objects.requireNonNull($.gatewayId, "expected parameter 'gatewayId' to be non-null");
            $.ports = Objects.requireNonNull($.ports, "expected parameter 'ports' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
