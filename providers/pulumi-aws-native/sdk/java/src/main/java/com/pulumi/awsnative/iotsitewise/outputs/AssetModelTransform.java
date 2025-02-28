// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.awsnative.iotsitewise.outputs.AssetModelExpressionVariable;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AssetModelTransform {
    /**
     * @return The mathematical expression that defines the transformation function. You can specify up to 10 functions per expression.
     * 
     */
    private final String expression;
    /**
     * @return The list of variables used in the expression.
     * 
     */
    private final List<AssetModelExpressionVariable> variables;

    @CustomType.Constructor
    private AssetModelTransform(
        @CustomType.Parameter("expression") String expression,
        @CustomType.Parameter("variables") List<AssetModelExpressionVariable> variables) {
        this.expression = expression;
        this.variables = variables;
    }

    /**
     * @return The mathematical expression that defines the transformation function. You can specify up to 10 functions per expression.
     * 
     */
    public String expression() {
        return this.expression;
    }
    /**
     * @return The list of variables used in the expression.
     * 
     */
    public List<AssetModelExpressionVariable> variables() {
        return this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelTransform defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expression;
        private List<AssetModelExpressionVariable> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelTransform defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.variables = defaults.variables;
        }

        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder variables(List<AssetModelExpressionVariable> variables) {
            this.variables = Objects.requireNonNull(variables);
            return this;
        }
        public Builder variables(AssetModelExpressionVariable... variables) {
            return variables(List.of(variables));
        }        public AssetModelTransform build() {
            return new AssetModelTransform(expression, variables);
        }
    }
}
