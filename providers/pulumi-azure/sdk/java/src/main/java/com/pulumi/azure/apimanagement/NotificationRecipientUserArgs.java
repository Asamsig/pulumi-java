// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NotificationRecipientUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationRecipientUserArgs Empty = new NotificationRecipientUserArgs();

    /**
     * The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
     * 
     */
    @Import(name="apiManagementId", required=true)
    private Output<String> apiManagementId;

    /**
     * @return The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
     * 
     */
    public Output<String> apiManagementId() {
        return this.apiManagementId;
    }

    /**
     * The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
     * 
     */
    @Import(name="notificationType", required=true)
    private Output<String> notificationType;

    /**
     * @return The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
     * 
     */
    public Output<String> notificationType() {
        return this.notificationType;
    }

    /**
     * The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private NotificationRecipientUserArgs() {}

    private NotificationRecipientUserArgs(NotificationRecipientUserArgs $) {
        this.apiManagementId = $.apiManagementId;
        this.notificationType = $.notificationType;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationRecipientUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationRecipientUserArgs $;

        public Builder() {
            $ = new NotificationRecipientUserArgs();
        }

        public Builder(NotificationRecipientUserArgs defaults) {
            $ = new NotificationRecipientUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementId The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementId(Output<String> apiManagementId) {
            $.apiManagementId = apiManagementId;
            return this;
        }

        /**
         * @param apiManagementId The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementId(String apiManagementId) {
            return apiManagementId(Output.of(apiManagementId));
        }

        /**
         * @param notificationType The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
         * 
         * @return builder
         * 
         */
        public Builder notificationType(Output<String> notificationType) {
            $.notificationType = notificationType;
            return this;
        }

        /**
         * @param notificationType The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
         * 
         * @return builder
         * 
         */
        public Builder notificationType(String notificationType) {
            return notificationType(Output.of(notificationType));
        }

        /**
         * @param userId The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public NotificationRecipientUserArgs build() {
            $.apiManagementId = Objects.requireNonNull($.apiManagementId, "expected parameter 'apiManagementId' to be non-null");
            $.notificationType = Objects.requireNonNull($.notificationType, "expected parameter 'notificationType' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
