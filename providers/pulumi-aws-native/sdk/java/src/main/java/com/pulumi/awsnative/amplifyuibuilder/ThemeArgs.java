// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.amplifyuibuilder;

import com.pulumi.awsnative.amplifyuibuilder.inputs.ThemeTagsArgs;
import com.pulumi.awsnative.amplifyuibuilder.inputs.ThemeValuesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThemeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThemeArgs Empty = new ThemeArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="overrides")
    private @Nullable Output<List<ThemeValuesArgs>> overrides;

    public Optional<Output<List<ThemeValuesArgs>>> overrides() {
        return Optional.ofNullable(this.overrides);
    }

    @Import(name="tags")
    private @Nullable Output<ThemeTagsArgs> tags;

    public Optional<Output<ThemeTagsArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="values", required=true)
    private Output<List<ThemeValuesArgs>> values;

    public Output<List<ThemeValuesArgs>> values() {
        return this.values;
    }

    private ThemeArgs() {}

    private ThemeArgs(ThemeArgs $) {
        this.name = $.name;
        this.overrides = $.overrides;
        this.tags = $.tags;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThemeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThemeArgs $;

        public Builder() {
            $ = new ThemeArgs();
        }

        public Builder(ThemeArgs defaults) {
            $ = new ThemeArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder overrides(@Nullable Output<List<ThemeValuesArgs>> overrides) {
            $.overrides = overrides;
            return this;
        }

        public Builder overrides(List<ThemeValuesArgs> overrides) {
            return overrides(Output.of(overrides));
        }

        public Builder overrides(ThemeValuesArgs... overrides) {
            return overrides(List.of(overrides));
        }

        public Builder tags(@Nullable Output<ThemeTagsArgs> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(ThemeTagsArgs tags) {
            return tags(Output.of(tags));
        }

        public Builder values(Output<List<ThemeValuesArgs>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<ThemeValuesArgs> values) {
            return values(Output.of(values));
        }

        public Builder values(ThemeValuesArgs... values) {
            return values(List.of(values));
        }

        public ThemeArgs build() {
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
