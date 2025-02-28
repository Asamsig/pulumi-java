// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.core.SubscriptionCostManagementExportArgs;
import com.pulumi.azure.core.inputs.SubscriptionCostManagementExportState;
import com.pulumi.azure.core.outputs.SubscriptionCostManagementExportExportDataOptions;
import com.pulumi.azure.core.outputs.SubscriptionCostManagementExportExportDataStorageLocation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Cost Management Export for a Subscription.
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
 *         final var exampleSubscription = Output.of(CoreFunctions.getSubscription());
 * 
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleContainer = new Container(&#34;exampleContainer&#34;, ContainerArgs.builder()        
 *             .storageAccountName(azurerm_storage_account.getTest().getName())
 *             .build());
 * 
 *         var exampleSubscriptionCostManagementExport = new SubscriptionCostManagementExport(&#34;exampleSubscriptionCostManagementExport&#34;, SubscriptionCostManagementExportArgs.builder()        
 *             .subscriptionId(azurerm_subscription.getExample().getId())
 *             .recurrenceType(&#34;Monthly&#34;)
 *             .recurrencePeriodStartDate(&#34;2020-08-18T00:00:00Z&#34;)
 *             .recurrencePeriodEndDate(&#34;2020-09-18T00:00:00Z&#34;)
 *             .exportDataStorageLocation(SubscriptionCostManagementExportExportDataStorageLocation.builder()
 *                 .containerId(exampleContainer.getResourceManagerId())
 *                 .rootFolderPath(&#34;/root/updated&#34;)
 *                 .build())
 *             .exportDataOptions(SubscriptionCostManagementExportExportDataOptions.builder()
 *                 .type(&#34;Usage&#34;)
 *                 .timeFrame(&#34;WeekToDate&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Subscription Cost Management Exports can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:core/subscriptionCostManagementExport:SubscriptionCostManagementExport example /subscriptions/12345678-1234-9876-4563-123456789012/providers/Microsoft.CostManagement/exports/export1
 * ```
 * 
 */
@ResourceType(type="azure:core/subscriptionCostManagementExport:SubscriptionCostManagementExport")
public class SubscriptionCostManagementExport extends com.pulumi.resources.CustomResource {
    /**
     * Is the cost management export active? Default is `true`.
     * 
     */
    @Export(name="active", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return Is the cost management export active? Default is `true`.
     * 
     */
    public Output<Optional<Boolean>> active() {
        return Codegen.optional(this.active);
    }
    /**
     * A `export_data_options` block as defined below.
     * 
     */
    @Export(name="exportDataOptions", type=SubscriptionCostManagementExportExportDataOptions.class, parameters={})
    private Output<SubscriptionCostManagementExportExportDataOptions> exportDataOptions;

    /**
     * @return A `export_data_options` block as defined below.
     * 
     */
    public Output<SubscriptionCostManagementExportExportDataOptions> exportDataOptions() {
        return this.exportDataOptions;
    }
    /**
     * A `export_data_storage_location` block as defined below.
     * 
     */
    @Export(name="exportDataStorageLocation", type=SubscriptionCostManagementExportExportDataStorageLocation.class, parameters={})
    private Output<SubscriptionCostManagementExportExportDataStorageLocation> exportDataStorageLocation;

    /**
     * @return A `export_data_storage_location` block as defined below.
     * 
     */
    public Output<SubscriptionCostManagementExportExportDataStorageLocation> exportDataStorageLocation() {
        return this.exportDataStorageLocation;
    }
    /**
     * Specifies the name of the Cost Management Export. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Cost Management Export. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="recurrencePeriodEndDate", type=String.class, parameters={})
    private Output<String> recurrencePeriodEndDate;

    public Output<String> recurrencePeriodEndDate() {
        return this.recurrencePeriodEndDate;
    }
    /**
     * The date the export will start capturing information.
     * 
     */
    @Export(name="recurrencePeriodStartDate", type=String.class, parameters={})
    private Output<String> recurrencePeriodStartDate;

    /**
     * @return The date the export will start capturing information.
     * 
     */
    public Output<String> recurrencePeriodStartDate() {
        return this.recurrencePeriodStartDate;
    }
    /**
     * How often the requested information will be exported. Valid values include `Annually`, `Daily`, `Monthly`, `Weekly`.
     * 
     */
    @Export(name="recurrenceType", type=String.class, parameters={})
    private Output<String> recurrenceType;

    /**
     * @return How often the requested information will be exported. Valid values include `Annually`, `Daily`, `Monthly`, `Weekly`.
     * 
     */
    public Output<String> recurrenceType() {
        return this.recurrenceType;
    }
    /**
     * The id of the subscription on which to create an export.
     * 
     */
    @Export(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return The id of the subscription on which to create an export.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SubscriptionCostManagementExport(String name) {
        this(name, SubscriptionCostManagementExportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SubscriptionCostManagementExport(String name, SubscriptionCostManagementExportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubscriptionCostManagementExport(String name, SubscriptionCostManagementExportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/subscriptionCostManagementExport:SubscriptionCostManagementExport", name, args == null ? SubscriptionCostManagementExportArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SubscriptionCostManagementExport(String name, Output<String> id, @Nullable SubscriptionCostManagementExportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/subscriptionCostManagementExport:SubscriptionCostManagementExport", name, state, makeResourceOptions(options, id));
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
    public static SubscriptionCostManagementExport get(String name, Output<String> id, @Nullable SubscriptionCostManagementExportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SubscriptionCostManagementExport(name, id, state, options);
    }
}
