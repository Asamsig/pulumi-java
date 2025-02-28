// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotGrammarSlotTypeSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings required for a slot type based on a grammar that you provide.
 * 
 */
public final class BotGrammarSlotTypeSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotGrammarSlotTypeSettingArgs Empty = new BotGrammarSlotTypeSettingArgs();

    @Import(name="source")
    private @Nullable Output<BotGrammarSlotTypeSourceArgs> source;

    public Optional<Output<BotGrammarSlotTypeSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    private BotGrammarSlotTypeSettingArgs() {}

    private BotGrammarSlotTypeSettingArgs(BotGrammarSlotTypeSettingArgs $) {
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotGrammarSlotTypeSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotGrammarSlotTypeSettingArgs $;

        public Builder() {
            $ = new BotGrammarSlotTypeSettingArgs();
        }

        public Builder(BotGrammarSlotTypeSettingArgs defaults) {
            $ = new BotGrammarSlotTypeSettingArgs(Objects.requireNonNull(defaults));
        }

        public Builder source(@Nullable Output<BotGrammarSlotTypeSourceArgs> source) {
            $.source = source;
            return this;
        }

        public Builder source(BotGrammarSlotTypeSourceArgs source) {
            return source(Output.of(source));
        }

        public BotGrammarSlotTypeSettingArgs build() {
            return $;
        }
    }

}
