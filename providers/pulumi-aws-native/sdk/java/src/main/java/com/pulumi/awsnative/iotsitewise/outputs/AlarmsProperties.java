// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlarmsProperties {
    /**
     * @return The ARN of the IAM role that allows the alarm to perform actions and access AWS resources and services, such as AWS IoT Events.
     * 
     */
    private final @Nullable String alarmRoleArn;
    /**
     * @return The ARN of the AWS Lambda function that manages alarm notifications. For more information, see Managing alarm notifications in the AWS IoT Events Developer Guide.
     * 
     */
    private final @Nullable String notificationLambdaArn;

    @CustomType.Constructor
    private AlarmsProperties(
        @CustomType.Parameter("alarmRoleArn") @Nullable String alarmRoleArn,
        @CustomType.Parameter("notificationLambdaArn") @Nullable String notificationLambdaArn) {
        this.alarmRoleArn = alarmRoleArn;
        this.notificationLambdaArn = notificationLambdaArn;
    }

    /**
     * @return The ARN of the IAM role that allows the alarm to perform actions and access AWS resources and services, such as AWS IoT Events.
     * 
     */
    public Optional<String> alarmRoleArn() {
        return Optional.ofNullable(this.alarmRoleArn);
    }
    /**
     * @return The ARN of the AWS Lambda function that manages alarm notifications. For more information, see Managing alarm notifications in the AWS IoT Events Developer Guide.
     * 
     */
    public Optional<String> notificationLambdaArn() {
        return Optional.ofNullable(this.notificationLambdaArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmsProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alarmRoleArn;
        private @Nullable String notificationLambdaArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AlarmsProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmRoleArn = defaults.alarmRoleArn;
    	      this.notificationLambdaArn = defaults.notificationLambdaArn;
        }

        public Builder alarmRoleArn(@Nullable String alarmRoleArn) {
            this.alarmRoleArn = alarmRoleArn;
            return this;
        }
        public Builder notificationLambdaArn(@Nullable String notificationLambdaArn) {
            this.notificationLambdaArn = notificationLambdaArn;
            return this;
        }        public AlarmsProperties build() {
            return new AlarmsProperties(alarmRoleArn, notificationLambdaArn);
        }
    }
}
