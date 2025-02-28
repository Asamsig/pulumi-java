// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.azurenative.keyvault.enums.NetworkRuleAction;
import com.pulumi.azurenative.keyvault.enums.NetworkRuleBypassOptions;
import com.pulumi.azurenative.keyvault.inputs.MHSMIPRuleArgs;
import com.pulumi.azurenative.keyvault.inputs.MHSMVirtualNetworkRuleArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A set of rules governing the network accessibility of a managed hsm pool.
 * 
 */
public final class MHSMNetworkRuleSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MHSMNetworkRuleSetArgs Empty = new MHSMNetworkRuleSetArgs();

    /**
     * Tells what traffic can bypass network rules. This can be &#39;AzureServices&#39; or &#39;None&#39;.  If not specified the default is &#39;AzureServices&#39;.
     * 
     */
    @Import(name="bypass")
    private @Nullable Output<Either<String,NetworkRuleBypassOptions>> bypass;

    /**
     * @return Tells what traffic can bypass network rules. This can be &#39;AzureServices&#39; or &#39;None&#39;.  If not specified the default is &#39;AzureServices&#39;.
     * 
     */
    public Optional<Output<Either<String,NetworkRuleBypassOptions>>> bypass() {
        return Optional.ofNullable(this.bypass);
    }

    /**
     * The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
     * 
     */
    @Import(name="defaultAction")
    private @Nullable Output<Either<String,NetworkRuleAction>> defaultAction;

    /**
     * @return The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
     * 
     */
    public Optional<Output<Either<String,NetworkRuleAction>>> defaultAction() {
        return Optional.ofNullable(this.defaultAction);
    }

    /**
     * The list of IP address rules.
     * 
     */
    @Import(name="ipRules")
    private @Nullable Output<List<MHSMIPRuleArgs>> ipRules;

    /**
     * @return The list of IP address rules.
     * 
     */
    public Optional<Output<List<MHSMIPRuleArgs>>> ipRules() {
        return Optional.ofNullable(this.ipRules);
    }

    /**
     * The list of virtual network rules.
     * 
     */
    @Import(name="virtualNetworkRules")
    private @Nullable Output<List<MHSMVirtualNetworkRuleArgs>> virtualNetworkRules;

    /**
     * @return The list of virtual network rules.
     * 
     */
    public Optional<Output<List<MHSMVirtualNetworkRuleArgs>>> virtualNetworkRules() {
        return Optional.ofNullable(this.virtualNetworkRules);
    }

    private MHSMNetworkRuleSetArgs() {}

    private MHSMNetworkRuleSetArgs(MHSMNetworkRuleSetArgs $) {
        this.bypass = $.bypass;
        this.defaultAction = $.defaultAction;
        this.ipRules = $.ipRules;
        this.virtualNetworkRules = $.virtualNetworkRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MHSMNetworkRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MHSMNetworkRuleSetArgs $;

        public Builder() {
            $ = new MHSMNetworkRuleSetArgs();
        }

        public Builder(MHSMNetworkRuleSetArgs defaults) {
            $ = new MHSMNetworkRuleSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bypass Tells what traffic can bypass network rules. This can be &#39;AzureServices&#39; or &#39;None&#39;.  If not specified the default is &#39;AzureServices&#39;.
         * 
         * @return builder
         * 
         */
        public Builder bypass(@Nullable Output<Either<String,NetworkRuleBypassOptions>> bypass) {
            $.bypass = bypass;
            return this;
        }

        /**
         * @param bypass Tells what traffic can bypass network rules. This can be &#39;AzureServices&#39; or &#39;None&#39;.  If not specified the default is &#39;AzureServices&#39;.
         * 
         * @return builder
         * 
         */
        public Builder bypass(Either<String,NetworkRuleBypassOptions> bypass) {
            return bypass(Output.of(bypass));
        }

        /**
         * @param bypass Tells what traffic can bypass network rules. This can be &#39;AzureServices&#39; or &#39;None&#39;.  If not specified the default is &#39;AzureServices&#39;.
         * 
         * @return builder
         * 
         */
        public Builder bypass(String bypass) {
            return bypass(Either.ofLeft(bypass));
        }

        /**
         * @param bypass Tells what traffic can bypass network rules. This can be &#39;AzureServices&#39; or &#39;None&#39;.  If not specified the default is &#39;AzureServices&#39;.
         * 
         * @return builder
         * 
         */
        public Builder bypass(NetworkRuleBypassOptions bypass) {
            return bypass(Either.ofRight(bypass));
        }

        /**
         * @param defaultAction The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(@Nullable Output<Either<String,NetworkRuleAction>> defaultAction) {
            $.defaultAction = defaultAction;
            return this;
        }

        /**
         * @param defaultAction The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(Either<String,NetworkRuleAction> defaultAction) {
            return defaultAction(Output.of(defaultAction));
        }

        /**
         * @param defaultAction The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(String defaultAction) {
            return defaultAction(Either.ofLeft(defaultAction));
        }

        /**
         * @param defaultAction The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(NetworkRuleAction defaultAction) {
            return defaultAction(Either.ofRight(defaultAction));
        }

        /**
         * @param ipRules The list of IP address rules.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(@Nullable Output<List<MHSMIPRuleArgs>> ipRules) {
            $.ipRules = ipRules;
            return this;
        }

        /**
         * @param ipRules The list of IP address rules.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(List<MHSMIPRuleArgs> ipRules) {
            return ipRules(Output.of(ipRules));
        }

        /**
         * @param ipRules The list of IP address rules.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(MHSMIPRuleArgs... ipRules) {
            return ipRules(List.of(ipRules));
        }

        /**
         * @param virtualNetworkRules The list of virtual network rules.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkRules(@Nullable Output<List<MHSMVirtualNetworkRuleArgs>> virtualNetworkRules) {
            $.virtualNetworkRules = virtualNetworkRules;
            return this;
        }

        /**
         * @param virtualNetworkRules The list of virtual network rules.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkRules(List<MHSMVirtualNetworkRuleArgs> virtualNetworkRules) {
            return virtualNetworkRules(Output.of(virtualNetworkRules));
        }

        /**
         * @param virtualNetworkRules The list of virtual network rules.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkRules(MHSMVirtualNetworkRuleArgs... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }

        public MHSMNetworkRuleSetArgs build() {
            return $;
        }
    }

}
