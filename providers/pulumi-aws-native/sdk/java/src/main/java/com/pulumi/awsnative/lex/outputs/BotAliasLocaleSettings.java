// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.awsnative.lex.outputs.BotAliasCodeHookSpecification;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BotAliasLocaleSettings {
    private final @Nullable BotAliasCodeHookSpecification codeHookSpecification;
    /**
     * @return Whether the Lambda code hook is enabled
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private BotAliasLocaleSettings(
        @CustomType.Parameter("codeHookSpecification") @Nullable BotAliasCodeHookSpecification codeHookSpecification,
        @CustomType.Parameter("enabled") Boolean enabled) {
        this.codeHookSpecification = codeHookSpecification;
        this.enabled = enabled;
    }

    public Optional<BotAliasCodeHookSpecification> codeHookSpecification() {
        return Optional.ofNullable(this.codeHookSpecification);
    }
    /**
     * @return Whether the Lambda code hook is enabled
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasLocaleSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BotAliasCodeHookSpecification codeHookSpecification;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasLocaleSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeHookSpecification = defaults.codeHookSpecification;
    	      this.enabled = defaults.enabled;
        }

        public Builder codeHookSpecification(@Nullable BotAliasCodeHookSpecification codeHookSpecification) {
            this.codeHookSpecification = codeHookSpecification;
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public BotAliasLocaleSettings build() {
            return new BotAliasLocaleSettings(codeHookSpecification, enabled);
        }
    }
}
