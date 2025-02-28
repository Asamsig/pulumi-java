// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.enums.EnableStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a lab&#39;s announcement banner
 * 
 */
public final class LabAnnouncementPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final LabAnnouncementPropertiesArgs Empty = new LabAnnouncementPropertiesArgs();

    /**
     * Is the lab announcement active/enabled at this time?
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Either<String,EnableStatus>> enabled;

    /**
     * @return Is the lab announcement active/enabled at this time?
     * 
     */
    public Optional<Output<Either<String,EnableStatus>>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The time at which the announcement expires (null for never)
     * 
     */
    @Import(name="expirationDate")
    private @Nullable Output<String> expirationDate;

    /**
     * @return The time at which the announcement expires (null for never)
     * 
     */
    public Optional<Output<String>> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }

    /**
     * Has this announcement expired?
     * 
     */
    @Import(name="expired")
    private @Nullable Output<Boolean> expired;

    /**
     * @return Has this announcement expired?
     * 
     */
    public Optional<Output<Boolean>> expired() {
        return Optional.ofNullable(this.expired);
    }

    /**
     * The markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     * 
     */
    @Import(name="markdown")
    private @Nullable Output<String> markdown;

    /**
     * @return The markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     * 
     */
    public Optional<Output<String>> markdown() {
        return Optional.ofNullable(this.markdown);
    }

    /**
     * The plain text title for the lab announcement
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return The plain text title for the lab announcement
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private LabAnnouncementPropertiesArgs() {}

    private LabAnnouncementPropertiesArgs(LabAnnouncementPropertiesArgs $) {
        this.enabled = $.enabled;
        this.expirationDate = $.expirationDate;
        this.expired = $.expired;
        this.markdown = $.markdown;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabAnnouncementPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabAnnouncementPropertiesArgs $;

        public Builder() {
            $ = new LabAnnouncementPropertiesArgs();
        }

        public Builder(LabAnnouncementPropertiesArgs defaults) {
            $ = new LabAnnouncementPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Is the lab announcement active/enabled at this time?
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Either<String,EnableStatus>> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is the lab announcement active/enabled at this time?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Either<String,EnableStatus> enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param enabled Is the lab announcement active/enabled at this time?
         * 
         * @return builder
         * 
         */
        public Builder enabled(String enabled) {
            return enabled(Either.ofLeft(enabled));
        }

        /**
         * @param enabled Is the lab announcement active/enabled at this time?
         * 
         * @return builder
         * 
         */
        public Builder enabled(EnableStatus enabled) {
            return enabled(Either.ofRight(enabled));
        }

        /**
         * @param expirationDate The time at which the announcement expires (null for never)
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            $.expirationDate = expirationDate;
            return this;
        }

        /**
         * @param expirationDate The time at which the announcement expires (null for never)
         * 
         * @return builder
         * 
         */
        public Builder expirationDate(String expirationDate) {
            return expirationDate(Output.of(expirationDate));
        }

        /**
         * @param expired Has this announcement expired?
         * 
         * @return builder
         * 
         */
        public Builder expired(@Nullable Output<Boolean> expired) {
            $.expired = expired;
            return this;
        }

        /**
         * @param expired Has this announcement expired?
         * 
         * @return builder
         * 
         */
        public Builder expired(Boolean expired) {
            return expired(Output.of(expired));
        }

        /**
         * @param markdown The markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
         * 
         * @return builder
         * 
         */
        public Builder markdown(@Nullable Output<String> markdown) {
            $.markdown = markdown;
            return this;
        }

        /**
         * @param markdown The markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
         * 
         * @return builder
         * 
         */
        public Builder markdown(String markdown) {
            return markdown(Output.of(markdown));
        }

        /**
         * @param title The plain text title for the lab announcement
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The plain text title for the lab announcement
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public LabAnnouncementPropertiesArgs build() {
            return $;
        }
    }

}
