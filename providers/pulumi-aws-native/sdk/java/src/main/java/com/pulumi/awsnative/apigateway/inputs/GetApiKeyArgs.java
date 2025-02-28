// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApiKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiKeyArgs Empty = new GetApiKeyArgs();

    /**
     * A Unique Key ID which identifies the API Key. Generated by the Create API and returned by the Read and List APIs
     * 
     */
    @Import(name="aPIKeyId", required=true)
    private Output<String> aPIKeyId;

    /**
     * @return A Unique Key ID which identifies the API Key. Generated by the Create API and returned by the Read and List APIs
     * 
     */
    public Output<String> aPIKeyId() {
        return this.aPIKeyId;
    }

    private GetApiKeyArgs() {}

    private GetApiKeyArgs(GetApiKeyArgs $) {
        this.aPIKeyId = $.aPIKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiKeyArgs $;

        public Builder() {
            $ = new GetApiKeyArgs();
        }

        public Builder(GetApiKeyArgs defaults) {
            $ = new GetApiKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aPIKeyId A Unique Key ID which identifies the API Key. Generated by the Create API and returned by the Read and List APIs
         * 
         * @return builder
         * 
         */
        public Builder aPIKeyId(Output<String> aPIKeyId) {
            $.aPIKeyId = aPIKeyId;
            return this;
        }

        /**
         * @param aPIKeyId A Unique Key ID which identifies the API Key. Generated by the Create API and returned by the Read and List APIs
         * 
         * @return builder
         * 
         */
        public Builder aPIKeyId(String aPIKeyId) {
            return aPIKeyId(Output.of(aPIKeyId));
        }

        public GetApiKeyArgs build() {
            $.aPIKeyId = Objects.requireNonNull($.aPIKeyId, "expected parameter 'aPIKeyId' to be non-null");
            return $;
        }
    }

}
