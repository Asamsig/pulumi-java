// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.transfer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the key-value pair that are assigned to a file during the execution of a Tagging step.
 * 
 */
public final class WorkflowS3TagArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowS3TagArgs Empty = new WorkflowS3TagArgs();

    /**
     * The name assigned to the tag that you create.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The name assigned to the tag that you create.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The value that corresponds to the key.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value that corresponds to the key.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private WorkflowS3TagArgs() {}

    private WorkflowS3TagArgs(WorkflowS3TagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowS3TagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowS3TagArgs $;

        public Builder() {
            $ = new WorkflowS3TagArgs();
        }

        public Builder(WorkflowS3TagArgs defaults) {
            $ = new WorkflowS3TagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The name assigned to the tag that you create.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The name assigned to the tag that you create.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The value that corresponds to the key.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value that corresponds to the key.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public WorkflowS3TagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
