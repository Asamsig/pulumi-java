// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.amplifyuibuilder.outputs;

import com.pulumi.awsnative.amplifyuibuilder.outputs.ThemeValues;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ThemeValue {
    private final @Nullable List<ThemeValues> children;
    private final @Nullable String value;

    @CustomType.Constructor
    private ThemeValue(
        @CustomType.Parameter("children") @Nullable List<ThemeValues> children,
        @CustomType.Parameter("value") @Nullable String value) {
        this.children = children;
        this.value = value;
    }

    public List<ThemeValues> children() {
        return this.children == null ? List.of() : this.children;
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ThemeValues> children;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.children = defaults.children;
    	      this.value = defaults.value;
        }

        public Builder children(@Nullable List<ThemeValues> children) {
            this.children = children;
            return this;
        }
        public Builder children(ThemeValues... children) {
            return children(List.of(children));
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public ThemeValue build() {
            return new ThemeValue(children, value);
        }
    }
}
