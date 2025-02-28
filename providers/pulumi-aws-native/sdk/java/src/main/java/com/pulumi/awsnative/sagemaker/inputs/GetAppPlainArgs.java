// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.enums.AppType;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAppPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppPlainArgs Empty = new GetAppPlainArgs();

    /**
     * The name of the app.
     * 
     */
    @Import(name="appName", required=true)
    private String appName;

    /**
     * @return The name of the app.
     * 
     */
    public String appName() {
        return this.appName;
    }

    /**
     * The type of app.
     * 
     */
    @Import(name="appType", required=true)
    private AppType appType;

    /**
     * @return The type of app.
     * 
     */
    public AppType appType() {
        return this.appType;
    }

    /**
     * The domain ID.
     * 
     */
    @Import(name="domainId", required=true)
    private String domainId;

    /**
     * @return The domain ID.
     * 
     */
    public String domainId() {
        return this.domainId;
    }

    /**
     * The user profile name.
     * 
     */
    @Import(name="userProfileName", required=true)
    private String userProfileName;

    /**
     * @return The user profile name.
     * 
     */
    public String userProfileName() {
        return this.userProfileName;
    }

    private GetAppPlainArgs() {}

    private GetAppPlainArgs(GetAppPlainArgs $) {
        this.appName = $.appName;
        this.appType = $.appType;
        this.domainId = $.domainId;
        this.userProfileName = $.userProfileName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppPlainArgs $;

        public Builder() {
            $ = new GetAppPlainArgs();
        }

        public Builder(GetAppPlainArgs defaults) {
            $ = new GetAppPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appName The name of the app.
         * 
         * @return builder
         * 
         */
        public Builder appName(String appName) {
            $.appName = appName;
            return this;
        }

        /**
         * @param appType The type of app.
         * 
         * @return builder
         * 
         */
        public Builder appType(AppType appType) {
            $.appType = appType;
            return this;
        }

        /**
         * @param domainId The domain ID.
         * 
         * @return builder
         * 
         */
        public Builder domainId(String domainId) {
            $.domainId = domainId;
            return this;
        }

        /**
         * @param userProfileName The user profile name.
         * 
         * @return builder
         * 
         */
        public Builder userProfileName(String userProfileName) {
            $.userProfileName = userProfileName;
            return this;
        }

        public GetAppPlainArgs build() {
            $.appName = Objects.requireNonNull($.appName, "expected parameter 'appName' to be non-null");
            $.appType = Objects.requireNonNull($.appType, "expected parameter 'appType' to be non-null");
            $.domainId = Objects.requireNonNull($.domainId, "expected parameter 'domainId' to be non-null");
            $.userProfileName = Objects.requireNonNull($.userProfileName, "expected parameter 'userProfileName' to be non-null");
            return $;
        }
    }

}
