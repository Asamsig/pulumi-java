// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.azurenative.deploymentmanager.inputs.RestHealthCheckStepAttributesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the properties of a health check step.
 * 
 */
public final class HealthCheckStepPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final HealthCheckStepPropertiesArgs Empty = new HealthCheckStepPropertiesArgs();

    /**
     * The health check step attributes
     * 
     */
    @Import(name="attributes", required=true)
    private Output<RestHealthCheckStepAttributesArgs> attributes;

    /**
     * @return The health check step attributes
     * 
     */
    public Output<RestHealthCheckStepAttributesArgs> attributes() {
        return this.attributes;
    }

    /**
     * The type of step.
     * Expected value is &#39;HealthCheck&#39;.
     * 
     */
    @Import(name="stepType", required=true)
    private Output<String> stepType;

    /**
     * @return The type of step.
     * Expected value is &#39;HealthCheck&#39;.
     * 
     */
    public Output<String> stepType() {
        return this.stepType;
    }

    private HealthCheckStepPropertiesArgs() {}

    private HealthCheckStepPropertiesArgs(HealthCheckStepPropertiesArgs $) {
        this.attributes = $.attributes;
        this.stepType = $.stepType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthCheckStepPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthCheckStepPropertiesArgs $;

        public Builder() {
            $ = new HealthCheckStepPropertiesArgs();
        }

        public Builder(HealthCheckStepPropertiesArgs defaults) {
            $ = new HealthCheckStepPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributes The health check step attributes
         * 
         * @return builder
         * 
         */
        public Builder attributes(Output<RestHealthCheckStepAttributesArgs> attributes) {
            $.attributes = attributes;
            return this;
        }

        /**
         * @param attributes The health check step attributes
         * 
         * @return builder
         * 
         */
        public Builder attributes(RestHealthCheckStepAttributesArgs attributes) {
            return attributes(Output.of(attributes));
        }

        /**
         * @param stepType The type of step.
         * Expected value is &#39;HealthCheck&#39;.
         * 
         * @return builder
         * 
         */
        public Builder stepType(Output<String> stepType) {
            $.stepType = stepType;
            return this;
        }

        /**
         * @param stepType The type of step.
         * Expected value is &#39;HealthCheck&#39;.
         * 
         * @return builder
         * 
         */
        public Builder stepType(String stepType) {
            return stepType(Output.of(stepType));
        }

        public HealthCheckStepPropertiesArgs build() {
            $.attributes = Objects.requireNonNull($.attributes, "expected parameter 'attributes' to be non-null");
            $.stepType = Codegen.stringProp("stepType").output().arg($.stepType).require();
            return $;
        }
    }

}
