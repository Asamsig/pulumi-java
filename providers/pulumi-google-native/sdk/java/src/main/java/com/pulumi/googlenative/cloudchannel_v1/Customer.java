// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudchannel_v1.CustomerArgs;
import com.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1CloudIdentityInfoResponse;
import com.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1ContactInfoResponse;
import com.pulumi.googlenative.cloudchannel_v1.outputs.GoogleTypePostalAddressResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new Customer resource under the reseller or distributor account. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: * Required request parameters are missing or invalid. * Domain field value doesn&#39;t match the primary email domain. Return value: The newly created Customer resource.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:cloudchannel/v1:Customer")
public class Customer extends com.pulumi.resources.CustomResource {
    /**
     * Secondary contact email. You need to provide an alternate email to create different domains if a primary contact email already exists. Users will receive a notification with credentials when you create an admin.google.com account. Secondary emails are also recovery email addresses. Alternate emails are optional when you create Team customers.
     * 
     */
    @Export(name="alternateEmail", type=String.class, parameters={})
    private Output<String> alternateEmail;

    /**
     * @return Secondary contact email. You need to provide an alternate email to create different domains if a primary contact email already exists. Users will receive a notification with credentials when you create an admin.google.com account. Secondary emails are also recovery email addresses. Alternate emails are optional when you create Team customers.
     * 
     */
    public Output<String> alternateEmail() {
        return this.alternateEmail;
    }
    /**
     * Cloud Identity ID of the customer&#39;s channel partner. Populated only if a channel partner exists for this customer.
     * 
     */
    @Export(name="channelPartnerId", type=String.class, parameters={})
    private Output<String> channelPartnerId;

    /**
     * @return Cloud Identity ID of the customer&#39;s channel partner. Populated only if a channel partner exists for this customer.
     * 
     */
    public Output<String> channelPartnerId() {
        return this.channelPartnerId;
    }
    /**
     * The customer&#39;s Cloud Identity ID if the customer has a Cloud Identity resource.
     * 
     */
    @Export(name="cloudIdentityId", type=String.class, parameters={})
    private Output<String> cloudIdentityId;

    /**
     * @return The customer&#39;s Cloud Identity ID if the customer has a Cloud Identity resource.
     * 
     */
    public Output<String> cloudIdentityId() {
        return this.cloudIdentityId;
    }
    /**
     * Cloud Identity information for the customer. Populated only if a Cloud Identity account exists for this customer.
     * 
     */
    @Export(name="cloudIdentityInfo", type=GoogleCloudChannelV1CloudIdentityInfoResponse.class, parameters={})
    private Output<GoogleCloudChannelV1CloudIdentityInfoResponse> cloudIdentityInfo;

    /**
     * @return Cloud Identity information for the customer. Populated only if a Cloud Identity account exists for this customer.
     * 
     */
    public Output<GoogleCloudChannelV1CloudIdentityInfoResponse> cloudIdentityInfo() {
        return this.cloudIdentityInfo;
    }
    /**
     * Time when the customer was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time when the customer was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The customer&#39;s primary domain. Must match the primary contact email&#39;s domain.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The customer&#39;s primary domain. Must match the primary contact email&#39;s domain.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * Optional. The BCP-47 language code, such as &#34;en-US&#34; or &#34;sr-Latn&#34;. For more information, see https://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
     * 
     */
    @Export(name="languageCode", type=String.class, parameters={})
    private Output<String> languageCode;

    /**
     * @return Optional. The BCP-47 language code, such as &#34;en-US&#34; or &#34;sr-Latn&#34;. For more information, see https://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
     * 
     */
    public Output<String> languageCode() {
        return this.languageCode;
    }
    /**
     * Resource name of the customer. Format: accounts/{account_id}/customers/{customer_id}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the customer. Format: accounts/{account_id}/customers/{customer_id}
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Name of the organization that the customer entity represents.
     * 
     */
    @Export(name="orgDisplayName", type=String.class, parameters={})
    private Output<String> orgDisplayName;

    /**
     * @return Name of the organization that the customer entity represents.
     * 
     */
    public Output<String> orgDisplayName() {
        return this.orgDisplayName;
    }
    /**
     * The organization address for the customer. To enforce US laws and embargoes, we require a region and zip code. You must provide valid addresses for every customer. To set the customer&#39;s language, use the Customer-level language code.
     * 
     */
    @Export(name="orgPostalAddress", type=GoogleTypePostalAddressResponse.class, parameters={})
    private Output<GoogleTypePostalAddressResponse> orgPostalAddress;

    /**
     * @return The organization address for the customer. To enforce US laws and embargoes, we require a region and zip code. You must provide valid addresses for every customer. To set the customer&#39;s language, use the Customer-level language code.
     * 
     */
    public Output<GoogleTypePostalAddressResponse> orgPostalAddress() {
        return this.orgPostalAddress;
    }
    /**
     * Primary contact info.
     * 
     */
    @Export(name="primaryContactInfo", type=GoogleCloudChannelV1ContactInfoResponse.class, parameters={})
    private Output<GoogleCloudChannelV1ContactInfoResponse> primaryContactInfo;

    /**
     * @return Primary contact info.
     * 
     */
    public Output<GoogleCloudChannelV1ContactInfoResponse> primaryContactInfo() {
        return this.primaryContactInfo;
    }
    /**
     * Time when the customer was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time when the customer was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Customer(String name) {
        this(name, CustomerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Customer(String name, CustomerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Customer(String name, CustomerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudchannel/v1:Customer", name, args == null ? CustomerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Customer(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudchannel/v1:Customer", name, null, makeResourceOptions(options, id));
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
    public static Customer get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Customer(name, id, options);
    }
}
