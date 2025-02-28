// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.desktopvirtualization;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.desktopvirtualization.ApplicationArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Schema for Application properties.
 * API Version: 2021-02-01-preview.
 * 
 * ## Example Usage
 * ### Application_Create
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
 *         var application = new Application(&#34;application&#34;, ApplicationArgs.builder()        
 *             .applicationGroupName(&#34;applicationGroup1&#34;)
 *             .applicationName(&#34;application1&#34;)
 *             .commandLineArguments(&#34;arguments&#34;)
 *             .commandLineSetting(&#34;Allow&#34;)
 *             .description(&#34;des1&#34;)
 *             .filePath(&#34;path&#34;)
 *             .friendlyName(&#34;friendly&#34;)
 *             .iconIndex(1)
 *             .iconPath(&#34;icon&#34;)
 *             .resourceGroupName(&#34;resourceGroup1&#34;)
 *             .showInPortal(true)
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
 * $ pulumi import azure-native:desktopvirtualization:Application applicationGroup1/application1 /subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourceGroups/resourceGroup1/providers/Microsoft.DesktopVirtualization/applicationGroups/applicationGroup1/applications/application1 
 * ```
 * 
 */
@ResourceType(type="azure-native:desktopvirtualization:Application")
public class Application extends com.pulumi.resources.CustomResource {
    /**
     * Resource Type of Application.
     * 
     */
    @Export(name="applicationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> applicationType;

    /**
     * @return Resource Type of Application.
     * 
     */
    public Output<Optional<String>> applicationType() {
        return Codegen.optional(this.applicationType);
    }
    /**
     * Command Line Arguments for Application.
     * 
     */
    @Export(name="commandLineArguments", type=String.class, parameters={})
    private Output</* @Nullable */ String> commandLineArguments;

    /**
     * @return Command Line Arguments for Application.
     * 
     */
    public Output<Optional<String>> commandLineArguments() {
        return Codegen.optional(this.commandLineArguments);
    }
    /**
     * Specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all.
     * 
     */
    @Export(name="commandLineSetting", type=String.class, parameters={})
    private Output<String> commandLineSetting;

    /**
     * @return Specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all.
     * 
     */
    public Output<String> commandLineSetting() {
        return this.commandLineSetting;
    }
    /**
     * Description of Application.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of Application.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies a path for the executable file for the application.
     * 
     */
    @Export(name="filePath", type=String.class, parameters={})
    private Output</* @Nullable */ String> filePath;

    /**
     * @return Specifies a path for the executable file for the application.
     * 
     */
    public Output<Optional<String>> filePath() {
        return Codegen.optional(this.filePath);
    }
    /**
     * Friendly name of Application.
     * 
     */
    @Export(name="friendlyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> friendlyName;

    /**
     * @return Friendly name of Application.
     * 
     */
    public Output<Optional<String>> friendlyName() {
        return Codegen.optional(this.friendlyName);
    }
    /**
     * the icon a 64 bit string as a byte array.
     * 
     */
    @Export(name="iconContent", type=String.class, parameters={})
    private Output<String> iconContent;

    /**
     * @return the icon a 64 bit string as a byte array.
     * 
     */
    public Output<String> iconContent() {
        return this.iconContent;
    }
    /**
     * Hash of the icon.
     * 
     */
    @Export(name="iconHash", type=String.class, parameters={})
    private Output<String> iconHash;

    /**
     * @return Hash of the icon.
     * 
     */
    public Output<String> iconHash() {
        return this.iconHash;
    }
    /**
     * Index of the icon.
     * 
     */
    @Export(name="iconIndex", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> iconIndex;

    /**
     * @return Index of the icon.
     * 
     */
    public Output<Optional<Integer>> iconIndex() {
        return Codegen.optional(this.iconIndex);
    }
    /**
     * Path to icon.
     * 
     */
    @Export(name="iconPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> iconPath;

    /**
     * @return Path to icon.
     * 
     */
    public Output<Optional<String>> iconPath() {
        return Codegen.optional(this.iconPath);
    }
    /**
     * Specifies the package application Id for MSIX applications
     * 
     */
    @Export(name="msixPackageApplicationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> msixPackageApplicationId;

    /**
     * @return Specifies the package application Id for MSIX applications
     * 
     */
    public Output<Optional<String>> msixPackageApplicationId() {
        return Codegen.optional(this.msixPackageApplicationId);
    }
    /**
     * Specifies the package family name for MSIX applications
     * 
     */
    @Export(name="msixPackageFamilyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> msixPackageFamilyName;

    /**
     * @return Specifies the package family name for MSIX applications
     * 
     */
    public Output<Optional<String>> msixPackageFamilyName() {
        return Codegen.optional(this.msixPackageFamilyName);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * ObjectId of Application. (internal use)
     * 
     */
    @Export(name="objectId", type=String.class, parameters={})
    private Output<String> objectId;

    /**
     * @return ObjectId of Application. (internal use)
     * 
     */
    public Output<String> objectId() {
        return this.objectId;
    }
    /**
     * Specifies whether to show the RemoteApp program in the RD Web Access server.
     * 
     */
    @Export(name="showInPortal", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> showInPortal;

    /**
     * @return Specifies whether to show the RemoteApp program in the RD Web Access server.
     * 
     */
    public Output<Optional<Boolean>> showInPortal() {
        return Codegen.optional(this.showInPortal);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, ApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Application(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:Application", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20190123preview:Application").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20190924preview:Application").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20191210preview:Application").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20200921preview:Application").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20201019preview:Application").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20201102preview:Application").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20201110preview:Application").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210114preview:Application").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210201preview:Application").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210309preview:Application").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210401preview:Application").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210712:Application").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20210903preview:Application").build()),
                Output.of(Alias.builder().type("azure-native:desktopvirtualization/v20220210preview:Application").build())
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
    public static Application get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, options);
    }
}
