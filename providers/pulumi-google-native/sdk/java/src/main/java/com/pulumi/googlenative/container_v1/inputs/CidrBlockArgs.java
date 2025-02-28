// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CidrBlock contains an optional name and one CIDR block.
 * 
 */
public final class CidrBlockArgs extends com.pulumi.resources.ResourceArgs {

    public static final CidrBlockArgs Empty = new CidrBlockArgs();

    /**
     * cidr_block must be specified in CIDR notation.
     * 
     */
    @Import(name="cidrBlock")
    private @Nullable Output<String> cidrBlock;

    /**
     * @return cidr_block must be specified in CIDR notation.
     * 
     */
    public Optional<Output<String>> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }

    /**
     * display_name is an optional field for users to identify CIDR blocks.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return display_name is an optional field for users to identify CIDR blocks.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    private CidrBlockArgs() {}

    private CidrBlockArgs(CidrBlockArgs $) {
        this.cidrBlock = $.cidrBlock;
        this.displayName = $.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CidrBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CidrBlockArgs $;

        public Builder() {
            $ = new CidrBlockArgs();
        }

        public Builder(CidrBlockArgs defaults) {
            $ = new CidrBlockArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrBlock cidr_block must be specified in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param cidrBlock cidr_block must be specified in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        /**
         * @param displayName display_name is an optional field for users to identify CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName display_name is an optional field for users to identify CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public CidrBlockArgs build() {
            return $;
        }
    }

}
