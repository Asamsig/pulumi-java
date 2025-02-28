// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.location.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPlaceIndexPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPlaceIndexPlainArgs Empty = new GetPlaceIndexPlainArgs();

    @Import(name="indexName", required=true)
    private String indexName;

    public String indexName() {
        return this.indexName;
    }

    private GetPlaceIndexPlainArgs() {}

    private GetPlaceIndexPlainArgs(GetPlaceIndexPlainArgs $) {
        this.indexName = $.indexName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPlaceIndexPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPlaceIndexPlainArgs $;

        public Builder() {
            $ = new GetPlaceIndexPlainArgs();
        }

        public Builder(GetPlaceIndexPlainArgs defaults) {
            $ = new GetPlaceIndexPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder indexName(String indexName) {
            $.indexName = indexName;
            return this;
        }

        public GetPlaceIndexPlainArgs build() {
            $.indexName = Objects.requireNonNull($.indexName, "expected parameter 'indexName' to be non-null");
            return $;
        }
    }

}
