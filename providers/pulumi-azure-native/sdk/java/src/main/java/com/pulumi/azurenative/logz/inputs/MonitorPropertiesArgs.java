// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.azurenative.logz.enums.MarketplaceSubscriptionStatus;
import com.pulumi.azurenative.logz.enums.MonitoringStatus;
import com.pulumi.azurenative.logz.inputs.LogzOrganizationPropertiesArgs;
import com.pulumi.azurenative.logz.inputs.PlanDataArgs;
import com.pulumi.azurenative.logz.inputs.UserInfoArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties specific to the monitor resource.
 * 
 */
public final class MonitorPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorPropertiesArgs Empty = new MonitorPropertiesArgs();

    @Import(name="logzOrganizationProperties")
    private @Nullable Output<LogzOrganizationPropertiesArgs> logzOrganizationProperties;

    public Optional<Output<LogzOrganizationPropertiesArgs>> logzOrganizationProperties() {
        return Optional.ofNullable(this.logzOrganizationProperties);
    }

    /**
     * Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
     * 
     */
    @Import(name="marketplaceSubscriptionStatus")
    private @Nullable Output<Either<String,MarketplaceSubscriptionStatus>> marketplaceSubscriptionStatus;

    /**
     * @return Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
     * 
     */
    public Optional<Output<Either<String,MarketplaceSubscriptionStatus>>> marketplaceSubscriptionStatus() {
        return Optional.ofNullable(this.marketplaceSubscriptionStatus);
    }

    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
     */
    @Import(name="monitoringStatus")
    private @Nullable Output<Either<String,MonitoringStatus>> monitoringStatus;

    /**
     * @return Flag specifying if the resource monitoring is enabled or disabled.
     * 
     */
    public Optional<Output<Either<String,MonitoringStatus>>> monitoringStatus() {
        return Optional.ofNullable(this.monitoringStatus);
    }

    @Import(name="planData")
    private @Nullable Output<PlanDataArgs> planData;

    public Optional<Output<PlanDataArgs>> planData() {
        return Optional.ofNullable(this.planData);
    }

    @Import(name="userInfo")
    private @Nullable Output<UserInfoArgs> userInfo;

    public Optional<Output<UserInfoArgs>> userInfo() {
        return Optional.ofNullable(this.userInfo);
    }

    private MonitorPropertiesArgs() {}

    private MonitorPropertiesArgs(MonitorPropertiesArgs $) {
        this.logzOrganizationProperties = $.logzOrganizationProperties;
        this.marketplaceSubscriptionStatus = $.marketplaceSubscriptionStatus;
        this.monitoringStatus = $.monitoringStatus;
        this.planData = $.planData;
        this.userInfo = $.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorPropertiesArgs $;

        public Builder() {
            $ = new MonitorPropertiesArgs();
        }

        public Builder(MonitorPropertiesArgs defaults) {
            $ = new MonitorPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder logzOrganizationProperties(@Nullable Output<LogzOrganizationPropertiesArgs> logzOrganizationProperties) {
            $.logzOrganizationProperties = logzOrganizationProperties;
            return this;
        }

        public Builder logzOrganizationProperties(LogzOrganizationPropertiesArgs logzOrganizationProperties) {
            return logzOrganizationProperties(Output.of(logzOrganizationProperties));
        }

        /**
         * @param marketplaceSubscriptionStatus Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
         * 
         * @return builder
         * 
         */
        public Builder marketplaceSubscriptionStatus(@Nullable Output<Either<String,MarketplaceSubscriptionStatus>> marketplaceSubscriptionStatus) {
            $.marketplaceSubscriptionStatus = marketplaceSubscriptionStatus;
            return this;
        }

        /**
         * @param marketplaceSubscriptionStatus Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
         * 
         * @return builder
         * 
         */
        public Builder marketplaceSubscriptionStatus(Either<String,MarketplaceSubscriptionStatus> marketplaceSubscriptionStatus) {
            return marketplaceSubscriptionStatus(Output.of(marketplaceSubscriptionStatus));
        }

        /**
         * @param marketplaceSubscriptionStatus Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
         * 
         * @return builder
         * 
         */
        public Builder marketplaceSubscriptionStatus(String marketplaceSubscriptionStatus) {
            return marketplaceSubscriptionStatus(Either.ofLeft(marketplaceSubscriptionStatus));
        }

        /**
         * @param marketplaceSubscriptionStatus Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
         * 
         * @return builder
         * 
         */
        public Builder marketplaceSubscriptionStatus(MarketplaceSubscriptionStatus marketplaceSubscriptionStatus) {
            return marketplaceSubscriptionStatus(Either.ofRight(marketplaceSubscriptionStatus));
        }

        /**
         * @param monitoringStatus Flag specifying if the resource monitoring is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder monitoringStatus(@Nullable Output<Either<String,MonitoringStatus>> monitoringStatus) {
            $.monitoringStatus = monitoringStatus;
            return this;
        }

        /**
         * @param monitoringStatus Flag specifying if the resource monitoring is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder monitoringStatus(Either<String,MonitoringStatus> monitoringStatus) {
            return monitoringStatus(Output.of(monitoringStatus));
        }

        /**
         * @param monitoringStatus Flag specifying if the resource monitoring is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder monitoringStatus(String monitoringStatus) {
            return monitoringStatus(Either.ofLeft(monitoringStatus));
        }

        /**
         * @param monitoringStatus Flag specifying if the resource monitoring is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder monitoringStatus(MonitoringStatus monitoringStatus) {
            return monitoringStatus(Either.ofRight(monitoringStatus));
        }

        public Builder planData(@Nullable Output<PlanDataArgs> planData) {
            $.planData = planData;
            return this;
        }

        public Builder planData(PlanDataArgs planData) {
            return planData(Output.of(planData));
        }

        public Builder userInfo(@Nullable Output<UserInfoArgs> userInfo) {
            $.userInfo = userInfo;
            return this;
        }

        public Builder userInfo(UserInfoArgs userInfo) {
            return userInfo(Output.of(userInfo));
        }

        public MonitorPropertiesArgs build() {
            return $;
        }
    }

}
