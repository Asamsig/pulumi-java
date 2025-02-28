// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFactoryDataPlaneAccessArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFactoryDataPlaneAccessArgs Empty = new GetFactoryDataPlaneAccessArgs();

    /**
     * The resource path to get access relative to factory. Currently only empty string is supported which corresponds to the factory resource.
     * 
     */
    @Import(name="accessResourcePath")
    private @Nullable Output<String> accessResourcePath;

    /**
     * @return The resource path to get access relative to factory. Currently only empty string is supported which corresponds to the factory resource.
     * 
     */
    public Optional<Output<String>> accessResourcePath() {
        return Optional.ofNullable(this.accessResourcePath);
    }

    /**
     * Expiration time for the token. Maximum duration for the token is eight hours and by default the token will expire in eight hours.
     * 
     */
    @Import(name="expireTime")
    private @Nullable Output<String> expireTime;

    /**
     * @return Expiration time for the token. Maximum duration for the token is eight hours and by default the token will expire in eight hours.
     * 
     */
    public Optional<Output<String>> expireTime() {
        return Optional.ofNullable(this.expireTime);
    }

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
    private Output<String> factoryName;

    /**
     * @return The factory name.
     * 
     */
    public Output<String> factoryName() {
        return this.factoryName;
    }

    /**
     * The string with permissions for Data Plane access. Currently only &#39;r&#39; is supported which grants read only access.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<String> permissions;

    /**
     * @return The string with permissions for Data Plane access. Currently only &#39;r&#39; is supported which grants read only access.
     * 
     */
    public Optional<Output<String>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * The name of the profile. Currently only the default is supported. The default value is DefaultProfile.
     * 
     */
    @Import(name="profileName")
    private @Nullable Output<String> profileName;

    /**
     * @return The name of the profile. Currently only the default is supported. The default value is DefaultProfile.
     * 
     */
    public Optional<Output<String>> profileName() {
        return Optional.ofNullable(this.profileName);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Start time for the token. If not specified the current time will be used.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Start time for the token. If not specified the current time will be used.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private GetFactoryDataPlaneAccessArgs() {}

    private GetFactoryDataPlaneAccessArgs(GetFactoryDataPlaneAccessArgs $) {
        this.accessResourcePath = $.accessResourcePath;
        this.expireTime = $.expireTime;
        this.factoryName = $.factoryName;
        this.permissions = $.permissions;
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFactoryDataPlaneAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFactoryDataPlaneAccessArgs $;

        public Builder() {
            $ = new GetFactoryDataPlaneAccessArgs();
        }

        public Builder(GetFactoryDataPlaneAccessArgs defaults) {
            $ = new GetFactoryDataPlaneAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessResourcePath The resource path to get access relative to factory. Currently only empty string is supported which corresponds to the factory resource.
         * 
         * @return builder
         * 
         */
        public Builder accessResourcePath(@Nullable Output<String> accessResourcePath) {
            $.accessResourcePath = accessResourcePath;
            return this;
        }

        /**
         * @param accessResourcePath The resource path to get access relative to factory. Currently only empty string is supported which corresponds to the factory resource.
         * 
         * @return builder
         * 
         */
        public Builder accessResourcePath(String accessResourcePath) {
            return accessResourcePath(Output.of(accessResourcePath));
        }

        /**
         * @param expireTime Expiration time for the token. Maximum duration for the token is eight hours and by default the token will expire in eight hours.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(@Nullable Output<String> expireTime) {
            $.expireTime = expireTime;
            return this;
        }

        /**
         * @param expireTime Expiration time for the token. Maximum duration for the token is eight hours and by default the token will expire in eight hours.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(String expireTime) {
            return expireTime(Output.of(expireTime));
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(Output<String> factoryName) {
            $.factoryName = factoryName;
            return this;
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(String factoryName) {
            return factoryName(Output.of(factoryName));
        }

        /**
         * @param permissions The string with permissions for Data Plane access. Currently only &#39;r&#39; is supported which grants read only access.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<String> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions The string with permissions for Data Plane access. Currently only &#39;r&#39; is supported which grants read only access.
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param profileName The name of the profile. Currently only the default is supported. The default value is DefaultProfile.
         * 
         * @return builder
         * 
         */
        public Builder profileName(@Nullable Output<String> profileName) {
            $.profileName = profileName;
            return this;
        }

        /**
         * @param profileName The name of the profile. Currently only the default is supported. The default value is DefaultProfile.
         * 
         * @return builder
         * 
         */
        public Builder profileName(String profileName) {
            return profileName(Output.of(profileName));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param startTime Start time for the token. If not specified the current time will be used.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Start time for the token. If not specified the current time will be used.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public GetFactoryDataPlaneAccessArgs build() {
            $.factoryName = Objects.requireNonNull($.factoryName, "expected parameter 'factoryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
