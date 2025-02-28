// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.cdn.EndpointArgs;
import com.pulumi.azurenative.cdn.outputs.DeepCreatedOriginGroupResponse;
import com.pulumi.azurenative.cdn.outputs.DeepCreatedOriginResponse;
import com.pulumi.azurenative.cdn.outputs.EndpointPropertiesUpdateParametersResponseDeliveryPolicy;
import com.pulumi.azurenative.cdn.outputs.EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink;
import com.pulumi.azurenative.cdn.outputs.GeoFilterResponse;
import com.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import com.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import com.pulumi.azurenative.cdn.outputs.UrlSigningKeyResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * CDN endpoint is the entity within a CDN profile containing configuration information such as origin, protocol, content caching and delivery behavior. The CDN endpoint uses the URL format &lt;endpointname&gt;.azureedge.net.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * ### Endpoints_Create
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
 *         var endpoint = new Endpoint(&#34;endpoint&#34;, EndpointArgs.builder()        
 *             .contentTypesToCompress(            
 *                 &#34;text/html&#34;,
 *                 &#34;application/octet-stream&#34;)
 *             .defaultOriginGroup(Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/RG/providers/Microsoft.Cdn/profiles/profile1/endpoints/endpoint1/originGroups/originGroup1&#34;))
 *             .deliveryPolicy(Map.ofEntries(
 *                 Map.entry(&#34;description&#34;, &#34;Test description for a policy.&#34;),
 *                 Map.entry(&#34;rules&#34;, Map.ofEntries(
 *                     Map.entry(&#34;actions&#34;,                     
 *                         Map.ofEntries(
 *                             Map.entry(&#34;name&#34;, &#34;CacheExpiration&#34;),
 *                             Map.entry(&#34;parameters&#34;, Map.ofEntries(
 *                                 Map.entry(&#34;cacheBehavior&#34;, &#34;Override&#34;),
 *                                 Map.entry(&#34;cacheDuration&#34;, &#34;10:10:09&#34;),
 *                                 Map.entry(&#34;cacheType&#34;, &#34;All&#34;),
 *                                 Map.entry(&#34;odataType&#34;, &#34;#Microsoft.Azure.Cdn.Models.DeliveryRuleCacheExpirationActionParameters&#34;)
 *                             ))
 *                         ),
 *                         Map.ofEntries(
 *                             Map.entry(&#34;name&#34;, &#34;ModifyResponseHeader&#34;),
 *                             Map.entry(&#34;parameters&#34;, Map.ofEntries(
 *                                 Map.entry(&#34;headerAction&#34;, &#34;Overwrite&#34;),
 *                                 Map.entry(&#34;headerName&#34;, &#34;Access-Control-Allow-Origin&#34;),
 *                                 Map.entry(&#34;odataType&#34;, &#34;#Microsoft.Azure.Cdn.Models.DeliveryRuleHeaderActionParameters&#34;),
 *                                 Map.entry(&#34;value&#34;, &#34;*&#34;)
 *                             ))
 *                         ),
 *                         Map.ofEntries(
 *                             Map.entry(&#34;name&#34;, &#34;ModifyRequestHeader&#34;),
 *                             Map.entry(&#34;parameters&#34;, Map.ofEntries(
 *                                 Map.entry(&#34;headerAction&#34;, &#34;Overwrite&#34;),
 *                                 Map.entry(&#34;headerName&#34;, &#34;Accept-Encoding&#34;),
 *                                 Map.entry(&#34;odataType&#34;, &#34;#Microsoft.Azure.Cdn.Models.DeliveryRuleHeaderActionParameters&#34;),
 *                                 Map.entry(&#34;value&#34;, &#34;gzip&#34;)
 *                             ))
 *                         )),
 *                     Map.entry(&#34;conditions&#34;, Map.ofEntries(
 *                         Map.entry(&#34;name&#34;, &#34;RemoteAddress&#34;),
 *                         Map.entry(&#34;parameters&#34;, Map.ofEntries(
 *                             Map.entry(&#34;matchValues&#34;,                             
 *                                 &#34;192.168.1.0/24&#34;,
 *                                 &#34;10.0.0.0/24&#34;),
 *                             Map.entry(&#34;negateCondition&#34;, true),
 *                             Map.entry(&#34;odataType&#34;, &#34;#Microsoft.Azure.Cdn.Models.DeliveryRuleRemoteAddressConditionParameters&#34;),
 *                             Map.entry(&#34;operator&#34;, &#34;IPMatch&#34;)
 *                         ))
 *                     )),
 *                     Map.entry(&#34;name&#34;, &#34;rule1&#34;),
 *                     Map.entry(&#34;order&#34;, 1)
 *                 ))
 *             ))
 *             .endpointName(&#34;endpoint1&#34;)
 *             .isCompressionEnabled(true)
 *             .isHttpAllowed(true)
 *             .isHttpsAllowed(true)
 *             .location(&#34;WestUs&#34;)
 *             .originGroups(Map.ofEntries(
 *                 Map.entry(&#34;healthProbeSettings&#34;, Map.ofEntries(
 *                     Map.entry(&#34;probeIntervalInSeconds&#34;, 120),
 *                     Map.entry(&#34;probePath&#34;, &#34;/health.aspx&#34;),
 *                     Map.entry(&#34;probeProtocol&#34;, &#34;Http&#34;),
 *                     Map.entry(&#34;probeRequestType&#34;, &#34;GET&#34;)
 *                 )),
 *                 Map.entry(&#34;name&#34;, &#34;originGroup1&#34;),
 *                 Map.entry(&#34;origins&#34;,                 
 *                     Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/RG/providers/Microsoft.Cdn/profiles/profile1/endpoints/endpoint1/origins/origin1&#34;),
 *                     Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/RG/providers/Microsoft.Cdn/profiles/profile1/endpoints/endpoint1/origins/origin2&#34;)),
 *                 Map.entry(&#34;responseBasedOriginErrorDetectionSettings&#34;, Map.ofEntries(
 *                     Map.entry(&#34;responseBasedDetectedErrorTypes&#34;, &#34;TcpErrorsOnly&#34;),
 *                     Map.entry(&#34;responseBasedFailoverThresholdPercentage&#34;, 10)
 *                 ))
 *             ))
 *             .originHostHeader(&#34;www.bing.com&#34;)
 *             .originPath(&#34;/photos&#34;)
 *             .origins(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;enabled&#34;, true),
 *                     Map.entry(&#34;hostName&#34;, &#34;www.someDomain1.net&#34;),
 *                     Map.entry(&#34;httpPort&#34;, 80),
 *                     Map.entry(&#34;httpsPort&#34;, 443),
 *                     Map.entry(&#34;name&#34;, &#34;origin1&#34;),
 *                     Map.entry(&#34;originHostHeader&#34;, &#34;www.someDomain1.net&#34;),
 *                     Map.entry(&#34;priority&#34;, 1),
 *                     Map.entry(&#34;weight&#34;, 50)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;enabled&#34;, true),
 *                     Map.entry(&#34;hostName&#34;, &#34;www.someDomain2.net&#34;),
 *                     Map.entry(&#34;httpPort&#34;, 80),
 *                     Map.entry(&#34;httpsPort&#34;, 443),
 *                     Map.entry(&#34;name&#34;, &#34;origin2&#34;),
 *                     Map.entry(&#34;originHostHeader&#34;, &#34;www.someDomain2.net&#34;),
 *                     Map.entry(&#34;priority&#34;, 2),
 *                     Map.entry(&#34;weight&#34;, 50)
 *                 ))
 *             .profileName(&#34;profile1&#34;)
 *             .queryStringCachingBehavior(&#34;BypassCaching&#34;)
 *             .resourceGroupName(&#34;RG&#34;)
 *             .tags(Map.of(&#34;key1&#34;, &#34;value1&#34;))
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
 * $ pulumi import azure-native:cdn:Endpoint endpoint4899 /subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/endpoints/endpoint1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:Endpoint")
public class Endpoint extends com.pulumi.resources.CustomResource {
    /**
     * List of content types on which compression applies. The value should be a valid MIME type.
     * 
     */
    @Export(name="contentTypesToCompress", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> contentTypesToCompress;

    /**
     * @return List of content types on which compression applies. The value should be a valid MIME type.
     * 
     */
    public Output<Optional<List<String>>> contentTypesToCompress() {
        return Codegen.optional(this.contentTypesToCompress);
    }
    /**
     * A reference to the origin group.
     * 
     */
    @Export(name="defaultOriginGroup", type=ResourceReferenceResponse.class, parameters={})
    private Output</* @Nullable */ ResourceReferenceResponse> defaultOriginGroup;

    /**
     * @return A reference to the origin group.
     * 
     */
    public Output<Optional<ResourceReferenceResponse>> defaultOriginGroup() {
        return Codegen.optional(this.defaultOriginGroup);
    }
    /**
     * A policy that specifies the delivery rules to be used for an endpoint.
     * 
     */
    @Export(name="deliveryPolicy", type=EndpointPropertiesUpdateParametersResponseDeliveryPolicy.class, parameters={})
    private Output</* @Nullable */ EndpointPropertiesUpdateParametersResponseDeliveryPolicy> deliveryPolicy;

    /**
     * @return A policy that specifies the delivery rules to be used for an endpoint.
     * 
     */
    public Output<Optional<EndpointPropertiesUpdateParametersResponseDeliveryPolicy>> deliveryPolicy() {
        return Codegen.optional(this.deliveryPolicy);
    }
    /**
     * List of rules defining the user&#39;s geo access within a CDN endpoint. Each geo filter defines an access rule to a specified path or content, e.g. block APAC for path /pictures/
     * 
     */
    @Export(name="geoFilters", type=List.class, parameters={GeoFilterResponse.class})
    private Output</* @Nullable */ List<GeoFilterResponse>> geoFilters;

    /**
     * @return List of rules defining the user&#39;s geo access within a CDN endpoint. Each geo filter defines an access rule to a specified path or content, e.g. block APAC for path /pictures/
     * 
     */
    public Output<Optional<List<GeoFilterResponse>>> geoFilters() {
        return Codegen.optional(this.geoFilters);
    }
    /**
     * The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g. contoso.azureedge.net
     * 
     */
    @Export(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    /**
     * @return The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g. contoso.azureedge.net
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }
    /**
     * Indicates whether content compression is enabled on CDN. Default value is false. If compression is enabled, content will be served as compressed if user requests for a compressed version. Content won&#39;t be compressed on CDN when requested content is smaller than 1 byte or larger than 1 MB.
     * 
     */
    @Export(name="isCompressionEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isCompressionEnabled;

    /**
     * @return Indicates whether content compression is enabled on CDN. Default value is false. If compression is enabled, content will be served as compressed if user requests for a compressed version. Content won&#39;t be compressed on CDN when requested content is smaller than 1 byte or larger than 1 MB.
     * 
     */
    public Output<Optional<Boolean>> isCompressionEnabled() {
        return Codegen.optional(this.isCompressionEnabled);
    }
    /**
     * Indicates whether HTTP traffic is allowed on the endpoint. Default value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     * 
     */
    @Export(name="isHttpAllowed", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isHttpAllowed;

    /**
     * @return Indicates whether HTTP traffic is allowed on the endpoint. Default value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     * 
     */
    public Output<Optional<Boolean>> isHttpAllowed() {
        return Codegen.optional(this.isHttpAllowed);
    }
    /**
     * Indicates whether HTTPS traffic is allowed on the endpoint. Default value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     * 
     */
    @Export(name="isHttpsAllowed", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isHttpsAllowed;

    /**
     * @return Indicates whether HTTPS traffic is allowed on the endpoint. Default value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     * 
     */
    public Output<Optional<Boolean>> isHttpsAllowed() {
        return Codegen.optional(this.isHttpsAllowed);
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * Specifies what scenario the customer wants this CDN endpoint to optimize for, e.g. Download, Media services. With this information, CDN can apply scenario driven optimization.
     * 
     */
    @Export(name="optimizationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> optimizationType;

    /**
     * @return Specifies what scenario the customer wants this CDN endpoint to optimize for, e.g. Download, Media services. With this information, CDN can apply scenario driven optimization.
     * 
     */
    public Output<Optional<String>> optimizationType() {
        return Codegen.optional(this.optimizationType);
    }
    /**
     * The origin groups comprising of origins that are used for load balancing the traffic based on availability.
     * 
     */
    @Export(name="originGroups", type=List.class, parameters={DeepCreatedOriginGroupResponse.class})
    private Output</* @Nullable */ List<DeepCreatedOriginGroupResponse>> originGroups;

    /**
     * @return The origin groups comprising of origins that are used for load balancing the traffic based on availability.
     * 
     */
    public Output<Optional<List<DeepCreatedOriginGroupResponse>>> originGroups() {
        return Codegen.optional(this.originGroups);
    }
    /**
     * The host header value sent to the origin with each request. This property at Endpoint is only allowed when endpoint uses single origin and can be overridden by the same property specified at origin.If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default.
     * 
     */
    @Export(name="originHostHeader", type=String.class, parameters={})
    private Output</* @Nullable */ String> originHostHeader;

    /**
     * @return The host header value sent to the origin with each request. This property at Endpoint is only allowed when endpoint uses single origin and can be overridden by the same property specified at origin.If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default.
     * 
     */
    public Output<Optional<String>> originHostHeader() {
        return Codegen.optional(this.originHostHeader);
    }
    /**
     * A directory path on the origin that CDN can use to retrieve content from, e.g. contoso.cloudapp.net/originpath.
     * 
     */
    @Export(name="originPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> originPath;

    /**
     * @return A directory path on the origin that CDN can use to retrieve content from, e.g. contoso.cloudapp.net/originpath.
     * 
     */
    public Output<Optional<String>> originPath() {
        return Codegen.optional(this.originPath);
    }
    /**
     * The source of the content being delivered via CDN.
     * 
     */
    @Export(name="origins", type=List.class, parameters={DeepCreatedOriginResponse.class})
    private Output<List<DeepCreatedOriginResponse>> origins;

    /**
     * @return The source of the content being delivered via CDN.
     * 
     */
    public Output<List<DeepCreatedOriginResponse>> origins() {
        return this.origins;
    }
    /**
     * Path to a file hosted on the origin which helps accelerate delivery of the dynamic content and calculate the most optimal routes for the CDN. This is relative to the origin path. This property is only relevant when using a single origin.
     * 
     */
    @Export(name="probePath", type=String.class, parameters={})
    private Output</* @Nullable */ String> probePath;

    /**
     * @return Path to a file hosted on the origin which helps accelerate delivery of the dynamic content and calculate the most optimal routes for the CDN. This is relative to the origin path. This property is only relevant when using a single origin.
     * 
     */
    public Output<Optional<String>> probePath() {
        return Codegen.optional(this.probePath);
    }
    /**
     * Provisioning status of the endpoint.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning status of the endpoint.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Defines how CDN caches requests that include query strings. You can ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being cached, or cache every request with a unique URL.
     * 
     */
    @Export(name="queryStringCachingBehavior", type=String.class, parameters={})
    private Output</* @Nullable */ String> queryStringCachingBehavior;

    /**
     * @return Defines how CDN caches requests that include query strings. You can ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being cached, or cache every request with a unique URL.
     * 
     */
    public Output<Optional<String>> queryStringCachingBehavior() {
        return Codegen.optional(this.queryStringCachingBehavior);
    }
    /**
     * Resource status of the endpoint.
     * 
     */
    @Export(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    /**
     * @return Resource status of the endpoint.
     * 
     */
    public Output<String> resourceState() {
        return this.resourceState;
    }
    /**
     * Read only system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
     * List of keys used to validate the signed URL hashes.
     * 
     */
    @Export(name="urlSigningKeys", type=List.class, parameters={UrlSigningKeyResponse.class})
    private Output</* @Nullable */ List<UrlSigningKeyResponse>> urlSigningKeys;

    /**
     * @return List of keys used to validate the signed URL hashes.
     * 
     */
    public Output<Optional<List<UrlSigningKeyResponse>>> urlSigningKeys() {
        return Codegen.optional(this.urlSigningKeys);
    }
    /**
     * Defines the Web Application Firewall policy for the endpoint (if applicable)
     * 
     */
    @Export(name="webApplicationFirewallPolicyLink", type=EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink.class, parameters={})
    private Output</* @Nullable */ EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink> webApplicationFirewallPolicyLink;

    /**
     * @return Defines the Web Application Firewall policy for the endpoint (if applicable)
     * 
     */
    public Output<Optional<EndpointPropertiesUpdateParametersResponseWebApplicationFirewallPolicyLink>> webApplicationFirewallPolicyLink() {
        return Codegen.optional(this.webApplicationFirewallPolicyLink);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Endpoint(String name) {
        this(name, EndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Endpoint(String name, EndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Endpoint(String name, EndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Endpoint(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Endpoint", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:cdn/v20150601:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20160402:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20161002:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20170402:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20171012:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20190415:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20190615:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20190615preview:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20191231:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20200331:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20200415:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20200901:Endpoint").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20210601:Endpoint").build())
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
    public static Endpoint get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, options);
    }
}
