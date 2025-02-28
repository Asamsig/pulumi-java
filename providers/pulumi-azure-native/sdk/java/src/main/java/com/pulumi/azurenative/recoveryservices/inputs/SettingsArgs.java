// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Common settings field for backup management
 * 
 */
public final class SettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingsArgs Empty = new SettingsArgs();

    /**
     * Workload compression flag. This has been added so that &#39;isSqlCompression&#39;
     * will be deprecated once clients upgrade to consider this flag.
     * 
     */
    @Import(name="isCompression")
    private @Nullable Output<Boolean> isCompression;

    /**
     * @return Workload compression flag. This has been added so that &#39;isSqlCompression&#39;
     * will be deprecated once clients upgrade to consider this flag.
     * 
     */
    public Optional<Output<Boolean>> isCompression() {
        return Optional.ofNullable(this.isCompression);
    }

    /**
     * SQL compression flag
     * 
     */
    @Import(name="issqlcompression")
    private @Nullable Output<Boolean> issqlcompression;

    /**
     * @return SQL compression flag
     * 
     */
    public Optional<Output<Boolean>> issqlcompression() {
        return Optional.ofNullable(this.issqlcompression);
    }

    /**
     * TimeZone optional input as string. For example: TimeZone = &#34;Pacific Standard Time&#34;.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return TimeZone optional input as string. For example: TimeZone = &#34;Pacific Standard Time&#34;.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private SettingsArgs() {}

    private SettingsArgs(SettingsArgs $) {
        this.isCompression = $.isCompression;
        this.issqlcompression = $.issqlcompression;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingsArgs $;

        public Builder() {
            $ = new SettingsArgs();
        }

        public Builder(SettingsArgs defaults) {
            $ = new SettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isCompression Workload compression flag. This has been added so that &#39;isSqlCompression&#39;
         * will be deprecated once clients upgrade to consider this flag.
         * 
         * @return builder
         * 
         */
        public Builder isCompression(@Nullable Output<Boolean> isCompression) {
            $.isCompression = isCompression;
            return this;
        }

        /**
         * @param isCompression Workload compression flag. This has been added so that &#39;isSqlCompression&#39;
         * will be deprecated once clients upgrade to consider this flag.
         * 
         * @return builder
         * 
         */
        public Builder isCompression(Boolean isCompression) {
            return isCompression(Output.of(isCompression));
        }

        /**
         * @param issqlcompression SQL compression flag
         * 
         * @return builder
         * 
         */
        public Builder issqlcompression(@Nullable Output<Boolean> issqlcompression) {
            $.issqlcompression = issqlcompression;
            return this;
        }

        /**
         * @param issqlcompression SQL compression flag
         * 
         * @return builder
         * 
         */
        public Builder issqlcompression(Boolean issqlcompression) {
            return issqlcompression(Output.of(issqlcompression));
        }

        /**
         * @param timeZone TimeZone optional input as string. For example: TimeZone = &#34;Pacific Standard Time&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone TimeZone optional input as string. For example: TimeZone = &#34;Pacific Standard Time&#34;.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public SettingsArgs build() {
            return $;
        }
    }

}
