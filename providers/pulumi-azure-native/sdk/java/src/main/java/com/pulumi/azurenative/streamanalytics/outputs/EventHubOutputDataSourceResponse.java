// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventHubOutputDataSourceResponse {
    /**
     * @return The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String eventHubName;
    /**
     * @return The key/column that is used to determine to which partition to send event data.
     * 
     */
    private final @Nullable String partitionKey;
    /**
     * @return The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String serviceBusNamespace;
    /**
     * @return The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String sharedAccessPolicyKey;
    /**
     * @return The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String sharedAccessPolicyName;
    /**
     * @return Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.ServiceBus/EventHub&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private EventHubOutputDataSourceResponse(
        @CustomType.Parameter("eventHubName") @Nullable String eventHubName,
        @CustomType.Parameter("partitionKey") @Nullable String partitionKey,
        @CustomType.Parameter("serviceBusNamespace") @Nullable String serviceBusNamespace,
        @CustomType.Parameter("sharedAccessPolicyKey") @Nullable String sharedAccessPolicyKey,
        @CustomType.Parameter("sharedAccessPolicyName") @Nullable String sharedAccessPolicyName,
        @CustomType.Parameter("type") String type) {
        this.eventHubName = eventHubName;
        this.partitionKey = partitionKey;
        this.serviceBusNamespace = serviceBusNamespace;
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        this.type = type;
    }

    /**
     * @return The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> eventHubName() {
        return Optional.ofNullable(this.eventHubName);
    }
    /**
     * @return The key/column that is used to determine to which partition to send event data.
     * 
     */
    public Optional<String> partitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }
    /**
     * @return The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> serviceBusNamespace() {
        return Optional.ofNullable(this.serviceBusNamespace);
    }
    /**
     * @return The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> sharedAccessPolicyKey() {
        return Optional.ofNullable(this.sharedAccessPolicyKey);
    }
    /**
     * @return The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> sharedAccessPolicyName() {
        return Optional.ofNullable(this.sharedAccessPolicyName);
    }
    /**
     * @return Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.ServiceBus/EventHub&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eventHubName;
        private @Nullable String partitionKey;
        private @Nullable String serviceBusNamespace;
        private @Nullable String sharedAccessPolicyKey;
        private @Nullable String sharedAccessPolicyName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubOutputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubName = defaults.eventHubName;
    	      this.partitionKey = defaults.partitionKey;
    	      this.serviceBusNamespace = defaults.serviceBusNamespace;
    	      this.sharedAccessPolicyKey = defaults.sharedAccessPolicyKey;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.type = defaults.type;
        }

        public Builder eventHubName(@Nullable String eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }
        public Builder partitionKey(@Nullable String partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Builder serviceBusNamespace(@Nullable String serviceBusNamespace) {
            this.serviceBusNamespace = serviceBusNamespace;
            return this;
        }
        public Builder sharedAccessPolicyKey(@Nullable String sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }
        public Builder sharedAccessPolicyName(@Nullable String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public EventHubOutputDataSourceResponse build() {
            return new EventHubOutputDataSourceResponse(eventHubName, partitionKey, serviceBusNamespace, sharedAccessPolicyKey, sharedAccessPolicyName, type);
        }
    }
}
