// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * AML Token identity configuration.
 * 
 */
public final class AmlTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final AmlTokenArgs Empty = new AmlTokenArgs();

    /**
     * Enum to determine identity framework.
     * Expected value is &#39;AMLToken&#39;.
     * 
     */
    @Import(name="identityType", required=true)
    private Output<String> identityType;

    /**
     * @return Enum to determine identity framework.
     * Expected value is &#39;AMLToken&#39;.
     * 
     */
    public Output<String> identityType() {
        return this.identityType;
    }

    private AmlTokenArgs() {}

    private AmlTokenArgs(AmlTokenArgs $) {
        this.identityType = $.identityType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmlTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmlTokenArgs $;

        public Builder() {
            $ = new AmlTokenArgs();
        }

        public Builder(AmlTokenArgs defaults) {
            $ = new AmlTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityType Enum to determine identity framework.
         * Expected value is &#39;AMLToken&#39;.
         * 
         * @return builder
         * 
         */
        public Builder identityType(Output<String> identityType) {
            $.identityType = identityType;
            return this;
        }

        /**
         * @param identityType Enum to determine identity framework.
         * Expected value is &#39;AMLToken&#39;.
         * 
         * @return builder
         * 
         */
        public Builder identityType(String identityType) {
            return identityType(Output.of(identityType));
        }

        public AmlTokenArgs build() {
            $.identityType = Codegen.stringProp("identityType").output().arg($.identityType).require();
            return $;
        }
    }

}
