// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.sagemaker.inputs.UserProfileTagArgs;
import com.pulumi.awsnative.sagemaker.inputs.UserProfileUserSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserProfileArgs Empty = new UserProfileArgs();

    /**
     * The ID of the associated Domain.
     * 
     */
    @Import(name="domainId", required=true)
    private Output<String> domainId;

    /**
     * @return The ID of the associated Domain.
     * 
     */
    public Output<String> domainId() {
        return this.domainId;
    }

    /**
     * A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value is &#34;UserName&#34;. If the Domain&#39;s AuthMode is SSO, this field is required. If the Domain&#39;s AuthMode is not SSO, this field cannot be specified.
     * 
     */
    @Import(name="singleSignOnUserIdentifier")
    private @Nullable Output<String> singleSignOnUserIdentifier;

    /**
     * @return A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value is &#34;UserName&#34;. If the Domain&#39;s AuthMode is SSO, this field is required. If the Domain&#39;s AuthMode is not SSO, this field cannot be specified.
     * 
     */
    public Optional<Output<String>> singleSignOnUserIdentifier() {
        return Optional.ofNullable(this.singleSignOnUserIdentifier);
    }

    /**
     * The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain&#39;s AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain&#39;s AuthMode is not SSO, this field cannot be specified.
     * 
     */
    @Import(name="singleSignOnUserValue")
    private @Nullable Output<String> singleSignOnUserValue;

    /**
     * @return The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain&#39;s AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain&#39;s AuthMode is not SSO, this field cannot be specified.
     * 
     */
    public Optional<Output<String>> singleSignOnUserValue() {
        return Optional.ofNullable(this.singleSignOnUserValue);
    }

    /**
     * A list of tags to apply to the user profile.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<UserProfileTagArgs>> tags;

    /**
     * @return A list of tags to apply to the user profile.
     * 
     */
    public Optional<Output<List<UserProfileTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A name for the UserProfile.
     * 
     */
    @Import(name="userProfileName")
    private @Nullable Output<String> userProfileName;

    /**
     * @return A name for the UserProfile.
     * 
     */
    public Optional<Output<String>> userProfileName() {
        return Optional.ofNullable(this.userProfileName);
    }

    /**
     * A collection of settings.
     * 
     */
    @Import(name="userSettings")
    private @Nullable Output<UserProfileUserSettingsArgs> userSettings;

    /**
     * @return A collection of settings.
     * 
     */
    public Optional<Output<UserProfileUserSettingsArgs>> userSettings() {
        return Optional.ofNullable(this.userSettings);
    }

    private UserProfileArgs() {}

    private UserProfileArgs(UserProfileArgs $) {
        this.domainId = $.domainId;
        this.singleSignOnUserIdentifier = $.singleSignOnUserIdentifier;
        this.singleSignOnUserValue = $.singleSignOnUserValue;
        this.tags = $.tags;
        this.userProfileName = $.userProfileName;
        this.userSettings = $.userSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserProfileArgs $;

        public Builder() {
            $ = new UserProfileArgs();
        }

        public Builder(UserProfileArgs defaults) {
            $ = new UserProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainId The ID of the associated Domain.
         * 
         * @return builder
         * 
         */
        public Builder domainId(Output<String> domainId) {
            $.domainId = domainId;
            return this;
        }

        /**
         * @param domainId The ID of the associated Domain.
         * 
         * @return builder
         * 
         */
        public Builder domainId(String domainId) {
            return domainId(Output.of(domainId));
        }

        /**
         * @param singleSignOnUserIdentifier A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value is &#34;UserName&#34;. If the Domain&#39;s AuthMode is SSO, this field is required. If the Domain&#39;s AuthMode is not SSO, this field cannot be specified.
         * 
         * @return builder
         * 
         */
        public Builder singleSignOnUserIdentifier(@Nullable Output<String> singleSignOnUserIdentifier) {
            $.singleSignOnUserIdentifier = singleSignOnUserIdentifier;
            return this;
        }

        /**
         * @param singleSignOnUserIdentifier A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value is &#34;UserName&#34;. If the Domain&#39;s AuthMode is SSO, this field is required. If the Domain&#39;s AuthMode is not SSO, this field cannot be specified.
         * 
         * @return builder
         * 
         */
        public Builder singleSignOnUserIdentifier(String singleSignOnUserIdentifier) {
            return singleSignOnUserIdentifier(Output.of(singleSignOnUserIdentifier));
        }

        /**
         * @param singleSignOnUserValue The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain&#39;s AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain&#39;s AuthMode is not SSO, this field cannot be specified.
         * 
         * @return builder
         * 
         */
        public Builder singleSignOnUserValue(@Nullable Output<String> singleSignOnUserValue) {
            $.singleSignOnUserValue = singleSignOnUserValue;
            return this;
        }

        /**
         * @param singleSignOnUserValue The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain&#39;s AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain&#39;s AuthMode is not SSO, this field cannot be specified.
         * 
         * @return builder
         * 
         */
        public Builder singleSignOnUserValue(String singleSignOnUserValue) {
            return singleSignOnUserValue(Output.of(singleSignOnUserValue));
        }

        /**
         * @param tags A list of tags to apply to the user profile.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<UserProfileTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags to apply to the user profile.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<UserProfileTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags to apply to the user profile.
         * 
         * @return builder
         * 
         */
        public Builder tags(UserProfileTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param userProfileName A name for the UserProfile.
         * 
         * @return builder
         * 
         */
        public Builder userProfileName(@Nullable Output<String> userProfileName) {
            $.userProfileName = userProfileName;
            return this;
        }

        /**
         * @param userProfileName A name for the UserProfile.
         * 
         * @return builder
         * 
         */
        public Builder userProfileName(String userProfileName) {
            return userProfileName(Output.of(userProfileName));
        }

        /**
         * @param userSettings A collection of settings.
         * 
         * @return builder
         * 
         */
        public Builder userSettings(@Nullable Output<UserProfileUserSettingsArgs> userSettings) {
            $.userSettings = userSettings;
            return this;
        }

        /**
         * @param userSettings A collection of settings.
         * 
         * @return builder
         * 
         */
        public Builder userSettings(UserProfileUserSettingsArgs userSettings) {
            return userSettings(Output.of(userSettings));
        }

        public UserProfileArgs build() {
            $.domainId = Objects.requireNonNull($.domainId, "expected parameter 'domainId' to be non-null");
            return $;
        }
    }

}
