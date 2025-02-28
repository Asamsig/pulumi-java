// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicAdvertisedPrefixPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicAdvertisedPrefixPlainArgs Empty = new GetPublicAdvertisedPrefixPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="publicAdvertisedPrefix", required=true)
    private String publicAdvertisedPrefix;

    public String publicAdvertisedPrefix() {
        return this.publicAdvertisedPrefix;
    }

    private GetPublicAdvertisedPrefixPlainArgs() {}

    private GetPublicAdvertisedPrefixPlainArgs(GetPublicAdvertisedPrefixPlainArgs $) {
        this.project = $.project;
        this.publicAdvertisedPrefix = $.publicAdvertisedPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublicAdvertisedPrefixPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublicAdvertisedPrefixPlainArgs $;

        public Builder() {
            $ = new GetPublicAdvertisedPrefixPlainArgs();
        }

        public Builder(GetPublicAdvertisedPrefixPlainArgs defaults) {
            $ = new GetPublicAdvertisedPrefixPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder publicAdvertisedPrefix(String publicAdvertisedPrefix) {
            $.publicAdvertisedPrefix = publicAdvertisedPrefix;
            return this;
        }

        public GetPublicAdvertisedPrefixPlainArgs build() {
            $.publicAdvertisedPrefix = Objects.requireNonNull($.publicAdvertisedPrefix, "expected parameter 'publicAdvertisedPrefix' to be non-null");
            return $;
        }
    }

}
