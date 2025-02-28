// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gkehub_v1beta.inputs.CommonFeatureSpecArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureArgs Empty = new FeatureArgs();

    /**
     * The ID of the feature to create.
     * 
     */
    @Import(name="featureId")
    private @Nullable Output<String> featureId;

    /**
     * @return The ID of the feature to create.
     * 
     */
    public Optional<Output<String>> featureId() {
        return Optional.ofNullable(this.featureId);
    }

    /**
     * GCP labels for this Feature.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return GCP labels for this Feature.
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
     * Optional. Membership-specific configuration for this Feature. If this Feature does not support any per-Membership configuration, this field may be unused. The keys indicate which Membership the configuration is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} WILL match the Feature&#39;s project. {p} will always be returned as the project number, but the project ID is also accepted during input. If the same Membership is specified in the map twice (using the project ID form, and the project number form), exactly ONE of the entries will be saved, with no guarantees as to which. For this reason, it is recommended the same format be used for all entries when mutating a Feature.
     * 
     */
    @Import(name="membershipSpecs")
    private @Nullable Output<Map<String,String>> membershipSpecs;

    /**
     * @return Optional. Membership-specific configuration for this Feature. If this Feature does not support any per-Membership configuration, this field may be unused. The keys indicate which Membership the configuration is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} WILL match the Feature&#39;s project. {p} will always be returned as the project number, but the project ID is also accepted during input. If the same Membership is specified in the map twice (using the project ID form, and the project number form), exactly ONE of the entries will be saved, with no guarantees as to which. For this reason, it is recommended the same format be used for all entries when mutating a Feature.
     * 
     */
    public Optional<Output<Map<String,String>>> membershipSpecs() {
        return Optional.ofNullable(this.membershipSpecs);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
     * 
     */
    @Import(name="spec")
    private @Nullable Output<CommonFeatureSpecArgs> spec;

    /**
     * @return Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
     * 
     */
    public Optional<Output<CommonFeatureSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    private FeatureArgs() {}

    private FeatureArgs(FeatureArgs $) {
        this.featureId = $.featureId;
        this.labels = $.labels;
        this.location = $.location;
        this.membershipSpecs = $.membershipSpecs;
        this.project = $.project;
        this.requestId = $.requestId;
        this.spec = $.spec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureArgs $;

        public Builder() {
            $ = new FeatureArgs();
        }

        public Builder(FeatureArgs defaults) {
            $ = new FeatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param featureId The ID of the feature to create.
         * 
         * @return builder
         * 
         */
        public Builder featureId(@Nullable Output<String> featureId) {
            $.featureId = featureId;
            return this;
        }

        /**
         * @param featureId The ID of the feature to create.
         * 
         * @return builder
         * 
         */
        public Builder featureId(String featureId) {
            return featureId(Output.of(featureId));
        }

        /**
         * @param labels GCP labels for this Feature.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels GCP labels for this Feature.
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
         * @param membershipSpecs Optional. Membership-specific configuration for this Feature. If this Feature does not support any per-Membership configuration, this field may be unused. The keys indicate which Membership the configuration is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} WILL match the Feature&#39;s project. {p} will always be returned as the project number, but the project ID is also accepted during input. If the same Membership is specified in the map twice (using the project ID form, and the project number form), exactly ONE of the entries will be saved, with no guarantees as to which. For this reason, it is recommended the same format be used for all entries when mutating a Feature.
         * 
         * @return builder
         * 
         */
        public Builder membershipSpecs(@Nullable Output<Map<String,String>> membershipSpecs) {
            $.membershipSpecs = membershipSpecs;
            return this;
        }

        /**
         * @param membershipSpecs Optional. Membership-specific configuration for this Feature. If this Feature does not support any per-Membership configuration, this field may be unused. The keys indicate which Membership the configuration is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} WILL match the Feature&#39;s project. {p} will always be returned as the project number, but the project ID is also accepted during input. If the same Membership is specified in the map twice (using the project ID form, and the project number form), exactly ONE of the entries will be saved, with no guarantees as to which. For this reason, it is recommended the same format be used for all entries when mutating a Feature.
         * 
         * @return builder
         * 
         */
        public Builder membershipSpecs(Map<String,String> membershipSpecs) {
            return membershipSpecs(Output.of(membershipSpecs));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requestId A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param spec Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<CommonFeatureSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
         * 
         * @return builder
         * 
         */
        public Builder spec(CommonFeatureSpecArgs spec) {
            return spec(Output.of(spec));
        }

        public FeatureArgs build() {
            return $;
        }
    }

}
