// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AliasPatternResponse {
    /**
     * @return The alias pattern phrase.
     * 
     */
    private final @Nullable String phrase;
    /**
     * @return The type of alias pattern
     * 
     */
    private final @Nullable String type;
    /**
     * @return The alias pattern variable.
     * 
     */
    private final @Nullable String variable;

    @CustomType.Constructor
    private AliasPatternResponse(
        @CustomType.Parameter("phrase") @Nullable String phrase,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("variable") @Nullable String variable) {
        this.phrase = phrase;
        this.type = type;
        this.variable = variable;
    }

    /**
     * @return The alias pattern phrase.
     * 
     */
    public Optional<String> phrase() {
        return Optional.ofNullable(this.phrase);
    }
    /**
     * @return The type of alias pattern
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The alias pattern variable.
     * 
     */
    public Optional<String> variable() {
        return Optional.ofNullable(this.variable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasPatternResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String phrase;
        private @Nullable String type;
        private @Nullable String variable;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasPatternResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phrase = defaults.phrase;
    	      this.type = defaults.type;
    	      this.variable = defaults.variable;
        }

        public Builder phrase(@Nullable String phrase) {
            this.phrase = phrase;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder variable(@Nullable String variable) {
            this.variable = variable;
            return this;
        }        public AliasPatternResponse build() {
            return new AliasPatternResponse(phrase, type, variable);
        }
    }
}
