// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.awsnative.cloudfront.inputs.DistributionGeoRestrictionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class DistributionRestrictionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionRestrictionsArgs Empty = new DistributionRestrictionsArgs();

    @Import(name="geoRestriction", required=true)
    private Output<DistributionGeoRestrictionArgs> geoRestriction;

    public Output<DistributionGeoRestrictionArgs> geoRestriction() {
        return this.geoRestriction;
    }

    private DistributionRestrictionsArgs() {}

    private DistributionRestrictionsArgs(DistributionRestrictionsArgs $) {
        this.geoRestriction = $.geoRestriction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionRestrictionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionRestrictionsArgs $;

        public Builder() {
            $ = new DistributionRestrictionsArgs();
        }

        public Builder(DistributionRestrictionsArgs defaults) {
            $ = new DistributionRestrictionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder geoRestriction(Output<DistributionGeoRestrictionArgs> geoRestriction) {
            $.geoRestriction = geoRestriction;
            return this;
        }

        public Builder geoRestriction(DistributionGeoRestrictionArgs geoRestriction) {
            return geoRestriction(Output.of(geoRestriction));
        }

        public DistributionRestrictionsArgs build() {
            $.geoRestriction = Objects.requireNonNull($.geoRestriction, "expected parameter 'geoRestriction' to be non-null");
            return $;
        }
    }

}
