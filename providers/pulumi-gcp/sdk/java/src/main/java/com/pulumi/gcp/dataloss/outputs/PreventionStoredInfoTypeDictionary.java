// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionStoredInfoTypeDictionaryCloudStoragePath;
import com.pulumi.gcp.dataloss.outputs.PreventionStoredInfoTypeDictionaryWordList;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionStoredInfoTypeDictionary {
    /**
     * @return Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionStoredInfoTypeDictionaryCloudStoragePath cloudStoragePath;
    /**
     * @return List of words or phrases to search for.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionStoredInfoTypeDictionaryWordList wordList;

    @CustomType.Constructor
    private PreventionStoredInfoTypeDictionary(
        @CustomType.Parameter("cloudStoragePath") @Nullable PreventionStoredInfoTypeDictionaryCloudStoragePath cloudStoragePath,
        @CustomType.Parameter("wordList") @Nullable PreventionStoredInfoTypeDictionaryWordList wordList) {
        this.cloudStoragePath = cloudStoragePath;
        this.wordList = wordList;
    }

    /**
     * @return Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionStoredInfoTypeDictionaryCloudStoragePath> cloudStoragePath() {
        return Optional.ofNullable(this.cloudStoragePath);
    }
    /**
     * @return List of words or phrases to search for.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionStoredInfoTypeDictionaryWordList> wordList() {
        return Optional.ofNullable(this.wordList);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeDictionary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PreventionStoredInfoTypeDictionaryCloudStoragePath cloudStoragePath;
        private @Nullable PreventionStoredInfoTypeDictionaryWordList wordList;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeDictionary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudStoragePath = defaults.cloudStoragePath;
    	      this.wordList = defaults.wordList;
        }

        public Builder cloudStoragePath(@Nullable PreventionStoredInfoTypeDictionaryCloudStoragePath cloudStoragePath) {
            this.cloudStoragePath = cloudStoragePath;
            return this;
        }
        public Builder wordList(@Nullable PreventionStoredInfoTypeDictionaryWordList wordList) {
            this.wordList = wordList;
            return this;
        }        public PreventionStoredInfoTypeDictionary build() {
            return new PreventionStoredInfoTypeDictionary(cloudStoragePath, wordList);
        }
    }
}
