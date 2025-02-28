// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appstream;

import com.pulumi.awsnative.appstream.inputs.AppBlockS3LocationArgs;
import com.pulumi.awsnative.appstream.inputs.AppBlockScriptDetailsArgs;
import com.pulumi.awsnative.appstream.inputs.AppBlockTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppBlockArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppBlockArgs Empty = new AppBlockArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="setupScriptDetails", required=true)
    private Output<AppBlockScriptDetailsArgs> setupScriptDetails;

    public Output<AppBlockScriptDetailsArgs> setupScriptDetails() {
        return this.setupScriptDetails;
    }

    @Import(name="sourceS3Location", required=true)
    private Output<AppBlockS3LocationArgs> sourceS3Location;

    public Output<AppBlockS3LocationArgs> sourceS3Location() {
        return this.sourceS3Location;
    }

    @Import(name="tags")
    private @Nullable Output<List<AppBlockTagArgs>> tags;

    public Optional<Output<List<AppBlockTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AppBlockArgs() {}

    private AppBlockArgs(AppBlockArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.name = $.name;
        this.setupScriptDetails = $.setupScriptDetails;
        this.sourceS3Location = $.sourceS3Location;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppBlockArgs $;

        public Builder() {
            $ = new AppBlockArgs();
        }

        public Builder(AppBlockArgs defaults) {
            $ = new AppBlockArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder setupScriptDetails(Output<AppBlockScriptDetailsArgs> setupScriptDetails) {
            $.setupScriptDetails = setupScriptDetails;
            return this;
        }

        public Builder setupScriptDetails(AppBlockScriptDetailsArgs setupScriptDetails) {
            return setupScriptDetails(Output.of(setupScriptDetails));
        }

        public Builder sourceS3Location(Output<AppBlockS3LocationArgs> sourceS3Location) {
            $.sourceS3Location = sourceS3Location;
            return this;
        }

        public Builder sourceS3Location(AppBlockS3LocationArgs sourceS3Location) {
            return sourceS3Location(Output.of(sourceS3Location));
        }

        public Builder tags(@Nullable Output<List<AppBlockTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<AppBlockTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(AppBlockTagArgs... tags) {
            return tags(List.of(tags));
        }

        public AppBlockArgs build() {
            $.setupScriptDetails = Objects.requireNonNull($.setupScriptDetails, "expected parameter 'setupScriptDetails' to be non-null");
            $.sourceS3Location = Objects.requireNonNull($.sourceS3Location, "expected parameter 'sourceS3Location' to be non-null");
            return $;
        }
    }

}
