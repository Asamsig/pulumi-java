// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateLinkAssociationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkAssociationArgs Empty = new GetPrivateLinkAssociationArgs();

    /**
     * The management group ID.
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return The management group ID.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    /**
     * The ID of the PLA
     * 
     */
    @Import(name="plaId", required=true)
    private Output<String> plaId;

    /**
     * @return The ID of the PLA
     * 
     */
    public Output<String> plaId() {
        return this.plaId;
    }

    private GetPrivateLinkAssociationArgs() {}

    private GetPrivateLinkAssociationArgs(GetPrivateLinkAssociationArgs $) {
        this.groupId = $.groupId;
        this.plaId = $.plaId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateLinkAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateLinkAssociationArgs $;

        public Builder() {
            $ = new GetPrivateLinkAssociationArgs();
        }

        public Builder(GetPrivateLinkAssociationArgs defaults) {
            $ = new GetPrivateLinkAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupId The management group ID.
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The management group ID.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param plaId The ID of the PLA
         * 
         * @return builder
         * 
         */
        public Builder plaId(Output<String> plaId) {
            $.plaId = plaId;
            return this;
        }

        /**
         * @param plaId The ID of the PLA
         * 
         * @return builder
         * 
         */
        public Builder plaId(String plaId) {
            return plaId(Output.of(plaId));
        }

        public GetPrivateLinkAssociationArgs build() {
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.plaId = Objects.requireNonNull($.plaId, "expected parameter 'plaId' to be non-null");
            return $;
        }
    }

}
