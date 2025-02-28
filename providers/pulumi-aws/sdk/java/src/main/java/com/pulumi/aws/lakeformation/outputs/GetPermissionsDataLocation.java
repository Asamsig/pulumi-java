// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPermissionsDataLocation {
    /**
     * @return Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     * 
     */
    private final String arn;
    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    private final String catalogId;

    @CustomType.Constructor
    private GetPermissionsDataLocation(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("catalogId") String catalogId) {
        this.arn = arn;
        this.catalogId = catalogId;
    }

    /**
     * @return Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    public String catalogId() {
        return this.catalogId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsDataLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String catalogId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPermissionsDataLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.catalogId = defaults.catalogId;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder catalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }        public GetPermissionsDataLocation build() {
            return new GetPermissionsDataLocation(arn, catalogId);
        }
    }
}
