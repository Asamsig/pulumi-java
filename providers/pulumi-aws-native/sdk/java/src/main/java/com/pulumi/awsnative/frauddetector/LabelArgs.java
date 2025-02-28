// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector;

import com.pulumi.awsnative.frauddetector.inputs.LabelTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LabelArgs extends com.pulumi.resources.ResourceArgs {

    public static final LabelArgs Empty = new LabelArgs();

    /**
     * The label description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The label description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the label.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the label.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Tags associated with this label.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<LabelTagArgs>> tags;

    /**
     * @return Tags associated with this label.
     * 
     */
    public Optional<Output<List<LabelTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private LabelArgs() {}

    private LabelArgs(LabelArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabelArgs $;

        public Builder() {
            $ = new LabelArgs();
        }

        public Builder(LabelArgs defaults) {
            $ = new LabelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The label description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The label description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the label.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the label.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Tags associated with this label.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<LabelTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags associated with this label.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<LabelTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags associated with this label.
         * 
         * @return builder
         * 
         */
        public Builder tags(LabelTagArgs... tags) {
            return tags(List.of(tags));
        }

        public LabelArgs build() {
            return $;
        }
    }

}
