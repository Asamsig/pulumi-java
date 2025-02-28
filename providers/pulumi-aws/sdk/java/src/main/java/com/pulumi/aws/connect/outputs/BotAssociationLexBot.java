// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BotAssociationLexBot {
    /**
     * @return The Region that the Amazon Lex (V1) bot was created in. Defaults to current region.
     * 
     */
    private final @Nullable String lexRegion;
    /**
     * @return The name of the Amazon Lex (V1) bot.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private BotAssociationLexBot(
        @CustomType.Parameter("lexRegion") @Nullable String lexRegion,
        @CustomType.Parameter("name") String name) {
        this.lexRegion = lexRegion;
        this.name = name;
    }

    /**
     * @return The Region that the Amazon Lex (V1) bot was created in. Defaults to current region.
     * 
     */
    public Optional<String> lexRegion() {
        return Optional.ofNullable(this.lexRegion);
    }
    /**
     * @return The name of the Amazon Lex (V1) bot.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAssociationLexBot defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lexRegion;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAssociationLexBot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lexRegion = defaults.lexRegion;
    	      this.name = defaults.name;
        }

        public Builder lexRegion(@Nullable String lexRegion) {
            this.lexRegion = lexRegion;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public BotAssociationLexBot build() {
            return new BotAssociationLexBot(lexRegion, name);
        }
    }
}
