// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3objectlambda.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPointPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessPointPolicyPlainArgs Empty = new GetAccessPointPolicyPlainArgs();

    /**
     * The name of the Amazon S3 ObjectLambdaAccessPoint to which the policy applies.
     * 
     */
    @Import(name="objectLambdaAccessPoint", required=true)
    private String objectLambdaAccessPoint;

    /**
     * @return The name of the Amazon S3 ObjectLambdaAccessPoint to which the policy applies.
     * 
     */
    public String objectLambdaAccessPoint() {
        return this.objectLambdaAccessPoint;
    }

    private GetAccessPointPolicyPlainArgs() {}

    private GetAccessPointPolicyPlainArgs(GetAccessPointPolicyPlainArgs $) {
        this.objectLambdaAccessPoint = $.objectLambdaAccessPoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessPointPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessPointPolicyPlainArgs $;

        public Builder() {
            $ = new GetAccessPointPolicyPlainArgs();
        }

        public Builder(GetAccessPointPolicyPlainArgs defaults) {
            $ = new GetAccessPointPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectLambdaAccessPoint The name of the Amazon S3 ObjectLambdaAccessPoint to which the policy applies.
         * 
         * @return builder
         * 
         */
        public Builder objectLambdaAccessPoint(String objectLambdaAccessPoint) {
            $.objectLambdaAccessPoint = objectLambdaAccessPoint;
            return this;
        }

        public GetAccessPointPolicyPlainArgs build() {
            $.objectLambdaAccessPoint = Objects.requireNonNull($.objectLambdaAccessPoint, "expected parameter 'objectLambdaAccessPoint' to be non-null");
            return $;
        }
    }

}
