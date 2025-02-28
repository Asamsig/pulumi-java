// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.AS2ProtocolSettingsArgs;
import com.pulumi.azurenative.logic.inputs.BusinessIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The integration account AS2 one-way agreement.
 * 
 */
public final class AS2OneWayAgreementArgs extends com.pulumi.resources.ResourceArgs {

    public static final AS2OneWayAgreementArgs Empty = new AS2OneWayAgreementArgs();

    /**
     * The AS2 protocol settings.
     * 
     */
    @Import(name="protocolSettings", required=true)
    private Output<AS2ProtocolSettingsArgs> protocolSettings;

    /**
     * @return The AS2 protocol settings.
     * 
     */
    public Output<AS2ProtocolSettingsArgs> protocolSettings() {
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

    private AS2OneWayAgreementArgs() {}

    private AS2OneWayAgreementArgs(AS2OneWayAgreementArgs $) {
        this.protocolSettings = $.protocolSettings;
        this.receiverBusinessIdentity = $.receiverBusinessIdentity;
        this.senderBusinessIdentity = $.senderBusinessIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AS2OneWayAgreementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AS2OneWayAgreementArgs $;

        public Builder() {
            $ = new AS2OneWayAgreementArgs();
        }

        public Builder(AS2OneWayAgreementArgs defaults) {
            $ = new AS2OneWayAgreementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param protocolSettings The AS2 protocol settings.
         * 
         * @return builder
         * 
         */
        public Builder protocolSettings(Output<AS2ProtocolSettingsArgs> protocolSettings) {
            $.protocolSettings = protocolSettings;
            return this;
        }

        /**
         * @param protocolSettings The AS2 protocol settings.
         * 
         * @return builder
         * 
         */
        public Builder protocolSettings(AS2ProtocolSettingsArgs protocolSettings) {
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

        public AS2OneWayAgreementArgs build() {
            $.protocolSettings = Objects.requireNonNull($.protocolSettings, "expected parameter 'protocolSettings' to be non-null");
            $.receiverBusinessIdentity = Objects.requireNonNull($.receiverBusinessIdentity, "expected parameter 'receiverBusinessIdentity' to be non-null");
            $.senderBusinessIdentity = Objects.requireNonNull($.senderBusinessIdentity, "expected parameter 'senderBusinessIdentity' to be non-null");
            return $;
        }
    }

}
