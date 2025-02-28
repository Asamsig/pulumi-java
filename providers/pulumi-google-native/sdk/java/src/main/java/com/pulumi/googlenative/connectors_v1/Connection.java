// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.connectors_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.connectors_v1.ConnectionArgs;
import com.pulumi.googlenative.connectors_v1.outputs.AuthConfigResponse;
import com.pulumi.googlenative.connectors_v1.outputs.ConfigVariableResponse;
import com.pulumi.googlenative.connectors_v1.outputs.ConnectionStatusResponse;
import com.pulumi.googlenative.connectors_v1.outputs.LockConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Connection in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:connectors/v1:Connection")
public class Connection extends com.pulumi.resources.CustomResource {
    /**
     * Optional. Configuration for establishing the connection&#39;s authentication with an external system.
     * 
     */
    @Export(name="authConfig", type=AuthConfigResponse.class, parameters={})
    private Output<AuthConfigResponse> authConfig;

    /**
     * @return Optional. Configuration for establishing the connection&#39;s authentication with an external system.
     * 
     */
    public Output<AuthConfigResponse> authConfig() {
        return this.authConfig;
    }
    /**
     * Optional. Configuration for configuring the connection with an external system.
     * 
     */
    @Export(name="configVariables", type=List.class, parameters={ConfigVariableResponse.class})
    private Output<List<ConfigVariableResponse>> configVariables;

    /**
     * @return Optional. Configuration for configuring the connection with an external system.
     * 
     */
    public Output<List<ConfigVariableResponse>> configVariables() {
        return this.configVariables;
    }
    /**
     * Connector version on which the connection is created. The format is: projects/*{@literal /}locations/global/providers/*{@literal /}connectors/*{@literal /}versions/*
     * 
     */
    @Export(name="connectorVersion", type=String.class, parameters={})
    private Output<String> connectorVersion;

    /**
     * @return Connector version on which the connection is created. The format is: projects/*{@literal /}locations/global/providers/*{@literal /}connectors/*{@literal /}versions/*
     * 
     */
    public Output<String> connectorVersion() {
        return this.connectorVersion;
    }
    /**
     * Created time.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Created time.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. Description of the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. Description of the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Outbound domains/hosts needs to be allowlisted.
     * 
     */
    @Export(name="egressBackends", type=List.class, parameters={String.class})
    private Output<List<String>> egressBackends;

    /**
     * @return Outbound domains/hosts needs to be allowlisted.
     * 
     */
    public Output<List<String>> egressBackends() {
        return this.egressBackends;
    }
    /**
     * GCR location where the envoy image is stored. formatted like: gcr.io/{bucketName}/{imageName}
     * 
     */
    @Export(name="envoyImageLocation", type=String.class, parameters={})
    private Output<String> envoyImageLocation;

    /**
     * @return GCR location where the envoy image is stored. formatted like: gcr.io/{bucketName}/{imageName}
     * 
     */
    public Output<String> envoyImageLocation() {
        return this.envoyImageLocation;
    }
    /**
     * GCR location where the runtime image is stored. formatted like: gcr.io/{bucketName}/{imageName}
     * 
     */
    @Export(name="imageLocation", type=String.class, parameters={})
    private Output<String> imageLocation;

    /**
     * @return GCR location where the runtime image is stored. formatted like: gcr.io/{bucketName}/{imageName}
     * 
     */
    public Output<String> imageLocation() {
        return this.imageLocation;
    }
    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Optional. Configuration that indicates whether or not the Connection can be edited.
     * 
     */
    @Export(name="lockConfig", type=LockConfigResponse.class, parameters={})
    private Output<LockConfigResponse> lockConfig;

    /**
     * @return Optional. Configuration that indicates whether or not the Connection can be edited.
     * 
     */
    public Output<LockConfigResponse> lockConfig() {
        return this.lockConfig;
    }
    /**
     * Resource name of the Connection. Format: projects/{project}/locations/{location}/connections/{connection}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the Connection. Format: projects/{project}/locations/{location}/connections/{connection}
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Optional. Service account needed for runtime plane to access GCP resources.
     * 
     */
    @Export(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return Optional. Service account needed for runtime plane to access GCP resources.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * The name of the Service Directory service name. Used for Private Harpoon to resolve the ILB address. e.g. &#34;projects/cloud-connectors-e2e-testing/locations/us-central1/namespaces/istio-system/services/istio-ingressgateway-connectors&#34;
     * 
     */
    @Export(name="serviceDirectory", type=String.class, parameters={})
    private Output<String> serviceDirectory;

    /**
     * @return The name of the Service Directory service name. Used for Private Harpoon to resolve the ILB address. e.g. &#34;projects/cloud-connectors-e2e-testing/locations/us-central1/namespaces/istio-system/services/istio-ingressgateway-connectors&#34;
     * 
     */
    public Output<String> serviceDirectory() {
        return this.serviceDirectory;
    }
    /**
     * Current status of the connection.
     * 
     */
    @Export(name="status", type=ConnectionStatusResponse.class, parameters={})
    private Output<ConnectionStatusResponse> status;

    /**
     * @return Current status of the connection.
     * 
     */
    public Output<ConnectionStatusResponse> status() {
        return this.status;
    }
    /**
     * Optional. Suspended indicates if a user has suspended a connection or not.
     * 
     */
    @Export(name="suspended", type=Boolean.class, parameters={})
    private Output<Boolean> suspended;

    /**
     * @return Optional. Suspended indicates if a user has suspended a connection or not.
     * 
     */
    public Output<Boolean> suspended() {
        return this.suspended;
    }
    /**
     * Updated time.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Updated time.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connection(String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(String name, ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:connectors/v1:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:connectors/v1:Connection", name, null, makeResourceOptions(options, id));
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
    public static Connection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, options);
    }
}
