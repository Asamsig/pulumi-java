// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata for a Spanner connector used by the job.
 * 
 */
public final class SpannerIODetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpannerIODetailsArgs Empty = new SpannerIODetailsArgs();

    /**
     * DatabaseId accessed in the connection.
     * 
     */
    @Import(name="databaseId")
    private @Nullable Output<String> databaseId;

    /**
     * @return DatabaseId accessed in the connection.
     * 
     */
    public Optional<Output<String>> databaseId() {
        return Optional.ofNullable(this.databaseId);
    }

    /**
     * InstanceId accessed in the connection.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return InstanceId accessed in the connection.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * ProjectId accessed in the connection.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return ProjectId accessed in the connection.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private SpannerIODetailsArgs() {}

    private SpannerIODetailsArgs(SpannerIODetailsArgs $) {
        this.databaseId = $.databaseId;
        this.instanceId = $.instanceId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpannerIODetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpannerIODetailsArgs $;

        public Builder() {
            $ = new SpannerIODetailsArgs();
        }

        public Builder(SpannerIODetailsArgs defaults) {
            $ = new SpannerIODetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseId DatabaseId accessed in the connection.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(@Nullable Output<String> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        /**
         * @param databaseId DatabaseId accessed in the connection.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(String databaseId) {
            return databaseId(Output.of(databaseId));
        }

        /**
         * @param instanceId InstanceId accessed in the connection.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId InstanceId accessed in the connection.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param project ProjectId accessed in the connection.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project ProjectId accessed in the connection.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public SpannerIODetailsArgs build() {
            return $;
        }
    }

}
