// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureMLWebServiceFileArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure ML Batch Execution activity.
 * 
 */
public final class AzureMLBatchExecutionActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureMLBatchExecutionActivityArgs Empty = new AzureMLBatchExecutionActivityArgs();

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    /**
     * @return Activity depends on condition.
     * 
     */
    public Optional<Output<List<ActivityDependencyArgs>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Activity description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint. Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be passed in the GlobalParameters property of the Azure ML batch execution request.
     * 
     */
    @Import(name="globalParameters")
    private @Nullable Output<Map<String,Object>> globalParameters;

    /**
     * @return Key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint. Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be passed in the GlobalParameters property of the Azure ML batch execution request.
     * 
     */
    public Optional<Output<Map<String,Object>>> globalParameters() {
        return Optional.ofNullable(this.globalParameters);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;

    /**
     * @return Linked service reference.
     * 
     */
    public Optional<Output<LinkedServiceReferenceArgs>> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Activity name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<ActivityPolicyArgs> policy;

    /**
     * @return Activity policy.
     * 
     */
    public Optional<Output<ActivityPolicyArgs>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Type of activity.
     * Expected value is &#39;AzureMLBatchExecution&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of activity.
     * Expected value is &#39;AzureMLBatchExecution&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable Output<List<UserPropertyArgs>> userProperties;

    /**
     * @return Activity user properties.
     * 
     */
    public Optional<Output<List<UserPropertyArgs>>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    /**
     * Key,Value pairs, mapping the names of Azure ML endpoint&#39;s Web Service Inputs to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the WebServiceInputs property of the Azure ML batch execution request.
     * 
     */
    @Import(name="webServiceInputs")
    private @Nullable Output<Map<String,AzureMLWebServiceFileArgs>> webServiceInputs;

    /**
     * @return Key,Value pairs, mapping the names of Azure ML endpoint&#39;s Web Service Inputs to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the WebServiceInputs property of the Azure ML batch execution request.
     * 
     */
    public Optional<Output<Map<String,AzureMLWebServiceFileArgs>>> webServiceInputs() {
        return Optional.ofNullable(this.webServiceInputs);
    }

    /**
     * Key,Value pairs, mapping the names of Azure ML endpoint&#39;s Web Service Outputs to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the WebServiceOutputs property of the Azure ML batch execution request.
     * 
     */
    @Import(name="webServiceOutputs")
    private @Nullable Output<Map<String,AzureMLWebServiceFileArgs>> webServiceOutputs;

    /**
     * @return Key,Value pairs, mapping the names of Azure ML endpoint&#39;s Web Service Outputs to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the WebServiceOutputs property of the Azure ML batch execution request.
     * 
     */
    public Optional<Output<Map<String,AzureMLWebServiceFileArgs>>> webServiceOutputs() {
        return Optional.ofNullable(this.webServiceOutputs);
    }

    private AzureMLBatchExecutionActivityArgs() {}

    private AzureMLBatchExecutionActivityArgs(AzureMLBatchExecutionActivityArgs $) {
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.globalParameters = $.globalParameters;
        this.linkedServiceName = $.linkedServiceName;
        this.name = $.name;
        this.policy = $.policy;
        this.type = $.type;
        this.userProperties = $.userProperties;
        this.webServiceInputs = $.webServiceInputs;
        this.webServiceOutputs = $.webServiceOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureMLBatchExecutionActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureMLBatchExecutionActivityArgs $;

        public Builder() {
            $ = new AzureMLBatchExecutionActivityArgs();
        }

        public Builder(AzureMLBatchExecutionActivityArgs defaults) {
            $ = new AzureMLBatchExecutionActivityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(List<ActivityDependencyArgs> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param globalParameters Key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint. Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be passed in the GlobalParameters property of the Azure ML batch execution request.
         * 
         * @return builder
         * 
         */
        public Builder globalParameters(@Nullable Output<Map<String,Object>> globalParameters) {
            $.globalParameters = globalParameters;
            return this;
        }

        /**
         * @param globalParameters Key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint. Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be passed in the GlobalParameters property of the Azure ML batch execution request.
         * 
         * @return builder
         * 
         */
        public Builder globalParameters(Map<String,Object> globalParameters) {
            return globalParameters(Output.of(globalParameters));
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policy Activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(ActivityPolicyArgs policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;AzureMLBatchExecution&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;AzureMLBatchExecution&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(List<UserPropertyArgs> userProperties) {
            return userProperties(Output.of(userProperties));
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }

        /**
         * @param webServiceInputs Key,Value pairs, mapping the names of Azure ML endpoint&#39;s Web Service Inputs to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the WebServiceInputs property of the Azure ML batch execution request.
         * 
         * @return builder
         * 
         */
        public Builder webServiceInputs(@Nullable Output<Map<String,AzureMLWebServiceFileArgs>> webServiceInputs) {
            $.webServiceInputs = webServiceInputs;
            return this;
        }

        /**
         * @param webServiceInputs Key,Value pairs, mapping the names of Azure ML endpoint&#39;s Web Service Inputs to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the WebServiceInputs property of the Azure ML batch execution request.
         * 
         * @return builder
         * 
         */
        public Builder webServiceInputs(Map<String,AzureMLWebServiceFileArgs> webServiceInputs) {
            return webServiceInputs(Output.of(webServiceInputs));
        }

        /**
         * @param webServiceOutputs Key,Value pairs, mapping the names of Azure ML endpoint&#39;s Web Service Outputs to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the WebServiceOutputs property of the Azure ML batch execution request.
         * 
         * @return builder
         * 
         */
        public Builder webServiceOutputs(@Nullable Output<Map<String,AzureMLWebServiceFileArgs>> webServiceOutputs) {
            $.webServiceOutputs = webServiceOutputs;
            return this;
        }

        /**
         * @param webServiceOutputs Key,Value pairs, mapping the names of Azure ML endpoint&#39;s Web Service Outputs to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the WebServiceOutputs property of the Azure ML batch execution request.
         * 
         * @return builder
         * 
         */
        public Builder webServiceOutputs(Map<String,AzureMLWebServiceFileArgs> webServiceOutputs) {
            return webServiceOutputs(Output.of(webServiceOutputs));
        }

        public AzureMLBatchExecutionActivityArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
