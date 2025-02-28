// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAFDOriginPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAFDOriginPlainArgs Empty = new GetAFDOriginPlainArgs();

    /**
     * Name of the origin group which is unique within the profile.
     * 
     */
    @Import(name="originGroupName", required=true)
    private String originGroupName;

    /**
     * @return Name of the origin group which is unique within the profile.
     * 
     */
    public String originGroupName() {
        return this.originGroupName;
    }

    /**
     * Name of the origin which is unique within the profile.
     * 
     */
    @Import(name="originName", required=true)
    private String originName;

    /**
     * @return Name of the origin which is unique within the profile.
     * 
     */
    public String originName() {
        return this.originName;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
    private String profileName;

    /**
     * @return Name of the CDN profile which is unique within the resource group.
     * 
     */
    public String profileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAFDOriginPlainArgs() {}

    private GetAFDOriginPlainArgs(GetAFDOriginPlainArgs $) {
        this.originGroupName = $.originGroupName;
        this.originName = $.originName;
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAFDOriginPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAFDOriginPlainArgs $;

        public Builder() {
            $ = new GetAFDOriginPlainArgs();
        }

        public Builder(GetAFDOriginPlainArgs defaults) {
            $ = new GetAFDOriginPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param originGroupName Name of the origin group which is unique within the profile.
         * 
         * @return builder
         * 
         */
        public Builder originGroupName(String originGroupName) {
            $.originGroupName = originGroupName;
            return this;
        }

        /**
         * @param originName Name of the origin which is unique within the profile.
         * 
         * @return builder
         * 
         */
        public Builder originName(String originName) {
            $.originName = originName;
            return this;
        }

        /**
         * @param profileName Name of the CDN profile which is unique within the resource group.
         * 
         * @return builder
         * 
         */
        public Builder profileName(String profileName) {
            $.profileName = profileName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetAFDOriginPlainArgs build() {
            $.originGroupName = Objects.requireNonNull($.originGroupName, "expected parameter 'originGroupName' to be non-null");
            $.originName = Objects.requireNonNull($.originName, "expected parameter 'originName' to be non-null");
            $.profileName = Objects.requireNonNull($.profileName, "expected parameter 'profileName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
