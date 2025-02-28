// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * HTTPHeader describes a custom header to be used in HTTP probes
 * 
 */
public final class ContainerAppProbeHttpHeadersArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerAppProbeHttpHeadersArgs Empty = new ContainerAppProbeHttpHeadersArgs();

    /**
     * The header field name
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The header field name
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The header field value
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The header field value
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ContainerAppProbeHttpHeadersArgs() {}

    private ContainerAppProbeHttpHeadersArgs(ContainerAppProbeHttpHeadersArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerAppProbeHttpHeadersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerAppProbeHttpHeadersArgs $;

        public Builder() {
            $ = new ContainerAppProbeHttpHeadersArgs();
        }

        public Builder(ContainerAppProbeHttpHeadersArgs defaults) {
            $ = new ContainerAppProbeHttpHeadersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The header field name
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The header field name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The header field value
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The header field value
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ContainerAppProbeHttpHeadersArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
