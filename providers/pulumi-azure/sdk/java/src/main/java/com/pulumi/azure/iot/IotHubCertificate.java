// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.iot.IotHubCertificateArgs;
import com.pulumi.azure.iot.inputs.IotHubCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an IotHub Device Provisioning Service Certificate.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleIotHubDps = new IotHubDps(&#34;exampleIotHubDps&#34;, IotHubDpsArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .sku(IotHubDpsSku.builder()
 *                 .name(&#34;S1&#34;)
 *                 .capacity(&#34;1&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleIotHubCertificate = new IotHubCertificate(&#34;exampleIotHubCertificate&#34;, IotHubCertificateArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .iotDpsName(exampleIotHubDps.getName())
 *             .certificateContent(Base64.getEncoder().encodeToString(Files.readAllBytes(Paths.get(&#34;example.cer&#34;))))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * IoTHub Device Provisioning Service Certificates can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:iot/iotHubCertificate:IotHubCertificate example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Devices/provisioningServices/example/certificates/example
 * ```
 * 
 */
@ResourceType(type="azure:iot/iotHubCertificate:IotHubCertificate")
public class IotHubCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The Base-64 representation of the X509 leaf certificate .cer file or just a .pem file content.
     * 
     */
    @Export(name="certificateContent", type=String.class, parameters={})
    private Output<String> certificateContent;

    /**
     * @return The Base-64 representation of the X509 leaf certificate .cer file or just a .pem file content.
     * 
     */
    public Output<String> certificateContent() {
        return this.certificateContent;
    }
    /**
     * The name of the IoT Device Provisioning Service that this certificate will be attached to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="iotDpsName", type=String.class, parameters={})
    private Output<String> iotDpsName;

    /**
     * @return The name of the IoT Device Provisioning Service that this certificate will be attached to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> iotDpsName() {
        return this.iotDpsName;
    }
    /**
     * Specifies the name of the Iot Device Provisioning Service Certificate resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Iot Device Provisioning Service Certificate resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group under which the Iot Device Provisioning Service Certificate resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group under which the Iot Device Provisioning Service Certificate resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IotHubCertificate(String name) {
        this(name, IotHubCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IotHubCertificate(String name, IotHubCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IotHubCertificate(String name, IotHubCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:iot/iotHubCertificate:IotHubCertificate", name, args == null ? IotHubCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IotHubCertificate(String name, Output<String> id, @Nullable IotHubCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:iot/iotHubCertificate:IotHubCertificate", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static IotHubCertificate get(String name, Output<String> id, @Nullable IotHubCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IotHubCertificate(name, id, state, options);
    }
}
