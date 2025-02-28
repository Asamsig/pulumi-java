// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A rule governing the accessibility of a vault from a specific ip address or ip range.
 * 
 */
public final class IPRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final IPRuleArgs Empty = new IPRuleArgs();

    /**
     * An IPv4 address range in CIDR notation, such as &#39;124.56.78.91&#39; (simple IP address) or &#39;124.56.78.0/24&#39; (all addresses that start with 124.56.78).
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return An IPv4 address range in CIDR notation, such as &#39;124.56.78.91&#39; (simple IP address) or &#39;124.56.78.0/24&#39; (all addresses that start with 124.56.78).
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private IPRuleArgs() {}

    private IPRuleArgs(IPRuleArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPRuleArgs $;

        public Builder() {
            $ = new IPRuleArgs();
        }

        public Builder(IPRuleArgs defaults) {
            $ = new IPRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value An IPv4 address range in CIDR notation, such as &#39;124.56.78.91&#39; (simple IP address) or &#39;124.56.78.0/24&#39; (all addresses that start with 124.56.78).
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value An IPv4 address range in CIDR notation, such as &#39;124.56.78.91&#39; (simple IP address) or &#39;124.56.78.0/24&#39; (all addresses that start with 124.56.78).
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public IPRuleArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
