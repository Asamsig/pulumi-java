// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.inputs;

import com.pulumi.awsnative.applicationinsights.enums.ApplicationLogEncoding;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A log to be monitored for the component.
 * 
 */
public final class ApplicationLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationLogArgs Empty = new ApplicationLogArgs();

    /**
     * The type of encoding of the logs to be monitored.
     * 
     */
    @Import(name="encoding")
    private @Nullable Output<ApplicationLogEncoding> encoding;

    /**
     * @return The type of encoding of the logs to be monitored.
     * 
     */
    public Optional<Output<ApplicationLogEncoding>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    /**
     * The CloudWatch log group name to be associated to the monitored log.
     * 
     */
    @Import(name="logGroupName")
    private @Nullable Output<String> logGroupName;

    /**
     * @return The CloudWatch log group name to be associated to the monitored log.
     * 
     */
    public Optional<Output<String>> logGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }

    /**
     * The path of the logs to be monitored.
     * 
     */
    @Import(name="logPath")
    private @Nullable Output<String> logPath;

    /**
     * @return The path of the logs to be monitored.
     * 
     */
    public Optional<Output<String>> logPath() {
        return Optional.ofNullable(this.logPath);
    }

    /**
     * The log type decides the log patterns against which Application Insights analyzes the log.
     * 
     */
    @Import(name="logType", required=true)
    private Output<String> logType;

    /**
     * @return The log type decides the log patterns against which Application Insights analyzes the log.
     * 
     */
    public Output<String> logType() {
        return this.logType;
    }

    /**
     * The name of the log pattern set.
     * 
     */
    @Import(name="patternSet")
    private @Nullable Output<String> patternSet;

    /**
     * @return The name of the log pattern set.
     * 
     */
    public Optional<Output<String>> patternSet() {
        return Optional.ofNullable(this.patternSet);
    }

    private ApplicationLogArgs() {}

    private ApplicationLogArgs(ApplicationLogArgs $) {
        this.encoding = $.encoding;
        this.logGroupName = $.logGroupName;
        this.logPath = $.logPath;
        this.logType = $.logType;
        this.patternSet = $.patternSet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationLogArgs $;

        public Builder() {
            $ = new ApplicationLogArgs();
        }

        public Builder(ApplicationLogArgs defaults) {
            $ = new ApplicationLogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encoding The type of encoding of the logs to be monitored.
         * 
         * @return builder
         * 
         */
        public Builder encoding(@Nullable Output<ApplicationLogEncoding> encoding) {
            $.encoding = encoding;
            return this;
        }

        /**
         * @param encoding The type of encoding of the logs to be monitored.
         * 
         * @return builder
         * 
         */
        public Builder encoding(ApplicationLogEncoding encoding) {
            return encoding(Output.of(encoding));
        }

        /**
         * @param logGroupName The CloudWatch log group name to be associated to the monitored log.
         * 
         * @return builder
         * 
         */
        public Builder logGroupName(@Nullable Output<String> logGroupName) {
            $.logGroupName = logGroupName;
            return this;
        }

        /**
         * @param logGroupName The CloudWatch log group name to be associated to the monitored log.
         * 
         * @return builder
         * 
         */
        public Builder logGroupName(String logGroupName) {
            return logGroupName(Output.of(logGroupName));
        }

        /**
         * @param logPath The path of the logs to be monitored.
         * 
         * @return builder
         * 
         */
        public Builder logPath(@Nullable Output<String> logPath) {
            $.logPath = logPath;
            return this;
        }

        /**
         * @param logPath The path of the logs to be monitored.
         * 
         * @return builder
         * 
         */
        public Builder logPath(String logPath) {
            return logPath(Output.of(logPath));
        }

        /**
         * @param logType The log type decides the log patterns against which Application Insights analyzes the log.
         * 
         * @return builder
         * 
         */
        public Builder logType(Output<String> logType) {
            $.logType = logType;
            return this;
        }

        /**
         * @param logType The log type decides the log patterns against which Application Insights analyzes the log.
         * 
         * @return builder
         * 
         */
        public Builder logType(String logType) {
            return logType(Output.of(logType));
        }

        /**
         * @param patternSet The name of the log pattern set.
         * 
         * @return builder
         * 
         */
        public Builder patternSet(@Nullable Output<String> patternSet) {
            $.patternSet = patternSet;
            return this;
        }

        /**
         * @param patternSet The name of the log pattern set.
         * 
         * @return builder
         * 
         */
        public Builder patternSet(String patternSet) {
            return patternSet(Output.of(patternSet));
        }

        public ApplicationLogArgs build() {
            $.logType = Objects.requireNonNull($.logType, "expected parameter 'logType' to be non-null");
            return $;
        }
    }

}
