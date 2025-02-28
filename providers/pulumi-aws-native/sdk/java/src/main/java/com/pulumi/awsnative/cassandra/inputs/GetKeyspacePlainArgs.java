// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cassandra.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetKeyspacePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyspacePlainArgs Empty = new GetKeyspacePlainArgs();

    /**
     * Name for Cassandra keyspace
     * 
     */
    @Import(name="keyspaceName", required=true)
    private String keyspaceName;

    /**
     * @return Name for Cassandra keyspace
     * 
     */
    public String keyspaceName() {
        return this.keyspaceName;
    }

    private GetKeyspacePlainArgs() {}

    private GetKeyspacePlainArgs(GetKeyspacePlainArgs $) {
        this.keyspaceName = $.keyspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyspacePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyspacePlainArgs $;

        public Builder() {
            $ = new GetKeyspacePlainArgs();
        }

        public Builder(GetKeyspacePlainArgs defaults) {
            $ = new GetKeyspacePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyspaceName Name for Cassandra keyspace
         * 
         * @return builder
         * 
         */
        public Builder keyspaceName(String keyspaceName) {
            $.keyspaceName = keyspaceName;
            return this;
        }

        public GetKeyspacePlainArgs build() {
            $.keyspaceName = Objects.requireNonNull($.keyspaceName, "expected parameter 'keyspaceName' to be non-null");
            return $;
        }
    }

}
