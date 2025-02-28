// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.outputs;

import com.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTerm;
import com.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTerm;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClassificationJobS3JobDefinitionScopingIncludesAnd {
    /**
     * @return A property-based condition that defines a property, operator, and one or more values for including or excluding an object from the job.  (documented below)
     * 
     */
    private final @Nullable ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTerm simpleScopeTerm;
    /**
     * @return A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an object from the job.  (documented below)
     * 
     */
    private final @Nullable ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTerm tagScopeTerm;

    @CustomType.Constructor
    private ClassificationJobS3JobDefinitionScopingIncludesAnd(
        @CustomType.Parameter("simpleScopeTerm") @Nullable ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTerm simpleScopeTerm,
        @CustomType.Parameter("tagScopeTerm") @Nullable ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTerm tagScopeTerm) {
        this.simpleScopeTerm = simpleScopeTerm;
        this.tagScopeTerm = tagScopeTerm;
    }

    /**
     * @return A property-based condition that defines a property, operator, and one or more values for including or excluding an object from the job.  (documented below)
     * 
     */
    public Optional<ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTerm> simpleScopeTerm() {
        return Optional.ofNullable(this.simpleScopeTerm);
    }
    /**
     * @return A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding an object from the job.  (documented below)
     * 
     */
    public Optional<ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTerm> tagScopeTerm() {
        return Optional.ofNullable(this.tagScopeTerm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingIncludesAnd defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTerm simpleScopeTerm;
        private @Nullable ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTerm tagScopeTerm;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingIncludesAnd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.simpleScopeTerm = defaults.simpleScopeTerm;
    	      this.tagScopeTerm = defaults.tagScopeTerm;
        }

        public Builder simpleScopeTerm(@Nullable ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTerm simpleScopeTerm) {
            this.simpleScopeTerm = simpleScopeTerm;
            return this;
        }
        public Builder tagScopeTerm(@Nullable ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTerm tagScopeTerm) {
            this.tagScopeTerm = tagScopeTerm;
            return this;
        }        public ClassificationJobS3JobDefinitionScopingIncludesAnd build() {
            return new ClassificationJobS3JobDefinitionScopingIncludesAnd(simpleScopeTerm, tagScopeTerm);
        }
    }
}
