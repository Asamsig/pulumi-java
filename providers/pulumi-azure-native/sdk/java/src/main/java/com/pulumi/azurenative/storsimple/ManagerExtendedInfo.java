// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.storsimple.ManagerExtendedInfoArgs;
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
 * The extended info of the manager.
 * API Version: 2017-06-01.
 * 
 * ## Example Usage
 * ### ManagersCreateExtendedInfo
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
 *         var managerExtendedInfo = new ManagerExtendedInfo(&#34;managerExtendedInfo&#34;, ManagerExtendedInfoArgs.builder()        
 *             .algorithm(&#34;None&#34;)
 *             .integrityKey(&#34;BIl+RHqO8PZ6DRvuXTTK7g==&#34;)
 *             .managerName(&#34;ManagerForSDKTest2&#34;)
 *             .resourceGroupName(&#34;ResourceGroupForSDKTest&#34;)
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
 * $ pulumi import azure-native:storsimple:ManagerExtendedInfo vaultExtendedInfo /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.StorSimple/Managers/ManagerForSDKTest2extendedInformation/vaultExtendedInfo 
 * ```
 * 
 */
@ResourceType(type="azure-native:storsimple:ManagerExtendedInfo")
public class ManagerExtendedInfo extends com.pulumi.resources.CustomResource {
    /**
     * Represents the encryption algorithm used to encrypt the keys. None - if Key is saved in plain text format. Algorithm name - if key is encrypted
     * 
     */
    @Export(name="algorithm", type=String.class, parameters={})
    private Output<String> algorithm;

    /**
     * @return Represents the encryption algorithm used to encrypt the keys. None - if Key is saved in plain text format. Algorithm name - if key is encrypted
     * 
     */
    public Output<String> algorithm() {
        return this.algorithm;
    }
    /**
     * Represents the CEK of the resource.
     * 
     */
    @Export(name="encryptionKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryptionKey;

    /**
     * @return Represents the CEK of the resource.
     * 
     */
    public Output<Optional<String>> encryptionKey() {
        return Codegen.optional(this.encryptionKey);
    }
    /**
     * Represents the Cert thumbprint that was used to encrypt the CEK.
     * 
     */
    @Export(name="encryptionKeyThumbprint", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryptionKeyThumbprint;

    /**
     * @return Represents the Cert thumbprint that was used to encrypt the CEK.
     * 
     */
    public Output<Optional<String>> encryptionKeyThumbprint() {
        return Codegen.optional(this.encryptionKeyThumbprint);
    }
    /**
     * The etag of the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return The etag of the resource.
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * Represents the CIK of the resource.
     * 
     */
    @Export(name="integrityKey", type=String.class, parameters={})
    private Output<String> integrityKey;

    /**
     * @return Represents the CIK of the resource.
     * 
     */
    public Output<String> integrityKey() {
        return this.integrityKey;
    }
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The Kind of the object. Currently only Series8000 is supported
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * The name of the object.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the object.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Represents the portal thumbprint which can be used optionally to encrypt the entire data before storing it.
     * 
     */
    @Export(name="portalCertificateThumbprint", type=String.class, parameters={})
    private Output</* @Nullable */ String> portalCertificateThumbprint;

    /**
     * @return Represents the portal thumbprint which can be used optionally to encrypt the entire data before storing it.
     * 
     */
    public Output<Optional<String>> portalCertificateThumbprint() {
        return Codegen.optional(this.portalCertificateThumbprint);
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The version of the extended info being persisted.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return The version of the extended info being persisted.
     * 
     */
    public Output<Optional<String>> version() {
        return Codegen.optional(this.version);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagerExtendedInfo(String name) {
        this(name, ManagerExtendedInfoArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagerExtendedInfo(String name, ManagerExtendedInfoArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagerExtendedInfo(String name, ManagerExtendedInfoArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:ManagerExtendedInfo", name, args == null ? ManagerExtendedInfoArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagerExtendedInfo(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:ManagerExtendedInfo", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storsimple/v20161001:ManagerExtendedInfo").build()),
                Output.of(Alias.builder().type("azure-native:storsimple/v20170601:ManagerExtendedInfo").build())
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
    public static ManagerExtendedInfo get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagerExtendedInfo(name, id, options);
    }
}
