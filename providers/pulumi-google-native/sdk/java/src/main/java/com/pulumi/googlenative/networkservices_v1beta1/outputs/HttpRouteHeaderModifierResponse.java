// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class HttpRouteHeaderModifierResponse {
    /**
     * @return Add the headers with given map where key is the name of the header, value is the value of the header.
     * 
     */
    private final Map<String,String> add;
    /**
     * @return Remove headers (matching by header names) specified in the list.
     * 
     */
    private final List<String> remove;
    /**
     * @return Completely overwrite/replace the headers with given map where key is the name of the header, value is the value of the header.
     * 
     */
    private final Map<String,String> set;

    @CustomType.Constructor
    private HttpRouteHeaderModifierResponse(
        @CustomType.Parameter("add") Map<String,String> add,
        @CustomType.Parameter("remove") List<String> remove,
        @CustomType.Parameter("set") Map<String,String> set) {
        this.add = add;
        this.remove = remove;
        this.set = set;
    }

    /**
     * @return Add the headers with given map where key is the name of the header, value is the value of the header.
     * 
     */
    public Map<String,String> add() {
        return this.add;
    }
    /**
     * @return Remove headers (matching by header names) specified in the list.
     * 
     */
    public List<String> remove() {
        return this.remove;
    }
    /**
     * @return Completely overwrite/replace the headers with given map where key is the name of the header, value is the value of the header.
     * 
     */
    public Map<String,String> set() {
        return this.set;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteHeaderModifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> add;
        private List<String> remove;
        private Map<String,String> set;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteHeaderModifierResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.add = defaults.add;
    	      this.remove = defaults.remove;
    	      this.set = defaults.set;
        }

        public Builder add(Map<String,String> add) {
            this.add = Objects.requireNonNull(add);
            return this;
        }
        public Builder remove(List<String> remove) {
            this.remove = Objects.requireNonNull(remove);
            return this;
        }
        public Builder remove(String... remove) {
            return remove(List.of(remove));
        }
        public Builder set(Map<String,String> set) {
            this.set = Objects.requireNonNull(set);
            return this;
        }        public HttpRouteHeaderModifierResponse build() {
            return new HttpRouteHeaderModifierResponse(add, remove, set);
        }
    }
}
