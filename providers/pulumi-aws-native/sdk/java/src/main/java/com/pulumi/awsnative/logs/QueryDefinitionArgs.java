// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.logs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QueryDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueryDefinitionArgs Empty = new QueryDefinitionArgs();

    /**
     * Optionally define specific log groups as part of your query definition
     * 
     */
    @Import(name="logGroupNames")
    private @Nullable Output<List<String>> logGroupNames;

    /**
     * @return Optionally define specific log groups as part of your query definition
     * 
     */
    public Optional<Output<List<String>>> logGroupNames() {
        return Optional.ofNullable(this.logGroupNames);
    }

    /**
     * A name for the saved query definition
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name for the saved query definition
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The query string to use for this definition
     * 
     */
    @Import(name="queryString", required=true)
    private Output<String> queryString;

    /**
     * @return The query string to use for this definition
     * 
     */
    public Output<String> queryString() {
        return this.queryString;
    }

    private QueryDefinitionArgs() {}

    private QueryDefinitionArgs(QueryDefinitionArgs $) {
        this.logGroupNames = $.logGroupNames;
        this.name = $.name;
        this.queryString = $.queryString;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueryDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryDefinitionArgs $;

        public Builder() {
            $ = new QueryDefinitionArgs();
        }

        public Builder(QueryDefinitionArgs defaults) {
            $ = new QueryDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logGroupNames Optionally define specific log groups as part of your query definition
         * 
         * @return builder
         * 
         */
        public Builder logGroupNames(@Nullable Output<List<String>> logGroupNames) {
            $.logGroupNames = logGroupNames;
            return this;
        }

        /**
         * @param logGroupNames Optionally define specific log groups as part of your query definition
         * 
         * @return builder
         * 
         */
        public Builder logGroupNames(List<String> logGroupNames) {
            return logGroupNames(Output.of(logGroupNames));
        }

        /**
         * @param logGroupNames Optionally define specific log groups as part of your query definition
         * 
         * @return builder
         * 
         */
        public Builder logGroupNames(String... logGroupNames) {
            return logGroupNames(List.of(logGroupNames));
        }

        /**
         * @param name A name for the saved query definition
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name for the saved query definition
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param queryString The query string to use for this definition
         * 
         * @return builder
         * 
         */
        public Builder queryString(Output<String> queryString) {
            $.queryString = queryString;
            return this;
        }

        /**
         * @param queryString The query string to use for this definition
         * 
         * @return builder
         * 
         */
        public Builder queryString(String queryString) {
            return queryString(Output.of(queryString));
        }

        public QueryDefinitionArgs build() {
            $.queryString = Objects.requireNonNull($.queryString, "expected parameter 'queryString' to be non-null");
            return $;
        }
    }

}
