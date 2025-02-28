// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.DefaultAction;
import com.pulumi.azurenative.containerregistry.inputs.IPRuleArgs;
import com.pulumi.azurenative.containerregistry.inputs.VirtualNetworkRuleArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The network rule set for a container registry.
 * 
 */
public final class NetworkRuleSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkRuleSetArgs Empty = new NetworkRuleSetArgs();

    /**
     * The default action of allow or deny when no other rules match.
     * 
     */
    @Import(name="defaultAction", required=true)
    private Output<Either<String,DefaultAction>> defaultAction;

    /**
     * @return The default action of allow or deny when no other rules match.
     * 
     */
    public Output<Either<String,DefaultAction>> defaultAction() {
        return this.defaultAction;
    }

    /**
     * The IP ACL rules.
     * 
     */
    @Import(name="ipRules")
    private @Nullable Output<List<IPRuleArgs>> ipRules;

    /**
     * @return The IP ACL rules.
     * 
     */
    public Optional<Output<List<IPRuleArgs>>> ipRules() {
        return Optional.ofNullable(this.ipRules);
    }

    /**
     * The virtual network rules.
     * 
     */
    @Import(name="virtualNetworkRules")
    private @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

    /**
     * @return The virtual network rules.
     * 
     */
    public Optional<Output<List<VirtualNetworkRuleArgs>>> virtualNetworkRules() {
        return Optional.ofNullable(this.virtualNetworkRules);
    }

    private NetworkRuleSetArgs() {}

    private NetworkRuleSetArgs(NetworkRuleSetArgs $) {
        this.defaultAction = $.defaultAction;
        this.ipRules = $.ipRules;
        this.virtualNetworkRules = $.virtualNetworkRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkRuleSetArgs $;

        public Builder() {
            $ = new NetworkRuleSetArgs();
        }

        public Builder(NetworkRuleSetArgs defaults) {
            $ = new NetworkRuleSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultAction The default action of allow or deny when no other rules match.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(Output<Either<String,DefaultAction>> defaultAction) {
            $.defaultAction = defaultAction;
            return this;
        }

        /**
         * @param defaultAction The default action of allow or deny when no other rules match.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(Either<String,DefaultAction> defaultAction) {
            return defaultAction(Output.of(defaultAction));
        }

        /**
         * @param defaultAction The default action of allow or deny when no other rules match.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(String defaultAction) {
            return defaultAction(Either.ofLeft(defaultAction));
        }

        /**
         * @param defaultAction The default action of allow or deny when no other rules match.
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(DefaultAction defaultAction) {
            return defaultAction(Either.ofRight(defaultAction));
        }

        /**
         * @param ipRules The IP ACL rules.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(@Nullable Output<List<IPRuleArgs>> ipRules) {
            $.ipRules = ipRules;
            return this;
        }

        /**
         * @param ipRules The IP ACL rules.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(List<IPRuleArgs> ipRules) {
            return ipRules(Output.of(ipRules));
        }

        /**
         * @param ipRules The IP ACL rules.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(IPRuleArgs... ipRules) {
            return ipRules(List.of(ipRules));
        }

        /**
         * @param virtualNetworkRules The virtual network rules.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkRules(@Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
            $.virtualNetworkRules = virtualNetworkRules;
            return this;
        }

        /**
         * @param virtualNetworkRules The virtual network rules.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkRules(List<VirtualNetworkRuleArgs> virtualNetworkRules) {
            return virtualNetworkRules(Output.of(virtualNetworkRules));
        }

        /**
         * @param virtualNetworkRules The virtual network rules.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkRules(VirtualNetworkRuleArgs... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }

        public NetworkRuleSetArgs build() {
            $.defaultAction = Codegen.stringProp("defaultAction").left(DefaultAction.class).output().arg($.defaultAction).def("Allow").require();
            return $;
        }
    }

}
