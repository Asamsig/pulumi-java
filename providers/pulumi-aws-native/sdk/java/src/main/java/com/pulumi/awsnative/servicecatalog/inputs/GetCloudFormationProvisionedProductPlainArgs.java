// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.servicecatalog.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCloudFormationProvisionedProductPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudFormationProvisionedProductPlainArgs Empty = new GetCloudFormationProvisionedProductPlainArgs();

    @Import(name="provisionedProductId", required=true)
    private String provisionedProductId;

    public String provisionedProductId() {
        return this.provisionedProductId;
    }

    private GetCloudFormationProvisionedProductPlainArgs() {}

    private GetCloudFormationProvisionedProductPlainArgs(GetCloudFormationProvisionedProductPlainArgs $) {
        this.provisionedProductId = $.provisionedProductId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudFormationProvisionedProductPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudFormationProvisionedProductPlainArgs $;

        public Builder() {
            $ = new GetCloudFormationProvisionedProductPlainArgs();
        }

        public Builder(GetCloudFormationProvisionedProductPlainArgs defaults) {
            $ = new GetCloudFormationProvisionedProductPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder provisionedProductId(String provisionedProductId) {
            $.provisionedProductId = provisionedProductId;
            return this;
        }

        public GetCloudFormationProvisionedProductPlainArgs build() {
            $.provisionedProductId = Objects.requireNonNull($.provisionedProductId, "expected parameter 'provisionedProductId' to be non-null");
            return $;
        }
    }

}
