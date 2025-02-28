// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ConfidentialNodes is configuration for the confidential nodes feature, which makes nodes run on confidential VMs.
 * 
 */
public final class ConfidentialNodesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfidentialNodesArgs Empty = new ConfidentialNodesArgs();

    /**
     * Whether Confidential Nodes feature is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether Confidential Nodes feature is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ConfidentialNodesArgs() {}

    private ConfidentialNodesArgs(ConfidentialNodesArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfidentialNodesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfidentialNodesArgs $;

        public Builder() {
            $ = new ConfidentialNodesArgs();
        }

        public Builder(ConfidentialNodesArgs defaults) {
            $ = new ConfidentialNodesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether Confidential Nodes feature is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether Confidential Nodes feature is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ConfidentialNodesArgs build() {
            return $;
        }
    }

}
