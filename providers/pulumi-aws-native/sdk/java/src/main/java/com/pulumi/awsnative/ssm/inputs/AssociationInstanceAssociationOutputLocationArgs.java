// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssm.inputs;

import com.pulumi.awsnative.ssm.inputs.AssociationS3OutputLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssociationInstanceAssociationOutputLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssociationInstanceAssociationOutputLocationArgs Empty = new AssociationInstanceAssociationOutputLocationArgs();

    @Import(name="s3Location")
    private @Nullable Output<AssociationS3OutputLocationArgs> s3Location;

    public Optional<Output<AssociationS3OutputLocationArgs>> s3Location() {
        return Optional.ofNullable(this.s3Location);
    }

    private AssociationInstanceAssociationOutputLocationArgs() {}

    private AssociationInstanceAssociationOutputLocationArgs(AssociationInstanceAssociationOutputLocationArgs $) {
        this.s3Location = $.s3Location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssociationInstanceAssociationOutputLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssociationInstanceAssociationOutputLocationArgs $;

        public Builder() {
            $ = new AssociationInstanceAssociationOutputLocationArgs();
        }

        public Builder(AssociationInstanceAssociationOutputLocationArgs defaults) {
            $ = new AssociationInstanceAssociationOutputLocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder s3Location(@Nullable Output<AssociationS3OutputLocationArgs> s3Location) {
            $.s3Location = s3Location;
            return this;
        }

        public Builder s3Location(AssociationS3OutputLocationArgs s3Location) {
            return s3Location(Output.of(s3Location));
        }

        public AssociationInstanceAssociationOutputLocationArgs build() {
            return $;
        }
    }

}
