// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.emrcontainers.inputs;

import com.pulumi.awsnative.emrcontainers.inputs.VirtualClusterEksInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class VirtualClusterContainerInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualClusterContainerInfoArgs Empty = new VirtualClusterContainerInfoArgs();

    @Import(name="eksInfo", required=true)
    private Output<VirtualClusterEksInfoArgs> eksInfo;

    public Output<VirtualClusterEksInfoArgs> eksInfo() {
        return this.eksInfo;
    }

    private VirtualClusterContainerInfoArgs() {}

    private VirtualClusterContainerInfoArgs(VirtualClusterContainerInfoArgs $) {
        this.eksInfo = $.eksInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualClusterContainerInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualClusterContainerInfoArgs $;

        public Builder() {
            $ = new VirtualClusterContainerInfoArgs();
        }

        public Builder(VirtualClusterContainerInfoArgs defaults) {
            $ = new VirtualClusterContainerInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder eksInfo(Output<VirtualClusterEksInfoArgs> eksInfo) {
            $.eksInfo = eksInfo;
            return this;
        }

        public Builder eksInfo(VirtualClusterEksInfoArgs eksInfo) {
            return eksInfo(Output.of(eksInfo));
        }

        public VirtualClusterContainerInfoArgs build() {
            $.eksInfo = Objects.requireNonNull($.eksInfo, "expected parameter 'eksInfo' to be non-null");
            return $;
        }
    }

}
