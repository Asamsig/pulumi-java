// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.BusinessIdentityArgs;
import com.pulumi.azurenative.logic.inputs.EdifactProtocolSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The Edifact one way agreement.
 * 
 */
public final class EdifactOneWayAgreementArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdifactOneWayAgreementArgs Empty = new EdifactOneWayAgreementArgs();

    /**
     * The EDIFACT protocol settings.
     * 
     */
    @Import(name="protocolSettings", required=true)
    private Output<EdifactProtocolSettingsArgs> protocolSettings;

    /**
     * @return The EDIFACT protocol settings.
     * 
     */
    public Output<EdifactProtocolSettingsArgs> protocolSettings() {
        return this.protocolSettings;
    }

    /**
     * The receiver business identity
     * 
     */
    @Import(name="receiverBusinessIdentity", required=true)
    private Output<BusinessIdentityArgs> receiverBusinessIdentity;

    /**
     * @return The receiver business identity
     * 
     */
    public Output<BusinessIdentityArgs> receiverBusinessIdentity() {
        return this.receiverBusinessIdentity;
    }

    /**
     * The sender business identity
     * 
     */
    @Import(name="senderBusinessIdentity", required=true)
    private Output<BusinessIdentityArgs> senderBusinessIdentity;

    /**
     * @return The sender business identity
     * 
     */
    public Output<BusinessIdentityArgs> senderBusinessIdentity() {
        return this.senderBusinessIdentity;
    }

    private EdifactOneWayAgreementArgs() {}

    private EdifactOneWayAgreementArgs(EdifactOneWayAgreementArgs $) {
        this.protocolSettings = $.protocolSettings;
        this.receiverBusinessIdentity = $.receiverBusinessIdentity;
        this.senderBusinessIdentity = $.senderBusinessIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdifactOneWayAgreementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdifactOneWayAgreementArgs $;

        public Builder() {
            $ = new EdifactOneWayAgreementArgs();
        }

        public Builder(EdifactOneWayAgreementArgs defaults) {
            $ = new EdifactOneWayAgreementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param protocolSettings The EDIFACT protocol settings.
         * 
         * @return builder
         * 
         */
        public Builder protocolSettings(Output<EdifactProtocolSettingsArgs> protocolSettings) {
            $.protocolSettings = protocolSettings;
            return this;
        }

        /**
         * @param protocolSettings The EDIFACT protocol settings.
         * 
         * @return builder
         * 
         */
        public Builder protocolSettings(EdifactProtocolSettingsArgs protocolSettings) {
            return protocolSettings(Output.of(protocolSettings));
        }

        /**
         * @param receiverBusinessIdentity The receiver business identity
         * 
         * @return builder
         * 
         */
        public Builder receiverBusinessIdentity(Output<BusinessIdentityArgs> receiverBusinessIdentity) {
            $.receiverBusinessIdentity = receiverBusinessIdentity;
            return this;
        }

        /**
         * @param receiverBusinessIdentity The receiver business identity
         * 
         * @return builder
         * 
         */
        public Builder receiverBusinessIdentity(BusinessIdentityArgs receiverBusinessIdentity) {
            return receiverBusinessIdentity(Output.of(receiverBusinessIdentity));
        }

        /**
         * @param senderBusinessIdentity The sender business identity
         * 
         * @return builder
         * 
         */
        public Builder senderBusinessIdentity(Output<BusinessIdentityArgs> senderBusinessIdentity) {
            $.senderBusinessIdentity = senderBusinessIdentity;
            return this;
        }

        /**
         * @param senderBusinessIdentity The sender business identity
         * 
         * @return builder
         * 
         */
        public Builder senderBusinessIdentity(BusinessIdentityArgs senderBusinessIdentity) {
            return senderBusinessIdentity(Output.of(senderBusinessIdentity));
        }

        public EdifactOneWayAgreementArgs build() {
            $.protocolSettings = Objects.requireNonNull($.protocolSettings, "expected parameter 'protocolSettings' to be non-null");
            $.receiverBusinessIdentity = Objects.requireNonNull($.receiverBusinessIdentity, "expected parameter 'receiverBusinessIdentity' to be non-null");
            $.senderBusinessIdentity = Objects.requireNonNull($.senderBusinessIdentity, "expected parameter 'senderBusinessIdentity' to be non-null");
            return $;
        }
    }

}
