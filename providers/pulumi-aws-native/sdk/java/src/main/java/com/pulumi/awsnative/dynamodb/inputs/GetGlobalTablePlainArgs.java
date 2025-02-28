// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.dynamodb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGlobalTablePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalTablePlainArgs Empty = new GetGlobalTablePlainArgs();

    @Import(name="tableName", required=true)
    private String tableName;

    public String tableName() {
        return this.tableName;
    }

    private GetGlobalTablePlainArgs() {}

    private GetGlobalTablePlainArgs(GetGlobalTablePlainArgs $) {
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalTablePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalTablePlainArgs $;

        public Builder() {
            $ = new GetGlobalTablePlainArgs();
        }

        public Builder(GetGlobalTablePlainArgs defaults) {
            $ = new GetGlobalTablePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder tableName(String tableName) {
            $.tableName = tableName;
            return this;
        }

        public GetGlobalTablePlainArgs build() {
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            return $;
        }
    }

}
