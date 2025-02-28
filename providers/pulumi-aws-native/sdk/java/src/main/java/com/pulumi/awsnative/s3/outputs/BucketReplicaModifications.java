// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.outputs;

import com.pulumi.awsnative.s3.enums.BucketReplicaModificationsStatus;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class BucketReplicaModifications {
    /**
     * @return Specifies whether Amazon S3 replicates modifications on replicas.
     * 
     */
    private final BucketReplicaModificationsStatus status;

    @CustomType.Constructor
    private BucketReplicaModifications(@CustomType.Parameter("status") BucketReplicaModificationsStatus status) {
        this.status = status;
    }

    /**
     * @return Specifies whether Amazon S3 replicates modifications on replicas.
     * 
     */
    public BucketReplicaModificationsStatus status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicaModifications defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicaModificationsStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicaModifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(BucketReplicaModificationsStatus status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public BucketReplicaModifications build() {
            return new BucketReplicaModifications(status);
        }
    }
}
