// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.healthcare_v1beta1.outputs.AnnotationSourceResponse;
import com.pulumi.googlenative.healthcare_v1beta1.outputs.ImageAnnotationResponse;
import com.pulumi.googlenative.healthcare_v1beta1.outputs.ResourceAnnotationResponse;
import com.pulumi.googlenative.healthcare_v1beta1.outputs.SensitiveTextAnnotationResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAnnotationResult {
    /**
     * @return Details of the source.
     * 
     */
    private final AnnotationSourceResponse annotationSource;
    /**
     * @return Additional information for this annotation record, such as annotator and verifier information or study campaign.
     * 
     */
    private final Map<String,String> customData;
    /**
     * @return Annotations for images. For example, bounding polygons.
     * 
     */
    private final ImageAnnotationResponse imageAnnotation;
    /**
     * @return Resource name of the Annotation, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}/annotations/{annotation_id}`.
     * 
     */
    private final String name;
    /**
     * @return Annotations for resource. For example, classification tags.
     * 
     */
    private final ResourceAnnotationResponse resourceAnnotation;
    /**
     * @return Annotations for sensitive texts. For example, a range that describes the location of sensitive text.
     * 
     */
    private final SensitiveTextAnnotationResponse textAnnotation;

    @CustomType.Constructor
    private GetAnnotationResult(
        @CustomType.Parameter("annotationSource") AnnotationSourceResponse annotationSource,
        @CustomType.Parameter("customData") Map<String,String> customData,
        @CustomType.Parameter("imageAnnotation") ImageAnnotationResponse imageAnnotation,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceAnnotation") ResourceAnnotationResponse resourceAnnotation,
        @CustomType.Parameter("textAnnotation") SensitiveTextAnnotationResponse textAnnotation) {
        this.annotationSource = annotationSource;
        this.customData = customData;
        this.imageAnnotation = imageAnnotation;
        this.name = name;
        this.resourceAnnotation = resourceAnnotation;
        this.textAnnotation = textAnnotation;
    }

    /**
     * @return Details of the source.
     * 
     */
    public AnnotationSourceResponse annotationSource() {
        return this.annotationSource;
    }
    /**
     * @return Additional information for this annotation record, such as annotator and verifier information or study campaign.
     * 
     */
    public Map<String,String> customData() {
        return this.customData;
    }
    /**
     * @return Annotations for images. For example, bounding polygons.
     * 
     */
    public ImageAnnotationResponse imageAnnotation() {
        return this.imageAnnotation;
    }
    /**
     * @return Resource name of the Annotation, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}/annotations/{annotation_id}`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Annotations for resource. For example, classification tags.
     * 
     */
    public ResourceAnnotationResponse resourceAnnotation() {
        return this.resourceAnnotation;
    }
    /**
     * @return Annotations for sensitive texts. For example, a range that describes the location of sensitive text.
     * 
     */
    public SensitiveTextAnnotationResponse textAnnotation() {
        return this.textAnnotation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnnotationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnnotationSourceResponse annotationSource;
        private Map<String,String> customData;
        private ImageAnnotationResponse imageAnnotation;
        private String name;
        private ResourceAnnotationResponse resourceAnnotation;
        private SensitiveTextAnnotationResponse textAnnotation;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnnotationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationSource = defaults.annotationSource;
    	      this.customData = defaults.customData;
    	      this.imageAnnotation = defaults.imageAnnotation;
    	      this.name = defaults.name;
    	      this.resourceAnnotation = defaults.resourceAnnotation;
    	      this.textAnnotation = defaults.textAnnotation;
        }

        public Builder annotationSource(AnnotationSourceResponse annotationSource) {
            this.annotationSource = Objects.requireNonNull(annotationSource);
            return this;
        }
        public Builder customData(Map<String,String> customData) {
            this.customData = Objects.requireNonNull(customData);
            return this;
        }
        public Builder imageAnnotation(ImageAnnotationResponse imageAnnotation) {
            this.imageAnnotation = Objects.requireNonNull(imageAnnotation);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceAnnotation(ResourceAnnotationResponse resourceAnnotation) {
            this.resourceAnnotation = Objects.requireNonNull(resourceAnnotation);
            return this;
        }
        public Builder textAnnotation(SensitiveTextAnnotationResponse textAnnotation) {
            this.textAnnotation = Objects.requireNonNull(textAnnotation);
            return this;
        }        public GetAnnotationResult build() {
            return new GetAnnotationResult(annotationSource, customData, imageAnnotation, name, resourceAnnotation, textAnnotation);
        }
    }
}
