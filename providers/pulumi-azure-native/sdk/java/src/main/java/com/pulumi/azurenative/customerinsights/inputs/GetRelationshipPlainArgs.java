// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRelationshipPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRelationshipPlainArgs Empty = new GetRelationshipPlainArgs();

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private String hubName;

    /**
     * @return The name of the hub.
     * 
     */
    public String hubName() {
        return this.hubName;
    }

    /**
     * The name of the relationship.
     * 
     */
    @Import(name="relationshipName", required=true)
    private String relationshipName;

    /**
     * @return The name of the relationship.
     * 
     */
    public String relationshipName() {
        return this.relationshipName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetRelationshipPlainArgs() {}

    private GetRelationshipPlainArgs(GetRelationshipPlainArgs $) {
        this.hubName = $.hubName;
        this.relationshipName = $.relationshipName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRelationshipPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRelationshipPlainArgs $;

        public Builder() {
            $ = new GetRelationshipPlainArgs();
        }

        public Builder(GetRelationshipPlainArgs defaults) {
            $ = new GetRelationshipPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(String hubName) {
            $.hubName = hubName;
            return this;
        }

        /**
         * @param relationshipName The name of the relationship.
         * 
         * @return builder
         * 
         */
        public Builder relationshipName(String relationshipName) {
            $.relationshipName = relationshipName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetRelationshipPlainArgs build() {
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.relationshipName = Objects.requireNonNull($.relationshipName, "expected parameter 'relationshipName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
