// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.apigateway.MethodArgs;
import com.pulumi.awsnative.apigateway.enums.MethodAuthorizationType;
import com.pulumi.awsnative.apigateway.outputs.MethodIntegration;
import com.pulumi.awsnative.apigateway.outputs.MethodResponse;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ApiGateway::Method
 * 
 */
@ResourceType(type="aws-native:apigateway:Method")
public class Method extends com.pulumi.resources.CustomResource {
    /**
     * Indicates whether the method requires clients to submit a valid API key.
     * 
     */
    @Export(name="apiKeyRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> apiKeyRequired;

    /**
     * @return Indicates whether the method requires clients to submit a valid API key.
     * 
     */
    public Output<Optional<Boolean>> apiKeyRequired() {
        return Codegen.optional(this.apiKeyRequired);
    }
    /**
     * A list of authorization scopes configured on the method.
     * 
     */
    @Export(name="authorizationScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> authorizationScopes;

    /**
     * @return A list of authorization scopes configured on the method.
     * 
     */
    public Output<Optional<List<String>>> authorizationScopes() {
        return Codegen.optional(this.authorizationScopes);
    }
    /**
     * The method&#39;s authorization type.
     * 
     */
    @Export(name="authorizationType", type=MethodAuthorizationType.class, parameters={})
    private Output</* @Nullable */ MethodAuthorizationType> authorizationType;

    /**
     * @return The method&#39;s authorization type.
     * 
     */
    public Output<Optional<MethodAuthorizationType>> authorizationType() {
        return Codegen.optional(this.authorizationType);
    }
    /**
     * The identifier of the authorizer to use on this method.
     * 
     */
    @Export(name="authorizerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizerId;

    /**
     * @return The identifier of the authorizer to use on this method.
     * 
     */
    public Output<Optional<String>> authorizerId() {
        return Codegen.optional(this.authorizerId);
    }
    /**
     * The backend system that the method calls when it receives a request.
     * 
     */
    @Export(name="httpMethod", type=String.class, parameters={})
    private Output<String> httpMethod;

    /**
     * @return The backend system that the method calls when it receives a request.
     * 
     */
    public Output<String> httpMethod() {
        return this.httpMethod;
    }
    /**
     * The backend system that the method calls when it receives a request.
     * 
     */
    @Export(name="integration", type=MethodIntegration.class, parameters={})
    private Output</* @Nullable */ MethodIntegration> integration;

    /**
     * @return The backend system that the method calls when it receives a request.
     * 
     */
    public Output<Optional<MethodIntegration>> integration() {
        return Codegen.optional(this.integration);
    }
    /**
     * The responses that can be sent to the client who calls the method.
     * 
     */
    @Export(name="methodResponses", type=List.class, parameters={MethodResponse.class})
    private Output</* @Nullable */ List<MethodResponse>> methodResponses;

    /**
     * @return The responses that can be sent to the client who calls the method.
     * 
     */
    public Output<Optional<List<MethodResponse>>> methodResponses() {
        return Codegen.optional(this.methodResponses);
    }
    /**
     * A friendly operation name for the method.
     * 
     */
    @Export(name="operationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> operationName;

    /**
     * @return A friendly operation name for the method.
     * 
     */
    public Output<Optional<String>> operationName() {
        return Codegen.optional(this.operationName);
    }
    /**
     * The resources that are used for the request&#39;s content type. Specify request models as key-value pairs (string-to-string mapping), with a content type as the key and a Model resource name as the value.
     * 
     */
    @Export(name="requestModels", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> requestModels;

    /**
     * @return The resources that are used for the request&#39;s content type. Specify request models as key-value pairs (string-to-string mapping), with a content type as the key and a Model resource name as the value.
     * 
     */
    public Output<Optional<Object>> requestModels() {
        return Codegen.optional(this.requestModels);
    }
    /**
     * The request parameters that API Gateway accepts. Specify request parameters as key-value pairs (string-to-Boolean mapping), with a source as the key and a Boolean as the value.
     * 
     */
    @Export(name="requestParameters", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> requestParameters;

    /**
     * @return The request parameters that API Gateway accepts. Specify request parameters as key-value pairs (string-to-Boolean mapping), with a source as the key and a Boolean as the value.
     * 
     */
    public Output<Optional<Object>> requestParameters() {
        return Codegen.optional(this.requestParameters);
    }
    /**
     * The ID of the associated request validator.
     * 
     */
    @Export(name="requestValidatorId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestValidatorId;

    /**
     * @return The ID of the associated request validator.
     * 
     */
    public Output<Optional<String>> requestValidatorId() {
        return Codegen.optional(this.requestValidatorId);
    }
    /**
     * The ID of an API Gateway resource.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The ID of an API Gateway resource.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }
    /**
     * The ID of the RestApi resource in which API Gateway creates the method.
     * 
     */
    @Export(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    /**
     * @return The ID of the RestApi resource in which API Gateway creates the method.
     * 
     */
    public Output<String> restApiId() {
        return this.restApiId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Method(String name) {
        this(name, MethodArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Method(String name, MethodArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Method(String name, MethodArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Method", name, args == null ? MethodArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Method(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Method", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Method get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Method(name, id, options);
    }
}
