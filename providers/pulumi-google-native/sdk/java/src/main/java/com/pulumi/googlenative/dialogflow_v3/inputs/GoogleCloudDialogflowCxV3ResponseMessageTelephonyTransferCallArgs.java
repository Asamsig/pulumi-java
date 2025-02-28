// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
 * 
 */
public final class GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs Empty = new GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs();

    /**
     * Transfer the call to a phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164).
     * 
     */
    @Import(name="phoneNumber")
    private @Nullable Output<String> phoneNumber;

    /**
     * @return Transfer the call to a phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164).
     * 
     */
    public Optional<Output<String>> phoneNumber() {
        return Optional.ofNullable(this.phoneNumber);
    }

    private GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs() {}

    private GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs(GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs $) {
        this.phoneNumber = $.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param phoneNumber Transfer the call to a phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164).
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(@Nullable Output<String> phoneNumber) {
            $.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * @param phoneNumber Transfer the call to a phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164).
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(String phoneNumber) {
            return phoneNumber(Output.of(phoneNumber));
        }

        public GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs build() {
            return $;
        }
    }

}
