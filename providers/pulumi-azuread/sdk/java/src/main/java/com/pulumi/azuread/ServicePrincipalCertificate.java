// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread;

import com.pulumi.azuread.ServicePrincipalCertificateArgs;
import com.pulumi.azuread.Utilities;
import com.pulumi.azuread.inputs.ServicePrincipalCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a certificate associated with a service principal within Azure Active Directory.
 * 
 * ## API Permissions
 * 
 * The following API permissions are required in order to use this resource.
 * 
 * When authenticated with a service principal, this resource requires one of the following application roles: `Application.ReadWrite.All` or `Directory.ReadWrite.All`
 * 
 * When authenticated with a user principal, this resource requires one of the following directory roles: `Application Administrator` or `Global Administrator`
 * 
 * ## Import
 * 
 * Certificates can be imported using the object ID of the associated service principal and the key ID of the certificate credential, e.g.
 * 
 * ```sh
 *  $ pulumi import azuread:index/servicePrincipalCertificate:ServicePrincipalCertificate test 00000000-0000-0000-0000-000000000000/certificate/11111111-1111-1111-1111-111111111111
 * ```
 * 
 *  -&gt; This ID format is unique to Terraform and is composed of the service principal&#39;s object ID, the string &#34;certificate&#34; and the certificate&#39;s key ID in the format `{ServicePrincipalObjectId}/certificate/{CertificateKeyId}`.
 * 
 */
@ResourceType(type="azuread:index/servicePrincipalCertificate:ServicePrincipalCertificate")
public class ServicePrincipalCertificate extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the encoding used for the supplied certificate data. Must be one of `pem`, `base64` or `hex`. Defaults to `pem`.
     * 
     */
    @Export(name="encoding", type=String.class, parameters={})
    private Output</* @Nullable */ String> encoding;

    /**
     * @return Specifies the encoding used for the supplied certificate data. Must be one of `pem`, `base64` or `hex`. Defaults to `pem`.
     * 
     */
    public Output<Optional<String>> encoding() {
        return Codegen.optional(this.encoding);
    }
    /**
     * The end date until which the certificate is valid, formatted as an RFC3339 date string (e.g. `2018-01-01T01:02:03Z`). Changing this field forces a new resource to be created.
     * 
     */
    @Export(name="endDate", type=String.class, parameters={})
    private Output<String> endDate;

    /**
     * @return The end date until which the certificate is valid, formatted as an RFC3339 date string (e.g. `2018-01-01T01:02:03Z`). Changing this field forces a new resource to be created.
     * 
     */
    public Output<String> endDate() {
        return this.endDate;
    }
    /**
     * A relative duration for which the certificate is valid until, for example `240h` (10 days) or `2400h30m`. Valid time units are &#34;ns&#34;, &#34;us&#34; (or &#34;µs&#34;), &#34;ms&#34;, &#34;s&#34;, &#34;m&#34;, &#34;h&#34;. Changing this field forces a new resource to be created.
     * 
     */
    @Export(name="endDateRelative", type=String.class, parameters={})
    private Output</* @Nullable */ String> endDateRelative;

    /**
     * @return A relative duration for which the certificate is valid until, for example `240h` (10 days) or `2400h30m`. Valid time units are &#34;ns&#34;, &#34;us&#34; (or &#34;µs&#34;), &#34;ms&#34;, &#34;s&#34;, &#34;m&#34;, &#34;h&#34;. Changing this field forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> endDateRelative() {
        return Codegen.optional(this.endDateRelative);
    }
    /**
     * A UUID used to uniquely identify this certificate. If not specified a UUID will be automatically generated. Changing this field forces a new resource to be created.
     * 
     */
    @Export(name="keyId", type=String.class, parameters={})
    private Output<String> keyId;

    /**
     * @return A UUID used to uniquely identify this certificate. If not specified a UUID will be automatically generated. Changing this field forces a new resource to be created.
     * 
     */
    public Output<String> keyId() {
        return this.keyId;
    }
    /**
     * The object ID of the service principal for which this certificate should be created. Changing this field forces a new resource to be created.
     * 
     */
    @Export(name="servicePrincipalId", type=String.class, parameters={})
    private Output<String> servicePrincipalId;

    /**
     * @return The object ID of the service principal for which this certificate should be created. Changing this field forces a new resource to be created.
     * 
     */
    public Output<String> servicePrincipalId() {
        return this.servicePrincipalId;
    }
    /**
     * The start date from which the certificate is valid, formatted as an RFC3339 date string (e.g. `2018-01-01T01:02:03Z`). If this isn&#39;t specified, the current date is used.  Changing this field forces a new resource to be created.
     * 
     */
    @Export(name="startDate", type=String.class, parameters={})
    private Output<String> startDate;

    /**
     * @return The start date from which the certificate is valid, formatted as an RFC3339 date string (e.g. `2018-01-01T01:02:03Z`). If this isn&#39;t specified, the current date is used.  Changing this field forces a new resource to be created.
     * 
     */
    public Output<String> startDate() {
        return this.startDate;
    }
    /**
     * The type of key/certificate. Must be one of `AsymmetricX509Cert` or `Symmetric`. Changing this fields forces a new resource to be created.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of key/certificate. Must be one of `AsymmetricX509Cert` or `Symmetric`. Changing this fields forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * The certificate data, which can be PEM encoded, base64 encoded DER or hexadecimal encoded DER. See also the `encoding` argument.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return The certificate data, which can be PEM encoded, base64 encoded DER or hexadecimal encoded DER. See also the `encoding` argument.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServicePrincipalCertificate(String name) {
        this(name, ServicePrincipalCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServicePrincipalCertificate(String name, ServicePrincipalCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServicePrincipalCertificate(String name, ServicePrincipalCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azuread:index/servicePrincipalCertificate:ServicePrincipalCertificate", name, args == null ? ServicePrincipalCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServicePrincipalCertificate(String name, Output<String> id, @Nullable ServicePrincipalCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azuread:index/servicePrincipalCertificate:ServicePrincipalCertificate", name, state, makeResourceOptions(options, id));
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
    public static ServicePrincipalCertificate get(String name, Output<String> id, @Nullable ServicePrincipalCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServicePrincipalCertificate(name, id, state, options);
    }
}
