// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.outputs;

import com.pulumi.azurenative.logz.outputs.FilteringTagResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogRulesResponse {
    /**
     * @return List of filtering tags to be used for capturing logs. This only takes effect if SendActivityLogs flag is enabled. If empty, all resources will be captured. If only Exclude action is specified, the rules will apply to the list of all available resources. If Include actions are specified, the rules will only include resources with the associated tags.
     * 
     */
    private final @Nullable List<FilteringTagResponse> filteringTags;
    /**
     * @return Flag specifying if AAD logs should be sent for the Monitor resource.
     * 
     */
    private final @Nullable Boolean sendAadLogs;
    /**
     * @return Flag specifying if activity logs from Azure resources should be sent for the Monitor resource.
     * 
     */
    private final @Nullable Boolean sendActivityLogs;
    /**
     * @return Flag specifying if subscription logs should be sent for the Monitor resource.
     * 
     */
    private final @Nullable Boolean sendSubscriptionLogs;

    @CustomType.Constructor
    private LogRulesResponse(
        @CustomType.Parameter("filteringTags") @Nullable List<FilteringTagResponse> filteringTags,
        @CustomType.Parameter("sendAadLogs") @Nullable Boolean sendAadLogs,
        @CustomType.Parameter("sendActivityLogs") @Nullable Boolean sendActivityLogs,
        @CustomType.Parameter("sendSubscriptionLogs") @Nullable Boolean sendSubscriptionLogs) {
        this.filteringTags = filteringTags;
        this.sendAadLogs = sendAadLogs;
        this.sendActivityLogs = sendActivityLogs;
        this.sendSubscriptionLogs = sendSubscriptionLogs;
    }

    /**
     * @return List of filtering tags to be used for capturing logs. This only takes effect if SendActivityLogs flag is enabled. If empty, all resources will be captured. If only Exclude action is specified, the rules will apply to the list of all available resources. If Include actions are specified, the rules will only include resources with the associated tags.
     * 
     */
    public List<FilteringTagResponse> filteringTags() {
        return this.filteringTags == null ? List.of() : this.filteringTags;
    }
    /**
     * @return Flag specifying if AAD logs should be sent for the Monitor resource.
     * 
     */
    public Optional<Boolean> sendAadLogs() {
        return Optional.ofNullable(this.sendAadLogs);
    }
    /**
     * @return Flag specifying if activity logs from Azure resources should be sent for the Monitor resource.
     * 
     */
    public Optional<Boolean> sendActivityLogs() {
        return Optional.ofNullable(this.sendActivityLogs);
    }
    /**
     * @return Flag specifying if subscription logs should be sent for the Monitor resource.
     * 
     */
    public Optional<Boolean> sendSubscriptionLogs() {
        return Optional.ofNullable(this.sendSubscriptionLogs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FilteringTagResponse> filteringTags;
        private @Nullable Boolean sendAadLogs;
        private @Nullable Boolean sendActivityLogs;
        private @Nullable Boolean sendSubscriptionLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(LogRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filteringTags = defaults.filteringTags;
    	      this.sendAadLogs = defaults.sendAadLogs;
    	      this.sendActivityLogs = defaults.sendActivityLogs;
    	      this.sendSubscriptionLogs = defaults.sendSubscriptionLogs;
        }

        public Builder filteringTags(@Nullable List<FilteringTagResponse> filteringTags) {
            this.filteringTags = filteringTags;
            return this;
        }
        public Builder filteringTags(FilteringTagResponse... filteringTags) {
            return filteringTags(List.of(filteringTags));
        }
        public Builder sendAadLogs(@Nullable Boolean sendAadLogs) {
            this.sendAadLogs = sendAadLogs;
            return this;
        }
        public Builder sendActivityLogs(@Nullable Boolean sendActivityLogs) {
            this.sendActivityLogs = sendActivityLogs;
            return this;
        }
        public Builder sendSubscriptionLogs(@Nullable Boolean sendSubscriptionLogs) {
            this.sendSubscriptionLogs = sendSubscriptionLogs;
            return this;
        }        public LogRulesResponse build() {
            return new LogRulesResponse(filteringTags, sendAadLogs, sendActivityLogs, sendSubscriptionLogs);
        }
    }
}
