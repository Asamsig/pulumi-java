// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.awsnative.lex.outputs.BotButton;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BotImageResponseCard {
    /**
     * @return A list of buttons that should be displayed on the response card.
     * 
     */
    private final @Nullable List<BotButton> buttons;
    /**
     * @return The URL of an image to display on the response card.
     * 
     */
    private final @Nullable String imageUrl;
    /**
     * @return The subtitle to display on the response card.
     * 
     */
    private final @Nullable String subtitle;
    /**
     * @return The title to display on the response card.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private BotImageResponseCard(
        @CustomType.Parameter("buttons") @Nullable List<BotButton> buttons,
        @CustomType.Parameter("imageUrl") @Nullable String imageUrl,
        @CustomType.Parameter("subtitle") @Nullable String subtitle,
        @CustomType.Parameter("title") String title) {
        this.buttons = buttons;
        this.imageUrl = imageUrl;
        this.subtitle = subtitle;
        this.title = title;
    }

    /**
     * @return A list of buttons that should be displayed on the response card.
     * 
     */
    public List<BotButton> buttons() {
        return this.buttons == null ? List.of() : this.buttons;
    }
    /**
     * @return The URL of an image to display on the response card.
     * 
     */
    public Optional<String> imageUrl() {
        return Optional.ofNullable(this.imageUrl);
    }
    /**
     * @return The subtitle to display on the response card.
     * 
     */
    public Optional<String> subtitle() {
        return Optional.ofNullable(this.subtitle);
    }
    /**
     * @return The title to display on the response card.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotImageResponseCard defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BotButton> buttons;
        private @Nullable String imageUrl;
        private @Nullable String subtitle;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(BotImageResponseCard defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.imageUrl = defaults.imageUrl;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder buttons(@Nullable List<BotButton> buttons) {
            this.buttons = buttons;
            return this;
        }
        public Builder buttons(BotButton... buttons) {
            return buttons(List.of(buttons));
        }
        public Builder imageUrl(@Nullable String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public Builder subtitle(@Nullable String subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public BotImageResponseCard build() {
            return new BotImageResponseCard(buttons, imageUrl, subtitle, title);
        }
    }
}
