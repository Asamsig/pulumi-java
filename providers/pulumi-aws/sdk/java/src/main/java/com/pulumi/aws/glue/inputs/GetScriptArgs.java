// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.aws.glue.inputs.GetScriptDagEdgeArgs;
import com.pulumi.aws.glue.inputs.GetScriptDagNodeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScriptArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScriptArgs Empty = new GetScriptArgs();

    /**
     * A list of the edges in the DAG. Defined below.
     * 
     */
    @Import(name="dagEdges", required=true)
    private Output<List<GetScriptDagEdgeArgs>> dagEdges;

    /**
     * @return A list of the edges in the DAG. Defined below.
     * 
     */
    public Output<List<GetScriptDagEdgeArgs>> dagEdges() {
        return this.dagEdges;
    }

    /**
     * A list of the nodes in the DAG. Defined below.
     * 
     */
    @Import(name="dagNodes", required=true)
    private Output<List<GetScriptDagNodeArgs>> dagNodes;

    /**
     * @return A list of the nodes in the DAG. Defined below.
     * 
     */
    public Output<List<GetScriptDagNodeArgs>> dagNodes() {
        return this.dagNodes;
    }

    /**
     * The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
     * 
     */
    @Import(name="language")
    private @Nullable Output<String> language;

    /**
     * @return The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
     * 
     */
    public Optional<Output<String>> language() {
        return Optional.ofNullable(this.language);
    }

    private GetScriptArgs() {}

    private GetScriptArgs(GetScriptArgs $) {
        this.dagEdges = $.dagEdges;
        this.dagNodes = $.dagNodes;
        this.language = $.language;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScriptArgs $;

        public Builder() {
            $ = new GetScriptArgs();
        }

        public Builder(GetScriptArgs defaults) {
            $ = new GetScriptArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dagEdges A list of the edges in the DAG. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder dagEdges(Output<List<GetScriptDagEdgeArgs>> dagEdges) {
            $.dagEdges = dagEdges;
            return this;
        }

        /**
         * @param dagEdges A list of the edges in the DAG. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder dagEdges(List<GetScriptDagEdgeArgs> dagEdges) {
            return dagEdges(Output.of(dagEdges));
        }

        /**
         * @param dagEdges A list of the edges in the DAG. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder dagEdges(GetScriptDagEdgeArgs... dagEdges) {
            return dagEdges(List.of(dagEdges));
        }

        /**
         * @param dagNodes A list of the nodes in the DAG. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder dagNodes(Output<List<GetScriptDagNodeArgs>> dagNodes) {
            $.dagNodes = dagNodes;
            return this;
        }

        /**
         * @param dagNodes A list of the nodes in the DAG. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder dagNodes(List<GetScriptDagNodeArgs> dagNodes) {
            return dagNodes(Output.of(dagNodes));
        }

        /**
         * @param dagNodes A list of the nodes in the DAG. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder dagNodes(GetScriptDagNodeArgs... dagNodes) {
            return dagNodes(List.of(dagNodes));
        }

        /**
         * @param language The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
         * 
         * @return builder
         * 
         */
        public Builder language(@Nullable Output<String> language) {
            $.language = language;
            return this;
        }

        /**
         * @param language The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
         * 
         * @return builder
         * 
         */
        public Builder language(String language) {
            return language(Output.of(language));
        }

        public GetScriptArgs build() {
            $.dagEdges = Objects.requireNonNull($.dagEdges, "expected parameter 'dagEdges' to be non-null");
            $.dagNodes = Objects.requireNonNull($.dagNodes, "expected parameter 'dagNodes' to be non-null");
            return $;
        }
    }

}
