// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPackageDownloadURLArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPackageDownloadURLArgs Empty = new GetPackageDownloadURLArgs();

    /**
     * The resource name of the Test Base Package.
     * 
     */
    @Import(name="packageName", required=true)
    private Output<String> packageName;

    /**
     * @return The resource name of the Test Base Package.
     * 
     */
    public Output<String> packageName() {
        return this.packageName;
    }

    /**
     * The name of the resource group that contains the resource.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource name of the Test Base Account.
     * 
     */
    @Import(name="testBaseAccountName", required=true)
    private Output<String> testBaseAccountName;

    /**
     * @return The resource name of the Test Base Account.
     * 
     */
    public Output<String> testBaseAccountName() {
        return this.testBaseAccountName;
    }

    private GetPackageDownloadURLArgs() {}

    private GetPackageDownloadURLArgs(GetPackageDownloadURLArgs $) {
        this.packageName = $.packageName;
        this.resourceGroupName = $.resourceGroupName;
        this.testBaseAccountName = $.testBaseAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPackageDownloadURLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPackageDownloadURLArgs $;

        public Builder() {
            $ = new GetPackageDownloadURLArgs();
        }

        public Builder(GetPackageDownloadURLArgs defaults) {
            $ = new GetPackageDownloadURLArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param packageName The resource name of the Test Base Package.
         * 
         * @return builder
         * 
         */
        public Builder packageName(Output<String> packageName) {
            $.packageName = packageName;
            return this;
        }

        /**
         * @param packageName The resource name of the Test Base Package.
         * 
         * @return builder
         * 
         */
        public Builder packageName(String packageName) {
            return packageName(Output.of(packageName));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param testBaseAccountName The resource name of the Test Base Account.
         * 
         * @return builder
         * 
         */
        public Builder testBaseAccountName(Output<String> testBaseAccountName) {
            $.testBaseAccountName = testBaseAccountName;
            return this;
        }

        /**
         * @param testBaseAccountName The resource name of the Test Base Account.
         * 
         * @return builder
         * 
         */
        public Builder testBaseAccountName(String testBaseAccountName) {
            return testBaseAccountName(Output.of(testBaseAccountName));
        }

        public GetPackageDownloadURLArgs build() {
            $.packageName = Objects.requireNonNull($.packageName, "expected parameter 'packageName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.testBaseAccountName = Objects.requireNonNull($.testBaseAccountName, "expected parameter 'testBaseAccountName' to be non-null");
            return $;
        }
    }

}
