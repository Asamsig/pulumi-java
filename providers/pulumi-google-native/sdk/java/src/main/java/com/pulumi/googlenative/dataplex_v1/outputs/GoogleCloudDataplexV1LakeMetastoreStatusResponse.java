// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDataplexV1LakeMetastoreStatusResponse {
    /**
     * @return The URI of the endpoint used to access the Metastore service.
     * 
     */
    private final String endpoint;
    /**
     * @return Additional information about the current status.
     * 
     */
    private final String message;
    /**
     * @return Current state of association.
     * 
     */
    private final String state;
    /**
     * @return Last update time of the metastore status of the lake.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GoogleCloudDataplexV1LakeMetastoreStatusResponse(
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.endpoint = endpoint;
        this.message = message;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * @return The URI of the endpoint used to access the Metastore service.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return Additional information about the current status.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return Current state of association.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Last update time of the metastore status of the lake.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDataplexV1LakeMetastoreStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private String message;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDataplexV1LakeMetastoreStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.message = defaults.message;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GoogleCloudDataplexV1LakeMetastoreStatusResponse build() {
            return new GoogleCloudDataplexV1LakeMetastoreStatusResponse(endpoint, message, state, updateTime);
        }
    }
}
