// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The type of annotation to be performed on this data. You must specify this field if you are using this InputConfig in an EvaluationJob.
     * 
     */
    @EnumType
    public enum GoogleCloudDatalabelingV1beta1InputConfigAnnotationType {
        AnnotationTypeUnspecified("ANNOTATION_TYPE_UNSPECIFIED"),
        /**
         * Classification annotations in an image. Allowed for continuous evaluation.
         * 
         */
        ImageClassificationAnnotation("IMAGE_CLASSIFICATION_ANNOTATION"),
        /**
         * Bounding box annotations in an image. A form of image object detection. Allowed for continuous evaluation.
         * 
         */
        ImageBoundingBoxAnnotation("IMAGE_BOUNDING_BOX_ANNOTATION"),
        /**
         * Oriented bounding box. The box does not have to be parallel to horizontal line.
         * 
         */
        ImageOrientedBoundingBoxAnnotation("IMAGE_ORIENTED_BOUNDING_BOX_ANNOTATION"),
        /**
         * Bounding poly annotations in an image.
         * 
         */
        ImageBoundingPolyAnnotation("IMAGE_BOUNDING_POLY_ANNOTATION"),
        /**
         * Polyline annotations in an image.
         * 
         */
        ImagePolylineAnnotation("IMAGE_POLYLINE_ANNOTATION"),
        /**
         * Segmentation annotations in an image.
         * 
         */
        ImageSegmentationAnnotation("IMAGE_SEGMENTATION_ANNOTATION"),
        /**
         * Classification annotations in video shots.
         * 
         */
        VideoShotsClassificationAnnotation("VIDEO_SHOTS_CLASSIFICATION_ANNOTATION"),
        /**
         * Video object tracking annotation.
         * 
         */
        VideoObjectTrackingAnnotation("VIDEO_OBJECT_TRACKING_ANNOTATION"),
        /**
         * Video object detection annotation.
         * 
         */
        VideoObjectDetectionAnnotation("VIDEO_OBJECT_DETECTION_ANNOTATION"),
        /**
         * Video event annotation.
         * 
         */
        VideoEventAnnotation("VIDEO_EVENT_ANNOTATION"),
        /**
         * Classification for text. Allowed for continuous evaluation.
         * 
         */
        TextClassificationAnnotation("TEXT_CLASSIFICATION_ANNOTATION"),
        /**
         * Entity extraction for text.
         * 
         */
        TextEntityExtractionAnnotation("TEXT_ENTITY_EXTRACTION_ANNOTATION"),
        /**
         * General classification. Allowed for continuous evaluation.
         * 
         */
        GeneralClassificationAnnotation("GENERAL_CLASSIFICATION_ANNOTATION");

        private final String value;

        GoogleCloudDatalabelingV1beta1InputConfigAnnotationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDatalabelingV1beta1InputConfigAnnotationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
