// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicedirectory_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.servicedirectory_v1.outputs.EndpointResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServiceResult {
    /**
     * @return Optional. Annotations for the service. This data can be consumed by service clients. Restrictions: * The entire annotations dictionary may contain up to 2000 characters, spread accoss all key-value pairs. Annotations that go beyond this limit are rejected * Valid annotation keys have two segments: an optional prefix and name, separated by a slash (/). The name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), not longer than 253 characters in total, followed by a slash (/). Annotations that fails to meet these requirements are rejected Note: This field is equivalent to the `metadata` field in the v1beta1 API. They have the same syntax and read/write to the same location in Service Directory.
     * 
     */
    private final Map<String,String> annotations;
    /**
     * @return Endpoints associated with this service. Returned on LookupService.ResolveService. Control plane clients should use RegistrationService.ListEndpoints.
     * 
     */
    private final List<EndpointResponse> endpoints;
    /**
     * @return Immutable. The resource name for the service in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*`.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetServiceResult(
        @CustomType.Parameter("annotations") Map<String,String> annotations,
        @CustomType.Parameter("endpoints") List<EndpointResponse> endpoints,
        @CustomType.Parameter("name") String name) {
        this.annotations = annotations;
        this.endpoints = endpoints;
        this.name = name;
    }

    /**
     * @return Optional. Annotations for the service. This data can be consumed by service clients. Restrictions: * The entire annotations dictionary may contain up to 2000 characters, spread accoss all key-value pairs. Annotations that go beyond this limit are rejected * Valid annotation keys have two segments: an optional prefix and name, separated by a slash (/). The name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), not longer than 253 characters in total, followed by a slash (/). Annotations that fails to meet these requirements are rejected Note: This field is equivalent to the `metadata` field in the v1beta1 API. They have the same syntax and read/write to the same location in Service Directory.
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    /**
     * @return Endpoints associated with this service. Returned on LookupService.ResolveService. Control plane clients should use RegistrationService.ListEndpoints.
     * 
     */
    public List<EndpointResponse> endpoints() {
        return this.endpoints;
    }
    /**
     * @return Immutable. The resource name for the service in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*`.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private List<EndpointResponse> endpoints;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.endpoints = defaults.endpoints;
    	      this.name = defaults.name;
        }

        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        public Builder endpoints(List<EndpointResponse> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public Builder endpoints(EndpointResponse... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetServiceResult build() {
            return new GetServiceResult(annotations, endpoints, name);
        }
    }
}
