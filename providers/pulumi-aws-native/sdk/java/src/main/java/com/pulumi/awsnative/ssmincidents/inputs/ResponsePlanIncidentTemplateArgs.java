// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmincidents.inputs;

import com.pulumi.awsnative.ssmincidents.inputs.ResponsePlanNotificationTargetItemArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The incident template configuration.
 * 
 */
public final class ResponsePlanIncidentTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponsePlanIncidentTemplateArgs Empty = new ResponsePlanIncidentTemplateArgs();

    /**
     * The deduplication string.
     * 
     */
    @Import(name="dedupeString")
    private @Nullable Output<String> dedupeString;

    /**
     * @return The deduplication string.
     * 
     */
    public Optional<Output<String>> dedupeString() {
        return Optional.ofNullable(this.dedupeString);
    }

    /**
     * The impact value.
     * 
     */
    @Import(name="impact", required=true)
    private Output<Integer> impact;

    /**
     * @return The impact value.
     * 
     */
    public Output<Integer> impact() {
        return this.impact;
    }

    /**
     * The list of notification targets.
     * 
     */
    @Import(name="notificationTargets")
    private @Nullable Output<List<ResponsePlanNotificationTargetItemArgs>> notificationTargets;

    /**
     * @return The list of notification targets.
     * 
     */
    public Optional<Output<List<ResponsePlanNotificationTargetItemArgs>>> notificationTargets() {
        return Optional.ofNullable(this.notificationTargets);
    }

    /**
     * The summary string.
     * 
     */
    @Import(name="summary")
    private @Nullable Output<String> summary;

    /**
     * @return The summary string.
     * 
     */
    public Optional<Output<String>> summary() {
        return Optional.ofNullable(this.summary);
    }

    /**
     * The title string.
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    /**
     * @return The title string.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    private ResponsePlanIncidentTemplateArgs() {}

    private ResponsePlanIncidentTemplateArgs(ResponsePlanIncidentTemplateArgs $) {
        this.dedupeString = $.dedupeString;
        this.impact = $.impact;
        this.notificationTargets = $.notificationTargets;
        this.summary = $.summary;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponsePlanIncidentTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponsePlanIncidentTemplateArgs $;

        public Builder() {
            $ = new ResponsePlanIncidentTemplateArgs();
        }

        public Builder(ResponsePlanIncidentTemplateArgs defaults) {
            $ = new ResponsePlanIncidentTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dedupeString The deduplication string.
         * 
         * @return builder
         * 
         */
        public Builder dedupeString(@Nullable Output<String> dedupeString) {
            $.dedupeString = dedupeString;
            return this;
        }

        /**
         * @param dedupeString The deduplication string.
         * 
         * @return builder
         * 
         */
        public Builder dedupeString(String dedupeString) {
            return dedupeString(Output.of(dedupeString));
        }

        /**
         * @param impact The impact value.
         * 
         * @return builder
         * 
         */
        public Builder impact(Output<Integer> impact) {
            $.impact = impact;
            return this;
        }

        /**
         * @param impact The impact value.
         * 
         * @return builder
         * 
         */
        public Builder impact(Integer impact) {
            return impact(Output.of(impact));
        }

        /**
         * @param notificationTargets The list of notification targets.
         * 
         * @return builder
         * 
         */
        public Builder notificationTargets(@Nullable Output<List<ResponsePlanNotificationTargetItemArgs>> notificationTargets) {
            $.notificationTargets = notificationTargets;
            return this;
        }

        /**
         * @param notificationTargets The list of notification targets.
         * 
         * @return builder
         * 
         */
        public Builder notificationTargets(List<ResponsePlanNotificationTargetItemArgs> notificationTargets) {
            return notificationTargets(Output.of(notificationTargets));
        }

        /**
         * @param notificationTargets The list of notification targets.
         * 
         * @return builder
         * 
         */
        public Builder notificationTargets(ResponsePlanNotificationTargetItemArgs... notificationTargets) {
            return notificationTargets(List.of(notificationTargets));
        }

        /**
         * @param summary The summary string.
         * 
         * @return builder
         * 
         */
        public Builder summary(@Nullable Output<String> summary) {
            $.summary = summary;
            return this;
        }

        /**
         * @param summary The summary string.
         * 
         * @return builder
         * 
         */
        public Builder summary(String summary) {
            return summary(Output.of(summary));
        }

        /**
         * @param title The title string.
         * 
         * @return builder
         * 
         */
        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The title string.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public ResponsePlanIncidentTemplateArgs build() {
            $.impact = Objects.requireNonNull($.impact, "expected parameter 'impact' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}
