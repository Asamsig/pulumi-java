// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BucketArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Generalization function that buckets values based on ranges. The ranges and replacement values are dynamically provided by the user for custom behavior, such as 1-30 -&gt; LOW 31-65 -&gt; MEDIUM 66-100 -&gt; HIGH This can be used on data of type: number, long, string, timestamp. If the bound `Value` type differs from the type of data being transformed, we will first attempt converting the type of the data to be transformed to match the type of the bound before comparing. See https://cloud.google.com/dlp/docs/concepts-bucketing to learn more.
 * 
 */
public final class GooglePrivacyDlpV2BucketingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2BucketingConfigArgs Empty = new GooglePrivacyDlpV2BucketingConfigArgs();

    /**
     * Set of buckets. Ranges must be non-overlapping.
     * 
     */
    @Import(name="buckets")
    private @Nullable Output<List<GooglePrivacyDlpV2BucketArgs>> buckets;

    /**
     * @return Set of buckets. Ranges must be non-overlapping.
     * 
     */
    public Optional<Output<List<GooglePrivacyDlpV2BucketArgs>>> buckets() {
        return Optional.ofNullable(this.buckets);
    }

    private GooglePrivacyDlpV2BucketingConfigArgs() {}

    private GooglePrivacyDlpV2BucketingConfigArgs(GooglePrivacyDlpV2BucketingConfigArgs $) {
        this.buckets = $.buckets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2BucketingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2BucketingConfigArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2BucketingConfigArgs();
        }

        public Builder(GooglePrivacyDlpV2BucketingConfigArgs defaults) {
            $ = new GooglePrivacyDlpV2BucketingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buckets Set of buckets. Ranges must be non-overlapping.
         * 
         * @return builder
         * 
         */
        public Builder buckets(@Nullable Output<List<GooglePrivacyDlpV2BucketArgs>> buckets) {
            $.buckets = buckets;
            return this;
        }

        /**
         * @param buckets Set of buckets. Ranges must be non-overlapping.
         * 
         * @return builder
         * 
         */
        public Builder buckets(List<GooglePrivacyDlpV2BucketArgs> buckets) {
            return buckets(Output.of(buckets));
        }

        /**
         * @param buckets Set of buckets. Ranges must be non-overlapping.
         * 
         * @return builder
         * 
         */
        public Builder buckets(GooglePrivacyDlpV2BucketArgs... buckets) {
            return buckets(List.of(buckets));
        }

        public GooglePrivacyDlpV2BucketingConfigArgs build() {
            return $;
        }
    }

}
