// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.azurenative.devices.enums.IpFilterActionType;
import com.pulumi.azurenative.devices.enums.IpFilterTargetType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The IP filter rules for a provisioning Service.
 * 
 */
public final class TargetIpFilterRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetIpFilterRuleArgs Empty = new TargetIpFilterRuleArgs();

    /**
     * The desired action for requests captured by this rule.
     * 
     */
    @Import(name="action", required=true)
    private Output<IpFilterActionType> action;

    /**
     * @return The desired action for requests captured by this rule.
     * 
     */
    public Output<IpFilterActionType> action() {
        return this.action;
    }

    /**
     * The name of the IP filter rule.
     * 
     */
    @Import(name="filterName", required=true)
    private Output<String> filterName;

    /**
     * @return The name of the IP filter rule.
     * 
     */
    public Output<String> filterName() {
        return this.filterName;
    }

    /**
     * A string that contains the IP address range in CIDR notation for the rule.
     * 
     */
    @Import(name="ipMask", required=true)
    private Output<String> ipMask;

    /**
     * @return A string that contains the IP address range in CIDR notation for the rule.
     * 
     */
    public Output<String> ipMask() {
        return this.ipMask;
    }

    /**
     * Target for requests captured by this rule.
     * 
     */
    @Import(name="target")
    private @Nullable Output<IpFilterTargetType> target;

    /**
     * @return Target for requests captured by this rule.
     * 
     */
    public Optional<Output<IpFilterTargetType>> target() {
        return Optional.ofNullable(this.target);
    }

    private TargetIpFilterRuleArgs() {}

    private TargetIpFilterRuleArgs(TargetIpFilterRuleArgs $) {
        this.action = $.action;
        this.filterName = $.filterName;
        this.ipMask = $.ipMask;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetIpFilterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetIpFilterRuleArgs $;

        public Builder() {
            $ = new TargetIpFilterRuleArgs();
        }

        public Builder(TargetIpFilterRuleArgs defaults) {
            $ = new TargetIpFilterRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The desired action for requests captured by this rule.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<IpFilterActionType> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The desired action for requests captured by this rule.
         * 
         * @return builder
         * 
         */
        public Builder action(IpFilterActionType action) {
            return action(Output.of(action));
        }

        /**
         * @param filterName The name of the IP filter rule.
         * 
         * @return builder
         * 
         */
        public Builder filterName(Output<String> filterName) {
            $.filterName = filterName;
            return this;
        }

        /**
         * @param filterName The name of the IP filter rule.
         * 
         * @return builder
         * 
         */
        public Builder filterName(String filterName) {
            return filterName(Output.of(filterName));
        }

        /**
         * @param ipMask A string that contains the IP address range in CIDR notation for the rule.
         * 
         * @return builder
         * 
         */
        public Builder ipMask(Output<String> ipMask) {
            $.ipMask = ipMask;
            return this;
        }

        /**
         * @param ipMask A string that contains the IP address range in CIDR notation for the rule.
         * 
         * @return builder
         * 
         */
        public Builder ipMask(String ipMask) {
            return ipMask(Output.of(ipMask));
        }

        /**
         * @param target Target for requests captured by this rule.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<IpFilterTargetType> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target Target for requests captured by this rule.
         * 
         * @return builder
         * 
         */
        public Builder target(IpFilterTargetType target) {
            return target(Output.of(target));
        }

        public TargetIpFilterRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.filterName = Objects.requireNonNull($.filterName, "expected parameter 'filterName' to be non-null");
            $.ipMask = Objects.requireNonNull($.ipMask, "expected parameter 'ipMask' to be non-null");
            return $;
        }
    }

}
