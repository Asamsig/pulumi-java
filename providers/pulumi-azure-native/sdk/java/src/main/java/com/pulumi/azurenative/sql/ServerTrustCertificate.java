// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.ServerTrustCertificateArgs;
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
 * Server trust certificate imported from box to enable connection between box and Sql Managed Instance.
 * API Version: 2021-05-01-preview.
 * 
 * ## Example Usage
 * ### Create server trust certificate.
 * 
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
 *         var serverTrustCertificate = new ServerTrustCertificate(&#34;serverTrustCertificate&#34;, ServerTrustCertificateArgs.builder()        
 *             .certificateName(&#34;customerCertificateName&#34;)
 *             .managedInstanceName(&#34;testcl&#34;)
 *             .publicBlob(&#34;308203AE30820296A0030201020210&#34;)
 *             .resourceGroupName(&#34;testrg&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ServerTrustCertificate customerCertificateName /subscriptions/0574222d-5c7f-489c-a172-b3013eafab53/resourceGroups/testrg/providers/Microsoft.Sql/managedInstances/testcl/serverTrustCertificates/customerCertificateName 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ServerTrustCertificate")
public class ServerTrustCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The certificate name
     * 
     */
    @Export(name="certificateName", type=String.class, parameters={})
    private Output<String> certificateName;

    /**
     * @return The certificate name
     * 
     */
    public Output<String> certificateName() {
        return this.certificateName;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The certificate public blob
     * 
     */
    @Export(name="publicBlob", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicBlob;

    /**
     * @return The certificate public blob
     * 
     */
    public Output<Optional<String>> publicBlob() {
        return Codegen.optional(this.publicBlob);
    }
    /**
     * The certificate thumbprint
     * 
     */
    @Export(name="thumbprint", type=String.class, parameters={})
    private Output<String> thumbprint;

    /**
     * @return The certificate thumbprint
     * 
     */
    public Output<String> thumbprint() {
        return this.thumbprint;
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
    public ServerTrustCertificate(String name) {
        this(name, ServerTrustCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerTrustCertificate(String name, ServerTrustCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerTrustCertificate(String name, ServerTrustCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerTrustCertificate", name, args == null ? ServerTrustCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerTrustCertificate(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerTrustCertificate", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:ServerTrustCertificate").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:ServerTrustCertificate").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101preview:ServerTrustCertificate").build())
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
    public static ServerTrustCertificate get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerTrustCertificate(name, id, options);
    }
}
