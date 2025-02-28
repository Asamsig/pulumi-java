// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.outputs;

import com.pulumi.awsnative.iotevents.outputs.AlarmModelPayload;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlarmModelIotTopicPublish {
    /**
     * @return The MQTT topic of the message. You can use a string expression that includes variables (`$variable.&lt;variable-name&gt;`) and input values (`$input.&lt;input-name&gt;.&lt;path-to-datum&gt;`) as the topic string.
     * 
     */
    private final String mqttTopic;
    private final @Nullable AlarmModelPayload payload;

    @CustomType.Constructor
    private AlarmModelIotTopicPublish(
        @CustomType.Parameter("mqttTopic") String mqttTopic,
        @CustomType.Parameter("payload") @Nullable AlarmModelPayload payload) {
        this.mqttTopic = mqttTopic;
        this.payload = payload;
    }

    /**
     * @return The MQTT topic of the message. You can use a string expression that includes variables (`$variable.&lt;variable-name&gt;`) and input values (`$input.&lt;input-name&gt;.&lt;path-to-datum&gt;`) as the topic string.
     * 
     */
    public String mqttTopic() {
        return this.mqttTopic;
    }
    public Optional<AlarmModelPayload> payload() {
        return Optional.ofNullable(this.payload);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmModelIotTopicPublish defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mqttTopic;
        private @Nullable AlarmModelPayload payload;

        public Builder() {
    	      // Empty
        }

        public Builder(AlarmModelIotTopicPublish defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mqttTopic = defaults.mqttTopic;
    	      this.payload = defaults.payload;
        }

        public Builder mqttTopic(String mqttTopic) {
            this.mqttTopic = Objects.requireNonNull(mqttTopic);
            return this;
        }
        public Builder payload(@Nullable AlarmModelPayload payload) {
            this.payload = payload;
            return this;
        }        public AlarmModelIotTopicPublish build() {
            return new AlarmModelIotTopicPublish(mqttTopic, payload);
        }
    }
}
