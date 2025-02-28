// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.inputs.WebServiceParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies a node in the web service graph. The node can either be an input, output or asset node, so only one of the corresponding id properties is populated at any given time.
 * 
 */
public final class GraphNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GraphNodeArgs Empty = new GraphNodeArgs();

    /**
     * The id of the asset represented by this node.
     * 
     */
    @Import(name="assetId")
    private @Nullable Output<String> assetId;

    /**
     * @return The id of the asset represented by this node.
     * 
     */
    public Optional<Output<String>> assetId() {
        return Optional.ofNullable(this.assetId);
    }

    /**
     * The id of the input element represented by this node.
     * 
     */
    @Import(name="inputId")
    private @Nullable Output<String> inputId;

    /**
     * @return The id of the input element represented by this node.
     * 
     */
    public Optional<Output<String>> inputId() {
        return Optional.ofNullable(this.inputId);
    }

    /**
     * The id of the output element represented by this node.
     * 
     */
    @Import(name="outputId")
    private @Nullable Output<String> outputId;

    /**
     * @return The id of the output element represented by this node.
     * 
     */
    public Optional<Output<String>> outputId() {
        return Optional.ofNullable(this.outputId);
    }

    /**
     * If applicable, parameters of the node. Global graph parameters map into these, with values set at runtime.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,WebServiceParameterArgs>> parameters;

    /**
     * @return If applicable, parameters of the node. Global graph parameters map into these, with values set at runtime.
     * 
     */
    public Optional<Output<Map<String,WebServiceParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private GraphNodeArgs() {}

    private GraphNodeArgs(GraphNodeArgs $) {
        this.assetId = $.assetId;
        this.inputId = $.inputId;
        this.outputId = $.outputId;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphNodeArgs $;

        public Builder() {
            $ = new GraphNodeArgs();
        }

        public Builder(GraphNodeArgs defaults) {
            $ = new GraphNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assetId The id of the asset represented by this node.
         * 
         * @return builder
         * 
         */
        public Builder assetId(@Nullable Output<String> assetId) {
            $.assetId = assetId;
            return this;
        }

        /**
         * @param assetId The id of the asset represented by this node.
         * 
         * @return builder
         * 
         */
        public Builder assetId(String assetId) {
            return assetId(Output.of(assetId));
        }

        /**
         * @param inputId The id of the input element represented by this node.
         * 
         * @return builder
         * 
         */
        public Builder inputId(@Nullable Output<String> inputId) {
            $.inputId = inputId;
            return this;
        }

        /**
         * @param inputId The id of the input element represented by this node.
         * 
         * @return builder
         * 
         */
        public Builder inputId(String inputId) {
            return inputId(Output.of(inputId));
        }

        /**
         * @param outputId The id of the output element represented by this node.
         * 
         * @return builder
         * 
         */
        public Builder outputId(@Nullable Output<String> outputId) {
            $.outputId = outputId;
            return this;
        }

        /**
         * @param outputId The id of the output element represented by this node.
         * 
         * @return builder
         * 
         */
        public Builder outputId(String outputId) {
            return outputId(Output.of(outputId));
        }

        /**
         * @param parameters If applicable, parameters of the node. Global graph parameters map into these, with values set at runtime.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,WebServiceParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters If applicable, parameters of the node. Global graph parameters map into these, with values set at runtime.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,WebServiceParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public GraphNodeArgs build() {
            return $;
        }
    }

}
