// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionTargetHttpsProxyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionTargetHttpsProxyArgs Empty = new RegionTargetHttpsProxyArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The Region in which the created target https proxy should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The Region in which the created target https proxy should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * A list of RegionSslCertificate resources that are used to authenticate
     * connections between users and the load balancer. Currently, exactly
     * one SSL certificate must be specified.
     * 
     */
    @Import(name="sslCertificates", required=true)
    private Output<List<String>> sslCertificates;

    /**
     * @return A list of RegionSslCertificate resources that are used to authenticate
     * connections between users and the load balancer. Currently, exactly
     * one SSL certificate must be specified.
     * 
     */
    public Output<List<String>> sslCertificates() {
        return this.sslCertificates;
    }

    /**
     * A reference to the RegionUrlMap resource that defines the mapping from URL
     * to the RegionBackendService.
     * 
     */
    @Import(name="urlMap", required=true)
    private Output<String> urlMap;

    /**
     * @return A reference to the RegionUrlMap resource that defines the mapping from URL
     * to the RegionBackendService.
     * 
     */
    public Output<String> urlMap() {
        return this.urlMap;
    }

    private RegionTargetHttpsProxyArgs() {}

    private RegionTargetHttpsProxyArgs(RegionTargetHttpsProxyArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.sslCertificates = $.sslCertificates;
        this.urlMap = $.urlMap;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionTargetHttpsProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionTargetHttpsProxyArgs $;

        public Builder() {
            $ = new RegionTargetHttpsProxyArgs();
        }

        public Builder(RegionTargetHttpsProxyArgs defaults) {
            $ = new RegionTargetHttpsProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The Region in which the created target https proxy should reside.
         * If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The Region in which the created target https proxy should reside.
         * If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param sslCertificates A list of RegionSslCertificate resources that are used to authenticate
         * connections between users and the load balancer. Currently, exactly
         * one SSL certificate must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sslCertificates(Output<List<String>> sslCertificates) {
            $.sslCertificates = sslCertificates;
            return this;
        }

        /**
         * @param sslCertificates A list of RegionSslCertificate resources that are used to authenticate
         * connections between users and the load balancer. Currently, exactly
         * one SSL certificate must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sslCertificates(List<String> sslCertificates) {
            return sslCertificates(Output.of(sslCertificates));
        }

        /**
         * @param sslCertificates A list of RegionSslCertificate resources that are used to authenticate
         * connections between users and the load balancer. Currently, exactly
         * one SSL certificate must be specified.
         * 
         * @return builder
         * 
         */
        public Builder sslCertificates(String... sslCertificates) {
            return sslCertificates(List.of(sslCertificates));
        }

        /**
         * @param urlMap A reference to the RegionUrlMap resource that defines the mapping from URL
         * to the RegionBackendService.
         * 
         * @return builder
         * 
         */
        public Builder urlMap(Output<String> urlMap) {
            $.urlMap = urlMap;
            return this;
        }

        /**
         * @param urlMap A reference to the RegionUrlMap resource that defines the mapping from URL
         * to the RegionBackendService.
         * 
         * @return builder
         * 
         */
        public Builder urlMap(String urlMap) {
            return urlMap(Output.of(urlMap));
        }

        public RegionTargetHttpsProxyArgs build() {
            $.sslCertificates = Objects.requireNonNull($.sslCertificates, "expected parameter 'sslCertificates' to be non-null");
            $.urlMap = Objects.requireNonNull($.urlMap, "expected parameter 'urlMap' to be non-null");
            return $;
        }
    }

}
