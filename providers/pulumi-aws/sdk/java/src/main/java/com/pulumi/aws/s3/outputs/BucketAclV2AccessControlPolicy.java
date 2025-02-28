// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketAclV2AccessControlPolicyGrant;
import com.pulumi.aws.s3.outputs.BucketAclV2AccessControlPolicyOwner;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BucketAclV2AccessControlPolicy {
    /**
     * @return Set of `grant` configuration blocks documented below.
     * 
     */
    private final @Nullable List<BucketAclV2AccessControlPolicyGrant> grants;
    /**
     * @return Configuration block of the bucket owner&#39;s display name and ID documented below.
     * 
     */
    private final BucketAclV2AccessControlPolicyOwner owner;

    @CustomType.Constructor
    private BucketAclV2AccessControlPolicy(
        @CustomType.Parameter("grants") @Nullable List<BucketAclV2AccessControlPolicyGrant> grants,
        @CustomType.Parameter("owner") BucketAclV2AccessControlPolicyOwner owner) {
        this.grants = grants;
        this.owner = owner;
    }

    /**
     * @return Set of `grant` configuration blocks documented below.
     * 
     */
    public List<BucketAclV2AccessControlPolicyGrant> grants() {
        return this.grants == null ? List.of() : this.grants;
    }
    /**
     * @return Configuration block of the bucket owner&#39;s display name and ID documented below.
     * 
     */
    public BucketAclV2AccessControlPolicyOwner owner() {
        return this.owner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAclV2AccessControlPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BucketAclV2AccessControlPolicyGrant> grants;
        private BucketAclV2AccessControlPolicyOwner owner;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAclV2AccessControlPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grants = defaults.grants;
    	      this.owner = defaults.owner;
        }

        public Builder grants(@Nullable List<BucketAclV2AccessControlPolicyGrant> grants) {
            this.grants = grants;
            return this;
        }
        public Builder grants(BucketAclV2AccessControlPolicyGrant... grants) {
            return grants(List.of(grants));
        }
        public Builder owner(BucketAclV2AccessControlPolicyOwner owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }        public BucketAclV2AccessControlPolicy build() {
            return new BucketAclV2AccessControlPolicy(grants, owner);
        }
    }
}
