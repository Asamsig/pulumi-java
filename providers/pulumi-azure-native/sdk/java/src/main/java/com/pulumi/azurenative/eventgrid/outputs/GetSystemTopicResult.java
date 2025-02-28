// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.outputs;

import com.pulumi.azurenative.eventgrid.outputs.IdentityInfoResponse;
import com.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSystemTopicResult {
    /**
     * @return Fully qualified identifier of the resource.
     * 
     */
    private final String id;
    /**
     * @return Identity information for the resource.
     * 
     */
    private final @Nullable IdentityInfoResponse identity;
    /**
     * @return Location of the resource.
     * 
     */
    private final String location;
    /**
     * @return Metric resource id for the system topic.
     * 
     */
    private final String metricResourceId;
    /**
     * @return Name of the resource.
     * 
     */
    private final String name;
    /**
     * @return Provisioning state of the system topic.
     * 
     */
    private final String provisioningState;
    /**
     * @return Source for the system topic.
     * 
     */
    private final @Nullable String source;
    /**
     * @return The system metadata relating to System Topic resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return TopicType for the system topic.
     * 
     */
    private final @Nullable String topicType;
    /**
     * @return Type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSystemTopicResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityInfoResponse identity,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("metricResourceId") String metricResourceId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("source") @Nullable String source,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("topicType") @Nullable String topicType,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.metricResourceId = metricResourceId;
        this.name = name;
        this.provisioningState = provisioningState;
        this.source = source;
        this.systemData = systemData;
        this.tags = tags;
        this.topicType = topicType;
        this.type = type;
    }

    /**
     * @return Fully qualified identifier of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identity information for the resource.
     * 
     */
    public Optional<IdentityInfoResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return Location of the resource.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Metric resource id for the system topic.
     * 
     */
    public String metricResourceId() {
        return this.metricResourceId;
    }
    /**
     * @return Name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Provisioning state of the system topic.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Source for the system topic.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return The system metadata relating to System Topic resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Tags of the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return TopicType for the system topic.
     * 
     */
    public Optional<String> topicType() {
        return Optional.ofNullable(this.topicType);
    }
    /**
     * @return Type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemTopicResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable IdentityInfoResponse identity;
        private String location;
        private String metricResourceId;
        private String name;
        private String provisioningState;
        private @Nullable String source;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable String topicType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSystemTopicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.metricResourceId = defaults.metricResourceId;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.source = defaults.source;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.topicType = defaults.topicType;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityInfoResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder metricResourceId(String metricResourceId) {
            this.metricResourceId = Objects.requireNonNull(metricResourceId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder topicType(@Nullable String topicType) {
            this.topicType = topicType;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSystemTopicResult build() {
            return new GetSystemTopicResult(id, identity, location, metricResourceId, name, provisioningState, source, systemData, tags, topicType, type);
        }
    }
}
