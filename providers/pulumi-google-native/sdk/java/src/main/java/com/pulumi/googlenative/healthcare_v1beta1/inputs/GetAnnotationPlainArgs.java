// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAnnotationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAnnotationPlainArgs Empty = new GetAnnotationPlainArgs();

    @Import(name="annotationId", required=true)
    private String annotationId;

    public String annotationId() {
        return this.annotationId;
    }

    @Import(name="annotationStoreId", required=true)
    private String annotationStoreId;

    public String annotationStoreId() {
        return this.annotationStoreId;
    }

    @Import(name="datasetId", required=true)
    private String datasetId;

    public String datasetId() {
        return this.datasetId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetAnnotationPlainArgs() {}

    private GetAnnotationPlainArgs(GetAnnotationPlainArgs $) {
        this.annotationId = $.annotationId;
        this.annotationStoreId = $.annotationStoreId;
        this.datasetId = $.datasetId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAnnotationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAnnotationPlainArgs $;

        public Builder() {
            $ = new GetAnnotationPlainArgs();
        }

        public Builder(GetAnnotationPlainArgs defaults) {
            $ = new GetAnnotationPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder annotationId(String annotationId) {
            $.annotationId = annotationId;
            return this;
        }

        public Builder annotationStoreId(String annotationStoreId) {
            $.annotationStoreId = annotationStoreId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetAnnotationPlainArgs build() {
            $.annotationId = Objects.requireNonNull($.annotationId, "expected parameter 'annotationId' to be non-null");
            $.annotationStoreId = Objects.requireNonNull($.annotationStoreId, "expected parameter 'annotationStoreId' to be non-null");
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
