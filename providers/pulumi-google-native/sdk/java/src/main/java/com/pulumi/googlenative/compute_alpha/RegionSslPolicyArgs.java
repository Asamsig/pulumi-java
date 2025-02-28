// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.RegionSslPolicyMinTlsVersion;
import com.pulumi.googlenative.compute_alpha.enums.RegionSslPolicyProfile;
import com.pulumi.googlenative.compute_alpha.inputs.ServerTlsSettingsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionSslPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionSslPolicyArgs Empty = new RegionSslPolicyArgs();

    /**
     * A list of features enabled when the selected profile is CUSTOM. The method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
     * 
     */
    @Import(name="customFeatures")
    private @Nullable Output<List<String>> customFeatures;

    /**
     * @return A list of features enabled when the selected profile is CUSTOM. The method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
     * 
     */
    public Optional<Output<List<String>>> customFeatures() {
        return Optional.ofNullable(this.customFeatures);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
     * 
     */
    @Import(name="minTlsVersion")
    private @Nullable Output<RegionSslPolicyMinTlsVersion> minTlsVersion;

    /**
     * @return The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
     * 
     */
    public Optional<Output<RegionSslPolicyMinTlsVersion>> minTlsVersion() {
        return Optional.ofNullable(this.minTlsVersion);
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
     * 
     */
    @Import(name="profile")
    private @Nullable Output<RegionSslPolicyProfile> profile;

    /**
     * @return Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
     * 
     */
    public Optional<Output<RegionSslPolicyProfile>> profile() {
        return Optional.ofNullable(this.profile);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Security settings for the proxy. This field is only applicable to a global backend service with the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="tlsSettings")
    private @Nullable Output<ServerTlsSettingsArgs> tlsSettings;

    /**
     * @return Security settings for the proxy. This field is only applicable to a global backend service with the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    public Optional<Output<ServerTlsSettingsArgs>> tlsSettings() {
        return Optional.ofNullable(this.tlsSettings);
    }

    private RegionSslPolicyArgs() {}

    private RegionSslPolicyArgs(RegionSslPolicyArgs $) {
        this.customFeatures = $.customFeatures;
        this.description = $.description;
        this.minTlsVersion = $.minTlsVersion;
        this.name = $.name;
        this.profile = $.profile;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
        this.tlsSettings = $.tlsSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionSslPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionSslPolicyArgs $;

        public Builder() {
            $ = new RegionSslPolicyArgs();
        }

        public Builder(RegionSslPolicyArgs defaults) {
            $ = new RegionSslPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customFeatures A list of features enabled when the selected profile is CUSTOM. The method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
         * 
         * @return builder
         * 
         */
        public Builder customFeatures(@Nullable Output<List<String>> customFeatures) {
            $.customFeatures = customFeatures;
            return this;
        }

        /**
         * @param customFeatures A list of features enabled when the selected profile is CUSTOM. The method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
         * 
         * @return builder
         * 
         */
        public Builder customFeatures(List<String> customFeatures) {
            return customFeatures(Output.of(customFeatures));
        }

        /**
         * @param customFeatures A list of features enabled when the selected profile is CUSTOM. The method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
         * 
         * @return builder
         * 
         */
        public Builder customFeatures(String... customFeatures) {
            return customFeatures(List.of(customFeatures));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param minTlsVersion The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
         * 
         * @return builder
         * 
         */
        public Builder minTlsVersion(@Nullable Output<RegionSslPolicyMinTlsVersion> minTlsVersion) {
            $.minTlsVersion = minTlsVersion;
            return this;
        }

        /**
         * @param minTlsVersion The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
         * 
         * @return builder
         * 
         */
        public Builder minTlsVersion(RegionSslPolicyMinTlsVersion minTlsVersion) {
            return minTlsVersion(Output.of(minTlsVersion));
        }

        /**
         * @param name Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param profile Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
         * 
         * @return builder
         * 
         */
        public Builder profile(@Nullable Output<RegionSslPolicyProfile> profile) {
            $.profile = profile;
            return this;
        }

        /**
         * @param profile Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
         * 
         * @return builder
         * 
         */
        public Builder profile(RegionSslPolicyProfile profile) {
            return profile(Output.of(profile));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param tlsSettings Security settings for the proxy. This field is only applicable to a global backend service with the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
         * 
         * @return builder
         * 
         */
        public Builder tlsSettings(@Nullable Output<ServerTlsSettingsArgs> tlsSettings) {
            $.tlsSettings = tlsSettings;
            return this;
        }

        /**
         * @param tlsSettings Security settings for the proxy. This field is only applicable to a global backend service with the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
         * 
         * @return builder
         * 
         */
        public Builder tlsSettings(ServerTlsSettingsArgs tlsSettings) {
            return tlsSettings(Output.of(tlsSettings));
        }

        public RegionSslPolicyArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
