// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiOperationTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiOperationTagArgs Empty = new ApiOperationTagArgs();

    /**
     * The ID of the API Management API Operation. Changing this forces a new API Management API Operation Tag to be created.
     * 
     */
    @Import(name="apiOperationId", required=true)
    private Output<String> apiOperationId;

    /**
     * @return The ID of the API Management API Operation. Changing this forces a new API Management API Operation Tag to be created.
     * 
     */
    public Output<String> apiOperationId() {
        return this.apiOperationId;
    }

    /**
     * The display name of the API Management API Operation Tag.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The display name of the API Management API Operation Tag.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The name which should be used for this API Management API Operation Tag. Changing this forces a new API Management API Operation Tag to be created. The name must be unique in the API Management Service.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this API Management API Operation Tag. Changing this forces a new API Management API Operation Tag to be created. The name must be unique in the API Management Service.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ApiOperationTagArgs() {}

    private ApiOperationTagArgs(ApiOperationTagArgs $) {
        this.apiOperationId = $.apiOperationId;
        this.displayName = $.displayName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiOperationTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiOperationTagArgs $;

        public Builder() {
            $ = new ApiOperationTagArgs();
        }

        public Builder(ApiOperationTagArgs defaults) {
            $ = new ApiOperationTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiOperationId The ID of the API Management API Operation. Changing this forces a new API Management API Operation Tag to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiOperationId(Output<String> apiOperationId) {
            $.apiOperationId = apiOperationId;
            return this;
        }

        /**
         * @param apiOperationId The ID of the API Management API Operation. Changing this forces a new API Management API Operation Tag to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiOperationId(String apiOperationId) {
            return apiOperationId(Output.of(apiOperationId));
        }

        /**
         * @param displayName The display name of the API Management API Operation Tag.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the API Management API Operation Tag.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param name The name which should be used for this API Management API Operation Tag. Changing this forces a new API Management API Operation Tag to be created. The name must be unique in the API Management Service.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this API Management API Operation Tag. Changing this forces a new API Management API Operation Tag to be created. The name must be unique in the API Management Service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ApiOperationTagArgs build() {
            $.apiOperationId = Objects.requireNonNull($.apiOperationId, "expected parameter 'apiOperationId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}
