// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudsearch_v1.enums.SortOptionsSortOrder;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SortOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SortOptionsArgs Empty = new SortOptionsArgs();

    /**
     * Name of the operator corresponding to the field to sort on. The corresponding property must be marked as sortable.
     * 
     */
    @Import(name="operatorName")
    private @Nullable Output<String> operatorName;

    /**
     * @return Name of the operator corresponding to the field to sort on. The corresponding property must be marked as sortable.
     * 
     */
    public Optional<Output<String>> operatorName() {
        return Optional.ofNullable(this.operatorName);
    }

    /**
     * Ascending is the default sort order
     * 
     */
    @Import(name="sortOrder")
    private @Nullable Output<SortOptionsSortOrder> sortOrder;

    /**
     * @return Ascending is the default sort order
     * 
     */
    public Optional<Output<SortOptionsSortOrder>> sortOrder() {
        return Optional.ofNullable(this.sortOrder);
    }

    private SortOptionsArgs() {}

    private SortOptionsArgs(SortOptionsArgs $) {
        this.operatorName = $.operatorName;
        this.sortOrder = $.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SortOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SortOptionsArgs $;

        public Builder() {
            $ = new SortOptionsArgs();
        }

        public Builder(SortOptionsArgs defaults) {
            $ = new SortOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operatorName Name of the operator corresponding to the field to sort on. The corresponding property must be marked as sortable.
         * 
         * @return builder
         * 
         */
        public Builder operatorName(@Nullable Output<String> operatorName) {
            $.operatorName = operatorName;
            return this;
        }

        /**
         * @param operatorName Name of the operator corresponding to the field to sort on. The corresponding property must be marked as sortable.
         * 
         * @return builder
         * 
         */
        public Builder operatorName(String operatorName) {
            return operatorName(Output.of(operatorName));
        }

        /**
         * @param sortOrder Ascending is the default sort order
         * 
         * @return builder
         * 
         */
        public Builder sortOrder(@Nullable Output<SortOptionsSortOrder> sortOrder) {
            $.sortOrder = sortOrder;
            return this;
        }

        /**
         * @param sortOrder Ascending is the default sort order
         * 
         * @return builder
         * 
         */
        public Builder sortOrder(SortOptionsSortOrder sortOrder) {
            return sortOrder(Output.of(sortOrder));
        }

        public SortOptionsArgs build() {
            return $;
        }
    }

}
