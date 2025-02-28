// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.testbase.CustomerEventArgs;
import com.pulumi.azurenative.testbase.outputs.NotificationEventReceiverResponse;
import com.pulumi.azurenative.testbase.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The Customer Notification Event resource.
 * API Version: 2020-12-16-preview.
 * 
 * ## Example Usage
 * ### CustomerEventCreate
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
 *         var customerEvent = new CustomerEvent(&#34;customerEvent&#34;, CustomerEventArgs.builder()        
 *             .customerEventName(&#34;WeeklySummary&#34;)
 *             .eventName(&#34;WeeklySummary&#34;)
 *             .receivers(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;receiverType&#34;, &#34;UserObjects&#34;),
 *                     Map.entry(&#34;receiverValue&#34;, Map.of(&#34;userObjectReceiverValue&#34;, Map.of(&#34;userObjectIds&#34;,                     
 *                         &#34;245245245245325&#34;,
 *                         &#34;365365365363565&#34;)))
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;receiverType&#34;, &#34;DistributionGroup&#34;),
 *                     Map.entry(&#34;receiverValue&#34;, Map.of(&#34;distributionGroupListReceiverValue&#34;, Map.of(&#34;distributionGroups&#34;, &#34;test@microsoft.com&#34;)))
 *                 ))
 *             .resourceGroupName(&#34;contoso-rg1&#34;)
 *             .testBaseAccountName(&#34;contoso-testBaseAccount1&#34;)
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
 * $ pulumi import azure-native:testbase:CustomerEvent WeeklySummary /subscriptions/476f61a4-952c-422a-b4db-568a828f35df/resourceGroups/contoso-rg1/providers/Microsoft.TestBase/testBaseAccounts/contoso-testBaseAccount1/customerEvents/WeeklySummary 
 * ```
 * 
 */
@ResourceType(type="azure-native:testbase:CustomerEvent")
public class CustomerEvent extends com.pulumi.resources.CustomResource {
    /**
     * The name of the event subscribed to.
     * 
     */
    @Export(name="eventName", type=String.class, parameters={})
    private Output<String> eventName;

    /**
     * @return The name of the event subscribed to.
     * 
     */
    public Output<String> eventName() {
        return this.eventName;
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
     * The notification event receivers.
     * 
     */
    @Export(name="receivers", type=List.class, parameters={NotificationEventReceiverResponse.class})
    private Output<List<NotificationEventReceiverResponse>> receivers;

    /**
     * @return The notification event receivers.
     * 
     */
    public Output<List<NotificationEventReceiverResponse>> receivers() {
        return this.receivers;
    }
    /**
     * The system metadata relating to this resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
    public CustomerEvent(String name) {
        this(name, CustomerEventArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomerEvent(String name, CustomerEventArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomerEvent(String name, CustomerEventArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:testbase:CustomerEvent", name, args == null ? CustomerEventArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomerEvent(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:testbase:CustomerEvent", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:testbase/v20201216preview:CustomerEvent").build())
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
    public static CustomerEvent get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomerEvent(name, id, options);
    }
}
