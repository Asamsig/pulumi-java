// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetBackendServiceConsistentHashHttpCookyTtl;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBackendServiceConsistentHashHttpCooky {
    /**
     * @return The name of the Backend Service.
     * 
     */
    private final String name;
    private final String path;
    private final List<GetBackendServiceConsistentHashHttpCookyTtl> ttls;

    @CustomType.Constructor
    private GetBackendServiceConsistentHashHttpCooky(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("ttls") List<GetBackendServiceConsistentHashHttpCookyTtl> ttls) {
        this.name = name;
        this.path = path;
        this.ttls = ttls;
    }

    /**
     * @return The name of the Backend Service.
     * 
     */
    public String name() {
        return this.name;
    }
    public String path() {
        return this.path;
    }
    public List<GetBackendServiceConsistentHashHttpCookyTtl> ttls() {
        return this.ttls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceConsistentHashHttpCooky defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String path;
        private List<GetBackendServiceConsistentHashHttpCookyTtl> ttls;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceConsistentHashHttpCooky defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.ttls = defaults.ttls;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder ttls(List<GetBackendServiceConsistentHashHttpCookyTtl> ttls) {
            this.ttls = Objects.requireNonNull(ttls);
            return this;
        }
        public Builder ttls(GetBackendServiceConsistentHashHttpCookyTtl... ttls) {
            return ttls(List.of(ttls));
        }        public GetBackendServiceConsistentHashHttpCooky build() {
            return new GetBackendServiceConsistentHashHttpCooky(name, path, ttls);
        }
    }
}
