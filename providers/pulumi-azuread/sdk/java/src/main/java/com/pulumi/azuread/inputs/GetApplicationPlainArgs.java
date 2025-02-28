// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationPlainArgs Empty = new GetApplicationPlainArgs();

    /**
     * Specifies the Application ID (also called Client ID).
     * 
     */
    @Import(name="applicationId")
    private @Nullable String applicationId;

    /**
     * @return Specifies the Application ID (also called Client ID).
     * 
     */
    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * Specifies the display name of the application.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return Specifies the display name of the application.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Specifies the Object ID of the application.
     * 
     */
    @Import(name="objectId")
    private @Nullable String objectId;

    /**
     * @return Specifies the Object ID of the application.
     * 
     */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    private GetApplicationPlainArgs() {}

    private GetApplicationPlainArgs(GetApplicationPlainArgs $) {
        this.applicationId = $.applicationId;
        this.displayName = $.displayName;
        this.objectId = $.objectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationPlainArgs $;

        public Builder() {
            $ = new GetApplicationPlainArgs();
        }

        public Builder(GetApplicationPlainArgs defaults) {
            $ = new GetApplicationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId Specifies the Application ID (also called Client ID).
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable String applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param displayName Specifies the display name of the application.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param objectId Specifies the Object ID of the application.
         * 
         * @return builder
         * 
         */
        public Builder objectId(@Nullable String objectId) {
            $.objectId = objectId;
            return this;
        }

        public GetApplicationPlainArgs build() {
            return $;
        }
    }

}
