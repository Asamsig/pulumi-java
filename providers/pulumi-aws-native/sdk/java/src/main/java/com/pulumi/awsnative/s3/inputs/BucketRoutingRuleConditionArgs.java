// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A container for describing a condition that must be met for the specified redirect to apply.You must specify at least one of HttpErrorCodeReturnedEquals and KeyPrefixEquals
 * 
 */
public final class BucketRoutingRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketRoutingRuleConditionArgs Empty = new BucketRoutingRuleConditionArgs();

    /**
     * The HTTP error code when the redirect is applied.
     * 
     */
    @Import(name="httpErrorCodeReturnedEquals")
    private @Nullable Output<String> httpErrorCodeReturnedEquals;

    /**
     * @return The HTTP error code when the redirect is applied.
     * 
     */
    public Optional<Output<String>> httpErrorCodeReturnedEquals() {
        return Optional.ofNullable(this.httpErrorCodeReturnedEquals);
    }

    /**
     * The object key name prefix when the redirect is applied.
     * 
     */
    @Import(name="keyPrefixEquals")
    private @Nullable Output<String> keyPrefixEquals;

    /**
     * @return The object key name prefix when the redirect is applied.
     * 
     */
    public Optional<Output<String>> keyPrefixEquals() {
        return Optional.ofNullable(this.keyPrefixEquals);
    }

    private BucketRoutingRuleConditionArgs() {}

    private BucketRoutingRuleConditionArgs(BucketRoutingRuleConditionArgs $) {
        this.httpErrorCodeReturnedEquals = $.httpErrorCodeReturnedEquals;
        this.keyPrefixEquals = $.keyPrefixEquals;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketRoutingRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketRoutingRuleConditionArgs $;

        public Builder() {
            $ = new BucketRoutingRuleConditionArgs();
        }

        public Builder(BucketRoutingRuleConditionArgs defaults) {
            $ = new BucketRoutingRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpErrorCodeReturnedEquals The HTTP error code when the redirect is applied.
         * 
         * @return builder
         * 
         */
        public Builder httpErrorCodeReturnedEquals(@Nullable Output<String> httpErrorCodeReturnedEquals) {
            $.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
            return this;
        }

        /**
         * @param httpErrorCodeReturnedEquals The HTTP error code when the redirect is applied.
         * 
         * @return builder
         * 
         */
        public Builder httpErrorCodeReturnedEquals(String httpErrorCodeReturnedEquals) {
            return httpErrorCodeReturnedEquals(Output.of(httpErrorCodeReturnedEquals));
        }

        /**
         * @param keyPrefixEquals The object key name prefix when the redirect is applied.
         * 
         * @return builder
         * 
         */
        public Builder keyPrefixEquals(@Nullable Output<String> keyPrefixEquals) {
            $.keyPrefixEquals = keyPrefixEquals;
            return this;
        }

        /**
         * @param keyPrefixEquals The object key name prefix when the redirect is applied.
         * 
         * @return builder
         * 
         */
        public Builder keyPrefixEquals(String keyPrefixEquals) {
            return keyPrefixEquals(Output.of(keyPrefixEquals));
        }

        public BucketRoutingRuleConditionArgs build() {
            return $;
        }
    }

}
