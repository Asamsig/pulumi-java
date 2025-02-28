// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleAssignmentArtifactArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleAssignmentArtifactArgs Empty = new RoleAssignmentArtifactArgs();

    /**
     * Name of the blueprint artifact.
     * 
     */
    @Import(name="artifactName")
    private @Nullable Output<String> artifactName;

    /**
     * @return Name of the blueprint artifact.
     * 
     */
    public Optional<Output<String>> artifactName() {
        return Optional.ofNullable(this.artifactName);
    }

    /**
     * Name of the blueprint definition.
     * 
     */
    @Import(name="blueprintName", required=true)
    private Output<String> blueprintName;

    /**
     * @return Name of the blueprint definition.
     * 
     */
    public Output<String> blueprintName() {
        return this.blueprintName;
    }

    /**
     * Artifacts which need to be deployed before the specified artifact.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable Output<List<String>> dependsOn;

    /**
     * @return Artifacts which need to be deployed before the specified artifact.
     * 
     */
    public Optional<Output<List<String>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Multi-line explain this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Multi-line explain this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * One-liner string explain this resource.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return One-liner string explain this resource.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Specifies the kind of blueprint artifact.
     * Expected value is &#39;roleAssignment&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Specifies the kind of blueprint artifact.
     * Expected value is &#39;roleAssignment&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Array of user or group identities in Azure Active Directory. The roleDefinition will apply to each identity.
     * 
     */
    @Import(name="principalIds", required=true)
    private Output<Object> principalIds;

    /**
     * @return Array of user or group identities in Azure Active Directory. The roleDefinition will apply to each identity.
     * 
     */
    public Output<Object> principalIds() {
        return this.principalIds;
    }

    /**
     * RoleAssignment will be scope to this resourceGroup. If empty, it scopes to the subscription.
     * 
     */
    @Import(name="resourceGroup")
    private @Nullable Output<String> resourceGroup;

    /**
     * @return RoleAssignment will be scope to this resourceGroup. If empty, it scopes to the subscription.
     * 
     */
    public Optional<Output<String>> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
     * 
     */
    @Import(name="resourceScope", required=true)
    private Output<String> resourceScope;

    /**
     * @return The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
     * 
     */
    public Output<String> resourceScope() {
        return this.resourceScope;
    }

    /**
     * Azure resource ID of the RoleDefinition.
     * 
     */
    @Import(name="roleDefinitionId", required=true)
    private Output<String> roleDefinitionId;

    /**
     * @return Azure resource ID of the RoleDefinition.
     * 
     */
    public Output<String> roleDefinitionId() {
        return this.roleDefinitionId;
    }

    private RoleAssignmentArtifactArgs() {}

    private RoleAssignmentArtifactArgs(RoleAssignmentArtifactArgs $) {
        this.artifactName = $.artifactName;
        this.blueprintName = $.blueprintName;
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.displayName = $.displayName;
        this.kind = $.kind;
        this.principalIds = $.principalIds;
        this.resourceGroup = $.resourceGroup;
        this.resourceScope = $.resourceScope;
        this.roleDefinitionId = $.roleDefinitionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleAssignmentArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleAssignmentArtifactArgs $;

        public Builder() {
            $ = new RoleAssignmentArtifactArgs();
        }

        public Builder(RoleAssignmentArtifactArgs defaults) {
            $ = new RoleAssignmentArtifactArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactName Name of the blueprint artifact.
         * 
         * @return builder
         * 
         */
        public Builder artifactName(@Nullable Output<String> artifactName) {
            $.artifactName = artifactName;
            return this;
        }

        /**
         * @param artifactName Name of the blueprint artifact.
         * 
         * @return builder
         * 
         */
        public Builder artifactName(String artifactName) {
            return artifactName(Output.of(artifactName));
        }

        /**
         * @param blueprintName Name of the blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder blueprintName(Output<String> blueprintName) {
            $.blueprintName = blueprintName;
            return this;
        }

        /**
         * @param blueprintName Name of the blueprint definition.
         * 
         * @return builder
         * 
         */
        public Builder blueprintName(String blueprintName) {
            return blueprintName(Output.of(blueprintName));
        }

        /**
         * @param dependsOn Artifacts which need to be deployed before the specified artifact.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(@Nullable Output<List<String>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        /**
         * @param dependsOn Artifacts which need to be deployed before the specified artifact.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(List<String> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        /**
         * @param dependsOn Artifacts which need to be deployed before the specified artifact.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(String... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        /**
         * @param description Multi-line explain this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Multi-line explain this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName One-liner string explain this resource.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName One-liner string explain this resource.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param kind Specifies the kind of blueprint artifact.
         * Expected value is &#39;roleAssignment&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Specifies the kind of blueprint artifact.
         * Expected value is &#39;roleAssignment&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param principalIds Array of user or group identities in Azure Active Directory. The roleDefinition will apply to each identity.
         * 
         * @return builder
         * 
         */
        public Builder principalIds(Output<Object> principalIds) {
            $.principalIds = principalIds;
            return this;
        }

        /**
         * @param principalIds Array of user or group identities in Azure Active Directory. The roleDefinition will apply to each identity.
         * 
         * @return builder
         * 
         */
        public Builder principalIds(Object principalIds) {
            return principalIds(Output.of(principalIds));
        }

        /**
         * @param resourceGroup RoleAssignment will be scope to this resourceGroup. If empty, it scopes to the subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(@Nullable Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceGroup RoleAssignment will be scope to this resourceGroup. If empty, it scopes to the subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        /**
         * @param resourceScope The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
         * 
         * @return builder
         * 
         */
        public Builder resourceScope(Output<String> resourceScope) {
            $.resourceScope = resourceScope;
            return this;
        }

        /**
         * @param resourceScope The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
         * 
         * @return builder
         * 
         */
        public Builder resourceScope(String resourceScope) {
            return resourceScope(Output.of(resourceScope));
        }

        /**
         * @param roleDefinitionId Azure resource ID of the RoleDefinition.
         * 
         * @return builder
         * 
         */
        public Builder roleDefinitionId(Output<String> roleDefinitionId) {
            $.roleDefinitionId = roleDefinitionId;
            return this;
        }

        /**
         * @param roleDefinitionId Azure resource ID of the RoleDefinition.
         * 
         * @return builder
         * 
         */
        public Builder roleDefinitionId(String roleDefinitionId) {
            return roleDefinitionId(Output.of(roleDefinitionId));
        }

        public RoleAssignmentArtifactArgs build() {
            $.blueprintName = Objects.requireNonNull($.blueprintName, "expected parameter 'blueprintName' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.principalIds = Objects.requireNonNull($.principalIds, "expected parameter 'principalIds' to be non-null");
            $.resourceScope = Objects.requireNonNull($.resourceScope, "expected parameter 'resourceScope' to be non-null");
            $.roleDefinitionId = Objects.requireNonNull($.roleDefinitionId, "expected parameter 'roleDefinitionId' to be non-null");
            return $;
        }
    }

}
