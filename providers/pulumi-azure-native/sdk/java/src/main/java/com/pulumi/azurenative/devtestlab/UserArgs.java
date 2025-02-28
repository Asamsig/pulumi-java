// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab;

import com.pulumi.azurenative.devtestlab.inputs.UserIdentityArgs;
import com.pulumi.azurenative.devtestlab.inputs.UserSecretStoreArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * The identity of the user.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<UserIdentityArgs> identity;

    /**
     * @return The identity of the user.
     * 
     */
    public Optional<Output<UserIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
    private Output<String> labName;

    /**
     * @return The name of the lab.
     * 
     */
    public Output<String> labName() {
        return this.labName;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the user profile.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the user profile.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The secret store of the user.
     * 
     */
    @Import(name="secretStore")
    private @Nullable Output<UserSecretStoreArgs> secretStore;

    /**
     * @return The secret store of the user.
     * 
     */
    public Optional<Output<UserSecretStoreArgs>> secretStore() {
        return Optional.ofNullable(this.secretStore);
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private UserArgs() {}

    private UserArgs(UserArgs $) {
        this.identity = $.identity;
        this.labName = $.labName;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.secretStore = $.secretStore;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserArgs $;

        public Builder() {
            $ = new UserArgs();
        }

        public Builder(UserArgs defaults) {
            $ = new UserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identity The identity of the user.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<UserIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity The identity of the user.
         * 
         * @return builder
         * 
         */
        public Builder identity(UserIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param labName The name of the lab.
         * 
         * @return builder
         * 
         */
        public Builder labName(Output<String> labName) {
            $.labName = labName;
            return this;
        }

        /**
         * @param labName The name of the lab.
         * 
         * @return builder
         * 
         */
        public Builder labName(String labName) {
            return labName(Output.of(labName));
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the user profile.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the user profile.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param secretStore The secret store of the user.
         * 
         * @return builder
         * 
         */
        public Builder secretStore(@Nullable Output<UserSecretStoreArgs> secretStore) {
            $.secretStore = secretStore;
            return this;
        }

        /**
         * @param secretStore The secret store of the user.
         * 
         * @return builder
         * 
         */
        public Builder secretStore(UserSecretStoreArgs secretStore) {
            return secretStore(Output.of(secretStore));
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public UserArgs build() {
            $.labName = Objects.requireNonNull($.labName, "expected parameter 'labName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
