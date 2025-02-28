// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a response message that can be returned by a conversational agent. Response messages are also used for output audio synthesis. The approach is as follows: * If at least one OutputAudioText response is present, then all OutputAudioText responses are linearly concatenated, and the result is used for output audio synthesis. * If the OutputAudioText responses are a mixture of text and SSML, then the concatenated result is treated as SSML; otherwise, the result is treated as either text or SSML as appropriate. The agent designer should ideally use either text or SSML consistently throughout the bot design. * Otherwise, all Text responses are linearly concatenated, and the result is used for output audio synthesis. This approach allows for more sophisticated user experience scenarios, where the text displayed to the user may differ from what is heard.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessageArgs Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessageArgs();

    /**
     * Indicates that the conversation succeeded.
     * 
     */
    @Import(name="conversationSuccess")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessArgs> conversationSuccess;

    /**
     * @return Indicates that the conversation succeeded.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessArgs>> conversationSuccess() {
        return Optional.ofNullable(this.conversationSuccess);
    }

    /**
     * Hands off conversation to a human agent.
     * 
     */
    @Import(name="liveAgentHandoff")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs> liveAgentHandoff;

    /**
     * @return Hands off conversation to a human agent.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs>> liveAgentHandoff() {
        return Optional.ofNullable(this.liveAgentHandoff);
    }

    /**
     * A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     * 
     */
    @Import(name="outputAudioText")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextArgs> outputAudioText;

    /**
     * @return A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextArgs>> outputAudioText() {
        return Optional.ofNullable(this.outputAudioText);
    }

    /**
     * Returns a response containing a custom, platform-specific payload.
     * 
     */
    @Import(name="payload")
    private @Nullable Output<Map<String,String>> payload;

    /**
     * @return Returns a response containing a custom, platform-specific payload.
     * 
     */
    public Optional<Output<Map<String,String>>> payload() {
        return Optional.ofNullable(this.payload);
    }

    /**
     * Signal that the client should play an audio clip hosted at a client-specific URI. Dialogflow uses this to construct mixed_audio. However, Dialogflow itself does not try to read or process the URI in any way.
     * 
     */
    @Import(name="playAudio")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs> playAudio;

    /**
     * @return Signal that the client should play an audio clip hosted at a client-specific URI. Dialogflow uses this to construct mixed_audio. However, Dialogflow itself does not try to read or process the URI in any way.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs>> playAudio() {
        return Optional.ofNullable(this.playAudio);
    }

    /**
     * A signal that the client should transfer the phone call connected to this agent to a third-party endpoint.
     * 
     */
    @Import(name="telephonyTransferCall")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs> telephonyTransferCall;

    /**
     * @return A signal that the client should transfer the phone call connected to this agent to a third-party endpoint.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs>> telephonyTransferCall() {
        return Optional.ofNullable(this.telephonyTransferCall);
    }

    /**
     * Returns a text response.
     * 
     */
    @Import(name="text")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs> text;

    /**
     * @return Returns a text response.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs>> text() {
        return Optional.ofNullable(this.text);
    }

    private GoogleCloudDialogflowCxV3beta1ResponseMessageArgs() {}

    private GoogleCloudDialogflowCxV3beta1ResponseMessageArgs(GoogleCloudDialogflowCxV3beta1ResponseMessageArgs $) {
        this.conversationSuccess = $.conversationSuccess;
        this.liveAgentHandoff = $.liveAgentHandoff;
        this.outputAudioText = $.outputAudioText;
        this.payload = $.payload;
        this.playAudio = $.playAudio;
        this.telephonyTransferCall = $.telephonyTransferCall;
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1ResponseMessageArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1ResponseMessageArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1ResponseMessageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conversationSuccess Indicates that the conversation succeeded.
         * 
         * @return builder
         * 
         */
        public Builder conversationSuccess(@Nullable Output<GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessArgs> conversationSuccess) {
            $.conversationSuccess = conversationSuccess;
            return this;
        }

        /**
         * @param conversationSuccess Indicates that the conversation succeeded.
         * 
         * @return builder
         * 
         */
        public Builder conversationSuccess(GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessArgs conversationSuccess) {
            return conversationSuccess(Output.of(conversationSuccess));
        }

        /**
         * @param liveAgentHandoff Hands off conversation to a human agent.
         * 
         * @return builder
         * 
         */
        public Builder liveAgentHandoff(@Nullable Output<GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs> liveAgentHandoff) {
            $.liveAgentHandoff = liveAgentHandoff;
            return this;
        }

        /**
         * @param liveAgentHandoff Hands off conversation to a human agent.
         * 
         * @return builder
         * 
         */
        public Builder liveAgentHandoff(GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs liveAgentHandoff) {
            return liveAgentHandoff(Output.of(liveAgentHandoff));
        }

        /**
         * @param outputAudioText A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
         * 
         * @return builder
         * 
         */
        public Builder outputAudioText(@Nullable Output<GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextArgs> outputAudioText) {
            $.outputAudioText = outputAudioText;
            return this;
        }

        /**
         * @param outputAudioText A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
         * 
         * @return builder
         * 
         */
        public Builder outputAudioText(GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextArgs outputAudioText) {
            return outputAudioText(Output.of(outputAudioText));
        }

        /**
         * @param payload Returns a response containing a custom, platform-specific payload.
         * 
         * @return builder
         * 
         */
        public Builder payload(@Nullable Output<Map<String,String>> payload) {
            $.payload = payload;
            return this;
        }

        /**
         * @param payload Returns a response containing a custom, platform-specific payload.
         * 
         * @return builder
         * 
         */
        public Builder payload(Map<String,String> payload) {
            return payload(Output.of(payload));
        }

        /**
         * @param playAudio Signal that the client should play an audio clip hosted at a client-specific URI. Dialogflow uses this to construct mixed_audio. However, Dialogflow itself does not try to read or process the URI in any way.
         * 
         * @return builder
         * 
         */
        public Builder playAudio(@Nullable Output<GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs> playAudio) {
            $.playAudio = playAudio;
            return this;
        }

        /**
         * @param playAudio Signal that the client should play an audio clip hosted at a client-specific URI. Dialogflow uses this to construct mixed_audio. However, Dialogflow itself does not try to read or process the URI in any way.
         * 
         * @return builder
         * 
         */
        public Builder playAudio(GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs playAudio) {
            return playAudio(Output.of(playAudio));
        }

        /**
         * @param telephonyTransferCall A signal that the client should transfer the phone call connected to this agent to a third-party endpoint.
         * 
         * @return builder
         * 
         */
        public Builder telephonyTransferCall(@Nullable Output<GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs> telephonyTransferCall) {
            $.telephonyTransferCall = telephonyTransferCall;
            return this;
        }

        /**
         * @param telephonyTransferCall A signal that the client should transfer the phone call connected to this agent to a third-party endpoint.
         * 
         * @return builder
         * 
         */
        public Builder telephonyTransferCall(GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs telephonyTransferCall) {
            return telephonyTransferCall(Output.of(telephonyTransferCall));
        }

        /**
         * @param text Returns a text response.
         * 
         * @return builder
         * 
         */
        public Builder text(@Nullable Output<GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text Returns a text response.
         * 
         * @return builder
         * 
         */
        public Builder text(GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs text) {
            return text(Output.of(text));
        }

        public GoogleCloudDialogflowCxV3beta1ResponseMessageArgs build() {
            return $;
        }
    }

}
