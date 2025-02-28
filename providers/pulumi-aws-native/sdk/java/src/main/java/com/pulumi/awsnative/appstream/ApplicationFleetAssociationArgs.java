// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appstream;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationFleetAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationFleetAssociationArgs Empty = new ApplicationFleetAssociationArgs();

    @Import(name="applicationArn", required=true)
    private Output<String> applicationArn;

    public Output<String> applicationArn() {
        return this.applicationArn;
    }

    @Import(name="fleetName", required=true)
    private Output<String> fleetName;

    public Output<String> fleetName() {
        return this.fleetName;
    }

    private ApplicationFleetAssociationArgs() {}

    private ApplicationFleetAssociationArgs(ApplicationFleetAssociationArgs $) {
        this.applicationArn = $.applicationArn;
        this.fleetName = $.fleetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationFleetAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationFleetAssociationArgs $;

        public Builder() {
            $ = new ApplicationFleetAssociationArgs();
        }

        public Builder(ApplicationFleetAssociationArgs defaults) {
            $ = new ApplicationFleetAssociationArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationArn(Output<String> applicationArn) {
            $.applicationArn = applicationArn;
            return this;
        }

        public Builder applicationArn(String applicationArn) {
            return applicationArn(Output.of(applicationArn));
        }

        public Builder fleetName(Output<String> fleetName) {
            $.fleetName = fleetName;
            return this;
        }

        public Builder fleetName(String fleetName) {
            return fleetName(Output.of(fleetName));
        }

        public ApplicationFleetAssociationArgs build() {
            $.applicationArn = Objects.requireNonNull($.applicationArn, "expected parameter 'applicationArn' to be non-null");
            $.fleetName = Objects.requireNonNull($.fleetName, "expected parameter 'fleetName' to be non-null");
            return $;
        }
    }

}
