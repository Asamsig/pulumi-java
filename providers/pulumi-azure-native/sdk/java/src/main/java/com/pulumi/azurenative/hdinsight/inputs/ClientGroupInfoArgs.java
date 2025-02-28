// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The information of AAD security group.
 * 
 */
public final class ClientGroupInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientGroupInfoArgs Empty = new ClientGroupInfoArgs();

    /**
     * The AAD security group id.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The AAD security group id.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The AAD security group name.
     * 
     */
    @Import(name="groupName")
    private @Nullable Output<String> groupName;

    /**
     * @return The AAD security group name.
     * 
     */
    public Optional<Output<String>> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    private ClientGroupInfoArgs() {}

    private ClientGroupInfoArgs(ClientGroupInfoArgs $) {
        this.groupId = $.groupId;
        this.groupName = $.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientGroupInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientGroupInfoArgs $;

        public Builder() {
            $ = new ClientGroupInfoArgs();
        }

        public Builder(ClientGroupInfoArgs defaults) {
            $ = new ClientGroupInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupId The AAD security group id.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The AAD security group id.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param groupName The AAD security group name.
         * 
         * @return builder
         * 
         */
        public Builder groupName(@Nullable Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        /**
         * @param groupName The AAD security group name.
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        public ClientGroupInfoArgs build() {
            return $;
        }
    }

}
