// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pricing.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProductFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetProductFilter Empty = new GetProductFilter();

    /**
     * The product attribute name that you want to filter on.
     * 
     */
    @Import(name="field", required=true)
    private String field;

    /**
     * @return The product attribute name that you want to filter on.
     * 
     */
    public String field() {
        return this.field;
    }

    /**
     * The product attribute value that you want to filter on.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return The product attribute value that you want to filter on.
     * 
     */
    public String value() {
        return this.value;
    }

    private GetProductFilter() {}

    private GetProductFilter(GetProductFilter $) {
        this.field = $.field;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProductFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProductFilter $;

        public Builder() {
            $ = new GetProductFilter();
        }

        public Builder(GetProductFilter defaults) {
            $ = new GetProductFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param field The product attribute name that you want to filter on.
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            $.field = field;
            return this;
        }

        /**
         * @param value The product attribute value that you want to filter on.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GetProductFilter build() {
            $.field = Objects.requireNonNull($.field, "expected parameter 'field' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
