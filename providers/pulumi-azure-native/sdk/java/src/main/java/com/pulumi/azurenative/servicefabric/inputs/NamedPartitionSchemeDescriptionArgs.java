// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes the named partition scheme of the service.
 * 
 */
public final class NamedPartitionSchemeDescriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamedPartitionSchemeDescriptionArgs Empty = new NamedPartitionSchemeDescriptionArgs();

    /**
     * The number of partitions.
     * 
     */
    @Import(name="count", required=true)
    private Output<Integer> count;

    /**
     * @return The number of partitions.
     * 
     */
    public Output<Integer> count() {
        return this.count;
    }

    /**
     * Array of size specified by the ‘count’ parameter, for the names of the partitions.
     * 
     */
    @Import(name="names", required=true)
    private Output<List<String>> names;

    /**
     * @return Array of size specified by the ‘count’ parameter, for the names of the partitions.
     * 
     */
    public Output<List<String>> names() {
        return this.names;
    }

    /**
     * Enumerates the ways that a service can be partitioned.
     * Expected value is &#39;Named&#39;.
     * 
     */
    @Import(name="partitionScheme", required=true)
    private Output<String> partitionScheme;

    /**
     * @return Enumerates the ways that a service can be partitioned.
     * Expected value is &#39;Named&#39;.
     * 
     */
    public Output<String> partitionScheme() {
        return this.partitionScheme;
    }

    private NamedPartitionSchemeDescriptionArgs() {}

    private NamedPartitionSchemeDescriptionArgs(NamedPartitionSchemeDescriptionArgs $) {
        this.count = $.count;
        this.names = $.names;
        this.partitionScheme = $.partitionScheme;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamedPartitionSchemeDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamedPartitionSchemeDescriptionArgs $;

        public Builder() {
            $ = new NamedPartitionSchemeDescriptionArgs();
        }

        public Builder(NamedPartitionSchemeDescriptionArgs defaults) {
            $ = new NamedPartitionSchemeDescriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count The number of partitions.
         * 
         * @return builder
         * 
         */
        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The number of partitions.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param names Array of size specified by the ‘count’ parameter, for the names of the partitions.
         * 
         * @return builder
         * 
         */
        public Builder names(Output<List<String>> names) {
            $.names = names;
            return this;
        }

        /**
         * @param names Array of size specified by the ‘count’ parameter, for the names of the partitions.
         * 
         * @return builder
         * 
         */
        public Builder names(List<String> names) {
            return names(Output.of(names));
        }

        /**
         * @param names Array of size specified by the ‘count’ parameter, for the names of the partitions.
         * 
         * @return builder
         * 
         */
        public Builder names(String... names) {
            return names(List.of(names));
        }

        /**
         * @param partitionScheme Enumerates the ways that a service can be partitioned.
         * Expected value is &#39;Named&#39;.
         * 
         * @return builder
         * 
         */
        public Builder partitionScheme(Output<String> partitionScheme) {
            $.partitionScheme = partitionScheme;
            return this;
        }

        /**
         * @param partitionScheme Enumerates the ways that a service can be partitioned.
         * Expected value is &#39;Named&#39;.
         * 
         * @return builder
         * 
         */
        public Builder partitionScheme(String partitionScheme) {
            return partitionScheme(Output.of(partitionScheme));
        }

        public NamedPartitionSchemeDescriptionArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.names = Objects.requireNonNull($.names, "expected parameter 'names' to be non-null");
            $.partitionScheme = Codegen.stringProp("partitionScheme").output().arg($.partitionScheme).require();
            return $;
        }
    }

}
