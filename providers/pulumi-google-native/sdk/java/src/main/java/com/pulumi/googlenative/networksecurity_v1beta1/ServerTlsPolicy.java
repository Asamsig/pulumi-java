// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.networksecurity_v1beta1.ServerTlsPolicyArgs;
import com.pulumi.googlenative.networksecurity_v1beta1.outputs.GoogleCloudNetworksecurityV1beta1CertificateProviderResponse;
import com.pulumi.googlenative.networksecurity_v1beta1.outputs.MTLSPolicyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new ServerTlsPolicy in a given project and location.
 * 
 */
@ResourceType(type="google-native:networksecurity/v1beta1:ServerTlsPolicy")
public class ServerTlsPolicy extends com.pulumi.resources.CustomResource {
    /**
     *  Determines if server allows plaintext connections. If set to true, server allows plain text connections. By default, it is set to false. This setting is not exclusive of other encryption modes. For example, if `allow_open` and `mtls_policy` are set, server allows both plain text and mTLS connections. See documentation of other encryption modes to confirm compatibility.
     * 
     */
    @Export(name="allowOpen", type=Boolean.class, parameters={})
    private Output<Boolean> allowOpen;

    /**
     * @return  Determines if server allows plaintext connections. If set to true, server allows plain text connections. By default, it is set to false. This setting is not exclusive of other encryption modes. For example, if `allow_open` and `mtls_policy` are set, server allows both plain text and mTLS connections. See documentation of other encryption modes to confirm compatibility.
     * 
     */
    public Output<Boolean> allowOpen() {
        return this.allowOpen;
    }
    /**
     * The timestamp when the resource was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp when the resource was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Free-text description of the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Free-text description of the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Set of label tags associated with the resource.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Set of label tags associated with the resource.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     *  Defines a mechanism to provision peer validation certificates for peer to peer authentication (Mutual TLS - mTLS). If not specified, client certificate will not be requested. The connection is treated as TLS and not mTLS. If `allow_open` and `mtls_policy` are set, server allows both plain text and mTLS connections.
     * 
     */
    @Export(name="mtlsPolicy", type=MTLSPolicyResponse.class, parameters={})
    private Output<MTLSPolicyResponse> mtlsPolicy;

    /**
     * @return  Defines a mechanism to provision peer validation certificates for peer to peer authentication (Mutual TLS - mTLS). If not specified, client certificate will not be requested. The connection is treated as TLS and not mTLS. If `allow_open` and `mtls_policy` are set, server allows both plain text and mTLS connections.
     * 
     */
    public Output<MTLSPolicyResponse> mtlsPolicy() {
        return this.mtlsPolicy;
    }
    /**
     * Name of the ServerTlsPolicy resource. It matches the pattern `projects/*{@literal /}locations/{location}/serverTlsPolicies/{server_tls_policy}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the ServerTlsPolicy resource. It matches the pattern `projects/*{@literal /}locations/{location}/serverTlsPolicies/{server_tls_policy}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     *  Defines a mechanism to provision server identity (public and private keys). Cannot be combined with `allow_open` as a permissive mode that allows both plain text and TLS is not supported.
     * 
     */
    @Export(name="serverCertificate", type=GoogleCloudNetworksecurityV1beta1CertificateProviderResponse.class, parameters={})
    private Output<GoogleCloudNetworksecurityV1beta1CertificateProviderResponse> serverCertificate;

    /**
     * @return  Defines a mechanism to provision server identity (public and private keys). Cannot be combined with `allow_open` as a permissive mode that allows both plain text and TLS is not supported.
     * 
     */
    public Output<GoogleCloudNetworksecurityV1beta1CertificateProviderResponse> serverCertificate() {
        return this.serverCertificate;
    }
    /**
     * The timestamp when the resource was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerTlsPolicy(String name) {
        this(name, ServerTlsPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerTlsPolicy(String name, ServerTlsPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerTlsPolicy(String name, ServerTlsPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networksecurity/v1beta1:ServerTlsPolicy", name, args == null ? ServerTlsPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerTlsPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networksecurity/v1beta1:ServerTlsPolicy", name, null, makeResourceOptions(options, id));
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
    public static ServerTlsPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerTlsPolicy(name, id, options);
    }
}
