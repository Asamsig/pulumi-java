// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.inputs.GraphEdgeArgs;
import com.pulumi.azurenative.machinelearning.inputs.GraphNodeArgs;
import com.pulumi.azurenative.machinelearning.inputs.GraphParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the graph of modules making up the machine learning solution.
 * 
 */
public final class GraphPackageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GraphPackageArgs Empty = new GraphPackageArgs();

    /**
     * The list of edges making up the graph.
     * 
     */
    @Import(name="edges")
    private @Nullable Output<List<GraphEdgeArgs>> edges;

    /**
     * @return The list of edges making up the graph.
     * 
     */
    public Optional<Output<List<GraphEdgeArgs>>> edges() {
        return Optional.ofNullable(this.edges);
    }

    /**
     * The collection of global parameters for the graph, given as a global parameter name to GraphParameter map. Each parameter here has a 1:1 match with the global parameters values map declared at the WebServiceProperties level.
     * 
     */
    @Import(name="graphParameters")
    private @Nullable Output<Map<String,GraphParameterArgs>> graphParameters;

    /**
     * @return The collection of global parameters for the graph, given as a global parameter name to GraphParameter map. Each parameter here has a 1:1 match with the global parameters values map declared at the WebServiceProperties level.
     * 
     */
    public Optional<Output<Map<String,GraphParameterArgs>>> graphParameters() {
        return Optional.ofNullable(this.graphParameters);
    }

    /**
     * The set of nodes making up the graph, provided as a nodeId to GraphNode map
     * 
     */
    @Import(name="nodes")
    private @Nullable Output<Map<String,GraphNodeArgs>> nodes;

    /**
     * @return The set of nodes making up the graph, provided as a nodeId to GraphNode map
     * 
     */
    public Optional<Output<Map<String,GraphNodeArgs>>> nodes() {
        return Optional.ofNullable(this.nodes);
    }

    private GraphPackageArgs() {}

    private GraphPackageArgs(GraphPackageArgs $) {
        this.edges = $.edges;
        this.graphParameters = $.graphParameters;
        this.nodes = $.nodes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphPackageArgs $;

        public Builder() {
            $ = new GraphPackageArgs();
        }

        public Builder(GraphPackageArgs defaults) {
            $ = new GraphPackageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param edges The list of edges making up the graph.
         * 
         * @return builder
         * 
         */
        public Builder edges(@Nullable Output<List<GraphEdgeArgs>> edges) {
            $.edges = edges;
            return this;
        }

        /**
         * @param edges The list of edges making up the graph.
         * 
         * @return builder
         * 
         */
        public Builder edges(List<GraphEdgeArgs> edges) {
            return edges(Output.of(edges));
        }

        /**
         * @param edges The list of edges making up the graph.
         * 
         * @return builder
         * 
         */
        public Builder edges(GraphEdgeArgs... edges) {
            return edges(List.of(edges));
        }

        /**
         * @param graphParameters The collection of global parameters for the graph, given as a global parameter name to GraphParameter map. Each parameter here has a 1:1 match with the global parameters values map declared at the WebServiceProperties level.
         * 
         * @return builder
         * 
         */
        public Builder graphParameters(@Nullable Output<Map<String,GraphParameterArgs>> graphParameters) {
            $.graphParameters = graphParameters;
            return this;
        }

        /**
         * @param graphParameters The collection of global parameters for the graph, given as a global parameter name to GraphParameter map. Each parameter here has a 1:1 match with the global parameters values map declared at the WebServiceProperties level.
         * 
         * @return builder
         * 
         */
        public Builder graphParameters(Map<String,GraphParameterArgs> graphParameters) {
            return graphParameters(Output.of(graphParameters));
        }

        /**
         * @param nodes The set of nodes making up the graph, provided as a nodeId to GraphNode map
         * 
         * @return builder
         * 
         */
        public Builder nodes(@Nullable Output<Map<String,GraphNodeArgs>> nodes) {
            $.nodes = nodes;
            return this;
        }

        /**
         * @param nodes The set of nodes making up the graph, provided as a nodeId to GraphNode map
         * 
         * @return builder
         * 
         */
        public Builder nodes(Map<String,GraphNodeArgs> nodes) {
            return nodes(Output.of(nodes));
        }

        public GraphPackageArgs build() {
            return $;
        }
    }

}
