// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkspaceCustomObjectParameterResponse {
    /**
     * @return The type of variable that this is
     * 
     */
    private final String type;
    /**
     * @return The value which should be used for this field.
     * 
     */
    private final Object value;

    @CustomType.Constructor
    private WorkspaceCustomObjectParameterResponse(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") Object value) {
        this.type = type;
        this.value = value;
    }

    /**
     * @return The type of variable that this is
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The value which should be used for this field.
     * 
     */
    public Object value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceCustomObjectParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceCustomObjectParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(Object value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public WorkspaceCustomObjectParameterResponse build() {
            return new WorkspaceCustomObjectParameterResponse(type, value);
        }
    }
}
