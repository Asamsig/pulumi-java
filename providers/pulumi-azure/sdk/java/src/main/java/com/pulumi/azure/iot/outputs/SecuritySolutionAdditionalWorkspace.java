// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SecuritySolutionAdditionalWorkspace {
    /**
     * @return A list of data types which sent to workspace. Possible values are `Alerts` and `RawEvents`.
     * 
     */
    private final List<String> dataTypes;
    /**
     * @return The resource ID of the Log Analytics Workspace.
     * 
     */
    private final String workspaceId;

    @CustomType.Constructor
    private SecuritySolutionAdditionalWorkspace(
        @CustomType.Parameter("dataTypes") List<String> dataTypes,
        @CustomType.Parameter("workspaceId") String workspaceId) {
        this.dataTypes = dataTypes;
        this.workspaceId = workspaceId;
    }

    /**
     * @return A list of data types which sent to workspace. Possible values are `Alerts` and `RawEvents`.
     * 
     */
    public List<String> dataTypes() {
        return this.dataTypes;
    }
    /**
     * @return The resource ID of the Log Analytics Workspace.
     * 
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecuritySolutionAdditionalWorkspace defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> dataTypes;
        private String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecuritySolutionAdditionalWorkspace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTypes = defaults.dataTypes;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder dataTypes(List<String> dataTypes) {
            this.dataTypes = Objects.requireNonNull(dataTypes);
            return this;
        }
        public Builder dataTypes(String... dataTypes) {
            return dataTypes(List.of(dataTypes));
        }
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }        public SecuritySolutionAdditionalWorkspace build() {
            return new SecuritySolutionAdditionalWorkspace(dataTypes, workspaceId);
        }
    }
}
