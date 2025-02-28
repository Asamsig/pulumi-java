// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FlexibleAppVersionVpcAccessConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionVpcAccessConnectorArgs Empty = new FlexibleAppVersionVpcAccessConnectorArgs();

    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private FlexibleAppVersionVpcAccessConnectorArgs() {}

    private FlexibleAppVersionVpcAccessConnectorArgs(FlexibleAppVersionVpcAccessConnectorArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleAppVersionVpcAccessConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleAppVersionVpcAccessConnectorArgs $;

        public Builder() {
            $ = new FlexibleAppVersionVpcAccessConnectorArgs();
        }

        public Builder(FlexibleAppVersionVpcAccessConnectorArgs defaults) {
            $ = new FlexibleAppVersionVpcAccessConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FlexibleAppVersionVpcAccessConnectorArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
