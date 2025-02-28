// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A quasi-identifier column has a custom_tag, used to know which column in the data corresponds to which column in the statistical model.
 * 
 */
public final class GooglePrivacyDlpV2QuasiIdFieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2QuasiIdFieldArgs Empty = new GooglePrivacyDlpV2QuasiIdFieldArgs();

    /**
     * A auxiliary field.
     * 
     */
    @Import(name="customTag")
    private @Nullable Output<String> customTag;

    /**
     * @return A auxiliary field.
     * 
     */
    public Optional<Output<String>> customTag() {
        return Optional.ofNullable(this.customTag);
    }

    /**
     * Identifies the column.
     * 
     */
    @Import(name="field")
    private @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> field;

    /**
     * @return Identifies the column.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2FieldIdArgs>> field() {
        return Optional.ofNullable(this.field);
    }

    private GooglePrivacyDlpV2QuasiIdFieldArgs() {}

    private GooglePrivacyDlpV2QuasiIdFieldArgs(GooglePrivacyDlpV2QuasiIdFieldArgs $) {
        this.customTag = $.customTag;
        this.field = $.field;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2QuasiIdFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2QuasiIdFieldArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2QuasiIdFieldArgs();
        }

        public Builder(GooglePrivacyDlpV2QuasiIdFieldArgs defaults) {
            $ = new GooglePrivacyDlpV2QuasiIdFieldArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customTag A auxiliary field.
         * 
         * @return builder
         * 
         */
        public Builder customTag(@Nullable Output<String> customTag) {
            $.customTag = customTag;
            return this;
        }

        /**
         * @param customTag A auxiliary field.
         * 
         * @return builder
         * 
         */
        public Builder customTag(String customTag) {
            return customTag(Output.of(customTag));
        }

        /**
         * @param field Identifies the column.
         * 
         * @return builder
         * 
         */
        public Builder field(@Nullable Output<GooglePrivacyDlpV2FieldIdArgs> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field Identifies the column.
         * 
         * @return builder
         * 
         */
        public Builder field(GooglePrivacyDlpV2FieldIdArgs field) {
            return field(Output.of(field));
        }

        public GooglePrivacyDlpV2QuasiIdFieldArgs build() {
            return $;
        }
    }

}
