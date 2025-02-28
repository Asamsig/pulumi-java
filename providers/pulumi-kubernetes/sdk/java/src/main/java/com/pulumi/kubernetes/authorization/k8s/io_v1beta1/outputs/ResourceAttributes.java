// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceAttributes {
    /**
     * @return Group is the API Group of the Resource.  &#34;*&#34; means all.
     * 
     */
    private final @Nullable String group;
    /**
     * @return Name is the name of the resource being requested for a &#34;get&#34; or deleted for a &#34;delete&#34;. &#34;&#34; (empty) means all.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces &#34;&#34; (empty) is defaulted for LocalSubjectAccessReviews &#34;&#34; (empty) is empty for cluster-scoped resources &#34;&#34; (empty) means &#34;all&#34; for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
     * 
     */
    private final @Nullable String namespace;
    /**
     * @return Resource is one of the existing resource types.  &#34;*&#34; means all.
     * 
     */
    private final @Nullable String resource;
    /**
     * @return Subresource is one of the existing resource types.  &#34;&#34; means none.
     * 
     */
    private final @Nullable String subresource;
    /**
     * @return Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  &#34;*&#34; means all.
     * 
     */
    private final @Nullable String verb;
    /**
     * @return Version is the API Version of the Resource.  &#34;*&#34; means all.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private ResourceAttributes(
        @CustomType.Parameter("group") @Nullable String group,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("namespace") @Nullable String namespace,
        @CustomType.Parameter("resource") @Nullable String resource,
        @CustomType.Parameter("subresource") @Nullable String subresource,
        @CustomType.Parameter("verb") @Nullable String verb,
        @CustomType.Parameter("version") @Nullable String version) {
        this.group = group;
        this.name = name;
        this.namespace = namespace;
        this.resource = resource;
        this.subresource = subresource;
        this.verb = verb;
        this.version = version;
    }

    /**
     * @return Group is the API Group of the Resource.  &#34;*&#34; means all.
     * 
     */
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return Name is the name of the resource being requested for a &#34;get&#34; or deleted for a &#34;delete&#34;. &#34;&#34; (empty) means all.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces &#34;&#34; (empty) is defaulted for LocalSubjectAccessReviews &#34;&#34; (empty) is empty for cluster-scoped resources &#34;&#34; (empty) means &#34;all&#34; for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return Resource is one of the existing resource types.  &#34;*&#34; means all.
     * 
     */
    public Optional<String> resource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * @return Subresource is one of the existing resource types.  &#34;&#34; means none.
     * 
     */
    public Optional<String> subresource() {
        return Optional.ofNullable(this.subresource);
    }
    /**
     * @return Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  &#34;*&#34; means all.
     * 
     */
    public Optional<String> verb() {
        return Optional.ofNullable(this.verb);
    }
    /**
     * @return Version is the API Version of the Resource.  &#34;*&#34; means all.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String group;
        private @Nullable String name;
        private @Nullable String namespace;
        private @Nullable String resource;
        private @Nullable String subresource;
        private @Nullable String verb;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.resource = defaults.resource;
    	      this.subresource = defaults.subresource;
    	      this.verb = defaults.verb;
    	      this.version = defaults.version;
        }

        public Builder group(@Nullable String group) {
            this.group = group;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder resource(@Nullable String resource) {
            this.resource = resource;
            return this;
        }
        public Builder subresource(@Nullable String subresource) {
            this.subresource = subresource;
            return this;
        }
        public Builder verb(@Nullable String verb) {
            this.verb = verb;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public ResourceAttributes build() {
            return new ResourceAttributes(group, name, namespace, resource, subresource, verb, version);
        }
    }
}
