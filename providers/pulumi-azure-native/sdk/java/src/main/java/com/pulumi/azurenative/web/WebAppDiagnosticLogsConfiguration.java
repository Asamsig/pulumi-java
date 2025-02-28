// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.WebAppDiagnosticLogsConfigurationArgs;
import com.pulumi.azurenative.web.outputs.ApplicationLogsConfigResponse;
import com.pulumi.azurenative.web.outputs.EnabledConfigResponse;
import com.pulumi.azurenative.web.outputs.HttpLogsConfigResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Configuration of App Service site logs.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppDiagnosticLogsConfiguration myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/logs 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppDiagnosticLogsConfiguration")
public class WebAppDiagnosticLogsConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Application logs configuration.
     * 
     */
    @Export(name="applicationLogs", type=ApplicationLogsConfigResponse.class, parameters={})
    private Output</* @Nullable */ ApplicationLogsConfigResponse> applicationLogs;

    /**
     * @return Application logs configuration.
     * 
     */
    public Output<Optional<ApplicationLogsConfigResponse>> applicationLogs() {
        return Codegen.optional(this.applicationLogs);
    }
    /**
     * Detailed error messages configuration.
     * 
     */
    @Export(name="detailedErrorMessages", type=EnabledConfigResponse.class, parameters={})
    private Output</* @Nullable */ EnabledConfigResponse> detailedErrorMessages;

    /**
     * @return Detailed error messages configuration.
     * 
     */
    public Output<Optional<EnabledConfigResponse>> detailedErrorMessages() {
        return Codegen.optional(this.detailedErrorMessages);
    }
    /**
     * Failed requests tracing configuration.
     * 
     */
    @Export(name="failedRequestsTracing", type=EnabledConfigResponse.class, parameters={})
    private Output</* @Nullable */ EnabledConfigResponse> failedRequestsTracing;

    /**
     * @return Failed requests tracing configuration.
     * 
     */
    public Output<Optional<EnabledConfigResponse>> failedRequestsTracing() {
        return Codegen.optional(this.failedRequestsTracing);
    }
    /**
     * HTTP logs configuration.
     * 
     */
    @Export(name="httpLogs", type=HttpLogsConfigResponse.class, parameters={})
    private Output</* @Nullable */ HttpLogsConfigResponse> httpLogs;

    /**
     * @return HTTP logs configuration.
     * 
     */
    public Output<Optional<HttpLogsConfigResponse>> httpLogs() {
        return Codegen.optional(this.httpLogs);
    }
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppDiagnosticLogsConfiguration(String name) {
        this(name, WebAppDiagnosticLogsConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppDiagnosticLogsConfiguration(String name, WebAppDiagnosticLogsConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppDiagnosticLogsConfiguration(String name, WebAppDiagnosticLogsConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppDiagnosticLogsConfiguration", name, args == null ? WebAppDiagnosticLogsConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppDiagnosticLogsConfiguration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppDiagnosticLogsConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20150801:WebAppDiagnosticLogsConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppDiagnosticLogsConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppDiagnosticLogsConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppDiagnosticLogsConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppDiagnosticLogsConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppDiagnosticLogsConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppDiagnosticLogsConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppDiagnosticLogsConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppDiagnosticLogsConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppDiagnosticLogsConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppDiagnosticLogsConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppDiagnosticLogsConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppDiagnosticLogsConfiguration").build())
            ))
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
    public static WebAppDiagnosticLogsConfiguration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppDiagnosticLogsConfiguration(name, id, options);
    }
}
