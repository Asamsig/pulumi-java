// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoveryreadiness.inputs;

import com.pulumi.awsnative.route53recoveryreadiness.inputs.ResourceSetDNSTargetResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The resource element of a ResourceSet
 * 
 */
public final class ResourceSetResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceSetResourceArgs Empty = new ResourceSetResourceArgs();

    /**
     * The component identifier of the resource, generated when DNS target resource is used.
     * 
     */
    @Import(name="componentId")
    private @Nullable Output<String> componentId;

    /**
     * @return The component identifier of the resource, generated when DNS target resource is used.
     * 
     */
    public Optional<Output<String>> componentId() {
        return Optional.ofNullable(this.componentId);
    }

    @Import(name="dnsTargetResource")
    private @Nullable Output<ResourceSetDNSTargetResourceArgs> dnsTargetResource;

    public Optional<Output<ResourceSetDNSTargetResourceArgs>> dnsTargetResource() {
        return Optional.ofNullable(this.dnsTargetResource);
    }

    /**
     * A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained within.
     * 
     */
    @Import(name="readinessScopes")
    private @Nullable Output<List<String>> readinessScopes;

    /**
     * @return A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained within.
     * 
     */
    public Optional<Output<List<String>>> readinessScopes() {
        return Optional.ofNullable(this.readinessScopes);
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS resource.
     * 
     */
    @Import(name="resourceArn")
    private @Nullable Output<String> resourceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the AWS resource.
     * 
     */
    public Optional<Output<String>> resourceArn() {
        return Optional.ofNullable(this.resourceArn);
    }

    private ResourceSetResourceArgs() {}

    private ResourceSetResourceArgs(ResourceSetResourceArgs $) {
        this.componentId = $.componentId;
        this.dnsTargetResource = $.dnsTargetResource;
        this.readinessScopes = $.readinessScopes;
        this.resourceArn = $.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceSetResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceSetResourceArgs $;

        public Builder() {
            $ = new ResourceSetResourceArgs();
        }

        public Builder(ResourceSetResourceArgs defaults) {
            $ = new ResourceSetResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentId The component identifier of the resource, generated when DNS target resource is used.
         * 
         * @return builder
         * 
         */
        public Builder componentId(@Nullable Output<String> componentId) {
            $.componentId = componentId;
            return this;
        }

        /**
         * @param componentId The component identifier of the resource, generated when DNS target resource is used.
         * 
         * @return builder
         * 
         */
        public Builder componentId(String componentId) {
            return componentId(Output.of(componentId));
        }

        public Builder dnsTargetResource(@Nullable Output<ResourceSetDNSTargetResourceArgs> dnsTargetResource) {
            $.dnsTargetResource = dnsTargetResource;
            return this;
        }

        public Builder dnsTargetResource(ResourceSetDNSTargetResourceArgs dnsTargetResource) {
            return dnsTargetResource(Output.of(dnsTargetResource));
        }

        /**
         * @param readinessScopes A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained within.
         * 
         * @return builder
         * 
         */
        public Builder readinessScopes(@Nullable Output<List<String>> readinessScopes) {
            $.readinessScopes = readinessScopes;
            return this;
        }

        /**
         * @param readinessScopes A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained within.
         * 
         * @return builder
         * 
         */
        public Builder readinessScopes(List<String> readinessScopes) {
            return readinessScopes(Output.of(readinessScopes));
        }

        /**
         * @param readinessScopes A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained within.
         * 
         * @return builder
         * 
         */
        public Builder readinessScopes(String... readinessScopes) {
            return readinessScopes(List.of(readinessScopes));
        }

        /**
         * @param resourceArn The Amazon Resource Name (ARN) of the AWS resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(@Nullable Output<String> resourceArn) {
            $.resourceArn = resourceArn;
            return this;
        }

        /**
         * @param resourceArn The Amazon Resource Name (ARN) of the AWS resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceArn(String resourceArn) {
            return resourceArn(Output.of(resourceArn));
        }

        public ResourceSetResourceArgs build() {
            return $;
        }
    }

}
