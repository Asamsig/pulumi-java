// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse {
    /**
     * @return The phone number to transfer the call to in [E.164 format](https://en.wikipedia.org/wiki/E.164). We currently only allow transferring to US numbers (+1xxxyyyzzzz).
     * 
     */
    private final String phoneNumber;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse(@CustomType.Parameter("phoneNumber") String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return The phone number to transfer the call to in [E.164 format](https://en.wikipedia.org/wiki/E.164). We currently only allow transferring to US numbers (+1xxxyyyzzzz).
     * 
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse(phoneNumber);
        }
    }
}
