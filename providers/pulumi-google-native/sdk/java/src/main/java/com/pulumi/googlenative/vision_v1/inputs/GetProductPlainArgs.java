// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vision_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProductPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProductPlainArgs Empty = new GetProductPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="productId", required=true)
    private String productId;

    public String productId() {
        return this.productId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetProductPlainArgs() {}

    private GetProductPlainArgs(GetProductPlainArgs $) {
        this.location = $.location;
        this.productId = $.productId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProductPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProductPlainArgs $;

        public Builder() {
            $ = new GetProductPlainArgs();
        }

        public Builder(GetProductPlainArgs defaults) {
            $ = new GetProductPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder productId(String productId) {
            $.productId = productId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetProductPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.productId = Objects.requireNonNull($.productId, "expected parameter 'productId' to be non-null");
            return $;
        }
    }

}
