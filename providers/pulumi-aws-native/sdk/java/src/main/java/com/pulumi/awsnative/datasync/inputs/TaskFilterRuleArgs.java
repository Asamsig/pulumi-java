// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.awsnative.datasync.enums.TaskFilterRuleFilterType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies which files folders and objects to include or exclude when transferring files from source to destination.
 * 
 */
public final class TaskFilterRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskFilterRuleArgs Empty = new TaskFilterRuleArgs();

    /**
     * The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * 
     */
    @Import(name="filterType")
    private @Nullable Output<TaskFilterRuleFilterType> filterType;

    /**
     * @return The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * 
     */
    public Optional<Output<TaskFilterRuleFilterType>> filterType() {
        return Optional.ofNullable(this.filterType);
    }

    /**
     * A single filter string that consists of the patterns to include or exclude. The patterns are delimited by &#34;|&#34;.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return A single filter string that consists of the patterns to include or exclude. The patterns are delimited by &#34;|&#34;.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private TaskFilterRuleArgs() {}

    private TaskFilterRuleArgs(TaskFilterRuleArgs $) {
        this.filterType = $.filterType;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskFilterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskFilterRuleArgs $;

        public Builder() {
            $ = new TaskFilterRuleArgs();
        }

        public Builder(TaskFilterRuleArgs defaults) {
            $ = new TaskFilterRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filterType The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
         * 
         * @return builder
         * 
         */
        public Builder filterType(@Nullable Output<TaskFilterRuleFilterType> filterType) {
            $.filterType = filterType;
            return this;
        }

        /**
         * @param filterType The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
         * 
         * @return builder
         * 
         */
        public Builder filterType(TaskFilterRuleFilterType filterType) {
            return filterType(Output.of(filterType));
        }

        /**
         * @param value A single filter string that consists of the patterns to include or exclude. The patterns are delimited by &#34;|&#34;.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value A single filter string that consists of the patterns to include or exclude. The patterns are delimited by &#34;|&#34;.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public TaskFilterRuleArgs build() {
            return $;
        }
    }

}
