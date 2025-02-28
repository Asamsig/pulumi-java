// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.awsnative.mediapackage.inputs.OriginEndpointSpekeKeyProviderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * A Microsoft Smooth Streaming (MSS) encryption configuration.
 * 
 */
public final class OriginEndpointMssEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final OriginEndpointMssEncryptionArgs Empty = new OriginEndpointMssEncryptionArgs();

    @Import(name="spekeKeyProvider", required=true)
    private Output<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider;

    public Output<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    private OriginEndpointMssEncryptionArgs() {}

    private OriginEndpointMssEncryptionArgs(OriginEndpointMssEncryptionArgs $) {
        this.spekeKeyProvider = $.spekeKeyProvider;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OriginEndpointMssEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginEndpointMssEncryptionArgs $;

        public Builder() {
            $ = new OriginEndpointMssEncryptionArgs();
        }

        public Builder(OriginEndpointMssEncryptionArgs defaults) {
            $ = new OriginEndpointMssEncryptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder spekeKeyProvider(Output<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider) {
            $.spekeKeyProvider = spekeKeyProvider;
            return this;
        }

        public Builder spekeKeyProvider(OriginEndpointSpekeKeyProviderArgs spekeKeyProvider) {
            return spekeKeyProvider(Output.of(spekeKeyProvider));
        }

        public OriginEndpointMssEncryptionArgs build() {
            $.spekeKeyProvider = Objects.requireNonNull($.spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
            return $;
        }
    }

}
