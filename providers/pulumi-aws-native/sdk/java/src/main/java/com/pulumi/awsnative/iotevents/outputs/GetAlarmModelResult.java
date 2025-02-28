// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.outputs;

import com.pulumi.awsnative.iotevents.outputs.AlarmModelAlarmCapabilities;
import com.pulumi.awsnative.iotevents.outputs.AlarmModelAlarmEventActions;
import com.pulumi.awsnative.iotevents.outputs.AlarmModelAlarmRule;
import com.pulumi.awsnative.iotevents.outputs.AlarmModelTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAlarmModelResult {
    private final @Nullable AlarmModelAlarmCapabilities alarmCapabilities;
    private final @Nullable AlarmModelAlarmEventActions alarmEventActions;
    /**
     * @return A brief description of the alarm model.
     * 
     */
    private final @Nullable String alarmModelDescription;
    private final @Nullable AlarmModelAlarmRule alarmRule;
    /**
     * @return The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * 
     */
    private final @Nullable String roleArn;
    /**
     * @return A non-negative integer that reflects the severity level of the alarm.
     * 
     */
    private final @Nullable Integer severity;
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     * For more information, see [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html).
     * 
     */
    private final @Nullable List<AlarmModelTag> tags;

    @CustomType.Constructor
    private GetAlarmModelResult(
        @CustomType.Parameter("alarmCapabilities") @Nullable AlarmModelAlarmCapabilities alarmCapabilities,
        @CustomType.Parameter("alarmEventActions") @Nullable AlarmModelAlarmEventActions alarmEventActions,
        @CustomType.Parameter("alarmModelDescription") @Nullable String alarmModelDescription,
        @CustomType.Parameter("alarmRule") @Nullable AlarmModelAlarmRule alarmRule,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("severity") @Nullable Integer severity,
        @CustomType.Parameter("tags") @Nullable List<AlarmModelTag> tags) {
        this.alarmCapabilities = alarmCapabilities;
        this.alarmEventActions = alarmEventActions;
        this.alarmModelDescription = alarmModelDescription;
        this.alarmRule = alarmRule;
        this.roleArn = roleArn;
        this.severity = severity;
        this.tags = tags;
    }

    public Optional<AlarmModelAlarmCapabilities> alarmCapabilities() {
        return Optional.ofNullable(this.alarmCapabilities);
    }
    public Optional<AlarmModelAlarmEventActions> alarmEventActions() {
        return Optional.ofNullable(this.alarmEventActions);
    }
    /**
     * @return A brief description of the alarm model.
     * 
     */
    public Optional<String> alarmModelDescription() {
        return Optional.ofNullable(this.alarmModelDescription);
    }
    public Optional<AlarmModelAlarmRule> alarmRule() {
        return Optional.ofNullable(this.alarmRule);
    }
    /**
     * @return The ARN of the role that grants permission to AWS IoT Events to perform its operations.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return A non-negative integer that reflects the severity level of the alarm.
     * 
     */
    public Optional<Integer> severity() {
        return Optional.ofNullable(this.severity);
    }
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     * For more information, see [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html).
     * 
     */
    public List<AlarmModelTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlarmModelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AlarmModelAlarmCapabilities alarmCapabilities;
        private @Nullable AlarmModelAlarmEventActions alarmEventActions;
        private @Nullable String alarmModelDescription;
        private @Nullable AlarmModelAlarmRule alarmRule;
        private @Nullable String roleArn;
        private @Nullable Integer severity;
        private @Nullable List<AlarmModelTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlarmModelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmCapabilities = defaults.alarmCapabilities;
    	      this.alarmEventActions = defaults.alarmEventActions;
    	      this.alarmModelDescription = defaults.alarmModelDescription;
    	      this.alarmRule = defaults.alarmRule;
    	      this.roleArn = defaults.roleArn;
    	      this.severity = defaults.severity;
    	      this.tags = defaults.tags;
        }

        public Builder alarmCapabilities(@Nullable AlarmModelAlarmCapabilities alarmCapabilities) {
            this.alarmCapabilities = alarmCapabilities;
            return this;
        }
        public Builder alarmEventActions(@Nullable AlarmModelAlarmEventActions alarmEventActions) {
            this.alarmEventActions = alarmEventActions;
            return this;
        }
        public Builder alarmModelDescription(@Nullable String alarmModelDescription) {
            this.alarmModelDescription = alarmModelDescription;
            return this;
        }
        public Builder alarmRule(@Nullable AlarmModelAlarmRule alarmRule) {
            this.alarmRule = alarmRule;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder severity(@Nullable Integer severity) {
            this.severity = severity;
            return this;
        }
        public Builder tags(@Nullable List<AlarmModelTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(AlarmModelTag... tags) {
            return tags(List.of(tags));
        }        public GetAlarmModelResult build() {
            return new GetAlarmModelResult(alarmCapabilities, alarmEventActions, alarmModelDescription, alarmRule, roleArn, severity, tags);
        }
    }
}
