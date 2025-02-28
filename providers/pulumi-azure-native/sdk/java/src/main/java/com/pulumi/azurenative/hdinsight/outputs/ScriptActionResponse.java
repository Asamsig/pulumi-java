// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScriptActionResponse {
    /**
     * @return The name of the script action.
     * 
     */
    private final String name;
    /**
     * @return The parameters for the script provided.
     * 
     */
    private final String parameters;
    /**
     * @return The URI to the script.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private ScriptActionResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") String parameters,
        @CustomType.Parameter("uri") String uri) {
        this.name = name;
        this.parameters = parameters;
        this.uri = uri;
    }

    /**
     * @return The name of the script action.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The parameters for the script provided.
     * 
     */
    public String parameters() {
        return this.parameters;
    }
    /**
     * @return The URI to the script.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String parameters;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.uri = defaults.uri;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(String parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public ScriptActionResponse build() {
            return new ScriptActionResponse(name, parameters, uri);
        }
    }
}
