// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.imagebuilder.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The condition configures when the pipeline should trigger a new image build.
     * 
     */
    @EnumType
    public enum ImagePipelineSchedulePipelineExecutionStartCondition {
        ExpressionMatchOnly("EXPRESSION_MATCH_ONLY"),
        ExpressionMatchAndDependencyUpdatesAvailable("EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE");

        private final String value;

        ImagePipelineSchedulePipelineExecutionStartCondition(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ImagePipelineSchedulePipelineExecutionStartCondition[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
