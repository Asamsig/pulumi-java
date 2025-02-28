// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ids_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.ids_v1.enums.EndpointSeverity;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointArgs Empty = new EndpointArgs();

    /**
     * User-provided description of the endpoint
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User-provided description of the endpoint
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Required. The endpoint identifier. This will be part of the endpoint&#39;s resource name. This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, or hyphens, and cannot end with a hyphen. Values that do not match this pattern will trigger an INVALID_ARGUMENT error.
     * 
     */
    @Import(name="endpointId", required=true)
    private Output<String> endpointId;

    /**
     * @return Required. The endpoint identifier. This will be part of the endpoint&#39;s resource name. This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, or hyphens, and cannot end with a hyphen. Values that do not match this pattern will trigger an INVALID_ARGUMENT error.
     * 
     */
    public Output<String> endpointId() {
        return this.endpointId;
    }

    /**
     * The labels of the endpoint.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels of the endpoint.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The fully qualified URL of the network to which the IDS Endpoint is attached.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return The fully qualified URL of the network to which the IDS Endpoint is attached.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Lowest threat severity that this endpoint will alert on.
     * 
     */
    @Import(name="severity", required=true)
    private Output<EndpointSeverity> severity;

    /**
     * @return Lowest threat severity that this endpoint will alert on.
     * 
     */
    public Output<EndpointSeverity> severity() {
        return this.severity;
    }

    /**
     * Whether the endpoint should report traffic logs in addition to threat logs.
     * 
     */
    @Import(name="trafficLogs")
    private @Nullable Output<Boolean> trafficLogs;

    /**
     * @return Whether the endpoint should report traffic logs in addition to threat logs.
     * 
     */
    public Optional<Output<Boolean>> trafficLogs() {
        return Optional.ofNullable(this.trafficLogs);
    }

    private EndpointArgs() {}

    private EndpointArgs(EndpointArgs $) {
        this.description = $.description;
        this.endpointId = $.endpointId;
        this.labels = $.labels;
        this.location = $.location;
        this.network = $.network;
        this.project = $.project;
        this.requestId = $.requestId;
        this.severity = $.severity;
        this.trafficLogs = $.trafficLogs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointArgs $;

        public Builder() {
            $ = new EndpointArgs();
        }

        public Builder(EndpointArgs defaults) {
            $ = new EndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description User-provided description of the endpoint
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User-provided description of the endpoint
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param endpointId Required. The endpoint identifier. This will be part of the endpoint&#39;s resource name. This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, or hyphens, and cannot end with a hyphen. Values that do not match this pattern will trigger an INVALID_ARGUMENT error.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(Output<String> endpointId) {
            $.endpointId = endpointId;
            return this;
        }

        /**
         * @param endpointId Required. The endpoint identifier. This will be part of the endpoint&#39;s resource name. This value must start with a lowercase letter followed by up to 62 lowercase letters, numbers, or hyphens, and cannot end with a hyphen. Values that do not match this pattern will trigger an INVALID_ARGUMENT error.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(String endpointId) {
            return endpointId(Output.of(endpointId));
        }

        /**
         * @param labels The labels of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param network The fully qualified URL of the network to which the IDS Endpoint is attached.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The fully qualified URL of the network to which the IDS Endpoint is attached.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param severity Lowest threat severity that this endpoint will alert on.
         * 
         * @return builder
         * 
         */
        public Builder severity(Output<EndpointSeverity> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity Lowest threat severity that this endpoint will alert on.
         * 
         * @return builder
         * 
         */
        public Builder severity(EndpointSeverity severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param trafficLogs Whether the endpoint should report traffic logs in addition to threat logs.
         * 
         * @return builder
         * 
         */
        public Builder trafficLogs(@Nullable Output<Boolean> trafficLogs) {
            $.trafficLogs = trafficLogs;
            return this;
        }

        /**
         * @param trafficLogs Whether the endpoint should report traffic logs in addition to threat logs.
         * 
         * @return builder
         * 
         */
        public Builder trafficLogs(Boolean trafficLogs) {
            return trafficLogs(Output.of(trafficLogs));
        }

        public EndpointArgs build() {
            $.endpointId = Objects.requireNonNull($.endpointId, "expected parameter 'endpointId' to be non-null");
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            $.severity = Objects.requireNonNull($.severity, "expected parameter 'severity' to be non-null");
            return $;
        }
    }

}
