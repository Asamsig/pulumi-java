// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabasePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabasePlainArgs Empty = new GetDatabasePlainArgs();

    @Import(name="database", required=true)
    private String database;

    public String database() {
        return this.database;
    }

    @Import(name="instance", required=true)
    private String instance;

    public String instance() {
        return this.instance;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDatabasePlainArgs() {}

    private GetDatabasePlainArgs(GetDatabasePlainArgs $) {
        this.database = $.database;
        this.instance = $.instance;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabasePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabasePlainArgs $;

        public Builder() {
            $ = new GetDatabasePlainArgs();
        }

        public Builder(GetDatabasePlainArgs defaults) {
            $ = new GetDatabasePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder database(String database) {
            $.database = database;
            return this;
        }

        public Builder instance(String instance) {
            $.instance = instance;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetDatabasePlainArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.instance = Objects.requireNonNull($.instance, "expected parameter 'instance' to be non-null");
            return $;
        }
    }

}
