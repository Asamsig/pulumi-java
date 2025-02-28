// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActionGroupEventHubReceiverArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionGroupEventHubReceiverArgs Empty = new ActionGroupEventHubReceiverArgs();

    /**
     * The resource ID of the respective Event Hub.
     * 
     */
    @Import(name="eventHubId", required=true)
    private Output<String> eventHubId;

    /**
     * @return The resource ID of the respective Event Hub.
     * 
     */
    public Output<String> eventHubId() {
        return this.eventHubId;
    }

    /**
     * The name of the EventHub Receiver, must be unique within action group.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the EventHub Receiver, must be unique within action group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Tenant ID for the subscription containing this Event Hub.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The Tenant ID for the subscription containing this Event Hub.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Indicates whether to use common alert schema.
     * 
     */
    @Import(name="useCommonAlertSchema")
    private @Nullable Output<Boolean> useCommonAlertSchema;

    /**
     * @return Indicates whether to use common alert schema.
     * 
     */
    public Optional<Output<Boolean>> useCommonAlertSchema() {
        return Optional.ofNullable(this.useCommonAlertSchema);
    }

    private ActionGroupEventHubReceiverArgs() {}

    private ActionGroupEventHubReceiverArgs(ActionGroupEventHubReceiverArgs $) {
        this.eventHubId = $.eventHubId;
        this.name = $.name;
        this.tenantId = $.tenantId;
        this.useCommonAlertSchema = $.useCommonAlertSchema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionGroupEventHubReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionGroupEventHubReceiverArgs $;

        public Builder() {
            $ = new ActionGroupEventHubReceiverArgs();
        }

        public Builder(ActionGroupEventHubReceiverArgs defaults) {
            $ = new ActionGroupEventHubReceiverArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventHubId The resource ID of the respective Event Hub.
         * 
         * @return builder
         * 
         */
        public Builder eventHubId(Output<String> eventHubId) {
            $.eventHubId = eventHubId;
            return this;
        }

        /**
         * @param eventHubId The resource ID of the respective Event Hub.
         * 
         * @return builder
         * 
         */
        public Builder eventHubId(String eventHubId) {
            return eventHubId(Output.of(eventHubId));
        }

        /**
         * @param name The name of the EventHub Receiver, must be unique within action group.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the EventHub Receiver, must be unique within action group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tenantId The Tenant ID for the subscription containing this Event Hub.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Tenant ID for the subscription containing this Event Hub.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param useCommonAlertSchema Indicates whether to use common alert schema.
         * 
         * @return builder
         * 
         */
        public Builder useCommonAlertSchema(@Nullable Output<Boolean> useCommonAlertSchema) {
            $.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }

        /**
         * @param useCommonAlertSchema Indicates whether to use common alert schema.
         * 
         * @return builder
         * 
         */
        public Builder useCommonAlertSchema(Boolean useCommonAlertSchema) {
            return useCommonAlertSchema(Output.of(useCommonAlertSchema));
        }

        public ActionGroupEventHubReceiverArgs build() {
            $.eventHubId = Objects.requireNonNull($.eventHubId, "expected parameter 'eventHubId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
