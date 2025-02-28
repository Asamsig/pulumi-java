// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.kusto.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScriptState extends com.pulumi.resources.ResourceArgs {

    public static final ScriptState Empty = new ScriptState();

    /**
     * Flag that indicates whether to continue if one of the command fails.
     * 
     */
    @Import(name="continueOnErrorsEnabled")
    private @Nullable Output<Boolean> continueOnErrorsEnabled;

    /**
     * @return Flag that indicates whether to continue if one of the command fails.
     * 
     */
    public Optional<Output<Boolean>> continueOnErrorsEnabled() {
        return Optional.ofNullable(this.continueOnErrorsEnabled);
    }

    /**
     * The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
     * 
     */
    @Import(name="databaseId")
    private @Nullable Output<String> databaseId;

    /**
     * @return The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
     * 
     */
    public Optional<Output<String>> databaseId() {
        return Optional.ofNullable(this.databaseId);
    }

    /**
     * A unique string. If changed the script will be applied again.
     * 
     */
    @Import(name="forceAnUpdateWhenValueChanged")
    private @Nullable Output<String> forceAnUpdateWhenValueChanged;

    /**
     * @return A unique string. If changed the script will be applied again.
     * 
     */
    public Optional<Output<String>> forceAnUpdateWhenValueChanged() {
        return Optional.ofNullable(this.forceAnUpdateWhenValueChanged);
    }

    /**
     * The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The SAS token used to access the script.
     * 
     */
    @Import(name="sasToken")
    private @Nullable Output<String> sasToken;

    /**
     * @return The SAS token used to access the script.
     * 
     */
    public Optional<Output<String>> sasToken() {
        return Optional.ofNullable(this.sasToken);
    }

    /**
     * The url to the KQL script blob file. Please reference [this documentation](https://docs.microsoft.com/en-us/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The url to the KQL script blob file. Please reference [this documentation](https://docs.microsoft.com/en-us/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private ScriptState() {}

    private ScriptState(ScriptState $) {
        this.continueOnErrorsEnabled = $.continueOnErrorsEnabled;
        this.databaseId = $.databaseId;
        this.forceAnUpdateWhenValueChanged = $.forceAnUpdateWhenValueChanged;
        this.name = $.name;
        this.sasToken = $.sasToken;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScriptState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScriptState $;

        public Builder() {
            $ = new ScriptState();
        }

        public Builder(ScriptState defaults) {
            $ = new ScriptState(Objects.requireNonNull(defaults));
        }

        /**
         * @param continueOnErrorsEnabled Flag that indicates whether to continue if one of the command fails.
         * 
         * @return builder
         * 
         */
        public Builder continueOnErrorsEnabled(@Nullable Output<Boolean> continueOnErrorsEnabled) {
            $.continueOnErrorsEnabled = continueOnErrorsEnabled;
            return this;
        }

        /**
         * @param continueOnErrorsEnabled Flag that indicates whether to continue if one of the command fails.
         * 
         * @return builder
         * 
         */
        public Builder continueOnErrorsEnabled(Boolean continueOnErrorsEnabled) {
            return continueOnErrorsEnabled(Output.of(continueOnErrorsEnabled));
        }

        /**
         * @param databaseId The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(@Nullable Output<String> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        /**
         * @param databaseId The ID of the Kusto Database. Changing this forces a new Kusto Script to be created.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(String databaseId) {
            return databaseId(Output.of(databaseId));
        }

        /**
         * @param forceAnUpdateWhenValueChanged A unique string. If changed the script will be applied again.
         * 
         * @return builder
         * 
         */
        public Builder forceAnUpdateWhenValueChanged(@Nullable Output<String> forceAnUpdateWhenValueChanged) {
            $.forceAnUpdateWhenValueChanged = forceAnUpdateWhenValueChanged;
            return this;
        }

        /**
         * @param forceAnUpdateWhenValueChanged A unique string. If changed the script will be applied again.
         * 
         * @return builder
         * 
         */
        public Builder forceAnUpdateWhenValueChanged(String forceAnUpdateWhenValueChanged) {
            return forceAnUpdateWhenValueChanged(Output.of(forceAnUpdateWhenValueChanged));
        }

        /**
         * @param name The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Kusto Script. Changing this forces a new Kusto Script to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sasToken The SAS token used to access the script.
         * 
         * @return builder
         * 
         */
        public Builder sasToken(@Nullable Output<String> sasToken) {
            $.sasToken = sasToken;
            return this;
        }

        /**
         * @param sasToken The SAS token used to access the script.
         * 
         * @return builder
         * 
         */
        public Builder sasToken(String sasToken) {
            return sasToken(Output.of(sasToken));
        }

        /**
         * @param url The url to the KQL script blob file. Please reference [this documentation](https://docs.microsoft.com/en-us/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The url to the KQL script blob file. Please reference [this documentation](https://docs.microsoft.com/en-us/azure/data-explorer/database-script) that describes the commands that are allowed in the script.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public ScriptState build() {
            return $;
        }
    }

}
