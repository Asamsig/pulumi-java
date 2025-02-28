// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DatabaseTypeResponse {
    /**
     * @return The database engine.
     * 
     */
    private final String engine;
    /**
     * @return The database provider.
     * 
     */
    private final String provider;

    @CustomType.Constructor
    private DatabaseTypeResponse(
        @CustomType.Parameter("engine") String engine,
        @CustomType.Parameter("provider") String provider) {
        this.engine = engine;
        this.provider = provider;
    }

    /**
     * @return The database engine.
     * 
     */
    public String engine() {
        return this.engine;
    }
    /**
     * @return The database provider.
     * 
     */
    public String provider() {
        return this.provider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String engine;
        private String provider;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.engine = defaults.engine;
    	      this.provider = defaults.provider;
        }

        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        public Builder provider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }        public DatabaseTypeResponse build() {
            return new DatabaseTypeResponse(engine, provider);
        }
    }
}
