// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1VersionVariantsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The history of variants update.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1VariantsHistoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1VariantsHistoryArgs Empty = new GoogleCloudDialogflowCxV3beta1VariantsHistoryArgs();

    /**
     * Update time of the variants.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Update time of the variants.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * The flow versions as the variants.
     * 
     */
    @Import(name="versionVariants")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1VersionVariantsArgs> versionVariants;

    /**
     * @return The flow versions as the variants.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowCxV3beta1VersionVariantsArgs>> versionVariants() {
        return Optional.ofNullable(this.versionVariants);
    }

    private GoogleCloudDialogflowCxV3beta1VariantsHistoryArgs() {}

    private GoogleCloudDialogflowCxV3beta1VariantsHistoryArgs(GoogleCloudDialogflowCxV3beta1VariantsHistoryArgs $) {
        this.updateTime = $.updateTime;
        this.versionVariants = $.versionVariants;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1VariantsHistoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1VariantsHistoryArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1VariantsHistoryArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1VariantsHistoryArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1VariantsHistoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param updateTime Update time of the variants.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Update time of the variants.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        /**
         * @param versionVariants The flow versions as the variants.
         * 
         * @return builder
         * 
         */
        public Builder versionVariants(@Nullable Output<GoogleCloudDialogflowCxV3beta1VersionVariantsArgs> versionVariants) {
            $.versionVariants = versionVariants;
            return this;
        }

        /**
         * @param versionVariants The flow versions as the variants.
         * 
         * @return builder
         * 
         */
        public Builder versionVariants(GoogleCloudDialogflowCxV3beta1VersionVariantsArgs versionVariants) {
            return versionVariants(Output.of(versionVariants));
        }

        public GoogleCloudDialogflowCxV3beta1VariantsHistoryArgs build() {
            return $;
        }
    }

}
