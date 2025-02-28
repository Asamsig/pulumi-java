// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StorageAccountInternetEndpointsResponse {
    /**
     * @return Gets the blob endpoint.
     * 
     */
    private final String blob;
    /**
     * @return Gets the dfs endpoint.
     * 
     */
    private final String dfs;
    /**
     * @return Gets the file endpoint.
     * 
     */
    private final String file;
    /**
     * @return Gets the web endpoint.
     * 
     */
    private final String web;

    @CustomType.Constructor
    private StorageAccountInternetEndpointsResponse(
        @CustomType.Parameter("blob") String blob,
        @CustomType.Parameter("dfs") String dfs,
        @CustomType.Parameter("file") String file,
        @CustomType.Parameter("web") String web) {
        this.blob = blob;
        this.dfs = dfs;
        this.file = file;
        this.web = web;
    }

    /**
     * @return Gets the blob endpoint.
     * 
     */
    public String blob() {
        return this.blob;
    }
    /**
     * @return Gets the dfs endpoint.
     * 
     */
    public String dfs() {
        return this.dfs;
    }
    /**
     * @return Gets the file endpoint.
     * 
     */
    public String file() {
        return this.file;
    }
    /**
     * @return Gets the web endpoint.
     * 
     */
    public String web() {
        return this.web;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountInternetEndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blob;
        private String dfs;
        private String file;
        private String web;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountInternetEndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blob = defaults.blob;
    	      this.dfs = defaults.dfs;
    	      this.file = defaults.file;
    	      this.web = defaults.web;
        }

        public Builder blob(String blob) {
            this.blob = Objects.requireNonNull(blob);
            return this;
        }
        public Builder dfs(String dfs) {
            this.dfs = Objects.requireNonNull(dfs);
            return this;
        }
        public Builder file(String file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }
        public Builder web(String web) {
            this.web = Objects.requireNonNull(web);
            return this;
        }        public StorageAccountInternetEndpointsResponse build() {
            return new StorageAccountInternetEndpointsResponse(blob, dfs, file, web);
        }
    }
}
