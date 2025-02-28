// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.outputs;

import com.pulumi.aws.signer.outputs.SigningJobSignedObjectS3;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SigningJobSignedObject {
    /**
     * @return A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
     */
    private final @Nullable List<SigningJobSignedObjectS3> s3s;

    @CustomType.Constructor
    private SigningJobSignedObject(@CustomType.Parameter("s3s") @Nullable List<SigningJobSignedObjectS3> s3s) {
        this.s3s = s3s;
    }

    /**
     * @return A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
     */
    public List<SigningJobSignedObjectS3> s3s() {
        return this.s3s == null ? List.of() : this.s3s;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobSignedObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SigningJobSignedObjectS3> s3s;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobSignedObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3s = defaults.s3s;
        }

        public Builder s3s(@Nullable List<SigningJobSignedObjectS3> s3s) {
            this.s3s = s3s;
            return this;
        }
        public Builder s3s(SigningJobSignedObjectS3... s3s) {
            return s3s(List.of(s3s));
        }        public SigningJobSignedObject build() {
            return new SigningJobSignedObject(s3s);
        }
    }
}
