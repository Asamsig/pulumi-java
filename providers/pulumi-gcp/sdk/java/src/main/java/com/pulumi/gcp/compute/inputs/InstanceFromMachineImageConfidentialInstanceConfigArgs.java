// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class InstanceFromMachineImageConfidentialInstanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageConfidentialInstanceConfigArgs Empty = new InstanceFromMachineImageConfidentialInstanceConfigArgs();

    @Import(name="enableConfidentialCompute", required=true)
    private Output<Boolean> enableConfidentialCompute;

    public Output<Boolean> enableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    private InstanceFromMachineImageConfidentialInstanceConfigArgs() {}

    private InstanceFromMachineImageConfidentialInstanceConfigArgs(InstanceFromMachineImageConfidentialInstanceConfigArgs $) {
        this.enableConfidentialCompute = $.enableConfidentialCompute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromMachineImageConfidentialInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromMachineImageConfidentialInstanceConfigArgs $;

        public Builder() {
            $ = new InstanceFromMachineImageConfidentialInstanceConfigArgs();
        }

        public Builder(InstanceFromMachineImageConfidentialInstanceConfigArgs defaults) {
            $ = new InstanceFromMachineImageConfidentialInstanceConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableConfidentialCompute(Output<Boolean> enableConfidentialCompute) {
            $.enableConfidentialCompute = enableConfidentialCompute;
            return this;
        }

        public Builder enableConfidentialCompute(Boolean enableConfidentialCompute) {
            return enableConfidentialCompute(Output.of(enableConfidentialCompute));
        }

        public InstanceFromMachineImageConfidentialInstanceConfigArgs build() {
            $.enableConfidentialCompute = Objects.requireNonNull($.enableConfidentialCompute, "expected parameter 'enableConfidentialCompute' to be non-null");
            return $;
        }
    }

}
