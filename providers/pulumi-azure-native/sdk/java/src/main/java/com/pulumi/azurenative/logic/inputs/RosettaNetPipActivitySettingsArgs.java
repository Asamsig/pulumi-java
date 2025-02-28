// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.RosettaNetPipActivityType;
import com.pulumi.azurenative.logic.inputs.RosettaNetPipAcknowledgmentOfReceiptSettingsArgs;
import com.pulumi.azurenative.logic.inputs.RosettaNetPipActivityBehaviorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The integration account RosettaNet ProcessConfiguration activity settings.
 * 
 */
public final class RosettaNetPipActivitySettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RosettaNetPipActivitySettingsArgs Empty = new RosettaNetPipActivitySettingsArgs();

    /**
     * The RosettaNet ProcessConfiguration acknowledgement settings.
     * 
     */
    @Import(name="acknowledgmentOfReceiptSettings", required=true)
    private Output<RosettaNetPipAcknowledgmentOfReceiptSettingsArgs> acknowledgmentOfReceiptSettings;

    /**
     * @return The RosettaNet ProcessConfiguration acknowledgement settings.
     * 
     */
    public Output<RosettaNetPipAcknowledgmentOfReceiptSettingsArgs> acknowledgmentOfReceiptSettings() {
        return this.acknowledgmentOfReceiptSettings;
    }

    /**
     * The RosettaNet ProcessConfiguration activity behavior.
     * 
     */
    @Import(name="activityBehavior", required=true)
    private Output<RosettaNetPipActivityBehaviorArgs> activityBehavior;

    /**
     * @return The RosettaNet ProcessConfiguration activity behavior.
     * 
     */
    public Output<RosettaNetPipActivityBehaviorArgs> activityBehavior() {
        return this.activityBehavior;
    }

    /**
     * The RosettaNet ProcessConfiguration activity type.
     * 
     */
    @Import(name="activityType", required=true)
    private Output<RosettaNetPipActivityType> activityType;

    /**
     * @return The RosettaNet ProcessConfiguration activity type.
     * 
     */
    public Output<RosettaNetPipActivityType> activityType() {
        return this.activityType;
    }

    private RosettaNetPipActivitySettingsArgs() {}

    private RosettaNetPipActivitySettingsArgs(RosettaNetPipActivitySettingsArgs $) {
        this.acknowledgmentOfReceiptSettings = $.acknowledgmentOfReceiptSettings;
        this.activityBehavior = $.activityBehavior;
        this.activityType = $.activityType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RosettaNetPipActivitySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RosettaNetPipActivitySettingsArgs $;

        public Builder() {
            $ = new RosettaNetPipActivitySettingsArgs();
        }

        public Builder(RosettaNetPipActivitySettingsArgs defaults) {
            $ = new RosettaNetPipActivitySettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acknowledgmentOfReceiptSettings The RosettaNet ProcessConfiguration acknowledgement settings.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgmentOfReceiptSettings(Output<RosettaNetPipAcknowledgmentOfReceiptSettingsArgs> acknowledgmentOfReceiptSettings) {
            $.acknowledgmentOfReceiptSettings = acknowledgmentOfReceiptSettings;
            return this;
        }

        /**
         * @param acknowledgmentOfReceiptSettings The RosettaNet ProcessConfiguration acknowledgement settings.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgmentOfReceiptSettings(RosettaNetPipAcknowledgmentOfReceiptSettingsArgs acknowledgmentOfReceiptSettings) {
            return acknowledgmentOfReceiptSettings(Output.of(acknowledgmentOfReceiptSettings));
        }

        /**
         * @param activityBehavior The RosettaNet ProcessConfiguration activity behavior.
         * 
         * @return builder
         * 
         */
        public Builder activityBehavior(Output<RosettaNetPipActivityBehaviorArgs> activityBehavior) {
            $.activityBehavior = activityBehavior;
            return this;
        }

        /**
         * @param activityBehavior The RosettaNet ProcessConfiguration activity behavior.
         * 
         * @return builder
         * 
         */
        public Builder activityBehavior(RosettaNetPipActivityBehaviorArgs activityBehavior) {
            return activityBehavior(Output.of(activityBehavior));
        }

        /**
         * @param activityType The RosettaNet ProcessConfiguration activity type.
         * 
         * @return builder
         * 
         */
        public Builder activityType(Output<RosettaNetPipActivityType> activityType) {
            $.activityType = activityType;
            return this;
        }

        /**
         * @param activityType The RosettaNet ProcessConfiguration activity type.
         * 
         * @return builder
         * 
         */
        public Builder activityType(RosettaNetPipActivityType activityType) {
            return activityType(Output.of(activityType));
        }

        public RosettaNetPipActivitySettingsArgs build() {
            $.acknowledgmentOfReceiptSettings = Objects.requireNonNull($.acknowledgmentOfReceiptSettings, "expected parameter 'acknowledgmentOfReceiptSettings' to be non-null");
            $.activityBehavior = Objects.requireNonNull($.activityBehavior, "expected parameter 'activityBehavior' to be non-null");
            $.activityType = Objects.requireNonNull($.activityType, "expected parameter 'activityType' to be non-null");
            return $;
        }
    }

}
