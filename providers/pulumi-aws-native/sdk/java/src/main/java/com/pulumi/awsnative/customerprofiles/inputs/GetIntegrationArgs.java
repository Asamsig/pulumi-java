// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.customerprofiles.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIntegrationArgs Empty = new GetIntegrationArgs();

    /**
     * The unique name of the domain.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return The unique name of the domain.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * The URI of the S3 bucket or any other type of data source.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return The URI of the S3 bucket or any other type of data source.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private GetIntegrationArgs() {}

    private GetIntegrationArgs(GetIntegrationArgs $) {
        this.domainName = $.domainName;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIntegrationArgs $;

        public Builder() {
            $ = new GetIntegrationArgs();
        }

        public Builder(GetIntegrationArgs defaults) {
            $ = new GetIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName The unique name of the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The unique name of the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param uri The URI of the S3 bucket or any other type of data source.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The URI of the S3 bucket or any other type of data source.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public GetIntegrationArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
