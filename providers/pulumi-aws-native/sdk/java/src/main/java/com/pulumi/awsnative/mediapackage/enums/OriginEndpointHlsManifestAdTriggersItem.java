// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum OriginEndpointHlsManifestAdTriggersItem {
        SpliceInsert("SPLICE_INSERT"),
        Break("BREAK"),
        ProviderAdvertisement("PROVIDER_ADVERTISEMENT"),
        DistributorAdvertisement("DISTRIBUTOR_ADVERTISEMENT"),
        ProviderPlacementOpportunity("PROVIDER_PLACEMENT_OPPORTUNITY"),
        DistributorPlacementOpportunity("DISTRIBUTOR_PLACEMENT_OPPORTUNITY"),
        ProviderOverlayPlacementOpportunity("PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY"),
        DistributorOverlayPlacementOpportunity("DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY");

        private final String value;

        OriginEndpointHlsManifestAdTriggersItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OriginEndpointHlsManifestAdTriggersItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
