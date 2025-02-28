// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Retention tag
 * 
 */
public final class RetentionTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final RetentionTagArgs Empty = new RetentionTagArgs();

    /**
     * Retention Tag Name to relate it to retention rule.
     * 
     */
    @Import(name="tagName", required=true)
    private Output<String> tagName;

    /**
     * @return Retention Tag Name to relate it to retention rule.
     * 
     */
    public Output<String> tagName() {
        return this.tagName;
    }

    private RetentionTagArgs() {}

    private RetentionTagArgs(RetentionTagArgs $) {
        this.tagName = $.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RetentionTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RetentionTagArgs $;

        public Builder() {
            $ = new RetentionTagArgs();
        }

        public Builder(RetentionTagArgs defaults) {
            $ = new RetentionTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tagName Retention Tag Name to relate it to retention rule.
         * 
         * @return builder
         * 
         */
        public Builder tagName(Output<String> tagName) {
            $.tagName = tagName;
            return this;
        }

        /**
         * @param tagName Retention Tag Name to relate it to retention rule.
         * 
         * @return builder
         * 
         */
        public Builder tagName(String tagName) {
            return tagName(Output.of(tagName));
        }

        public RetentionTagArgs build() {
            $.tagName = Objects.requireNonNull($.tagName, "expected parameter 'tagName' to be non-null");
            return $;
        }
    }

}
