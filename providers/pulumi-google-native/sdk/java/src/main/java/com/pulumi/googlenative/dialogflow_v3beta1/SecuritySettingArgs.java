// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.enums.SecuritySettingPurgeDataTypesItem;
import com.pulumi.googlenative.dialogflow_v3beta1.enums.SecuritySettingRedactionScope;
import com.pulumi.googlenative.dialogflow_v3beta1.enums.SecuritySettingRedactionStrategy;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecuritySettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecuritySettingArgs Empty = new SecuritySettingArgs();

    /**
     * [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. The `DLP De-identify Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, Dialogflow replaces sensitive info with `[redacted]` text. The template name will have one of the following formats: `projects//locations//deidentifyTemplates/` OR `organizations//locations//deidentifyTemplates/` Note: `deidentify_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    @Import(name="deidentifyTemplate")
    private @Nullable Output<String> deidentifyTemplate;

    /**
     * @return [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. The `DLP De-identify Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, Dialogflow replaces sensitive info with `[redacted]` text. The template name will have one of the following formats: `projects//locations//deidentifyTemplates/` OR `organizations//locations//deidentifyTemplates/` Note: `deidentify_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    public Optional<Output<String>> deidentifyTemplate() {
        return Optional.ofNullable(this.deidentifyTemplate);
    }

    /**
     * The human-readable name of the security settings, unique within the location.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The human-readable name of the security settings, unique within the location.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Controls conversation exporting settings to Insights after conversation is completed. If retention_strategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
     * 
     */
    @Import(name="insightsExportSettings")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsArgs> insightsExportSettings;

    /**
     * @return Controls conversation exporting settings to Insights after conversation is completed. If retention_strategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsArgs>> insightsExportSettings() {
        return Optional.ofNullable(this.insightsExportSettings);
    }

    /**
     * [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. The `DLP Inspect Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, we use the default DLP inspect config. The template name will have one of the following formats: `projects//locations//inspectTemplates/` OR `organizations//locations//inspectTemplates/` Note: `inspect_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    @Import(name="inspectTemplate")
    private @Nullable Output<String> inspectTemplate;

    /**
     * @return [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. The `DLP Inspect Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, we use the default DLP inspect config. The template name will have one of the following formats: `projects//locations//inspectTemplates/` OR `organizations//locations//inspectTemplates/` Note: `inspect_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    public Optional<Output<String>> inspectTemplate() {
        return Optional.ofNullable(this.inspectTemplate);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource name of the settings. Required for the SecuritySettingsService.UpdateSecuritySettings method. SecuritySettingsService.CreateSecuritySettings populates the name automatically. Format: `projects//locations//securitySettings/`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name of the settings. Required for the SecuritySettingsService.UpdateSecuritySettings method. SecuritySettingsService.CreateSecuritySettings populates the name automatically. Format: `projects//locations//securitySettings/`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * List of types of data to remove when retention settings triggers purge.
     * 
     */
    @Import(name="purgeDataTypes")
    private @Nullable Output<List<SecuritySettingPurgeDataTypesItem>> purgeDataTypes;

    /**
     * @return List of types of data to remove when retention settings triggers purge.
     * 
     */
    public Optional<Output<List<SecuritySettingPurgeDataTypesItem>>> purgeDataTypes() {
        return Optional.ofNullable(this.purgeDataTypes);
    }

    /**
     * Defines the data for which Dialogflow applies redaction. Dialogflow does not redact data that it does not have access to – for example, Cloud logging.
     * 
     */
    @Import(name="redactionScope")
    private @Nullable Output<SecuritySettingRedactionScope> redactionScope;

    /**
     * @return Defines the data for which Dialogflow applies redaction. Dialogflow does not redact data that it does not have access to – for example, Cloud logging.
     * 
     */
    public Optional<Output<SecuritySettingRedactionScope>> redactionScope() {
        return Optional.ofNullable(this.redactionScope);
    }

    /**
     * Strategy that defines how we do redaction.
     * 
     */
    @Import(name="redactionStrategy")
    private @Nullable Output<SecuritySettingRedactionStrategy> redactionStrategy;

    /**
     * @return Strategy that defines how we do redaction.
     * 
     */
    public Optional<Output<SecuritySettingRedactionStrategy>> redactionStrategy() {
        return Optional.ofNullable(this.redactionStrategy);
    }

    /**
     * Retains data in interaction logging for the specified number of days. This does not apply to Cloud logging, which is owned by the user - not Dialogflow. User must set a value lower than Dialogflow&#39;s default 365d TTL. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use Dialogflow&#39;s default TTL. Note: Interaction logging is a limited access feature. Talk to your Google representative to check availability for you.
     * 
     */
    @Import(name="retentionWindowDays")
    private @Nullable Output<Integer> retentionWindowDays;

    /**
     * @return Retains data in interaction logging for the specified number of days. This does not apply to Cloud logging, which is owned by the user - not Dialogflow. User must set a value lower than Dialogflow&#39;s default 365d TTL. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use Dialogflow&#39;s default TTL. Note: Interaction logging is a limited access feature. Talk to your Google representative to check availability for you.
     * 
     */
    public Optional<Output<Integer>> retentionWindowDays() {
        return Optional.ofNullable(this.retentionWindowDays);
    }

    private SecuritySettingArgs() {}

    private SecuritySettingArgs(SecuritySettingArgs $) {
        this.deidentifyTemplate = $.deidentifyTemplate;
        this.displayName = $.displayName;
        this.insightsExportSettings = $.insightsExportSettings;
        this.inspectTemplate = $.inspectTemplate;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.purgeDataTypes = $.purgeDataTypes;
        this.redactionScope = $.redactionScope;
        this.redactionStrategy = $.redactionStrategy;
        this.retentionWindowDays = $.retentionWindowDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecuritySettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecuritySettingArgs $;

        public Builder() {
            $ = new SecuritySettingArgs();
        }

        public Builder(SecuritySettingArgs defaults) {
            $ = new SecuritySettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deidentifyTemplate [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. The `DLP De-identify Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, Dialogflow replaces sensitive info with `[redacted]` text. The template name will have one of the following formats: `projects//locations//deidentifyTemplates/` OR `organizations//locations//deidentifyTemplates/` Note: `deidentify_template` must be located in the same region as the `SecuritySettings`.
         * 
         * @return builder
         * 
         */
        public Builder deidentifyTemplate(@Nullable Output<String> deidentifyTemplate) {
            $.deidentifyTemplate = deidentifyTemplate;
            return this;
        }

        /**
         * @param deidentifyTemplate [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. The `DLP De-identify Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, Dialogflow replaces sensitive info with `[redacted]` text. The template name will have one of the following formats: `projects//locations//deidentifyTemplates/` OR `organizations//locations//deidentifyTemplates/` Note: `deidentify_template` must be located in the same region as the `SecuritySettings`.
         * 
         * @return builder
         * 
         */
        public Builder deidentifyTemplate(String deidentifyTemplate) {
            return deidentifyTemplate(Output.of(deidentifyTemplate));
        }

        /**
         * @param displayName The human-readable name of the security settings, unique within the location.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The human-readable name of the security settings, unique within the location.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param insightsExportSettings Controls conversation exporting settings to Insights after conversation is completed. If retention_strategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
         * 
         * @return builder
         * 
         */
        public Builder insightsExportSettings(@Nullable Output<GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsArgs> insightsExportSettings) {
            $.insightsExportSettings = insightsExportSettings;
            return this;
        }

        /**
         * @param insightsExportSettings Controls conversation exporting settings to Insights after conversation is completed. If retention_strategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
         * 
         * @return builder
         * 
         */
        public Builder insightsExportSettings(GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsArgs insightsExportSettings) {
            return insightsExportSettings(Output.of(insightsExportSettings));
        }

        /**
         * @param inspectTemplate [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. The `DLP Inspect Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, we use the default DLP inspect config. The template name will have one of the following formats: `projects//locations//inspectTemplates/` OR `organizations//locations//inspectTemplates/` Note: `inspect_template` must be located in the same region as the `SecuritySettings`.
         * 
         * @return builder
         * 
         */
        public Builder inspectTemplate(@Nullable Output<String> inspectTemplate) {
            $.inspectTemplate = inspectTemplate;
            return this;
        }

        /**
         * @param inspectTemplate [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. The `DLP Inspect Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, we use the default DLP inspect config. The template name will have one of the following formats: `projects//locations//inspectTemplates/` OR `organizations//locations//inspectTemplates/` Note: `inspect_template` must be located in the same region as the `SecuritySettings`.
         * 
         * @return builder
         * 
         */
        public Builder inspectTemplate(String inspectTemplate) {
            return inspectTemplate(Output.of(inspectTemplate));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Resource name of the settings. Required for the SecuritySettingsService.UpdateSecuritySettings method. SecuritySettingsService.CreateSecuritySettings populates the name automatically. Format: `projects//locations//securitySettings/`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name of the settings. Required for the SecuritySettingsService.UpdateSecuritySettings method. SecuritySettingsService.CreateSecuritySettings populates the name automatically. Format: `projects//locations//securitySettings/`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param purgeDataTypes List of types of data to remove when retention settings triggers purge.
         * 
         * @return builder
         * 
         */
        public Builder purgeDataTypes(@Nullable Output<List<SecuritySettingPurgeDataTypesItem>> purgeDataTypes) {
            $.purgeDataTypes = purgeDataTypes;
            return this;
        }

        /**
         * @param purgeDataTypes List of types of data to remove when retention settings triggers purge.
         * 
         * @return builder
         * 
         */
        public Builder purgeDataTypes(List<SecuritySettingPurgeDataTypesItem> purgeDataTypes) {
            return purgeDataTypes(Output.of(purgeDataTypes));
        }

        /**
         * @param purgeDataTypes List of types of data to remove when retention settings triggers purge.
         * 
         * @return builder
         * 
         */
        public Builder purgeDataTypes(SecuritySettingPurgeDataTypesItem... purgeDataTypes) {
            return purgeDataTypes(List.of(purgeDataTypes));
        }

        /**
         * @param redactionScope Defines the data for which Dialogflow applies redaction. Dialogflow does not redact data that it does not have access to – for example, Cloud logging.
         * 
         * @return builder
         * 
         */
        public Builder redactionScope(@Nullable Output<SecuritySettingRedactionScope> redactionScope) {
            $.redactionScope = redactionScope;
            return this;
        }

        /**
         * @param redactionScope Defines the data for which Dialogflow applies redaction. Dialogflow does not redact data that it does not have access to – for example, Cloud logging.
         * 
         * @return builder
         * 
         */
        public Builder redactionScope(SecuritySettingRedactionScope redactionScope) {
            return redactionScope(Output.of(redactionScope));
        }

        /**
         * @param redactionStrategy Strategy that defines how we do redaction.
         * 
         * @return builder
         * 
         */
        public Builder redactionStrategy(@Nullable Output<SecuritySettingRedactionStrategy> redactionStrategy) {
            $.redactionStrategy = redactionStrategy;
            return this;
        }

        /**
         * @param redactionStrategy Strategy that defines how we do redaction.
         * 
         * @return builder
         * 
         */
        public Builder redactionStrategy(SecuritySettingRedactionStrategy redactionStrategy) {
            return redactionStrategy(Output.of(redactionStrategy));
        }

        /**
         * @param retentionWindowDays Retains data in interaction logging for the specified number of days. This does not apply to Cloud logging, which is owned by the user - not Dialogflow. User must set a value lower than Dialogflow&#39;s default 365d TTL. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use Dialogflow&#39;s default TTL. Note: Interaction logging is a limited access feature. Talk to your Google representative to check availability for you.
         * 
         * @return builder
         * 
         */
        public Builder retentionWindowDays(@Nullable Output<Integer> retentionWindowDays) {
            $.retentionWindowDays = retentionWindowDays;
            return this;
        }

        /**
         * @param retentionWindowDays Retains data in interaction logging for the specified number of days. This does not apply to Cloud logging, which is owned by the user - not Dialogflow. User must set a value lower than Dialogflow&#39;s default 365d TTL. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use Dialogflow&#39;s default TTL. Note: Interaction logging is a limited access feature. Talk to your Google representative to check availability for you.
         * 
         * @return builder
         * 
         */
        public Builder retentionWindowDays(Integer retentionWindowDays) {
            return retentionWindowDays(Output.of(retentionWindowDays));
        }

        public SecuritySettingArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}
